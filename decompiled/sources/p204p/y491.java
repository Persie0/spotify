package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y491 {

    /* JADX INFO: renamed from: a */
    public final double f269102a;

    /* JADX INFO: renamed from: b */
    public final double f269103b;

    /* JADX INFO: renamed from: c */
    public final double f269104c;

    /* JADX INFO: renamed from: d */
    public final double f269105d;

    /* JADX INFO: renamed from: e */
    public final double f269106e;

    /* JADX INFO: renamed from: f */
    public final double f269107f;

    /* JADX INFO: renamed from: g */
    public final double f269108g;

    public y491(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f269102a = d;
        this.f269103b = d2;
        this.f269104c = d3;
        this.f269105d = d4;
        this.f269106e = d5;
        this.f269107f = d6;
        this.f269108g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (l6l.m58357f(d)) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y491)) {
            return false;
        }
        y491 y491Var = (y491) obj;
        return Double.compare(this.f269102a, y491Var.f269102a) == 0 && Double.compare(this.f269103b, y491Var.f269103b) == 0 && Double.compare(this.f269104c, y491Var.f269104c) == 0 && Double.compare(this.f269105d, y491Var.f269105d) == 0 && Double.compare(this.f269106e, y491Var.f269106e) == 0 && Double.compare(this.f269107f, y491Var.f269107f) == 0 && Double.compare(this.f269108g, y491Var.f269108g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f269108g) + xl81.m91399h(this.f269107f, xl81.m91399h(this.f269106e, xl81.m91399h(this.f269105d, xl81.m91399h(this.f269104c, xl81.m91399h(this.f269103b, Double.hashCode(this.f269102a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f269102a + ", a=" + this.f269103b + ", b=" + this.f269104c + ", c=" + this.f269105d + ", d=" + this.f269106e + ", e=" + this.f269107f + ", f=" + this.f269108g + ')';
    }

    public /* synthetic */ y491(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
