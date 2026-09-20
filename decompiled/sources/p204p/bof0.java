package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f29126a;

    /* JADX INFO: renamed from: b */
    public final p68 f29127b;

    /* JADX INFO: renamed from: c */
    public final p68 f29128c;

    /* JADX INFO: renamed from: d */
    public final z8m f29129d;

    /* JADX INFO: renamed from: e */
    public final c9m f29130e;

    public bof0(lb81 lb81Var, p68 p68Var, p68 p68Var2, z8m z8mVar, c9m c9mVar) {
        this.f29126a = lb81Var;
        this.f29127b = p68Var;
        this.f29128c = p68Var2;
        this.f29129d = z8mVar;
        this.f29130e = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bof0)) {
            return false;
        }
        bof0 bof0Var = (bof0) obj;
        return this.f29126a == bof0Var.f29126a && wj50.m88271j(this.f29127b, bof0Var.f29127b) && wj50.m88271j(this.f29128c, bof0Var.f29128c) && this.f29129d == bof0Var.f29129d && this.f29130e == bof0Var.f29130e;
    }

    public final int hashCode() {
        int iM50935g = ikc0.m50935g(this.f29127b, this.f29126a.hashCode() * 31, 31);
        p68 p68Var = this.f29128c;
        return this.f29130e.hashCode() + ((this.f29129d.hashCode() + ((iM50935g + (p68Var == null ? 0 : p68Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        String strM69190c = this.f29127b.m69190c();
        p68 p68Var = this.f29128c;
        return "OnFilterCurveChanged(track=" + this.f29126a + ", updatedCurves=" + strM69190c + ", otherTrackCurves=" + (p68Var != null ? p68Var.m69190c() : null) + ", action=" + this.f29129d + ", curveType=" + this.f29130e + ")";
    }
}
