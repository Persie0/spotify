package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b88 {

    /* JADX INFO: renamed from: a */
    public final v851 f24518a;

    /* JADX INFO: renamed from: b */
    public final int f24519b;

    /* JADX INFO: renamed from: c */
    public final boolean f24520c;

    /* JADX INFO: renamed from: d */
    public final String f24521d;

    public b88(v851 v851Var, int i, boolean z, String str) {
        this.f24518a = v851Var;
        this.f24519b = i;
        this.f24520c = z;
        this.f24521d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b88)) {
            return false;
        }
        b88 b88Var = (b88) obj;
        return wj50.m88271j(this.f24518a, b88Var.f24518a) && this.f24519b == b88Var.f24519b && this.f24520c == b88Var.f24520c && wj50.m88271j(this.f24521d, b88Var.f24521d);
    }

    public final int hashCode() {
        return this.f24521d.hashCode() + s571.m77245d(mt60.m62800g(this.f24519b, this.f24518a.hashCode() * 31, 31), 31, this.f24520c);
    }
}
