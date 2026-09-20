package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nx50 {

    /* JADX INFO: renamed from: a */
    public final boolean f159368a;

    /* JADX INFO: renamed from: b */
    public final boolean f159369b;

    /* JADX INFO: renamed from: c */
    public final boolean f159370c;

    /* JADX INFO: renamed from: d */
    public final boolean f159371d;

    /* JADX INFO: renamed from: e */
    public final boolean f159372e;

    /* JADX INFO: renamed from: f */
    public final boolean f159373f;

    public nx50(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f159368a = z;
        this.f159369b = z2;
        this.f159370c = z3;
        this.f159371d = z4;
        this.f159372e = z5;
        this.f159373f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx50)) {
            return false;
        }
        nx50 nx50Var = (nx50) obj;
        return this.f159368a == nx50Var.f159368a && this.f159369b == nx50Var.f159369b && this.f159370c == nx50Var.f159370c && this.f159371d == nx50Var.f159371d && this.f159372e == nx50Var.f159372e && this.f159373f == nx50Var.f159373f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159373f) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f159368a) * 31, 31, this.f159369b), 31, this.f159370c), 31, this.f159371d), 31, this.f159372e);
    }
}
