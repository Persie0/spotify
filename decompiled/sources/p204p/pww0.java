package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pww0 implements sww0 {

    /* JADX INFO: renamed from: a */
    public final String f182148a;

    /* JADX INFO: renamed from: b */
    public final v1j0 f182149b;

    public pww0(String str, v1j0 v1j0Var) {
        this.f182148a = str;
        this.f182149b = v1j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pww0)) {
            return false;
        }
        pww0 pww0Var = (pww0) obj;
        return wj50.m88271j(this.f182148a, pww0Var.f182148a) && wj50.m88271j(this.f182149b, pww0Var.f182149b);
    }

    public final int hashCode() {
        return this.f182149b.hashCode() + (this.f182148a.hashCode() * 31);
    }
}
