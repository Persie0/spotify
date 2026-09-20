package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kl6 {

    /* JADX INFO: renamed from: a */
    public final String f123803a;

    /* JADX INFO: renamed from: b */
    public final String f123804b;

    /* JADX INFO: renamed from: c */
    public final String f123805c;

    /* JADX INFO: renamed from: d */
    public final String f123806d;

    /* JADX INFO: renamed from: e */
    public final int f123807e;

    public kl6(int i, String str, String str2, String str3, String str4) {
        this.f123803a = str;
        this.f123804b = str2;
        this.f123805c = str3;
        this.f123806d = str4;
        this.f123807e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl6)) {
            return false;
        }
        kl6 kl6Var = (kl6) obj;
        return wj50.m88271j(this.f123803a, kl6Var.f123803a) && wj50.m88271j(this.f123804b, kl6Var.f123804b) && wj50.m88271j(this.f123805c, kl6Var.f123805c) && wj50.m88271j(this.f123806d, kl6Var.f123806d) && this.f123807e == kl6Var.f123807e;
    }

    public final int hashCode() {
        String str = this.f123803a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123804b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f123805c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f123806d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        int i = this.f123807e;
        return iHashCode4 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
