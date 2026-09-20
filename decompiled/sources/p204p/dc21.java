package p204p;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dc21 {

    /* JADX INFO: renamed from: a */
    public final Map f47408a;

    /* JADX INFO: renamed from: b */
    public final HashMap f47409b;

    public dc21(Map map) {
        this.f47408a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (hf71 hf71Var : map.keySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry : ((Map) map.get(hf71Var)).entrySet()) {
                Object value = entry.getValue();
                Object value2 = entry.getValue();
                Object key = entry.getKey();
                fd11 fd11Var = ec21.f58217c;
                map3.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, ec21.f58217c);
            map2.put(hf71Var, arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, ec21.f58217c);
        this.f47409b = map2;
    }
}
