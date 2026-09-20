package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zl70 {

    /* JADX INFO: renamed from: a */
    public final ul70 f283943a;

    /* JADX INFO: renamed from: b */
    public final String f283944b;

    public zl70(ul70 ul70Var, String str) {
        this.f283943a = ul70Var;
        this.f283944b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl70)) {
            return false;
        }
        zl70 zl70Var = (zl70) obj;
        return wj50.m88271j(this.f283943a, zl70Var.f283943a) && wj50.m88271j(this.f283944b, zl70Var.f283944b);
    }

    public final int hashCode() {
        return this.f283944b.hashCode() + (this.f283943a.hashCode() * 31);
    }
}
