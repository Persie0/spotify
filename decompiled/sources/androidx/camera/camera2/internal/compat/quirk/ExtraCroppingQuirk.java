package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import p204p.d6n0;
import p204p.edb;
import p204p.nwt0;

/* JADX INFO: loaded from: classes3.dex */
public class ExtraCroppingQuirk implements nwt0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f367a;

    static {
        HashMap map = new HashMap();
        f367a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    /* JADX INFO: renamed from: b */
    public static Size m181b(int i) {
        if (!m182c()) {
            return null;
        }
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return new Size(1920, 1080);
        }
        if (iM38547C == 1) {
            return new Size(1280, 720);
        }
        if (iM38547C != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m182c() {
        if (!d6n0.f45731d.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        HashMap map = f367a;
        if (!map.containsKey(upperCase)) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
