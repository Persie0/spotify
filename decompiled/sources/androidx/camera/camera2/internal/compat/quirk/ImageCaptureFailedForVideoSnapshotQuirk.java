package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import p204p.nwt0;

/* JADX INFO: loaded from: classes3.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements nwt0 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f375a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    /* JADX INFO: renamed from: b */
    public static boolean m184b() {
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (f375a.contains(str.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str2 = Build.HARDWARE;
        if (str2.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        String str3 = Build.BRAND;
        if ("itel".equalsIgnoreCase(str3) && str2.toLowerCase(locale).startsWith("sp")) {
            return true;
        }
        return "HUAWEI".equalsIgnoreCase(str3) && "FIG-LX1".equalsIgnoreCase(str);
    }
}
