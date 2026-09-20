package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wfz0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f250931a;

    /* JADX INFO: renamed from: b */
    public final sjo f250932b;

    public wfz0(long j, sjo sjoVar) {
        this.f250931a = j;
        this.f250932b = sjoVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f250931a, ((wfz0) obj).f250931a);
    }
}
