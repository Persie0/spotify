package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f17673a;

    /* JADX INFO: renamed from: b */
    public final p68 f17674b;

    /* JADX INFO: renamed from: c */
    public final p68 f17675c;

    /* JADX INFO: renamed from: d */
    public final z8m f17676d;

    /* JADX INFO: renamed from: e */
    public final c9m f17677e;

    public aof0(lb81 lb81Var, p68 p68Var, p68 p68Var2, z8m z8mVar, c9m c9mVar) {
        this.f17673a = lb81Var;
        this.f17674b = p68Var;
        this.f17675c = p68Var2;
        this.f17676d = z8mVar;
        this.f17677e = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aof0)) {
            return false;
        }
        aof0 aof0Var = (aof0) obj;
        return this.f17673a == aof0Var.f17673a && wj50.m88271j(this.f17674b, aof0Var.f17674b) && wj50.m88271j(this.f17675c, aof0Var.f17675c) && this.f17676d == aof0Var.f17676d && this.f17677e == aof0Var.f17677e;
    }

    public final int hashCode() {
        int iM50935g = ikc0.m50935g(this.f17674b, this.f17673a.hashCode() * 31, 31);
        p68 p68Var = this.f17675c;
        return this.f17677e.hashCode() + ((this.f17676d.hashCode() + ((iM50935g + (p68Var == null ? 0 : p68Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        String strM69190c = this.f17674b.m69190c();
        p68 p68Var = this.f17675c;
        return "OnEqCurveChanged(track=" + this.f17673a + ", updatedCurves=" + strM69190c + ", otherTrackCurves=" + (p68Var != null ? p68Var.m69190c() : null) + ", action=" + this.f17676d + ", curveType=" + this.f17677e + ")";
    }
}
