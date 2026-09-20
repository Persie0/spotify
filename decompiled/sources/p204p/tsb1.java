package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tsb1 extends vsb1 {

    /* JADX INFO: renamed from: a */
    public final String f223277a;

    /* JADX INFO: renamed from: b */
    public final long f223278b;

    /* JADX INFO: renamed from: c */
    public final long f223279c;

    public tsb1(long j, String str, long j2) {
        this.f223277a = str;
        this.f223278b = j;
        this.f223279c = j2;
    }

    @Override // p204p.vsb1
    /* JADX INFO: renamed from: a */
    public final long mo81408a() {
        return this.f223279c;
    }

    @Override // p204p.vsb1
    /* JADX INFO: renamed from: b */
    public final long mo81409b() {
        return this.f223278b;
    }

    /* JADX INFO: renamed from: d */
    public final String m81410d() {
        return this.f223277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsb1)) {
            return false;
        }
        tsb1 tsb1Var = (tsb1) obj;
        return wj50.m88271j(this.f223277a, tsb1Var.f223277a) && this.f223278b == tsb1Var.f223278b && this.f223279c == tsb1Var.f223279c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f223279c) + dq60.m36605e(this.f223277a.hashCode() * 31, this.f223278b, 31);
    }

    public /* synthetic */ tsb1(String str) {
        this(0L, str, 0L);
    }
}
