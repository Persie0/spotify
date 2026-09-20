package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class avs {
    /* JADX INFO: renamed from: a */
    public static String m27258a(String str) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U("spotify:internal:playlist-edit-coverart:".concat(r46.m74726U(str).m35710h())).m35694A();
        if (strM35694A != null) {
            return strM35694A;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
