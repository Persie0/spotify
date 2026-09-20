package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v4o0 extends y4o0 {

    /* JADX INFO: renamed from: a */
    public final String f237208a;

    /* JADX INFO: renamed from: b */
    public final String f237209b;

    /* JADX INFO: renamed from: c */
    public final String f237210c;

    /* JADX INFO: renamed from: d */
    public final String f237211d;

    /* JADX INFO: renamed from: e */
    public final rq91 f237212e;

    /* JADX INFO: renamed from: f */
    public final String f237213f;

    public v4o0(String str, String str2, String str3, String str4, rq91 rq91Var, String str5) {
        this.f237208a = str;
        this.f237209b = str2;
        this.f237210c = str3;
        this.f237211d = str4;
        this.f237212e = rq91Var;
        this.f237213f = str5;
    }

    @Override // p204p.y4o0
    /* JADX INFO: renamed from: a */
    public final String mo84655a() {
        return this.f237213f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4o0)) {
            return false;
        }
        v4o0 v4o0Var = (v4o0) obj;
        return wj50.m88271j(this.f237208a, v4o0Var.f237208a) && wj50.m88271j(this.f237209b, v4o0Var.f237209b) && wj50.m88271j(this.f237210c, v4o0Var.f237210c) && wj50.m88271j(this.f237211d, v4o0Var.f237211d) && this.f237212e.equals(v4o0Var.f237212e) && wj50.m88271j(this.f237213f, v4o0Var.f237213f);
    }

    public final int hashCode() {
        return this.f237213f.hashCode() + mt60.m62800g(this.f237212e.f201781b, s571.m77243b(s571.m77243b(s571.m77243b(this.f237208a.hashCode() * 31, 31, this.f237209b), 31, this.f237210c), 31, this.f237211d), 31);
    }
}
