package p204p;

import com.comscore.streaming.ContentType;
import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class loq0 implements Function, yh00, Predicate, vg31, vja1, Init {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135534a;

    /* JADX INFO: renamed from: b */
    public static final loq0 f135522b = new loq0(0);

    /* JADX INFO: renamed from: c */
    public static final loq0 f135524c = new loq0(1);

    /* JADX INFO: renamed from: d */
    public static final loq0 f135526d = new loq0(2);

    /* JADX INFO: renamed from: e */
    public static final loq0 f135528e = new loq0(3);

    /* JADX INFO: renamed from: f */
    public static final loq0 f135529f = new loq0(4);

    /* JADX INFO: renamed from: g */
    public static final loq0 f135530g = new loq0(6);

    /* JADX INFO: renamed from: h */
    public static final loq0 f135531h = new loq0(7);

    /* JADX INFO: renamed from: i */
    public static final loq0 f135532i = new loq0(8);

    /* JADX INFO: renamed from: t */
    public static final loq0 f135533t = new loq0(9);

    /* JADX INFO: renamed from: X */
    public static final x4t0 f135515X = new x4t0(24);

    /* JADX INFO: renamed from: Y */
    public static final x4t0 f135517Y = new x4t0(25);

    /* JADX INFO: renamed from: Z */
    public static final x4t0 f135519Z = new x4t0(26);

    /* JADX INFO: renamed from: L0 */
    public static final x4t0 f135503L0 = new x4t0(27);

    /* JADX INFO: renamed from: M0 */
    public static final x4t0 f135504M0 = new x4t0(28);

    /* JADX INFO: renamed from: N0 */
    public static final loq0 f135505N0 = new loq0(11);

    /* JADX INFO: renamed from: O0 */
    public static final loq0 f135506O0 = new loq0(12);

    /* JADX INFO: renamed from: P0 */
    public static final loq0 f135507P0 = new loq0(13);

    /* JADX INFO: renamed from: Q0 */
    public static final loq0 f135508Q0 = new loq0(14);

    /* JADX INFO: renamed from: R0 */
    public static final loq0 f135509R0 = new loq0(15);

    /* JADX INFO: renamed from: S0 */
    public static final loq0 f135510S0 = new loq0(16);

    /* JADX INFO: renamed from: T0 */
    public static final loq0 f135511T0 = new loq0(17);

    /* JADX INFO: renamed from: U0 */
    public static final loq0 f135512U0 = new loq0(18);

    /* JADX INFO: renamed from: V0 */
    public static final loq0 f135513V0 = new loq0(20);

    /* JADX INFO: renamed from: W0 */
    public static final loq0 f135514W0 = new loq0(21);

    /* JADX INFO: renamed from: X0 */
    public static final loq0 f135516X0 = new loq0(22);

    /* JADX INFO: renamed from: Y0 */
    public static final loq0 f135518Y0 = new loq0(23);

    /* JADX INFO: renamed from: Z0 */
    public static final loq0 f135520Z0 = new loq0(24);

    /* JADX INFO: renamed from: a1 */
    public static final loq0 f135521a1 = new loq0(25);

    /* JADX INFO: renamed from: b1 */
    public static final loq0 f135523b1 = new loq0(26);

    /* JADX INFO: renamed from: c1 */
    public static final loq0 f135525c1 = new loq0(27);

    /* JADX INFO: renamed from: d1 */
    public static final loq0 f135527d1 = new loq0(28);

    public /* synthetic */ loq0(int i) {
        this.f135534a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final ArrayList m59580a(loq0 loq0Var, pqm0... pqm0VarArr) {
        ArrayList arrayList = new ArrayList(pqm0VarArr.length);
        for (pqm0 pqm0Var : pqm0VarArr) {
            arrayList.add(new oj0((String) pqm0Var.f180350a, ((Number) pqm0Var.f180351b).intValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static First m59581b(pp71 pp71Var) {
        kp71 kp71Var = pp71Var.f179940b;
        gp71 gp71Var = gp71.f83100a;
        if (wj50.m88271j(kp71Var, gp71Var)) {
            return First.m15575c(new pp71(R.string.timeline_page_title_GM, gp71Var, cro0.f41336a), bk5.m29624m1(new a1h1[]{dq71.f51876b, new cq71(0)}));
        }
        if (kp71Var instanceof ip71) {
            return First.m15575c(pp71Var, Collections.singleton(new cq71(((ip71) kp71Var).f104399b)));
        }
        if (kp71Var instanceof fp71) {
            return First.m15574b(pp71Var);
        }
        if (kp71Var instanceof ep71) {
            return First.m15574b(pp71Var);
        }
        if (kp71Var instanceof hp71) {
            return First.m15574b(pp71Var);
        }
        if (kp71Var instanceof jp71) {
            return First.m15574b(pp71Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static Next m59582c(iev0 iev0Var, udv0 udv0Var) {
        Object next;
        Map mapM56701n0 = iev0Var.f101566g;
        List<nb81> list = iev0Var.f101560a;
        boolean z = udv0Var instanceof sdv0;
        bdv0 zcv0Var = adv0.f14688a;
        if (z) {
            sdv0 sdv0Var = (sdv0) udv0Var;
            if (!(sdv0Var.f208094d instanceof mcr0)) {
                zcv0Var = new zcv0(sdv0Var.f208093c);
            }
            return Next.m15605a(Collections.singleton(zcv0Var));
        }
        if (udv0Var instanceof tdv0) {
            d850 d850Var = ((tdv0) udv0Var).f219520a;
            if (d850Var != null) {
                return Next.m15605a(Collections.singleton(new vcv0(d850Var)));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z2 = udv0Var instanceof kdv0;
        tcv0 tcv0Var = tcv0.f219150a;
        if (z2) {
            return Next.m15605a(Collections.singleton(tcv0Var));
        }
        if (udv0Var instanceof odv0) {
            odv0 odv0Var = (odv0) udv0Var;
            String str = odv0Var.f164255a;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((nb81) next).f152211a, str));
            nb81 nb81Var = (nb81) next;
            if (nb81Var != null) {
                mapM56701n0 = kkc0.m56701n0(mapM56701n0, new pqm0(str, nb81Var));
            }
            return Next.m15607i(iev0.m50400a(iev0Var, null, false, mapM56701n0, 63), Collections.singleton(new scv0(odv0Var.f164256b, str, odv0Var.f164257c)));
        }
        if (udv0Var instanceof jdv0) {
            jdv0 jdv0Var = (jdv0) udv0Var;
            String str2 = jdv0Var.f111401a;
            return mapM56701n0.containsKey(str2) ? Next.m15608j() : Next.m15605a(Collections.singleton(new wcv0(str2, jdv0Var.f111402b)));
        }
        if (udv0Var instanceof hdv0) {
            return Next.m15607i(iev0.m50400a(iev0Var, null, false, kkc0.m56696i0(((hdv0) udv0Var).f90235a, mapM56701n0), 63), Collections.singleton(xcv0.f260290a));
        }
        if (udv0Var instanceof idv0) {
            idv0 idv0Var = (idv0) udv0Var;
            String str3 = idv0Var.f101249a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!wj50.m88271j(((nb81) obj).f152211a, str3)) {
                    arrayList.add(obj);
                }
            }
            return Next.m15607i(iev0.m50400a(iev0Var, arrayList, false, kkc0.m56696i0(str3, mapM56701n0), 62), bk5.m29624m1(new bdv0[]{new ycv0(str3, idv0Var.f101250b), zcv0Var}));
        }
        if (!(udv0Var instanceof pdv0)) {
            if (!(udv0Var instanceof ldv0)) {
                if (udv0Var instanceof mdv0) {
                    return Next.m15605a(Collections.singleton(ucv0.f229119a));
                }
                return udv0Var instanceof ndv0 ? Next.m15606h(iev0.m50400a(iev0Var, null, ((ndv0) udv0Var).f152848a, null, ContentType.USER_GENERATED_LIVE)) : Next.m15608j();
            }
            ldv0 ldv0Var = (ldv0) udv0Var;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
            for (nb81 nb81VarM64066a : list) {
                cav0 cav0Var = (cav0) ldv0Var.f132357a.get(nb81VarM64066a.f152211a);
                if (cav0Var != null && cav0Var != nb81VarM64066a.f152218h) {
                    nb81VarM64066a = nb81.m64066a(nb81VarM64066a, null, cav0Var, 127);
                }
                arrayList2.add(nb81VarM64066a);
            }
            return arrayList2.equals(list) ? Next.m15608j() : Next.m15606h(iev0.m50400a(iev0Var, arrayList2, false, null, 126));
        }
        List list2 = ((pdv0) udv0Var).f176552a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (!mapM56701n0.containsKey(((nb81) obj2).f152211a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((nb81) it2.next()).f152211a);
        }
        Set setM43736n1 = g6f.m43736n1(arrayList4);
        int iM31820L = c95.m31820L(i6f.m49804T(arrayList3, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj3 : arrayList3) {
            linkedHashMap.put(((nb81) obj3).f152211a, obj3);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list) {
            if (linkedHashMap.containsKey(((nb81) obj4).f152211a)) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList3) {
            if (!setM43736n1.contains(((nb81) obj5).f152211a)) {
                arrayList6.add(obj5);
            }
        }
        ArrayList arrayListM43700N0 = g6f.m43700N0(arrayList6, arrayList5);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (arrayListM43700N0.isEmpty()) {
            linkedHashSet.add(zcv0Var);
            if (iev0Var.f101565f) {
                linkedHashSet.add(tcv0Var);
            }
        }
        Set setM43736n2 = g6f.m43736n1(linkedHashSet);
        return (arrayListM43700N0.equals(list) && setM43736n2.isEmpty()) ? Next.m15608j() : Next.m15607i(iev0.m50400a(iev0Var, arrayListM43700N0, false, null, 126), setM43736n2);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List list;
        switch (this.f135534a) {
            case 0:
                return new goq0((String) obj);
            case 1:
                return new jsr0((xxz) obj);
            case 2:
                mks0 mks0Var = (mks0) obj;
                return new pqm0(qpv0.f191387a.mo54112b(mks0Var.f144668a.getClass()), Boolean.valueOf(mks0Var.f144674g));
            case 3:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new npt0(message);
            case 4:
                e291 e291Var = (e291) obj;
                return new pqm0(Boolean.valueOf(e291Var.f55406k), Integer.valueOf(e291Var.f55403h));
            case 5:
            case 10:
            case 15:
            case 16:
            case 17:
            case 19:
            case 21:
            default:
                return new wxc1(((Boolean) obj).booleanValue());
            case 6:
                return (String) ((xul0) obj).mo49278b();
            case 7:
                return Observable.just(new jw90((Throwable) obj));
            case 8:
                return new fxx((List) obj, null, null, null);
            case 9:
                List<fqx> listMo45450b = ((gqx) obj).mo45450b(daj.class);
                int iM31820L = c95.m31820L(i6f.m49804T(listMo45450b, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (fqx fqxVar : listMo45450b) {
                    daj dajVar = (daj) fqxVar.f72301b;
                    if (dajVar == null || (list = dajVar.f47051b) == null) {
                        list = lau.f131415a;
                    }
                    linkedHashMap.put(fqxVar.f72300a, new spy0(list.contains(aaj.f13850b), list.contains(aaj.f13852d)));
                }
                return linkedHashMap;
            case 11:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 12:
                return new o2y(((Boolean) obj).booleanValue());
            case 13:
                return new t521((gui0) obj);
            case 14:
                int iOrdinal = ((dej0) obj).ordinal();
                return (iOrdinal == 0 || iOrdinal == 2) ? Single.just(Boolean.FALSE) : Single.just(Boolean.TRUE);
            case 18:
                return new lf51((ec51) obj);
            case 20:
                return (Completable) obj;
            case 22:
                na6.m63972t("Error while trying to fetch availability state for instance share.", (Throwable) obj);
                Set set = dd41.f47702f;
                return new r1j0(r46.m74726U(xoc1.f263839A0.f243453a));
            case 23:
                return Boolean.valueOf(((ezk) obj).f64406a);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((hwh0) obj);
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        return new h491(mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f135534a) {
            case 15:
                return ((String) obj).length() > 0;
            case 16:
            default:
                o3z o3zVar = (o3z) obj;
                return o3zVar.f161485d == o3zVar.f161484c;
            case 17:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }
}
