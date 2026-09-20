package p204p;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public final class j1s {

    /* JADX INFO: renamed from: a */
    public String f107827a;

    /* JADX INFO: renamed from: b */
    public String f107828b;

    /* JADX INFO: renamed from: c */
    public float f107829c;

    /* JADX INFO: renamed from: d */
    public int f107830d;

    /* JADX INFO: renamed from: e */
    public int f107831e;

    /* JADX INFO: renamed from: f */
    public float f107832f;

    /* JADX INFO: renamed from: g */
    public float f107833g;

    /* JADX INFO: renamed from: h */
    public int f107834h;

    /* JADX INFO: renamed from: i */
    public int f107835i;

    /* JADX INFO: renamed from: j */
    public float f107836j;

    /* JADX INFO: renamed from: k */
    public boolean f107837k;

    /* JADX INFO: renamed from: l */
    public PointF f107838l;

    /* JADX INFO: renamed from: m */
    public PointF f107839m;

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f107830d, ((int) (s571.m77243b(this.f107827a.hashCode() * 31, 31, this.f107828b) + this.f107829c)) * 31, 31) + this.f107831e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f107832f);
        return (((iM40938f * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f107834h;
    }
}
