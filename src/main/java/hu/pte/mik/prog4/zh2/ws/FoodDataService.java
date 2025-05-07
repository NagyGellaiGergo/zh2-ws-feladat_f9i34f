package hu.pte.mik.prog4.zh2.ws;

import jakarta.jws.WebMethod;

public interface FoodDataService {

    @WebMethod
    FoodDataResponse getFoodData(FoodDataRequest request);

}
