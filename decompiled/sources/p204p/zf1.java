package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zf1 {

    /* JADX INFO: renamed from: a */
    public final String f282175a;

    /* JADX INFO: renamed from: b */
    public final String f282176b;

    /* JADX INFO: renamed from: c */
    public final String f282177c;

    public zf1(String str, String str2, String str3) {
        this.f282175a = str;
        this.f282176b = str2;
        this.f282177c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf1)) {
            return false;
        }
        zf1 zf1Var = (zf1) obj;
        return wj50.m88271j(this.f282175a, zf1Var.f282175a) && wj50.m88271j(this.f282176b, zf1Var.f282176b) && wj50.m88271j(this.f282177c, zf1Var.f282177c);
    }

    public final int hashCode() {
        return this.f282177c.hashCode() + s571.m77243b(this.f282175a.hashCode() * 31, 31, this.f282176b);
    }
}
