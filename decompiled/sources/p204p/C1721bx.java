package p204p;

/* JADX INFO: renamed from: p.bx */
/* JADX INFO: loaded from: classes7.dex */
public final class C1721bx {

    /* JADX INFO: renamed from: a */
    public final int f31753a;

    /* JADX INFO: renamed from: b */
    public final boolean f31754b;

    public C1721bx(int i, boolean z) {
        this.f31753a = i;
        this.f31754b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721bx)) {
            return false;
        }
        C1721bx c1721bx = (C1721bx) obj;
        return this.f31753a == c1721bx.f31753a && this.f31754b == c1721bx.f31754b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31754b) + (edb.m38547C(this.f31753a) * 31);
    }
}
