package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nos0 implements oos0 {

    /* JADX INFO: renamed from: a */
    public final cos0 f156788a;

    /* JADX INFO: renamed from: b */
    public final String f156789b;

    /* JADX INFO: renamed from: c */
    public final String f156790c;

    /* JADX INFO: renamed from: d */
    public final String f156791d;

    public nos0(cos0 cos0Var, String str, String str2, String str3) {
        this.f156788a = cos0Var;
        this.f156789b = str;
        this.f156790c = str2;
        this.f156791d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nos0)) {
            return false;
        }
        nos0 nos0Var = (nos0) obj;
        return this.f156788a.equals(nos0Var.f156788a) && wj50.m88271j(this.f156789b, nos0Var.f156789b) && wj50.m88271j(this.f156790c, nos0Var.f156790c) && wj50.m88271j(this.f156791d, nos0Var.f156791d);
    }

    public final int hashCode() {
        int iHashCode = this.f156788a.hashCode() * 31;
        String str = this.f156789b;
        int iM77243b = s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f156790c);
        String str2 = this.f156791d;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
