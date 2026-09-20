package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k9r0 implements m9r0 {

    /* JADX INFO: renamed from: a */
    public final long f120679a;

    /* JADX INFO: renamed from: b */
    public final long f120680b;

    /* JADX INFO: renamed from: c */
    public final long f120681c;

    public k9r0(long j, long j2, long j3) {
        this.f120679a = j;
        this.f120680b = j2;
        this.f120681c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9r0)) {
            return false;
        }
        k9r0 k9r0Var = (k9r0) obj;
        return this.f120679a == k9r0Var.f120679a && this.f120680b == k9r0Var.f120680b && this.f120681c == k9r0Var.f120681c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f120681c) + dq60.m36605e(Long.hashCode(this.f120679a) * 31, this.f120680b, 31);
    }
}
