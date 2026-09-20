package p204p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ztx {

    /* JADX INFO: renamed from: b */
    public static volatile ztx f286280b;

    /* JADX INFO: renamed from: c */
    public static final ztx f286281c = new ztx();

    /* JADX INFO: renamed from: a */
    public final Map f286282a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: a */
    public static ztx m96955a() {
        ztx ztxVar;
        ztx ztxVar2 = f286280b;
        if (ztxVar2 != null) {
            return ztxVar2;
        }
        synchronized (ztx.class) {
            try {
                ztxVar = f286280b;
                if (ztxVar == null) {
                    Class cls = ttx.f223691a;
                    ztx ztxVar3 = null;
                    if (cls != null) {
                        try {
                            ztxVar3 = (ztx) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    ztxVar = ztxVar3 != null ? ztxVar3 : f286281c;
                    f286280b = ztxVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ztxVar;
    }
}
