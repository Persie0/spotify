package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o681 {

    /* JADX INFO: renamed from: a */
    public final String f162275a;

    /* JADX INFO: renamed from: b */
    public final String f162276b;

    /* JADX INFO: renamed from: c */
    public final String f162277c;

    /* JADX INFO: renamed from: d */
    public final String f162278d;

    /* JADX INFO: renamed from: e */
    public final long f162279e;

    public o681(String str, String str2, String str3, String str4, long j) {
        this.f162275a = str;
        this.f162276b = str2;
        this.f162277c = str3;
        this.f162278d = str4;
        this.f162279e = j;
    }

    /* JADX INFO: renamed from: a */
    public final String m66331a() {
        return this.f162277c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o681)) {
            return false;
        }
        o681 o681Var = (o681) obj;
        return wj50.m88271j(this.f162275a, o681Var.f162275a) && wj50.m88271j(this.f162276b, o681Var.f162276b) && wj50.m88271j(this.f162277c, o681Var.f162277c) && wj50.m88271j(this.f162278d, o681Var.f162278d) && this.f162279e == o681Var.f162279e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f162275a.hashCode() * 31, 31, this.f162276b);
        String str = this.f162277c;
        return Long.hashCode(this.f162279e) + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f162278d);
    }
}
