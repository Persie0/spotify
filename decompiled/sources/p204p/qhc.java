package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qhc extends yv51 implements Comparable {

    /* JADX INFO: renamed from: t */
    public long f188707t;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qhc qhcVar = (qhc) obj;
        if (m67519d(4) != qhcVar.m67519d(4)) {
            return m67519d(4) ? 1 : -1;
        }
        long j = this.f105020f - qhcVar.f105020f;
        if (j == 0) {
            j = this.f188707t - qhcVar.f188707t;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
