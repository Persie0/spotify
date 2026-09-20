package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p5m0 {

    /* JADX INFO: renamed from: a */
    public final ri00 f174194a;

    /* JADX INFO: renamed from: b */
    public final m5l0 f174195b;

    /* JADX WARN: Multi-variable type inference failed */
    public p5m0(gh00 gh00Var, m5l0 m5l0Var) {
        this.f174194a = (ri00) gh00Var;
        this.f174195b = m5l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5m0)) {
            return false;
        }
        p5m0 p5m0Var = (p5m0) obj;
        return this.f174194a.equals(p5m0Var.f174194a) && this.f174195b.equals(p5m0Var.f174195b);
    }

    public final int hashCode() {
        return this.f174195b.hashCode() + (this.f174194a.hashCode() * 31);
    }
}
