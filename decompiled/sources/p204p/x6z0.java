package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class x6z0 {

    /* JADX INFO: renamed from: a */
    public final btv0 f258776a;

    public x6z0(btv0 btv0Var) {
        this.f258776a = btv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m90107a(ph3 ph3Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f258776a.entrySet()) {
            if (((y6z0) entry.getValue()).mo34951a(ph3Var)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((w6z0) ((Map.Entry) it.next()).getKey());
        }
        return g6f.m43711Y0(arrayList, new btm0(25));
    }
}
