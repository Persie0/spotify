package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zqr0 {

    /* JADX INFO: renamed from: a */
    public final Integer f285439a;

    /* JADX INFO: renamed from: b */
    public final String f285440b;

    /* JADX INFO: renamed from: c */
    public final String f285441c;

    /* JADX INFO: renamed from: d */
    public final String f285442d;

    /* JADX INFO: renamed from: e */
    public final String f285443e;

    /* JADX INFO: renamed from: f */
    public final boolean f285444f;

    /* JADX INFO: renamed from: g */
    public final String f285445g;

    public zqr0(Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f285439a = num;
        this.f285440b = str;
        this.f285441c = str2;
        this.f285442d = str3;
        this.f285443e = str4;
        this.f285444f = z;
        this.f285445g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqr0)) {
            return false;
        }
        zqr0 zqr0Var = (zqr0) obj;
        return wj50.m88271j(this.f285439a, zqr0Var.f285439a) && wj50.m88271j(this.f285440b, zqr0Var.f285440b) && wj50.m88271j(this.f285441c, zqr0Var.f285441c) && wj50.m88271j(this.f285442d, zqr0Var.f285442d) && wj50.m88271j(this.f285443e, zqr0Var.f285443e) && this.f285444f == zqr0Var.f285444f && wj50.m88271j(this.f285445g, zqr0Var.f285445g);
    }

    public final int hashCode() {
        Integer num = this.f285439a;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b((num == null ? 0 : num.hashCode()) * 31, 31, this.f285440b), 31, this.f285441c), 31, this.f285442d);
        String str = this.f285443e;
        return this.f285445g.hashCode() + s571.m77245d((iM77243b + (str != null ? str.hashCode() : 0)) * 31, 31, this.f285444f);
    }
}
