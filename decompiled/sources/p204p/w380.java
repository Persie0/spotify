package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w380 extends j9e0 {

    /* JADX INFO: renamed from: a */
    public final String f247513a;

    /* JADX INFO: renamed from: b */
    public final String f247514b;

    /* JADX INFO: renamed from: c */
    public final int f247515c;

    /* JADX INFO: renamed from: d */
    public final String f247516d;

    /* JADX INFO: renamed from: e */
    public final String f247517e;

    /* JADX INFO: renamed from: f */
    public final String f247518f;

    /* JADX INFO: renamed from: g */
    public final String f247519g;

    /* JADX INFO: renamed from: h */
    public final int f247520h;

    /* JADX INFO: renamed from: i */
    public final boolean f247521i;

    public w380(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, boolean z) {
        this.f247513a = str;
        this.f247514b = str2;
        this.f247515c = i;
        this.f247516d = str3;
        this.f247517e = str4;
        this.f247518f = str5;
        this.f247519g = str6;
        this.f247520h = i2;
        this.f247521i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w380)) {
            return false;
        }
        w380 w380Var = (w380) obj;
        return wj50.m88271j(this.f247513a, w380Var.f247513a) && wj50.m88271j(this.f247514b, w380Var.f247514b) && this.f247515c == w380Var.f247515c && wj50.m88271j(this.f247516d, w380Var.f247516d) && wj50.m88271j(this.f247517e, w380Var.f247517e) && wj50.m88271j(this.f247518f, w380Var.f247518f) && wj50.m88271j(this.f247519g, w380Var.f247519g) && this.f247520h == w380Var.f247520h && this.f247521i == w380Var.f247521i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247521i) + mt60.m62800g(this.f247520h, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.f247515c, s571.m77243b(this.f247513a.hashCode() * 31, 31, this.f247514b), 31), 31, this.f247516d), 31, this.f247517e), 31, this.f247518f), 31, this.f247519g), 31);
    }
}
