package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hi5 {

    /* JADX INFO: renamed from: s */
    public static final double[] f91701s = new double[91];

    /* JADX INFO: renamed from: a */
    public double[] f91702a;

    /* JADX INFO: renamed from: b */
    public double f91703b;

    /* JADX INFO: renamed from: c */
    public double f91704c;

    /* JADX INFO: renamed from: d */
    public double f91705d;

    /* JADX INFO: renamed from: e */
    public double f91706e;

    /* JADX INFO: renamed from: f */
    public double f91707f;

    /* JADX INFO: renamed from: g */
    public double f91708g;

    /* JADX INFO: renamed from: h */
    public double f91709h;

    /* JADX INFO: renamed from: i */
    public double f91710i;

    /* JADX INFO: renamed from: j */
    public double f91711j;

    /* JADX INFO: renamed from: k */
    public double f91712k;

    /* JADX INFO: renamed from: l */
    public double f91713l;

    /* JADX INFO: renamed from: m */
    public double f91714m;

    /* JADX INFO: renamed from: n */
    public double f91715n;

    /* JADX INFO: renamed from: o */
    public double f91716o;

    /* JADX INFO: renamed from: p */
    public double f91717p;

    /* JADX INFO: renamed from: q */
    public boolean f91718q;

    /* JADX INFO: renamed from: r */
    public boolean f91719r;

    /* JADX INFO: renamed from: a */
    public final double m47620a() {
        double d = this.f91711j * this.f91717p;
        double dHypot = this.f91715n / Math.hypot(d, (-this.f91712k) * this.f91716o);
        return this.f91718q ? (-d) * dHypot : d * dHypot;
    }

    /* JADX INFO: renamed from: b */
    public final double m47621b() {
        double d = this.f91711j * this.f91717p;
        double d2 = (-this.f91712k) * this.f91716o;
        double dHypot = this.f91715n / Math.hypot(d, d2);
        return this.f91718q ? (-d2) * dHypot : d2 * dHypot;
    }

    /* JADX INFO: renamed from: c */
    public final double m47622c(double d) {
        double d2 = (d - this.f91704c) * this.f91710i;
        double d3 = this.f91706e;
        return ((this.f91707f - d3) * d2) + d3;
    }

    /* JADX INFO: renamed from: d */
    public final double m47623d(double d) {
        double d2 = (d - this.f91704c) * this.f91710i;
        double d3 = this.f91708g;
        return ((this.f91709h - d3) * d2) + d3;
    }

    /* JADX INFO: renamed from: e */
    public final double m47624e() {
        return (this.f91711j * this.f91716o) + this.f91713l;
    }

    /* JADX INFO: renamed from: f */
    public final double m47625f() {
        return (this.f91712k * this.f91717p) + this.f91714m;
    }

    /* JADX INFO: renamed from: g */
    public final void m47626g(double d) {
        double d2 = (this.f91718q ? this.f91705d - d : d - this.f91704c) * this.f91710i;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = 1.0d;
            if (d2 < 1.0d) {
                double[] dArr = this.f91702a;
                double length = d2 * ((double) (dArr.length - 1));
                int i = (int) length;
                double d4 = dArr[i];
                d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
            }
        }
        double d5 = d3 * 1.5707963267948966d;
        this.f91716o = Math.sin(d5);
        this.f91717p = Math.cos(d5);
    }
}
