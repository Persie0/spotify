package androidx.car.app.hardware;

import androidx.car.app.C0023j;
import androidx.car.app.C0024k;
import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.Accelerometer;
import androidx.car.app.hardware.info.CarHardwareLocation;
import androidx.car.app.hardware.info.Compass;
import androidx.car.app.hardware.info.EnergyLevel;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.hardware.info.EvStatus;
import androidx.car.app.hardware.info.Gyroscope;
import androidx.car.app.hardware.info.Mileage;
import androidx.car.app.hardware.info.Model;
import androidx.car.app.hardware.info.Speed;
import androidx.car.app.hardware.info.TollCard;
import java.util.HashMap;
import java.util.List;
import p204p.cef0;
import p204p.f9s0;
import p204p.h9s0;
import p204p.juh0;
import p204p.jzb;
import p204p.kzb;
import p204p.lbc0;
import p204p.pz71;
import p204p.rxb;
import p204p.rzb;
import p204p.srw;
import p204p.tzb;
import p204p.v6v;
import p204p.w6v;
import p204p.xy31;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class ProjectedCarHardwareManager implements lbc0 {
    private final f9s0 mVehicleInfo;
    private final h9s0 mVehicleSensors;

    public ProjectedCarHardwareManager(C0023j c0023j, C0024k c0024k) {
        jzb jzbVar = new jzb(c0024k);
        f9s0 f9s0Var = new f9s0();
        juh0 juh0Var = new juh0();
        CarValue<String> carValue = CarValue.UNKNOWN_STRING;
        juh0Var.f116112a = carValue;
        CarValue<Integer> carValue2 = CarValue.UNKNOWN_INTEGER;
        juh0Var.f116113b = carValue2;
        juh0Var.f116114c = carValue;
        new CarResultStub(1, null, true, new Model(juh0Var), jzbVar);
        w6v w6vVar = new w6v();
        CarValue<List<Integer>> carValue3 = CarValue.UNKNOWN_INTEGER_LIST;
        w6vVar.f248470a = carValue3;
        w6vVar.f248471b = carValue3;
        new CarResultStub(2, null, true, new EnergyProfile(w6vVar), jzbVar);
        pz71 pz71Var = new pz71();
        pz71Var.f183627a = carValue2;
        new CarResultStub(3, null, false, new TollCard(pz71Var), jzbVar);
        v6v v6vVar = new v6v();
        CarValue<Float> carValue4 = CarValue.UNKNOWN_FLOAT;
        v6vVar.f237952a = carValue4;
        v6vVar.f237953b = carValue4;
        CarValue<Boolean> carValue5 = CarValue.UNKNOWN_BOOLEAN;
        v6vVar.f237954c = carValue5;
        v6vVar.f237955d = carValue4;
        v6vVar.f237956e = carValue2;
        v6vVar.f237957f = carValue2;
        new CarResultStub(4, null, false, new EnergyLevel(v6vVar), jzbVar);
        xy31 xy31Var = new xy31();
        xy31Var.f267207a = carValue4;
        xy31Var.f267208b = carValue4;
        xy31Var.f267209c = carValue2;
        new CarResultStub(5, null, false, new Speed(xy31Var), jzbVar);
        cef0 cef0Var = new cef0();
        cef0Var.f37119a = carValue4;
        cef0Var.f37120b = carValue2;
        new CarResultStub(6, null, false, new Mileage(cef0Var), jzbVar);
        srw srwVar = new srw();
        srwVar.f213422a = carValue5;
        srwVar.f213423b = carValue5;
        new CarResultStub(7, null, false, new EvStatus(srwVar), jzbVar);
        this.mVehicleInfo = f9s0Var;
        h9s0 h9s0Var = new h9s0();
        CarValue carValue6 = h9s0.f89030a;
        new Accelerometer(carValue6);
        new HashMap();
        new Gyroscope(carValue6);
        new HashMap();
        new Compass(carValue6);
        new HashMap();
        new CarHardwareLocation(new CarValue(null, 0L, 2));
        new HashMap();
        this.mVehicleSensors = h9s0Var;
    }

    public rxb getCarClimate() {
        throw new UnsupportedOperationException();
    }

    public kzb getCarInfo() {
        return this.mVehicleInfo;
    }

    public tzb getCarSensors() {
        return this.mVehicleSensors;
    }
}
