package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dt5 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f52727a;

    /* JADX INFO: renamed from: b */
    public final boolean f52728b;

    /* JADX INFO: renamed from: c */
    public final boolean f52729c;

    public dt5(boolean z, boolean z2, boolean z3) {
        this.f52727a = z;
        this.f52728b = z2;
        this.f52729c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt5)) {
            return false;
        }
        dt5 dt5Var = (dt5) obj;
        return this.f52727a == dt5Var.f52727a && this.f52728b == dt5Var.f52728b && this.f52729c == dt5Var.f52729c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52729c) + s571.m77245d(Boolean.hashCode(this.f52727a) * 31, 31, this.f52728b);
    }
}
