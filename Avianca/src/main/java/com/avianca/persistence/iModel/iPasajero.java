package com.avianca.persistence.iModel;

import com.avianca.entities.pasajero;
import com.avianca.persistence.CRUD.createModel;
import com.avianca.persistence.CRUD.deleteModel;
import com.avianca.persistence.CRUD.readByidModel;
import com.avianca.persistence.CRUD.updateModel;

public interface iPasajero extends
                            createModel<pasajero>,
                            updateModel<pasajero>,
                            readByidModel<pasajero>,
                            deleteModel
{
}
