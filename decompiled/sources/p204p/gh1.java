package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gh1 {

    /* JADX INFO: renamed from: a */
    public final String f79778a;

    /* JADX INFO: renamed from: b */
    public final String f79779b;

    /* JADX INFO: renamed from: c */
    public final int f79780c;

    /* JADX INFO: renamed from: d */
    public final xcl0 f79781d;

    public gh1(String str, String str2, int i, xcl0 xcl0Var) {
        this.f79778a = str;
        this.f79779b = str2;
        this.f79780c = i;
        this.f79781d = xcl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh1)) {
            return false;
        }
        gh1 gh1Var = (gh1) obj;
        return wj50.m88271j(this.f79778a, gh1Var.f79778a) && wj50.m88271j(this.f79779b, gh1Var.f79779b) && this.f79780c == gh1Var.f79780c && wj50.m88271j(this.f79781d, gh1Var.f79781d);
    }

    public final int hashCode() {
        return this.f79781d.hashCode() + mt60.m62800g(this.f79780c, s571.m77243b(this.f79778a.hashCode() * 31, 31, this.f79779b), 31);
    }
}
