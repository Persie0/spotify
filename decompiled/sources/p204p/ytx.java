package p204p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ytx {

    /* JADX INFO: renamed from: b */
    public static volatile ytx f276227b;

    /* JADX INFO: renamed from: c */
    public static final ytx f276228c = new ytx();

    /* JADX INFO: renamed from: a */
    public final Map f276229a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: a */
    public static ytx m94643a() {
        ytx ytxVar;
        b3t0 b3t0Var = b3t0.f23129c;
        ytx ytxVar2 = f276227b;
        if (ytxVar2 != null) {
            return ytxVar2;
        }
        synchronized (ytx.class) {
            try {
                ytxVar = f276227b;
                if (ytxVar == null) {
                    Class cls = stx.f213960a;
                    ytx ytxVar3 = null;
                    if (cls != null) {
                        try {
                            ytxVar3 = (ytx) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    ytxVar = ytxVar3 != null ? ytxVar3 : f276228c;
                    f276227b = ytxVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ytxVar;
    }
}
