package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class im01 {

    /* JADX INFO: renamed from: a */
    public final boolean f103567a;

    /* JADX INFO: renamed from: b */
    public final uvf0 f103568b;

    public im01(uvf0 uvf0Var, boolean z) {
        this.f103567a = z;
        this.f103568b = uvf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im01)) {
            return false;
        }
        im01 im01Var = (im01) obj;
        return this.f103567a == im01Var.f103567a && wj50.m88271j(this.f103568b, im01Var.f103568b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f103567a) * 31;
        uvf0 uvf0Var = this.f103568b;
        return iHashCode + (uvf0Var == null ? 0 : uvf0Var.hashCode());
    }
}
