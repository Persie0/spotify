package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class op71 {

    /* JADX INFO: renamed from: a */
    public final int f167804a;

    /* JADX INFO: renamed from: b */
    public final int f167805b;

    /* JADX INFO: renamed from: c */
    public final String f167806c;

    /* JADX INFO: renamed from: d */
    public final String f167807d;

    public op71(int i, String str, int i2, String str2) {
        this.f167804a = i;
        this.f167805b = i2;
        this.f167806c = str;
        this.f167807d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op71)) {
            return false;
        }
        op71 op71Var = (op71) obj;
        return this.f167804a == op71Var.f167804a && this.f167805b == op71Var.f167805b && wj50.m88271j(this.f167806c, op71Var.f167806c) && wj50.m88271j(this.f167807d, op71Var.f167807d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f167805b, Integer.hashCode(this.f167804a) * 31, 31);
        String str = this.f167806c;
        int iHashCode = (iM62800g + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167807d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
