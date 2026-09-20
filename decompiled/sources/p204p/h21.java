package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h21 extends k21 {

    /* JADX INFO: renamed from: a */
    public final String f86841a;

    /* JADX INFO: renamed from: b */
    public final int f86842b;

    /* JADX INFO: renamed from: c */
    public final String f86843c;

    /* JADX INFO: renamed from: d */
    public final boolean f86844d;

    public h21(String str, int i, String str2, boolean z) {
        this.f86841a = str;
        this.f86842b = i;
        this.f86843c = str2;
        this.f86844d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h21)) {
            return false;
        }
        h21 h21Var = (h21) obj;
        return wj50.m88271j(this.f86841a, h21Var.f86841a) && this.f86842b == h21Var.f86842b && wj50.m88271j(this.f86843c, h21Var.f86843c) && this.f86844d == h21Var.f86844d;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f86842b, this.f86841a.hashCode() * 31, 31);
        String str = this.f86843c;
        return Boolean.hashCode(this.f86844d) + ((iM62800g + (str == null ? 0 : str.hashCode())) * 31);
    }
}
