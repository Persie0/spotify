package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ke20 {

    /* JADX INFO: renamed from: a */
    public final String f121779a;

    /* JADX INFO: renamed from: b */
    public final gak0 f121780b;

    public ke20(String str, gak0 gak0Var) {
        this.f121779a = str;
        this.f121780b = gak0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke20)) {
            return false;
        }
        ke20 ke20Var = (ke20) obj;
        return wj50.m88271j(this.f121779a, ke20Var.f121779a) && wj50.m88271j(this.f121780b, ke20Var.f121780b);
    }

    public final int hashCode() {
        return this.f121780b.hashCode() + (this.f121779a.hashCode() * 31);
    }
}
