package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lq40 implements nq40 {

    /* JADX INFO: renamed from: a */
    public final int f135944a;

    /* JADX INFO: renamed from: b */
    public final Integer f135945b;

    public lq40(int i, Integer num) {
        this.f135944a = i;
        this.f135945b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq40)) {
            return false;
        }
        lq40 lq40Var = (lq40) obj;
        return this.f135944a == lq40Var.f135944a && this.f135945b.equals(lq40Var.f135945b);
    }

    public final int hashCode() {
        return this.f135945b.hashCode() + (edb.m38547C(this.f135944a) * 31);
    }
}
