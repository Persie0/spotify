package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class p5u0 {

    /* JADX INFO: renamed from: a */
    public final long f174233a;

    /* JADX INFO: renamed from: b */
    public final String f174234b;

    /* JADX INFO: renamed from: c */
    public int f174235c;

    public p5u0(String str, long j) {
        this.f174234b = str;
        this.f174233a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p5u0.class != obj.getClass()) {
            return false;
        }
        p5u0 p5u0Var = (p5u0) obj;
        return this.f174233a == p5u0Var.f174233a && this.f174234b.equals(p5u0Var.f174234b);
    }

    public final int hashCode() {
        if (this.f174235c == 0) {
            this.f174235c = this.f174234b.hashCode() + ((((527 + ((int) 0)) * 31) + ((int) this.f174233a)) * 31);
        }
        return this.f174235c;
    }
}
