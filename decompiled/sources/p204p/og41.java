package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class og41 {

    /* JADX INFO: renamed from: a */
    public float f164993a;

    /* JADX INFO: renamed from: b */
    public double f164994b;

    /* JADX INFO: renamed from: c */
    public float f164995c;

    /* JADX INFO: renamed from: a */
    public final long m66862a(float f, float f2, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f3 = f - this.f164993a;
        double d = j / 1000.0d;
        float f4 = this.f164995c;
        double d2 = ((double) f4) * ((double) f4);
        double d3 = this.f164994b;
        double d4 = ((double) (-f4)) * d3;
        if (f4 <= 1.0f) {
            if (f4 == 1.0f) {
                double d5 = f3;
                double d6 = (d3 * d5) + ((double) f2);
                double d7 = (-d3) * d;
                double d8 = (d * d6) + d5;
                dSin = Math.exp(d7) * d8;
                dExp = Math.exp(d7) * d8 * (-this.f164994b);
                dExp2 = Math.exp(d7) * d6;
            } else {
                double d9 = 1;
                double dSqrt = Math.sqrt(d9 - d2) * d3;
                double d10 = f3;
                double d11 = (((-d4) * d10) + ((double) f2)) * (d9 / dSqrt);
                double d12 = dSqrt * d;
                double d13 = d * d4;
                dSin = ((Math.sin(d12) * d11) + (Math.cos(d12) * d10)) * Math.exp(d13);
                dCos = (((Math.cos(d12) * dSqrt * d11) + (Math.sin(d12) * (-dSqrt) * d10)) * Math.exp(d13)) + (d4 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f164993a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d2 - ((double) 1)) * d3;
        double d14 = d4 + dSqrt2;
        double d15 = d4 - dSqrt2;
        double d16 = f3;
        double d17 = ((d15 * d16) - ((double) f2)) / (d15 - d14);
        double d18 = d16 - d17;
        double d19 = d15 * d;
        double d20 = d * d14;
        dSin = (Math.exp(d20) * d17) + (Math.exp(d19) * d18);
        dExp = Math.exp(d19) * d18 * d15;
        dExp2 = Math.exp(d20) * d17 * d14;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f164993a))) << 32);
    }
}
