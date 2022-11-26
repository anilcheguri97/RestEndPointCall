package com.logit.restendpoints.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public class VesselLoop {
    @Getter
    @Setter
        private String id;
        private Date createdDate;
        private String defaultLoopQualifier;
        private List<PortInfo> ports;
        private Integer precedence;
        private String source;
        private String state;
        private Date updatedDate;
        private List<VesselDetails> vesselDetails;
        private String loopQualifier;

}
