package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oh90 {

    /* JADX INFO: renamed from: a */
    public final String f165377a;

    /* JADX INFO: renamed from: b */
    public final lba0 f165378b;

    /* JADX INFO: renamed from: c */
    public final String f165379c;

    /* JADX INFO: renamed from: d */
    public final String f165380d;

    /* JADX INFO: renamed from: e */
    public final int f165381e;

    public oh90(String str, lba0 lba0Var, String str2, String str3, int i) {
        this.f165377a = str;
        this.f165378b = lba0Var;
        this.f165379c = str2;
        this.f165380d = str3;
        this.f165381e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh90)) {
            return false;
        }
        oh90 oh90Var = (oh90) obj;
        return wj50.m88271j(this.f165377a, oh90Var.f165377a) && wj50.m88271j(this.f165378b, oh90Var.f165378b) && wj50.m88271j(this.f165379c, oh90Var.f165379c) && wj50.m88271j(this.f165380d, oh90Var.f165380d) && this.f165381e == oh90Var.f165381e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f165378b.hashCode() + (this.f165377a.hashCode() * 31)) * 31, 31, this.f165379c);
        String str = this.f165380d;
        return Integer.hashCode(this.f165381e) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
