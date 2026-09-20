package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jzt0 {

    /* JADX INFO: renamed from: a */
    public final String f117789a;

    /* JADX INFO: renamed from: b */
    public final String f117790b;

    /* JADX INFO: renamed from: c */
    public final String f117791c;

    public jzt0(String str, String str2, String str3) {
        this.f117789a = str;
        this.f117790b = str2;
        this.f117791c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzt0)) {
            return false;
        }
        jzt0 jzt0Var = (jzt0) obj;
        return wj50.m88271j(this.f117789a, jzt0Var.f117789a) && wj50.m88271j(this.f117790b, jzt0Var.f117790b) && wj50.m88271j(this.f117791c, jzt0Var.f117791c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f117789a.hashCode() * 31, 31, this.f117790b);
        String str = this.f117791c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
