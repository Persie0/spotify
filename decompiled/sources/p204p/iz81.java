package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iz81 implements jz81 {

    /* JADX INFO: renamed from: a */
    public final sbu0 f107168a;

    /* JADX INFO: renamed from: b */
    public final i291 f107169b;

    public iz81(sbu0 sbu0Var, i291 i291Var) {
        this.f107168a = sbu0Var;
        this.f107169b = i291Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz81)) {
            return false;
        }
        iz81 iz81Var = (iz81) obj;
        return wj50.m88271j(this.f107168a, iz81Var.f107168a) && wj50.m88271j(this.f107169b, iz81Var.f107169b);
    }

    public final int hashCode() {
        return this.f107169b.hashCode() + (this.f107168a.f207585a.hashCode() * 31);
    }
}
