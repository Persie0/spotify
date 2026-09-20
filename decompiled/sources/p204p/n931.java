package p204p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes6.dex */
public final class n931 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uum0 f151696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uum0 f151697b;

    public n931(uum0 uum0Var, uum0 uum0Var2) {
        this.f151696a = uum0Var;
        this.f151697b = uum0Var2;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f151696a.m84032w((-sensorEvent.values[0]) * 140.0f);
        this.f151697b.m84032w(sensorEvent.values[1] * 140.0f);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
