package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbs {
    private final Context zza;

    public zzbs(Context context) {
        this.zza = context;
    }

    private static String zzb(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(String.valueOf(locale.getCountry())));
    }

    public final List zza() {
        LocaleList locales = this.zza.getResources().getConfiguration().getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i = 0; i < locales.size(); i++) {
            arrayList.add(zzb(locales.get(i)));
        }
        return arrayList;
    }
}
