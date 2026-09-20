package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w00 {

    /* JADX INFO: renamed from: a */
    public final String f246606a;

    /* JADX INFO: renamed from: b */
    public final String f246607b;

    /* JADX INFO: renamed from: c */
    public final String f246608c;

    /* JADX INFO: renamed from: d */
    public final String f246609d;

    /* JADX INFO: renamed from: e */
    public final String f246610e;

    public w00(String str, String str2, String str3, String str4, String str5, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str4 = (i & 8) != 0 ? "" : str4;
        str5 = (i & 16) != 0 ? "" : str5;
        this.f246606a = str;
        this.f246607b = str2;
        this.f246608c = str3;
        this.f246609d = str4;
        this.f246610e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w00)) {
            return false;
        }
        w00 w00Var = (w00) obj;
        return wj50.m88271j(this.f246606a, w00Var.f246606a) && wj50.m88271j(this.f246607b, w00Var.f246607b) && wj50.m88271j(this.f246608c, w00Var.f246608c) && wj50.m88271j(this.f246609d, w00Var.f246609d) && wj50.m88271j(this.f246610e, w00Var.f246610e);
    }

    public final int hashCode() {
        return this.f246610e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f246606a.hashCode() * 31, 31, this.f246607b), 31, this.f246608c), 31, this.f246609d);
    }
}
