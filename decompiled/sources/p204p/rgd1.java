package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rgd1 {

    /* JADX INFO: renamed from: a */
    public final String f198937a;

    /* JADX INFO: renamed from: b */
    public final String f198938b;

    /* JADX INFO: renamed from: c */
    public final String f198939c;

    /* JADX INFO: renamed from: d */
    public final String f198940d;

    /* JADX INFO: renamed from: e */
    public final String f198941e;

    public rgd1(String str, String str2, String str3, String str4, String str5) {
        this.f198937a = str;
        this.f198938b = str2;
        this.f198939c = str3;
        this.f198940d = str4;
        this.f198941e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgd1)) {
            return false;
        }
        rgd1 rgd1Var = (rgd1) obj;
        return wj50.m88271j(this.f198937a, rgd1Var.f198937a) && wj50.m88271j(this.f198938b, rgd1Var.f198938b) && wj50.m88271j(this.f198939c, rgd1Var.f198939c) && wj50.m88271j(this.f198940d, rgd1Var.f198940d) && wj50.m88271j(this.f198941e, rgd1Var.f198941e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f198937a.hashCode() * 31, 31, this.f198938b), 31, this.f198939c), 31, this.f198940d);
        String str = this.f198941e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
