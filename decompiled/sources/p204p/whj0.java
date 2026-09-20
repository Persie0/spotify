package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class whj0 {

    /* JADX INFO: renamed from: a */
    public final int f251362a;

    /* JADX INFO: renamed from: b */
    public final long f251363b;

    /* JADX INFO: renamed from: c */
    public final long f251364c;

    /* JADX INFO: renamed from: d */
    public final lhj0 f251365d;

    /* JADX INFO: renamed from: e */
    public final xu31 f251366e;

    /* JADX INFO: renamed from: f */
    public final Object f251367f;

    public /* synthetic */ whj0(int i, long j, long j2, lhj0 lhj0Var) {
        this(i, j, j2, lhj0Var, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final xu31 m88148a() {
        return this.f251366e;
    }

    /* JADX INFO: renamed from: b */
    public final int m88149b() {
        return this.f251362a;
    }

    /* JADX INFO: renamed from: c */
    public final lhj0 m88150c() {
        return this.f251365d;
    }

    /* JADX INFO: renamed from: d */
    public final long m88151d() {
        return this.f251363b;
    }

    /* JADX INFO: renamed from: e */
    public final long m88152e() {
        return this.f251364c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whj0)) {
            return false;
        }
        whj0 whj0Var = (whj0) obj;
        return this.f251362a == whj0Var.f251362a && this.f251363b == whj0Var.f251363b && this.f251364c == whj0Var.f251364c && wj50.m88271j(this.f251365d, whj0Var.f251365d) && wj50.m88271j(this.f251366e, whj0Var.f251366e) && wj50.m88271j(this.f251367f, whj0Var.f251367f);
    }

    public final int hashCode() {
        int iM38557f = edb.m38557f(dq60.m36605e(dq60.m36605e(this.f251362a * 31, this.f251363b, 31), this.f251364c, 31), 31, this.f251365d.f133583a);
        xu31 xu31Var = this.f251366e;
        int iHashCode = (iM38557f + (xu31Var == null ? 0 : xu31Var.f265990a.hashCode())) * 31;
        Object obj = this.f251367f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.f251362a + ", requestMillis=" + this.f251363b + ", responseMillis=" + this.f251364c + ", headers=" + this.f251365d + ", body=" + this.f251366e + ", delegate=" + this.f251367f + ')';
    }

    public whj0(int i, long j, long j2, lhj0 lhj0Var, xu31 xu31Var, Object obj) {
        this.f251362a = i;
        this.f251363b = j;
        this.f251364c = j2;
        this.f251365d = lhj0Var;
        this.f251366e = xu31Var;
        this.f251367f = obj;
    }
}
