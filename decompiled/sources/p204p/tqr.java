package p204p;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class tqr extends cv61 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f222870e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f222871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqr(String str, int i, Object obj) {
        super(str, true);
        this.f222870e = i;
        this.f222871f = obj;
    }

    @Override // p204p.cv61
    /* JADX INFO: renamed from: a */
    public final long mo33978a() {
        avu0 avu0Var;
        switch (this.f222870e) {
            case 0:
                wqr wqrVar = (wqr) this.f222871f;
                synchronized (wqrVar) {
                    try {
                        if (wqrVar.f254145Z && !wqrVar.f254137L0) {
                            try {
                                wqrVar.m88786r();
                            } catch (IOException unused) {
                                wqrVar.f254138M0 = true;
                            }
                            try {
                                if (wqrVar.m88780h()) {
                                    wqrVar.m88784o();
                                    wqrVar.f254155t = 0;
                                }
                            } catch (IOException unused2) {
                                wqrVar.f254139N0 = true;
                                tuu0 tuu0Var = wqrVar.f254153h;
                                if (tuu0Var != null) {
                                    a0f1.m24341b(tuu0Var);
                                }
                                wqrVar.f254153h = kif1.m56499h(kif1.m56498g());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return -1L;
            case 1:
                lfs lfsVar = (lfs) this.f222871f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - lfsVar.f133004b) + 1;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                int i2 = 0;
                avu0 avu0Var2 = null;
                avu0 avu0Var3 = null;
                for (avu0 avu0Var4 : (ConcurrentLinkedQueue) lfsVar.f133007e) {
                    wj50.m88279p(avu0Var4);
                    synchronized (avu0Var4) {
                        if (lfsVar.m58916a(avu0Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = j2;
                            long j4 = avu0Var4.f20279r;
                            if (j4 < j) {
                                j = j4;
                                avu0Var2 = avu0Var4;
                            }
                            i++;
                            if (j4 < j3) {
                                j2 = j4;
                                avu0Var3 = avu0Var4;
                            } else {
                                j2 = j3;
                            }
                        }
                    }
                }
                long j5 = j2;
                if (avu0Var2 != null) {
                    avu0Var = avu0Var2;
                } else if (i > lfsVar.f133003a) {
                    avu0Var = avu0Var3;
                    j = j5;
                } else {
                    j = -1;
                    avu0Var = null;
                }
                if (avu0Var == null) {
                    if (avu0Var3 != null) {
                        return (j5 + lfsVar.f133004b) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return lfsVar.f133004b;
                    }
                    return -1L;
                }
                synchronized (avu0Var) {
                    if (avu0Var.f20278q.isEmpty() && avu0Var.f20279r == j) {
                        avu0Var.f20272k = true;
                        ((ConcurrentLinkedQueue) lfsVar.f133007e).remove(avu0Var);
                        c0f1.m31132c(avu0Var.f20266e);
                        if (!((ConcurrentLinkedQueue) lfsVar.f133007e).isEmpty()) {
                            return 0L;
                        }
                        ((kv61) lfsVar.f133005c).m57441a();
                        return 0L;
                    }
                    return 0L;
                }
            default:
                yvu0 yvu0Var = (yvu0) this.f222871f;
                try {
                    return yvu0Var.m94752g() ? 0L : -1L;
                } catch (IOException e) {
                    yvu0.m94746c(yvu0Var, e, null, 2);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqr(yvu0 yvu0Var) {
        super(dq60.m36616p(yvu0Var.f276763m, " writer", new StringBuilder()), true);
        this.f222870e = 2;
        this.f222871f = yvu0Var;
    }
}
