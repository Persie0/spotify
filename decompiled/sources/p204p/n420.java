package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n420 {

    /* JADX INFO: renamed from: a */
    public final String f150173a;

    /* JADX INFO: renamed from: b */
    public final String f150174b;

    /* JADX INFO: renamed from: c */
    public final String f150175c;

    /* JADX INFO: renamed from: d */
    public final String f150176d;

    public n420(String str, String str2, String str3, String str4) {
        this.f150173a = str;
        this.f150174b = str2;
        this.f150175c = str3;
        this.f150176d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n420)) {
            return false;
        }
        n420 n420Var = (n420) obj;
        return wj50.m88271j(this.f150173a, n420Var.f150173a) && wj50.m88271j(this.f150174b, n420Var.f150174b) && wj50.m88271j(this.f150175c, n420Var.f150175c) && wj50.m88271j(this.f150176d, n420Var.f150176d);
    }

    public final int hashCode() {
        int iHashCode = this.f150173a.hashCode() * 31;
        String str = this.f150174b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f150175c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f150176d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
