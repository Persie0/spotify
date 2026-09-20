package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ct91 {

    /* JADX INFO: renamed from: a */
    public final Object f41816a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f41817b = new LinkedHashMap();

    public ct91(gh00 gh00Var) {
        this.f41816a = gh00Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p.gh00] */
    /* JADX INFO: renamed from: a */
    public final Object m33828a(Object obj) {
        LinkedHashMap linkedHashMap = this.f41817b;
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = this.f41816a.invoke(obj);
        linkedHashMap.put(obj, objInvoke);
        return objInvoke;
    }
}
