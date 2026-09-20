package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lob1 {

    /* JADX INFO: renamed from: a */
    public final String f135377a;

    /* JADX INFO: renamed from: b */
    public final int f135378b;

    public lob1(String str, int i) {
        this.f135377a = str;
        this.f135378b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lob1)) {
            return false;
        }
        lob1 lob1Var = (lob1) obj;
        return this.f135377a.equals(lob1Var.f135377a) && this.f135378b == lob1Var.f135378b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f135378b) + (this.f135377a.hashCode() * 31);
    }
}
