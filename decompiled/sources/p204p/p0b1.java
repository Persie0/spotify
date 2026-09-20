package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class p0b1 {

    /* JADX INFO: renamed from: a */
    public final Object f172628a;

    /* JADX INFO: renamed from: b */
    public final long f172629b;

    public p0b1(long j, Object obj) {
        this.f172628a = obj;
        this.f172629b = j;
    }

    /* JADX INFO: renamed from: a */
    public final Object m68693a() {
        return this.f172628a;
    }

    /* JADX INFO: renamed from: b */
    public final long m68694b() {
        return this.f172629b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0b1)) {
            return false;
        }
        p0b1 p0b1Var = (p0b1) obj;
        return wj50.m88271j(this.f172628a, p0b1Var.f172628a) && this.f172629b == p0b1Var.f172629b;
    }

    public final int hashCode() {
        Object obj = this.f172628a;
        return Long.hashCode(this.f172629b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
