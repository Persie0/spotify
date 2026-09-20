package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zpm0 implements aqm0 {

    /* JADX INFO: renamed from: a */
    public final String f285179a;

    /* JADX INFO: renamed from: b */
    public final String f285180b;

    /* JADX INFO: renamed from: c */
    public final String f285181c;

    /* JADX INFO: renamed from: d */
    public final String f285182d;

    /* JADX INFO: renamed from: e */
    public final String f285183e;

    /* JADX INFO: renamed from: f */
    public final boolean f285184f;

    public zpm0(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f285179a = str;
        this.f285180b = str2;
        this.f285181c = str3;
        this.f285182d = str4;
        this.f285183e = str5;
        this.f285184f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpm0)) {
            return false;
        }
        zpm0 zpm0Var = (zpm0) obj;
        return wj50.m88271j(this.f285179a, zpm0Var.f285179a) && wj50.m88271j(this.f285180b, zpm0Var.f285180b) && wj50.m88271j(this.f285181c, zpm0Var.f285181c) && wj50.m88271j(this.f285182d, zpm0Var.f285182d) && wj50.m88271j(this.f285183e, zpm0Var.f285183e) && this.f285184f == zpm0Var.f285184f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f285179a.hashCode() * 31, 31, this.f285180b), 31, this.f285181c), 31, this.f285182d);
        String str = this.f285183e;
        return Boolean.hashCode(this.f285184f) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
