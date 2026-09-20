package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cyk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f43314a;

    /* JADX INFO: renamed from: b */
    public final boolean f43315b;

    /* JADX INFO: renamed from: c */
    public final boolean f43316c;

    /* JADX INFO: renamed from: d */
    public final boolean f43317d;

    public cyk0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f43314a = z;
        this.f43315b = z2;
        this.f43316c = z3;
        this.f43317d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyk0)) {
            return false;
        }
        cyk0 cyk0Var = (cyk0) obj;
        return this.f43314a == cyk0Var.f43314a && this.f43315b == cyk0Var.f43315b && this.f43316c == cyk0Var.f43316c && this.f43317d == cyk0Var.f43317d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43317d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f43314a) * 31, 31, this.f43315b), 31, this.f43316c);
    }
}
