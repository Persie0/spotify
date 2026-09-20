package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class afo0 {

    /* JADX INFO: renamed from: a */
    public final String f15187a;

    /* JADX INFO: renamed from: b */
    public final String f15188b;

    /* JADX INFO: renamed from: c */
    public final String f15189c;

    /* JADX INFO: renamed from: d */
    public final int f15190d;

    public afo0(String str, String str2, int i, String str3) {
        this.f15187a = str;
        this.f15188b = str2;
        this.f15189c = str3;
        this.f15190d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afo0)) {
            return false;
        }
        afo0 afo0Var = (afo0) obj;
        return wj50.m88271j(this.f15187a, afo0Var.f15187a) && wj50.m88271j(this.f15188b, afo0Var.f15188b) && wj50.m88271j(this.f15189c, afo0Var.f15189c) && this.f15190d == afo0Var.f15190d;
    }

    public final int hashCode() {
        String str = this.f15187a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f15188b);
        String str2 = this.f15189c;
        return Integer.hashCode(this.f15190d) + ((iM77243b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
