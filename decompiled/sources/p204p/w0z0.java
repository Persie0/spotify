package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w0z0 {

    /* JADX INFO: renamed from: a */
    public final String f246891a;

    /* JADX INFO: renamed from: b */
    public final String f246892b;

    /* JADX INFO: renamed from: c */
    public final String f246893c;

    /* JADX INFO: renamed from: d */
    public final String f246894d;

    /* JADX INFO: renamed from: e */
    public final String f246895e;

    /* JADX INFO: renamed from: f */
    public final String f246896f;

    public w0z0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f246891a = str;
        this.f246892b = str2;
        this.f246893c = str3;
        this.f246894d = str4;
        this.f246895e = str5;
        this.f246896f = str6;
    }

    /* JADX INFO: renamed from: a */
    public final String m86962a() {
        return this.f246896f;
    }

    /* JADX INFO: renamed from: b */
    public final String m86963b() {
        return this.f246892b;
    }

    /* JADX INFO: renamed from: c */
    public final String m86964c() {
        return this.f246891a;
    }

    /* JADX INFO: renamed from: d */
    public final String m86965d() {
        return this.f246894d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0z0)) {
            return false;
        }
        w0z0 w0z0Var = (w0z0) obj;
        return wj50.m88271j(this.f246891a, w0z0Var.f246891a) && wj50.m88271j(this.f246892b, w0z0Var.f246892b) && wj50.m88271j(this.f246893c, w0z0Var.f246893c) && wj50.m88271j(this.f246894d, w0z0Var.f246894d) && wj50.m88271j(this.f246895e, w0z0Var.f246895e) && wj50.m88271j(this.f246896f, w0z0Var.f246896f);
    }

    public final int hashCode() {
        int iHashCode = this.f246891a.hashCode() * 31;
        String str = this.f246892b;
        int iM77243b = s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f246893c), 31, this.f246894d);
        String str2 = this.f246895e;
        int iHashCode2 = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f246896f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
