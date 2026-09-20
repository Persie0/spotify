package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w4o0 extends y4o0 {

    /* JADX INFO: renamed from: a */
    public final String f247854a;

    /* JADX INFO: renamed from: b */
    public final String f247855b;

    /* JADX INFO: renamed from: c */
    public final String f247856c;

    /* JADX INFO: renamed from: d */
    public final String f247857d;

    /* JADX INFO: renamed from: e */
    public final rq91 f247858e;

    /* JADX INFO: renamed from: f */
    public final String f247859f;

    public w4o0(String str, String str2, String str3, String str4, rq91 rq91Var, String str5) {
        this.f247854a = str;
        this.f247855b = str2;
        this.f247856c = str3;
        this.f247857d = str4;
        this.f247858e = rq91Var;
        this.f247859f = str5;
    }

    @Override // p204p.y4o0
    /* JADX INFO: renamed from: a */
    public final String mo84655a() {
        return this.f247859f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4o0)) {
            return false;
        }
        w4o0 w4o0Var = (w4o0) obj;
        return wj50.m88271j(this.f247854a, w4o0Var.f247854a) && wj50.m88271j(this.f247855b, w4o0Var.f247855b) && wj50.m88271j(this.f247856c, w4o0Var.f247856c) && wj50.m88271j(this.f247857d, w4o0Var.f247857d) && this.f247858e.equals(w4o0Var.f247858e) && wj50.m88271j(this.f247859f, w4o0Var.f247859f);
    }

    public final int hashCode() {
        return this.f247859f.hashCode() + mt60.m62800g(this.f247858e.f201781b, s571.m77243b(s571.m77243b(s571.m77243b(this.f247854a.hashCode() * 31, 31, this.f247855b), 31, this.f247856c), 31, this.f247857d), 31);
    }
}
