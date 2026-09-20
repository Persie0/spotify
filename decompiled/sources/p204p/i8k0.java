package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i8k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f99804a;

    /* JADX INFO: renamed from: b */
    public final h8k0 f99805b;

    /* JADX INFO: renamed from: c */
    public final eh00 f99806c;

    public i8k0(boolean z, h8k0 h8k0Var, eh00 eh00Var) {
        this.f99804a = z;
        this.f99805b = h8k0Var;
        this.f99806c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8k0)) {
            return false;
        }
        i8k0 i8k0Var = (i8k0) obj;
        return this.f99804a == i8k0Var.f99804a && this.f99805b == i8k0Var.f99805b && wj50.m88271j(this.f99806c, i8k0Var.f99806c);
    }

    public final int hashCode() {
        int iHashCode = (this.f99805b.hashCode() + (Boolean.hashCode(this.f99804a) * 31)) * 31;
        eh00 eh00Var = this.f99806c;
        return iHashCode + (eh00Var == null ? 0 : eh00Var.hashCode());
    }
}
