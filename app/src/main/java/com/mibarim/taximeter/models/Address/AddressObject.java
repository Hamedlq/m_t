package com.mibarim.taximeter.models.Address;


import com.mibarim.taximeter.models.Geometry;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Hamed on 3/14/2016.
 */
public class AddressObject implements Serializable {
    public List<String> types;
    public String formatted_address;
    public List<AddressComponent> address_components;
    public Geometry geometry;
    public String place_id;

}
