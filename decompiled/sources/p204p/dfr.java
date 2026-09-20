package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dfr {

    /* JADX INFO: renamed from: a */
    public final qcr f48635a;

    /* JADX INFO: renamed from: b */
    public final e261 f48636b;

    /* JADX INFO: renamed from: c */
    public final long f48637c;

    public dfr(qcr qcrVar, e261 e261Var, long j) {
        this.f48635a = qcrVar;
        this.f48636b = e261Var;
        this.f48637c = j;
    }

    /* JADX INFO: renamed from: a */
    public final e261 m35901a() {
        return this.f48636b;
    }

    /* JADX INFO: renamed from: b */
    public final long m35902b() {
        return this.f48637c;
    }

    /* JADX INFO: renamed from: c */
    public final qcr m35903c() {
        return this.f48635a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfr)) {
            return false;
        }
        dfr dfrVar = (dfr) obj;
        return wj50.m88271j(this.f48635a, dfrVar.f48635a) && this.f48636b == dfrVar.f48636b && this.f48637c == dfrVar.f48637c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f48637c) + ((this.f48636b.hashCode() + (this.f48635a.hashCode() * 31)) * 31);
    }
}
