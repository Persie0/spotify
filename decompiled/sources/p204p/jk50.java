package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jk50 implements lk50 {

    /* JADX INFO: renamed from: a */
    public final String f113215a;

    /* JADX INFO: renamed from: b */
    public final String f113216b;

    /* JADX INFO: renamed from: c */
    public final String f113217c;

    public jk50(String str, String str2, String str3) {
        this.f113215a = str;
        this.f113216b = str2;
        this.f113217c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk50)) {
            return false;
        }
        jk50 jk50Var = (jk50) obj;
        return wj50.m88271j(this.f113215a, jk50Var.f113215a) && wj50.m88271j(this.f113216b, jk50Var.f113216b) && wj50.m88271j(this.f113217c, jk50Var.f113217c);
    }

    public final int hashCode() {
        int iHashCode = this.f113215a.hashCode() * 31;
        String str = this.f113216b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f113217c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
