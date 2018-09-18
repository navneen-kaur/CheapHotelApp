package com.group.cheaphotel.org.tranform;

import com.group.cheaphotel.org.domain.ConDetails;
import com.group.cheaphotel.org.domain.HotelResponse;
import com.group.cheaphotel.org.domain.Results;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ResponseTransform {


    public static HotelResponse manageThreeHotelsResult(HotelResponse response) {

        response.setResults(response.getResults().stream().limit(3).collect(Collectors.toCollection(ArrayList::new)));

        return response;

    }

    public static HotelResponse filterHotelPhoneNum(HotelResponse response) {
        ArrayList<Results> res = response.getResults();
        Iterator itr = res.iterator();
        ArrayList<ConDetails> conDetailsList = new ArrayList<>();
        Iterator itrCon = null;

        ArrayList<Results> returnResults = new ArrayList<>();

        while (itr.hasNext()) {
            Results obj = (Results) itr.next();
            conDetailsList = obj.getContacts();
            itrCon = conDetailsList.iterator();
            ArrayList<ConDetails> returnConDetails = new ArrayList<>();
            if (conDetailsList.size() != 0) {

                while (itrCon.hasNext()) {
                    ConDetails conFinalObject = (ConDetails) itrCon.next();
                    if ("PHONE".equalsIgnoreCase(conFinalObject.getType())) {
                        returnConDetails.add(conFinalObject);
                    }
                }
            }
            obj.setContacts(returnConDetails);
            returnResults.add(obj);

        }

        response.setResults(returnResults);
        return response;
    }
}
