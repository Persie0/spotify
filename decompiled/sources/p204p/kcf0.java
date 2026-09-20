package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class kcf0 {

    /* JADX INFO: renamed from: a */
    public final rkk0 f121465a;

    /* JADX INFO: renamed from: b */
    public final rkk0 f121466b;

    /* JADX INFO: renamed from: c */
    public final xnk0 f121467c;

    /* JADX INFO: renamed from: d */
    public final juk f121468d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f121469e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f121470f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f121471g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public final ArrayList f121472h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final e6a0 f121473i;

    /* JADX INFO: renamed from: j */
    public final jhz0 f121474j;

    /* JADX INFO: renamed from: k */
    public final a470 f121475k;

    /* JADX INFO: renamed from: l */
    public final Object f121476l;

    /* JADX INFO: renamed from: m */
    public final mcu f121477m;

    public kcf0(ArrayList arrayList, rkk0 rkk0Var, rkk0 rkk0Var2, xnk0 xnk0Var, juk jukVar) {
        this.f121465a = rkk0Var;
        this.f121466b = rkk0Var2;
        this.f121467c = xnk0Var;
        this.f121468d = jukVar;
        kk40.m56661c(mlg1.m62205A(njg1.m64613f(), jukVar));
        this.f121473i = new e6a0(arrayList);
        jhz0 jhz0Var = new jhz0(22);
        this.f121474j = jhz0Var;
        this.f121475k = new a470(rkk0Var, rkk0Var2, jhz0Var);
        this.f121476l = new Object();
        this.f121477m = new mcu(jukVar, new s5e0(this, 13));
    }

    /* JADX INFO: renamed from: d */
    public static void m56041d(ArrayList arrayList, eh00 eh00Var) {
        Double d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (zxc.m97192l(((wcf0) obj).m87731e().f260221b)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty() || (d = (Double) eh00Var.invoke()) == null) {
            return;
        }
        double dDoubleValue = d.doubleValue();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((wcf0) it.next()).m87734h(dDoubleValue);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m56042e(ArrayList arrayList, gh00 gh00Var) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (zxc.m97192l(((wcf0) obj).m87731e().f260221b)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList2) {
            String str = ((wcf0) obj2).m87731e().f260220a;
            Object objM75735i = linkedHashMap.get(str);
            if (objM75735i == null) {
                objM75735i = rkh0.m75735i(str, linkedHashMap);
            }
            ((List) objM75735i).add(obj2);
        }
        gh00Var.invoke(new dhv0(linkedHashMap.keySet(), new s5e0(linkedHashMap, 12)));
    }

    /* JADX INFO: renamed from: a */
    public final Long m56043a(String str) {
        Collection collectionValues = this.f121469e.values();
        Collection collectionValues2 = this.f121470f.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues2.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((Map) it.next()).values(), arrayList);
        }
        ArrayList arrayListM43700N0 = g6f.m43700N0(arrayList, collectionValues);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListM43700N0) {
            wcf0 wcf0Var = (wcf0) obj;
            if (wcf0Var.m87731e().f260220a.equals(str) && !wcf0Var.m87733g()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(((wcf0) it2.next()).m87732f()));
        }
        return (Long) g6f.m43693G0(arrayList3);
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m56044b(zbf0 zbf0Var, List list) throws Throwable {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList = new ArrayList();
        ArrayList<xcf0> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f121469e;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            xcf0 xcf0Var = (xcf0) next;
            if ((xcf0Var.f260222c instanceof ycf0) && !linkedHashMap.containsKey(xcf0Var.m90393a())) {
                arrayList2.add(next);
            }
        }
        for (xcf0 xcf0Var2 : arrayList2) {
            ycf0 ycf0Var = (ycf0) xcf0Var2.f260222c;
            wcf0 wcf0VarM24673j = a470.m24673j(this.f121475k, zbf0Var, xcf0Var2, this.f121468d, zxc.m97194n(xcf0Var2.f260221b) ? new noa0(this) : null);
            if (wcf0VarM24673j != null) {
                linkedHashMap.put(xcf0Var2.m90393a(), wcf0VarM24673j);
                this.f121477m.m61475b(ycf0Var.f271483a, xcf0Var2.m90393a());
                arrayList.add(wcf0VarM24673j);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = g6f.m43728j1(this.f121467c.f263655l.values()).iterator();
        while (it2.hasNext()) {
            j6f.m52564V(m56045c((ink0) it2.next(), zbf0Var, list), arrayList3);
        }
        return g6f.m43700N0(arrayList3, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m56045c(ink0 ink0Var, zbf0 zbf0Var, List list) {
        boolean zContains;
        ArrayList arrayList = new ArrayList();
        ArrayList<xcf0> arrayList2 = new ArrayList();
        for (Object obj : list) {
            xcf0 xcf0Var = (xcf0) obj;
            adf0 adf0Var = xcf0Var.f260222c;
            if (adf0Var instanceof ycf0) {
                zContains = false;
            } else {
                if (!(adf0Var instanceof zcf0)) {
                    throw new NoWhenBranchMatchedException();
                }
                Set set = (Set) ink0Var.f104017b.f93358d.get(m221.METRIC);
                if (set == null) {
                    set = gbu.f78413a;
                }
                zContains = set.contains(xcf0Var.m90393a());
            }
            if (zContains) {
                arrayList2.add(obj);
            }
        }
        for (xcf0 xcf0Var2 : arrayList2) {
            zbf0 zbf0Var2 = zbf0Var;
            wcf0 wcf0VarM24672i = a470.m24672i(this.f121475k, zbf0Var2, xcf0Var2, ink0Var.f104020e, ink0Var.f104021f, ink0Var.f104016a);
            if (wcf0VarM24672i != null) {
                LinkedHashMap linkedHashMap = this.f121470f;
                UUID uuid = ink0Var.f104019d;
                Object linkedHashMap2 = linkedHashMap.get(uuid);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(uuid, linkedHashMap2);
                }
                ((Map) linkedHashMap2).put(xcf0Var2.m90393a(), wcf0VarM24672i);
                arrayList.add(wcf0VarM24672i);
            }
            zbf0Var = zbf0Var2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final qq8 m56046f(Set set) {
        qq8 qq8Var = new qq8(1);
        for (icf0 icf0Var : this.f121472h) {
            Set setM50252b = icf0Var.m50252b();
            if (!(setM50252b instanceof Collection) || !setM50252b.isEmpty()) {
                Iterator it = setM50252b.iterator();
                while (it.hasNext()) {
                    if (set.contains((String) it.next())) {
                        icf0Var.m50251a().invoke(new dhv0(set, new jcf0(this, qq8Var, UUID.randomUUID().toString(), 0)));
                        break;
                    }
                }
            }
        }
        return qq8Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m56047g(String str) {
        Double d;
        eh00 eh00Var = (eh00) this.f121471g.get(str);
        if (eh00Var == null || (d = (Double) eh00Var.invoke()) == null) {
            return;
        }
        m56048h(str, d.doubleValue(), null);
    }

    /* JADX INFO: renamed from: h */
    public final void m56048h(String str, double d, Long l) {
        double d2;
        ldc ldcVarM37922p = this.f121473i.m37922p(str);
        if (ldcVarM37922p == null) {
            return;
        }
        if (ldcVarM37922p.m58735b()) {
            d2 = d;
            this.f121474j.m53435g(str, d2, l != null ? l.longValue() : ((Number) this.f121465a.invoke()).longValue());
        } else {
            d2 = d;
        }
        for (xcf0 xcf0Var : (ArrayList) ldcVarM37922p.m58736c()) {
            adf0 adf0Var = xcf0Var.f260222c;
            if (adf0Var instanceof zcf0) {
                Iterator it = this.f121470f.values().iterator();
                while (it.hasNext()) {
                    wcf0 wcf0Var = (wcf0) ((Map) it.next()).get(xcf0Var.m90393a());
                    if (wcf0Var != null) {
                        wcf0Var.m87734h(d2);
                    }
                }
            } else {
                if (!(adf0Var instanceof ycf0)) {
                    throw new NoWhenBranchMatchedException();
                }
                wcf0 wcf0Var2 = (wcf0) this.f121469e.get(xcf0Var.m90393a());
                if (wcf0Var2 != null) {
                    wcf0Var2.m87734h(d2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final zbf0 m56049i(String str, acf0 acf0Var, vcf0 vcf0Var) {
        zbf0 zbf0Var;
        ldc ldcVarM37922p;
        List listM58734a;
        synchronized (this.f121476l) {
            pqm0 pqm0VarM37929w = this.f121473i.m37929w(str, acf0Var, vcf0Var);
            zbf0Var = (zbf0) pqm0VarM37929w.f180350a;
            if (((Boolean) pqm0VarM37929w.f180351b).booleanValue() && (ldcVarM37922p = this.f121473i.m37922p(str)) != null && (listM58734a = ldcVarM37922p.m58734a()) != null) {
                m56044b(zbf0Var, listM58734a);
            }
        }
        return zbf0Var;
    }

    /* JADX INFO: renamed from: j */
    public final void m56050j(Set set) {
        Map mapM56705r0;
        synchronized (this.f121476l) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Long lM56043a = m56043a(str);
                    pqm0 pqm0VarM69840u = lM56043a != null ? pft0.m69840u(str, Long.valueOf(lM56043a.longValue())) : null;
                    if (pqm0VarM69840u != null) {
                        arrayList.add(pqm0VarM69840u);
                    }
                }
                mapM56705r0 = kkc0.m56705r0(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f121474j.m53436h(mapM56705r0, this.f121468d);
    }
}
