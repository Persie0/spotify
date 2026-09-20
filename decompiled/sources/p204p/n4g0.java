package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final hg60 f150335a;

    /* JADX INFO: renamed from: b */
    public final int f150336b;

    public n4g0(hg60 hg60Var, int i) {
        this.f150335a = hg60Var;
        this.f150336b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4g0)) {
            return false;
        }
        n4g0 n4g0Var = (n4g0) obj;
        return this.f150335a == n4g0Var.f150335a && this.f150336b == n4g0Var.f150336b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150336b) + (this.f150335a.hashCode() * 31);
    }
}
