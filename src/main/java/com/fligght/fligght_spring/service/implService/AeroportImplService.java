package com.fligght.fligght_spring.service.implService;

import com.fligght.fligght_spring.dto.AeroportDto;
import com.fligght.fligght_spring.entity.AeroportEntity;
import com.fligght.fligght_spring.repository.AeroportRepository;
import com.fligght.fligght_spring.service.AeroportService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AeroportImplService implements AeroportService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    AeroportRepository aeroportRepository;

    @Override
    public List<AeroportDto> getAeroports() {
        List<AeroportEntity> aeroports = aeroportRepository.findAll();
        System.err.println("LEN aeroports : "+aeroports.size());
        return getAeroportDtos(aeroports);
    }

    private List<AeroportDto> getAeroportDtos(List<AeroportEntity> aeroports) {
        List<AeroportDto> aeroportDtos = new ArrayList<>();
        aeroports.forEach(aeroport ->{
            AeroportDto aeroportDto = modelMapper.map(aeroport, AeroportDto.class);
            aeroportDto.setAeroportName(aeroport.getNom());
            aeroportDto.setAeroportVille(aeroport.getVille().getNom());
            aeroportDtos.add(aeroportDto);
        });
        return aeroportDtos;
    }
}
