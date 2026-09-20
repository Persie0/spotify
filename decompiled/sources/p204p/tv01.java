package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tv01 {

    /* JADX INFO: renamed from: a */
    public final String f224020a;

    /* JADX INFO: renamed from: b */
    public final String f224021b;

    /* JADX INFO: renamed from: c */
    public final String f224022c;

    public /* synthetic */ tv01(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv01)) {
            return false;
        }
        tv01 tv01Var = (tv01) obj;
        return wj50.m88271j(this.f224020a, tv01Var.f224020a) && wj50.m88271j(this.f224021b, tv01Var.f224021b) && wj50.m88271j(this.f224022c, tv01Var.f224022c);
    }

    public final int hashCode() {
        int iHashCode = this.f224020a.hashCode() * 31;
        String str = this.f224021b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f224022c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public tv01(String str, String str2, String str3) {
        this.f224020a = str;
        this.f224021b = str2;
        this.f224022c = str3;
    }
}
