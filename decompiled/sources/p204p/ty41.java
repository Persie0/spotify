package p204p;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes11.dex */
public final class ty41 implements xb71 {

    /* JADX INFO: renamed from: a */
    public final TextView f224834a;

    /* JADX INFO: renamed from: b */
    public final int f224835b;

    public ty41(TextView textView, int i) {
        this.f224834a = textView;
        this.f224835b = i;
    }

    @Override // p204p.xb71
    /* JADX INFO: renamed from: a */
    public final int mo62400a(String str) {
        TextView textView = this.f224834a;
        Layout.Alignment alignment = textView.getLayout() != null ? textView.getLayout().getAlignment() : Layout.Alignment.ALIGN_NORMAL;
        wj50.m88279p(alignment);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(str, 0, str.length(), textView.getPaint(), this.f224835b).setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (Build.VERSION.SDK_INT >= 26) {
            hyphenationFrequency.setJustificationMode(textView.getJustificationMode());
        }
        return hyphenationFrequency.build().getLineCount();
    }
}
