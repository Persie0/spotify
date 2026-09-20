package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kpf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f125057a;

    /* JADX INFO: renamed from: b */
    public final p68 f125058b;

    /* JADX INFO: renamed from: c */
    public final p68 f125059c;

    /* JADX INFO: renamed from: d */
    public final z8m f125060d;

    /* JADX INFO: renamed from: e */
    public final c9m f125061e;

    public kpf0(lb81 lb81Var, p68 p68Var, p68 p68Var2, z8m z8mVar, c9m c9mVar) {
        this.f125057a = lb81Var;
        this.f125058b = p68Var;
        this.f125059c = p68Var2;
        this.f125060d = z8mVar;
        this.f125061e = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpf0)) {
            return false;
        }
        kpf0 kpf0Var = (kpf0) obj;
        return this.f125057a == kpf0Var.f125057a && wj50.m88271j(this.f125058b, kpf0Var.f125058b) && wj50.m88271j(this.f125059c, kpf0Var.f125059c) && this.f125060d == kpf0Var.f125060d && this.f125061e == kpf0Var.f125061e;
    }

    public final int hashCode() {
        int iM50935g = ikc0.m50935g(this.f125058b, this.f125057a.hashCode() * 31, 31);
        p68 p68Var = this.f125059c;
        return this.f125061e.hashCode() + ((this.f125060d.hashCode() + ((iM50935g + (p68Var == null ? 0 : p68Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        String strM69190c = this.f125058b.m69190c();
        p68 p68Var = this.f125059c;
        return "OnVolumeCurveChanged(track=" + this.f125057a + ", updatedCurves=" + strM69190c + ", otherTrackCurves=" + (p68Var != null ? p68Var.m69190c() : null) + ", action=" + this.f125060d + ", curveType=" + this.f125061e + ")";
    }
}
