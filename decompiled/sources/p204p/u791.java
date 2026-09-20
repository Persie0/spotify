package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class u791 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f227537a;

    /* JADX INFO: renamed from: b */
    public final String f227538b;

    /* JADX INFO: renamed from: c */
    public final String f227539c;

    /* JADX INFO: renamed from: d */
    public final String f227540d;

    /* JADX INFO: renamed from: e */
    public final String f227541e;

    /* JADX INFO: renamed from: f */
    public final String f227542f;

    /* JADX INFO: renamed from: g */
    public final int f227543g;

    public u791(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f227537a = str;
        this.f227538b = str2;
        this.f227539c = str3;
        this.f227540d = str4;
        this.f227541e = str5;
        this.f227542f = str6;
        this.f227543g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u791)) {
            return false;
        }
        u791 u791Var = (u791) obj;
        return wj50.m88271j(this.f227537a, u791Var.f227537a) && wj50.m88271j(this.f227538b, u791Var.f227538b) && wj50.m88271j(this.f227539c, u791Var.f227539c) && wj50.m88271j(this.f227540d, u791Var.f227540d) && wj50.m88271j(this.f227541e, u791Var.f227541e) && wj50.m88271j(this.f227542f, u791Var.f227542f) && this.f227543g == u791Var.f227543g;
    }

    public final int hashCode() {
        return edb.m38547C(this.f227543g) + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f227537a.hashCode() * 31, 31, this.f227538b), 31, this.f227539c), 31, this.f227540d), 31, this.f227541e), 31, this.f227542f);
    }
}
