package p204p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t4u0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f217077a = 0;

    static {
        Pattern.compile("radio:", 16);
    }

    /* JADX INFO: renamed from: a */
    public static String m80076a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("spotify:station:")) {
            if (!str.contains("cluster:")) {
                return edb.m38564m("spotify:", str.substring(16));
            }
        } else {
            if (str.startsWith("spotify:radio:")) {
                return edb.m38564m("spotify:", str.substring(14));
            }
            if (!str.startsWith("spotify:")) {
                return null;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m80077b(String str) {
        return str != null && str.startsWith("spotify:station:");
    }
}
