package p204p;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qpo {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f191349a = new LinkedHashMap();

    static {
        SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m73450a() {
        synchronized (qpo.class) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m73451b() {
        f191349a.clear();
        SystemClock.elapsedRealtime();
    }
}
