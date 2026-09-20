package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes7.dex */
public final class maq {

    /* JADX INFO: renamed from: a */
    public final xq41 f141638a;

    /* JADX INFO: renamed from: b */
    public final swx f141639b;

    /* JADX INFO: renamed from: c */
    public final mb80 f141640c;

    /* JADX INFO: renamed from: d */
    public final lkp f141641d;

    public maq(xq41 xq41Var, swx swxVar, mb80 mb80Var, lkp lkpVar, xre xreVar) {
        this.f141638a = xq41Var;
        this.f141639b = swxVar;
        this.f141640c = mb80Var;
        this.f141641d = lkpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m61321a(ibk ibkVar) {
        kaq kaqVar;
        if (ibkVar instanceof kaq) {
            kaqVar = (kaq) ibkVar;
            int i = kaqVar.f120947c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kaqVar.f120947c = i - Integer.MIN_VALUE;
            } else {
                kaqVar = new kaq(this, ibkVar);
            }
        } else {
            kaqVar = new kaq(this, ibkVar);
        }
        Object objM86755t = kaqVar.f120945a;
        int i2 = kaqVar.f120947c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            xv41 xv41VarMo61351b = this.f141640c.f141819d.mo61351b();
            kaqVar.f120947c = 1;
            objM86755t = vyf1.m86755t(xv41VarMo61351b, kaqVar);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        lx50 lx50Var = ((mx50) objM86755t).f147962b.f53856c;
        if (lx50Var != null) {
            return lx50Var.f137729a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r0 == r6) goto L38;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m61322b(boolean z, ibk ibkVar) {
        laq laqVar;
        Object c6x0Var;
        if (ibkVar instanceof laq) {
            laqVar = (laq) ibkVar;
            int i = laqVar.f131389e;
            if ((i & Integer.MIN_VALUE) != 0) {
                laqVar.f131389e = i - Integer.MIN_VALUE;
            } else {
                laqVar = new laq(this, ibkVar);
            }
        } else {
            laqVar = new laq(this, ibkVar);
        }
        laq laqVar2 = laqVar;
        Object objM61321a = laqVar2.f131387c;
        int i2 = laqVar2.f131389e;
        uw30 uw30Var = uw30.f234559c;
        lkp lkpVar = this.f141641d;
        Object obj = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM61321a);
                Single singleM91817b = this.f141638a.m91817b(mq41.f146157a, z ? new jq41(new sc31(null, null)) : new iq41(true));
                laqVar2.f131385a = null;
                laqVar2.f131386b = z;
                laqVar2.f131389e = 1;
                objM61321a = zn91.m96567o(singleM91817b, laqVar2);
                if (objM61321a == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                z = laqVar2.f131386b;
                bga.m29073P(objM61321a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM61321a);
            }
            String str = (String) objM61321a;
            if (str != null) {
                this.f141639b.f214731a.mo46962a(new mwx(new owx(new wdj(klh.m56834f(str, wl51.m88496t0(str, "?", false) ? "&" : "?", "utm_medium=listening_activity"), null, null, null, null, null, null, 126)), System.currentTimeMillis() / ((long) 1000)));
            } else {
                lkpVar.m59288a(uw30Var);
            }
            return w2a1.f247311a;
            c6x0Var = (by50) objM61321a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            lkpVar.m59288a(uw30Var);
        }
        if (!(c6x0Var instanceof c6x0)) {
            laqVar2.f131385a = c6x0Var;
            laqVar2.f131386b = z;
            laqVar2.f131389e = 2;
            objM61321a = m61321a(laqVar2);
        }
        return w2a1.f247311a;
    }
}
