package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u650 extends mag1 {

    /* JADX INFO: renamed from: d */
    public final int f227225d;

    /* JADX INFO: renamed from: e */
    public final int f227226e;

    public u650(int i, int i2) {
        this.f227225d = i;
        this.f227226e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u650)) {
            return false;
        }
        u650 u650Var = (u650) obj;
        return this.f227225d == u650Var.f227225d && this.f227226e == u650Var.f227226e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f227226e) + (edb.m38547C(this.f227225d) * 31);
    }
}
