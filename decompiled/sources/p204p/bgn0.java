package p204p;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class bgn0 {
    public static final agn0 Companion = new agn0();

    /* JADX INFO: renamed from: a */
    public final String f26973a;

    /* JADX INFO: renamed from: b */
    public final String f26974b;

    /* JADX INFO: renamed from: c */
    public final String f26975c;

    /* JADX INFO: renamed from: d */
    public final String f26976d;

    /* JADX INFO: renamed from: e */
    public final String f26977e;

    /* JADX INFO: renamed from: f */
    public final String f26978f;

    /* JADX INFO: renamed from: g */
    public final String f26979g;

    public /* synthetic */ bgn0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (127 != (i & 127)) {
            edo.m38617p(i, 127, zfn0.f282352a.getDescriptor());
            throw null;
        }
        this.f26973a = str;
        this.f26974b = str2;
        this.f26975c = str3;
        this.f26976d = str4;
        this.f26977e = str5;
        this.f26978f = str6;
        this.f26979g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgn0)) {
            return false;
        }
        bgn0 bgn0Var = (bgn0) obj;
        return wj50.m88271j(this.f26973a, bgn0Var.f26973a) && wj50.m88271j(this.f26974b, bgn0Var.f26974b) && wj50.m88271j(this.f26975c, bgn0Var.f26975c) && wj50.m88271j(this.f26976d, bgn0Var.f26976d) && wj50.m88271j(this.f26977e, bgn0Var.f26977e) && wj50.m88271j(this.f26978f, bgn0Var.f26978f) && wj50.m88271j(this.f26979g, bgn0Var.f26979g);
    }

    public final int hashCode() {
        return this.f26979g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f26973a.hashCode() * 31, 31, this.f26974b), 31, this.f26975c), 31, this.f26976d), 31, this.f26977e), 31, this.f26978f);
    }

    public bgn0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f26973a = str;
        this.f26974b = str2;
        this.f26975c = str3;
        this.f26976d = str4;
        this.f26977e = str5;
        this.f26978f = str6;
        this.f26979g = str7;
    }
}
