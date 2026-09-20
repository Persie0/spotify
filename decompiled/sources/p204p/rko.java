package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rko {

    /* JADX INFO: renamed from: a */
    public final tn61 f200128a;

    /* JADX INFO: renamed from: b */
    public final int f200129b;

    /* JADX INFO: renamed from: c */
    public final gh00 f200130c;

    /* JADX INFO: renamed from: d */
    public final wag1 f200131d;

    /* JADX INFO: renamed from: e */
    public final gh00 f200132e;

    public rko(tn61 tn61Var, int i, gh00 gh00Var, wag1 wag1Var, gh00 gh00Var2) {
        this.f200128a = tn61Var;
        this.f200129b = i;
        this.f200130c = gh00Var;
        this.f200131d = wag1Var;
        this.f200132e = gh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rko)) {
            return false;
        }
        rko rkoVar = (rko) obj;
        return wj50.m88271j(this.f200128a, rkoVar.f200128a) && this.f200129b == rkoVar.f200129b && wj50.m88271j(this.f200130c, rkoVar.f200130c) && this.f200131d.equals(rkoVar.f200131d) && wj50.m88271j(this.f200132e, rkoVar.f200132e);
    }

    public final int hashCode() {
        return this.f200132e.hashCode() + ((this.f200131d.hashCode() + m6b.m60989d(this.f200130c, f710.m40938f(this.f200129b, this.f200128a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "DataStatementItem(table=" + this.f200128a + ", outputKind=" + adn.m25614z(this.f200129b) + ")";
    }
}
