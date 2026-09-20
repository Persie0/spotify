package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qgd1 {

    /* JADX INFO: renamed from: a */
    public final String f188449a;

    /* JADX INFO: renamed from: b */
    public final String f188450b;

    /* JADX INFO: renamed from: c */
    public final String f188451c;

    /* JADX INFO: renamed from: d */
    public final String f188452d;

    /* JADX INFO: renamed from: e */
    public final String f188453e;

    public qgd1(String str, String str2, String str3, String str4, String str5) {
        this.f188449a = str;
        this.f188450b = str2;
        this.f188451c = str3;
        this.f188452d = str4;
        this.f188453e = str5;
    }

    /* JADX INFO: renamed from: a */
    public final String m72737a() {
        return this.f188452d;
    }

    /* JADX INFO: renamed from: b */
    public final String m72738b() {
        return this.f188453e;
    }

    /* JADX INFO: renamed from: c */
    public final String m72739c() {
        return this.f188449a;
    }

    /* JADX INFO: renamed from: d */
    public final String m72740d() {
        return this.f188451c;
    }

    /* JADX INFO: renamed from: e */
    public final String m72741e() {
        return this.f188450b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgd1)) {
            return false;
        }
        qgd1 qgd1Var = (qgd1) obj;
        return wj50.m88271j(this.f188449a, qgd1Var.f188449a) && wj50.m88271j(this.f188450b, qgd1Var.f188450b) && wj50.m88271j(this.f188451c, qgd1Var.f188451c) && wj50.m88271j(this.f188452d, qgd1Var.f188452d) && wj50.m88271j(this.f188453e, qgd1Var.f188453e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f188449a.hashCode() * 31, 31, this.f188450b), 31, this.f188451c), 31, this.f188452d);
        String str = this.f188453e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
