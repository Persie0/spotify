package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bkj0 {

    /* JADX INFO: renamed from: a */
    public final int f27938a;

    /* JADX INFO: renamed from: b */
    public final d0w f27939b;

    public bkj0(int i, d0w d0wVar) {
        this.f27938a = i;
        this.f27939b = d0wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkj0)) {
            return false;
        }
        bkj0 bkj0Var = (bkj0) obj;
        return this.f27938a == bkj0Var.f27938a && this.f27939b.equals(bkj0Var.f27939b);
    }

    public final int hashCode() {
        return this.f27939b.hashCode() + (edb.m38547C(this.f27938a) * 31);
    }
}
