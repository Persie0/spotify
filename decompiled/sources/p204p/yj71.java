package p204p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes8.dex */
public final class yj71 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nlv0 f273308a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ olv0 f273309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ olv0 f273310c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ olv0 f273311d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ olv0 f273312e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ olv0 f273313f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ olv0 f273314g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ kqi0 f273315h;

    public yj71(nlv0 nlv0Var, olv0 olv0Var, olv0 olv0Var2, olv0 olv0Var3, olv0 olv0Var4, olv0 olv0Var5, olv0 olv0Var6, kqi0 kqi0Var) {
        this.f273308a = nlv0Var;
        this.f273309b = olv0Var;
        this.f273310c = olv0Var2;
        this.f273311d = olv0Var3;
        this.f273312e = olv0Var4;
        this.f273313f = olv0Var5;
        this.f273314g = olv0Var6;
        this.f273315h = kqi0Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float fSignum;
        float[] fArr = sensorEvent.values;
        float f = fArr[0] / 9.80665f;
        float f2 = fArr[1] / 9.80665f;
        nlv0 nlv0Var = this.f273308a;
        boolean z = nlv0Var.f155174a;
        olv0 olv0Var = this.f273309b;
        olv0 olv0Var2 = this.f273312e;
        olv0 olv0Var3 = this.f273311d;
        olv0 olv0Var4 = this.f273310c;
        if (!z) {
            olv0Var.f166933a = f;
            olv0Var4.f166933a = f2;
            olv0Var3.f166933a = f;
            olv0Var2.f166933a = f2;
            nlv0Var.f155174a = true;
            return;
        }
        float f3 = f - olv0Var.f166933a;
        float f4 = 0.5f;
        if (f3 > 0.5f) {
            olv0Var.f166933a = f - 0.5f;
            f3 = 0.5f;
        } else if (f3 < -0.5f) {
            olv0Var.f166933a = f - (-0.5f);
            f3 = -0.5f;
        }
        float f5 = f2 - olv0Var4.f166933a;
        if (f5 > 0.5f) {
            olv0Var4.f166933a = f2 - 0.5f;
        } else if (f5 < -0.5f) {
            olv0Var4.f166933a = f2 - (-0.5f);
            f4 = -0.5f;
        } else {
            f4 = f5;
        }
        float fAbs = Math.abs(f3);
        float fSignum2 = 0.0f;
        if (fAbs < 0.04f) {
            fSignum = 0.0f;
        } else {
            fSignum = ((fAbs - 0.04f) * Math.signum(f3)) / 0.96f;
        }
        float fAbs2 = Math.abs(f4);
        if (fAbs2 >= 0.04f) {
            fSignum2 = ((fAbs2 - 0.04f) * Math.signum(f4)) / 0.96f;
        }
        float fM63436m = n0e1.m63436m(fSignum * 2.0f, -1.0f, 1.0f);
        float fM63436m2 = n0e1.m63436m(fSignum2 * 2.0f, -1.0f, 1.0f);
        olv0 olv0Var5 = this.f273313f;
        float f6 = olv0Var5.f166933a;
        olv0Var5.f166933a = edb.m38555d(fM63436m, f6, 0.1f, f6);
        olv0 olv0Var6 = this.f273314g;
        float f7 = olv0Var6.f166933a;
        olv0Var6.f166933a = edb.m38555d(fM63436m2, f7, 0.1f, f7);
        if (Math.abs(f - olv0Var3.f166933a) < 0.012f && Math.abs(f2 - olv0Var2.f166933a) < 0.012f) {
            float f8 = olv0Var4.f166933a;
            olv0Var4.f166933a = edb.m38555d(f2, f8, 0.05f, f8);
        }
        olv0Var3.f166933a = f;
        olv0Var2.f166933a = f2;
        this.f273315h.setValue(new xj71(olv0Var5.f166933a, olv0Var6.f166933a));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
