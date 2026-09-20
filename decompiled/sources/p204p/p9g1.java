package p204p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p9g1 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f175243a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final void m69387a(int i, long j) {
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = f175243a;
        Object m9g1Var = concurrentHashMap.get(numValueOf);
        if (m9g1Var == null) {
            m9g1Var = new m9g1();
        }
        m9g1 m9g1Var2 = (m9g1) m9g1Var;
        m9g1Var2.f141308a++;
        m9g1Var2.f141309b += j;
        m9g1Var2.f141310c = Math.max(j, m9g1Var2.f141310c);
        concurrentHashMap.put(numValueOf, m9g1Var2);
    }
}
