package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zs11 {

    /* JADX INFO: renamed from: a */
    public final String f285821a;

    /* JADX INFO: renamed from: b */
    public final String f285822b;

    /* JADX INFO: renamed from: c */
    public final String f285823c;

    public zs11(String str, String str2, String str3) {
        this.f285821a = str;
        this.f285822b = str2;
        this.f285823c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs11)) {
            return false;
        }
        zs11 zs11Var = (zs11) obj;
        return wj50.m88271j(this.f285821a, zs11Var.f285821a) && wj50.m88271j(this.f285822b, zs11Var.f285822b) && wj50.m88271j(this.f285823c, zs11Var.f285823c);
    }

    public final int hashCode() {
        return this.f285823c.hashCode() + s571.m77243b(this.f285821a.hashCode() * 31, 31, this.f285822b);
    }
}
