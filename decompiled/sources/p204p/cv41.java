package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cv41 {

    /* JADX INFO: renamed from: a */
    public final p5a0 f42292a;

    /* JADX INFO: renamed from: b */
    public final boolean f42293b;

    /* JADX INFO: renamed from: c */
    public final boolean f42294c;

    /* JADX INFO: renamed from: d */
    public final int f42295d;

    /* JADX INFO: renamed from: e */
    public final boolean f42296e;

    public /* synthetic */ cv41(p5a0 p5a0Var) {
        this(p5a0Var, true, false, 3, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv41)) {
            return false;
        }
        cv41 cv41Var = (cv41) obj;
        return wj50.m88271j(this.f42292a, cv41Var.f42292a) && this.f42293b == cv41Var.f42293b && this.f42294c == cv41Var.f42294c && this.f42295d == cv41Var.f42295d && this.f42296e == cv41Var.f42296e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42296e) + f710.m40938f(this.f42295d, s571.m77245d(s571.m77245d(this.f42292a.hashCode() * 31, 31, this.f42293b), 31, this.f42294c), 31);
    }

    public cv41(p5a0 p5a0Var, boolean z, boolean z2, int i, boolean z3) {
        this.f42292a = p5a0Var;
        this.f42293b = z;
        this.f42294c = z2;
        this.f42295d = i;
        this.f42296e = z3;
    }
}
