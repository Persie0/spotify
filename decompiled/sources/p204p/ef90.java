package p204p;

import io.reactivex.rxjava3.core.Flowable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ef90 implements adu0 {

    /* JADX INFO: renamed from: a */
    public final idk f58990a;

    /* JADX INFO: renamed from: b */
    public final epx f58991b;

    /* JADX INFO: renamed from: c */
    public final Flowable f58992c;

    /* JADX INFO: renamed from: d */
    public final i4t0 f58993d;

    public ef90(idk idkVar, epx epxVar, Flowable flowable, zpn zpnVar) {
        this.f58990a = idkVar;
        this.f58991b = epxVar;
        this.f58992c = flowable;
        this.f58993d = zpnVar;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: a */
    public final boolean mo25622a() {
        return false;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: b */
    public final Object mo25623b(ju61 ju61Var, String str, mb61 mb61Var) {
        return w2a1.f247311a;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: c */
    public final List mo25624c() {
        return lau.f131415a;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: d */
    public final Object mo25625d(ju61 ju61Var, fbk fbkVar) {
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        if (r13 == r4) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [p.ef90] */
    @Override // p204p.adu0
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo25626e(ju61 ju61Var, String str, String str2, ibk ibkVar) {
        cf90 cf90Var;
        ?? arrayList;
        ?? r10;
        pua1 pua1Var;
        String strM29347H;
        String strM66718b;
        String str3;
        o340 o340Var;
        String strM66183c;
        if (ibkVar instanceof cf90) {
            cf90Var = (cf90) ibkVar;
            int i = cf90Var.f37307e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cf90Var.f37307e = i - Integer.MIN_VALUE;
            } else {
                cf90Var = new cf90(this, ibkVar);
            }
        } else {
            cf90Var = new cf90(this, ibkVar);
        }
        Object objM38721i = cf90Var.f37305c;
        int i2 = cf90Var.f37307e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM38721i);
            cf90Var.f37303a = str;
            cf90Var.f37307e = 1;
            objM38721i = m38721i(ju61Var, cf90Var);
            if (objM38721i != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = cf90Var.f37303a;
            bga.m29073P(objM38721i);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = cf90Var.f37304b;
            bga.m29073P(objM38721i);
            r10 = list;
        }
        Map map = (Map) objM38721i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = r10.iterator();
        while (true) {
            String str4 = "";
            if (!it.hasNext()) {
                return new dpm0(arrayList2, "");
            }
            ock ockVar = (ock) it.next();
            hra hraVarM66719c = ockVar.m66719c();
            bik bikVar = hraVarM66719c instanceof bik ? (bik) hraVarM66719c : null;
            if (bikVar == null || (strM29347H = bikVar.m29347H()) == null || (strM66718b = ockVar.m66718b()) == null) {
                pua1Var = null;
            } else {
                String strM88469S0 = wl51.m88469S0(strM66718b, "spotify:user:");
                eua1 eua1Var = (eua1) map.get(strM66718b);
                if (eua1Var == null || (str3 = eua1Var.f62930b) == null) {
                    str3 = strM88469S0;
                }
                if (eua1Var != null && (o340Var = (o340) g6f.m43745s0(eua1Var.f62933e)) != null && (strM66183c = o340Var.m66183c()) != null) {
                    str4 = strM66183c;
                }
                nua1 nua1Var = new nua1(str3, strM88469S0, str4);
                Long lM66717a = ockVar.m66717a();
                pua1Var = new pua1(nua1Var, strM29347H, lM66717a != null ? lM66717a.longValue() : 0L);
            }
            if (pua1Var != null) {
                arrayList2.add(pua1Var);
            }
        }
        List list2 = (List) objM38721i;
        if (str != null) {
            arrayList = new ArrayList();
            for (Object obj : list2) {
                hra hraVarM66719c2 = ((ock) obj).m66719c();
                bik bikVar2 = hraVarM66719c2 instanceof bik ? (bik) hraVarM66719c2 : null;
                if (wj50.m88271j(bikVar2 != null ? bikVar2.m29347H() : null, str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = list2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strM66718b2 = ((ock) it2.next()).m66718b();
            if (strM66718b2 != null) {
                arrayList3.add(strM66718b2);
            }
        }
        List listM43727j0 = g6f.m43727j0(arrayList3);
        cf90Var.f37303a = null;
        cf90Var.f37304b = arrayList;
        cf90Var.f37307e = 2;
        objM38721i = m38722j(listM43727j0, cf90Var);
        r10 = arrayList;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: f */
    public final boolean mo25627f(ju61 ju61Var) {
        return bm51.m29803n0(ju61Var.m54330a(), "spotify:listeningactivity:", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.adu0
    /* JADX INFO: renamed from: g */
    public final Serializable mo25628g(ju61 ju61Var, ibk ibkVar) {
        df90 df90Var;
        if (ibkVar instanceof df90) {
            df90Var = (df90) ibkVar;
            int i = df90Var.f48531c;
            if ((i & Integer.MIN_VALUE) != 0) {
                df90Var.f48531c = i - Integer.MIN_VALUE;
            } else {
                df90Var = new df90(this, ibkVar);
            }
        } else {
            df90Var = new df90(this, ibkVar);
        }
        Object objM38721i = df90Var.f48529a;
        int i2 = df90Var.f48531c;
        if (i2 == 0) {
            bga.m29073P(objM38721i);
            df90Var.f48531c = 1;
            objM38721i = m38721i(ju61Var, df90Var);
            yuk yukVar = yuk.f276404a;
            if (objM38721i == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM38721i);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objM38721i).iterator();
        while (it.hasNext()) {
            hra hraVarM66719c = ((ock) it.next()).m66719c();
            bik bikVar = hraVarM66719c instanceof bik ? (bik) hraVarM66719c : null;
            String strM29347H = bikVar != null ? bikVar.m29347H() : null;
            if (strM29347H != null) {
                arrayList.add(strM29347H);
            }
        }
        Map mapM54469s = jwg1.m54469s(new jw4(arrayList));
        ArrayList arrayList2 = new ArrayList(mapM54469s.size());
        for (Map.Entry entry : mapM54469s.entrySet()) {
            arrayList2.add(new xcu0((String) entry.getKey(), ((Number) entry.getValue()).intValue()));
        }
        return arrayList2;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: h */
    public final pk20 mo25629h(ju61 ju61Var, klu0 klu0Var) {
        return new pk20(new nfu0(wl51.m88486j1(wl51.m88469S0(ju61Var.m54330a(), "spotify:listeningactivity:"), "?")), (dut) this.f58993d.get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        if (r1 == r9) goto L32;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m38721i(ju61 ju61Var, ibk ibkVar) {
        af90 af90Var;
        ju61 ju61Var2;
        rl71 rl71Var;
        if (ibkVar instanceof af90) {
            af90Var = (af90) ibkVar;
            int i = af90Var.f15098d;
            if ((i & Integer.MIN_VALUE) != 0) {
                af90Var.f15098d = i - Integer.MIN_VALUE;
            } else {
                af90Var = new af90(this, ibkVar);
            }
        } else {
            af90Var = new af90(this, ibkVar);
        }
        Object objM76978s = af90Var.f15096b;
        int i2 = af90Var.f15098d;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM76978s);
            q950 q950Var = new q950(this, fbkVar, 22);
            ju61Var2 = ju61Var;
            af90Var.f15095a = ju61Var2;
            af90Var.f15098d = 1;
            objM76978s = s1h1.m76978s(5000L, q950Var, af90Var);
            if (objM76978s != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            ju61Var2 = af90Var.f15095a;
            bga.m29073P(objM76978s);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76978s);
        }
        List list = (List) objM76978s;
        if (list != null) {
            return list;
        }
        return lau.f131415a;
        String str = (String) objM76978s;
        String strM88486j1 = wl51.m88486j1(wl51.m88469S0(ju61Var2.m54330a(), "spotify:listeningactivity:"), "?");
        Long lM29808s0 = bm51.m29808s0(10, wl51.m88486j1(wl51.m88481e1(wl51.m88481e1(ju61Var2.m54330a(), "?", ""), "playTimestamp=", ""), "&"));
        if (lM29808s0 != null) {
            long jLongValue = lM29808s0.longValue();
            rl71Var = new rl71(Long.valueOf(jLongValue - 86400), Long.valueOf(jLongValue + 86400));
        } else {
            rl71Var = null;
        }
        bek bekVarM26757o = aq7.m26757o(str, strM88486j1, rl71Var);
        pjo pjoVar = (pjo) this.f58990a.mo28093b(Collections.singleton(bekVarM26757o)).get(bekVarM26757o);
        if (pjoVar instanceof ojo) {
            return ((ojo) pjoVar).f166104a;
        }
        if (!(pjoVar instanceof mjo)) {
            g090 g090Var = new g090(this, bekVarM26757o, fbkVar, 14);
            af90Var.f15095a = null;
            af90Var.f15098d = 2;
            objM76978s = s1h1.m76980u(5000L, g090Var, af90Var);
        }
        return lau.f131415a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m38722j(List list, ibk ibkVar) {
        bf90 bf90Var;
        if (ibkVar instanceof bf90) {
            bf90Var = (bf90) ibkVar;
            int i = bf90Var.f26647c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bf90Var.f26647c = i - Integer.MIN_VALUE;
            } else {
                bf90Var = new bf90(this, ibkVar);
            }
        } else {
            bf90Var = new bf90(this, ibkVar);
        }
        Object objM76980u = bf90Var.f26645a;
        int i2 = bf90Var.f26647c;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            if (!list.isEmpty()) {
                g090 g090Var = new g090(this, list, fbkVar, 15);
                bf90Var.f26647c = 1;
                objM76980u = s1h1.m76980u(5000L, g090Var, bf90Var);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            }
            return nau.f152117a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM76980u);
        gqx gqxVar = (gqx) objM76980u;
        if (gqxVar != null) {
            List<fqx> listMo45450b = gqxVar.mo45450b(eua1.class);
            ArrayList arrayList = new ArrayList();
            for (fqx fqxVar : listMo45450b) {
                eua1 eua1Var = (eua1) fqxVar.f72301b;
                pqm0 pqm0VarM69840u = eua1Var != null ? pft0.m69840u(fqxVar.f72300a, eua1Var) : null;
                if (pqm0VarM69840u != null) {
                    arrayList.add(pqm0VarM69840u);
                }
            }
            return kkc0.m56705r0(arrayList);
        }
        return nau.f152117a;
    }
}
