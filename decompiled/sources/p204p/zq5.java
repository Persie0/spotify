package p204p;

import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zq5 extends d6a0 {

    /* JADX INFO: renamed from: d */
    public final br5 f285309d;

    /* JADX INFO: renamed from: e */
    public final epx f285310e;

    /* JADX INFO: renamed from: f */
    public final luk f285311f;

    /* JADX INFO: renamed from: g */
    public c9k f285312g;

    /* JADX INFO: renamed from: h */
    public final zv41 f285313h;

    /* JADX INFO: renamed from: i */
    public final zv41 f285314i;

    /* JADX INFO: renamed from: t */
    public final x5m f285315t;

    public zq5(br5 br5Var, epx epxVar, w5m w5mVar, luk lukVar) {
        this.f285309d = br5Var;
        this.f285310e = epxVar;
        this.f285311f = lukVar;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f285313h = zv41VarM52819d;
        this.f285314i = zv41VarM52819d;
        this.f285315t = w5m.m87255a(w5mVar, new ysk(gbu.f78413a, 27), br5Var.f29970b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.zq5] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX INFO: renamed from: k */
    public static final Serializable m96717k(zq5 zq5Var, List list, ibk ibkVar) {
        sq5 sq5Var;
        ?? c6x0Var;
        if (ibkVar instanceof sq5) {
            sq5Var = (sq5) ibkVar;
            int i = sq5Var.f213017d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sq5Var.f213017d = i - Integer.MIN_VALUE;
            } else {
                sq5Var = new sq5(zq5Var, ibkVar);
            }
        } else {
            sq5Var = new sq5(zq5Var, ibkVar);
        }
        Object objM96722p = sq5Var.f213015b;
        int i2 = sq5Var.f213017d;
        nau nauVar = nau.f152117a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96722p);
                if (list.isEmpty()) {
                    return nauVar;
                }
                C2602y6 c2602y6 = new C2602y6(2, list);
                sq5Var.f213014a = list;
                sq5Var.f213017d = 1;
                objM96722p = zq5Var.m96722p(c2602y6, sq5Var);
                yuk yukVar = yuk.f276404a;
                if (objM96722p == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = sq5Var.f213014a;
                bga.m29073P(objM96722p);
            }
            gqx gqxVar = (gqx) objM96722p;
            int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            c6x0Var = new LinkedHashMap(iM31820L);
            for (Object obj : list) {
                c6x0Var.put(obj, (v140) gqxVar.mo45449a(v140.class, (String) obj).f72301b);
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        return c6x0Var instanceof c6x0 ? nauVar : c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.zq5] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX INFO: renamed from: l */
    public static final Serializable m96718l(zq5 zq5Var, List list, ibk ibkVar) {
        tq5 tq5Var;
        ?? c6x0Var;
        m340 m340Var;
        z240 z240VarM60640a;
        if (ibkVar instanceof tq5) {
            tq5Var = (tq5) ibkVar;
            int i = tq5Var.f222711d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tq5Var.f222711d = i - Integer.MIN_VALUE;
            } else {
                tq5Var = new tq5(zq5Var, ibkVar);
            }
        } else {
            tq5Var = new tq5(zq5Var, ibkVar);
        }
        Object objM96722p = tq5Var.f222709b;
        int i2 = tq5Var.f222711d;
        nau nauVar = nau.f152117a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96722p);
                if (list.isEmpty()) {
                    return nauVar;
                }
                C2602y6 c2602y6 = new C2602y6(3, list);
                tq5Var.f222708a = list;
                tq5Var.f222711d = 1;
                objM96722p = zq5Var.m96722p(c2602y6, tq5Var);
                yuk yukVar = yuk.f276404a;
                if (objM96722p == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = tq5Var.f222708a;
                bga.m29073P(objM96722p);
            }
            gqx gqxVar = (gqx) objM96722p;
            int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            c6x0Var = new LinkedHashMap(iM31820L);
            for (Object obj : list) {
                erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, (String) obj).f72301b;
                c6x0Var.put(obj, (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null) ? null : z240VarM60640a.f278475a.f198763a);
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        return c6x0Var instanceof c6x0 ? nauVar : c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r10 == r7) goto L29;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m96719m(zq5 zq5Var, String str, ibk ibkVar) {
        xq5 xq5Var;
        zv41 zv41Var = zq5Var.f285313h;
        if (ibkVar instanceof xq5) {
            xq5Var = (xq5) ibkVar;
            int i = xq5Var.f264879d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xq5Var.f264879d = i - Integer.MIN_VALUE;
            } else {
                xq5Var = new xq5(zq5Var, ibkVar);
            }
        } else {
            xq5Var = new xq5(zq5Var, ibkVar);
        }
        Object objM96721o = xq5Var.f264877b;
        int i2 = xq5Var.f264879d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96721o);
            if (str.length() == 0) {
                zq5Var.m35105h(new Throwable("Entity URI is empty"));
                return w2a1Var;
            }
            zv41Var.m97090l(null);
            xq5Var.f264876a = str;
            xq5Var.f264879d = 1;
            objM96721o = zq5Var.m96721o(str, xq5Var);
            if (objM96721o != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = xq5Var.f264876a;
            bga.m29073P(objM96721o);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96721o);
        }
        rq5 rq5Var = (rq5) objM96721o;
        zv41Var.m97090l(rq5Var);
        ArrayList arrayList = rq5Var.f201756a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jr6) it.next()).f115092a);
        }
        zq5Var.f285315t.mo28300a(g6f.m43736n1(arrayList2));
        if (rq5Var.f201756a.isEmpty()) {
            zq5Var.m35105h(new Throwable("No entities available"));
            return w2a1Var;
        }
        zq5Var.m35106i();
        return w2a1Var;
        v140 v140Var = (v140) objM96721o;
        if (v140Var == null) {
            zq5Var.m35105h(new Throwable(edb.m38564m("IdentityTrait not available for ", str)));
            return w2a1Var;
        }
        xq5Var.f264876a = null;
        xq5Var.f264879d = 2;
        objM96721o = zq5Var.m96720n(v140Var, xq5Var);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        if (m35103d()) {
            return;
        }
        c9k c9kVar = this.f285312g;
        fbk fbkVar = null;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        c9k c9kVarM56661c = kk40.m56661c(this.f285311f);
        this.f285312g = c9kVarM56661c;
        this.f285315t.start();
        m35107j();
        x0h1.m89578u(c9kVarM56661c, null, 0, new cg5(this, fbkVar, 1), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        this.f285315t.stop();
        c9k c9kVar = this.f285312g;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f285312g = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List, p.ro80] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX INFO: renamed from: n */
    public final Object m96720n(v140 v140Var, ibk ibkVar) {
        uq5 uq5Var;
        String str;
        if (ibkVar instanceof uq5) {
            uq5Var = (uq5) ibkVar;
            int i = uq5Var.f232932d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uq5Var.f232932d = i - Integer.MIN_VALUE;
            } else {
                uq5Var = new uq5(this, ibkVar);
            }
        } else {
            uq5Var = new uq5(this, ibkVar);
        }
        Object objM56684z = uq5Var.f232930b;
        int i2 = uq5Var.f232932d;
        ?? jr6Var = 0;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            ?? M44508o = geg1.m44508o();
            List list = v140Var.f236246d;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((t140) it.next()).f216154b);
            }
            M44508o.addAll(arrayList);
            u140 u140Var = v140Var.f236247e;
            if (u140Var != null && (str = u140Var.f225679b) != null) {
                M44508o.add(str);
            }
            wj0 wj0Var = new wj0(this, geg1.m44506m(M44508o), (fbk) jr6Var, 6);
            uq5Var.f232929a = v140Var;
            uq5Var.f232932d = 1;
            objM56684z = kk40.m56684z(wj0Var, uq5Var);
            yuk yukVar = yuk.f276404a;
            if (objM56684z == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v140Var = uq5Var.f232929a;
            bga.m29073P(objM56684z);
        }
        pqm0 pqm0Var = (pqm0) objM56684z;
        ?? r0 = (Map) pqm0Var.f180350a;
        Map map = (Map) pqm0Var.f180351b;
        List<t140> list2 = v140Var.f236246d;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
        for (t140 t140Var : list2) {
            String str2 = t140Var.f216154b;
            String str3 = t140Var.f216153a;
            v140 v140Var2 = (v140) r0.get(str2);
            String str4 = v140Var2 != null ? v140Var2.f236244b : null;
            if (str4 == null) {
                str4 = "";
            }
            arrayList2.add(new jr6(str2, str3, str4, (String) map.get(t140Var.f216154b), true));
        }
        u140 u140Var2 = v140Var.f236247e;
        if (u140Var2 != null) {
            String str5 = u140Var2.f225679b;
            String str6 = u140Var2.f225678a;
            v140 v140Var3 = (v140) r0.get(str5);
            String str7 = v140Var3 != null ? v140Var3.f236244b : null;
            jr6Var = new jr6(str5, str6, str7 == null ? "" : str7, (String) map.get(u140Var2.f225679b), false);
        }
        return new rq5(g6f.m43700N0(h6f.m46716M(jr6Var), arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m96721o(String str, ibk ibkVar) {
        wq5 wq5Var;
        if (ibkVar instanceof wq5) {
            wq5Var = (wq5) ibkVar;
            int i = wq5Var.f253933d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wq5Var.f253933d = i - Integer.MIN_VALUE;
            } else {
                wq5Var = new wq5(this, ibkVar);
            }
        } else {
            wq5Var = new wq5(this, ibkVar);
        }
        Object objM96722p = wq5Var.f253931b;
        int i2 = wq5Var.f253933d;
        if (i2 == 0) {
            bga.m29073P(objM96722p);
            gh00 zz4Var = new zz4(str, 1);
            wq5Var.f253930a = str;
            wq5Var.f253933d = 1;
            objM96722p = m96722p(zz4Var, wq5Var);
            Object obj = yuk.f276404a;
            if (objM96722p == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = wq5Var.f253930a;
            bga.m29073P(objM96722p);
        }
        return ((gqx) objM96722p).mo45449a(v140.class, str).f72301b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m96722p(gh00 gh00Var, ibk ibkVar) {
        yq5 yq5Var;
        if (ibkVar instanceof yq5) {
            yq5Var = (yq5) ibkVar;
            int i = yq5Var.f275151c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yq5Var.f275151c = i - Integer.MIN_VALUE;
            } else {
                yq5Var = new yq5(this, ibkVar);
            }
        } else {
            yq5Var = new yq5(this, ibkVar);
        }
        Object obj = yq5Var.f275149a;
        int i2 = yq5Var.f275151c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single singleFirstOrError = ((jpx) this.f285310e).m53978b(new C1668ai("artist-attribution-sheet", false, gh00Var)).filter(t0b1.f215835h).firstOrError();
        yq5Var.f275151c = 1;
        Object objM96567o = zn91.m96567o(singleFirstOrError, yq5Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }
}
