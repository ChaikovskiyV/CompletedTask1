package com.vchaikovsky.arrayclass.service;

import com.vchaikovsky.arrayclass.entity.CustomArray;
import com.vchaikovsky.arrayclass.exceptions.WrongDataException;

public interface DataProcessingInt {

    Integer findMin(CustomArray array) throws WrongDataException;

    Integer findMax(CustomArray array) throws WrongDataException;

    double findAverage(CustomArray array) throws WrongDataException;

    int findNumbersAmount(CustomArray array) throws WrongDataException;

    int findNegativeQuantity(CustomArray array) throws WrongDataException;

    int findPositiveQuantity(CustomArray array) throws WrongDataException;

    CustomArray replaceAllNegativeNumbersToZero(CustomArray array) throws WrongDataException;
}
