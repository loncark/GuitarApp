package com.loncark.guitarapp.service;

import com.loncark.guitarapp.command.GuitarCommand;
import com.loncark.guitarapp.dto.GuitarDTO;

import java.util.List;
import java.util.Optional;

public interface GuitarService {

    List<GuitarDTO> findAll();

    Optional<GuitarDTO> findByCode(String code);

    Optional<GuitarDTO> save(GuitarCommand gCommand);

    //Optional<GuitarDTO> update(String code, HardwareUpdateCommand updatedHardwareCommand);

    void deleteByCode(String code);
}
