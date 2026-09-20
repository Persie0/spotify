package p204p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: p.sd */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2372sd implements zw10 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f207826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f207827c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f207828d;

    public /* synthetic */ C2372sd(C1975id c1975id, dx10 dx10Var, b101 b101Var, cl8 cl8Var) {
        this.f207825a = 2;
        this.f207828d = c1975id;
        this.f207826b = b101Var;
        this.f207827c = cl8Var;
    }

    @Override // p204p.zw10
    /* JADX INFO: renamed from: a */
    public final void mo41049a(gx10 gx10Var) throws Throwable {
        switch (this.f207825a) {
            case 0:
                C2252pd c2252pd = (C2252pd) this.f207828d;
                AtomicInteger atomicInteger = (AtomicInteger) this.f207826b;
                RunnableC2334rd runnableC2334rd = (RunnableC2334rd) this.f207827c;
                c2252pd.mo41049a(gx10Var);
                if (atomicInteger.incrementAndGet() == 2) {
                    runnableC2334rd.run();
                }
                break;
            case 1:
                C2289qd c2289qd = (C2289qd) this.f207828d;
                AtomicInteger atomicInteger2 = (AtomicInteger) this.f207826b;
                RunnableC2334rd runnableC2334rd2 = (RunnableC2334rd) this.f207827c;
                c2289qd.mo41049a(gx10Var);
                if (atomicInteger2.incrementAndGet() == 2) {
                    runnableC2334rd2.run();
                }
                break;
            default:
                C1975id c1975id = (C1975id) this.f207828d;
                b101 b101Var = (b101) this.f207826b;
                cl8 cl8Var = (cl8) this.f207827c;
                if (!p2l.f173365a.contains(b95.class)) {
                    try {
                        b95.m28455e(c1975id, gx10Var, b101Var, cl8Var);
                    } catch (Throwable th) {
                        p2l.m68953a(b95.class, th);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C2372sd(zw10 zw10Var, AtomicInteger atomicInteger, RunnableC2334rd runnableC2334rd, int i) {
        this.f207825a = i;
        this.f207828d = zw10Var;
        this.f207826b = atomicInteger;
        this.f207827c = runnableC2334rd;
    }
}
