package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class unx0 implements a6a1 {

    /* JADX INFO: renamed from: a */
    public final erh f232281a;

    /* JADX INFO: renamed from: b */
    public final List f232282b;

    public unx0(erh erhVar, List list) {
        this.f232281a = erhVar;
        this.f232282b = list;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r5v0, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r6v7, types: [p.gh00, p.qe70] */
    @Override // p204p.a6a1
    /* JADX INFO: renamed from: b */
    public final Map mo24860b(Set set) {
        Object next;
        LinkedHashSet<k35> linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            k35 k35Var = (k35) it.next();
            Iterator it2 = this.f232282b.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((Boolean) ((tmx0) next).f221796a.invoke(k35Var)).booleanValue());
            tmx0 tmx0Var = (tmx0) next;
            if (tmx0Var != null) {
                linkedHashMap.put(k35Var, tmx0Var);
                linkedHashSet2.addAll((Collection) tmx0Var.f221797b.invoke(k35Var));
            } else {
                linkedHashSet.add(k35Var);
            }
        }
        LinkedHashSet linkedHashSetM77309l0 = s601.m77309l0(linkedHashSet, linkedHashSet2);
        Map mapMo24860b = !linkedHashSetM77309l0.isEmpty() ? this.f232281a.mo24860b(linkedHashSetM77309l0) : nau.f152117a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (k35 k35Var2 : linkedHashSet) {
            pjo pjoVar = (pjo) mapMo24860b.get(k35Var2);
            if (pjoVar != null) {
                linkedHashMap2.put(k35Var2, pjoVar);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            k35 k35Var3 = (k35) entry.getKey();
            tmx0 tmx0Var2 = (tmx0) entry.getValue();
            mec0 mec0Var = new mec0();
            for (k35 k35Var4 : (Set) tmx0Var2.f221797b.invoke(k35Var3)) {
                pjo pjoVar2 = (pjo) mapMo24860b.get(k35Var4);
                if (pjoVar2 != null) {
                }
            }
            linkedHashMap2.put(k35Var3, tmx0Var2.f221798c.invoke(k35Var3, mec0Var.m61540b()));
        }
        return linkedHashMap2;
    }

    @Override // p204p.a6a1
    /* JADX INFO: renamed from: c */
    public final z5a1 mo24861c(gh00 gh00Var) {
        return new tnx0(this.f232281a, this.f232282b, gh00Var);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [p.gh00, p.qe70] */
    @Override // p204p.a6a1
    /* JADX INFO: renamed from: e */
    public final boolean mo24862e(k35 k35Var) {
        List list = this.f232282b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((tmx0) it.next()).f221796a.invoke(k35Var)).booleanValue()) {
                    return true;
                }
            }
        }
        return this.f232281a.mo24862e(k35Var);
    }
}
