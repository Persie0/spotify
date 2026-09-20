package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class px4 implements m6d0 {

    /* JADX INFO: renamed from: a */
    public final jz4 f182196a;

    /* JADX INFO: renamed from: b */
    public boolean f182197b;

    public px4(jz4 jz4Var) {
        this.f182196a = jz4Var;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: a */
    public final n6d0 mo24627a(o6d0 o6d0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            t5o0 t5o0VarMo39619B = ((h6d0) list.get(i)).mo39619B(j);
            iMax = Math.max(iMax, t5o0VarMo39619B.f217322a);
            iMax2 = Math.max(iMax2, t5o0VarMo39619B.f217323b);
            arrayList.add(t5o0VarMo39619B);
        }
        boolean zMo34819a0 = o6d0Var.mo34819a0();
        jz4 jz4Var = this.f182196a;
        if (zMo34819a0) {
            this.f182197b = true;
            jz4Var.f117591b.setValue(new g450((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f182197b) {
            jz4Var.f117591b.setValue(new g450((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return o6d0Var.mo44714T(iMax, iMax2, nau.f152117a, new l24(2, arrayList));
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: b */
    public final int mo24772b(rj50 rj50Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo39623w = ((h6d0) list.get(0)).mo39623w(i);
        int iM46714K = h6f.m46714K(list);
        int i2 = 1;
        if (1 <= iM46714K) {
            while (true) {
                int iMo39623w2 = ((h6d0) list.get(i2)).mo39623w(i);
                if (iMo39623w2 > iMo39623w) {
                    iMo39623w = iMo39623w2;
                }
                if (i2 == iM46714K) {
                    break;
                }
                i2++;
            }
        }
        return iMo39623w;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: c */
    public final int mo24773c(rj50 rj50Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo39621l = ((h6d0) list.get(0)).mo39621l(i);
        int iM46714K = h6f.m46714K(list);
        int i2 = 1;
        if (1 <= iM46714K) {
            while (true) {
                int iMo39621l2 = ((h6d0) list.get(i2)).mo39621l(i);
                if (iMo39621l2 > iMo39621l) {
                    iMo39621l = iMo39621l2;
                }
                if (i2 == iM46714K) {
                    break;
                }
                i2++;
            }
        }
        return iMo39621l;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: d */
    public final int mo24774d(rj50 rj50Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo39620d = ((h6d0) list.get(0)).mo39620d(i);
        int iM46714K = h6f.m46714K(list);
        int i2 = 1;
        if (1 <= iM46714K) {
            while (true) {
                int iMo39620d2 = ((h6d0) list.get(i2)).mo39620d(i);
                if (iMo39620d2 > iMo39620d) {
                    iMo39620d = iMo39620d2;
                }
                if (i2 == iM46714K) {
                    break;
                }
                i2++;
            }
        }
        return iMo39620d;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: e */
    public final int mo24775e(rj50 rj50Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo39622u = ((h6d0) list.get(0)).mo39622u(i);
        int iM46714K = h6f.m46714K(list);
        int i2 = 1;
        if (1 <= iM46714K) {
            while (true) {
                int iMo39622u2 = ((h6d0) list.get(i2)).mo39622u(i);
                if (iMo39622u2 > iMo39622u) {
                    iMo39622u = iMo39622u2;
                }
                if (i2 == iM46714K) {
                    break;
                }
                i2++;
            }
        }
        return iMo39622u;
    }
}
