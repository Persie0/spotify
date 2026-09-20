package p204p;

import android.content.Context;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g000 {

    /* JADX INFO: renamed from: a */
    public static final Locale[] f75228a = {new Locale("th"), new Locale("vi")};

    /* JADX INFO: renamed from: a */
    public static void m43251a(TextView textView, Context context) {
        Locale localeM53164b = bga.m29060C(context.getResources().getConfiguration()).m53164b(0);
        for (Locale locale : f75228a) {
            if (localeM53164b.getLanguage().equals(locale.getLanguage())) {
                return;
            }
        }
        TextPaint paint = textView.getPaint();
        paint.setFlags(paint.getFlags() | 129);
        paint.setHinting(0);
    }
}
