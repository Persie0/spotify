package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uwr0 implements xwr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f234727a;

    /* JADX INFO: renamed from: b */
    public final boolean f234728b;

    /* JADX INFO: renamed from: c */
    public final boolean f234729c;

    public uwr0(boolean z, boolean z2, boolean z3) {
        this.f234727a = z;
        this.f234728b = z2;
        this.f234729c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwr0)) {
            return false;
        }
        uwr0 uwr0Var = (uwr0) obj;
        return this.f234727a == uwr0Var.f234727a && this.f234728b == uwr0Var.f234728b && this.f234729c == uwr0Var.f234729c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f234729c) + s571.m77245d(Boolean.hashCode(this.f234727a) * 31, 31, this.f234728b);
    }
}
