package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b8f0 {

    /* JADX INFO: renamed from: a */
    public final a8f0 f24580a;

    /* JADX INFO: renamed from: b */
    public final boolean f24581b;

    /* JADX INFO: renamed from: c */
    public final int f24582c;

    public /* synthetic */ b8f0(a8f0 a8f0Var, int i) {
        this(a8f0Var, (i & 2) == 0, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8f0)) {
            return false;
        }
        b8f0 b8f0Var = (b8f0) obj;
        return wj50.m88271j(this.f24580a, b8f0Var.f24580a) && this.f24581b == b8f0Var.f24581b && this.f24582c == b8f0Var.f24582c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f24582c) + s571.m77245d(this.f24580a.hashCode() * 31, 31, this.f24581b);
    }

    public b8f0(a8f0 a8f0Var, boolean z, int i) {
        this.f24580a = a8f0Var;
        this.f24581b = z;
        this.f24582c = i;
    }
}
