package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z9d1 implements moa {

    /* JADX INFO: renamed from: a */
    public final String f280754a;

    /* JADX INFO: renamed from: b */
    public final rq91 f280755b;

    /* JADX INFO: renamed from: c */
    public final cad1 f280756c;

    public z9d1(String str, rq91 rq91Var, cad1 cad1Var) {
        this.f280754a = str;
        this.f280755b = rq91Var;
        this.f280756c = cad1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9d1)) {
            return false;
        }
        z9d1 z9d1Var = (z9d1) obj;
        return wj50.m88271j(this.f280754a, z9d1Var.f280754a) && this.f280755b.equals(z9d1Var.f280755b) && this.f280756c.equals(z9d1Var.f280756c);
    }

    @Override // p204p.moa
    public final String getId() {
        return this.f280754a;
    }

    public final int hashCode() {
        return this.f280756c.hashCode() + mt60.m62800g(this.f280755b.f201781b, this.f280754a.hashCode() * 31, 31);
    }
}
