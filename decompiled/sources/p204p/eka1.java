package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class eka1 {

    /* JADX INFO: renamed from: a */
    public final dka1 f60421a = new dka1();

    /* JADX INFO: renamed from: a */
    public final he41 m39275a(ff41 ff41Var) {
        return this.f60421a.m36262a(ff41Var, new LinkedHashMap(), 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m39276b(String str, vja1 vja1Var) {
        Object dka1Var;
        dka1 dka1Var2 = this.f60421a;
        for (String str2 : wl51.m88476Z0(str, new char[]{'/'}, 6)) {
            if (wl51.m88478b1(str2, '{') && wl51.m88502z0(str2, '}')) {
                String string = wl51.m88491o1(wl51.m88486j1(wl51.m88472V0(str2, "{", "}"), " as")).toString();
                LinkedHashMap linkedHashMap = dka1Var2.f49946b;
                dka1Var = linkedHashMap.get(string);
                if (dka1Var == null) {
                    dka1Var = new dka1();
                    linkedHashMap.put(string, dka1Var);
                }
            } else {
                LinkedHashMap linkedHashMap2 = dka1Var2.f49945a;
                dka1Var = linkedHashMap2.get(str2);
                if (dka1Var == null) {
                    dka1Var = new dka1();
                    linkedHashMap2.put(str2, dka1Var);
                }
            }
            dka1Var2 = (dka1) dka1Var;
        }
        dka1Var2.f49947c = vja1Var;
    }
}
