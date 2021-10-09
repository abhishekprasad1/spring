package com.hospital.details;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Component
@Service
public class PatientDetailDAO {
    public static List<PatientDetail> PatientDetails = new ArrayList<>();


    static {
        PatientDetails.add(new PatientDetail(1, "abhishek", "shekhar", "prasad", "9892952261", "302 Kanchan ganga"));
    }


    public static List<PatientDetail> getAllPatientDetails() {
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

    public static boolean deletePatientDetail(int id) {
        boolean deleteStatus=false;
        for (PatientDetail patient : PatientDetails) {
            if (patient.getId() == id) {
                deleteStatus = PatientDetails.remove(patient);
                break;
            }
        }
        return deleteStatus;
    }


}
