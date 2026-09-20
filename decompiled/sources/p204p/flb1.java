package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class flb1 {

    /* JADX INFO: renamed from: a */
    public final String f70745a;

    /* JADX INFO: renamed from: b */
    public final boolean f70746b;

    /* JADX INFO: renamed from: c */
    public final elb1 f70747c;

    /* JADX INFO: renamed from: d */
    public final dlb1 f70748d;

    /* JADX INFO: renamed from: e */
    public final hc80 f70749e;

    /* JADX INFO: renamed from: f */
    public final pa9 f70750f;

    /* JADX INFO: renamed from: g */
    public final lt0 f70751g;

    public /* synthetic */ flb1(String str, boolean z, elb1 elb1Var, dlb1 dlb1Var, hc80 hc80Var) {
        this(str, z, elb1Var, dlb1Var, hc80Var, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flb1)) {
            return false;
        }
        flb1 flb1Var = (flb1) obj;
        return wj50.m88271j(this.f70745a, flb1Var.f70745a) && this.f70746b == flb1Var.f70746b && this.f70747c == flb1Var.f70747c && wj50.m88271j(this.f70748d, flb1Var.f70748d) && wj50.m88271j(this.f70749e, flb1Var.f70749e) && wj50.m88271j(this.f70750f, flb1Var.f70750f) && wj50.m88271j(this.f70751g, flb1Var.f70751g);
    }

    public final int hashCode() {
        int iHashCode = (this.f70749e.hashCode() + ((this.f70748d.hashCode() + ((this.f70747c.hashCode() + s571.m77245d(this.f70745a.hashCode() * 31, 31, this.f70746b)) * 31)) * 31)) * 31;
        pa9 pa9Var = this.f70750f;
        int iHashCode2 = (iHashCode + (pa9Var == null ? 0 : pa9Var.hashCode())) * 31;
        lt0 lt0Var = this.f70751g;
        return iHashCode2 + (lt0Var != null ? lt0Var.hashCode() : 0);
    }

    public flb1(String str, boolean z, elb1 elb1Var, dlb1 dlb1Var, hc80 hc80Var, pa9 pa9Var, lt0 lt0Var) {
        this.f70745a = str;
        this.f70746b = z;
        this.f70747c = elb1Var;
        this.f70748d = dlb1Var;
        this.f70749e = hc80Var;
        this.f70750f = pa9Var;
        this.f70751g = lt0Var;
    }
}
