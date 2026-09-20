package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jn90 extends kn90 {

    /* JADX INFO: renamed from: a */
    public final jxk f114046a;

    /* JADX INFO: renamed from: b */
    public final wn90 f114047b;

    /* JADX INFO: renamed from: c */
    public final uwi f114048c;

    /* JADX INFO: renamed from: d */
    public final oak0 f114049d;

    /* JADX INFO: renamed from: e */
    public final boolean f114050e;

    public jn90(jxk jxkVar, wn90 wn90Var, uwi uwiVar, oak0 oak0Var, boolean z) {
        this.f114046a = jxkVar;
        this.f114047b = wn90Var;
        this.f114048c = uwiVar;
        this.f114049d = oak0Var;
        this.f114050e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn90)) {
            return false;
        }
        jn90 jn90Var = (jn90) obj;
        return wj50.m88271j(this.f114046a, jn90Var.f114046a) && wj50.m88271j(this.f114047b, jn90Var.f114047b) && wj50.m88271j(this.f114048c, jn90Var.f114048c) && wj50.m88271j(this.f114049d, jn90Var.f114049d) && this.f114050e == jn90Var.f114050e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114050e) + ((this.f114049d.hashCode() + ((this.f114048c.hashCode() + ((this.f114047b.hashCode() + (this.f114046a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
