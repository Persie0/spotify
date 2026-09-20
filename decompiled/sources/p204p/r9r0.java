package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r9r0 implements u9r0 {

    /* JADX INFO: renamed from: a */
    public final long f197114a;

    /* JADX INFO: renamed from: b */
    public final float f197115b;

    public r9r0(long j, float f) {
        this.f197114a = j;
        this.f197115b = f;
    }

    /* JADX INFO: renamed from: a */
    public final long m75087a() {
        return this.f197114a;
    }

    /* JADX INFO: renamed from: b */
    public final float m75088b() {
        return this.f197115b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9r0)) {
            return false;
        }
        r9r0 r9r0Var = (r9r0) obj;
        return this.f197114a == r9r0Var.f197114a && Float.compare(this.f197115b, r9r0Var.f197115b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f197115b) + (Long.hashCode(this.f197114a) * 31);
    }
}
