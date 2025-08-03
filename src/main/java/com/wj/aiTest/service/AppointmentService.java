package com.wj.aiTest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.aiTest.entity.Appointment;

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
