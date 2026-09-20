package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pyb0 {

    /* JADX INFO: renamed from: a */
    public final jyb0 f183383a;

    /* JADX INFO: renamed from: b */
    public final iyb0 f183384b;

    public pyb0(jyb0 jyb0Var, iyb0 iyb0Var) {
        this.f183383a = jyb0Var;
        this.f183384b = iyb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyb0)) {
            return false;
        }
        pyb0 pyb0Var = (pyb0) obj;
        return wj50.m88271j(this.f183383a, pyb0Var.f183383a) && wj50.m88271j(this.f183384b, pyb0Var.f183384b);
    }

    public final int hashCode() {
        return this.f183384b.hashCode() + (this.f183383a.hashCode() * 31);
    }
}
