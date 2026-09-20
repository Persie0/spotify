package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class pn91 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f179347a;

    public pn91(LinkedHashMap linkedHashMap) {
        this.f179347a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final pn91 m70430a() {
        LinkedHashMap linkedHashMap = this.f179347a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            de60 de60Var = (de60) entry.getValue();
            linkedHashMap2.put(key, new de60(de60Var.f47974a, de60Var.f47975b, de60Var.f47976c, true, true));
        }
        return new pn91(linkedHashMap2);
    }
}
