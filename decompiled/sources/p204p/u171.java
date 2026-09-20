package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class u171 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final String f225697a;

    /* JADX INFO: renamed from: b */
    public final float f225698b;

    /* JADX INFO: renamed from: c */
    public final RectF f225699c = new RectF();

    /* JADX INFO: renamed from: d */
    public final int f225700d;

    /* JADX INFO: renamed from: e */
    public final ColorStateList f225701e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f225702f;

    /* JADX INFO: renamed from: g */
    public final int f225703g;

    /* JADX INFO: renamed from: h */
    public final int f225704h;

    /* JADX INFO: renamed from: i */
    public final int f225705i;

    /* JADX INFO: renamed from: j */
    public final Paint f225706j;

    /* JADX INFO: renamed from: k */
    public final Rect f225707k;

    public u171(Context context, String str) {
        this.f225697a = str;
        this.f225698b = context.getResources().getDimensionPixelSize(R.dimen.encore_badge_radius);
        this.f225700d = context.getColor(R.color.gray_70);
        this.f225701e = lzj.m60387w(context, R.color.encore_accessory);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.TextAppearance_Encore_Badge, new int[]{android.R.attr.textSize, android.R.attr.textColor, android.R.attr.fontFamily});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            try {
                textPaint.setTypeface(u1x0.m82233b(context, resourceId));
            } catch (Resources.NotFoundException unused) {
                na6.m63957e("TextBadgeDrawable: Font family cannot be loaded.");
            }
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        if (dimensionPixelSize > 0.0f) {
            textPaint.setTextSize(dimensionPixelSize);
        } else {
            na6.m63957e("TextBadgeDrawable: text size must be greater than 0.");
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.baseBackgroundBase, typedValue, true);
        textPaint.setColor(typedArrayObtainStyledAttributes.getColor(1, typedValue.data));
        typedArrayObtainStyledAttributes.recycle();
        this.f225702f = textPaint;
        String str2 = this.f225697a;
        int iMeasureText = (int) textPaint.measureText(str2, 0, str2.length());
        this.f225703g = iMeasureText;
        int iDescent = (int) (textPaint.descent() - textPaint.ascent());
        this.f225704h = iDescent;
        this.f225705i = Math.max(iDescent, (context.getResources().getDimensionPixelSize(R.dimen.encore_badge_padding) * 2) + iMeasureText);
        Paint paint = new Paint(1);
        paint.setColor(this.f225700d);
        this.f225706j = paint;
        Rect rect = new Rect();
        String str3 = this.f225697a;
        textPaint.getTextBounds(str3, 0, str3.length(), rect);
        this.f225707k = rect;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.f225704h;
        RectF rectF = this.f225699c;
        int iSave = canvas.save();
        int i2 = this.f225705i;
        try {
            rectF.set(0.0f, 0.0f, i2, i);
            float f = this.f225698b;
            canvas.drawRoundRect(rectF, f, f, this.f225706j);
            int i3 = this.f225703g;
            Rect rect = this.f225707k;
            canvas.translate((i2 - (i3 + rect.left)) / 2.0f, (i + rect.height()) / 2.0f);
            canvas.drawText(this.f225697a, 0.0f, 0.0f, this.f225702f);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f225704h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f225705i;
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
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.f225701e.getColorForState(iArr, this.f225700d);
        Paint paint = this.f225706j;
        if (colorForState == paint.getColor()) {
            return super.onStateChange(iArr);
        }
        paint.setColor(colorForState);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f225706j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f225706j.setColorFilter(colorFilter);
    }
}
