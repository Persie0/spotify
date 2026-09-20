package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lzv0 {

    /* JADX INFO: renamed from: a */
    public final String f138458a;

    /* JADX INFO: renamed from: b */
    public final String f138459b;

    /* JADX INFO: renamed from: c */
    public final String f138460c;

    /* JADX INFO: renamed from: d */
    public final String f138461d;

    public lzv0(String str, String str2, String str3, String str4) {
        this.f138458a = str;
        this.f138459b = str2;
        this.f138460c = str3;
        this.f138461d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzv0)) {
            return false;
        }
        lzv0 lzv0Var = (lzv0) obj;
        return wj50.m88271j(this.f138458a, lzv0Var.f138458a) && wj50.m88271j(this.f138459b, lzv0Var.f138459b) && wj50.m88271j(this.f138460c, lzv0Var.f138460c) && wj50.m88271j(this.f138461d, lzv0Var.f138461d);
    }

    public final int hashCode() {
        return this.f138461d.hashCode() + s571.m77243b(s571.m77243b(this.f138458a.hashCode() * 31, 31, this.f138459b), 31, this.f138460c);
    }
}
