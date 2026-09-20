package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f51031a;

    /* JADX INFO: renamed from: b */
    public final p68 f51032b;

    /* JADX INFO: renamed from: c */
    public final p68 f51033c;

    /* JADX INFO: renamed from: d */
    public final z8m f51034d;

    /* JADX INFO: renamed from: e */
    public final c9m f51035e;

    public dof0(lb81 lb81Var, p68 p68Var, p68 p68Var2, z8m z8mVar, c9m c9mVar) {
        this.f51031a = lb81Var;
        this.f51032b = p68Var;
        this.f51033c = p68Var2;
        this.f51034d = z8mVar;
        this.f51035e = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dof0)) {
            return false;
        }
        dof0 dof0Var = (dof0) obj;
        return this.f51031a == dof0Var.f51031a && wj50.m88271j(this.f51032b, dof0Var.f51032b) && wj50.m88271j(this.f51033c, dof0Var.f51033c) && this.f51034d == dof0Var.f51034d && this.f51035e == dof0Var.f51035e;
    }

    public final int hashCode() {
        int iM50935g = ikc0.m50935g(this.f51032b, this.f51031a.hashCode() * 31, 31);
        p68 p68Var = this.f51033c;
        return this.f51035e.hashCode() + ((this.f51034d.hashCode() + ((iM50935g + (p68Var == null ? 0 : p68Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        String strM69190c = this.f51032b.m69190c();
        p68 p68Var = this.f51033c;
        return "OnFxCurveChanged(track=" + this.f51031a + ", updatedCurves=" + strM69190c + ", otherTrackCurves=" + (p68Var != null ? p68Var.m69190c() : null) + ", action=" + this.f51034d + ", curveType=" + this.f51035e + ")";
    }
}
