package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j53 {

    /* JADX INFO: renamed from: a */
    public final String f108845a;

    /* JADX INFO: renamed from: b */
    public final String f108846b;

    /* JADX INFO: renamed from: c */
    public final String f108847c;

    /* JADX INFO: renamed from: d */
    public final boolean f108848d;

    /* JADX INFO: renamed from: e */
    public final boolean f108849e;

    public j53(String str, String str2, String str3, boolean z, boolean z2) {
        this.f108845a = str;
        this.f108846b = str2;
        this.f108847c = str3;
        this.f108848d = z;
        this.f108849e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j53)) {
            return false;
        }
        j53 j53Var = (j53) obj;
        return wj50.m88271j(this.f108845a, j53Var.f108845a) && wj50.m88271j(this.f108846b, j53Var.f108846b) && wj50.m88271j(this.f108847c, j53Var.f108847c) && this.f108848d == j53Var.f108848d && this.f108849e == j53Var.f108849e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f108845a.hashCode() * 31, 31, this.f108846b);
        String str = this.f108847c;
        return Boolean.hashCode(this.f108849e) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f108848d);
    }
}
