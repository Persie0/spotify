package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final class p491 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final int f173874a;

    /* JADX INFO: renamed from: b */
    public final int f173875b;

    /* JADX INFO: renamed from: c */
    public final int f173876c;

    /* JADX INFO: renamed from: d */
    public final int f173877d;

    /* JADX INFO: renamed from: e */
    public final float f173878e;

    /* JADX INFO: renamed from: f */
    public int f173879f;

    /* JADX INFO: renamed from: g */
    public final RectF f173880g = new RectF();

    public p491(int i, int i2, int i3, int i4, float f, int i5) {
        this.f173874a = i;
        this.f173875b = i2;
        this.f173876c = i3;
        this.f173877d = i4;
        this.f173878e = f;
        this.f173879f = i5;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint paint2 = paint;
        paint2.setColor(this.f173874a);
        float fMeasureText = paint2.measureText(charSequence, i, i2) + f;
        int i7 = this.f173877d;
        RectF rectF = this.f173880g;
        rectF.set(f, i3, fMeasureText + (i7 * 2), i5);
        float f2 = this.f173878e;
        canvas.drawRoundRect(rectF, f2, f2, paint2);
        paint2.setColor(this.f173875b);
        try {
            int i8 = this.f173879f;
            if (i8 > i && i8 <= charSequence.length() && (i6 = this.f173879f) <= i2) {
                canvas.drawText(charSequence, i, i6, f + i7, i4, paint2);
                paint2 = paint2;
            }
            int i9 = this.f173879f;
            if (i9 < 0 || i9 >= charSequence.length() || this.f173879f >= i2 || i2 > charSequence.length()) {
                return;
            }
            float fMeasureText2 = paint2.measureText(charSequence, i, this.f173879f);
            paint2.setColor(this.f173876c);
            canvas.drawText(charSequence, this.f173879f, i2, fMeasureText2 + f + i7, i4, paint2);
        } catch (IndexOutOfBoundsException e) {
            Logger.m3967c(e, xl51.m91377Z("\n                    Invalid length of transcript.\n                    Text: " + ((Object) charSequence) + ", Start: " + i + ", End: " + i2 + ", HighlightedTextLength: " + this.f173879f + "\n                "), new Object[0]);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = this.f173877d;
        return (int) (paint.measureText(charSequence, i, i2) + i3 + i3);
    }
}
