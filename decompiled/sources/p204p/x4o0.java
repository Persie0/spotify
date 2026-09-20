package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class x4o0 extends y4o0 {

    /* JADX INFO: renamed from: a */
    public final String f258161a;

    /* JADX INFO: renamed from: b */
    public final String f258162b;

    /* JADX INFO: renamed from: c */
    public final String f258163c;

    /* JADX INFO: renamed from: d */
    public final String f258164d;

    /* JADX INFO: renamed from: e */
    public final rq91 f258165e;

    /* JADX INFO: renamed from: f */
    public final String f258166f;

    public x4o0(String str, String str2, String str3, String str4, rq91 rq91Var, String str5) {
        this.f258161a = str;
        this.f258162b = str2;
        this.f258163c = str3;
        this.f258164d = str4;
        this.f258165e = rq91Var;
        this.f258166f = str5;
    }

    @Override // p204p.y4o0
    /* JADX INFO: renamed from: a */
    public final String mo84655a() {
        return this.f258166f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4o0)) {
            return false;
        }
        x4o0 x4o0Var = (x4o0) obj;
        return wj50.m88271j(this.f258161a, x4o0Var.f258161a) && wj50.m88271j(this.f258162b, x4o0Var.f258162b) && wj50.m88271j(this.f258163c, x4o0Var.f258163c) && wj50.m88271j(this.f258164d, x4o0Var.f258164d) && this.f258165e.equals(x4o0Var.f258165e) && wj50.m88271j(this.f258166f, x4o0Var.f258166f);
    }

    public final int hashCode() {
        return this.f258166f.hashCode() + mt60.m62800g(this.f258165e.f201781b, s571.m77243b(s571.m77243b(s571.m77243b(this.f258161a.hashCode() * 31, 31, this.f258162b), 31, this.f258163c), 31, this.f258164d), 31);
    }
}
