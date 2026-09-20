package p204p;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jfq0 {

    /* JADX INFO: renamed from: a */
    public final TextPaint f111959a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f111960b;

    /* JADX INFO: renamed from: c */
    public final int f111961c;

    /* JADX INFO: renamed from: d */
    public final int f111962d;

    public jfq0(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f111959a = textPaint;
        this.f111960b = textDirectionHeuristic;
        this.f111961c = i;
        this.f111962d = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m53204a() {
        return this.f111961c;
    }

    /* JADX INFO: renamed from: b */
    public final int m53205b() {
        return this.f111962d;
    }

    /* JADX INFO: renamed from: c */
    public final TextDirectionHeuristic m53206c() {
        return this.f111960b;
    }

    /* JADX INFO: renamed from: d */
    public final TextPaint m53207d() {
        return this.f111959a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jfq0)) {
            return false;
        }
        jfq0 jfq0Var = (jfq0) obj;
        if (this.f111961c != jfq0Var.f111961c || this.f111962d != jfq0Var.f111962d) {
            return false;
        }
        TextPaint textPaint = this.f111959a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = jfq0Var.f111959a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f111960b == jfq0Var.f111960b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f111959a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f111960b, Integer.valueOf(this.f111961c), Integer.valueOf(this.f111962d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f111959a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f111960b);
        sb.append(", breakStrategy=" + this.f111961c);
        sb.append(", hyphenationFrequency=" + this.f111962d);
        sb.append("}");
        return sb.toString();
    }

    public jfq0(PrecomputedText.Params params) {
        this.f111959a = params.getTextPaint();
        this.f111960b = params.getTextDirection();
        this.f111961c = params.getBreakStrategy();
        this.f111962d = params.getHyphenationFrequency();
    }
}
