package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v520 {

    /* JADX INFO: renamed from: a */
    public final String f237294a;

    /* JADX INFO: renamed from: b */
    public final String f237295b;

    /* JADX INFO: renamed from: c */
    public final String f237296c;

    /* JADX INFO: renamed from: d */
    public final String f237297d;

    /* JADX INFO: renamed from: e */
    public final int f237298e;

    public v520(int i, String str, String str2, String str3, String str4) {
        this.f237294a = str;
        this.f237295b = str2;
        this.f237296c = str3;
        this.f237297d = str4;
        this.f237298e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v520)) {
            return false;
        }
        v520 v520Var = (v520) obj;
        return wj50.m88271j(this.f237294a, v520Var.f237294a) && wj50.m88271j(this.f237295b, v520Var.f237295b) && wj50.m88271j(this.f237296c, v520Var.f237296c) && wj50.m88271j(this.f237297d, v520Var.f237297d) && this.f237298e == v520Var.f237298e;
    }

    public final int hashCode() {
        String str = this.f237294a;
        return Integer.hashCode(this.f237298e) + s571.m77243b(s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f237295b), 31, this.f237296c), 31, this.f237297d);
    }
}
