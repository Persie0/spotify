package p204p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n50 implements a6a1 {

    /* JADX INFO: renamed from: a */
    public final a6a1 f150440a;

    /* JADX INFO: renamed from: b */
    public final List f150441b;

    /* JADX INFO: renamed from: c */
    public final isl0 f150442c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f150443d;

    /* JADX INFO: renamed from: e */
    public final c9k f150444e;

    public n50(a6a1 a6a1Var, List list, isl0 isl0Var) {
        n5q n5qVar = xsr.f265651a;
        this.f150440a = a6a1Var;
        this.f150441b = list;
        this.f150442c = isl0Var;
        this.f150443d = new CopyOnWriteArrayList();
        this.f150444e = kk40.m56661c(mlg1.m62205A(njg1.m64613f(), n5qVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r13v2, types: [p.mb61, p.xh00] */
    /* JADX INFO: renamed from: f */
    public static final Object m63692f(n50 n50Var, pqm0 pqm0Var, d20 d20Var, ibk ibkVar) {
        k50 k50Var;
        Throwable th;
        k35 k35Var;
        Object obj;
        k35 k35Var2;
        Object obj2;
        isl0 isl0Var = n50Var.f150442c;
        if (ibkVar instanceof k50) {
            k50Var = (k50) ibkVar;
            int i = k50Var.f119377e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k50Var.f119377e = i - Integer.MIN_VALUE;
            } else {
                k50Var = new k50(n50Var, ibkVar);
            }
        } else {
            k50Var = new k50(n50Var, ibkVar);
        }
        Object obj3 = k50Var.f119375c;
        int i2 = k50Var.f119377e;
        if (i2 == 0) {
            bga.m29073P(obj3);
            k35 k35Var3 = (k35) pqm0Var.f180350a;
            Object obj4 = new Object();
            isl0Var.f105267b.put(k35Var3, obj4);
            Object objM51546c = isl0Var.m51546c(k35Var3);
            if (objM51546c == null) {
                pjo pjoVar = (pjo) n50Var.f150440a.mo24860b(Collections.singleton(k35Var3)).get(k35Var3);
                objM51546c = (pjoVar == null || !(pjoVar instanceof ojo)) ? null : ((ojo) pjoVar).f166104a;
            }
            try {
                ?? r13 = d20Var.f44395b;
                Object obj5 = pqm0Var.f180351b;
                k50Var.f119373a = k35Var3;
                k50Var.f119374b = obj4;
                k50Var.f119377e = 1;
                Object objMo24818M = r13.mo24818M(k35Var3, obj5, objM51546c, k50Var);
                yuk yukVar = yuk.f276404a;
                if (objMo24818M == yukVar) {
                    return yukVar;
                }
                k35Var2 = k35Var3;
                obj2 = obj4;
                obj3 = objMo24818M;
                x0h1.m89578u(n50Var.f150444e, null, 0, new C1977ig((fiz) obj3, n50Var, k35Var2, obj2, (fbk) null), 3);
                return w2a1.f247311a;
            } catch (Throwable th2) {
                th = th2;
                k35Var = k35Var3;
                obj = obj4;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = k50Var.f119374b;
            k35Var = k50Var.f119373a;
            try {
                bga.m29073P(obj3);
                obj2 = obj;
                k35Var2 = k35Var;
                try {
                    x0h1.m89578u(n50Var.f150444e, null, 0, new C1977ig((fiz) obj3, n50Var, k35Var2, obj2, (fbk) null), 3);
                    return w2a1.f247311a;
                } catch (Throwable th3) {
                    th = th3;
                    k35Var = k35Var2;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        isl0Var.m51544a(k35Var, obj);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v2, types: [p.mb61, p.xh00] */
    /* JADX INFO: renamed from: g */
    public static final Object m63693g(n50 n50Var, pqm0 pqm0Var, d20 d20Var, ibk ibkVar) {
        m50 m50Var;
        k35 k35Var;
        Object obj;
        fiz fizVar;
        Throwable th;
        Object obj2;
        k35 k35Var2;
        isl0 isl0Var = n50Var.f150442c;
        if (ibkVar instanceof m50) {
            m50Var = (m50) ibkVar;
            int i = m50Var.f140063e;
            if ((i & Integer.MIN_VALUE) != 0) {
                m50Var.f140063e = i - Integer.MIN_VALUE;
            } else {
                m50Var = new m50(n50Var, ibkVar);
            }
        } else {
            m50Var = new m50(n50Var, ibkVar);
        }
        Object obj3 = m50Var.f140061c;
        int i2 = m50Var.f140063e;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj3);
                k35 k35Var3 = (k35) pqm0Var.f180350a;
                Object obj4 = new Object();
                isl0Var.f105267b.put(k35Var3, obj4);
                Object objM51546c = isl0Var.m51546c(k35Var3);
                if (objM51546c == null) {
                    pjo pjoVar = (pjo) n50Var.f150440a.mo24860b(Collections.singleton(k35Var3)).get(k35Var3);
                    objM51546c = (pjoVar == null || !(pjoVar instanceof ojo)) ? null : ((ojo) pjoVar).f166104a;
                }
                try {
                    ?? r12 = d20Var.f44395b;
                    Object obj5 = pqm0Var.f180351b;
                    m50Var.f140059a = k35Var3;
                    m50Var.f140060b = obj4;
                    m50Var.f140063e = 1;
                    Object objMo24818M = r12.mo24818M(k35Var3, obj5, objM51546c, m50Var);
                    if (objMo24818M != yukVar) {
                        k35Var = k35Var3;
                        obj3 = objMo24818M;
                        obj = obj4;
                    }
                    return yukVar;
                } catch (Throwable th2) {
                    th = th2;
                    k35Var = k35Var3;
                    obj = obj4;
                    isl0Var.m51544a(k35Var, obj);
                    throw th;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = m50Var.f140060b;
                k35Var2 = m50Var.f140059a;
                try {
                    bga.m29073P(obj3);
                    isl0Var.m51544a(k35Var2, obj2);
                    return w2a1.f247311a;
                } catch (Throwable th3) {
                    th = th3;
                    isl0Var.m51544a(k35Var2, obj2);
                    throw th;
                }
            }
            obj = m50Var.f140060b;
            k35Var = m50Var.f140059a;
            try {
                bga.m29073P(obj3);
            } catch (Throwable th4) {
                th = th4;
                isl0Var.m51544a(k35Var, obj);
                throw th;
            }
            l50 l50Var = new l50(n50Var, k35Var, obj, 1);
            m50Var.f140059a = k35Var;
            m50Var.f140060b = obj;
            m50Var.f140063e = 2;
            if (fizVar.collect(l50Var, m50Var) != yukVar) {
                obj2 = obj;
                k35Var2 = k35Var;
                isl0Var.m51544a(k35Var2, obj2);
                return w2a1.f247311a;
            }
            return yukVar;
        } catch (Throwable th5) {
            k35 k35Var4 = k35Var;
            th = th5;
            obj2 = obj;
            k35Var2 = k35Var4;
            isl0Var.m51544a(k35Var2, obj2);
            throw th;
        }
        fizVar = (fiz) obj3;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [p.qe70, p.th00] */
    /* JADX INFO: renamed from: h */
    public static final d20 m63694h(n50 n50Var, pqm0 pqm0Var) {
        Object obj = pqm0Var.f180351b;
        Object obj2 = pqm0Var.f180350a;
        List list = n50Var.f150441b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((Boolean) ((d20) obj3).f44394a.invoke(obj2, obj)).booleanValue()) {
                arrayList.add(obj3);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (d20) g6f.m43706T0(arrayList);
        }
        throw new DataSourceException.InvalidAction((k35) obj2, obj);
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: b */
    public final Map mo24860b(Set set) throws DataSourceException.UnsupportedKey {
        a6a1 a6a1Var;
        k35 k35Var;
        Set<k35> set2 = set;
        Iterator it = set2.iterator();
        do {
            boolean zHasNext = it.hasNext();
            a6a1Var = this.f150440a;
            if (!zHasNext) {
                ArrayList arrayList = new ArrayList();
                for (k35 k35Var2 : set2) {
                    Object objM51546c = this.f150442c.m51546c(k35Var2);
                    pqm0 pqm0VarM69840u = objM51546c != null ? pft0.m69840u(k35Var2, new ojo(objM51546c)) : null;
                    if (pqm0VarM69840u != null) {
                        arrayList.add(pqm0VarM69840u);
                    }
                }
                Map mapM56705r0 = kkc0.m56705r0(arrayList);
                Set setM77305h0 = s601.m77305h0(set, mapM56705r0.keySet());
                Map mapMo24860b = !setM77305h0.isEmpty() ? a6a1Var.mo24860b(setM77305h0) : nau.f152117a;
                int iM31820L = c95.m31820L(i6f.m49804T(set2, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj : set2) {
                    k35 k35Var3 = (k35) obj;
                    pjo pjoVar = (ojo) mapM56705r0.get(k35Var3);
                    if (pjoVar == null && (pjoVar = (pjo) mapMo24860b.get(k35Var3)) == null) {
                        pjoVar = njo.f154639a;
                    }
                    linkedHashMap.put(obj, pjoVar);
                }
                return linkedHashMap;
            }
            k35Var = (k35) it.next();
        } while (a6a1Var.mo24862e(k35Var));
        throw new DataSourceException.UnsupportedKey(k35Var);
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: c */
    public final z5a1 mo24861c(gh00 gh00Var) {
        j50 j50Var = new j50(this, gh00Var);
        this.f150443d.add(j50Var);
        return j50Var;
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: e */
    public final boolean mo24862e(k35 k35Var) {
        return this.f150440a.mo24862e(k35Var);
    }
}
