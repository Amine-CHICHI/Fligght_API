package com.fligght.fligght_spring.service.implService;

import com.fligght.fligght_spring.dto.VolDto;
import com.fligght.fligght_spring.entity.AeroportEntity;
import com.fligght.fligght_spring.entity.VolEntity;
import com.fligght.fligght_spring.repository.AeroportRepository;
import com.fligght.fligght_spring.repository.VolRepository;
import com.fligght.fligght_spring.service.VolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VolImpService implements VolService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    private VolRepository volRepository;

    @Autowired
    private AeroportRepository aeroportRepository;

    @Override
    public List<VolDto> findFlights() {
        List<VolEntity> flights = volRepository.findAll();
        return getVolDtos(flights);
    }

    @Override
    public List<VolDto> getRelevantFlights(VolDto vol_Dto) {
        System.err.println(vol_Dto.getAeroportDepartName());
        System.err.println(vol_Dto.getAeroportArriveName());
        System.err.println(vol_Dto.getDateDepart());
        System.err.println(vol_Dto.getDateArrivee());
        System.err.println(vol_Dto.getCabineType());

        AeroportEntity depart = aeroportRepository.findByNomContaining(vol_Dto.getAeroportDepartName());
        AeroportEntity arrive = aeroportRepository.findByNomContaining(vol_Dto.getAeroportArriveName());


        List<VolEntity> flights = volRepository.findByAeroportDepart_IdAeroportAndAeroportArrivee_IdAeroport(depart.getIdAeroport(), arrive.getIdAeroport());
        return getVolDtos(flights);
    }

    private List<VolDto> getVolDtos(List<VolEntity> flights) {
        List<VolDto> volDtos = new ArrayList<>();
        flights.forEach(flight->{
            VolDto volDto = modelMapper.map(flight, VolDto.class);
            volDto.setAeroportArriveName(flight.getAeroportArrivee().getNom());
            volDto.setAeroportDepartName(flight.getAeroportDepart().getNom());
            volDto.setCabineType(flight.getCabineByCabineIdCabine().getTypeCabine());
            volDtos.add(volDto);
        });
        return volDtos;
    }

}
