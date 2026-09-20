package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fn90 {

    /* JADX INFO: renamed from: a */
    public final boolean f71236a;

    /* JADX INFO: renamed from: b */
    public final boolean f71237b;

    /* JADX INFO: renamed from: c */
    public final boolean f71238c;

    public fn90(boolean z, boolean z2, boolean z3) {
        this.f71236a = z;
        this.f71237b = z2;
        this.f71238c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn90)) {
            return false;
        }
        fn90 fn90Var = (fn90) obj;
        return this.f71236a == fn90Var.f71236a && this.f71237b == fn90Var.f71237b && this.f71238c == fn90Var.f71238c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71238c) + s571.m77245d(Boolean.hashCode(this.f71236a) * 31, 31, this.f71237b);
    }
}
