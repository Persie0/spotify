package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bv11 {

    /* JADX INFO: renamed from: a */
    public final av11 f31253a;

    /* JADX INFO: renamed from: b */
    public final int f31254b;

    /* JADX INFO: renamed from: c */
    public final int f31255c;

    /* JADX INFO: renamed from: d */
    public final boolean f31256d;

    /* JADX INFO: renamed from: e */
    public final int f31257e;

    public bv11(av11 av11Var, int i, int i2, boolean z, int i3) {
        this.f31253a = av11Var;
        this.f31254b = i;
        this.f31255c = i2;
        this.f31256d = z;
        this.f31257e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv11)) {
            return false;
        }
        bv11 bv11Var = (bv11) obj;
        return this.f31253a == bv11Var.f31253a && this.f31254b == bv11Var.f31254b && this.f31255c == bv11Var.f31255c && this.f31256d == bv11Var.f31256d && this.f31257e == bv11Var.f31257e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f31257e) + s571.m77245d(mt60.m62800g(this.f31255c, mt60.m62800g(this.f31254b, this.f31253a.hashCode() * 31, 31), 31), 31, this.f31256d);
    }
}
