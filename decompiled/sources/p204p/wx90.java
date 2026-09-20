package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wx90 {

    /* JADX INFO: renamed from: a */
    public final String f255983a;

    /* JADX INFO: renamed from: b */
    public final String f255984b;

    /* JADX INFO: renamed from: c */
    public final knd f255985c;

    /* JADX INFO: renamed from: d */
    public final boolean f255986d;

    /* JADX INFO: renamed from: e */
    public final abd f255987e;

    public wx90(String str, String str2, abd abdVar, knd kndVar, boolean z) {
        this.f255983a = str;
        this.f255984b = str2;
        this.f255985c = kndVar;
        this.f255986d = z;
        this.f255987e = abdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx90)) {
            return false;
        }
        wx90 wx90Var = (wx90) obj;
        return wj50.m88271j(this.f255983a, wx90Var.f255983a) && wj50.m88271j(this.f255984b, wx90Var.f255984b) && this.f255985c == wx90Var.f255985c && this.f255986d == wx90Var.f255986d && wj50.m88271j(this.f255987e, wx90Var.f255987e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f255985c.hashCode() + s571.m77243b(this.f255983a.hashCode() * 31, 31, this.f255984b)) * 31, 31, this.f255986d);
        abd abdVar = this.f255987e;
        return iM77245d + (abdVar == null ? 0 : abdVar.hashCode());
    }
}
