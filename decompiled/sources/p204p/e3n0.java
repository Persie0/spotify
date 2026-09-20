package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e3n0 {

    /* JADX INFO: renamed from: a */
    public final String f55829a;

    /* JADX INFO: renamed from: b */
    public final String f55830b;

    /* JADX INFO: renamed from: c */
    public final boolean f55831c;

    /* JADX INFO: renamed from: d */
    public final boolean f55832d;

    public e3n0(String str, boolean z, String str2, boolean z2) {
        this.f55829a = str;
        this.f55830b = str2;
        this.f55831c = z;
        this.f55832d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3n0)) {
            return false;
        }
        e3n0 e3n0Var = (e3n0) obj;
        return wj50.m88271j(this.f55829a, e3n0Var.f55829a) && wj50.m88271j(this.f55830b, e3n0Var.f55830b) && this.f55831c == e3n0Var.f55831c && this.f55832d == e3n0Var.f55832d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55832d) + s571.m77245d(s571.m77243b(this.f55829a.hashCode() * 31, 31, this.f55830b), 31, this.f55831c);
    }
}
