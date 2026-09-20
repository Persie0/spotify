package p204p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cux {

    /* JADX INFO: renamed from: b */
    public static volatile cux f42245b;

    /* JADX INFO: renamed from: c */
    public static final cux f42246c;

    /* JADX INFO: renamed from: a */
    public final Map f42247a = Collections.EMPTY_MAP;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f42246c = new cux();
    }

    /* JADX INFO: renamed from: a */
    public static cux m33955a() {
        cux cuxVar;
        cux cuxVar2 = f42245b;
        if (cuxVar2 != null) {
            return cuxVar2;
        }
        synchronized (cux.class) {
            try {
                cuxVar = f42245b;
                if (cuxVar == null) {
                    Class cls = vtx.f244787a;
                    if (cls != null) {
                        try {
                            cuxVar = (cux) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                            cuxVar = f42246c;
                        }
                    } else {
                        cuxVar = f42246c;
                    }
                    f42245b = cuxVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cuxVar;
    }
}
