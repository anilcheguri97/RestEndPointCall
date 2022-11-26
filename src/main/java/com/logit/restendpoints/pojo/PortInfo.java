package com.logit.restendpoints.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class PortInfo {

    private String code;
    private Date createdDate;
    private String direction;
    @JsonProperty("port_name")
    private String name;
    private Integer sequence;
}
