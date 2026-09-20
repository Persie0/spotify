package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class kez extends v400 {

    /* JADX INFO: renamed from: b */
    public final long f121993b;

    /* JADX INFO: renamed from: c */
    public final boolean f121994c;

    /* JADX INFO: renamed from: d */
    public long f121995d;

    public kez(wt31 wt31Var, long j, boolean z) {
        super(wt31Var);
        this.f121993b = j;
        this.f121994c = z;
    }

    @Override // p204p.v400, p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) throws IOException {
        long j2 = this.f121995d;
        long j3 = this.f121993b;
        if (j2 > j3) {
            j = 0;
        } else if (this.f121994c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jMo27348g1 = this.f237013a.mo27348g1(npaVar, j);
        if (jMo27348g1 != -1) {
            this.f121995d += jMo27348g1;
        }
        long j5 = this.f121995d;
        if ((j5 >= j3 || jMo27348g1 != -1) && j5 <= j3) {
            return jMo27348g1;
        }
        if (jMo27348g1 > 0 && j5 > j3) {
            long j6 = npaVar.f156904b - (j5 - j3);
            npa npaVar2 = new npa();
            npaVar2.mo42404H(npaVar);
            npaVar.mo25160U0(npaVar2, j6);
            npaVar2.m65306c();
        }
        StringBuilder sbM77254m = s571.m77254m(j3, "expected ", " bytes but got ");
        sbM77254m.append(this.f121995d);
        throw new IOException(sbM77254m.toString());
    }
}
