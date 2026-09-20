package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qbg1 extends bwf1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f187091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f187092c;

    public /* synthetic */ qbg1(Object obj, int i) {
        this.f187091b = i;
        this.f187092c = obj;
    }

    @Override // p204p.bwf1
    /* JADX INFO: renamed from: a */
    public final void mo30688a() {
        switch (this.f187091b) {
            case 0:
                synchronized (((dsg1) this.f187092c).f52574f) {
                    try {
                        if (((dsg1) this.f187092c).f52579k.get() > 0 && ((dsg1) this.f187092c).f52579k.decrementAndGet() > 0) {
                            ((dsg1) this.f187092c).f52570b.m94136g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        dsg1 dsg1Var = (dsg1) this.f187092c;
                        if (dsg1Var.f52581m != null) {
                            dsg1Var.f52570b.m94136g("Unbind from service.", new Object[0]);
                            dsg1 dsg1Var2 = (dsg1) this.f187092c;
                            dsg1Var2.f52569a.unbindService(dsg1Var2.f52580l);
                            dsg1 dsg1Var3 = (dsg1) this.f187092c;
                            dsg1Var3.f52575g = false;
                            dsg1Var3.f52581m = null;
                            dsg1Var3.f52580l = null;
                        }
                        ((dsg1) this.f187092c).m36775f();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                dsg1 dsg1Var4 = (dsg1) ((i8v) this.f187092c).f99849b;
                dsg1Var4.f52570b.m94136g("unlinkToDeath", new Object[0]);
                dsg1Var4.f52581m.asBinder().unlinkToDeath(dsg1Var4.f52578j, 0);
                dsg1Var4.f52581m = null;
                dsg1Var4.f52575g = false;
                return;
        }
    }
}
