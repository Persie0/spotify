package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class n18 extends wgj0 {

    /* JADX INFO: renamed from: a */
    public final vgj0 f149334a;

    /* JADX INFO: renamed from: b */
    public final ugj0 f149335b;

    public n18(vgj0 vgj0Var, ugj0 ugj0Var) {
        this.f149334a = vgj0Var;
        this.f149335b = ugj0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wgj0) {
            wgj0 wgj0Var = (wgj0) obj;
            vgj0 vgj0Var = this.f149334a;
            if (vgj0Var != null ? vgj0Var.equals(((n18) wgj0Var).f149334a) : ((n18) wgj0Var).f149334a == null) {
                ugj0 ugj0Var = this.f149335b;
                if (ugj0Var != null ? ugj0Var.equals(((n18) wgj0Var).f149335b) : ((n18) wgj0Var).f149335b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        vgj0 vgj0Var = this.f149334a;
        int iHashCode = ((vgj0Var == null ? 0 : vgj0Var.hashCode()) ^ 1000003) * 1000003;
        ugj0 ugj0Var = this.f149335b;
        return (ugj0Var != null ? ugj0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f149334a + ", mobileSubtype=" + this.f149335b + "}";
    }
}
