package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lx21 {

    /* JADX INFO: renamed from: a */
    public final boolean f137701a;

    /* JADX INFO: renamed from: b */
    public final boolean f137702b;

    /* JADX INFO: renamed from: c */
    public final boolean f137703c;

    /* JADX INFO: renamed from: d */
    public final ame f137704d;

    public lx21(boolean z, boolean z2, boolean z3, ame ameVar) {
        this.f137701a = z;
        this.f137702b = z2;
        this.f137703c = z3;
        this.f137704d = ameVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m60160a() {
        return this.f137701a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m60161b() {
        return this.f137703c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m60162c() {
        return this.f137702b;
    }

    /* JADX INFO: renamed from: d */
    public final ame m60163d() {
        return this.f137704d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx21)) {
            return false;
        }
        lx21 lx21Var = (lx21) obj;
        return this.f137701a == lx21Var.f137701a && this.f137702b == lx21Var.f137702b && this.f137703c == lx21Var.f137703c && this.f137704d == lx21Var.f137704d;
    }

    public final int hashCode() {
        return this.f137704d.hashCode() + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f137701a) * 31, 31, this.f137702b), 31, this.f137703c);
    }
}
