package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hb01 {

    /* JADX INFO: renamed from: a */
    public final db01 f89345a;

    /* JADX INFO: renamed from: b */
    public final boolean f89346b;

    /* JADX INFO: renamed from: c */
    public final z901 f89347c;

    /* JADX INFO: renamed from: d */
    public final ua01 f89348d;

    public hb01(db01 db01Var, boolean z, z901 z901Var, ua01 ua01Var) {
        this.f89345a = db01Var;
        this.f89346b = z;
        this.f89347c = z901Var;
        this.f89348d = ua01Var;
    }

    /* JADX INFO: renamed from: a */
    public static hb01 m46957a(hb01 hb01Var, db01 db01Var, boolean z, z901 z901Var, ua01 ua01Var, int i) {
        if ((i & 1) != 0) {
            db01Var = hb01Var.f89345a;
        }
        if ((i & 2) != 0) {
            z = hb01Var.f89346b;
        }
        if ((i & 4) != 0) {
            z901Var = hb01Var.f89347c;
        }
        if ((i & 8) != 0) {
            ua01Var = hb01Var.f89348d;
        }
        hb01Var.getClass();
        return new hb01(db01Var, z, z901Var, ua01Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb01)) {
            return false;
        }
        hb01 hb01Var = (hb01) obj;
        return wj50.m88271j(this.f89345a, hb01Var.f89345a) && this.f89346b == hb01Var.f89346b && wj50.m88271j(this.f89347c, hb01Var.f89347c) && wj50.m88271j(this.f89348d, hb01Var.f89348d);
    }

    public final int hashCode() {
        return this.f89348d.hashCode() + ((this.f89347c.hashCode() + s571.m77245d(this.f89345a.hashCode() * 31, 31, this.f89346b)) * 31);
    }
}
