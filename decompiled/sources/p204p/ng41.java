package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ng41 {

    /* JADX INFO: renamed from: a */
    public double f153550a;

    /* JADX INFO: renamed from: b */
    public double f153551b;

    /* JADX INFO: renamed from: c */
    public boolean f153552c;

    /* JADX INFO: renamed from: d */
    public double f153553d;

    /* JADX INFO: renamed from: e */
    public double f153554e;

    /* JADX INFO: renamed from: f */
    public double f153555f;

    /* JADX INFO: renamed from: g */
    public double f153556g;

    /* JADX INFO: renamed from: h */
    public double f153557h;

    /* JADX INFO: renamed from: i */
    public double f153558i;

    /* JADX INFO: renamed from: j */
    public final vls f153559j;

    public ng41() {
        this.f153550a = Math.sqrt(1500.0d);
        this.f153551b = 0.5d;
        this.f153552c = false;
        this.f153558i = Double.MAX_VALUE;
        this.f153559j = new vls();
    }

    /* JADX INFO: renamed from: a */
    public final void m64377a() {
        this.f153551b = 1.0f;
        this.f153552c = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m64378b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f153550a = Math.sqrt(f);
        this.f153552c = false;
    }

    /* JADX INFO: renamed from: c */
    public final vls m64379c(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f153552c) {
            if (this.f153558i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f153551b;
            if (d3 > 1.0d) {
                double d4 = this.f153550a;
                this.f153555f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f153551b;
                double d6 = this.f153550a;
                this.f153556g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f153557h = Math.sqrt(1.0d - (d3 * d3)) * this.f153550a;
            }
            this.f153552c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f153558i;
        double d9 = this.f153551b;
        if (d9 > 1.0d) {
            double d10 = this.f153556g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f153555f);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f153555f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f153556g;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f153555f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f153550a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f153550a) * d7) * d17;
            double d18 = -this.f153550a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f153557h;
            double d20 = this.f153550a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f153557h * d7) * d21) + (Math.cos(this.f153557h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f153550a;
            double d23 = this.f153551b;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f153557h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f153557h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f153558i);
        vls vlsVar = this.f153559j;
        vlsVar.f242586a = f;
        vlsVar.f242587b = (float) dCos;
        return vlsVar;
    }

    public ng41(float f) {
        this.f153550a = Math.sqrt(1500.0d);
        this.f153551b = 0.5d;
        this.f153552c = false;
        this.f153559j = new vls();
        this.f153558i = f;
    }
}
