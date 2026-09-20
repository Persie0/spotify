package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fdf implements hdf {

    /* JADX INFO: renamed from: a */
    public final String f68493a;

    /* JADX INFO: renamed from: b */
    public final qdz0 f68494b;

    /* JADX INFO: renamed from: c */
    public final int f68495c;

    /* JADX INFO: renamed from: d */
    public final int f68496d;

    public fdf(String str, qdz0 qdz0Var, int i, int i2) {
        this.f68493a = str;
        this.f68494b = qdz0Var;
        this.f68495c = i;
        this.f68496d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdf)) {
            return false;
        }
        fdf fdfVar = (fdf) obj;
        return wj50.m88271j(this.f68493a, fdfVar.f68493a) && wj50.m88271j(this.f68494b, fdfVar.f68494b) && this.f68495c == fdfVar.f68495c && this.f68496d == fdfVar.f68496d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68496d) + mt60.m62800g(this.f68495c, (this.f68494b.hashCode() + (this.f68493a.hashCode() * 31)) * 31, 31);
    }
}
