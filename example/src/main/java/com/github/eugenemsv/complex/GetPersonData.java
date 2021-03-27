package com.github.eugenemsv.complex;

import com.github.eugenemsv.poet.annotation.Query;

@Query
public interface GetPersonData {

    String uid();

    int count();
}
