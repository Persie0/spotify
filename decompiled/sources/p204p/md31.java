package p204p;

import com.spotify.jam.internal.socialconnect.models.DetectedToken;
import com.spotify.jam.internal.socialconnect.models.ResolveTokensResponse;
import com.spotify.jam.internal.socialconnect.models.ResolvedJam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import p000.C1398e;

/* JADX INFO: loaded from: classes2.dex */
public final class md31 {

    /* JADX INFO: renamed from: a */
    public final khy0 f142297a;

    /* JADX INFO: renamed from: b */
    public final ckx0 f142298b;

    /* JADX INFO: renamed from: c */
    public final b4r f142299c;

    /* JADX INFO: renamed from: d */
    public final p4p f142300d;

    /* JADX INFO: renamed from: e */
    public final xjp f142301e;

    /* JADX INFO: renamed from: f */
    public final mab0 f142302f;

    /* JADX INFO: renamed from: g */
    public final a660 f142303g;

    /* JADX INFO: renamed from: h */
    public final luk f142304h;

    public md31(khy0 khy0Var, ckx0 ckx0Var, b4r b4rVar, p4p p4pVar, xjp xjpVar, mab0 mab0Var, a660 a660Var, luk lukVar) {
        this.f142297a = khy0Var;
        this.f142298b = ckx0Var;
        this.f142299c = b4rVar;
        this.f142300d = p4pVar;
        this.f142301e = xjpVar;
        this.f142302f = mab0Var;
        this.f142303g = a660Var;
        this.f142304h = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f1 A[LOOP:0: B:44:0x00eb->B:46:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m61504a(g760 g760Var, ibk ibkVar) {
        id31 id31Var;
        List list;
        gk40 gk40Var;
        Map map;
        List list2;
        gk40 gk40Var2;
        ArrayList arrayList;
        Iterator it;
        if (ibkVar instanceof id31) {
            id31Var = (id31) ibkVar;
            int i = id31Var.f100932e;
            if ((i & Integer.MIN_VALUE) != 0) {
                id31Var.f100932e = i - Integer.MIN_VALUE;
            } else {
                id31Var = new id31(this, ibkVar);
            }
        } else {
            id31Var = new id31(this, ibkVar);
        }
        Object obj = id31Var.f100930c;
        int i2 = id31Var.f100932e;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (g760Var instanceof e760) {
                return g760Var;
            }
            if (!(g760Var instanceof f760)) {
                throw new NoWhenBranchMatchedException();
            }
            gk40 gk40Var3 = gk40.f80710W0;
            list = (List) ((f760) g760Var).f66569a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List listM34219c = ((cx50) it2.next()).m34219c();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listM34219c) {
                    if (!((bx50) obj2).m30761c()) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((bx50) it3.next()).m30760b());
                }
                j6f.m52564V(arrayList4, arrayList2);
            }
            List listM43727j0 = g6f.m43727j0(arrayList2);
            if (!((cd4) this.f142303g.f12703a.get()).m32359N() || listM43727j0.isEmpty()) {
                gk40Var = gk40Var3;
                map = nau.f152117a;
            } else {
                id31Var.f100928a = list;
                id31Var.f100929b = gk40Var3;
                id31Var.f100932e = 1;
                Object objM61506c = m61506c(listM43727j0, id31Var);
                Object obj3 = yuk.f276404a;
                if (objM61506c == obj3) {
                    return obj3;
                }
                list2 = list;
                gk40Var2 = gk40Var3;
                obj = objM61506c;
            }
            arrayList = new ArrayList(i6f.m49804T(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(thg1.m80858x((cx50) it.next(), map));
            }
            gk40Var.getClass();
            return new f760(arrayList);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gk40Var2 = id31Var.f100929b;
        list2 = id31Var.f100928a;
        bga.m29073P(obj);
        map = (Map) obj;
        List list3 = list2;
        gk40Var = gk40Var2;
        list = list3;
        arrayList = new ArrayList(i6f.m49804T(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(thg1.m80858x((cx50) it.next(), map));
        }
        gk40Var.getClass();
        return new f760(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final Object m61505b(v660 v660Var, ibk ibkVar) {
        jd31 jd31Var;
        xjp xjpVar;
        ArrayList arrayList;
        if (ibkVar instanceof jd31) {
            jd31Var = (jd31) ibkVar;
            int i = jd31Var.f111232d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jd31Var.f111232d = i - Integer.MIN_VALUE;
            } else {
                jd31Var = new jd31(this, ibkVar);
            }
        } else {
            jd31Var = new jd31(this, ibkVar);
        }
        Object objM85636r = jd31Var.f111230b;
        int i2 = jd31Var.f111232d;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM85636r);
            gh00 gh00VarCreate = this.f142299c.create();
            int i3 = nd31.f152647b;
            x401 x401Var = new x401();
            Map map = v660Var.f237739a;
            ?? r11 = v660Var.f237740b;
            Set<Map.Entry> setEntrySet = map.entrySet();
            ArrayList<pqm0> arrayList2 = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                z660 z660Var = (z660) entry.getKey();
                Set set = (Set) entry.getValue();
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList3.add(pft0.m69840u(z660Var, (xw50) it.next()));
                }
                j6f.m52564V(arrayList3, arrayList2);
            }
            ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList2, 10));
            for (pqm0 pqm0Var : arrayList2) {
                z660 z660Var2 = (z660) pqm0Var.f180350a;
                arrayList4.add(new DetectedToken(z660Var2.f279714a, nd31.m64191a((xw50) pqm0Var.f180351b), z660Var2.f279715b));
            }
            x401Var.addAll(arrayList4);
            LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(r11.size()));
            for (Map.Entry entry2 : r11.entrySet()) {
                linkedHashMap.put(((ux50) entry2.getKey()).m84132c(), entry2.getValue());
            }
            Set<Map.Entry> setEntrySet2 = linkedHashMap.entrySet();
            ArrayList<pqm0> arrayList5 = new ArrayList();
            for (Map.Entry entry3 : setEntrySet2) {
                String str = (String) entry3.getKey();
                Set set2 = (Set) entry3.getValue();
                ArrayList arrayList6 = new ArrayList(i6f.m49804T(set2, 10));
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(pft0.m69840u(str, (xw50) it2.next()));
                }
                j6f.m52564V(arrayList6, arrayList5);
            }
            ArrayList arrayList7 = new ArrayList(i6f.m49804T(arrayList5, 10));
            for (pqm0 pqm0Var2 : arrayList5) {
                arrayList7.add(new DetectedToken((String) pqm0Var2.f180350a, nd31.m64191a((xw50) pqm0Var2.f180351b), null, 4, null));
            }
            x401Var.addAll(arrayList7);
            x401 x401VarM63425d = n0e1.m63425d(x401Var);
            ArrayList arrayList8 = new ArrayList(i6f.m49804T(x401VarM63425d, 10));
            Object it3 = x401VarM63425d.iterator();
            while (((s2v) it3).hasNext()) {
                arrayList8.add(gh00VarCreate.invoke(((lec0) it3).next()));
            }
            Iterator it4 = v660Var.f237739a.entrySet().iterator();
            while (true) {
                boolean zHasNext = it4.hasNext();
                xjpVar = this.f142301e;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry4 = (Map.Entry) it4.next();
                z660 z660Var3 = (z660) entry4.getKey();
                Iterator it5 = ((Set) entry4.getValue()).iterator();
                while (it5.hasNext()) {
                    xjpVar.m91246v(z660Var3.f279714a, (xw50) it5.next());
                }
            }
            for (Map.Entry entry5 : r11.entrySet()) {
                String strM84132c = ((ux50) entry5.getKey()).m84132c();
                Iterator it6 = ((Set) entry5.getValue()).iterator();
                while (it6.hasNext()) {
                    xjpVar.m91246v(strM84132c, (xw50) it6.next());
                }
            }
            if (arrayList8.isEmpty()) {
                return new f760(lau.f131415a);
            }
            kd31 kd31Var = new kd31(this, arrayList8, fbkVar, 0);
            jd31Var.f111229a = arrayList8;
            jd31Var.f111232d = 1;
            objM85636r = vie1.m85636r(kd31Var, jd31Var);
            if (objM85636r != obj) {
                arrayList = arrayList8;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM85636r);
            return objM85636r;
        }
        arrayList = jd31Var.f111229a;
        bga.m29073P(objM85636r);
        g760 f760Var = (g760) objM85636r;
        C1398e c1398e = new C1398e(24, arrayList, this);
        boolean z = f760Var instanceof f760;
        if (z) {
            c1398e.invoke(((f760) f760Var).f66569a);
        } else if (!(f760Var instanceof e760)) {
            throw new NoWhenBranchMatchedException();
        }
        qf11 qf11Var = new qf11(18, this, arrayList);
        boolean z2 = f760Var instanceof e760;
        if (z2) {
            qf11Var.invoke(f760Var);
        } else if (!z) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z2) {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((ResolveTokensResponse) ((f760) f760Var).f66569a).resolvedJams;
            ArrayList arrayList9 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList9.add(this.f142298b.m33210h((ResolvedJam) it7.next()));
            }
            f760Var = new f760(arrayList9);
        }
        jd31Var.f111229a = null;
        jd31Var.f111232d = 2;
        Object objM61504a = m61504a(f760Var, jd31Var);
        return objM61504a == obj ? obj : objM61504a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m61506c(List list, ibk ibkVar) {
        ld31 ld31Var;
        if (ibkVar instanceof ld31) {
            ld31Var = (ld31) ibkVar;
            int i = ld31Var.f132044d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld31Var.f132044d = i - Integer.MIN_VALUE;
            } else {
                ld31Var = new ld31(this, ibkVar);
            }
        } else {
            ld31Var = new ld31(this, ibkVar);
        }
        Object objM76981v = ld31Var.f132042b;
        int i2 = ld31Var.f132044d;
        nau nauVar = nau.f152117a;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76981v);
                long j = nd31.f152646a;
                vx01 vx01Var = new vx01(this, list, fbkVar, 28);
                ld31Var.f132041a = list;
                ld31Var.f132044d = 1;
                objM76981v = s1h1.m76981v(j, vx01Var, ld31Var);
                yuk yukVar = yuk.f276404a;
                if (objM76981v == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = ld31Var.f132041a;
                bga.m29073P(objM76981v);
            }
            Map map = (Map) objM76981v;
            if (map == null) {
                na6.m63971s("Profile resolution timed out for " + list.size() + " usernames");
                return nauVar;
            }
            Collection collectionValues = map.values();
            int i3 = 0;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if ((((a0x0) it.next()) instanceof yzw0) && (i3 = i3 + 1) < 0) {
                        h6f.m46721R();
                        throw null;
                    }
                }
            }
            if (i3 < list.size()) {
                na6.m63971s("Profile resolution resolved " + i3 + "/" + list.size() + " usernames");
            }
            return map;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63959g("Failed to resolve profiles for available jams", e2);
            return nauVar;
        }
    }
}
