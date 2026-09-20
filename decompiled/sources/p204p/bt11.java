package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bt11 {

    /* JADX INFO: renamed from: a */
    public final String f30494a;

    /* JADX INFO: renamed from: b */
    public final String f30495b;

    /* JADX INFO: renamed from: c */
    public final String f30496c;

    /* JADX INFO: renamed from: d */
    public final boolean f30497d;

    public bt11(String str, String str2, String str3, boolean z) {
        this.f30494a = str;
        this.f30495b = str2;
        this.f30496c = str3;
        this.f30497d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt11)) {
            return false;
        }
        bt11 bt11Var = (bt11) obj;
        return wj50.m88271j(this.f30494a, bt11Var.f30494a) && wj50.m88271j(this.f30495b, bt11Var.f30495b) && wj50.m88271j(this.f30496c, bt11Var.f30496c) && this.f30497d == bt11Var.f30497d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30497d) + s571.m77243b(s571.m77243b(this.f30494a.hashCode() * 31, 31, this.f30495b), 31, this.f30496c);
    }
}
