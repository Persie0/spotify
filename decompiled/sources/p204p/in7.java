package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class in7 {

    /* JADX INFO: renamed from: a */
    public final String f103880a;

    /* JADX INFO: renamed from: b */
    public final String f103881b;

    /* JADX INFO: renamed from: c */
    public final String f103882c;

    /* JADX INFO: renamed from: d */
    public final String f103883d;

    /* JADX INFO: renamed from: e */
    public final int f103884e;

    public in7(int i, String str, String str2, String str3, String str4) {
        this.f103880a = str;
        this.f103881b = str2;
        this.f103882c = str3;
        this.f103883d = str4;
        this.f103884e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in7)) {
            return false;
        }
        in7 in7Var = (in7) obj;
        return wj50.m88271j(this.f103880a, in7Var.f103880a) && wj50.m88271j(this.f103881b, in7Var.f103881b) && wj50.m88271j(this.f103882c, in7Var.f103882c) && wj50.m88271j(this.f103883d, in7Var.f103883d) && this.f103884e == in7Var.f103884e;
    }

    public final int hashCode() {
        String str = this.f103880a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f103881b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f103882c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f103883d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        int i = this.f103884e;
        return iHashCode4 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
