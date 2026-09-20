package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final mk00 f98522a;

    /* JADX INFO: renamed from: b */
    public final mk00 f98523b;

    /* JADX INFO: renamed from: c */
    public final int f98524c;

    public i4g0(mk00 mk00Var, mk00 mk00Var2, int i) {
        this.f98522a = mk00Var;
        this.f98523b = mk00Var2;
        this.f98524c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4g0)) {
            return false;
        }
        i4g0 i4g0Var = (i4g0) obj;
        return wj50.m88271j(this.f98522a, i4g0Var.f98522a) && wj50.m88271j(this.f98523b, i4g0Var.f98523b) && this.f98524c == i4g0Var.f98524c;
    }

    public final int hashCode() {
        mk00 mk00Var = this.f98522a;
        int iHashCode = (mk00Var == null ? 0 : mk00Var.hashCode()) * 31;
        mk00 mk00Var2 = this.f98523b;
        return Integer.hashCode(this.f98524c) + ((iHashCode + (mk00Var2 != null ? mk00Var2.hashCode() : 0)) * 31);
    }
}
