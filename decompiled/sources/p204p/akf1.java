package p204p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class akf1 {

    /* JADX INFO: renamed from: b */
    public static volatile akf1 f16527b;

    /* JADX INFO: renamed from: c */
    public static final akf1 f16528c = new akf1();

    /* JADX INFO: renamed from: a */
    public final Map f16529a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: a */
    public static akf1 m26215a() {
        akf1 akf1Var;
        akf1 akf1Var2 = f16527b;
        if (akf1Var2 != null) {
            return akf1Var2;
        }
        synchronized (akf1.class) {
            try {
                akf1Var = f16527b;
                if (akf1Var == null) {
                    akf1Var = f16528c;
                    f16527b = akf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return akf1Var;
    }
}
