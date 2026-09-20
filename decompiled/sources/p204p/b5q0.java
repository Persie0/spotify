package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b5q0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f23641a;

    /* JADX INFO: renamed from: b */
    public final boolean f23642b;

    /* JADX INFO: renamed from: c */
    public final int f23643c;

    /* JADX INFO: renamed from: d */
    public final boolean f23644d;

    public b5q0(boolean z, boolean z2, int i) {
        this.f23641a = z;
        this.f23642b = z2;
        this.f23643c = i;
        this.f23644d = z && !z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5q0)) {
            return false;
        }
        b5q0 b5q0Var = (b5q0) obj;
        return this.f23641a == b5q0Var.f23641a && this.f23642b == b5q0Var.f23642b && this.f23643c == b5q0Var.f23643c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f23643c) + s571.m77245d(Boolean.hashCode(this.f23641a) * 31, 31, this.f23642b);
    }
}
