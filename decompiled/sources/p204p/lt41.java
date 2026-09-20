package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lt41 extends ov41 {

    /* JADX INFO: renamed from: a */
    public final String f136695a;

    /* JADX INFO: renamed from: b */
    public final String f136696b;

    /* JADX INFO: renamed from: c */
    public final String f136697c;

    /* JADX INFO: renamed from: d */
    public final String f136698d;

    /* JADX INFO: renamed from: e */
    public final String f136699e;

    public lt41(String str, String str2, String str3, String str4, String str5) {
        this.f136695a = str;
        this.f136696b = str2;
        this.f136697c = str3;
        this.f136698d = str4;
        this.f136699e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt41)) {
            return false;
        }
        lt41 lt41Var = (lt41) obj;
        return wj50.m88271j(this.f136695a, lt41Var.f136695a) && wj50.m88271j(this.f136696b, lt41Var.f136696b) && wj50.m88271j(this.f136697c, lt41Var.f136697c) && wj50.m88271j(this.f136698d, lt41Var.f136698d) && wj50.m88271j(this.f136699e, lt41Var.f136699e);
    }

    public final int hashCode() {
        int iHashCode = this.f136695a.hashCode() * 31;
        String str = this.f136696b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f136697c;
        int iM77243b = s571.m77243b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f136698d);
        String str3 = this.f136699e;
        return iM77243b + (str3 != null ? str3.hashCode() : 0);
    }
}
