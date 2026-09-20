package p204p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class i7k {

    /* JADX INFO: renamed from: a */
    public final epx f99572a;

    public /* synthetic */ i7k(epx epxVar) {
        this.f99572a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Serializable m49869a(List list, ibk ibkVar) {
        wqr0 wqr0Var;
        ArrayList<String> arrayList;
        LinkedHashMap linkedHashMap;
        Object next;
        if (ibkVar instanceof wqr0) {
            wqr0Var = (wqr0) ibkVar;
            int i = wqr0Var.f254160e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wqr0Var.f254160e = i - Integer.MIN_VALUE;
            } else {
                wqr0Var = new wqr0(this, ibkVar);
            }
        } else {
            wqr0Var = new wqr0(this, ibkVar);
        }
        Object obj = wqr0Var.f254158c;
        int i2 = wqr0Var.f254160e;
        if (i2 == 0) {
            bga.m29073P(obj);
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add("spotify:user:" + ((sai) it.next()).m77642b());
            }
            int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                sai saiVar = (sai) it2.next();
                pqm0 pqm0VarM69840u = pft0.m69840u(edb.m38564m("spotify:user:", saiVar.m77642b()), "spotify:concert:" + saiVar.m77641a().m85084a());
                linkedHashMap2.put(pqm0VarM69840u.f180350a, pqm0VarM69840u.f180351b);
            }
            Flowable flowable = ((jpx) this.f99572a).m53978b(new C1668ai("concert-friend-matcher", new l24(22, arrayList2))).toFlowable(BackpressureStrategy.f7190d);
            d0k[] d0kVarArr = bmu0.f28619a;
            uxc0 uxc0Var = new uxc0(new onc(flowable), 15);
            wqr0Var.f254156a = arrayList2;
            wqr0Var.f254157b = linkedHashMap2;
            wqr0Var.f254160e = 1;
            Object objM86755t = vyf1.m86755t(uxc0Var, wqr0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
            arrayList = arrayList2;
            obj = objM86755t;
            linkedHashMap = linkedHashMap2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = wqr0Var.f254157b;
            arrayList = wqr0Var.f254156a;
            bga.m29073P(obj);
        }
        gqx gqxVar = (gqx) obj;
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList) {
            eua1 eua1Var = (eua1) gqxVar.mo45449a(eua1.class, str).f72301b;
            j2d0 j2d0Var = null;
            if (eua1Var != null) {
                String str2 = eua1Var.f62930b;
                Iterator it3 = eua1Var.f62933e.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        o340 o340Var = (o340) next;
                        int iM66182b = o340Var.m66182b() * o340Var.m66181a();
                        do {
                            Object next2 = it3.next();
                            o340 o340Var2 = (o340) next2;
                            int iM66182b2 = o340Var2.m66182b() * o340Var2.m66181a();
                            if (iM66182b < iM66182b2) {
                                next = next2;
                                iM66182b = iM66182b2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                o340 o340Var3 = (o340) next;
                String strM66183c = o340Var3 != null ? o340Var3.m66183c() : null;
                if (strM66183c == null) {
                    strM66183c = "";
                }
                String str3 = (String) linkedHashMap.get(str);
                j2d0Var = new j2d0(str, str2, strM66183c, str3 != null ? str3 : "");
            }
            if (j2d0Var != null) {
                arrayList3.add(j2d0Var);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public Object m49870b(String str, ibk ibkVar) {
        h7k h7kVar;
        if (ibkVar instanceof h7k) {
            h7kVar = (h7k) ibkVar;
            int i = h7kVar.f88481d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h7kVar.f88481d = i - Integer.MIN_VALUE;
            } else {
                h7kVar = new h7k(this, ibkVar);
            }
        } else {
            h7kVar = new h7k(this, ibkVar);
        }
        Object objM86756u = h7kVar.f88479b;
        int i2 = h7kVar.f88481d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86756u);
                if (wl51.m88460J0(str)) {
                    return new t8f0(new q8f0("Context URI cannot be empty"));
                }
                yab yabVarM54985d = k0e1.m54985d(((jpx) this.f99572a).m53978b(new C1668ai("listening_activity_context", new ivg(str, 23))));
                C2559x4 c2559x4 = new C2559x4(20);
                h7kVar.f88478a = str;
                h7kVar.f88481d = 1;
                objM86756u = vyf1.m86756u(yabVarM54985d, c2559x4, h7kVar);
                yuk yukVar = yuk.f276404a;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = h7kVar.f88478a;
                bga.m29073P(objM86756u);
            }
            v140 v140Var = (v140) ((gqx) objM86756u).mo45449a(v140.class, str).f72301b;
            return v140Var == null ? new t8f0(new s8f0("No IdentityTrait found for URI: ".concat(str))) : new u8f0(v140Var.f236243a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            e2.toString();
            return new t8f0(new r8f0(edb.m38564m("Failed to fetch context metadata: ", e2.getMessage())));
        }
    }

    /* JADX INFO: renamed from: c */
    public Single m49871c(String str) {
        return ((jpx) this.f99572a).m53978b(new C1668ai("aligned_curation", new zpz0(str, 15))).map(new ze8(str, 15)).filter(u6j0.f227359M0).map(jbr0.f110859Z).timeout(5L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).firstOrError().map(qgr0.f188539Z);
    }

    /* JADX INFO: renamed from: d */
    public Single m49872d(String str) {
        return m49871c(str).flatMap(new xvx0(17, this, str)).onErrorReturnItem(wr11.f254243a);
    }
}
