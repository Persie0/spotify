package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wdt0 {

    /* JADX INFO: renamed from: a */
    public final String f250327a;

    /* JADX INFO: renamed from: b */
    public final String f250328b;

    /* JADX INFO: renamed from: c */
    public final String f250329c;

    /* JADX INFO: renamed from: d */
    public final String f250330d;

    /* JADX INFO: renamed from: e */
    public final String f250331e;

    public wdt0(String str, String str2, String str3, String str4, String str5) {
        this.f250327a = str;
        this.f250328b = str2;
        this.f250329c = str3;
        this.f250330d = str4;
        this.f250331e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdt0)) {
            return false;
        }
        wdt0 wdt0Var = (wdt0) obj;
        return wj50.m88271j(this.f250327a, wdt0Var.f250327a) && wj50.m88271j(this.f250328b, wdt0Var.f250328b) && wj50.m88271j(this.f250329c, wdt0Var.f250329c) && wj50.m88271j(this.f250330d, wdt0Var.f250330d) && wj50.m88271j(this.f250331e, wdt0Var.f250331e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f250327a.hashCode() * 31, 31, this.f250328b), 31, this.f250329c);
        String str = this.f250330d;
        return this.f250331e.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
