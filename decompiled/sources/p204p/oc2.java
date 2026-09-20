package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class oc2 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final String f163787a;

    /* JADX INFO: renamed from: b */
    public final Paint f163788b;

    /* JADX INFO: renamed from: c */
    public final TextPaint f163789c;

    /* JADX INFO: renamed from: d */
    public final Rect f163790d = new Rect();

    /* JADX INFO: renamed from: e */
    public final int f163791e;

    /* JADX INFO: renamed from: f */
    public final int f163792f;

    /* JADX INFO: renamed from: g */
    public final int f163793g;

    /* JADX INFO: renamed from: h */
    public final ColorStateList f163794h;

    /* JADX INFO: renamed from: i */
    public final ColorStateList f163795i;

    /* JADX INFO: renamed from: j */
    public final int f163796j;

    /* JADX INFO: renamed from: k */
    public final int f163797k;

    public oc2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.age_restriction_badge_stroke_width);
        this.f163793g = dimensionPixelSize;
        this.f163791e = resources.getDimensionPixelSize(R.dimen.age_restriction_badge_size);
        this.f163792f = resources.getDimensionPixelSize(R.dimen.age_restriction_badge_text_padding);
        this.f163794h = lzj.m60387w(context, R.color.encore_accessory);
        this.f163795i = lzj.m60387w(context, R.color.age_restriction_red);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.baseTextSubdued, typedValue, true);
        int i = typedValue.data;
        this.f163796j = i;
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.baseTextNegative, typedValue2, true);
        int i2 = typedValue2.data;
        this.f163797k = i2;
        this.f163787a = "19";
        Paint paint = new Paint(1);
        this.f163788b = paint;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelSize);
        TextPaint textPaint = new TextPaint();
        this.f163789c = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setColor(i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.TextAppearance_Encore_Badge, new int[]{android.R.attr.fontFamily});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId > 0) {
            try {
                textPaint.setTypeface(u1x0.m82233b(context, resourceId));
            } catch (Resources.NotFoundException unused) {
                na6.m63957e("AgeRestrictionDrawable:: Font cannot be loaded.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m66671a() {
        int intrinsicHeight = super.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : this.f163791e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float fM66671a = m66671a() / 2.0f;
        canvas.drawCircle(fM66671a, m66671a() / 2.0f, fM66671a - (this.f163793g / 2.0f), this.f163788b);
        int iM66671a = m66671a();
        Rect rect = this.f163790d;
        float fWidth = (iM66671a - (rect.width() + rect.left)) / 2.0f;
        float fHeight = (rect.height() + m66671a()) / 2.0f;
        int iSave = canvas.save();
        canvas.translate(fWidth, fHeight);
        try {
            canvas.drawText(this.f163787a, 0.0f, 0.0f, this.f163789c);
            canvas.restore();
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return m66671a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return m66671a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fM66671a = m66671a() - (this.f163792f * 2);
        TextPaint textPaint = this.f163789c;
        textPaint.setTextSize(fM66671a);
        String str = this.f163787a;
        textPaint.getTextBounds(str, 0, str.length(), this.f163790d);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        int colorForState = this.f163794h.getColorForState(iArr, this.f163796j);
        TextPaint textPaint = this.f163789c;
        if (colorForState == textPaint.getColor()) {
            int colorForState2 = this.f163795i.getColorForState(iArr, this.f163797k);
            Paint paint = this.f163788b;
            if (colorForState2 != paint.getColor()) {
                paint.setColor(colorForState2);
            } else {
                z = false;
            }
            if (z) {
                invalidateSelf();
            }
            return !z || super.onStateChange(iArr);
        }
        textPaint.setColor(colorForState);
        z = true;
        if (z) {
            invalidateSelf();
        }
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f163788b.setAlpha(i);
        this.f163789c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f163788b.setColorFilter(colorFilter);
        this.f163789c.setColorFilter(colorFilter);
    }
}
