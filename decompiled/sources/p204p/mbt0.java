package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mbt0 extends qbt0 {

    /* JADX INFO: renamed from: a */
    public final jp20 f141967a;

    /* JADX INFO: renamed from: b */
    public final boolean f141968b;

    public mbt0(jp20 jp20Var, boolean z) {
        this.f141967a = jp20Var;
        this.f141968b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbt0)) {
            return false;
        }
        mbt0 mbt0Var = (mbt0) obj;
        return wj50.m88271j(this.f141967a, mbt0Var.f141967a) && this.f141968b == mbt0Var.f141968b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141968b) + (this.f141967a.hashCode() * 31);
    }
}
