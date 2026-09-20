package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p204p.d6n0;
import p204p.l28;
import p204p.lq51;
import p204p.nwt0;
import p204p.o761;
import p204p.p761;

/* JADX INFO: loaded from: classes3.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements nwt0 {

    /* JADX INFO: renamed from: a */
    public static final o761 f368a;

    /* JADX INFO: renamed from: b */
    public static final o761 f369b;

    /* JADX INFO: renamed from: c */
    public static final HashSet f370c;

    /* JADX INFO: renamed from: d */
    public static final HashSet f371d;

    static {
        o761 o761Var = new o761();
        p761 p761Var = p761.VGA;
        lq51.m59708n(2, p761Var, 0L, o761Var);
        p761 p761Var2 = p761.PREVIEW;
        lq51.m59708n(1, p761Var2, 0L, o761Var);
        p761 p761Var3 = p761.MAXIMUM;
        lq51.m59708n(2, p761Var3, 0L, o761Var);
        f368a = o761Var;
        o761 o761Var2 = new o761();
        o761Var2.m66376a(new l28(1, p761Var2, 0L));
        o761Var2.m66376a(new l28(1, p761Var, 0L));
        lq51.m59708n(2, p761Var3, 0L, o761Var2);
        f369b = o761Var2;
        f370c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        f371d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m183b() {
        if (!d6n0.f45731d.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f371d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
