package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lyj {

    /* JADX INFO: renamed from: a */
    public final long f138070a = myj.f148470a.incrementAndGet();

    /* JADX INFO: renamed from: b */
    public final iph f138071b;

    public lyj(iph iphVar) {
        this.f138071b = iphVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyj)) {
            return false;
        }
        lyj lyjVar = (lyj) obj;
        return this.f138070a == lyjVar.f138070a && wj50.m88271j(this.f138071b, lyjVar.f138071b);
    }

    public final int hashCode() {
        return this.f138071b.hashCode() + (Long.hashCode(this.f138070a) * 31);
    }
}
