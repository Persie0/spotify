package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ni00 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154145a;

    /* JADX INFO: renamed from: b */
    public final Object f154146b;

    public /* synthetic */ ni00(Object obj, int i) {
        this.f154145a = i;
        this.f154146b = obj;
    }

    /* JADX INFO: renamed from: a */
    public Single m64549a() {
        return ((t8t0) this.f154146b).m80265a().map(haz.f89329d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.ArrayList] */
    @Override // p204p.eh00
    public final Object invoke() throws Throwable {
        List list;
        wzv wzvVar;
        Map mapSingletonMap;
        ed70 ed70Var;
        ak5 ak5VarM95900a;
        ?? SingletonList;
        int i = this.f154145a;
        nau nauVar = nau.f152117a;
        List list2 = lau.f131415a;
        boolean z = false;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f154146b;
        switch (i) {
            case 0:
                return (List) obj;
            case 1:
                return ((Observable) ((C1771da) obj).invoke()).firstOrError();
            case 2:
                return m64549a();
            case 3:
                rd10 rd10Var = (rd10) obj;
                List listMo33769h = rd10Var.mo33769h();
                ArrayList arrayList = new ArrayList(3);
                AbstractC1803e6 abstractC1803e6 = rd10Var.f198009b;
                Collection collectionMo25172f = abstractC1803e6.mo27378k().mo25172f();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionMo25172f.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(vvx.m86514o(((gd70) it.next()).mo36065J(), null, 3), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (obj2 instanceof eab) {
                        arrayList3.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList3) {
                    qti0 name = ((eab) obj3).getName();
                    Object arrayList4 = linkedHashMap.get(name);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(name, arrayList4);
                    }
                    ((List) arrayList4).add(obj3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    qti0 qti0Var = (qti0) entry.getKey();
                    List list3 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list3) {
                        Boolean boolValueOf = Boolean.valueOf(((eab) obj4) instanceof mi00);
                        Object arrayList5 = linkedHashMap2.get(boolValueOf);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList5);
                        }
                        ((List) arrayList5).add(obj4);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list4 = (List) entry2.getValue();
                        z1m0 z1m0Var = z1m0.f278332c;
                        if (zBooleanValue) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : listMo33769h) {
                                if (wj50.m88271j(((pqo) ((mi00) obj5)).getName(), qti0Var)) {
                                    arrayList6.add(obj5);
                                }
                            }
                            list = arrayList6;
                        } else {
                            list = list2;
                        }
                        z1m0Var.m95152h(qti0Var, list4, list, abstractC1803e6, new qd10(arrayList, rd10Var));
                    }
                }
                return g6f.m43700N0(ceg1.m32572k(arrayList), listMo33769h);
            case 4:
                return Boolean.valueOf(((hb4) ((i4t0) obj).get()).m46984b());
            case 5:
                return Boolean.valueOf(((m8t0) obj).m61137b());
            case 6:
                return ((cqe1) obj).m33616a().map(uty.f234029f).distinctUntilChanged().onErrorReturnItem(Boolean.FALSE);
            case 7:
                return ((Observable) ((ppk0) obj).invoke()).map(new u6x(this, 23));
            case 8:
                x560 x560Var = (x560) obj;
                x560Var.f258319Z = ((v560) x560Var.f258313L0).m84675a();
                return w2a1Var;
            case 9:
                Object obj6 = zc60.f281465a;
                vc60 vc60Var = ((rd60) obj).f249970d;
                qov0 qov0Var = vc60Var instanceof qov0 ? (qov0) vc60Var : null;
                if (qov0Var == null || (ed70Var = (ed70) zc60.f281466b.get(qti0.m73841e(qov0Var.f191072b.name()).m73844b())) == null) {
                    wzvVar = null;
                } else {
                    y400 y400Var = qm41.f190121v;
                    wzvVar = new wzv(new vfe(y400Var.m92786b(), y400Var.f269048a.m95306g()), qti0.m73841e(ed70Var.name()));
                }
                mapSingletonMap = wzvVar != null ? Collections.singletonMap(xc60.f260106c, wzvVar) : null;
                return mapSingletonMap == null ? nauVar : mapSingletonMap;
            case 10:
                vc60 vc60Var2 = ((td60) obj).f249970d;
                if (vc60Var2 instanceof fov0) {
                    Object obj7 = zc60.f281465a;
                    ak5VarM95900a = zc60.m95900a(((fov0) vc60Var2).m42312a());
                } else if (vc60Var2 instanceof qov0) {
                    Object obj8 = zc60.f281465a;
                    ak5VarM95900a = zc60.m95900a(Collections.singletonList(vc60Var2));
                } else {
                    ak5VarM95900a = null;
                }
                mapSingletonMap = ak5VarM95900a != null ? Collections.singletonMap(xc60.f260105b, ak5VarM95900a) : null;
                return mapSingletonMap == null ? nauVar : mapSingletonMap;
            case 11:
                mn60 mn60Var = (mn60) obj;
                kn60 kn60Var = mn60Var.f145322f;
                if (kn60Var == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                ln60 ln60Var = (ln60) kn60Var.invoke();
                mn60Var.f145322f = null;
                return ln60Var;
            case 12:
                no60 no60Var = (no60) obj;
                st70 st70Var = no60Var.f156600c;
                yma0 yma0Var = st70Var.f213836t;
                qr60 qr60Var = st70.f213830L0[0];
                Collection collectionValues = ((Map) yma0Var.invoke()).values();
                ArrayList arrayList7 = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    pyq pyqVarM51953a = ((iyq) ((qwm) no60Var.f156599b.f280873b).f193366d).m51953a(st70Var, (ipv0) it2.next());
                    if (pyqVarM51953a != null) {
                        arrayList7.add(pyqVarM51953a);
                    }
                }
                return (bfe0[]) wxf1.m89256m(arrayList7).toArray(new bfe0[0]);
            case 13:
                return lxh0.m60200a(((nq60) obj).mo28587A());
            case 14:
                fr60 fr60Var = (fr60) obj;
                lpv0 lpv0Var = fr60Var.f72378d;
                qr60 qr60Var2 = fr60.f72376g[0];
                ipv0 ipv0Var = (ipv0) lpv0Var.invoke();
                if (ipv0Var == null) {
                    return afe0.f15137b;
                }
                lpv0 lpv0Var2 = fr60Var.f146196a;
                qr60 qr60Var3 = mq60.f146195b[0];
                oge0 oge0Var = ((ivx0) lpv0Var2.invoke()).f106298b;
                iyq iyqVar = (iyq) oge0Var.f165107b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oge0Var.f165109d;
                Class cls = ipv0Var.f104571a;
                vfe vfeVarM30093a = bov0.m30093a(cls);
                Object obj9 = concurrentHashMap.get(vfeVarM30093a);
                if (obj9 == null) {
                    y400 y400Var2 = bov0.m30093a(cls).f240966a;
                    s18 s18Var = ipv0Var.f104572b;
                    jb70 jb70Var = (jb70) s18Var.f204622d;
                    jb70 jb70Var2 = jb70.MULTIFILE_CLASS;
                    if (jb70Var == jb70Var2) {
                        String[] strArr = (String[]) s18Var.f204624f;
                        if (jb70Var != jb70Var2) {
                            strArr = null;
                        }
                        List listAsList = strArr != null ? Arrays.asList(strArr) : null;
                        if (listAsList != null) {
                            list2 = listAsList;
                        }
                        SingletonList = new ArrayList();
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            y400 y400Var3 = new y400(un60.m83531c((String) it3.next()).f232069a.replace('/', '.'));
                            y400 y400VarM92786b = y400Var3.m92786b();
                            qti0 qti0VarM95306g = y400Var3.f269048a.m95306g();
                            y400 y400Var4 = y400.f269047c;
                            z400 z400Var = jfg1.m53199v(qti0VarM95306g).f269048a;
                            z400Var.m95303c();
                            fus0 fus0Var = (fus0) oge0Var.f165108c;
                            ((wow0) iyqVar.m51955c().f148909d).getClass();
                            fbf0 fbf0Var = fbf0.f67818g;
                            String strReplace = z400Var.f279080a.replace('.', '$');
                            if (!y400VarM92786b.f269048a.m95303c()) {
                                strReplace = y400VarM92786b + '.' + strReplace;
                            }
                            z4y z4yVarM42746c = fus0Var.m42746c(strReplace);
                            ipv0 ipv0Var2 = z4yVarM42746c != null ? (ipv0) z4yVarM42746c.f279405b : null;
                            if (ipv0Var2 != null) {
                                SingletonList.add(ipv0Var2);
                            }
                        }
                    } else {
                        SingletonList = Collections.singletonList(ipv0Var);
                    }
                    tau tauVar = new tau((mxh0) iyqVar.m51955c().f148908c, y400Var2, z);
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it4 = SingletonList.iterator();
                    while (it4.hasNext()) {
                        pyq pyqVarM51953a2 = iyqVar.m51953a(tauVar, (ipv0) it4.next());
                        if (pyqVarM51953a2 != null) {
                            arrayList8.add(pyqVarM51953a2);
                        }
                    }
                    bfe0 bfe0VarM70672l = pqo0.m70672l("package " + y400Var2 + " (" + ipv0Var + ')', g6f.m43728j1(arrayList8));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(vfeVarM30093a, bfe0VarM70672l);
                    obj9 = objPutIfAbsent == null ? bfe0VarM70672l : objPutIfAbsent;
                }
                return (bfe0) obj9;
            case 15:
                return new fc70((gc70) obj);
            case 16:
                return new hc70((ic70) obj);
            case 17:
                return new jc70((kc70) obj);
            case 18:
                mc70 mc70Var = (mc70) obj;
                Type typeM24445n = a1h1.m24445n(mc70Var);
                return typeM24445n == null ? mc70Var.getCaller().mo32241i() : typeM24445n;
            case 19:
                nc70 nc70Var = (nc70) obj;
                bc70 bc70Var = nc70Var.f152452b;
                if ((bc70Var.mo25527a() instanceof gr60) || epv0.m39665A(bc70Var)) {
                    return (Type) bc70Var.getCaller().mo32242k().get(nc70Var.f152454d);
                }
                throw new IllegalArgumentException(("Only constructors and top-level callables are supported for now: " + bc70Var).toString());
            case 20:
                return mug1.m62866k((qc70) obj, true);
            case 21:
                return new bd70((cd70) obj);
            case 22:
                ((oh3) ((bh61) ((qwm) ((z9t) obj).f280873b).f193386x)).getClass();
                return g6f.m43736n1(new ArrayList());
            case 23:
                return (Completable) ((xkr) obj).invoke();
            case 24:
                ((cj90) obj).f38536c.mo46963e();
                return w2a1Var;
            case 25:
                return new am90((fiz) obj, this, 18);
            case 26:
                eh00 eh00Var = ((lij0) obj).f133805b;
                if (eh00Var != null) {
                    return (List) eh00Var.invoke();
                }
                return null;
            case 27:
                return k0e1.m54988g(mvl0.m62953p(new kmx(((vmz) obj).f242953a, 12)), dau.f47107a);
            case 28:
                return rm41.f200445l.m92785a(((her0) obj).f90501b);
            default:
                tpc tpcVar = (tpc) obj;
                tpcVar.f222483O0 = ((zqt0) tpcVar.f222485Q0).m96747a();
                return w2a1Var;
        }
    }

    public ni00(z9t z9tVar, qt70 qt70Var) {
        this.f154145a = 22;
        this.f154146b = z9tVar;
    }
}
