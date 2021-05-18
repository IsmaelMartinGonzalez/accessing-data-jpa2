package com.example.accessingdatajpa;

import org.mapstruct.Mapper;

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
@Mapper
public interface AsignaturaMapper {
    Asignatura toEntity(AsignaturaDto asignaturaDto);
}
