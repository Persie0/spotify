package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rjo0 implements vjo0 {

    /* JADX INFO: renamed from: a */
    public final int f199876a;

    /* JADX INFO: renamed from: b */
    public final Throwable f199877b;

    public rjo0(int i, Throwable th) {
        this.f199876a = i;
        this.f199877b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjo0)) {
            return false;
        }
        rjo0 rjo0Var = (rjo0) obj;
        return this.f199876a == rjo0Var.f199876a && wj50.m88271j(this.f199877b, rjo0Var.f199877b);
    }

    public final int hashCode() {
        return this.f199877b.hashCode() + (Integer.hashCode(this.f199876a) * 31);
    }
}
