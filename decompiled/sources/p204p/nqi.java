package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nqi implements rqi {

    /* JADX INFO: renamed from: a */
    public final xfr f157280a;

    /* JADX INFO: renamed from: b */
    public final boolean f157281b;

    /* JADX INFO: renamed from: c */
    public final yx61 f157282c;

    /* JADX INFO: renamed from: d */
    public final boolean f157283d;

    /* JADX INFO: renamed from: e */
    public final j8t0 f157284e;

    public nqi(xfr xfrVar, boolean z, yx61 yx61Var, boolean z2, j8t0 j8t0Var) {
        this.f157280a = xfrVar;
        this.f157281b = z;
        this.f157282c = yx61Var;
        this.f157283d = z2;
        this.f157284e = j8t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqi)) {
            return false;
        }
        nqi nqiVar = (nqi) obj;
        return this.f157280a == nqiVar.f157280a && this.f157281b == nqiVar.f157281b && this.f157282c == nqiVar.f157282c && this.f157283d == nqiVar.f157283d && this.f157284e == nqiVar.f157284e;
    }

    public final int hashCode() {
        return this.f157284e.hashCode() + s571.m77245d(s571.m77245d((this.f157282c.hashCode() + s571.m77245d(this.f157280a.hashCode() * 31, 31, this.f157281b)) * 31, 31, false), 31, this.f157283d);
    }
}
