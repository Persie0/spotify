package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class om20 {

    /* JADX INFO: renamed from: a */
    public final String f166960a;

    /* JADX INFO: renamed from: b */
    public final af20 f166961b;

    public om20(String str, af20 af20Var) {
        this.f166960a = str;
        this.f166961b = af20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om20)) {
            return false;
        }
        om20 om20Var = (om20) obj;
        return wj50.m88271j(this.f166960a, om20Var.f166960a) && this.f166961b == om20Var.f166961b;
    }

    public final int hashCode() {
        int iHashCode = this.f166960a.hashCode() * 31;
        af20 af20Var = this.f166961b;
        return iHashCode + (af20Var == null ? 0 : af20Var.hashCode());
    }
}
