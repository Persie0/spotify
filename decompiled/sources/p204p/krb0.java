package p204p;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class krb0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f125604a = 0;

    static {
        yu60[] yu60VarArr = {new x130(jrb0.class)};
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
            qsv0.m73767f(new z130(), true);
            l32.m57965W();
            qsv0.m73768g(new mrb0());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
