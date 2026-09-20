package p204p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dka1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f49945a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f49946b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public vja1 f49947c;

    /* JADX INFO: renamed from: a */
    public final he41 m36262a(ff41 ff41Var, LinkedHashMap linkedHashMap, int i) {
        he41 he41VarM36262a;
        List list = ff41Var.f68908b;
        if (i == list.size()) {
            vja1 vja1Var = this.f49947c;
            if (vja1Var != null) {
                return vja1Var.mo24405j(ff41Var.f68907a, linkedHashMap, ff41Var.f68909c, ff41Var.f68910d);
            }
            return null;
        }
        String str = (String) list.get(i);
        dka1 dka1Var = (dka1) this.f49945a.get(str);
        if (dka1Var != null && (he41VarM36262a = dka1Var.m36262a(ff41Var, linkedHashMap, i + 1)) != null) {
            return he41VarM36262a;
        }
        for (Map.Entry entry : this.f49946b.entrySet()) {
            String str2 = (String) entry.getKey();
            dka1 dka1Var2 = (dka1) entry.getValue();
            String str3 = (String) linkedHashMap.get(str2);
            linkedHashMap.put(str2, str);
            he41 he41VarM36262a2 = dka1Var2.m36262a(ff41Var, linkedHashMap, i + 1);
            if (he41VarM36262a2 != null) {
                return he41VarM36262a2;
            }
            if (str3 != null) {
                linkedHashMap.put(str2, str3);
            } else {
                linkedHashMap.remove(str2);
            }
        }
        return null;
    }
}
