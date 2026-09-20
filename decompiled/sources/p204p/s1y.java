package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s1y {

    /* JADX INFO: renamed from: a */
    public final zbr f204852a;

    /* JADX INFO: renamed from: b */
    public final ycs0 f204853b;

    /* JADX INFO: renamed from: c */
    public final x430 f204854c;

    /* JADX INFO: renamed from: d */
    public final yfj f204855d;

    public s1y(zbr zbrVar, ycs0 ycs0Var, x430 x430Var, yfj yfjVar) {
        this.f204852a = zbrVar;
        this.f204853b = ycs0Var;
        this.f204854c = x430Var;
        this.f204855d = yfjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1y)) {
            return false;
        }
        s1y s1yVar = (s1y) obj;
        return wj50.m88271j(this.f204852a, s1yVar.f204852a) && wj50.m88271j(this.f204853b, s1yVar.f204853b) && wj50.m88271j(this.f204854c, s1yVar.f204854c) && wj50.m88271j(this.f204855d, s1yVar.f204855d);
    }

    public final int hashCode() {
        int iHashCode = (this.f204853b.hashCode() + (this.f204852a.hashCode() * 31)) * 31;
        x430 x430Var = this.f204854c;
        int iHashCode2 = (iHashCode + (x430Var == null ? 0 : x430Var.hashCode())) * 31;
        yfj yfjVar = this.f204855d;
        return iHashCode2 + (yfjVar != null ? yfjVar.hashCode() : 0);
    }
}
