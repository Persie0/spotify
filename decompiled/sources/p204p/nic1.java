package p204p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class nic1 {

    /* JADX INFO: renamed from: a */
    public final j7n0 f154223a = new j7n0();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f154224b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f154225c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public volatile boolean f154226d;

    /* JADX INFO: renamed from: a */
    public static void m64575a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                s571.m77255n(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
