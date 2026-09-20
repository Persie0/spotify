package p204p;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class syt {

    /* JADX INFO: renamed from: e */
    public static final Pattern f215329e = Pattern.compile(" ");

    /* JADX INFO: renamed from: a */
    public final TextView f215330a;

    /* JADX INFO: renamed from: b */
    public final String f215331b;

    /* JADX INFO: renamed from: c */
    public final String f215332c;

    /* JADX INFO: renamed from: d */
    public final m3n f215333d;

    public syt(TextView textView, String str, m3n m3nVar) {
        this.f215330a = textView;
        this.f215331b = str;
        this.f215332c = edb.m38564m("… ", f215329e.matcher(str).replaceAll(" "));
        this.f215333d = m3nVar;
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m79714a(SpannableStringBuilder spannableStringBuilder) {
        TextView textView = this.f215330a;
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textView.getPaint(), (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()).setAlignment(textView.getLayout() != null ? textView.getLayout().getAlignment() : Layout.Alignment.ALIGN_NORMAL).setTextDirection(TextDirectionHeuristics.ANYRTL_LTR).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (Build.VERSION.SDK_INT >= 26) {
            hyphenationFrequency.setJustificationMode(textView.getJustificationMode());
        }
        return hyphenationFrequency.build();
    }
}
