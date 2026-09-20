package p204p;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s4r {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f205633a = 0;

    static {
        yu60[] yu60VarArr = {new j32(r4r.class, 6)};
        HashMap map = new HashMap();
        yu60 yu60Var = yu60VarArr[0];
        Class cls = yu60Var.f276278a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(dq60.m36611k(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, yu60Var);
        Class cls2 = yu60VarArr[0].f276278a;
        Collections.unmodifiableMap(map);
        int i = rsv0.CONFIG_NAME_FIELD_NUMBER;
        try {
            l32.m57970b0();
            qsv0.m73768g(new u4r());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
