package com.example.accessingdatajpa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

/**
 * Project name: DAM20/PACKAGE_NAME
 * Filename:
 * Created:  14/11/2020 / 13:47
 * Description:
 * Revision:
 *
 * @Author: Ismael - fmartin@nigul.cide.es
 * @Version:
 */
@Service
public class ToJsonServiceImp implements ToJsonService {
    ObjectMapper om = new ObjectMapper();
    AlumnoDto alumnoDto;

    @Override
    public AlumnoDto toJson(String json) {
        try {
            alumnoDto = om.readValue((json), AlumnoDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return alumnoDto;
    }
}
