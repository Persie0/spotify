package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: classes11.dex */
public final class i68 {

    /* JADX INFO: renamed from: a */
    public TextView f99115a;

    /* JADX INFO: renamed from: b */
    public TextPaint f99116b;

    /* JADX INFO: renamed from: c */
    public float f99117c;

    /* JADX INFO: renamed from: d */
    public int f99118d;

    /* JADX INFO: renamed from: e */
    public float f99119e;

    /* JADX INFO: renamed from: f */
    public float f99120f;

    /* JADX INFO: renamed from: g */
    public float f99121g;

    /* JADX INFO: renamed from: h */
    public boolean f99122h;

    /* JADX INFO: renamed from: b */
    public static void m49801b(Button button) {
        i68 i68Var = new i68();
        wo5 wo5Var = new wo5(i68Var, 2);
        kk6 kk6Var = new kk6(i68Var, 1);
        float f = button.getContext().getResources().getDisplayMetrics().scaledDensity;
        i68Var.f99115a = button;
        i68Var.f99116b = new TextPaint();
        float textSize = button.getTextSize();
        if (i68Var.f99117c != textSize) {
            i68Var.f99117c = textSize;
        }
        TransformationMethod transformationMethod = button.getTransformationMethod();
        i68Var.f99118d = (transformationMethod == null || !(transformationMethod instanceof SingleLineTransformationMethod)) ? button.getMaxLines() : 1;
        i68Var.f99119e = f * 8.0f;
        i68Var.f99120f = i68Var.f99117c;
        i68Var.f99121g = 0.5f;
        if (!i68Var.f99122h) {
            i68Var.f99122h = true;
            button.addTextChangedListener(wo5Var);
            button.addOnLayoutChangeListener(kk6Var);
            i68Var.m49803a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m49802c(CharSequence charSequence, TextPaint textPaint, float f, int i, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int lineCount;
        CharSequence charSequence2;
        float lineWidth;
        float f5 = (f2 + f3) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f5, displayMetrics));
        if (i != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            lineCount = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            lineCount = 1;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (lineCount <= i) {
            if (lineCount < i) {
                return m49802c(charSequence, textPaint, f, i, f5, f3, f4, displayMetrics);
            }
            if (i == 1) {
                charSequence2 = charSequence;
                lineWidth = textPaint.measureText(charSequence2, 0, charSequence.length());
            } else {
                charSequence2 = charSequence;
                lineWidth = 0.0f;
                for (int i2 = 0; i2 < lineCount; i2++) {
                    if (staticLayout2.getLineWidth(i2) > lineWidth) {
                        lineWidth = staticLayout2.getLineWidth(i2);
                    }
                }
            }
            float f6 = lineWidth;
            if (f3 - f2 >= f4) {
                if (f6 > f) {
                    return m49802c(charSequence2, textPaint, f, i, f2, f5, f4, displayMetrics);
                }
                return f6 < f ? m49802c(charSequence, textPaint, f, i, f5, f3, f4, displayMetrics) : f5;
            }
        } else if (f3 - f2 >= f4) {
            return m49802c(charSequence, textPaint, f, i, f2, f5, f4, displayMetrics);
        }
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX INFO: renamed from: a */
    public final void m49803a() {
        int width;
        CharSequence charSequence;
        TextPaint textPaint;
        int i;
        TextView textView = this.f99115a;
        textView.getTextSize();
        TextPaint textPaint2 = this.f99116b;
        float f = this.f99119e;
        float fM49802c = this.f99120f;
        int i2 = this.f99118d;
        float f2 = this.f99121g;
        if (i2 > 0 && i2 != Integer.MAX_VALUE && (width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) > 0) {
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, textView);
            }
            Context context = textView.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            DisplayMetrics displayMetrics = system.getDisplayMetrics();
            textPaint2.set(textView.getPaint());
            textPaint2.setTextSize(fM49802c);
            if (i2 != 1 || textPaint2.measureText(text, 0, text.length()) <= width) {
                textPaint2.setTextSize(TypedValue.applyDimension(0, fM49802c, displayMetrics));
                charSequence = text;
                textPaint = textPaint2;
                i = 0;
                if (new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() > i2) {
                }
                if (fM49802c >= f) {
                    f = fM49802c;
                }
                textView.setTextSize(i, f);
            } else {
                textPaint = textPaint2;
                i = 0;
                charSequence = text;
            }
            fM49802c = m49802c(charSequence, textPaint, width, i2, 0.0f, fM49802c, f2, displayMetrics);
            if (fM49802c >= f) {
                f = fM49802c;
            }
            textView.setTextSize(i, f);
        }
        textView.getTextSize();
    }
}
