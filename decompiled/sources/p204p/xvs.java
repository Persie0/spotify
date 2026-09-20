package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xvs {

    /* JADX INFO: renamed from: a */
    public final p2x0 f266470a;

    /* JADX INFO: renamed from: b */
    public final boolean f266471b;

    /* JADX INFO: renamed from: c */
    public final uvf0 f266472c;

    /* JADX INFO: renamed from: d */
    public final boolean f266473d;

    public xvs(p2x0 p2x0Var, boolean z, uvf0 uvf0Var, boolean z2) {
        this.f266470a = p2x0Var;
        this.f266471b = z;
        this.f266472c = uvf0Var;
        this.f266473d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvs)) {
            return false;
        }
        xvs xvsVar = (xvs) obj;
        return wj50.m88271j(this.f266470a, xvsVar.f266470a) && this.f266471b == xvsVar.f266471b && wj50.m88271j(this.f266472c, xvsVar.f266472c) && this.f266473d == xvsVar.f266473d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266473d) + ((this.f266472c.hashCode() + s571.m77245d(this.f266470a.hashCode() * 31, 31, this.f266471b)) * 31);
    }
}
