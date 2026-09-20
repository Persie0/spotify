package p204p;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b65 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m28276a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m28277b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
