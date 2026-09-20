package p204p;

import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hfq implements jac {

    /* JADX INFO: renamed from: a */
    public final w2q f90777a;

    /* JADX INFO: renamed from: b */
    public final aqp f90778b;

    /* JADX INFO: renamed from: c */
    public final kqw f90779c;

    /* JADX INFO: renamed from: d */
    public final r7p f90780d;

    /* JADX INFO: renamed from: e */
    public final vac f90781e;

    /* JADX INFO: renamed from: f */
    public final luk f90782f;

    /* JADX INFO: renamed from: g */
    public final x3p f90783g;

    /* JADX INFO: renamed from: h */
    public final ifz f90784h;

    /* JADX INFO: renamed from: i */
    public final oac f90785i;

    /* JADX INFO: renamed from: j */
    public final w3p f90786j;

    /* JADX INFO: renamed from: k */
    public xuk f90787k;

    /* JADX INFO: renamed from: l */
    public final hb11 f90788l = j0g1.m52092t(0, 1, 0, 5);

    /* JADX INFO: renamed from: m */
    public final AtomicReference f90789m = new AtomicReference();

    /* JADX INFO: renamed from: n */
    public final LinkedHashSet f90790n = new LinkedHashSet();

    public hfq(w2q w2qVar, aqp aqpVar, kqw kqwVar, k47 k47Var, r7p r7pVar, vac vacVar, luk lukVar, x3p x3pVar, ifz ifzVar, oac oacVar, w3p w3pVar) {
        this.f90777a = w2qVar;
        this.f90778b = aqpVar;
        this.f90779c = kqwVar;
        this.f90780d = r7pVar;
        this.f90781e = vacVar;
        this.f90782f = lukVar;
        this.f90783g = x3pVar;
        this.f90784h = ifzVar;
        this.f90785i = oacVar;
        this.f90786j = w3pVar;
        this.f90787k = dq60.m36621u(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m47356c(hfq hfqVar, String str, fbk fbkVar) {
        cfq cfqVar;
        if (fbkVar instanceof cfq) {
            cfqVar = (cfq) fbkVar;
            int i = cfqVar.f37423d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfqVar.f37423d = i - Integer.MIN_VALUE;
            } else {
                cfqVar = new cfq(hfqVar, fbkVar);
            }
        } else {
            cfqVar = new cfq(hfqVar, fbkVar);
        }
        Object objMo66545a = cfqVar.f37421b;
        int i2 = cfqVar.f37423d;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objMo66545a);
                oac oacVar = hfqVar.f90785i;
                cfqVar.f37420a = str;
                cfqVar.f37423d = 1;
                objMo66545a = oacVar.mo66545a(cfqVar);
                yuk yukVar = yuk.f276404a;
                if (objMo66545a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = cfqVar.f37420a;
                bga.m29073P(objMo66545a);
            }
            c201 c201Var = (c201) objMo66545a;
            if (c201Var != null) {
                vbc vbcVarM31285a = c201Var.m31285a();
                if (!hv90.m48753v(vbcVarM31285a)) {
                    CastDevice castDeviceM85128b = vbcVarM31285a.m85128b();
                    String strM1482k = castDeviceM85128b != null ? castDeviceM85128b.m1482k() : null;
                    if (strM1482k != null) {
                        if (strM1482k.equals(str)) {
                        }
                    }
                    c201Var.f33265b.m76908b(true);
                    return w2a1Var;
                }
            }
            return w2a1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m6b.m60995j("Failed to end Cast session after logout: ", e2.getMessage());
            return w2a1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        if (r9.m47365j(r2, r10, r0) == r1) goto L61;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m47357d(hfq hfqVar, rui ruiVar, lwi lwiVar, fbk fbkVar) {
        ffq ffqVar;
        if (fbkVar instanceof ffq) {
            ffqVar = (ffq) fbkVar;
            int i = ffqVar.f69070e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ffqVar.f69070e = i - Integer.MIN_VALUE;
            } else {
                ffqVar = new ffq(hfqVar, fbkVar);
            }
        } else {
            ffqVar = new ffq(hfqVar, fbkVar);
        }
        Object objM47360e = ffqVar.f69068c;
        Object obj = yuk.f276404a;
        int i2 = ffqVar.f69070e;
        if (i2 != 0) {
            if (i2 == 1) {
                lwiVar = ffqVar.f69067b;
                ruiVar = ffqVar.f69066a;
                bga.m29073P(objM47360e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM47360e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM47360e);
        x3p x3pVar = hfqVar.f90783g;
        String strM76452b = ruiVar.m76452b();
        synchronized (x3pVar) {
            try {
                x3pVar.f257850c = strM76452b;
                x3pVar.f257851d = true;
                Iterator it = x3pVar.f257852e.iterator();
                while (it.hasNext()) {
                    x3pVar.m89811c((ybc) it.next());
                }
                x3pVar.f257852e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        hfqVar.f90783g.m89810b(ybc.TRANSFER_FROM_CORE_REQUESTED);
        if (((kzl0) hfqVar.f90781e).m57762c() && lwiVar == lwi.f137577b) {
            String strM76452b2 = ruiVar.m76452b();
            LinkedHashSet linkedHashSet = hfqVar.f90790n;
            if (strM76452b2 == null || !linkedHashSet.contains(strM76452b2)) {
                if (strM76452b2 != null) {
                    linkedHashSet.add(strM76452b2);
                }
                hfqVar.f90783g.m89810b(ybc.OUTPUT_SWITCHER_TRANSFER_SKIPPED);
                return w2a1.f247311a;
            }
        }
        ffqVar.f69066a = ruiVar;
        ffqVar.f69067b = lwiVar;
        ffqVar.f69070e = 1;
        objM47360e = hfqVar.m47360e(ruiVar, ffqVar);
        if (objM47360e != obj) {
        }
        return obj;
        pqm0 pqm0Var = (pqm0) objM47360e;
        rmx0 rmx0Var = (rmx0) pqm0Var.f180350a;
        List<rmx0> list = (List) pqm0Var.f180351b;
        list.size();
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (rmx0 rmx0Var2 : list) {
            arrayList.add(rmx0Var2.f200635a + "(spotify=" + rmx0Var2.f200647m + ")");
        }
        arrayList.toString();
        ruiVar.getClass();
        ((kzl0) hfqVar.f90781e).m57762c();
        Objects.toString(lwiVar);
        Object obj2 = null;
        if (rmx0Var == null) {
            for (Object obj3 : list) {
                if (hfqVar.m47364i((rmx0) obj3, ruiVar.m76451a())) {
                    obj2 = obj3;
                    break;
                }
            }
            if (!list.isEmpty()) {
                m6b.m60995j("No route found for ", ruiVar.m76451a());
            }
            hfqVar.f90783g.m89810b(ybc.CAST_ROUTE_NOT_FOUND);
            hfqVar.f90788l.mo46962a(new c591(ruiVar.m76451a()));
            return w2a1.f247311a;
        }
        String strM76452b3 = ruiVar.m76452b();
        ffqVar.f69066a = null;
        ffqVar.f69067b = null;
        ffqVar.f69070e = 2;
    }

    @Override // p204p.jac
    /* JADX INFO: renamed from: a */
    public final void mo47358a() {
        kk40.m56680v(this.f90787k, null);
        this.f90789m.set(null);
        this.f90790n.clear();
    }

    @Override // p204p.jac
    /* JADX INFO: renamed from: b */
    public final void mo47359b() {
        xuk xukVarM37073v = dv9.m37073v(this.f90787k, new edq(this, 2));
        this.f90787k = xukVarM37073v;
        fbk fbkVar = null;
        x0h1.m89578u(xukVarM37073v, null, 0, new C2069kx(this, fbkVar, 22), 3);
        x0h1.m89578u(this.f90787k, null, 0, new efq(this, fbkVar, 0), 3);
        x0h1.m89578u(this.f90787k, null, 0, new efq(this, fbkVar, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016a, code lost:
    
        if (r2 == r13) goto L65;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m47360e(rui ruiVar, ibk ibkVar) {
        teq teqVar;
        long jM31321a;
        long j;
        rui ruiVar2 = ruiVar;
        if (ibkVar instanceof teq) {
            teqVar = (teq) ibkVar;
            int i = teqVar.f219779e;
            if ((i & Integer.MIN_VALUE) != 0) {
                teqVar.f219779e = i - Integer.MIN_VALUE;
            } else {
                teqVar = new teq(this, ibkVar);
            }
        } else {
            teqVar = new teq(this, ibkVar);
        }
        Object objM76980u = teqVar.f219777c;
        int i2 = teqVar.f219779e;
        aqp aqpVar = this.f90778b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            ArrayList arrayListM26885d = aqpVar.m26885d();
            rmx0 rmx0VarM47362g = m47362g(ruiVar2, arrayListM26885d);
            if (rmx0VarM47362g != null) {
                return pft0.m69840u(rmx0VarM47362g, arrayListM26885d);
            }
            jM31321a = this.f90784h.m31321a();
            if (jM31321a <= 0) {
                return pft0.m69840u(m47363h(ruiVar2, arrayListM26885d), arrayListM26885d);
            }
            arrayListM26885d.size();
            if (!arrayListM26885d.isEmpty()) {
                Iterator it = arrayListM26885d.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if (((rmx0) it.next()).f200647m && (i3 = i3 + 1) < 0) {
                        h6f.m46721R();
                        throw null;
                    }
                }
            }
            xeq xeqVar = new xeq(this, ruiVar2, fbkVar, 1);
            teqVar.f219775a = ruiVar2;
            teqVar.f219776b = jM31321a;
            teqVar.f219779e = 1;
            objM76980u = s1h1.m76980u(jM31321a, xeqVar, teqVar);
            if (objM76980u != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            jM31321a = teqVar.f219776b;
            ruiVar2 = teqVar.f219775a;
            bga.m29073P(objM76980u);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = teqVar.f219776b;
            ruiVar2 = teqVar.f219775a;
            bga.m29073P(objM76980u);
        }
        pqm0 pqm0Var = (pqm0) objM76980u;
        if (pqm0Var != null) {
            rmx0 rmx0Var = (rmx0) pqm0Var.f180350a;
            String str = rmx0Var.f200635a;
            boolean z = rmx0Var.f200647m;
            return pqm0Var;
        }
        ArrayList arrayListM26885d2 = aqpVar.m26885d();
        Logger.m3966b("CastBasic->%s", "No matching route for " + ruiVar2.m76451a() + " after " + (((long) 2) * j) + "ms (" + arrayListM26885d2.size() + " routes)");
        return pft0.m69840u(null, arrayListM26885d2);
        j = jM31321a;
        pqm0 pqm0Var2 = (pqm0) objM76980u;
        if (pqm0Var2 != null) {
            Object obj = pqm0Var2.f180351b;
            ((List) obj).size();
            Iterable iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    if (((rmx0) it2.next()).f200647m && (i4 = i4 + 1) < 0) {
                        h6f.m46721R();
                        throw null;
                    }
                }
            }
            return pqm0Var2;
        }
        ArrayList arrayListM26885d3 = aqpVar.m26885d();
        rmx0 rmx0VarM47363h = m47363h(ruiVar2, arrayListM26885d3);
        if (rmx0VarM47363h != null) {
            Logger.m3973i("CastBasic->%s", "Preferred not found within " + j + "ms, using fallback " + rmx0VarM47363h.f200635a + " (isProvidedBySpotify=" + rmx0VarM47363h.f200647m + ", " + arrayListM26885d3.size() + " routes)");
            return pft0.m69840u(rmx0VarM47363h, arrayListM26885d3);
        }
        Logger.m3973i("CastBasic->%s", "No matching route after " + j + "ms (" + arrayListM26885d3.size() + " routes); extending await for discovery...");
        xeq xeqVar2 = new xeq(this, ruiVar2, fbkVar, 0);
        teqVar.f219775a = ruiVar2;
        teqVar.f219776b = j;
        teqVar.f219779e = 2;
        objM76980u = s1h1.m76980u(j, xeqVar2, teqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m47361f(ibk ibkVar) {
        zeq zeqVar;
        if (ibkVar instanceof zeq) {
            zeqVar = (zeq) ibkVar;
            int i = zeqVar.f282096c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zeqVar.f282096c = i - Integer.MIN_VALUE;
            } else {
                zeqVar = new zeq(this, ibkVar);
            }
        } else {
            zeqVar = new zeq(this, ibkVar);
        }
        Object objMo66545a = zeqVar.f282094a;
        int i2 = zeqVar.f282096c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo66545a);
            zeqVar.f282096c = 1;
            objMo66545a = this.f90785i.mo66545a(zeqVar);
            if (objMo66545a != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo66545a);
            return w2a1Var;
        }
        bga.m29073P(objMo66545a);
        c201 c201Var = (c201) objMo66545a;
        if (c201Var != null) {
            vbc vbcVarM31285a = c201Var.m31285a();
            if (!hv90.m48753v(vbcVarM31285a)) {
                fol folVar = new fol(c201Var, this, vbcVarM31285a, (fbk) null, 18);
                zeqVar.f282096c = 2;
                if (kk40.m56684z(folVar, zeqVar) == yukVar) {
                    return yukVar;
                }
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: g */
    public final rmx0 m47362g(rui ruiVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!m47364i((rmx0) next, ruiVar.m76451a()));
        rmx0 rmx0Var = (rmx0) next;
        if (!((kzl0) this.f90781e).m57762c()) {
            return rmx0Var;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((rmx0) obj2).f200647m) {
                arrayList.add(obj2);
            }
        }
        for (Object obj3 : arrayList) {
            if (wj50.m88271j(((rmx0) obj3).f200636b, rmx0Var != null ? rmx0Var.f200636b : null)) {
                obj = obj3;
                break;
            }
        }
        return (rmx0) obj;
    }

    /* JADX INFO: renamed from: h */
    public final rmx0 m47363h(rui ruiVar, List list) {
        Object obj;
        Object next;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!m47364i((rmx0) next, ruiVar.m76451a()));
        rmx0 rmx0Var = (rmx0) next;
        if (((kzl0) this.f90781e).m57762c()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((rmx0) obj2).f200647m) {
                    arrayList.add(obj2);
                }
            }
            for (Object obj3 : arrayList) {
                if (wj50.m88271j(((rmx0) obj3).f200636b, rmx0Var != null ? rmx0Var.f200636b : null)) {
                    obj = obj3;
                    break;
                }
            }
            rmx0 rmx0Var2 = (rmx0) obj;
            if (rmx0Var2 != null) {
                return rmx0Var2;
            }
        }
        return rmx0Var;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m47364i(rmx0 rmx0Var, String str) {
        rac racVarM55355r = k47.m55355r(rmx0Var.f200645k);
        String str2 = racVarM55355r != null ? racVarM55355r.f197252a : null;
        return str2 != null ? str2.equals(str) : wj50.m88271j(rpg1.m76180u(rmx0Var.f200635a), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m47365j(rmx0 rmx0Var, String str, ibk ibkVar) {
        gfq gfqVar;
        if (ibkVar instanceof gfq) {
            gfqVar = (gfq) ibkVar;
            int i = gfqVar.f79437e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gfqVar.f79437e = i - Integer.MIN_VALUE;
            } else {
                gfqVar = new gfq(this, ibkVar);
            }
        } else {
            gfqVar = new gfq(this, ibkVar);
        }
        Object obj = gfqVar.f79435c;
        int i2 = gfqVar.f79437e;
        if (i2 == 0) {
            bga.m29073P(obj);
            wmd0 wmd0Var = rmx0Var.f200646l;
            if (wmd0Var != null) {
                wmd0Var.m88559f();
            }
            gfqVar.f79433a = rmx0Var;
            gfqVar.f79434b = str;
            gfqVar.f79437e = 1;
            Object objM47361f = m47361f(gfqVar);
            Object obj2 = yuk.f276404a;
            if (objM47361f == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = gfqVar.f79434b;
            rmx0Var = gfqVar.f79433a;
            bga.m29073P(obj);
        }
        this.f90788l.mo46962a(new d591(rmx0Var.f200635a, str));
        q191.m71886D(rmx0Var);
        this.f90783g.m89810b(ybc.MEDIA_ROUTE_SELECT_CALLED);
        return w2a1.f247311a;
    }
}
