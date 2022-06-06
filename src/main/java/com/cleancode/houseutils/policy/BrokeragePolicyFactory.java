package com.cleancode.houseutils.policy;

import com.cleancode.houseutils.constants.ActionType;
import com.cleancode.houseutils.exception.ErrorCode;
import com.cleancode.houseutils.exception.HouseUtilsException;

public class BrokeragePolicyFactory {

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            case RENT:
                return new RentBrokeragePolicy();
            default:
                throw new HouseUtilsException(ErrorCode.INVALID_REQUEST, "해당 actionType에 대한 정책이 존재하지 않습니다.");
        }
    }
}
