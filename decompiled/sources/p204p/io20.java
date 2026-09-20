package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class io20 {

    /* JADX INFO: renamed from: a */
    public final String f104104a;

    /* JADX INFO: renamed from: b */
    public final String f104105b;

    /* JADX INFO: renamed from: c */
    public final String f104106c;

    /* JADX INFO: renamed from: d */
    public final boolean f104107d;

    public io20(String str, String str2, String str3, boolean z) {
        this.f104104a = str;
        this.f104105b = str2;
        this.f104106c = str3;
        this.f104107d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io20)) {
            return false;
        }
        io20 io20Var = (io20) obj;
        return wj50.m88271j(this.f104104a, io20Var.f104104a) && wj50.m88271j(this.f104105b, io20Var.f104105b) && wj50.m88271j(this.f104106c, io20Var.f104106c) && this.f104107d == io20Var.f104107d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104107d) + s571.m77243b(s571.m77243b(this.f104104a.hashCode() * 31, 31, this.f104105b), 31, this.f104106c);
    }
}
