package p204p;

import android.app.Application;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class mqw0 implements rdc1 {

    /* JADX INFO: renamed from: X */
    public Object f146366X;

    /* JADX INFO: renamed from: a */
    public Object f146367a;

    /* JADX INFO: renamed from: b */
    public Object f146368b;

    /* JADX INFO: renamed from: c */
    public Object f146369c;

    /* JADX INFO: renamed from: d */
    public Object f146370d;

    /* JADX INFO: renamed from: e */
    public Object f146371e;

    /* JADX INFO: renamed from: f */
    public Object f146372f;

    /* JADX INFO: renamed from: g */
    public Object f146373g;

    /* JADX INFO: renamed from: h */
    public Object f146374h;

    /* JADX INFO: renamed from: i */
    public Object f146375i;

    /* JADX INFO: renamed from: t */
    public Object f146376t;

    public /* synthetic */ mqw0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        this.f146367a = obj;
        this.f146368b = obj2;
        this.f146369c = obj3;
        this.f146370d = obj4;
        this.f146371e = obj5;
        this.f146372f = obj6;
        this.f146373g = obj7;
        this.f146374h = obj8;
        this.f146375i = obj9;
        this.f146376t = obj10;
        this.f146366X = obj11;
    }

    /* JADX INFO: renamed from: i */
    public static pgo m62596i(pgo pgoVar, ebf0 ebf0Var, pgo pgoVar2) {
        LinkedHashMap linkedHashMap;
        Map map;
        Map map2;
        if (ebf0Var != null) {
            try {
                Map mapM50286o = id6.m50286o(ebf0Var);
                linkedHashMap = new LinkedHashMap(c95.m31820L(mapM50286o.size()));
                for (Object obj : mapM50286o.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj).getKey(), new ojo(((Map.Entry) obj).getValue()));
                }
            } catch (ClassCastException unused) {
                linkedHashMap = null;
            }
        } else {
            linkedHashMap = null;
        }
        gf40 gf40Var = (linkedHashMap == null || linkedHashMap.isEmpty()) ? null : new gf40(linkedHashMap);
        gf40 gf40Var2 = pgoVar2 instanceof gf40 ? (gf40) pgoVar2 : null;
        gf40 gf40Var3 = pgoVar instanceof gf40 ? (gf40) pgoVar : null;
        if (gf40Var == null && gf40Var2 == null && gf40Var3 == null) {
            return pgoVar;
        }
        Map map3 = nau.f152117a;
        if (gf40Var2 == null) {
            gf40Var2 = new gf40(map3);
        }
        if (gf40Var == null || (map = gf40Var.f79261a) == null) {
            map = map3;
        }
        LinkedHashMap linkedHashMapM56700m0 = kkc0.m56700m0(gf40Var2.f79261a, map);
        if (gf40Var3 != null && (map2 = gf40Var3.f79261a) != null) {
            map3 = map2;
        }
        return new gf40(kkc0.m56700m0(linkedHashMapM56700m0, map3));
    }

    /* JADX INFO: renamed from: j */
    public static pqm0 m62597j(ebf0 ebf0Var, ebf0 ebf0Var2, ebf0 ebf0Var3) {
        ebf0 ebf0VarM38366a;
        Map map = ebf0Var2 != null ? ebf0Var2.f57921a : null;
        Map map2 = nau.f152117a;
        if (map == null) {
            map = map2;
        }
        ebf0 ebf0VarM38366a2 = ebf0Var.m38366a(map, false).m38366a(ebf0Var3.f57921a, false);
        if ((ebf0Var2 == null || !ebf0Var2.m38367b()) && !ebf0Var3.m38367b()) {
            ebf0VarM38366a = ebf0VarM38366a2;
        } else {
            ern0 ern0Var = ebf0Var2 != null ? ebf0Var2.f57921a : null;
            if (ern0Var != null) {
                map2 = ern0Var;
            }
            ebf0VarM38366a = ebf0Var.m38366a(map2, true).m38366a(ebf0Var3.f57921a, true);
        }
        return new pqm0(ebf0VarM38366a2, ebf0VarM38366a);
    }

    /* JADX INFO: renamed from: a */
    public rf21 m62598a(rf21 rf21Var, ebf0 ebf0Var, pgo pgoVar, Set set) {
        int i;
        ebf0 ebf0Var2;
        boolean z;
        qf21 qf21VarM62599b;
        ebf0 ebf0Var3 = rf21Var.f198491a;
        int i2 = rf21Var.f198495e;
        int i3 = rf21Var.f198494d;
        Map map = rf21Var.f198500j;
        List list = rf21Var.f198496f;
        List list2 = rf21Var.f198499i;
        List list3 = rf21Var.f198493c;
        List list4 = rf21Var.f198498h;
        ebf0 ebf0VarM38366a = ebf0Var3.m38366a(ebf0Var.f57921a, false);
        boolean zM38367b = ebf0Var.m38367b();
        if (set != null && !((up80) this.f146373g).f232596b && ((sa8) this.f146374h).f207156c == 0 && list4.size() == list3.size() && list2.size() == list3.size()) {
            if (set.isEmpty()) {
                qf21VarM62599b = new qf21(list, list4, list2, map);
                i = i2;
                ebf0Var2 = ebf0VarM38366a;
            } else {
                ArrayList arrayList = new ArrayList(list4);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int[] iArr = (int[]) map.get((k35) it.next());
                    if (iArr != null) {
                        for (int i4 : iArr) {
                            linkedHashSet.add(Integer.valueOf(i4));
                        }
                    }
                }
                Iterator it2 = linkedHashSet.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    Iterator it3 = it2;
                    ArrayList arrayList2 = arrayList;
                    int i5 = i2;
                    boolean zM82293p = u3h1.m82293p((Map) this.f146367a, (Map) this.f146368b, (LinkedHashMap) this.f146370d, (sec1) list3.get(iIntValue), ebf0VarM38366a, pgoVar, false);
                    ebf0 ebf0Var4 = ebf0VarM38366a;
                    if (((Boolean) arrayList2.get(iIntValue)).booleanValue() != zM82293p) {
                        arrayList2.set(iIntValue, Boolean.valueOf(zM82293p));
                        z2 = true;
                    }
                    ebf0VarM38366a = ebf0Var4;
                    i2 = i5;
                    arrayList = arrayList2;
                    it2 = it3;
                }
                i = i2;
                ArrayList arrayList3 = arrayList;
                ebf0Var2 = ebf0VarM38366a;
                if (z2) {
                    ArrayList arrayList4 = new ArrayList();
                    int i6 = 0;
                    for (Object obj : list3) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        if (((Boolean) arrayList3.get(i6)).booleanValue()) {
                            arrayList4.add(obj);
                        }
                        i6 = i7;
                    }
                    qf21VarM62599b = new qf21(arrayList4, arrayList3, list2, map);
                } else {
                    qf21VarM62599b = new qf21(list, list4, list2, map);
                }
            }
            z = true;
        } else {
            i = i2;
            ebf0Var2 = ebf0VarM38366a;
            pgoVar = pgoVar;
            z = true;
            qf21VarM62599b = m62599b(list3, ebf0Var2, pgoVar, true);
        }
        boolean zM88271j = wj50.m88271j(qf21VarM62599b.f188104a, list);
        ebf0 ebf0VarM38366a2 = zM38367b ? ebf0Var3.m38366a(ebf0Var.f57921a, z) : ebf0Var2;
        boolean z3 = ebf0VarM38366a2 != ebf0Var3 ? z : false;
        List list5 = qf21VarM62599b.f188104a;
        List list6 = qf21VarM62599b.f188105b;
        List list7 = qf21VarM62599b.f188106c;
        Map map2 = qf21VarM62599b.f188107d;
        if (!zM88271j) {
            i3++;
        }
        return rf21.m75420a(rf21Var, ebf0VarM38366a2, pgoVar, null, i3, z3 ? i + 1 : i, list5, null, list6, list7, map2, null, 1092);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d A[LOOP:2: B:51:0x0107->B:53:0x010d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0137 A[LOOP:3: B:55:0x0131->B:57:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public qf21 m62599b(List list, ebf0 ebf0Var, pgo pgoVar, boolean z) {
        List list2;
        int size;
        sec1 sec1Var;
        boolean z2;
        Iterable iterable;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f146370d;
        Map map = (Map) this.f146368b;
        Map map2 = (Map) this.f146367a;
        up80 up80Var = (up80) this.f146373g;
        boolean z3 = false;
        if (up80Var.f232596b) {
            Iterator it3 = list.iterator();
            size = 0;
            while (true) {
                if (!it3.hasNext()) {
                    size = -1;
                    break;
                }
                if (!u3h1.m82293p(map2, map, linkedHashMap, (sec1) it3.next(), ebf0Var, pgoVar, up80Var.f232597c ? z : false)) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = list.size();
            }
            list2 = list;
        } else {
            int i = ((sa8) this.f146374h).f207156c;
            if (i > 0) {
                Iterable iterableM63417Y = n0e1.m63417Y(0, Math.min(i, list.size()));
                if ((iterableM63417Y instanceof Collection) && ((Collection) iterableM63417Y).isEmpty()) {
                    list2 = list;
                    size = list2.size();
                } else {
                    Iterator it4 = iterableM63417Y.iterator();
                    while (true) {
                        if (((a450) it4).f12141c) {
                            list2 = list;
                            if (!u3h1.m82293p(map2, map, linkedHashMap, (sec1) list2.get(((t350) it4).nextInt()), ebf0Var, pgoVar, false)) {
                                size = 0;
                            }
                        } else {
                            list2 = list;
                            size = list2.size();
                        }
                    }
                }
            } else {
                list2 = list;
                size = list2.size();
            }
        }
        ArrayList arrayList4 = new ArrayList(list2.size());
        ArrayList arrayList5 = new ArrayList(size);
        ArrayList arrayList6 = new ArrayList(list2.size());
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h6f.m46722S();
                throw null;
            }
            sec1 sec1Var2 = (sec1) obj;
            if (i2 < size) {
                sec1Var = sec1Var2;
                if (u3h1.m82293p(map2, map, linkedHashMap, sec1Var, ebf0Var, pgoVar, false)) {
                    z2 = true;
                }
                arrayList4.add(Boolean.valueOf(z2));
                iterable = (List) ((Map) this.f146369c).get(sec1Var.f208274a.getClass());
                if (iterable == null) {
                    iterable = lau.f131415a;
                }
                arrayList = new ArrayList();
                it = iterable.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((mko) it.next()).mo28634a(sec1Var.f208274a).getItems(), arrayList);
                }
                arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((kho) it2.next()).f122694a);
                }
                arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!((k35) obj2).m55230a()) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList6.add(g6f.m43736n1(arrayList3));
                if (z2) {
                    arrayList5.add(sec1Var);
                }
                i2 = i3;
                z3 = false;
            } else {
                sec1Var = sec1Var2;
            }
            z2 = z3;
            arrayList4.add(Boolean.valueOf(z2));
            iterable = (List) ((Map) this.f146369c).get(sec1Var.f208274a.getClass());
            if (iterable == null) {
                iterable = lau.f131415a;
            }
            arrayList = new ArrayList();
            it = iterable.iterator();
            while (it.hasNext()) {
                j6f.m52564V(((mko) it.next()).mo28634a(sec1Var.f208274a).getItems(), arrayList);
            }
            arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((kho) it2.next()).f122694a);
            }
            arrayList3 = new ArrayList();
            while (r7.hasNext()) {
                if (!((k35) obj2).m55230a()) {
                    arrayList3.add(obj2);
                }
            }
            arrayList6.add(g6f.m43736n1(arrayList3));
            if (z2) {
                arrayList5.add(sec1Var);
            }
            i2 = i3;
            z3 = false;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i4 = 0;
        for (Object obj3 : arrayList6) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                h6f.m46722S();
                throw null;
            }
            for (k35 k35Var : (Set) obj3) {
                Object arrayList7 = linkedHashMap2.get(k35Var);
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                    linkedHashMap2.put(k35Var, arrayList7);
                }
                ((List) arrayList7).add(Integer.valueOf(i4));
            }
            i4 = i5;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c95.m31820L(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry.getKey(), g6f.m43726i1((List) entry.getValue()));
        }
        return new qf21(arrayList5, arrayList4, arrayList6, linkedHashMap3);
    }

    /* JADX INFO: renamed from: c */
    public bji m62600c() {
        return (bji) this.f146371e;
    }

    /* JADX INFO: renamed from: d */
    public hf21 m62601d() {
        return (hf21) this.f146366X;
    }

    /* JADX INFO: renamed from: e */
    public Set m62602e(rf21 rf21Var) {
        List listM44506m;
        List list = rf21Var.f198493c;
        b450 b450Var = rf21Var.f198497g;
        if (b450Var.isEmpty() || list.isEmpty()) {
            listM44506m = lau.f131415a;
        } else {
            b450 b450VarM46713J = h6f.m46713J(list);
            int iM63438o = n0e1.m63438o(b450Var.f278778a, b450VarM46713J);
            b450 b450Var2 = new b450(iM63438o, n0e1.m63438o(b450Var.f278779b, b450VarM46713J), 1);
            ro80 ro80VarM44508o = geg1.m44508o();
            int i = b450Var2.f278779b;
            if (iM63438o <= i) {
                while (true) {
                    Object obj = ((sec1) list.get(iM63438o)).f208274a;
                    List list2 = (List) ((Map) this.f146369c).get(obj.getClass());
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ro80VarM44508o.add(((mko) it.next()).mo28634a(obj));
                        }
                    }
                    if (iM63438o == i) {
                        break;
                    }
                    iM63438o++;
                }
            }
            listM44506m = geg1.m44506m(ro80VarM44508o);
        }
        return Collections.singleton(new jf21(listM44506m));
    }

    /* JADX INFO: renamed from: f */
    public List m62603f(rf21 rf21Var, int i) {
        if (((skd0) this.f146375i) == null) {
            return lau.f131415a;
        }
        int i2 = i - 5;
        b450 b450Var = new b450(i2, i + 5, 1);
        List list = rf21Var.f198493c;
        Set setM43736n1 = g6f.m43736n1(rf21Var.f198496f);
        b450 b450VarM46713J = h6f.m46713J(list);
        b450 b450Var2 = new b450(n0e1.m63438o(i2, b450VarM46713J), n0e1.m63438o(b450Var.f278779b, b450VarM46713J), 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = b450Var2.iterator();
        while (((a450) it).f12141c) {
            Object obj = list.get(((t350) it).nextInt());
            if (!setM43736n1.contains((sec1) obj)) {
                obj = null;
            }
            sec1 sec1Var = (sec1) obj;
            if (sec1Var != null) {
                arrayList.add(sec1Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX INFO: renamed from: g */
    public Set m62604g(List list, rf21 rf21Var) {
        ewt ewtVarMo39361b;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sec1 sec1Var = (sec1) it.next();
                Map map = (Map) this.f146372f;
                Object obj = sec1Var.f208274a;
                List list2 = (List) map.get(obj.getClass());
                ewt ewtVar = null;
                if (list2 == null) {
                    ewtVarMo39361b = null;
                } else {
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        eld0 eld0Var = (eld0) g6f.m43741q0(list2);
                        pgo pgoVar = rf21Var.f198492b;
                        mko mkoVarMo39360a = eld0Var.mo39360a();
                        if (mkoVarMo39360a != null) {
                            qho qhoVarMo25866b = pgoVar.mo25866b(mkoVarMo39360a.mo28634a(obj));
                            qhoVarMo25866b.getClass();
                            if (qhoVarMo25866b instanceof oho) {
                                ewtVarMo39361b = eld0Var.mo39361b(obj, vie1.m85619a(qhoVarMo25866b));
                            } else {
                                ewtVarMo39361b = null;
                            }
                        } else {
                            ewtVarMo39361b = eld0Var.mo39361b(obj, null);
                        }
                    } else {
                        ewtVarMo39361b = null;
                    }
                }
                th00 th00Var = (th00) ((Map) this.f146371e).get(obj.getClass());
                if (th00Var != null) {
                    ewtVar = (ewt) th00Var.invoke(obj, rf21Var.f198491a);
                }
                j6f.m52564V(bk5.m29582E0(new ewt[]{ewtVarMo39361b, ewtVar}), arrayList);
            }
            List listM43727j0 = g6f.m43727j0(arrayList);
            if (!listM43727j0.isEmpty()) {
                return Collections.singleton(new if21(listM43727j0));
            }
        }
        return gbu.f78413a;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (ConstraintLayout) this.f146367a;
    }

    /* JADX INFO: renamed from: h */
    public lpc m62605h() {
        return (lpc) this.f146376t;
    }

    /* JADX INFO: renamed from: k */
    public bqe1 m62606k(boolean z) {
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add(m62607l(z));
        bxd1 bxd1Var = new bxd1();
        r7f1.m74949a();
        vaa1 vaa1Var = (vaa1) this.f146369c;
        cha0 cha0Var = (cha0) this.f146375i;
        c4d1 c4d1Var = (c4d1) this.f146374h;
        sef0 sef0Var = (sef0) this.f146373g;
        ro80VarM44508o.add(new q6g1((Application) this.f146367a, (okj0) this.f146366X, bxd1Var, (w7g1) this.f146376t, vaa1Var, cha0Var, c4d1Var, sef0Var));
        yya1 yya1Var = (yya1) this.f146372f;
        ro80VarM44508o.add(new svf1((Application) yya1Var.f277453b, (cha0) yya1Var.f277454c));
        return new bqe1(new uo80(geg1.m44506m(ro80VarM44508o), false));
    }

    /* JADX INFO: renamed from: l */
    public svf1 m62607l(boolean z) {
        Application application = (Application) this.f146367a;
        okj0 okj0Var = (okj0) this.f146366X;
        application.getContentResolver();
        t0f1 t0f1Var = (t0f1) this.f146368b;
        cha0 cha0Var = (cha0) this.f146375i;
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add(new x0g1());
        zxf1 zxf1Var = new zxf1();
        zxf1Var.f287314a = true;
        ro80VarM44508o.add(zxf1Var);
        ro80VarM44508o.add(new ywf1(application.getContentResolver()));
        ro80VarM44508o.add(new lxf1());
        ro80VarM44508o.add(new exf1(application, cha0Var));
        if (z) {
            ro80VarM44508o.add(new u1g1(cha0Var, new c3g1(okj0Var, t0f1Var)));
        }
        return new svf1(geg1.m44506m(ro80VarM44508o));
    }

    public mqw0(Map map, Map map2, Map map3, LinkedHashMap linkedHashMap, Map map4, Map map5, up80 up80Var, gbc0 gbc0Var, sa8 sa8Var, skd0 skd0Var) {
        this.f146367a = map;
        this.f146368b = map2;
        this.f146369c = map3;
        this.f146370d = linkedHashMap;
        this.f146371e = map4;
        this.f146372f = map5;
        this.f146373g = up80Var;
        this.f146374h = sa8Var;
        this.f146375i = skd0Var;
        this.f146376t = new lpc(this, 22);
        this.f146366X = new hf21(up80Var.f232595a, gbc0Var, skd0Var);
    }
}
