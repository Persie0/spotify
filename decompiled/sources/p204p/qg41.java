package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qg41 implements k651 {

    /* JADX INFO: renamed from: a */
    public double f188373a;

    /* JADX INFO: renamed from: b */
    public double f188374b;

    /* JADX INFO: renamed from: c */
    public double f188375c;

    /* JADX INFO: renamed from: d */
    public float f188376d;

    /* JADX INFO: renamed from: e */
    public float f188377e;

    /* JADX INFO: renamed from: f */
    public float f188378f;

    /* JADX INFO: renamed from: g */
    public float f188379g;

    /* JADX INFO: renamed from: h */
    public float f188380h;

    /* JADX INFO: renamed from: i */
    public int f188381i;

    @Override // p204p.k651
    /* JADX INFO: renamed from: a */
    public final float mo55583a() {
        return 0.0f;
    }

    @Override // p204p.k651
    /* JADX INFO: renamed from: b */
    public final boolean mo55584b() {
        double d = ((double) this.f188377e) - this.f188375c;
        double d2 = this.f188374b;
        double d3 = this.f188378f;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.f188379g))) / d2) <= ((double) this.f188380h);
    }

    @Override // p204p.k651
    public final float getInterpolation(float f) {
        double d = f - this.f188376d;
        if (d > 0.0d) {
            double d2 = this.f188374b;
            double d3 = this.f188373a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f188379g)) * d) * 4.0d)) + 1.0d);
            double d4 = d / ((double) iSqrt);
            int i = 0;
            while (i < iSqrt) {
                float f2 = this.f188377e;
                double d5 = f2;
                double d6 = this.f188375c;
                double d7 = d4;
                float f3 = this.f188378f;
                double d8 = f3;
                double d9 = ((-d2) * (d5 - d6)) - (d3 * d8);
                double d10 = this.f188379g;
                double d11 = (((d9 / d10) * d7) / 2.0d) + d8;
                double d12 = ((((-((((d7 * d11) / 2.0d) + d5) - d6)) * d2) - (d11 * d3)) / d10) * d7;
                float f4 = f3 + ((float) d12);
                this.f188378f = f4;
                float f5 = f2 + ((float) (((d12 / 2.0d) + d8) * d7));
                this.f188377e = f5;
                int i2 = this.f188381i;
                if (i2 > 0) {
                    if (f5 < 0.0f && (i2 & 1) == 1) {
                        this.f188377e = -f5;
                        this.f188378f = -f4;
                    }
                    float f6 = this.f188377e;
                    if (f6 > 1.0f && (i2 & 2) == 2) {
                        this.f188377e = 2.0f - f6;
                        this.f188378f = -this.f188378f;
                    }
                }
                i++;
                d4 = d7;
            }
        }
        this.f188376d = f;
        if (mo55584b()) {
            this.f188377e = (float) this.f188375c;
        }
        return this.f188377e;
    }
}
