package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wzw0 {

    /* JADX INFO: renamed from: e */
    public static final wzw0 f256697e = new wzw0(false, false, false, false);

    /* JADX INFO: renamed from: f */
    public static final wzw0 f256698f = new wzw0(true, true, true, true);

    /* JADX INFO: renamed from: a */
    public final boolean f256699a;

    /* JADX INFO: renamed from: b */
    public final boolean f256700b;

    /* JADX INFO: renamed from: c */
    public final boolean f256701c;

    /* JADX INFO: renamed from: d */
    public final boolean f256702d;

    public wzw0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f256699a = z;
        this.f256700b = z2;
        this.f256701c = z3;
        this.f256702d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzw0)) {
            return false;
        }
        wzw0 wzw0Var = (wzw0) obj;
        return this.f256699a == wzw0Var.f256699a && this.f256700b == wzw0Var.f256700b && this.f256701c == wzw0Var.f256701c && this.f256702d == wzw0Var.f256702d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256702d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f256699a) * 31, 31, this.f256700b), 31, this.f256701c);
    }
}
