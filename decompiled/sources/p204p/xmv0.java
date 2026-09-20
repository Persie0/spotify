package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class xmv0 {
    /* JADX INFO: renamed from: a */
    public static boolean m91477a(Uri uri) {
        if (uri.toString().length() > 0) {
            String strM88469S0 = wl51.m88469S0(uri.toString(), "android-app://");
            for (int i = 0; i < strM88469S0.length(); i++) {
                char cCharAt = strM88469S0.charAt(i);
                if (('0' <= cCharAt && cCharAt < ':') || (('A' <= cCharAt && cCharAt < '[') || (('a' <= cCharAt && cCharAt < '{') || cCharAt == '.' || cCharAt == '-' || cCharAt == '_'))) {
                }
            }
            return true;
        }
        return false;
    }
}
