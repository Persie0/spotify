package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes8.dex */
public final class ric extends ImageSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f199478a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ric(Drawable drawable, int i) {
        super(drawable);
        this.f199478a = i;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        switch (this.f199478a) {
            case 0:
                Drawable drawable = getDrawable();
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int iHeight = (((fontMetricsInt.ascent + fontMetricsInt.descent) / 2) + i4) - (drawable.getBounds().height() / 2);
                canvas.save();
                canvas.translate(f, iHeight);
                drawable.draw(canvas);
                canvas.restore();
                break;
            default:
                Drawable drawable2 = getDrawable();
                canvas.save();
                float intrinsicHeight = drawable2.getIntrinsicHeight();
                float f2 = paint.getFontMetrics().ascent;
                float f3 = paint.getFontMetrics().descent;
                canvas.translate(f, ((i4 + f3) - ((f3 - f2) / 2.0f)) - (intrinsicHeight / 2.0f));
                drawable2.draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f199478a) {
            case 1:
                Drawable drawable = getDrawable();
                Rect bounds = drawable.getBounds();
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i3 = fontMetricsInt2.descent;
                    int i4 = fontMetricsInt2.ascent;
                    int iM38556e = edb.m38556e(i3, i4, 2, i4);
                    int i5 = ((-drawable.getBounds().height()) / 2) + iM38556e;
                    int iHeight = (drawable.getBounds().height() / 2) + iM38556e;
                    int iMin = Math.min(fontMetricsInt2.ascent, i5);
                    int iMax = Math.max(fontMetricsInt2.descent, iHeight);
                    fontMetricsInt.ascent = iMin;
                    fontMetricsInt.descent = iMax;
                    fontMetricsInt.top = iMin;
                    fontMetricsInt.bottom = iMax;
                }
                return bounds.right;
            default:
                return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
    }
}
