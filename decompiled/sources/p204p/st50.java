package p204p;

import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class st50 {

    /* JADX INFO: renamed from: a */
    public final sdo f213812a;

    /* JADX INFO: renamed from: b */
    public final List f213813b;

    /* JADX INFO: renamed from: c */
    public final fyf f213814c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f213815d;

    /* JADX INFO: renamed from: e */
    public final boolean f213816e;

    /* JADX INFO: renamed from: f */
    public final boolean f213817f;

    /* JADX INFO: renamed from: g */
    public final nau f213818g;

    /* JADX INFO: renamed from: h */
    public final HashMap f213819h;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p.eh00] */
    public st50(sdo sdoVar, List list, fyf fyfVar) {
        boolean z;
        this.f213812a = sdoVar;
        this.f213813b = list;
        this.f213814c = fyfVar;
        int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dyp0 dyp0Var = (dyp0) it.next();
            ot21 ot21VarMo26386d = ((lt50) dyp0Var.f54428b).mo26386d();
            linkedHashMap.put(dyp0Var.f54427a, new nt50((ry8) ot21VarMo26386d.f168956c.invoke(), ot21VarMo26386d.f168954a, ot21VarMo26386d.f168955b));
        }
        this.f213815d = linkedHashMap;
        List list2 = this.f213813b;
        boolean z2 = false;
        if (list2 != null && list2.isEmpty()) {
            z = true;
            break;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = true;
                break;
            } else if (((lt50) ((dyp0) it2.next()).f54428b).mo26385c() != hl11.f92585a) {
                z = false;
                break;
            }
        }
        this.f213816e = z;
        List list3 = this.f213813b;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (!((lt50) ((dyp0) it3.next()).f54428b).mo26385c().mo25659a().m80988b().isEmpty()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f213817f = z2;
        this.f213818g = nau.f152117a;
        this.f213819h = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m79233a(fl11 fl11Var, km51 km51Var) {
        if (fl11Var == hl11.f92585a) {
            return true;
        }
        if (!fl11Var.mo25659a().m80988b().isEmpty()) {
            qho qhoVarMo25866b = ((ago) this.f213812a.f208051e).mo25866b(fl11Var.mo25659a().mo28634a(km51Var));
            return (qhoVarMo25866b instanceof oho) && fl11Var.mo25662d(km51Var, ((oho) qhoVarMo25866b).f165512a);
        }
        HashMap map = this.f213819h;
        Object obj = map.get(fl11Var);
        if (obj == null) {
            qho qhoVarMo25349a = ((sko) fl11Var.mo25659a().mo28634a(km51Var)).mo25349a(this.f213818g);
            oho ohoVar = qhoVarMo25349a instanceof oho ? (oho) qhoVarMo25349a : null;
            if (ohoVar == null || (obj = ohoVar.f165512a) == null) {
                return false;
            }
            map.put(fl11Var, obj);
        }
        return fl11Var.mo25662d(km51Var, obj);
    }

    /* JADX INFO: renamed from: b */
    public final String m79234b(vco vcoVar, boolean z, xq00 xq00Var, int i) {
        Object nm0Var;
        km51 km51Var;
        Object obj;
        Object next;
        String str;
        Object next2;
        dyp0 dyp0Var;
        Object obj2 = t6x0.f217647t;
        xq00Var.m91771i0(-365477049);
        boolean z2 = this.f213816e;
        List list = this.f213813b;
        if (z2) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                dyp0Var = (dyp0) next2;
                if (z) {
                    break;
                }
            } while (((lt50) dyp0Var.f54428b).mo26384a());
            dyp0 dyp0Var2 = (dyp0) next2;
            str = dyp0Var2 != null ? dyp0Var2.f54427a : null;
            xq00Var.m91788r(false);
            return str;
        }
        km51 km51VarM95598r = z8g1.m95598r(vcoVar);
        if (!this.f213817f) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                dyp0 dyp0Var3 = (dyp0) next;
                if (z || !((lt50) dyp0Var3.f54428b).mo26384a()) {
                    if (m79233a(((lt50) dyp0Var3.f54428b).mo26385c(), km51VarM95598r)) {
                        break;
                    }
                }
            }
            dyp0 dyp0Var4 = (dyp0) next;
            str = dyp0Var4 != null ? dyp0Var4.f54427a : null;
            xq00Var.m91788r(false);
            return str;
        }
        int i2 = (i & ContentType.LONG_FORM_ON_DEMAND) ^ 48;
        boolean z3 = true;
        boolean z4 = (i2 > 32 && xq00Var.m91768h(z)) || (i & 48) == 32;
        Object objM91750T = xq00Var.m91750T();
        Object obj3 = objM91750T;
        if (z4 || objM91750T == obj2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                dyp0 dyp0Var5 = (dyp0) obj4;
                if (z || !((lt50) dyp0Var5.f54428b).mo26384a()) {
                    arrayList.add(obj4);
                }
            }
            xq00Var.m91793t0(arrayList);
            obj3 = arrayList;
        }
        List list2 = (List) obj3;
        boolean zM91766g = xq00Var.m91766g(list2);
        Object objM91750T2 = xq00Var.m91750T();
        Object obj5 = objM91750T2;
        if (zM91766g || objM91750T2 == obj2) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : list2) {
                if (!((lt50) ((dyp0) obj6).f54428b).mo26385c().mo25659a().m80988b().isEmpty()) {
                    arrayList2.add(obj6);
                }
            }
            xq00Var.m91793t0(arrayList2);
            obj5 = arrayList2;
        }
        Object obj7 = (List) obj5;
        boolean zM91770i = xq00Var.m91770i(list2) | xq00Var.m91770i(this) | xq00Var.m91770i(km51VarM95598r);
        Object objM91750T3 = xq00Var.m91750T();
        if (zM91770i || objM91750T3 == obj2) {
            objM91750T3 = new rcx(list2, this, km51VarM95598r, 24);
            xq00Var.m91793t0(objM91750T3);
        }
        eh00 eh00Var = (eh00) objM91750T3;
        boolean zM91766g2 = xq00Var.m91766g(km51VarM95598r);
        if ((i2 <= 32 || !xq00Var.m91768h(z)) && (i & 48) != 32) {
            z3 = false;
        }
        boolean z5 = zM91766g2 | z3;
        Object objM91750T4 = xq00Var.m91750T();
        if (z5 || objM91750T4 == obj2) {
            objM91750T4 = sam.m77645B(eh00Var.invoke());
            xq00Var.m91793t0(objM91750T4);
        }
        kqi0 kqi0Var = (kqi0) objM91750T4;
        boolean zM91770i2 = xq00Var.m91770i(obj7) | xq00Var.m91770i(this) | xq00Var.m91770i(km51VarM95598r) | xq00Var.m91770i(kqi0Var) | xq00Var.m91766g(eh00Var);
        Object objM91750T5 = xq00Var.m91750T();
        if (zM91770i2 || objM91750T5 == obj2) {
            km51Var = km51VarM95598r;
            obj = obj7;
            nm0Var = new nm0(17, obj, this, km51Var, kqi0Var, eh00Var, (fbk) null);
            xq00Var.m91793t0(nm0Var);
        } else {
            nm0Var = objM91750T5;
            km51Var = km51VarM95598r;
            obj = obj7;
        }
        hz40.m49236h(km51Var, obj, (th00) nm0Var, xq00Var);
        String str2 = (String) kqi0Var.getValue();
        xq00Var.m91788r(false);
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public final rt50 m79235c(vco vcoVar, boolean z) {
        List list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f213813b) {
            dyp0 dyp0Var = (dyp0) obj;
            if (z || !((lt50) dyp0Var.f54428b).mo26384a()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (this.f213817f) {
            km51 km51VarM95598r = z8g1.m95598r(vcoVar);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!((lt50) ((dyp0) obj2).f54428b).mo26385c().mo25659a().m80988b().isEmpty()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((lt50) ((dyp0) it.next()).f54428b).mo26385c().mo25659a().mo28634a(km51VarM95598r));
            }
            list = arrayList3;
        } else {
            list = lau.f131415a;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nt50 nt50Var = (nt50) this.f213815d.get(((dyp0) it2.next()).f54427a);
            ry8 ry8Var = nt50Var != null ? nt50Var.f157983a : null;
            izd1 izd1Var = ry8Var instanceof izd1 ? (izd1) ry8Var : null;
            if (izd1Var != null) {
                arrayList4.add(izd1Var);
            }
        }
        return new rt50(this, list, arrayList4, vcoVar);
    }
}
