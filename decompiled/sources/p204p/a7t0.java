package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a7t0 {

    /* JADX INFO: renamed from: a */
    public final int f13136a;

    /* JADX INFO: renamed from: b */
    public final boolean f13137b;

    /* JADX INFO: renamed from: c */
    public final boolean f13138c;

    public a7t0(int i, boolean z, boolean z2) {
        this.f13136a = i;
        this.f13137b = z;
        this.f13138c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7t0)) {
            return false;
        }
        a7t0 a7t0Var = (a7t0) obj;
        return this.f13136a == a7t0Var.f13136a && this.f13137b == a7t0Var.f13137b && this.f13138c == a7t0Var.f13138c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13138c) + s571.m77245d(Integer.hashCode(this.f13136a) * 31, 31, this.f13137b);
    }
}
