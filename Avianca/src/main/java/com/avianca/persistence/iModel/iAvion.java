package com.avianca.persistence.iModel;

import com.avianca.entities.avion;
import com.avianca.persistence.CRUD.createModel;
import com.avianca.persistence.CRUD.deleteModel;
import com.avianca.persistence.CRUD.readByidModel;
import com.avianca.persistence.CRUD.updateModel;

public interface iAvion extends
                        createModel<avion>,
                        updateModel<avion>,
                        deleteModel,
                        readByidModel<avion>{
}
