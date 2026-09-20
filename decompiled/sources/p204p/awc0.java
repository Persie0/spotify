package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class awc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final long f20474a;

    /* JADX INFO: renamed from: b */
    public final a47 f20475b;

    public awc0(long j, a47 a47Var) {
        this.f20474a = j;
        this.f20475b = a47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awc0)) {
            return false;
        }
        awc0 awc0Var = (awc0) obj;
        return this.f20474a == awc0Var.f20474a && wj50.m88271j(this.f20475b, awc0Var.f20475b);
    }

    public final int hashCode() {
        return this.f20475b.hashCode() + (Long.hashCode(this.f20474a) * 31);
    }
}
