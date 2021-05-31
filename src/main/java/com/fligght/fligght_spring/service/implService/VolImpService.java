package com.fligght.fligght_spring.service.implService;

import com.fligght.fligght_spring.dto.VolDto;
import com.fligght.fligght_spring.entity.AeroportEntity;
import com.fligght.fligght_spring.entity.CabineEntity;
import com.fligght.fligght_spring.entity.VolEntity;
import com.fligght.fligght_spring.repository.AeroportRepository;
import com.fligght.fligght_spring.repository.CabineRepository;
import com.fligght.fligght_spring.repository.VolRepository;
import com.fligght.fligght_spring.service.VolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.sql.Date;
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

    @Autowired
    private CabineRepository cabineRepository;

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

        VolEntity vol = new VolEntity();

        if (!vol_Dto.getAeroportDepartName().equals("")) {
            AeroportEntity depart = aeroportRepository.findByNomContaining(vol_Dto.getAeroportDepartName());
            vol.setAeroportDepart(depart);
        }
        if (!vol_Dto.getAeroportArriveName().equals("")) {
            AeroportEntity arrive = aeroportRepository.findByNomContaining(vol_Dto.getAeroportArriveName());
            vol.setAeroportArrivee(arrive);
        }
        if (!(vol_Dto.getDateDepart() == null)) {
            Date dateDepart = vol_Dto.getDateDepart();
            vol.setDateDepart(dateDepart);
        }
        if (!(vol_Dto.getDateArrivee() == null)) {
            Date dateArrive = vol_Dto.getDateArrivee();
            vol.setDateArrivee(dateArrive);
        }
        if (!vol_Dto.getCabineType().equals("")) {
            CabineEntity cabine = cabineRepository.findByTypeCabineContaining(vol_Dto.getCabineType());
            vol.setCabine(cabine);
        }

        List<VolEntity> flights = volRepository.findAll(Example.of(vol));
        System.err.println("LEN : "+flights.size());
        return getVolDtos(flights);
    }

    private List<VolDto> getVolDtos(List<VolEntity> flights) {
        List<VolDto> volDtos = new ArrayList<>();
        flights.forEach(flight -> {
            System.out.println(flight.getCabine().getTypeCabine());
            VolDto volDto = modelMapper.map(flight, VolDto.class);
            volDto.setAeroportArriveName(flight.getAeroportArrivee().getNom());
            volDto.setAeroportDepartName(flight.getAeroportDepart().getNom());
            volDto.setCabineType(flight.getCabine().getTypeCabine());
            volDtos.add(volDto);
        });
        return volDtos;
    }

}