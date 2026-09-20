package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hcl0 {

    /* JADX INFO: renamed from: a */
    public final double f89833a;

    /* JADX INFO: renamed from: b */
    public final long f89834b;

    /* JADX INFO: renamed from: c */
    public final gcl0 f89835c;

    public hcl0(double d, long j, gcl0 gcl0Var) {
        this.f89833a = d;
        this.f89834b = j;
        this.f89835c = gcl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcl0)) {
            return false;
        }
        hcl0 hcl0Var = (hcl0) obj;
        return Double.compare(this.f89833a, hcl0Var.f89833a) == 0 && this.f89834b == hcl0Var.f89834b && wj50.m88271j(this.f89835c, hcl0Var.f89835c);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(Double.hashCode(this.f89833a) * 31, this.f89834b, 31);
        gcl0 gcl0Var = this.f89835c;
        return iM36605e + (gcl0Var == null ? 0 : gcl0Var.hashCode());
    }
}
