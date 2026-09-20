package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a281 {

    /* JADX INFO: renamed from: a */
    public final String f11596a;

    /* JADX INFO: renamed from: b */
    public final String f11597b;

    /* JADX INFO: renamed from: c */
    public final String f11598c;

    /* JADX INFO: renamed from: d */
    public final String f11599d;

    /* JADX INFO: renamed from: e */
    public final String f11600e;

    public a281(String str, String str2, String str3, String str4, String str5) {
        this.f11596a = str;
        this.f11597b = str2;
        this.f11598c = str3;
        this.f11599d = str4;
        this.f11600e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a281)) {
            return false;
        }
        a281 a281Var = (a281) obj;
        return wj50.m88271j(this.f11596a, a281Var.f11596a) && wj50.m88271j(this.f11597b, a281Var.f11597b) && wj50.m88271j(this.f11598c, a281Var.f11598c) && wj50.m88271j(this.f11599d, a281Var.f11599d) && wj50.m88271j(this.f11600e, a281Var.f11600e);
    }

    public final int hashCode() {
        return this.f11600e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f11596a.hashCode() * 31, 31, this.f11597b), 31, this.f11598c), 31, this.f11599d);
    }
}
