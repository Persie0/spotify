package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lgr0 extends d641 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133274a;

    /* JADX INFO: renamed from: b */
    public final long f133275b;

    /* JADX INFO: renamed from: c */
    public final long f133276c;

    public lgr0(int i, long j, long j2) {
        this.f133274a = i;
        switch (i) {
            case 1:
                this.f133275b = j;
                this.f133276c = j2;
                break;
            default:
                this.f133275b = j2;
                this.f133276c = j;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m58939d(long j, l2n0 l2n0Var) {
        long jM57917E = l2n0Var.m57917E();
        if ((128 & jM57917E) != 0) {
            return 8589934591L & ((((jM57917E & 1) << 32) | l2n0Var.m57919G()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p204p.d641
    public final String toString() {
        switch (this.f133274a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.f133275b);
                sb.append(", identifier= ");
                return ikc0.m50938j(this.f133276c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.f133275b);
                sb2.append(", playbackPositionUs= ");
                return ikc0.m50938j(this.f133276c, " }", sb2);
        }
    }
}
