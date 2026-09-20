package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class kr00 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f125486a;

    public kr00(int i) {
        switch (i) {
            case 1:
                this.f125486a = new ConcurrentHashMap();
                break;
            default:
                this.f125486a = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public ArrayList m57131a(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f125486a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((jr00) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public void m57132b(String str, ArrayList arrayList) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jr00 jr00Var = (jr00) it.next();
            concurrentHashMap.put(jr00Var.f115046a, jr00Var);
        }
        this.f125486a.put(str, concurrentHashMap);
    }
}
