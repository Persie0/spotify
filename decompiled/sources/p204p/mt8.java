package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mt8 {

    /* JADX INFO: renamed from: a */
    public final String f146981a;

    /* JADX INFO: renamed from: b */
    public final String f146982b;

    /* JADX INFO: renamed from: c */
    public final String f146983c;

    /* JADX INFO: renamed from: d */
    public final String f146984d;

    /* JADX INFO: renamed from: e */
    public final String f146985e;

    public mt8(String str, String str2, String str3, String str4, String str5) {
        this.f146981a = str;
        this.f146982b = str2;
        this.f146983c = str3;
        this.f146984d = str4;
        this.f146985e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt8)) {
            return false;
        }
        mt8 mt8Var = (mt8) obj;
        return wj50.m88271j(this.f146981a, mt8Var.f146981a) && wj50.m88271j(this.f146982b, mt8Var.f146982b) && wj50.m88271j(this.f146983c, mt8Var.f146983c) && wj50.m88271j(this.f146984d, mt8Var.f146984d) && wj50.m88271j(this.f146985e, mt8Var.f146985e);
    }

    public final int hashCode() {
        return this.f146985e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f146981a.hashCode() * 31, 31, this.f146982b), 31, this.f146983c), 31, this.f146984d);
    }
}
