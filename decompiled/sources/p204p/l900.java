package p204p;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class l900 extends v400 {

    /* JADX INFO: renamed from: c */
    public static final iva f130973c = a7j0.m24943A("0021F904");

    /* JADX INFO: renamed from: b */
    public final npa f130974b;

    public l900(gqa gqaVar) {
        super(gqaVar);
        this.f130974b = new npa();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58492a(long j) {
        npa npaVar = this.f130974b;
        long j2 = npaVar.f156904b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.mo27348g1(npaVar, j3) == j3;
    }

    @Override // p204p.v400, p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) throws EOFException {
        long j2;
        long j3;
        m58492a(j);
        npa npaVar2 = this.f130974b;
        long j4 = 0;
        if (npaVar2.f156904b == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jM65310i = -1;
            while (true) {
                iva ivaVar = f130973c;
                j2 = j4;
                jM65310i = npaVar2.m65310i(ivaVar.f106178a[0], jM65310i + 1, Long.MAX_VALUE);
                if (jM65310i == -1 || (m58492a(ivaVar.f106178a.length) && npaVar2.m65312r(ivaVar.mo51747d(), jM65310i, ivaVar))) {
                    break;
                }
                j4 = j2;
            }
            if (jM65310i == -1) {
                break;
            }
            long jMo27348g1 = npaVar2.mo27348g1(npaVar, jM65310i + ((long) 4));
            if (jMo27348g1 < j2) {
                jMo27348g1 = j2;
            }
            j5 += jMo27348g1;
            if (m58492a(5L) && npaVar2.m65309h(4L) == 0 && (((npaVar2.m65309h(2L) & 255) << 8) | (npaVar2.m65309h(1L) & 255)) < 2) {
                npaVar.m65298J(npaVar2.m65309h(j2));
                npaVar.m65298J(10);
                npaVar.m65298J(0);
                npaVar2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long jMo27348g2 = npaVar2.mo27348g1(npaVar, j - j5);
            j3 = 0;
            if (jMo27348g2 < 0) {
                jMo27348g2 = 0;
            }
            j5 += jMo27348g2;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
