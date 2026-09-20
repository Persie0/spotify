package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fws0 extends gws0 {

    /* JADX INFO: renamed from: a */
    public final z0r f74159a;

    /* JADX INFO: renamed from: b */
    public final int f74160b;

    public fws0(z0r z0rVar, int i) {
        this.f74159a = z0rVar;
        this.f74160b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fws0)) {
            return false;
        }
        fws0 fws0Var = (fws0) obj;
        return wj50.m88271j(this.f74159a, fws0Var.f74159a) && this.f74160b == fws0Var.f74160b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f74160b) + (this.f74159a.hashCode() * 31);
    }
}
