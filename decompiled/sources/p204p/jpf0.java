package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jpf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f114644a;

    /* JADX INFO: renamed from: b */
    public final int f114645b;

    /* JADX INFO: renamed from: c */
    public final boolean f114646c;

    /* JADX INFO: renamed from: d */
    public final boolean f114647d;

    /* JADX INFO: renamed from: e */
    public final int f114648e;

    public jpf0(lb81 lb81Var, int i, boolean z, boolean z2, int i2) {
        this.f114644a = lb81Var;
        this.f114645b = i;
        this.f114646c = z;
        this.f114647d = z2;
        this.f114648e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpf0)) {
            return false;
        }
        jpf0 jpf0Var = (jpf0) obj;
        return this.f114644a == jpf0Var.f114644a && this.f114645b == jpf0Var.f114645b && this.f114646c == jpf0Var.f114646c && this.f114647d == jpf0Var.f114647d && this.f114648e == jpf0Var.f114648e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f114648e) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f114645b, this.f114644a.hashCode() * 31, 31), 31, this.f114646c), 31, this.f114647d);
    }
}
