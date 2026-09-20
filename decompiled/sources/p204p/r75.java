package p204p;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r75 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m74890a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m74891b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
