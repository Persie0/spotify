package p204p;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes10.dex */
public final class ane extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17422a;

    /* JADX INFO: renamed from: b */
    public Object f17423b;

    /* JADX INFO: renamed from: a */
    public void m26491a(TextPaint textPaint) {
        Typeface typefaceCreate = (Typeface) this.f17423b;
        if (typefaceCreate == null) {
            return;
        }
        Typeface typeface = textPaint.getTypeface();
        if (typeface != null) {
            int style = typeface.getStyle();
            if (typefaceCreate.getStyle() != style) {
                typefaceCreate = Typeface.create(typefaceCreate, style);
            }
            this.f17423b = typefaceCreate;
        }
        textPaint.setTypeface(typefaceCreate);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f17422a) {
            case 0:
                textPaint.setTypeface((Typeface) this.f17423b);
                break;
            case 1:
                m26491a(textPaint);
                break;
            case 2:
                textPaint.setTypeface((Typeface) this.f17423b);
                break;
            default:
                textPaint.setFontFeatureSettings((String) this.f17423b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f17422a) {
            case 0:
                textPaint.setTypeface((Typeface) this.f17423b);
                break;
            case 1:
                m26491a(textPaint);
                break;
            case 2:
                textPaint.setTypeface((Typeface) this.f17423b);
                break;
            default:
                textPaint.setFontFeatureSettings((String) this.f17423b);
                break;
        }
    }

    public /* synthetic */ ane(Object obj, int i) {
        this.f17422a = i;
        this.f17423b = obj;
    }
}
