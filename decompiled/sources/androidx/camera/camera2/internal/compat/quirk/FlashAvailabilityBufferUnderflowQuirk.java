package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import p204p.nwt0;

/* JADX INFO: loaded from: classes3.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements nwt0 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f372a;

    static {
        HashSet hashSet = new HashSet();
        f372a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
