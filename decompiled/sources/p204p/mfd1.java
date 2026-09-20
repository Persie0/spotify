package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mfd1 {

    /* JADX INFO: renamed from: a */
    public final String f143046a;

    /* JADX INFO: renamed from: b */
    public final b450 f143047b;

    /* JADX INFO: renamed from: c */
    public final boolean f143048c;

    /* JADX INFO: renamed from: d */
    public final boolean f143049d;

    public mfd1(String str, b450 b450Var, boolean z, boolean z2) {
        this.f143046a = str;
        this.f143047b = b450Var;
        this.f143048c = z;
        this.f143049d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfd1)) {
            return false;
        }
        mfd1 mfd1Var = (mfd1) obj;
        return this.f143046a.equals(mfd1Var.f143046a) && this.f143047b.equals(mfd1Var.f143047b) && this.f143048c == mfd1Var.f143048c && this.f143049d == mfd1Var.f143049d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143049d) + s571.m77245d(stz0.m79353g(this.f143046a.hashCode() * 31, 31, this.f143047b), 31, this.f143048c);
    }
}
