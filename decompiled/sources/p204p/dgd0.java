package p204p;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class dgd0 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f48781a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f48782b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized void m35920a(String str) {
        if (f48781a.add(str)) {
            f48782b += ", " + str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m35921b() {
        return f48782b;
    }
}
