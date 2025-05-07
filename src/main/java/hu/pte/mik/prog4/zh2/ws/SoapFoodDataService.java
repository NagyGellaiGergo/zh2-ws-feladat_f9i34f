package hu.pte.mik.prog4.zh2.ws;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class SoapFoodDataService implements FoodDataService {

    private final Map<String, Long> map = new HashMap<>();

    @Override
    public FoodDataResponse getFoodData(FoodDataRequest request) {
        return new FoodDataResponse(request.getFoodId(), this.map.computeIfAbsent(request.getFoodId(), foodId -> ThreadLocalRandom.current()
                .nextLong(0, 100)));
    }

}
