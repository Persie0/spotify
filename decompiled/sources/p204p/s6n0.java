package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s6n0 implements v6n0 {

    /* JADX INFO: renamed from: a */
    public final long f206157a;

    /* JADX INFO: renamed from: b */
    public final String f206158b;

    public s6n0(long j, String str) {
        this.f206157a = j;
        this.f206158b = str;
    }

    @Override // p204p.v6n0
    /* JADX INFO: renamed from: a */
    public final long mo74867a() {
        return this.f206157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6n0)) {
            return false;
        }
        s6n0 s6n0Var = (s6n0) obj;
        return this.f206157a == s6n0Var.f206157a && wj50.m88271j(this.f206158b, s6n0Var.f206158b);
    }

    @Override // p204p.v6n0
    public final String getEventId() {
        return this.f206158b;
    }

    public final int hashCode() {
        return this.f206158b.hashCode() + (Long.hashCode(this.f206157a) * 31);
    }
}
