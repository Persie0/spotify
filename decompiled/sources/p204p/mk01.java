package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mk01 {

    /* JADX INFO: renamed from: a */
    public final hk01 f144464a;

    /* JADX INFO: renamed from: b */
    public final uqg1 f144465b;

    /* JADX INFO: renamed from: c */
    public final int f144466c;

    /* JADX INFO: renamed from: d */
    public final boolean f144467d;

    public mk01(hk01 hk01Var, uqg1 uqg1Var, int i, boolean z) {
        this.f144464a = hk01Var;
        this.f144465b = uqg1Var;
        this.f144466c = i;
        this.f144467d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk01)) {
            return false;
        }
        mk01 mk01Var = (mk01) obj;
        return this.f144464a.equals(mk01Var.f144464a) && this.f144465b.equals(mk01Var.f144465b) && this.f144466c == mk01Var.f144466c && this.f144467d == mk01Var.f144467d;
    }

    public final int hashCode() {
        int iHashCode = (this.f144465b.hashCode() + (this.f144464a.hashCode() * 31)) * 31;
        int i = this.f144466c;
        return Boolean.hashCode(this.f144467d) + ((iHashCode + (i == 0 ? 0 : edb.m38547C(i))) * 31);
    }
}
