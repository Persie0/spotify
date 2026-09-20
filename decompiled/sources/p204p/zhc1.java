package p204p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes.dex */
public final class zhc1 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public m94 f282875a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        p2l.f173365a.contains(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            m94 m94Var = this.f282875a;
            if (m94Var != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > 2.3d) {
                    m94Var.m61139e();
                }
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }
}
