package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v581 {

    /* JADX INFO: renamed from: a */
    public final String f237373a;

    /* JADX INFO: renamed from: b */
    public final String f237374b;

    /* JADX INFO: renamed from: c */
    public final int f237375c;

    /* JADX INFO: renamed from: d */
    public final boolean f237376d;

    public v581(String str, int i, String str2, boolean z) {
        this.f237373a = str;
        this.f237374b = str2;
        this.f237375c = i;
        this.f237376d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v581)) {
            return false;
        }
        v581 v581Var = (v581) obj;
        return wj50.m88271j(this.f237373a, v581Var.f237373a) && wj50.m88271j(this.f237374b, v581Var.f237374b) && this.f237375c == v581Var.f237375c && this.f237376d == v581Var.f237376d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237376d) + mt60.m62800g(this.f237375c, s571.m77243b(this.f237373a.hashCode() * 31, 31, this.f237374b), 31);
    }
}
