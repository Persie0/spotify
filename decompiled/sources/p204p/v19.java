package p204p;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class v19 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f236298a;

    /* JADX INFO: renamed from: b */
    public final float f236299b;

    public /* synthetic */ v19(float f, int i) {
        this.f236298a = i;
        this.f236299b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f236298a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f236299b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f236299b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f236298a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f236299b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f236299b);
                break;
        }
    }
}
