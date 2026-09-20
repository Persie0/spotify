package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r6n0 implements v6n0 {

    /* JADX INFO: renamed from: a */
    public final long f196330a;

    /* JADX INFO: renamed from: b */
    public final String f196331b;

    public r6n0(long j, String str) {
        this.f196330a = j;
        this.f196331b = str;
    }

    @Override // p204p.v6n0
    /* JADX INFO: renamed from: a */
    public final long mo74867a() {
        return this.f196330a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6n0)) {
            return false;
        }
        r6n0 r6n0Var = (r6n0) obj;
        return this.f196330a == r6n0Var.f196330a && wj50.m88271j(this.f196331b, r6n0Var.f196331b);
    }

    @Override // p204p.v6n0
    public final String getEventId() {
        return this.f196331b;
    }

    public final int hashCode() {
        return this.f196331b.hashCode() + (Long.hashCode(this.f196330a) * 31);
    }
}
