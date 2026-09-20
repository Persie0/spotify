package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y6q0 {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f269892a;

    public y6q0(String str) {
        new iw3(18);
        this.f269892a = new CopyOnWriteArrayList();
        m92968a(new p040(str));
    }

    /* JADX INFO: renamed from: c */
    public static LinkedHashMap m92967c(ArrayList arrayList) {
        int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x6q0 x6q0Var = (x6q0) it.next();
            pqm0 pqm0VarM69840u = pft0.m69840u(x6q0Var.getPolicyId(), x6q0Var.mo29381a());
            linkedHashMap.put(pqm0VarM69840u.f180350a, pqm0VarM69840u.f180351b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final void m92968a(x6q0 x6q0Var) {
        this.f269892a.add(x6q0Var);
    }

    /* JADX INFO: renamed from: b */
    public final TreeMap m92969b() {
        return new TreeMap(m92967c(g6f.m43700N0(lau.f131415a, this.f269892a)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y6q0) {
            return m92969b().equals(((y6q0) obj).m92969b());
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayListM43700N0 = g6f.m43700N0(lau.f131415a, this.f269892a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM43700N0) {
            if (((x6q0) obj).mo41803b()) {
                arrayList.add(obj);
            }
        }
        return m92967c(arrayList).hashCode();
    }
}
