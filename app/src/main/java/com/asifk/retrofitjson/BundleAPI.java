package com.asifk.retrofitjson;

public class BundleAPI {
    String BundleId;
    String SourceNode;
    String Date;
    String Location;
    String Status;
    String ReasonCode;
    String SKU_ID;
    String Company;
    String ProductDescription;

    public BundleAPI(String bundleId, String sourceNode, String date, String location, String status, String reasonCode, String SKU_ID, String company, String productDescription) {
        BundleId = bundleId;
        SourceNode = sourceNode;
        Date = date;
        Location = location;
        Status = status;
        ReasonCode = reasonCode;
        this.SKU_ID = SKU_ID;
        Company = company;
        ProductDescription = productDescription;
    }
}
