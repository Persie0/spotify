package p204p;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q75 {
    /* JADX INFO: renamed from: a */
    public static Drawable[] m72284a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: b */
    public static void m72285b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: c */
    public static void m72286c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}
