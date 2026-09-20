package p204p;

import android.app.Activity;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class gxf implements jwf {

    /* JADX INFO: renamed from: h */
    public static final dxf f85275h = new dxf(0);

    /* JADX INFO: renamed from: a */
    public final Object f85276a;

    /* JADX INFO: renamed from: b */
    public final Object f85277b;

    /* JADX INFO: renamed from: c */
    public final Object f85278c;

    /* JADX INFO: renamed from: d */
    public final Object f85279d;

    /* JADX INFO: renamed from: e */
    public final Object f85280e;

    /* JADX INFO: renamed from: f */
    public final Object f85281f;

    /* JADX INFO: renamed from: g */
    public final Object f85282g;

    public gxf(ubq0 ubq0Var, kv91 kv91Var, if0 if0Var, w6j0 w6j0Var, viy0 viy0Var, qya0 qya0Var, Activity activity) {
        this.f85276a = ubq0Var;
        this.f85277b = kv91Var;
        this.f85278c = if0Var;
        this.f85279d = w6j0Var;
        this.f85280e = viy0Var;
        this.f85281f = qya0Var;
        this.f85282g = activity;
    }

    @Override // p204p.jwf
    /* JADX INFO: renamed from: b */
    public synchronized j4t0 mo46061b(eht0 eht0Var) {
        vx70 vx70Var = (vx70) ((HashMap) this.f85278c).get(eht0Var);
        if (vx70Var != null) {
            return vx70Var;
        }
        return f85275h;
    }

    @Override // p204p.jwf
    /* JADX INFO: renamed from: e */
    public synchronized j4t0 mo46062e(eht0 eht0Var) {
        bga.m29092n(eht0Var, "Null interface requested.");
        return (j4t0) ((HashMap) this.f85277b).get(eht0Var);
    }

    /* JADX INFO: renamed from: f */
    public void m46063f(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            svf svfVar = (svf) entry.getKey();
            j4t0 j4t0Var = (j4t0) entry.getValue();
            int i = svfVar.f214423d;
            if (i == 1 || (i == 2 && z)) {
                j4t0Var.get();
            }
        }
        v3x v3xVar = (v3x) this.f85280e;
        synchronized (v3xVar) {
            try {
                arrayDeque = v3xVar.f236970b;
                if (arrayDeque != null) {
                    v3xVar.f236970b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                ikc0.m50942n(it.next());
                throw null;
            }
        }
    }

    @Override // p204p.jwf
    /* JADX INFO: renamed from: g */
    public fvl0 mo46064g(eht0 eht0Var) {
        j4t0 j4t0VarMo46062e = mo46062e(eht0Var);
        if (j4t0VarMo46062e == null) {
            return new fvl0(fvl0.f73812c, fvl0.f73813d);
        }
        return j4t0VarMo46062e instanceof fvl0 ? (fvl0) j4t0VarMo46062e : new fvl0(null, j4t0VarMo46062e);
    }

    /* JADX INFO: renamed from: i */
    public void m46065i(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.f85281f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.f85276a);
        }
        m46063f(map, z);
    }

    /* JADX INFO: renamed from: j */
    public void m46066j() {
        HashMap map = (HashMap) this.f85277b;
        HashMap map2 = (HashMap) this.f85278c;
        for (svf svfVar : ((HashMap) this.f85276a).keySet()) {
            for (btq btqVar : svfVar.f214422c) {
                boolean z = btqVar.f30912b == 2;
                eht0 eht0Var = btqVar.f30911a;
                if (z && !map2.containsKey(eht0Var)) {
                    Set set = Collections.EMPTY_SET;
                    vx70 vx70Var = new vx70();
                    vx70Var.f245636b = null;
                    vx70Var.f245635a = Collections.newSetFromMap(new ConcurrentHashMap());
                    vx70Var.f245635a.addAll(set);
                    map2.put(eht0Var, vx70Var);
                } else if (map.containsKey(eht0Var)) {
                    continue;
                } else {
                    int i = btqVar.f30912b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + svfVar + ": " + eht0Var);
                    }
                    if (i != 2) {
                        map.put(eht0Var, new fvl0(fvl0.f73812c, fvl0.f73813d));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public ArrayList m46067k(ArrayList arrayList) {
        HashMap map = (HashMap) this.f85277b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            svf svfVar = (svf) it.next();
            if (svfVar.f214424e == 0) {
                j4t0 j4t0Var = (j4t0) ((HashMap) this.f85276a).get(svfVar);
                for (eht0 eht0Var : svfVar.f214421b) {
                    if (map.containsKey(eht0Var)) {
                        arrayList2.add(new fxf(0, (fvl0) ((j4t0) map.get(eht0Var)), j4t0Var));
                    } else {
                        map.put(eht0Var, j4t0Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public ArrayList m46068l() {
        HashMap map = (HashMap) this.f85278c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f85276a).entrySet()) {
            svf svfVar = (svf) entry.getKey();
            if (svfVar.f214424e != 0) {
                j4t0 j4t0Var = (j4t0) entry.getValue();
                for (eht0 eht0Var : svfVar.f214421b) {
                    if (!map2.containsKey(eht0Var)) {
                        map2.put(eht0Var, new HashSet());
                    }
                    ((Set) map2.get(eht0Var)).add(j4t0Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                vx70 vx70Var = (vx70) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new fxf(1, vx70Var, (j4t0) it.next()));
                }
            } else {
                eht0 eht0Var2 = (eht0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                vx70 vx70Var2 = new vx70();
                vx70Var2.f245636b = null;
                vx70Var2.f245635a = Collections.newSetFromMap(new ConcurrentHashMap());
                vx70Var2.f245635a.addAll(set);
                map.put(eht0Var2, vx70Var2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0027  */
    /* JADX INFO: renamed from: m */
    public d850 m46069m(int i, bk7 bk7Var) {
        av91 av91VarM79594a;
        d850 d850VarMo57452p;
        av91 av91VarM89017a;
        kv91 kv91Var = (kv91) this.f85277b;
        ubq0 ubq0Var = (ubq0) this.f85276a;
        viy0 viy0Var = (viy0) this.f85280e;
        ubq0Var.mo59114a(new sbq0(viy0Var.f241825a, tfe.m80644b(i), n850.f151357c, nap.m64014g(20)));
        if (viy0Var == viy0.START_INTENT_LED) {
            int iM38547C = edb.m38547C(i);
            if (iM38547C != 10) {
                av91VarM79594a = iM38547C != 11 ? null : sjf1.m78336u().m32166m().m79594a(hp3.m48111f());
            } else {
                av91VarM79594a = sjf1.m78336u().m32167n().m79594a(hp3.m48115j());
            }
            if (av91VarM79594a != null) {
                d850VarMo57452p = kv91Var.mo57452p(av91VarM79594a);
            } else {
                d850VarMo57452p = null;
            }
        } else {
            d850VarMo57452p = null;
        }
        if (d850VarMo57452p != null) {
            return d850VarMo57452p;
        }
        viy0 viy0Var2 = viy0.CHOOSER_SIGNUP;
        viy0 viy0Var3 = viy0.CHOOSER_LOGIN;
        if (viy0Var == viy0Var2 || viy0Var == viy0Var3) {
            switch (bk7Var.ordinal()) {
                case 0:
                    av91VarM89017a = cjf1.m32956G().m92192q().m89017a(hp3.m48114i());
                    break;
                case 1:
                    av91VarM89017a = cjf1.m32956G().m92184i().m89017a(hp3.m48109c());
                    break;
                case 2:
                    av91VarM89017a = cjf1.m32956G().m92185j().m89017a(hp3.m48110d());
                    break;
                case 3:
                    av91VarM89017a = cjf1.m32956G().m92188m().m89017a(hp3.m48112g());
                    break;
                case 4:
                    av91VarM89017a = cjf1.m32956G().m92191p().m89017a(hp3.m48113h());
                    break;
                case 5:
                    av91VarM89017a = cjf1.m32956G().m92183h().m89017a(hp3.m48108b());
                    break;
                case 6:
                    av91VarM89017a = cjf1.m32956G().m92182e().m89017a(viy0Var == viy0Var3 ? hp3.m48111f() : hp3.m48115j());
                    break;
                default:
                    av91VarM89017a = null;
                    break;
            }
            if (av91VarM89017a != null) {
                return kv91Var.mo57452p(av91VarM89017a);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public ArrayList m46070n(ArrayList arrayList, gh00 gh00Var) {
        gxf gxfVar;
        c0r c0rVar;
        Object fzqVar;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bk7 bk7Var = (bk7) it.next();
            gh00 c2588xt = (gh00) gh00Var.invoke(bk7Var);
            if (c2588xt == null) {
                i54 i54Var = ((qya0) this.f85281f).f193860a;
                int iOrdinal = bk7Var.ordinal();
                int i = 22;
                if (iOrdinal != 0) {
                    Object obj = null;
                    if (iOrdinal == 1) {
                        c2588xt = new gg7(this, 13, bk7Var, new fg7(this, 0), new mab0(obj, 10));
                    } else if (iOrdinal == 2) {
                        gxfVar = this;
                        c2588xt = new gg7(gxfVar, 14, bk7Var, new fg7(this, 1), (mab0) null);
                    } else if (iOrdinal == 3) {
                        int iOrdinal2 = ((viy0) this.f85280e).ordinal();
                        if (iOrdinal2 == 21) {
                            c0rVar = c0r.f32847a;
                        } else {
                            if (iOrdinal2 != 22) {
                                throw new IllegalStateException("Naver flow started from unexpected screen");
                            }
                            c0rVar = c0r.f32848b;
                        }
                        c2588xt = new C2588xt(this, 15, bk7Var, new d0r(c0rVar), 3);
                    } else if (iOrdinal == 4) {
                        c2588xt = new C2588xt(this, 44, bk7Var, new nzq(mzq.f148760b, null), 3);
                    } else if (iOrdinal == 5) {
                        if (i54Var.m49751m()) {
                            fzqVar = tzq.f225287a;
                        } else {
                            fzqVar = (i54Var.m49752n() && ((Activity) this.f85282g).getIntent().getBooleanExtra("is_web_login_flow_supported", true)) ? new fzq(new o0b0(), rk7.f200014h, null) : new a0r(null);
                        }
                        c2588xt = new C2588xt(this, 12, bk7Var, fzqVar, 3);
                    } else {
                        if (iOrdinal != 8 && iOrdinal != 9) {
                            throw new IllegalStateException("Unexpected default button");
                        }
                        gxfVar = this;
                        c2588xt = new C2588xt(gxfVar, 11, bk7Var, new fzq(i0b0.f97198a, rk7.f200007a, null), 3);
                    }
                } else {
                    c2588xt = new C2588xt(this, i, bk7Var, e0r.f55023a, 3);
                }
            }
            arrayList2.add(new nqa(bk7Var, c2588xt));
        }
        return arrayList2;
    }

    public gxf(Executor executor, ArrayList arrayList, ArrayList arrayList2, zwf zwfVar) {
        this.f85276a = new HashMap();
        this.f85277b = new HashMap();
        this.f85278c = new HashMap();
        this.f85279d = new HashSet();
        this.f85281f = new AtomicReference();
        v3x v3xVar = new v3x(executor);
        this.f85280e = v3xVar;
        this.f85282g = zwfVar;
        ArrayList<svf> arrayList3 = new ArrayList();
        arrayList3.add(svf.m79444c(v3xVar, v3x.class, gt51.class, j7t0.class));
        arrayList3.add(svf.m79444c(this, gxf.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            svf svfVar = (svf) it.next();
            if (svfVar != null) {
                arrayList3.add(svfVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((j4t0) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((zwf) this.f85282g).mo35061a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((svf) it4.next()).f214421b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) this.f85279d).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) this.f85279d).add(obj.toString());
                    }
                }
            }
            if (((HashMap) this.f85276a).isEmpty()) {
                k0e1.m54997q(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.f85276a).keySet());
                arrayList6.addAll(arrayList3);
                k0e1.m54997q(arrayList6);
            }
            for (final svf svfVar2 : arrayList3) {
                ((HashMap) this.f85276a).put(svfVar2, new gr70(new j4t0() { // from class: p.exf
                    @Override // p204p.j4t0
                    public final Object get() {
                        svf svfVar3 = svfVar2;
                        rwf rwfVar = svfVar3.f214425f;
                        sef0 sef0Var = new sef0();
                        HashSet hashSet = new HashSet();
                        HashSet hashSet2 = new HashSet();
                        HashSet hashSet3 = new HashSet();
                        HashSet hashSet4 = new HashSet();
                        HashSet hashSet5 = new HashSet();
                        Set<btq> set = svfVar3.f214422c;
                        Set set2 = svfVar3.f214426g;
                        for (btq btqVar : set) {
                            int i = btqVar.f30913c;
                            int i2 = btqVar.f30912b;
                            boolean z = i == 0;
                            eht0 eht0Var = btqVar.f30911a;
                            if (z) {
                                if (i2 == 2) {
                                    hashSet4.add(eht0Var);
                                } else {
                                    hashSet.add(eht0Var);
                                }
                            } else if (i == 2) {
                                hashSet3.add(eht0Var);
                            } else if (i2 == 2) {
                                hashSet5.add(eht0Var);
                            } else {
                                hashSet2.add(eht0Var);
                            }
                        }
                        if (!set2.isEmpty()) {
                            hashSet.add(eht0.m39004a(j7t0.class));
                        }
                        sef0Var.f208284a = Collections.unmodifiableSet(hashSet);
                        sef0Var.f208285b = Collections.unmodifiableSet(hashSet2);
                        sef0Var.f208286c = Collections.unmodifiableSet(hashSet3);
                        sef0Var.f208287d = Collections.unmodifiableSet(hashSet4);
                        sef0Var.f208288e = Collections.unmodifiableSet(hashSet5);
                        sef0Var.f208289f = this.f63754a;
                        return rwfVar.mo1885h(sef0Var);
                    }
                }));
            }
            arrayList5.addAll(m46067k(arrayList3));
            arrayList5.addAll(m46068l());
            m46066j();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f85281f).get();
        if (bool != null) {
            m46063f((HashMap) this.f85276a, bool.booleanValue());
        }
    }
}
