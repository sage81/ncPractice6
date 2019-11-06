package com.netcracker.edu.inventory.service.impl;

import com.netcracker.edu.inventory.model.Device;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

class ServiceUtils {

    public static List<String> getParametersNames(Method method) {
        Parameter[] parameters = method.getParameters();
        List<String> parameterNames = new ArrayList<>();
        for (Parameter parameter : parameters) {
            if (!parameter.isNamePresent()) {
                throw new IllegalArgumentException("Parameter names are not present!");
            }
            parameterNames.add(parameter.getName());
        }
        return parameterNames;
    }

    static void filtrateByType(Device[] devices, final String type) {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] != null) {
                if (devices[i].getType() != null) {
                    if (!devices[i].getType().equals(type)) {
                        devices[i] = null;
                    }
                } else if (type != null) {
                    if (!type.equals(devices[i].getType())) {
                        devices[i] = null;
                    }
                }
            }
        }
    }

    static void filtrateByManufacturer(Device[] devices, final String manufacturer) {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] != null) {
                if (devices[i].getType() != null) {
                    if (!devices[i].getManufacturer().equals(manufacturer)) {
                        devices[i] = null;
                    }
                } else if (manufacturer != null) {
                    if (!manufacturer.equals(devices[i].getManufacturer())) {
                        devices[i] = null;
                    }
                }
            }
        }
    }

    static void filtrateByModel(Device[] devices, final String model) {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] != null) {
                if (devices[i].getType() != null) {
                    if (!devices[i].getModel().equals(model)) {
                        devices[i] = null;
                    }
                } else if (model != null) {
                    if (!model.equals(devices[i].getModel())) {
                        devices[i] = null;
                    }
                }
            }
        }
    }
}
