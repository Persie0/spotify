package p204p;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class obn0 {

    /* JADX INFO: renamed from: a */
    public static final Map f163683a;

    /* JADX INFO: renamed from: b */
    public static final Map f163684b;

    /* JADX INFO: renamed from: c */
    public static final Map f163685c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (nbn0 nbn0Var : nbn0.f152324b) {
            Class cls = nbn0Var.f152326a;
            Class cls2 = nbn0Var.f152326a;
            map3.put(cls, nbn0Var);
            map.put(cls2.getSimpleName(), nbn0Var);
            map2.put(cls2.getName(), nbn0Var);
        }
        f163685c = Collections.unmodifiableMap(map3);
        f163684b = Collections.unmodifiableMap(map2);
        f163683a = Collections.unmodifiableMap(map);
    }
}
