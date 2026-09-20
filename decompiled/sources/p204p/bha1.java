package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bha1 {

    /* JADX INFO: renamed from: a */
    public final gha1 f27129a;

    /* JADX INFO: renamed from: b */
    public final boolean f27130b;

    public bha1(gha1 gha1Var, boolean z) {
        this.f27129a = gha1Var;
        this.f27130b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bha1)) {
            return false;
        }
        bha1 bha1Var = (bha1) obj;
        return wj50.m88271j(this.f27129a, bha1Var.f27129a) && this.f27130b == bha1Var.f27130b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27130b) + (this.f27129a.hashCode() * 31);
    }
}
