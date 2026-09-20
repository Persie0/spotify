package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q6k {

    /* JADX INFO: renamed from: a */
    public final Set f185837a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f185838b;

    public q6k(hg40 hg40Var) {
        up60 up60Var;
        this.f185837a = hg40Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hg40Var) {
            vy2 vy2Var = (vy2) obj;
            switch (vy2Var.f245896a) {
                case 0:
                    up60Var = vy2Var.f245898c;
                    break;
                case 1:
                    up60Var = vy2Var.f245898c;
                    break;
                case 2:
                    up60Var = vy2Var.f245898c;
                    break;
                case 3:
                    up60Var = vy2Var.f245898c;
                    break;
                case 4:
                    up60Var = vy2Var.f245898c;
                    break;
                case 5:
                    up60Var = vy2Var.f245898c;
                    break;
                case 6:
                    up60Var = vy2Var.f245898c;
                    break;
                case 7:
                    up60Var = vy2Var.f245898c;
                    break;
                case 8:
                    up60Var = vy2Var.f245898c;
                    break;
                case 9:
                    up60Var = vy2Var.f245898c;
                    break;
                case 10:
                    up60Var = vy2Var.f245898c;
                    break;
                default:
                    up60Var = vy2Var.f245898c;
                    break;
            }
            Object arrayList = linkedHashMap.get(up60Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(up60Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f185838b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            Set setKeySet = linkedHashMap2.keySet();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((up60) it.next()).mo29111F());
            }
            na6.m63957e("Duplicate ContextMenuRegistration keys: " + arrayList2);
        }
        Set set = this.f185837a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj2 : set) {
            njg0 njg0VarM86702b = ((vy2) obj2).m86702b();
            Object arrayList3 = linkedHashMap3.get(njg0VarM86702b);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(njg0VarM86702b, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            if (((List) entry2.getValue()).size() > 1) {
                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (linkedHashMap4.isEmpty()) {
            return;
        }
        na6.m63957e("Duplicate ContextMenuRegistration UBI IDs: " + linkedHashMap4.keySet());
    }
}
