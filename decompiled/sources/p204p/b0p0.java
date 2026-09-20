package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b0p0 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f22062a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f22063b;

    /* JADX INFO: renamed from: c */
    public final o4x f22064c;

    public b0p0(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar) {
        this.f22062a = otd0Var;
        this.f22063b = ibp0Var;
        this.f22064c = o4xVar;
    }

    /* JADX INFO: renamed from: a */
    public final o4x m27850a() {
        return this.f22064c;
    }

    /* JADX INFO: renamed from: b */
    public final otd0 m27851b() {
        return this.f22062a;
    }

    /* JADX INFO: renamed from: c */
    public final ibp0 m27852c() {
        return this.f22063b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0p0)) {
            return false;
        }
        b0p0 b0p0Var = (b0p0) obj;
        return wj50.m88271j(this.f22062a, b0p0Var.f22062a) && wj50.m88271j(this.f22063b, b0p0Var.f22063b) && wj50.m88271j(this.f22064c, b0p0Var.f22064c);
    }

    public final int hashCode() {
        return this.f22064c.hashCode() + ((this.f22063b.hashCode() + (this.f22062a.hashCode() * 31)) * 31);
    }
}
