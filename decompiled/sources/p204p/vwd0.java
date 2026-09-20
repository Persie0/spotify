package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class vwd0 {

    /* JADX INFO: renamed from: a */
    public final pgo f245472a;

    /* JADX INFO: renamed from: b */
    public final wkb0 f245473b;

    /* JADX INFO: renamed from: c */
    public final tjo f245474c = pag1.m69487w(new rko(oyq0.f171866f, 1, pvd0.f181718e, new pko(pvd0.f181722i), pvd0.f181719f), pvd0.f181723t);

    /* JADX INFO: renamed from: d */
    public final tjo f245475d = pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(daj.class)), 1, pvd0.f181720g, new pko(pvd0.f181715c), pvd0.f181721h), pvd0.f181717d);

    public vwd0(pgo pgoVar, wkb0 wkb0Var) {
        this.f245472a = pgoVar;
        this.f245473b = wkb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m86555a(vwd0 vwd0Var, String str, ibk ibkVar) {
        swd0 swd0Var;
        vwd0Var.getClass();
        if (ibkVar instanceof swd0) {
            swd0Var = (swd0) ibkVar;
            int i = swd0Var.f214648c;
            if ((i & Integer.MIN_VALUE) != 0) {
                swd0Var.f214648c = i - Integer.MIN_VALUE;
            } else {
                swd0Var = new swd0(vwd0Var, ibkVar);
            }
        } else {
            swd0Var = new swd0(vwd0Var, ibkVar);
        }
        Object objM86557c = swd0Var.f214646a;
        int i2 = swd0Var.f214648c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86557c);
                tjo tjoVar = vwd0Var.f245475d;
                swd0Var.f214648c = 1;
                objM86557c = vwd0Var.m86557c(tjoVar, str, swd0Var);
                Object obj = yuk.f276404a;
                if (objM86557c == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86557c);
            }
            long jM33199r = cks.m33199r(((daj) objM86557c).f47050a, ils.MILLISECONDS);
            if (jM33199r > 0) {
                return new Long(jM33199r);
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r8 == r5) goto L30;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m86556b(vwd0 vwd0Var, String str, ibk ibkVar) {
        twd0 twd0Var;
        vwd0Var.getClass();
        if (ibkVar instanceof twd0) {
            twd0Var = (twd0) ibkVar;
            int i = twd0Var.f224422c;
            if ((i & Integer.MIN_VALUE) != 0) {
                twd0Var.f224422c = i - Integer.MIN_VALUE;
            } else {
                twd0Var = new twd0(vwd0Var, ibkVar);
            }
        } else {
            twd0Var = new twd0(vwd0Var, ibkVar);
        }
        Object objM96567o = twd0Var.f224420a;
        int i2 = twd0Var.f224422c;
        try {
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            bga.m29073P(objM96567o);
                            return new pwd0((vy81) objM96567o);
                        }
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM96567o);
                        wj50.m88279p(objM96567o);
                        return new owd0((s7f) objM96567o);
                    }
                    bga.m29073P(objM96567o);
                    Set set = dd41.f47702f;
                    gn80 gn80Var = r46.m74726U(str).f47709c;
                    gn80 gn80Var2 = gn80.SHOW_EPISODE;
                    Object obj = yuk.f276404a;
                    if (gn80Var == gn80Var2) {
                        tjo tjoVar = vwd0Var.f245474c;
                        Object qpu0Var = new qpu0(str, null, true, 2);
                        twd0Var.f224422c = 1;
                        objM96567o = vwd0Var.m86557c(tjoVar, qpu0Var, twd0Var);
                        if (objM96567o == obj) {
                        }
                        return new pwd0((vy81) objM96567o);
                    }
                    Single singleMo70632b = vwd0Var.f245473b.mo70632b(str, null);
                    twd0Var.f224422c = 2;
                    objM96567o = zn91.m96567o(singleMo70632b, twd0Var);
                    return obj;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Exception unused) {
                return null;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m86557c(tjo tjoVar, Object obj, ibk ibkVar) {
        rwd0 rwd0Var;
        if (ibkVar instanceof rwd0) {
            rwd0Var = (rwd0) ibkVar;
            int i = rwd0Var.f203325c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwd0Var.f203325c = i - Integer.MIN_VALUE;
            } else {
                rwd0Var = new rwd0(this, ibkVar);
            }
        } else {
            rwd0Var = new rwd0(this, ibkVar);
        }
        Object objM86756u = rwd0Var.f203323a;
        int i2 = rwd0Var.f203325c;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            ay7 ay7VarM41173v = fag1.m41173v(this.f245472a, tjoVar, obj);
            nx70 nx70Var = new nx70(2, 11, null);
            rwd0Var.f203325c = 1;
            objM86756u = vyf1.m86756u(ay7VarM41173v, nx70Var, rwd0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86756u);
        }
        qho qhoVar = (qho) objM86756u;
        if (qhoVar instanceof oho) {
            return ((oho) qhoVar).f165512a;
        }
        if (qhoVar instanceof nho) {
            throw new IllegalStateException(((nho) qhoVar).f154041a.getMessage());
        }
        throw new IllegalStateException("Unexpected DataResult state");
    }
}
