package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cmq0 {

    /* JADX INFO: renamed from: a */
    public final smq0 f39762a;

    /* JADX INFO: renamed from: b */
    public final int f39763b;

    public cmq0(smq0 smq0Var, int i) {
        this.f39762a = smq0Var;
        this.f39763b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmq0)) {
            return false;
        }
        cmq0 cmq0Var = (cmq0) obj;
        return wj50.m88271j(this.f39762a, cmq0Var.f39762a) && this.f39763b == cmq0Var.f39763b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39763b) + (this.f39762a.hashCode() * 31);
    }
}
