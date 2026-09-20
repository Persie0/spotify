package p204p;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f65 {
    /* JADX INFO: renamed from: a */
    public static void m40820a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static jfa0 m40821b(Configuration configuration) {
        return jfa0.m53162a(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m40822c(jfa0 jfa0Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(jfa0Var.f111869a.f122114a.toLanguageTags()));
    }

    /* JADX INFO: renamed from: d */
    public static void m40823d(Configuration configuration, jfa0 jfa0Var) {
        configuration.setLocales(LocaleList.forLanguageTags(jfa0Var.f111869a.f122114a.toLanguageTags()));
    }
}
