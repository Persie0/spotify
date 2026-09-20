package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ulz0 {

    /* JADX INFO: renamed from: a */
    public final String f231684a;

    /* JADX INFO: renamed from: b */
    public final int f231685b;

    /* JADX INFO: renamed from: c */
    public final boolean f231686c;

    /* JADX INFO: renamed from: d */
    public final String f231687d;

    public ulz0(String str, int i, String str2, boolean z) {
        this.f231684a = str;
        this.f231685b = i;
        this.f231686c = z;
        this.f231687d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulz0)) {
            return false;
        }
        ulz0 ulz0Var = (ulz0) obj;
        return wj50.m88271j(this.f231684a, ulz0Var.f231684a) && this.f231685b == ulz0Var.f231685b && this.f231686c == ulz0Var.f231686c && wj50.m88271j(this.f231687d, ulz0Var.f231687d);
    }

    public final int hashCode() {
        return this.f231687d.hashCode() + s571.m77245d(mt60.m62800g(this.f231685b, this.f231684a.hashCode() * 31, 31), 31, this.f231686c);
    }
}
