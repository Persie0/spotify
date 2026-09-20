package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fwp0 {

    /* JADX INFO: renamed from: a */
    public final String f74129a;

    /* JADX INFO: renamed from: b */
    public final String f74130b;

    /* JADX INFO: renamed from: c */
    public final ewp0 f74131c;

    public fwp0(String str, String str2, ewp0 ewp0Var) {
        this.f74129a = str;
        this.f74130b = str2;
        this.f74131c = ewp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwp0)) {
            return false;
        }
        fwp0 fwp0Var = (fwp0) obj;
        return wj50.m88271j(this.f74129a, fwp0Var.f74129a) && wj50.m88271j(this.f74130b, fwp0Var.f74130b) && wj50.m88271j(this.f74131c, fwp0Var.f74131c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f74129a.hashCode() * 31, 31, this.f74130b);
        ewp0 ewp0Var = this.f74131c;
        return iM77243b + (ewp0Var == null ? 0 : ewp0Var.hashCode());
    }
}
