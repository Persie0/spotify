package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sy1 implements ty1 {

    /* JADX INFO: renamed from: a */
    public final String f215080a;

    /* JADX INFO: renamed from: b */
    public final jy1 f215081b;

    /* JADX INFO: renamed from: c */
    public final int f215082c;

    /* JADX INFO: renamed from: d */
    public final jqy f215083d;

    public sy1(String str, jy1 jy1Var, int i, jqy jqyVar) {
        this.f215080a = str;
        this.f215081b = jy1Var;
        this.f215082c = i;
        this.f215083d = jqyVar;
    }

    @Override // p204p.ty1
    /* JADX INFO: renamed from: c */
    public final ky1 mo74151c() {
        return this.f215081b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy1)) {
            return false;
        }
        sy1 sy1Var = (sy1) obj;
        return wj50.m88271j(this.f215080a, sy1Var.f215080a) && this.f215081b.equals(sy1Var.f215081b) && this.f215082c == sy1Var.f215082c && this.f215083d.equals(sy1Var.f215083d);
    }

    @Override // p204p.ty1
    public final String getId() {
        return this.f215080a;
    }

    public final int hashCode() {
        return ((this.f215083d.hashCode() + mt60.m62800g(this.f215082c, (this.f215081b.hashCode() + (this.f215080a.hashCode() * 31)) * 31, 31)) * 31) - 1745832608;
    }
}
