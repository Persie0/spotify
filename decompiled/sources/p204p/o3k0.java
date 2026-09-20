package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o3k0 extends t3k0 {

    /* JADX INFO: renamed from: a */
    public final String f161402a;

    /* JADX INFO: renamed from: b */
    public final String f161403b;

    /* JADX INFO: renamed from: c */
    public final String f161404c;

    /* JADX INFO: renamed from: d */
    public final String f161405d;

    /* JADX INFO: renamed from: e */
    public final String f161406e;

    public o3k0(String str, String str2, String str3, String str4, String str5) {
        this.f161402a = str;
        this.f161403b = str2;
        this.f161404c = str3;
        this.f161405d = str4;
        this.f161406e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3k0)) {
            return false;
        }
        o3k0 o3k0Var = (o3k0) obj;
        return wj50.m88271j(this.f161402a, o3k0Var.f161402a) && wj50.m88271j(this.f161403b, o3k0Var.f161403b) && wj50.m88271j(this.f161404c, o3k0Var.f161404c) && wj50.m88271j(this.f161405d, o3k0Var.f161405d) && wj50.m88271j(this.f161406e, o3k0Var.f161406e);
    }

    public final int hashCode() {
        String str = this.f161402a;
        return this.f161406e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f161403b), 31, this.f161404c), 31, this.f161405d);
    }
}
