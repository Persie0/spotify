package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p204p.nwt0;

/* JADX INFO: loaded from: classes3.dex */
public class ZslDisablerQuirk implements nwt0 {

    /* JADX INFO: renamed from: a */
    public static final List f391a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

    /* JADX INFO: renamed from: b */
    public static final List f392b = Arrays.asList("MI 8");

    /* JADX INFO: renamed from: b */
    public static boolean m185b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
