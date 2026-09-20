package p204p;

/* JADX INFO: renamed from: p.am */
/* JADX INFO: loaded from: classes9.dex */
public final class C1672am {

    /* JADX INFO: renamed from: a */
    public final boolean f17018a;

    /* JADX INFO: renamed from: b */
    public final xul0 f17019b;

    /* JADX INFO: renamed from: c */
    public final xul0 f17020c;

    public C1672am(boolean z, xul0 xul0Var, xul0 xul0Var2) {
        this.f17018a = z;
        this.f17019b = xul0Var;
        this.f17020c = xul0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672am)) {
            return false;
        }
        C1672am c1672am = (C1672am) obj;
        return this.f17018a == c1672am.f17018a && wj50.m88271j(this.f17019b, c1672am.f17019b) && wj50.m88271j(this.f17020c, c1672am.f17020c);
    }

    public final int hashCode() {
        return this.f17020c.hashCode() + ((this.f17019b.hashCode() + (Boolean.hashCode(this.f17018a) * 31)) * 31);
    }
}
