package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class od30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final ro0 f164083a;

    /* JADX INFO: renamed from: b */
    public final String f164084b;

    /* JADX INFO: renamed from: c */
    public final String f164085c;

    /* JADX INFO: renamed from: d */
    public final String f164086d;

    public od30(ro0 ro0Var, String str, String str2, String str3) {
        this.f164083a = ro0Var;
        this.f164084b = str;
        this.f164085c = str2;
        this.f164086d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od30)) {
            return false;
        }
        od30 od30Var = (od30) obj;
        return wj50.m88271j(this.f164083a, od30Var.f164083a) && wj50.m88271j(this.f164084b, od30Var.f164084b) && wj50.m88271j(this.f164085c, od30Var.f164085c) && wj50.m88271j(this.f164086d, od30Var.f164086d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f164083a.hashCode() * 31, 31, this.f164084b), 31, this.f164085c);
        String str = this.f164086d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
