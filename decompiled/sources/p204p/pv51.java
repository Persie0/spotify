package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pv51 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f181601a;

    /* JADX INFO: renamed from: b */
    public final byte[] f181602b;

    public pv51(long j, byte[] bArr) {
        this.f181601a = j;
        this.f181602b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f181601a, ((pv51) obj).f181601a);
    }
}
