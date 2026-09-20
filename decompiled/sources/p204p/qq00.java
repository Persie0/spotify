package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qq00 {

    /* JADX INFO: renamed from: a */
    public final hn8 f191409a;

    /* JADX INFO: renamed from: b */
    public final kn20 f191410b;

    /* JADX INFO: renamed from: c */
    public final bzj f191411c;

    public qq00(hn8 hn8Var, kn20 kn20Var, bzj bzjVar) {
        this.f191409a = hn8Var;
        this.f191410b = kn20Var;
        this.f191411c = bzjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq00)) {
            return false;
        }
        qq00 qq00Var = (qq00) obj;
        return wj50.m88271j(this.f191409a, qq00Var.f191409a) && wj50.m88271j(this.f191410b, qq00Var.f191410b) && wj50.m88271j(this.f191411c, qq00Var.f191411c);
    }

    public final int hashCode() {
        return this.f191411c.hashCode() + ((this.f191410b.hashCode() + (this.f191409a.hashCode() * 31)) * 31);
    }
}
