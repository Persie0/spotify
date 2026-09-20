package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w950 implements l630 {

    /* JADX INFO: renamed from: a */
    public final ma50 f249080a;

    /* JADX INFO: renamed from: b */
    public final String f249081b;

    /* JADX INFO: renamed from: c */
    public final b250 f249082c;

    public w950(ma50 ma50Var, String str, b250 b250Var) {
        this.f249080a = ma50Var;
        this.f249081b = str;
        this.f249082c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w950)) {
            return false;
        }
        w950 w950Var = (w950) obj;
        return wj50.m88271j(this.f249080a, w950Var.f249080a) && wj50.m88271j(this.f249081b, w950Var.f249081b) && wj50.m88271j(this.f249082c, w950Var.f249082c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f249081b;
    }

    public final int hashCode() {
        return this.f249082c.hashCode() + s571.m77243b(this.f249080a.hashCode() * 31, 31, this.f249081b);
    }
}
