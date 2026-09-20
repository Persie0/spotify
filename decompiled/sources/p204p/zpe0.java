package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zpe0 implements zqe0 {

    /* JADX INFO: renamed from: a */
    public final String f285117a;

    /* JADX INFO: renamed from: b */
    public final pla1 f285118b;

    /* JADX INFO: renamed from: c */
    public final hdj f285119c;

    public zpe0(String str, pla1 pla1Var, hdj hdjVar) {
        this.f285117a = str;
        this.f285118b = pla1Var;
        this.f285119c = hdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpe0)) {
            return false;
        }
        zpe0 zpe0Var = (zpe0) obj;
        return wj50.m88271j(this.f285117a, zpe0Var.f285117a) && wj50.m88271j(this.f285118b, zpe0Var.f285118b) && wj50.m88271j(this.f285119c, zpe0Var.f285119c);
    }

    @Override // p204p.zqe0
    public final String getId() {
        return this.f285117a;
    }

    public final int hashCode() {
        return this.f285119c.hashCode() + ydj.m93448g(this.f285118b, this.f285117a.hashCode() * 31, 31);
    }
}
