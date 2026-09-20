package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pwq0 {

    /* JADX INFO: renamed from: a */
    public final String f182097a;

    /* JADX INFO: renamed from: b */
    public final sfp0 f182098b;

    public pwq0(String str, sfp0 sfp0Var) {
        this.f182097a = str;
        this.f182098b = sfp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwq0)) {
            return false;
        }
        pwq0 pwq0Var = (pwq0) obj;
        return wj50.m88271j(this.f182097a, pwq0Var.f182097a) && wj50.m88271j(this.f182098b, pwq0Var.f182098b);
    }

    public final int hashCode() {
        return this.f182098b.hashCode() + (this.f182097a.hashCode() * 31);
    }
}
