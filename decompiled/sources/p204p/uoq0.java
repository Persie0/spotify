package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uoq0 {

    /* JADX INFO: renamed from: a */
    public final slq0 f232504a;

    /* JADX INFO: renamed from: b */
    public final int f232505b;

    /* JADX INFO: renamed from: c */
    public final boolean f232506c;

    public uoq0(slq0 slq0Var, int i, boolean z) {
        this.f232504a = slq0Var;
        this.f232505b = i;
        this.f232506c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoq0)) {
            return false;
        }
        uoq0 uoq0Var = (uoq0) obj;
        return wj50.m88271j(this.f232504a, uoq0Var.f232504a) && this.f232505b == uoq0Var.f232505b && this.f232506c == uoq0Var.f232506c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232506c) + mt60.m62800g(this.f232505b, this.f232504a.hashCode() * 31, 31);
    }
}
