package p204p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gge {

    /* JADX INFO: renamed from: a */
    public final HashMap f79649a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f79650b;

    public gge(HashMap map) {
        this.f79650b = map;
        for (Map.Entry entry : map.entrySet()) {
            ta80 ta80Var = (ta80) entry.getValue();
            List arrayList = (List) this.f79649a.get(ta80Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f79649a.put(ta80Var, arrayList);
            }
            arrayList.add((hge) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m44698a(List list, hc80 hc80Var, ta80 ta80Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                hge hgeVar = (hge) list.get(size);
                Method method = hgeVar.f91143b;
                try {
                    int i = hgeVar.f91142a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, hc80Var);
                    } else if (i == 2) {
                        method.invoke(obj, hc80Var, ta80Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
