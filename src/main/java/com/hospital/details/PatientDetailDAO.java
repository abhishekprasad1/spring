package com.hospital.details;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Component
@Service
public class PatientDetailDAO {
    public static ArrayList<PatientDetail> PatientDetails = new ArrayList<>();
    static int PatientCount = 0;

    static {
        PatientDetails.add(new PatientDetail(1, "abhishek", "shekhar", "prasad", "9892952261", "302 Kanchan ganga"));
    }


    public static ArrayList<PatientDetail> getAllPatientDetails() {
        return PatientDetails;
    }

    public static PatientDetail getPatientDetail(int id) {
        for (PatientDetail patientdetail : PatientDetails) {
            if (patientdetail.getId() == id) {
                return patientdetail;
            }
        }
        return null;
    }

    public static void savePatientDetail(PatientDetail patientDetail) {
        int count = PatientDetails.size();
        patientDetail.setId(++count);
        PatientDetails.add(patientDetail);
    }

}
