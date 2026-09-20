package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w9m0 {

    /* JADX INFO: renamed from: a */
    public final String f249200a;

    /* JADX INFO: renamed from: b */
    public final String f249201b;

    /* JADX INFO: renamed from: c */
    public final String f249202c;

    /* JADX INFO: renamed from: d */
    public final String f249203d;

    /* JADX INFO: renamed from: e */
    public final String f249204e;

    /* JADX INFO: renamed from: f */
    public final String f249205f;

    /* JADX INFO: renamed from: g */
    public final String f249206g;

    public w9m0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f249200a = str;
        this.f249201b = str2;
        this.f249202c = str3;
        this.f249203d = str4;
        this.f249204e = str5;
        this.f249205f = str6;
        this.f249206g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9m0)) {
            return false;
        }
        w9m0 w9m0Var = (w9m0) obj;
        return wj50.m88271j(this.f249200a, w9m0Var.f249200a) && wj50.m88271j(this.f249201b, w9m0Var.f249201b) && wj50.m88271j(this.f249202c, w9m0Var.f249202c) && wj50.m88271j(this.f249203d, w9m0Var.f249203d) && wj50.m88271j(this.f249204e, w9m0Var.f249204e) && wj50.m88271j(this.f249205f, w9m0Var.f249205f) && wj50.m88271j(this.f249206g, w9m0Var.f249206g);
    }

    public final int hashCode() {
        return this.f249206g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f249200a.hashCode() * 31, 31, this.f249201b), 31, this.f249202c), 31, this.f249203d), 31, this.f249204e), 31, this.f249205f);
    }
}
