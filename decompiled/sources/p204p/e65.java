package p204p;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e65 {
    /* JADX INFO: renamed from: a */
    public static Context m37893a(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: b */
    public static void m37894b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.densityDpi;
        int i2 = configuration2.densityDpi;
        if (i != i2) {
            configuration3.densityDpi = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m37895c(Configuration configuration, Locale locale) {
        configuration.setLayoutDirection(locale);
    }

    /* JADX INFO: renamed from: d */
    public static void m37896d(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }
}
