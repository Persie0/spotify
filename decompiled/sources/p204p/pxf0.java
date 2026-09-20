package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pxf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f182297a;

    /* JADX INFO: renamed from: b */
    public final boolean f182298b;

    /* JADX INFO: renamed from: c */
    public final boolean f182299c;

    public pxf0(boolean z, boolean z2, boolean z3) {
        this.f182297a = z;
        this.f182298b = z2;
        this.f182299c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxf0)) {
            return false;
        }
        pxf0 pxf0Var = (pxf0) obj;
        return this.f182297a == pxf0Var.f182297a && this.f182298b == pxf0Var.f182298b && this.f182299c == pxf0Var.f182299c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182299c) + s571.m77245d(Boolean.hashCode(this.f182297a) * 31, 31, this.f182298b);
    }
}
