package p204p;

import android.util.Range;

/* JADX INFO: loaded from: classes3.dex */
public final class zxb1 {

    /* JADX INFO: renamed from: a */
    public long f287277a;

    /* JADX INFO: renamed from: b */
    public long f287278b;

    /* JADX INFO: renamed from: c */
    public double f287279c;

    /* JADX INFO: renamed from: d */
    public Range f287280d;

    public zxb1() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) 1.0f)));
        this.f287280d = range;
        this.f287279c = ((Double) range.getUpper()).doubleValue();
        this.f287277a = -9223372036854775807L;
        this.f287278b = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX INFO: renamed from: a */
    public final void m97178a(long j, long j2) {
        double dDoubleValue;
        c95.m31843i(j != -9223372036854775807L);
        c95.m31843i(j2 != -9223372036854775807L);
        long j3 = this.f287277a;
        if (j3 != -9223372036854775807L) {
            long j4 = this.f287278b;
            if (j4 == -9223372036854775807L || j == j3) {
                dDoubleValue = ((Double) this.f287280d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j2 - j4) / (j - j3);
            }
        } else {
            dDoubleValue = ((Double) this.f287280d.getUpper()).doubleValue();
        }
        this.f287279c = (((Double) this.f287280d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.f287279c * 0.800000011920929d);
        this.f287277a = j;
        this.f287278b = j2;
    }

    /* JADX INFO: renamed from: b */
    public final void m97179b() {
        this.f287279c = ((Double) this.f287280d.getUpper()).doubleValue();
        this.f287277a = -9223372036854775807L;
        this.f287278b = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: c */
    public final void m97180c(float f) {
        c95.m31843i(f > 0.0f);
        this.f287280d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        m97179b();
    }
}
