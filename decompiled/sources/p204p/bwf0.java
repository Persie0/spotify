package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bwf0 {

    /* JADX INFO: renamed from: a */
    public final zvf0 f31644a;

    /* JADX INFO: renamed from: b */
    public final boolean f31645b;

    /* JADX INFO: renamed from: c */
    public final boolean f31646c;

    /* JADX INFO: renamed from: d */
    public final boolean f31647d;

    /* JADX INFO: renamed from: e */
    public final boolean f31648e;

    public bwf0(zvf0 zvf0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31644a = zvf0Var;
        this.f31645b = z;
        this.f31646c = z2;
        this.f31647d = z3;
        this.f31648e = z4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30685a() {
        return this.f31648e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m30686b() {
        return this.f31645b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m30687c() {
        return this.f31646c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwf0)) {
            return false;
        }
        bwf0 bwf0Var = (bwf0) obj;
        return wj50.m88271j(this.f31644a, bwf0Var.f31644a) && this.f31645b == bwf0Var.f31645b && this.f31646c == bwf0Var.f31646c && this.f31647d == bwf0Var.f31647d && this.f31648e == bwf0Var.f31648e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31648e) + s571.m77245d(s571.m77245d(s571.m77245d(this.f31644a.hashCode() * 31, 31, this.f31645b), 31, this.f31646c), 31, this.f31647d);
    }
}
