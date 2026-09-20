package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class fp91 extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final ep91 f71775b;

    /* JADX INFO: renamed from: e */
    public TextPaint f71778e;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f71774a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f71776c = -1;

    /* JADX INFO: renamed from: d */
    public float f71777d = 1.0f;

    public fp91(ep91 ep91Var) {
        wj50.m88280q(ep91Var, "rasterizer cannot be null");
        this.f71775b = ep91Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f71778e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f71778e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f71776c, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        p7u.m69297a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        ep91 ep91Var = this.f71775b;
        x4b x4bVar = ep91Var.f61591b;
        Typeface typeface = (Typeface) x4bVar.f258040e;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) x4bVar.f258038c, ep91Var.f61590a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f71774a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        ep91 ep91Var = this.f71775b;
        k7f0 k7f0VarM39641c = ep91Var.m39641c();
        int iM83534a = k7f0VarM39641c.m83534a(14);
        this.f71777d = fAbs / (iM83534a != 0 ? k7f0VarM39641c.f232071b.getShort(iM83534a + k7f0VarM39641c.f232070a) : (short) 0);
        k7f0 k7f0VarM39641c2 = ep91Var.m39641c();
        int iM83534a2 = k7f0VarM39641c2.m83534a(14);
        if (iM83534a2 != 0) {
            k7f0VarM39641c2.f232071b.getShort(iM83534a2 + k7f0VarM39641c2.f232070a);
        }
        k7f0 k7f0VarM39641c3 = ep91Var.m39641c();
        int iM83534a3 = k7f0VarM39641c3.m83534a(12);
        short s = (short) ((iM83534a3 != 0 ? k7f0VarM39641c3.f232071b.getShort(iM83534a3 + k7f0VarM39641c3.f232070a) : (short) 0) * this.f71777d);
        this.f71776c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
