package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kf9 {

    /* JADX INFO: renamed from: d */
    public static final kf9 f122104d = new kf9(-3, -9223372036854775807L, -1);

    /* JADX INFO: renamed from: e */
    public static kf9 f122105e;

    /* JADX INFO: renamed from: a */
    public long f122106a;

    /* JADX INFO: renamed from: b */
    public long f122107b;

    /* JADX INFO: renamed from: c */
    public int f122108c;

    public kf9(int i, long j, long j2) {
        this.f122108c = i;
        this.f122106a = j;
        this.f122107b = j2;
    }

    /* JADX INFO: renamed from: d */
    public void m56259d(double d, double d2, long j) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.f122108c = 1;
            this.f122106a = -1L;
            this.f122107b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f122108c = 0;
                this.f122106a = -1L;
                this.f122107b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f122106a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f122107b = jRound;
            if (jRound >= j || this.f122106a <= j) {
                this.f122108c = 1;
            } else {
                this.f122108c = 0;
            }
        }
    }
}
