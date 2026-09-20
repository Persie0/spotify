package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f27 {

    /* JADX INFO: renamed from: a */
    public final String f65121a;

    /* JADX INFO: renamed from: b */
    public final String f65122b;

    /* JADX INFO: renamed from: c */
    public final String f65123c;

    public f27(String str, String str2, String str3) {
        this.f65121a = str;
        this.f65122b = str2;
        this.f65123c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f27)) {
            return false;
        }
        f27 f27Var = (f27) obj;
        return wj50.m88271j(this.f65121a, f27Var.f65121a) && wj50.m88271j(this.f65122b, f27Var.f65122b) && wj50.m88271j(this.f65123c, f27Var.f65123c);
    }

    public final int hashCode() {
        int iHashCode = this.f65121a.hashCode() * 31;
        String str = this.f65122b;
        return this.f65123c.hashCode() + f710.m40938f(1, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
