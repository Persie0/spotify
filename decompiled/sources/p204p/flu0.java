package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class flu0 {

    /* JADX INFO: renamed from: a */
    public final String f70872a;

    /* JADX INFO: renamed from: b */
    public final String f70873b;

    /* JADX INFO: renamed from: c */
    public final String f70874c;

    /* JADX INFO: renamed from: d */
    public final Integer f70875d;

    public flu0(String str, String str2, Integer num, String str3) {
        this.f70872a = str;
        this.f70873b = str2;
        this.f70874c = str3;
        this.f70875d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flu0)) {
            return false;
        }
        flu0 flu0Var = (flu0) obj;
        return wj50.m88271j(this.f70872a, flu0Var.f70872a) && wj50.m88271j(this.f70873b, flu0Var.f70873b) && wj50.m88271j(this.f70874c, flu0Var.f70874c) && wj50.m88271j(this.f70875d, flu0Var.f70875d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f70872a.hashCode() * 31, 31, this.f70873b);
        String str = this.f70874c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f70875d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
