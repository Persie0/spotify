package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w9w {

    /* JADX INFO: renamed from: a */
    public final v140 f249275a;

    /* JADX INFO: renamed from: b */
    public final daj f249276b;

    /* JADX INFO: renamed from: c */
    public final o5p0 f249277c;

    /* JADX INFO: renamed from: d */
    public final drc1 f249278d;

    public w9w(v140 v140Var, daj dajVar, o5p0 o5p0Var, drc1 drc1Var) {
        this.f249275a = v140Var;
        this.f249276b = dajVar;
        this.f249277c = o5p0Var;
        this.f249278d = drc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9w)) {
            return false;
        }
        w9w w9wVar = (w9w) obj;
        return wj50.m88271j(this.f249275a, w9wVar.f249275a) && wj50.m88271j(this.f249276b, w9wVar.f249276b) && wj50.m88271j(this.f249277c, w9wVar.f249277c) && wj50.m88271j(this.f249278d, w9wVar.f249278d);
    }

    public final int hashCode() {
        int iHashCode = (this.f249276b.hashCode() + (this.f249275a.hashCode() * 31)) * 31;
        o5p0 o5p0Var = this.f249277c;
        return this.f249278d.hashCode() + ((iHashCode + (o5p0Var == null ? 0 : o5p0Var.hashCode())) * 31);
    }
}
