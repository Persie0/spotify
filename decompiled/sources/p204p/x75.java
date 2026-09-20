package p204p;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x75 {
    /* JADX INFO: renamed from: a */
    public static StaticLayout m90140a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    /* JADX INFO: renamed from: b */
    public static int m90141b(TextView textView) {
        return textView.getMaxLines();
    }
}
