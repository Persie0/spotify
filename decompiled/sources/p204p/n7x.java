package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n7x {

    /* JADX INFO: renamed from: a */
    public final m7x f151235a;

    /* JADX INFO: renamed from: b */
    public final long f151236b;

    /* JADX INFO: renamed from: c */
    public final long f151237c;

    public n7x(m7x m7xVar, long j, long j2) {
        this.f151235a = m7xVar;
        this.f151236b = j;
        this.f151237c = j2;
    }

    /* JADX INFO: renamed from: a */
    public final m7x m63814a() {
        return this.f151235a;
    }

    /* JADX INFO: renamed from: b */
    public final long m63815b() {
        return this.f151236b;
    }

    /* JADX INFO: renamed from: c */
    public final long m63816c() {
        return this.f151237c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7x)) {
            return false;
        }
        n7x n7xVar = (n7x) obj;
        return this.f151235a == n7xVar.f151235a && this.f151236b == n7xVar.f151236b && this.f151237c == n7xVar.f151237c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f151237c) + dq60.m36605e(this.f151235a.hashCode() * 31, this.f151236b, 31);
    }
}
