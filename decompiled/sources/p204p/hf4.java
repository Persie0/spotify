package p204p;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hf4 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet f90591a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public static final Map f90592b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = z4l0.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(z4l0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(uf30.class.getName(), "okhttp.Http2");
        linkedHashMap.put(lv61.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f90592b = kkc0.m56706s0(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m47323a(int i, String str, String str2, Throwable th) {
        int iMin;
        String strM88489m1 = (String) f90592b.get(str);
        if (strM88489m1 == null) {
            strM88489m1 = wl51.m88489m1(23, str);
        }
        if (Log.isLoggable(strM88489m1, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iM88457G0 = wl51.m88457G0(str2, '\n', i2, 4);
                if (iM88457G0 == -1) {
                    iM88457G0 = length;
                }
                while (true) {
                    iMin = Math.min(iM88457G0, i2 + 4000);
                    Log.println(i, strM88489m1, str2.substring(i2, iMin));
                    if (iMin >= iM88457G0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m47324b(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f90591a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(if4.f101644a);
        }
    }
}
