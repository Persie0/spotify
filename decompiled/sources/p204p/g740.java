package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g740 extends i740 {

    /* JADX INFO: renamed from: a */
    public final z840 f77173a;

    /* JADX INFO: renamed from: b */
    public final a740 f77174b;

    /* JADX INFO: renamed from: c */
    public final String f77175c;

    public g740(z840 z840Var, a740 a740Var, String str) {
        this.f77173a = z840Var;
        this.f77174b = a740Var;
        this.f77175c = str;
    }

    @Override // p204p.i740
    /* JADX INFO: renamed from: a */
    public final String mo43794a() {
        return this.f77175c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g740)) {
            return false;
        }
        g740 g740Var = (g740) obj;
        return wj50.m88271j(this.f77173a, g740Var.f77173a) && wj50.m88271j(this.f77174b, g740Var.f77174b) && wj50.m88271j(this.f77175c, g740Var.f77175c);
    }

    public final int hashCode() {
        int iHashCode = this.f77173a.hashCode() * 31;
        this.f77174b.getClass();
        return this.f77175c.hashCode() + ((edb.m38547C(2) + iHashCode) * 31);
    }
}
