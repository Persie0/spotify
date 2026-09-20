package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xg3 extends yg3 {

    /* JADX INFO: renamed from: a */
    public final String f261189a;

    /* JADX INFO: renamed from: b */
    public final String f261190b;

    /* JADX INFO: renamed from: c */
    public final bh3 f261191c;

    public xg3(String str, String str2, bh3 bh3Var) {
        this.f261189a = str;
        this.f261190b = str2;
        this.f261191c = bh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg3)) {
            return false;
        }
        xg3 xg3Var = (xg3) obj;
        return wj50.m88271j(this.f261189a, xg3Var.f261189a) && wj50.m88271j(this.f261190b, xg3Var.f261190b) && wj50.m88271j(this.f261191c, xg3Var.f261191c);
    }

    public final int hashCode() {
        int iHashCode = this.f261189a.hashCode() * 31;
        String str = this.f261190b;
        return this.f261191c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
