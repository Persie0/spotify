package p204p;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class mzz0 {

    /* JADX INFO: renamed from: a */
    public static final String f148839a;

    /* JADX INFO: renamed from: b */
    public static final String f148840b;

    static {
        String strEncodeToString = Base64.encodeToString(AbstractC2254pf.m69776s().getBytes(vuc.f244913a), 10);
        f148839a = s571.m77251j("firebase_session_", strEncodeToString, "_data");
        f148840b = s571.m77251j("firebase_session_", strEncodeToString, "_settings");
    }
}
