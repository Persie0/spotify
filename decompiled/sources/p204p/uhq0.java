package p204p;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class uhq0 {

    /* JADX INFO: renamed from: a */
    public static final thq0 f230498a;

    static {
        String str = Build.FINGERPRINT;
        f230498a = (str == null || !str.toLowerCase(Locale.ROOT).equals("robolectric")) ? null : new thq0();
    }
}
