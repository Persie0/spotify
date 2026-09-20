package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class h4k0 {

    /* JADX INFO: renamed from: a */
    public final int f87548a;

    /* JADX INFO: renamed from: b */
    public final String f87549b;

    /* JADX INFO: renamed from: c */
    public final String f87550c;

    /* JADX INFO: renamed from: d */
    public final Boolean f87551d;

    public h4k0(String str, String str2, int i) {
        Boolean bool = Boolean.FALSE;
        this.f87548a = 20;
        this.f87549b = str;
        this.f87550c = str2;
        this.f87551d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4k0)) {
            return false;
        }
        h4k0 h4k0Var = (h4k0) obj;
        return this.f87548a == h4k0Var.f87548a && wj50.m88271j(this.f87549b, h4k0Var.f87549b) && wj50.m88271j(this.f87550c, h4k0Var.f87550c) && wj50.m88271j(this.f87551d, h4k0Var.f87551d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Integer.hashCode(this.f87548a) * 31, 31, this.f87549b);
        String str = this.f87550c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 961;
        Boolean bool = this.f87551d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
