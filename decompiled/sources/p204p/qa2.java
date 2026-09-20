package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qa2 extends ra2 {

    /* JADX INFO: renamed from: a */
    public final int f186714a;

    /* JADX INFO: renamed from: b */
    public final int f186715b;

    /* JADX INFO: renamed from: c */
    public final int f186716c;

    public qa2(int i, int i2, int i3) {
        this.f186714a = i;
        this.f186715b = i2;
        this.f186716c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa2)) {
            return false;
        }
        qa2 qa2Var = (qa2) obj;
        return this.f186714a == qa2Var.f186714a && this.f186715b == qa2Var.f186715b && this.f186716c == qa2Var.f186716c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f186716c) + mt60.m62800g(this.f186715b, Integer.hashCode(this.f186714a) * 31, 31);
    }
}
