package p204p;

import com.spotify.collection_esperanto.proto.Status;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class pqa implements tpk, Predicate, BiFunction, Function, Function3, Function4, Init, giv, x3x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180244a;

    /* JADX INFO: renamed from: b */
    public static final pqa f180235b = new pqa(0);

    /* JADX INFO: renamed from: c */
    public static final pqa f180236c = new pqa(1);

    /* JADX INFO: renamed from: d */
    public static final pqa f180237d = new pqa(2);

    /* JADX INFO: renamed from: e */
    public static final pqa f180238e = new pqa(3);

    /* JADX INFO: renamed from: f */
    public static final pqa f180239f = new pqa(4);

    /* JADX INFO: renamed from: g */
    public static final pqa f180240g = new pqa(5);

    /* JADX INFO: renamed from: h */
    public static final pqa f180241h = new pqa(6);

    /* JADX INFO: renamed from: i */
    public static final pqa f180242i = new pqa(7);

    /* JADX INFO: renamed from: t */
    public static final pqa f180243t = new pqa(8);

    /* JADX INFO: renamed from: X */
    public static final pqa f180228X = new pqa(9);

    /* JADX INFO: renamed from: Y */
    public static final pqa f180230Y = new pqa(10);

    /* JADX INFO: renamed from: Z */
    public static final pqa f180232Z = new pqa(11);

    /* JADX INFO: renamed from: L0 */
    public static final pqa f180216L0 = new pqa(12);

    /* JADX INFO: renamed from: M0 */
    public static final pqa f180217M0 = new pqa(13);

    /* JADX INFO: renamed from: N0 */
    public static final pqa f180218N0 = new pqa(14);

    /* JADX INFO: renamed from: O0 */
    public static final pqa f180219O0 = new pqa(15);

    /* JADX INFO: renamed from: P0 */
    public static final pqa f180220P0 = new pqa(16);

    /* JADX INFO: renamed from: Q0 */
    public static final pqa f180221Q0 = new pqa(17);

    /* JADX INFO: renamed from: R0 */
    public static final pqa f180222R0 = new pqa(18);

    /* JADX INFO: renamed from: S0 */
    public static final pqa f180223S0 = new pqa(20);

    /* JADX INFO: renamed from: T0 */
    public static final pqa f180224T0 = new pqa(21);

    /* JADX INFO: renamed from: U0 */
    public static final pqa f180225U0 = new pqa(22);

    /* JADX INFO: renamed from: V0 */
    public static final pqa f180226V0 = new pqa(23);

    /* JADX INFO: renamed from: W0 */
    public static final pqa f180227W0 = new pqa(24);

    /* JADX INFO: renamed from: X0 */
    public static final pqa f180229X0 = new pqa(26);

    /* JADX INFO: renamed from: Y0 */
    public static final pqa f180231Y0 = new pqa(27);

    /* JADX INFO: renamed from: Z0 */
    public static final pqa f180233Z0 = new pqa(28);

    /* JADX INFO: renamed from: a1 */
    public static final pqa f180234a1 = new pqa(29);

    public /* synthetic */ pqa(int i) {
        this.f180244a = i;
    }

    /* JADX INFO: renamed from: a */
    public static mnr m70622a(ppr pprVar, kdd1 kdd1Var) {
        String str;
        String contextUri = pprVar.getContextUri();
        String str2 = kdd1Var.f121665d;
        String contextUri2 = kdd1Var.f121671j;
        if (contextUri2.length() == 0) {
            contextUri2 = pprVar.getContextUri();
        }
        mpr mprVar = pprVar instanceof mpr ? (mpr) pprVar : null;
        if (mprVar == null || (str = mprVar.f146074g) == null) {
            str = "";
        }
        return new mnr(contextUri, str2, contextUri2, str);
    }

    /* JADX INFO: renamed from: b */
    public static HashSet m70623b(pnr... pnrVarArr) {
        HashSet hashSetM15571a = Effects.m15571a(new pnr[0]);
        Iterator it = ((ArrayList) bk5.m29582E0(pnrVarArr)).iterator();
        while (it.hasNext()) {
            hashSetM15571a.add((pnr) it.next());
        }
        return hashSetM15571a;
    }

    /* JADX INFO: renamed from: c */
    public static o49 m70624c(eik eikVar) {
        n5q n5qVar = xsr.f265651a;
        return jpg1.m53931m(t6x0.f217635Z, tlp.f221498c, null, new d67(27), new j20(eikVar, 11), null, 18);
    }

    /* JADX INFO: renamed from: d */
    public static ll20 m70625d(fpr fprVar, int i) {
        kdd1 kdd1Var = fprVar.f71961g;
        vwf vwfVar = kdd1Var != null ? (vwf) kdd1Var.f121663b.get(i) : null;
        pcd1 pcd1Var = vwfVar instanceof pcd1 ? (pcd1) vwfVar : null;
        if (pcd1Var != null) {
            return pcd1Var.mo44315g();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Integer m70626f(String str, kdd1 kdd1Var) {
        if (str == null) {
            return null;
        }
        Iterator it = kdd1Var.f121663b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (m70627g((vwf) it.next()).equals(str)) {
                return Integer.valueOf(i);
            }
            i++;
        }
        i = -1;
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: g */
    public static String m70627g(vwf vwfVar) {
        if (!(vwfVar instanceof pcd1)) {
            String strMo29110D = qpv0.f191387a.mo54112b(vwfVar.getClass()).mo29110D();
            if (strMo29110D != null) {
                return strMo29110D;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        pcd1 pcd1Var = (pcd1) vwfVar;
        String itemId = pcd1Var.getItemId();
        if (itemId != null) {
            if (itemId.length() <= 0) {
                itemId = null;
            }
            if (itemId != null) {
                return itemId;
            }
        }
        String uri = pcd1Var.getUri();
        return uri == null ? "" : uri;
    }

    /* JADX INFO: renamed from: h */
    public static List m70628h(int i, ArrayList arrayList) {
        if (i == h6f.m46714K(arrayList)) {
            return lau.f131415a;
        }
        List<vwf> listSubList = arrayList.subList(i + 1, arrayList.size());
        ArrayList arrayList2 = new ArrayList();
        for (vwf vwfVar : listSubList) {
            pcd1 pcd1Var = vwfVar instanceof pcd1 ? (pcd1) vwfVar : null;
            gej gejVarMo44314c = pcd1Var != null ? pcd1Var.mo44314c() : null;
            if (gejVarMo44314c != null) {
                arrayList2.add(gejVarMo44314c);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((gej) it.next()).mo37806m(), arrayList3);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: j */
    public static x811 m70629j(fpr fprVar, int i) {
        kdd1 kdd1Var = fprVar.f71961g;
        vwf vwfVar = kdd1Var != null ? (vwf) kdd1Var.f121663b.get(i) : null;
        pcd1 pcd1Var = vwfVar instanceof pcd1 ? (pcd1) vwfVar : null;
        if (pcd1Var != null) {
            return pcd1Var.mo50511j();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m70630m(fpr fprVar) {
        gej gejVarMo44314c;
        Integer num = fprVar.f71955a;
        if (num != null) {
            int iIntValue = num.intValue();
            kdd1 kdd1Var = fprVar.f71961g;
            vwf vwfVar = kdd1Var != null ? (vwf) kdd1Var.f121663b.get(iIntValue) : null;
            pcd1 pcd1Var = vwfVar instanceof pcd1 ? (pcd1) vwfVar : null;
            if (((pcd1Var == null || (gejVarMo44314c = pcd1Var.mo44314c()) == null) ? false : gejVarMo44314c.mo37805l()) || m70629j(fprVar, iIntValue) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object next;
        xul0 xul0Var = (xul0) obj;
        xul0 xul0Var2 = (xul0) obj2;
        List list = (List) obj3;
        Iterator it = list.iterator();
        do {
            obj4 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((api) next).mo26691g());
        xul0 xul0VarM92200a = xul0.m92200a(next);
        if (xul0VarM92200a.mo49279c()) {
            return xul0VarM92200a;
        }
        api apiVar = (api) xul0Var.mo49283h();
        api apiVar2 = (api) xul0Var2.mo49283h();
        if (apiVar == null || (apiVar2 != null && apiVar.mo26697m())) {
            apiVar = apiVar2;
        }
        xul0 xul0VarM92200a2 = xul0.m92200a(apiVar);
        if (xul0VarM92200a2.mo49279c()) {
            return xul0VarM92200a2;
        }
        for (Object obj5 : list) {
            if (((api) obj5).mo26697m()) {
                obj4 = obj5;
                break;
            }
        }
        return xul0.m92200a(obj4);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f180244a) {
            case 2:
                return new pqm0((x02) obj, (Long) obj2);
            case 9:
                return new y1y(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            default:
                return Boolean.valueOf(((CacheState) obj) == CacheState.LOADED && ((Boolean) obj2).booleanValue());
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((jys) obj);
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        return obj.toString();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f180244a) {
            case 1:
                gqx gqxVar = (gqx) obj;
                return gqxVar.mo45451c() || !((iqx) gqxVar).f104863f;
            default:
                return ((e301) obj).f55572b;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        return new mtw(((Boolean) obj2).booleanValue(), !((Boolean) obj).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        n5w n5wVar;
        switch (this.f180244a) {
            case 3:
                return Observable.empty();
            case 4:
                return new lg2((xe2) obj);
            case 5:
                return ((ph3) obj).f177454b.f117618a.f84784e;
            case 6:
                return Boolean.valueOf(((dh4) obj).f48976b);
            case 7:
                return ((GetEntityResponse) obj).m15422n().m15411o();
            case 8:
                return ((PlayerState) obj).playbackId();
            case 9:
            case 13:
            case 17:
            case 18:
            case 19:
            default:
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                return (ohoVar == null || (n5wVar = (n5w) ohoVar.f165512a) == null) ? new n5w(false, false, false, false, false) : n5wVar;
            case 10:
                return u48.f226620a;
            case 11:
                return new nd9((x6x0) obj);
            case 12:
                return (jby0) ((pqm0) obj).f180350a;
            case 14:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().mo49283h();
                if (contextTrack != null && e72.m37978L(contextTrack) && !e72.m37990X(contextTrack)) {
                    String strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_ALBUM_URI);
                    if (strM38000d0 == null) {
                        strM38000d0 = "";
                    }
                    return new poc(strM38000d0);
                }
                return ooc.f167528a;
            case 15:
                return new l1f(((Integer) obj).intValue());
            case 16:
                wgf wgfVar = (wgf) obj;
                return new ydf(wgfVar.f251053a, wgfVar.f251054b);
            case 20:
                if (((Boolean) obj).booleanValue()) {
                    return new u1j0(oeo.class, ttm0.f223644a, uzq0.f235620a);
                }
                return p1j0.f173119a;
            case 21:
                return Integer.valueOf(((Status) obj).m6851n());
            case 22:
                return Boolean.valueOf(((ik10) obj).equals(hk10.f92313c));
            case 23:
                return Boolean.valueOf(((op20) obj) == op20.f167738a);
        }
    }
}
