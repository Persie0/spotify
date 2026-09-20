package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fnq0 implements nnq0 {

    /* JADX INFO: renamed from: a */
    public final String f71349a;

    /* JADX INFO: renamed from: b */
    public final x9r0 f71350b;

    public fnq0(String str, x9r0 x9r0Var) {
        this.f71349a = str;
        this.f71350b = x9r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnq0)) {
            return false;
        }
        fnq0 fnq0Var = (fnq0) obj;
        return wj50.m88271j(this.f71349a, fnq0Var.f71349a) && wj50.m88271j(this.f71350b, fnq0Var.f71350b);
    }

    public final int hashCode() {
        String str = this.f71349a;
        int iHashCode = (97695508 + (str == null ? 0 : str.hashCode())) * 31;
        x9r0 x9r0Var = this.f71350b;
        return iHashCode + (x9r0Var != null ? x9r0Var.hashCode() : 0);
    }
}
