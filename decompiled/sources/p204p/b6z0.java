package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b6z0 {

    /* JADX INFO: renamed from: a */
    public final long f24077a;

    /* JADX INFO: renamed from: b */
    public final i4a f24078b;

    public b6z0(long j, i4a i4aVar) {
        this.f24077a = j;
        this.f24078b = i4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6z0)) {
            return false;
        }
        b6z0 b6z0Var = (b6z0) obj;
        return this.f24077a == b6z0Var.f24077a && wj50.m88271j(this.f24078b, b6z0Var.f24078b);
    }

    public final int hashCode() {
        return this.f24078b.hashCode() + (Long.hashCode(this.f24077a) * 31);
    }
}
