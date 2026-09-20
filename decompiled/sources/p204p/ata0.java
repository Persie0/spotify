package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ata0 implements Update {

    /* JADX INFO: renamed from: b */
    public static final ata0 f19627b = new ata0(0);

    /* JADX INFO: renamed from: c */
    public static final ata0 f19628c = new ata0(1);

    /* JADX INFO: renamed from: d */
    public static final ata0 f19629d = new ata0(2);

    /* JADX INFO: renamed from: e */
    public static final ata0 f19630e = new ata0(3);

    /* JADX INFO: renamed from: f */
    public static final ata0 f19631f = new ata0(4);

    /* JADX INFO: renamed from: g */
    public static final ata0 f19632g = new ata0(5);

    /* JADX INFO: renamed from: h */
    public static final ata0 f19633h = new ata0(6);

    /* JADX INFO: renamed from: i */
    public static final ata0 f19634i = new ata0(7);

    /* JADX INFO: renamed from: j */
    public static final ata0 f19635j = new ata0(8);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19636a;

    public /* synthetic */ ata0(int i) {
        this.f19636a = i;
    }

    /* JADX WARN: Code duplicated, block: B:216:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.Map] */
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        List listM56054a;
        List list;
        int i;
        ArrayList arrayListM43700N0;
        y8j0 y8j0Var;
        ArrayList arrayListM43700N1;
        s6j0 s6j0Var;
        b3j0 b3j0Var;
        List list2;
        y8j0 y8j0Var2;
        pqm0 pqm0VarM69840u;
        String str;
        int i2 = 4;
        int i3 = 2;
        switch (this.f19636a) {
            case 0:
                aic aicVar = (aic) obj;
                yhc yhcVar = (yhc) obj2;
                if (yhcVar instanceof xhc) {
                    boolean z = aicVar.f15932a;
                    boolean z2 = ((xhc) yhcVar).f261518a;
                    if (z == z2) {
                        return Next.m15608j();
                    }
                    Map map = aicVar.f15933b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(((Map.Entry) it.next()).getKey(), rxf1.m76624i(z2));
                    }
                    return Next.m15606h(new aic(linkedHashMap, z2));
                }
                if (!(yhcVar instanceof whc)) {
                    throw new NoWhenBranchMatchedException();
                }
                wj50.m88279p(aicVar);
                boolean z3 = aicVar.f15932a;
                Map map2 = aicVar.f15933b;
                Set set = ((whc) yhcVar).f251302a;
                int iM31820L = c95.m31820L(i6f.m49804T(set, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L >= 16 ? iM31820L : 16);
                for (Object obj3 : set) {
                    linkedHashMap2.put(obj3, rxf1.m76624i(z3));
                }
                return Next.m15606h(new aic(kkc0.m56700m0(map2, linkedHashMap2), z3));
            case 1:
                z4m z4mVar = (z4m) obj;
                v1x v1xVar = (v1x) obj2;
                if (v1xVar instanceof kp10) {
                    String str2 = ((kp10) v1xVar).f124954a;
                    return Next.m15605a(Collections.singleton(new s2m(str2, z4mVar.f279296a.contains(str2))));
                }
                if (!(v1xVar instanceof lp10)) {
                    if (v1xVar instanceof np10) {
                        wj50.m88279p(z4mVar);
                        np10 np10Var = (np10) v1xVar;
                        return Next.m15607i(z4m.m95350a(z4mVar, null, null, np10Var.f156848a, null, 11), Collections.singleton(new sok0(np10Var.f156848a)));
                    }
                    if (!(v1xVar instanceof op10)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    op10 op10Var = (op10) v1xVar;
                    if (z4mVar.f279298c.containsAll(op10Var.m67512a())) {
                        return Next.m15608j();
                    }
                    LinkedHashSet linkedHashSetM77309l0 = s601.m77309l0(op10Var.m67512a(), z4mVar.f279298c);
                    return Next.m15607i(z4m.m95350a(z4mVar, null, null, linkedHashSetM77309l0, null, 11), Collections.singleton(new sok0(linkedHashSetM77309l0)));
                }
                lp10 lp10Var = (lp10) v1xVar;
                Map map3 = lp10Var.f135595b;
                Map map4 = lp10Var.f135594a;
                Set setEntrySet = map4.entrySet();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : setEntrySet) {
                    if (((Boolean) ((Map.Entry) obj4).getValue()).booleanValue()) {
                        arrayList.add(obj4);
                    } else {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((String) ((Map.Entry) it2.next()).getKey());
                }
                Set setM43736n1 = g6f.m43736n1(arrayList3);
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add((String) ((Map.Entry) it3.next()).getKey());
                }
                pqm0 pqm0VarM69840u2 = pft0.m69840u(setM43736n1, g6f.m43736n1(arrayList4));
                Set set2 = (Set) pqm0VarM69840u2.f180350a;
                Set set3 = (Set) pqm0VarM69840u2.f180351b;
                Set setEntrySet2 = map3.entrySet();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : setEntrySet2) {
                    if (((Boolean) ((Map.Entry) obj5).getValue()).booleanValue()) {
                        arrayList5.add(obj5);
                    } else {
                        arrayList6.add(obj5);
                    }
                }
                ArrayList arrayList7 = new ArrayList(i6f.m49804T(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList7.add((String) ((Map.Entry) it4.next()).getKey());
                }
                Set setM43736n2 = g6f.m43736n1(arrayList7);
                ArrayList arrayList8 = new ArrayList(i6f.m49804T(arrayList6, 10));
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    arrayList8.add((String) ((Map.Entry) it5.next()).getKey());
                }
                pqm0 pqm0VarM69840u3 = pft0.m69840u(setM43736n2, g6f.m43736n1(arrayList8));
                Set set4 = (Set) pqm0VarM69840u3.f180350a;
                Set set5 = (Set) pqm0VarM69840u3.f180351b;
                wj50.m88279p(z4mVar);
                return Next.m15606h(z4m.m95350a(z4mVar, s601.m77305h0(s601.m77309l0(z4mVar.f279296a, set2), set3), s601.m77305h0(s601.m77309l0(z4mVar.f279297b, set4), set5), null, s601.m77309l0(s601.m77309l0(z4mVar.f279299d, map4.keySet()), map3.keySet()), 4));
            case 2:
                m6s0 m6s0Var = (m6s0) obj;
                w9j w9jVar = (w9j) obj2;
                if (w9jVar instanceof s9j) {
                    return Next.m15606h(new m6s0(kkc0.m56700m0(m6s0Var.f140572a, ((s9j) w9jVar).f206964a)));
                }
                if (w9jVar instanceof t9j) {
                    return Next.m15607i(new m6s0(m6s0Var.f140572a), Collections.singleton(new o9j(((t9j) w9jVar).f218319a)));
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                tas tasVar = (tas) obj;
                v5s v5sVar = (v5s) obj2;
                if (v5sVar instanceof s5s) {
                    return Next.m15605a(Collections.singleton(new i4s(((s5s) v5sVar).f205899a)));
                }
                if (v5sVar instanceof r5s) {
                    wj50.m88279p(tasVar);
                    r5s r5sVar = (r5s) v5sVar;
                    String str3 = r5sVar.f196110a;
                    return Next.m15607i(wxf1.m89248e(tasVar, pas.f175603a, str3), Collections.singleton(new h4s(str3, r5sVar.f196111b)));
                }
                if (!(v5sVar instanceof t5s)) {
                    if (v5sVar instanceof u5s) {
                        return Next.m15606h(new tas(kkc0.m56700m0(tasVar.f218667a, ((u5s) v5sVar).f227102a)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                wj50.m88279p(tasVar);
                t5s t5sVar = (t5s) v5sVar;
                String str4 = t5sVar.f217345a;
                return Next.m15607i(wxf1.m89248e(tasVar, oas.f163453a, str4), Collections.singleton(new j4s(str4, t5sVar.f217346b)));
            case 4:
                hzp0 hzp0Var = (hzp0) obj;
                gzp0 gzp0Var = (gzp0) obj2;
                if (wj50.m88271j(gzp0Var, ezp0.f64430a)) {
                    hzp0Var.getClass();
                    return Next.m15607i(new hzp0(false), Collections.singleton(dzp0.f54706a));
                }
                if (!(gzp0Var instanceof fzp0)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z4 = ((fzp0) gzp0Var).f75146a;
                hzp0Var.getClass();
                return Next.m15606h(new hzp0(z4));
            case 5:
                k5q0 k5q0Var = (k5q0) obj;
                j5q0 j5q0Var = (j5q0) obj2;
                if (j5q0Var instanceof h5q0) {
                    return Next.m15605a(Collections.singleton(new d5q0(((h5q0) j5q0Var).f87887a)));
                }
                if (j5q0Var instanceof i5q0) {
                    return Next.m15606h(new k5q0(kkc0.m56700m0(k5q0Var.f119563a, ((i5q0) j5q0Var).f99009a)));
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                req0 req0Var = (req0) obj;
                peq0 peq0Var = (peq0) obj2;
                if (peq0Var instanceof leq0) {
                    return Next.m15606h(new req0(kkc0.m56700m0(req0Var.f198415a, ((leq0) peq0Var).f132664a)));
                }
                if (!(peq0Var instanceof heq0)) {
                    if (peq0Var instanceof jeq0) {
                        jeq0 jeq0Var = (jeq0) peq0Var;
                        return Next.m15607i(new req0(kkc0.m56701n0(req0Var.f198415a, pft0.m69840u(jeq0Var.m53107a(), Boolean.TRUE))), Collections.singleton(new kdq0(jeq0Var.m53107a())));
                    }
                    if (!(peq0Var instanceof neq0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    neq0 neq0Var = (neq0) peq0Var;
                    return Next.m15607i(new req0(kkc0.m56701n0(req0Var.f198415a, pft0.m69840u(neq0Var.m64270a(), Boolean.FALSE))), Collections.singleton(new mdq0(neq0Var.m64270a())));
                }
                Map map5 = req0Var.f198415a;
                Set set6 = ((heq0) peq0Var).f90486a;
                Set set7 = set6;
                int iM31820L2 = c95.m31820L(i6f.m49804T(set7, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM31820L2 >= 16 ? iM31820L2 : 16);
                for (Object obj6 : set7) {
                    linkedHashMap3.put(obj6, Boolean.FALSE);
                }
                return Next.m15607i(new req0(kkc0.m56700m0(map5, linkedHashMap3)), Collections.singleton(new idq0(set6)));
            case 7:
                tfw0 tfw0Var = (tfw0) obj;
                sfw0 sfw0Var = (sfw0) obj2;
                if (sfw0Var instanceof pfw0) {
                    LinkedHashMap linkedHashMapM56709v0 = kkc0.m56709v0(tfw0Var.f220062a);
                    for (Map.Entry entry : ((pfw0) sfw0Var).f177151a.entrySet()) {
                        linkedHashMapM56709v0.put(entry.getKey(), new kcj((List) entry.getValue()));
                    }
                    return Next.m15606h(new tfw0(linkedHashMapM56709v0));
                }
                if (sfw0Var instanceof qfw0) {
                    Object obj7 = tfw0Var.f220062a.get(((qfw0) sfw0Var).f188305a);
                    kcj kcjVar = obj7 instanceof kcj ? (kcj) obj7 : null;
                    if (kcjVar == null || (listM56054a = kcjVar.m56054a()) == null) {
                        listM56054a = lau.f131415a;
                    }
                    ArrayList arrayList9 = new ArrayList(i6f.m49804T(listM56054a, 10));
                    Iterator it6 = listM56054a.iterator();
                    while (it6.hasNext()) {
                        arrayList9.add(((lep0) it6.next()).m58810a());
                    }
                    return Next.m15607i(tfw0Var, Collections.singleton(new kfw0(g6f.m43736n1(arrayList9))));
                }
                boolean z5 = sfw0Var instanceof ofw0;
                lcj lcjVar = lcj.f131943a;
                if (z5) {
                    LinkedHashMap linkedHashMapM56709v1 = kkc0.m56709v0(tfw0Var.f220062a);
                    String str5 = ((ofw0) sfw0Var).f164917a;
                    linkedHashMapM56709v1.put(str5, lcjVar);
                    return Next.m15607i(new tfw0(linkedHashMapM56709v1), Collections.singleton(new jfw0(Collections.singleton(str5))));
                }
                if (!(sfw0Var instanceof rfw0)) {
                    throw new NoWhenBranchMatchedException();
                }
                Set set8 = ((rfw0) sfw0Var).f198756a;
                int iM31820L3 = c95.m31820L(i6f.m49804T(set8, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM31820L3 >= 16 ? iM31820L3 : 16);
                for (Object obj8 : set8) {
                    linkedHashMap4.put(obj8, lcjVar);
                }
                tfw0Var.getClass();
                return Next.m15606h(new tfw0(linkedHashMap4));
            case 8:
                q9x0 q9x0Var = (q9x0) obj;
                p9x0 p9x0Var = (p9x0) obj2;
                if (p9x0Var instanceof m9x0) {
                    Map map6 = ((m9x0) p9x0Var).f141401a;
                    return wj50.m88271j(map6, q9x0Var.f186684a) ? Next.m15608j() : Next.m15606h(q9x0.m72411a(q9x0Var, kkc0.m56700m0(q9x0Var.f186684a, map6), null, null, null, 14));
                }
                if (p9x0Var instanceof k9x0) {
                    wj50.m88279p(q9x0Var);
                    Set set9 = ((k9x0) p9x0Var).f120719a;
                    return Next.m15607i(q9x0.m72411a(q9x0Var, null, set9, null, null, 13), Collections.singleton(new d9x0(set9)));
                }
                if (p9x0Var instanceof l9x0) {
                    l9x0 l9x0Var = (l9x0) p9x0Var;
                    return Next.m15606h(q9x0.m72411a(q9x0Var, null, null, kkc0.m56701n0(q9x0Var.f186686c, pft0.m69840u(l9x0Var.m58524a(), l9x0Var.m58525b())), null, 11));
                }
                if (!(p9x0Var instanceof o9x0)) {
                    if (!(p9x0Var instanceof n9x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n9x0 n9x0Var = (n9x0) p9x0Var;
                    return !q9x0Var.f186686c.containsKey(n9x0Var.m63939a()) ? Next.m15608j() : Next.m15606h(q9x0.m72411a(q9x0Var, null, null, kkc0.m56696i0(n9x0Var.m63939a(), q9x0Var.f186686c), null, 11));
                }
                Map map7 = q9x0Var.f186686c;
                Map mapM56701n0 = q9x0Var.f186687d;
                o9x0 o9x0Var = (o9x0) p9x0Var;
                gh00 gh00Var = (gh00) map7.get(o9x0Var.m66498a());
                if (gh00Var == null) {
                    return Next.m15608j();
                }
                Object obj9 = mapM56701n0.get(o9x0Var.m66498a());
                Boolean bool = Boolean.TRUE;
                if (!wj50.m88271j(obj9, bool)) {
                    mapM56701n0 = kkc0.m56701n0(mapM56701n0, pft0.m69840u(o9x0Var.m66498a(), bool));
                }
                return Next.m15607i(q9x0.m72411a(q9x0Var, null, null, null, mapM56701n0, 7), Collections.singleton(new e9x0(r9x0.m75089a((r9x0) gh00Var.invoke(o9x0Var.m66498a()), o9x0Var.m66499b()))));
            case 9:
                List list3 = null;
                boolean z6 = false;
                xvh0 xvh0Var = (xvh0) obj;
                g3x g3xVar = (g3x) obj2;
                b6j0 b6j0Var = b6j0.f23975b;
                s6j0 s6j0Var2 = xvh0Var.f266389a;
                y8j0 y8j0Var3 = xvh0Var.f266390b;
                boolean z7 = g3xVar instanceof fww;
                List listM43701O0 = lau.f131415a;
                if (z7) {
                    b3j0 b3j0Var2 = ((fww) g3xVar).f74187a;
                    if (a7j0.m24947N(b3j0Var2, y8j0Var3)) {
                        return Next.m15606h(xvh0.m92238c(xvh0Var, null, null, 0, null, null, b3j0Var2, 31));
                    }
                    if (y8j0Var3 != null) {
                        if (!y8j0Var3.f270307c) {
                            y8j0Var2 = list3;
                            y8j0Var2 = y8j0Var3;
                        }
                        if (y8j0Var2 != 0) {
                            listM43701O0 = g6f.m43701O0(new e6j0(y8j0Var3.f270306b, y8j0Var3.f270305a), y8j0Var2.f270308d);
                        }
                    }
                    return Next.m15606h(xvh0.m92238c(xvh0Var, null, new y8j0(b3j0Var2, 1, listM43701O0, i2), 0, null, null, null, 29));
                }
                boolean z8 = g3xVar instanceof zvw;
                b3j0 b3j0Var3 = x2j0.f257512a;
                if (z8) {
                    b3j0 b3j0Var4 = ((zvw) g3xVar).f286814a;
                    ArrayList arrayList10 = (y8j0Var3 == null || (list2 = y8j0Var3.f270308d) == null) ? new ArrayList() : new ArrayList(list2);
                    int i4 = y8j0Var3 != null ? y8j0Var3.f270306b : 0;
                    int i5 = i4 == 0 ? -1 : z6j0.f279939a[edb.m38547C(i4)];
                    if (i5 == -1) {
                        arrayList10.add(b6j0Var);
                    } else if (i5 != 1) {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (a7j0.m24947N(b3j0Var4, y8j0Var3)) {
                            b3j0Var4 = y8j0Var3.f270305a;
                        } else {
                            arrayList10.add(new c6j0(y8j0Var3.f270305a));
                        }
                    } else if (b3j0Var4.equals(b3j0Var3)) {
                        b3j0Var4 = y8j0Var3.f270305a;
                        arrayList10.add(b6j0.f23974a);
                    } else if (a7j0.m24947N(b3j0Var4, y8j0Var3)) {
                        b3j0Var4 = y8j0Var3.f270305a;
                    } else {
                        b3j0 b3j0Var5 = y8j0Var3.f270305a;
                        if (b3j0Var4.equals(b3j0Var5)) {
                            b3j0Var4 = b3j0Var5;
                        } else {
                            j6f.m52564V(h6f.m46715L(new e6j0(y8j0Var3.f270306b, b3j0Var5), b6j0Var), arrayList10);
                        }
                    }
                    return Next.m15606h(xvh0.m92238c(xvh0Var, null, new y8j0(b3j0Var4, i3, arrayList10, i2), 0, null, null, null, 61));
                }
                int i6 = 12;
                if (!(g3xVar instanceof eww)) {
                    if (g3xVar instanceof bsw) {
                        bsw bswVar = (bsw) g3xVar;
                        e5j0 e5j0Var = new e5j0(bswVar.f30410a, s6j0Var2, p2j0.f173363a, (y8j0Var3 == null || (list = y8j0Var3.f270308d) == null) ? listM43701O0 : list, xvh0Var.f266392d, null, null);
                        Object obj10 = list3;
                        if (y8j0Var3 != null && !y8j0Var3.f270305a.mo28034a()) {
                            obj10 = list3;
                            obj10 = y8j0Var3;
                        }
                        obj10 = list3;
                        return Next.m15607i(xvh0.m92238c(xvh0Var, bswVar.f30410a, obj10, 2, listM43701O0, null, null, 16), Effects.m15571a(e5j0Var));
                    }
                    if (g3xVar instanceof csw) {
                        csw cswVar = (csw) g3xVar;
                        if (y8j0Var3 == null) {
                            y8j0Var3 = new y8j0(o2j0.f161057a, i3, list3, i6);
                        }
                        return Next.m15606h(xvh0.m92238c(xvh0Var, cswVar.f41706a, y8j0Var3, 1, null, null, null, 56));
                    }
                    if (g3xVar instanceof mvw) {
                        return Next.m15606h(xvh0.m92238c(xvh0Var, null, null, 0, g6f.m43701O0(((mvw) g3xVar).m62970c(), g6f.m43715c1(2, xvh0Var.f266392d)), null, null, 55));
                    }
                    if (g3xVar instanceof hsw) {
                        return Next.m15606h(xvh0.m92238c(xvh0Var, null, null, 0, null, ((hsw) g3xVar).getId(), null, 47));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                eww ewwVar = (eww) g3xVar;
                s6j0 s6j0Var3 = ewwVar.f63610a;
                List list4 = ewwVar.f63611b;
                if (y8j0Var3 == null && wj50.m88271j(s6j0Var2, s6j0Var3)) {
                    return Next.m15608j();
                }
                int i7 = y8j0Var3 != null ? y8j0Var3.f270306b : 0;
                int i8 = i7 == 0 ? -1 : z6j0.f279939a[edb.m38547C(i7)];
                d6j0 d6j0Var = d6j0.f45712a;
                if (i8 != -1) {
                    if (i8 == 1) {
                        y8j0Var3.getClass();
                        b3j0Var3 = y8j0Var3.f270305a;
                        String str6 = s6j0Var3.f206133b.f196302b;
                        if ((b3j0Var3 instanceof z2j0) && str6 != null && !wj50.m88271j(((z2j0) b3j0Var3).f278598b, str6)) {
                            z6 = true;
                        }
                        List list5 = y8j0Var3.f270308d;
                        if (z6) {
                            ArrayList arrayListM43700N2 = g6f.m43700N0(list4, list5);
                            i = 1;
                            y8j0Var = new y8j0(b3j0Var3, y8j0Var3.f270306b, true, list5);
                            b3j0Var3 = u2j0.f226108a;
                            arrayListM43700N1 = arrayListM43700N2;
                        } else {
                            i = 1;
                            arrayListM43700N0 = g6f.m43701O0(d6j0Var, g6f.m43700N0(list4, list5));
                        }
                    } else {
                        if (i8 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b3j0Var3 = y8j0Var3.f270305a;
                        y8j0Var = null;
                        arrayListM43700N1 = g6f.m43700N0(list4, y8j0Var3.f270308d);
                        i = 1;
                    }
                    if (y8j0Var == null && (b3j0Var = xvh0Var.f266394f) != null) {
                        y8j0Var = new y8j0(b3j0Var, i, list3, i6);
                    }
                    s6j0 s6j0Var4 = ewwVar.f63610a;
                    if (wj50.m88271j(b3j0Var3, t2j0.f216577a)) {
                        s6j0Var = null;
                    } else {
                        s6j0Var = s6j0Var2;
                    }
                    return Next.m15607i(xvh0.m92238c(xvh0Var, ewwVar.f63610a, y8j0Var, 0, listM43701O0, null, null, 4), Effects.m15571a(new e5j0(s6j0Var4, s6j0Var, b3j0Var3, arrayListM43700N1, xvh0Var.f266392d, xvh0Var.f266393e, ewwVar.f63612c)));
                }
                i = 1;
                arrayListM43700N0 = g6f.m43700N0(list4, h6f.m46715L(b6j0Var, d6j0Var));
                y8j0Var = null;
                arrayListM43700N1 = arrayListM43700N0;
                if (y8j0Var == null) {
                    y8j0Var = new y8j0(b3j0Var, i, list3, i6);
                }
                s6j0 s6j0Var5 = ewwVar.f63610a;
                if (wj50.m88271j(b3j0Var3, t2j0.f216577a)) {
                    s6j0Var = null;
                } else {
                    s6j0Var = s6j0Var2;
                }
                return Next.m15607i(xvh0.m92238c(xvh0Var, ewwVar.f63610a, y8j0Var, 0, listM43701O0, null, null, 4), Effects.m15571a(new e5j0(s6j0Var5, s6j0Var, b3j0Var3, arrayListM43700N1, xvh0Var.f266392d, xvh0Var.f266393e, ewwVar.f63612c)));
            default:
                oib1 oib1Var = (oib1) obj;
                iib1 iib1Var = (iib1) obj2;
                boolean z9 = oib1Var.f165769b;
                long j = oib1Var.f165775h;
                nib1 nib1Var = oib1Var.f165774g;
                boolean z10 = oib1Var.f165770c;
                fh0 fh0Var = oib1Var.f165772e;
                boolean z11 = oib1Var.f165768a;
                if (wj50.m88271j(iib1Var, yhb1.f272813a)) {
                    return Next.m15607i(oib1Var, Collections.singleton(new phb1("cta_button", fh0Var)));
                }
                if (wj50.m88271j(iib1Var, zhb1.f282870a)) {
                    return Next.m15607i(oib1Var, Collections.singleton(new phb1("container", fh0Var)));
                }
                if (wj50.m88271j(iib1Var, aib1.f15931a)) {
                    f5u f5uVar = oib1Var.f165773f;
                    if (f5uVar == null || (str = f5uVar.f66171a) == null) {
                        str = "";
                    }
                    return Next.m15607i(oib1Var, Collections.singleton(new nhb1(str)));
                }
                boolean zM88271j = wj50.m88271j(iib1Var, gib1.f80122a);
                qhb1 qhb1Var = qhb1.f188706a;
                thb1 thb1Var = thb1.f220397a;
                mib1 mib1Var = mib1.f143996a;
                lib1 lib1Var = lib1.f133762a;
                if (zM88271j) {
                    if (wj50.m88271j(nib1Var, lib1Var)) {
                        return Next.m15607i(oib1.m67010a(oib1Var, false, false, false, false, mib1Var, 0L, 191), Collections.singleton(thb1Var));
                    }
                    return wj50.m88271j(nib1Var, mib1Var) ? Next.m15607i(oib1.m67010a(oib1Var, false, false, false, false, lib1Var, 0L, 191), Collections.singleton(qhb1Var)) : Next.m15608j();
                }
                boolean zM88271j2 = wj50.m88271j(iib1Var, hib1.f91783a);
                ohb1 ohb1Var = ohb1.f165387a;
                if (zM88271j2) {
                    return Next.m15607i(oib1.m67010a(oib1Var, !z11, false, false, false, null, 0L, 254), z11 ? s601.m77310m0(whb1.f251301a, rhb1.f199185a) : Collections.singleton(ohb1Var));
                }
                boolean z12 = iib1Var instanceof bib1;
                Set setSingleton = gbu.f78413a;
                if (z12) {
                    if (!z10) {
                        bib1 bib1Var = (bib1) iib1Var;
                        if (bib1Var.m29306a()) {
                            return Next.m15607i(oib1.m67010a(oib1Var, false, bib1Var.m29306a(), true, false, null, 0L, 249), Collections.singleton(new vhb1(bib1Var.m29307b(), z11)));
                        }
                    }
                    bib1 bib1Var2 = (bib1) iib1Var;
                    if (bib1Var2.m29306a()) {
                        if ((nib1Var instanceof kib1) || (nib1Var instanceof jib1)) {
                            setSingleton = new LinkedHashSet();
                            setSingleton.add(new shb1(fh0Var, j));
                        } else if (wj50.m88271j(nib1Var, lib1Var)) {
                            setSingleton = Collections.singleton(thb1Var);
                        }
                        pqm0VarM69840u = pft0.m69840u(mib1Var, setSingleton);
                    } else {
                        pqm0VarM69840u = (bib1Var2.m29306a() || !(nib1Var instanceof mib1)) ? pft0.m69840u(nib1Var, setSingleton) : pft0.m69840u(lib1Var, Collections.singleton(qhb1Var));
                    }
                    return Next.m15607i(oib1.m67010a(oib1Var, false, bib1Var2.m29306a(), false, false, (nib1) pqm0VarM69840u.f180350a, 0L, 189), (Set) pqm0VarM69840u.f180351b);
                }
                if (!(iib1Var instanceof eib1)) {
                    if (iib1Var instanceof dib1) {
                        return ((dib1) iib1Var).m36072a() ? Next.m15607i(oib1.m67010a(oib1Var, true, false, false, false, null, 0L, 254), Collections.singleton(ohb1Var)) : Next.m15608j();
                    }
                    if (iib1Var instanceof fib1) {
                        return z10 ? Next.m15608j() : Next.m15607i(oib1.m67010a(oib1Var, false, false, true, false, null, 0L, 251), Collections.singleton(new vhb1(((fib1) iib1Var).m41701a(), z11)));
                    }
                    if (iib1Var instanceof cib1) {
                        return z10 ? Next.m15608j() : Next.m15607i(oib1.m67010a(oib1Var, false, false, true, false, null, 0L, 251), Collections.singleton(new vhb1(((cib1) iib1Var).m32887a(), z11)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                yyo0 yyo0VarM39095a = ((eib1) iib1Var).m39095a();
                if (wj50.m88271j(yyo0VarM39095a, vyo0.f246297a)) {
                    return Next.m15606h(oib1.m67010a(oib1Var, false, false, false, false, mib1Var, 0L, 63));
                }
                if (yyo0VarM39095a instanceof syo0) {
                    syo0 syo0Var = (syo0) yyo0VarM39095a;
                    int iM38547C = edb.m38547C(syo0Var.m79709b());
                    boolean z13 = iM38547C == 2 || iM38547C == 3 || iM38547C == 4;
                    boolean z14 = syo0Var.m79709b() == 6;
                    oib1 oib1VarM67010a = oib1.m67010a(oib1Var, false, false, z14 ? false : z10, z14 ? false : oib1Var.f165771d, new jib1(z13), z13 ? 0L : syo0Var.m79708a(), 51);
                    if (z14) {
                        setSingleton = Collections.singleton(new uhb1(syo0Var.m79708a(), z11));
                    }
                    return Next.m15607i(oib1VarM67010a, setSingleton);
                }
                if (yyo0VarM39095a instanceof tyo0) {
                    tyo0 tyo0Var = (tyo0) yyo0VarM39095a;
                    return Next.m15607i(oib1.m67010a(oib1Var, false, false, false, false, lib1Var, tyo0Var.m81999a(), 63), Collections.singleton(new uhb1(tyo0Var.m81999a(), z11)));
                }
                if (wj50.m88271j(yyo0VarM39095a, uyo0.f235345a)) {
                    return Next.m15606h(oib1.m67010a(oib1Var, false, false, false, false, mib1Var, 0L, 63));
                }
                if (!wj50.m88271j(yyo0VarM39095a, wyo0.f256330a)) {
                    if (wj50.m88271j(yyo0VarM39095a, xyo0.f267392a)) {
                        return Next.m15606h(oib1.m67010a(oib1Var, false, false, false, false, new jib1(true), 0L, 179));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                oib1 oib1VarM67010a2 = oib1.m67010a(oib1Var, false, false, false, true, null, z9 ? 0L : j, 119);
                if (z9) {
                    setSingleton = Collections.singleton(new shb1(fh0Var, j));
                }
                return Next.m15607i(oib1VarM67010a2, setSingleton);
        }
    }

    public ata0(hjb1 hjb1Var) {
        this.f19636a = 10;
    }
}
