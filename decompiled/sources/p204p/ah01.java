package p204p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.searchview.proto.AudioEpisode;

/* JADX INFO: loaded from: classes2.dex */
public final class ah01 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final xre f15570a;

    /* JADX INFO: renamed from: b */
    public npa1 f15571b;

    /* JADX INFO: renamed from: c */
    public long f15572c;

    /* JADX INFO: renamed from: d */
    public int f15573d;

    /* JADX INFO: renamed from: e */
    public final float f15574e;

    public ah01(xre xreVar, dq4 dq4Var) {
        this.f15570a = xreVar;
        this.f15574e = dq4Var.m36597a() / 1000.0f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        npa1 npa1Var;
        if (this.f15571b == null) {
            return;
        }
        float[] fArr = sensorEvent.values;
        double d = fArr[0] / 9.80665f;
        double d2 = fArr[1] / 9.80665f;
        double d3 = fArr[2] / 9.80665f;
        double d4 = (d3 * d3) + (d2 * d2) + (d * d);
        float f = this.f15574e;
        if (d4 > f * f) {
            ((wy3) this.f15570a).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f15572c;
            if (((long) CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER) + j > jCurrentTimeMillis) {
                return;
            }
            if (j + ((long) AudioEpisode.SHOW_URI_FIELD_NUMBER) < jCurrentTimeMillis) {
                this.f15573d = 0;
            }
            this.f15572c = jCurrentTimeMillis;
            int i = this.f15573d + 1;
            this.f15573d = i;
            if (i != 2 || (npa1Var = this.f15571b) == null) {
                return;
            }
            npa1Var.m65318a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
