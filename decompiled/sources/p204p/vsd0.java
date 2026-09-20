package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vsd0 {

    /* JADX INFO: renamed from: a */
    public final Object f244408a;

    /* JADX INFO: renamed from: b */
    public final int f244409b;

    /* JADX INFO: renamed from: c */
    public final int f244410c;

    /* JADX INFO: renamed from: d */
    public final long f244411d;

    /* JADX INFO: renamed from: e */
    public final int f244412e;

    public vsd0(Object obj) {
        this(-1L, obj);
    }

    /* JADX INFO: renamed from: a */
    public final vsd0 m86307a(Object obj) {
        if (this.f244408a.equals(obj)) {
            return this;
        }
        return new vsd0(obj, this.f244409b, this.f244410c, this.f244411d, this.f244412e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m86308b(vsd0 vsd0Var) {
        if (vsd0Var == null) {
            return false;
        }
        if (this == vsd0Var) {
            return true;
        }
        return this.f244408a.equals(vsd0Var.f244408a) && this.f244409b == vsd0Var.f244409b && this.f244410c == vsd0Var.f244410c && this.f244411d == vsd0Var.f244411d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86309c() {
        return this.f244409b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsd0)) {
            return false;
        }
        vsd0 vsd0Var = (vsd0) obj;
        return m86308b(vsd0Var) && this.f244412e == vsd0Var.f244412e;
    }

    public final int hashCode() {
        return ((((((dq60.m36604d(527, 31, this.f244408a) + this.f244409b) * 31) + this.f244410c) * 31) + ((int) this.f244411d)) * 31) + this.f244412e;
    }

    public vsd0(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public vsd0(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public vsd0(Object obj, int i, int i2, long j, int i3) {
        this.f244408a = obj;
        this.f244409b = i;
        this.f244410c = i2;
        this.f244411d = j;
        this.f244412e = i3;
    }
}
