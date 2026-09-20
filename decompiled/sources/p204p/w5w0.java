package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w5w0 {

    /* JADX INFO: renamed from: a */
    public final boolean f248204a;

    /* JADX INFO: renamed from: b */
    public final boolean f248205b;

    /* JADX INFO: renamed from: c */
    public final boolean f248206c;

    public w5w0(boolean z, boolean z2, boolean z3) {
        this.f248204a = z;
        this.f248205b = z2;
        this.f248206c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5w0)) {
            return false;
        }
        w5w0 w5w0Var = (w5w0) obj;
        return this.f248204a == w5w0Var.f248204a && this.f248205b == w5w0Var.f248205b && this.f248206c == w5w0Var.f248206c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248206c) + s571.m77245d(Boolean.hashCode(this.f248204a) * 31, 31, this.f248205b);
    }
}
