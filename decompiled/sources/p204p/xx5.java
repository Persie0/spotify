package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xx5 extends yx5 {

    /* JADX INFO: renamed from: a */
    public final String f266859a;

    /* JADX INFO: renamed from: b */
    public final String f266860b;

    /* JADX INFO: renamed from: c */
    public final String f266861c;

    /* JADX INFO: renamed from: d */
    public final String f266862d;

    public xx5(String str, String str2, String str3, String str4) {
        this.f266859a = str;
        this.f266860b = str2;
        this.f266861c = str3;
        this.f266862d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx5)) {
            return false;
        }
        xx5 xx5Var = (xx5) obj;
        return wj50.m88271j(this.f266859a, xx5Var.f266859a) && wj50.m88271j(this.f266860b, xx5Var.f266860b) && wj50.m88271j(this.f266861c, xx5Var.f266861c) && wj50.m88271j(this.f266862d, xx5Var.f266862d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f266859a.hashCode() * 31, 31, this.f266860b), 31, this.f266861c);
        String str = this.f266862d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
