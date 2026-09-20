package p204p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;

/* JADX INFO: loaded from: classes6.dex */
public final class s171 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final TextAppearanceSpan f204616a;

    /* JADX INFO: renamed from: b */
    public final ane f204617b;

    /* JADX INFO: renamed from: c */
    public final int f204618c;

    public /* synthetic */ s171(Context context, int i) {
        this(context, i, -1);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f204616a.updateDrawState(textPaint);
        ane aneVar = this.f204617b;
        if (aneVar != null) {
            aneVar.m26491a(textPaint);
        }
        int i = this.f204618c;
        if (i != -1) {
            textPaint.setColor(i);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f204616a.updateMeasureState(textPaint);
        ane aneVar = this.f204617b;
        if (aneVar != null) {
            aneVar.m26491a(textPaint);
        }
        int i = this.f204618c;
        if (i != -1) {
            textPaint.setColor(i);
        }
    }

    public s171(Context context, int i, int i2) {
        int[] iArr = {R.attr.fontFamily};
        this.f204616a = new TextAppearanceSpan(context, i);
        this.f204618c = i2;
        if (Build.VERSION.SDK_INT > 26) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        Typeface typefaceM82233b = null;
        try {
            if (resourceId > 0) {
                try {
                    typefaceM82233b = u1x0.m82233b(context, resourceId);
                } catch (Resources.NotFoundException unused) {
                    na6.m63957e("TextAppearanceSpanCompat:: Font cannot be loaded.");
                }
                typedArrayObtainStyledAttributes.recycle();
            }
            if (typefaceM82233b != null) {
                ane aneVar = new ane();
                aneVar.f17423b = typefaceM82233b;
                this.f204617b = aneVar;
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
