package p204p;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class vcf implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wcf f240118a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f240119b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ValueAnimator f240120c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f240121d;

    public vcf(wcf wcfVar, TextView textView, ValueAnimator valueAnimator, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.f240118a = wcfVar;
        this.f240119b = textView;
        this.f240120c = valueAnimator;
        this.f240121d = marginLayoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int lineCount;
        TextView textView = this.f240119b;
        wj50.m88279p(textView);
        wcf wcfVar = this.f240118a;
        wcfVar.getClass();
        Layout layout = textView.getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            int iIntValue = ((Integer) this.f240120c.getAnimatedValue()).intValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f240121d;
            marginLayoutParams.setMarginStart(iIntValue);
            marginLayoutParams.leftMargin = iIntValue;
            wcfVar.f250032a.requestLayout();
        }
    }
}
