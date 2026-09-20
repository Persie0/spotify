package p204p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class tnx0 implements z5a1 {

    /* JADX INFO: renamed from: a */
    public final List f222095a;

    /* JADX INFO: renamed from: b */
    public final qe70 f222096b;

    /* JADX INFO: renamed from: d */
    public volatile boolean f222098d;

    /* JADX INFO: renamed from: j */
    public final z5a1 f222104j;

    /* JADX INFO: renamed from: c */
    public final Object f222097c = new Object();

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f222099e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f222100f = new LinkedHashSet();

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f222101g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f222102h = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f222103i = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public tnx0(erh erhVar, List list, gh00 gh00Var) {
        this.f222095a = list;
        this.f222096b = (qe70) gh00Var;
        this.f222104j = erhVar.mo24861c(new ono0(this, 17));
    }

    /* JADX WARN: Type inference failed for: r4v21, types: [p.gh00, p.qe70] */
    @Override // p204p.z5a1
    /* JADX INFO: renamed from: a */
    public final Map mo28289a(Set set) {
        mec0 mec0VarM61540b;
        synchronized (this.f222097c) {
            try {
                if (this.f222098d) {
                    throw new IllegalStateException("Subscription is disposed");
                }
                mec0 mec0Var = new mec0();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    k35 k35Var = (k35) it.next();
                    tmx0 tmx0VarM81189f = m81189f(k35Var);
                    if (tmx0VarM81189f != null) {
                    }
                }
                mec0 mec0VarM61540b2 = mec0Var.m61540b();
                Set setM77305h0 = s601.m77305h0(set, mec0VarM61540b2.keySet());
                Set<k35> setM77305h1 = s601.m77305h0(mec0VarM61540b2.keySet(), this.f222099e);
                Set<k35> setM77305h2 = s601.m77305h0(setM77305h0, this.f222100f);
                LinkedHashSet linkedHashSet = this.f222099e;
                linkedHashSet.clear();
                linkedHashSet.addAll(mec0VarM61540b2.keySet());
                LinkedHashSet linkedHashSet2 = this.f222100f;
                linkedHashSet2.clear();
                linkedHashSet2.addAll(setM77305h0);
                LinkedHashMap linkedHashMap = this.f222102h;
                linkedHashMap.clear();
                linkedHashMap.putAll(mec0VarM61540b2);
                this.f222101g.clear();
                for (Map.Entry entry : this.f222102h.entrySet()) {
                    k35 k35Var2 = (k35) entry.getKey();
                    for (k35 k35Var3 : (Set) ((tmx0) entry.getValue()).f221797b.invoke(k35Var2)) {
                        LinkedHashMap linkedHashMap2 = this.f222101g;
                        Object linkedHashSet3 = linkedHashMap2.get(k35Var3);
                        if (linkedHashSet3 == null) {
                            linkedHashSet3 = new LinkedHashSet();
                            linkedHashMap2.put(k35Var3, linkedHashSet3);
                        }
                        ((Set) linkedHashSet3).add(k35Var2);
                    }
                }
                this.f222103i.keySet().retainAll(this.f222101g.keySet());
                Map mapMo28289a = this.f222104j.mo28289a(s601.m77309l0(setM77305h0, this.f222101g.keySet()));
                for (Map.Entry entry2 : mapMo28289a.entrySet()) {
                    k35 k35Var4 = (k35) entry2.getKey();
                    pjo pjoVar = (pjo) entry2.getValue();
                    if (this.f222101g.containsKey(k35Var4)) {
                        this.f222103i.put(k35Var4, pjoVar);
                    }
                }
                mec0 mec0Var2 = new mec0();
                for (k35 k35Var5 : setM77305h2) {
                    Object obj = (pjo) mapMo28289a.get(k35Var5);
                    if (obj == null) {
                        obj = njo.f154639a;
                    }
                    mec0Var2.put(k35Var5, obj);
                }
                for (k35 k35Var6 : setM77305h1) {
                    mec0Var2.put(k35Var6, m81188e(k35Var6, new y3w0(23, this, mapMo28289a)));
                }
                mec0VarM61540b = mec0Var2.m61540b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return mec0VarM61540b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [p.gh00, p.qe70] */
    @Override // p204p.z5a1
    /* JADX INFO: renamed from: b */
    public final void mo28290b(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.f222097c) {
            try {
                if (this.f222098d) {
                    throw new IllegalStateException("Subscription is disposed");
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    k35 k35Var = (k35) it.next();
                    tmx0 tmx0VarM81189f = m81189f(k35Var);
                    if (tmx0VarM81189f != null) {
                        linkedHashSet.addAll((Collection) tmx0VarM81189f.f221797b.invoke(k35Var));
                    } else {
                        linkedHashSet.add(k35Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f222104j.mo28290b(linkedHashSet);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [p.gh00, p.qe70] */
    @Override // p204p.z5a1
    /* JADX INFO: renamed from: c */
    public final Object mo28291c(pqm0 pqm0Var, ibk ibkVar) {
        synchronized (this.f222097c) {
            try {
                if (this.f222098d) {
                    throw new IllegalStateException("Subscription is disposed");
                }
                k35 k35Var = (k35) pqm0Var.f180350a;
                List list = this.f222095a;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((tmx0) it.next()).f221796a.invoke(k35Var)).booleanValue()) {
                            throw new DataSourceException.UnsupportedKey(k35Var);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objMo28291c = this.f222104j.mo28291c(pqm0Var, ibkVar);
        return objMo28291c == yuk.f276404a ? objMo28291c : w2a1.f247311a;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [p.gh00, p.qe70] */
    @Override // p204p.z5a1
    /* JADX INFO: renamed from: d */
    public final Object mo28292d(pqm0 pqm0Var, ibk ibkVar) {
        synchronized (this.f222097c) {
            try {
                if (this.f222098d) {
                    throw new IllegalStateException("Subscription is disposed");
                }
                k35 k35Var = (k35) pqm0Var.f180350a;
                List list = this.f222095a;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((tmx0) it.next()).f221796a.invoke(k35Var)).booleanValue()) {
                            throw new DataSourceException.UnsupportedKey(k35Var);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objMo28292d = this.f222104j.mo28292d(pqm0Var, ibkVar);
        return objMo28292d == yuk.f276404a ? objMo28292d : w2a1.f247311a;
    }

    @Override // p204p.z5a1
    public final void dispose() {
        synchronized (this.f222097c) {
            if (this.f222098d) {
                return;
            }
            this.f222098d = true;
            this.f222104j.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: e */
    public final pjo m81188e(k35 k35Var, gh00 gh00Var) {
        Object obj = this.f222102h.get(k35Var);
        wj50.m88279p(obj);
        tmx0 tmx0Var = (tmx0) obj;
        mec0 mec0Var = new mec0();
        for (k35 k35Var2 : (Set) tmx0Var.f221797b.invoke(k35Var)) {
            pjo pjoVar = (pjo) gh00Var.invoke(k35Var2);
            if (pjoVar != null) {
            }
        }
        return (pjo) tmx0Var.f221798c.invoke(k35Var, mec0Var.m61540b());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: f */
    public final tmx0 m81189f(k35 k35Var) {
        Object next;
        Iterator it = this.f222095a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((Boolean) ((tmx0) next).f221796a.invoke(k35Var)).booleanValue()) {
                return (tmx0) next;
            }
        }
        next = null;
        return (tmx0) next;
    }
}
