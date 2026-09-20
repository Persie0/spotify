package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nx5 {

    /* JADX INFO: renamed from: a */
    public final String f159364a;

    /* JADX INFO: renamed from: b */
    public final String f159365b;

    /* JADX INFO: renamed from: c */
    public final String f159366c;

    /* JADX INFO: renamed from: d */
    public final String f159367d;

    public nx5(String str, String str2, String str3, String str4) {
        this.f159364a = str;
        this.f159365b = str2;
        this.f159366c = str3;
        this.f159367d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx5)) {
            return false;
        }
        nx5 nx5Var = (nx5) obj;
        return wj50.m88271j(this.f159364a, nx5Var.f159364a) && wj50.m88271j(this.f159365b, nx5Var.f159365b) && wj50.m88271j(this.f159366c, nx5Var.f159366c) && wj50.m88271j(this.f159367d, nx5Var.f159367d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f159364a.hashCode() * 31, 31, this.f159365b), 31, this.f159366c);
        String str = this.f159367d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
