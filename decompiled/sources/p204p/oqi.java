package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oqi implements rqi {

    /* JADX INFO: renamed from: a */
    public final xfr f168295a;

    /* JADX INFO: renamed from: b */
    public final boolean f168296b;

    /* JADX INFO: renamed from: c */
    public final yx61 f168297c;

    public oqi(xfr xfrVar, boolean z, yx61 yx61Var) {
        this.f168295a = xfrVar;
        this.f168296b = z;
        this.f168297c = yx61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqi)) {
            return false;
        }
        oqi oqiVar = (oqi) obj;
        return this.f168295a == oqiVar.f168295a && this.f168296b == oqiVar.f168296b && this.f168297c == oqiVar.f168297c;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f168295a.hashCode() * 31, 31, this.f168296b);
        yx61 yx61Var = this.f168297c;
        return iM77245d + (yx61Var == null ? 0 : yx61Var.hashCode());
    }
}
