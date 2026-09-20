package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vu6 extends wu6 {

    /* JADX INFO: renamed from: a */
    public final z0r f244875a;

    /* JADX INFO: renamed from: b */
    public final int f244876b;

    public vu6(z0r z0rVar, int i) {
        this.f244875a = z0rVar;
        this.f244876b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu6)) {
            return false;
        }
        vu6 vu6Var = (vu6) obj;
        return wj50.m88271j(this.f244875a, vu6Var.f244875a) && this.f244876b == vu6Var.f244876b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f244876b) + (this.f244875a.hashCode() * 31);
    }
}
