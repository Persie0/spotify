package com.spotify.watchfeed.uiusecases.element.watchfeedpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edb;
import p204p.ldd1;
import p204p.pqm0;
import p204p.prh;
import p204p.t0h1;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/watchfeed/uiusecases/element/watchfeedpagerindicator/WatchFeedPagerIndicatorView;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lp/w2a1;", "setColor", "(Ljava/lang/Integer;)V", "p/t0h1", "src_main_java_com_spotify_watchfeed_uiusecases_element_watchfeedpagerindicator-watchfeedpagerindicator"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class WatchFeedPagerIndicatorView extends View {

    /* JADX INFO: renamed from: L0 */
    public final Paint f6937L0;

    /* JADX INFO: renamed from: M0 */
    public ViewPager2 f6938M0;

    /* JADX INFO: renamed from: a */
    public final int f6939a;

    /* JADX INFO: renamed from: b */
    public final int f6940b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f6941c;

    /* JADX INFO: renamed from: d */
    public final int f6942d;

    /* JADX INFO: renamed from: e */
    public final float f6943e;

    /* JADX INFO: renamed from: f */
    public final int f6944f;

    /* JADX INFO: renamed from: g */
    public final int f6945g;

    /* JADX INFO: renamed from: h */
    public t0h1 f6946h;

    /* JADX INFO: renamed from: i */
    public prh f6947i;

    /* JADX INFO: renamed from: t */
    public final ArgbEvaluator f6948t;

    public WatchFeedPagerIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m22937a(int i) {
        if (this.f6938M0 != null) {
            this.f6946h = new t0h1(i);
            ViewPager2 viewPager2 = this.f6938M0;
            if (viewPager2 == null) {
                wj50.m88260d0("viewPager");
                throw null;
            }
            this.f6946h.m79791B(0.0f, viewPager2.getCurrentItem());
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        t0h1 t0h1Var = this.f6946h;
        int i = this.f6942d;
        float f = i;
        float f2 = this.f6944f;
        float f3 = (-((Number) ((pqm0) t0h1Var.f215891d).f180350a).floatValue()) * f;
        float fFloatValue = (((Number) ((pqm0) t0h1Var.f215891d).f180350a).floatValue() - 1) * f2;
        float f4 = 0.0f;
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        canvas.translate(f3 - fFloatValue, 0.0f);
        t0h1 t0h1Var2 = this.f6946h;
        ldd1[] ldd1VarArr = (ldd1[]) t0h1Var2.f215892e;
        float[] fArr = (float[]) t0h1Var2.f215890c;
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f5 = fArr[i2];
            int i4 = i3 + 1;
            int iIntValue = ((Integer) this.f6948t.evaluate(f5, Integer.valueOf(this.f6939a), Integer.valueOf(this.f6940b))).intValue();
            Paint paint = this.f6937L0;
            paint.setColor(iIntValue);
            paint.setColorFilter(this.f6941c);
            int i5 = this.f6945g;
            float f6 = i5 - ((i5 - i) * f5);
            float paddingTop = getPaddingTop();
            float[] fArr2 = fArr;
            int i6 = i;
            float f7 = f2;
            RectF rectF = new RectF(f4, paddingTop, f4 + f6, paddingTop + f);
            float f8 = ldd1VarArr[i3].f132147a;
            if (f8 == 1.0f) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                float f9 = this.f6943e;
                float fM38555d = edb.m38555d(f, f9, f8, f9);
                if (f5 == 1.0f) {
                    float fCenterX = rectF.centerX();
                    float fCenterY = rectF.centerY();
                    float fWidth = ((rectF.width() - f9) * f8) + f9;
                    float fHeight = ((rectF.height() - f9) * f8) + f9;
                    float f10 = 2;
                    float f11 = fWidth / f10;
                    float f12 = fHeight / f10;
                    canvas.drawRoundRect(new RectF(fCenterX - f11, fCenterY - f12, fCenterX + f11, fCenterY + f12), fM38555d, fM38555d, paint);
                } else {
                    float fCenterY2 = rectF.centerY();
                    float fHeight2 = (((rectF.height() - f9) * f8) + f9) / 2;
                    rectF.top = fCenterY2 - fHeight2;
                    rectF.bottom = fCenterY2 + fHeight2;
                    canvas.drawRoundRect(rectF, fM38555d, fM38555d, paint);
                }
            }
            f4 += f6 + f7;
            i2++;
            i3 = i4;
            fArr = fArr2;
            i = i6;
            f2 = f7;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(this.f6946h.f215889b, 4);
        int i3 = this.f6942d;
        setMeasuredDimension(View.resolveSize(((iMin - 1) * this.f6944f) + (iMin * i3) + this.f6945g, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + i3, i2));
    }

    public final void setColor(Integer color) {
        this.f6941c = color != null ? new PorterDuffColorFilter(color.intValue(), PorterDuff.Mode.MULTIPLY) : null;
        invalidate();
    }

    public WatchFeedPagerIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public WatchFeedPagerIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6939a = context.getColor(R.color.white);
        this.f6940b = context.getColor(R.color.white_20);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.page_indicator_default_size);
        this.f6942d = dimensionPixelSize;
        this.f6943e = getResources().getDimension(R.dimen.page_indicator_more_size);
        this.f6944f = dimensionPixelSize;
        this.f6945g = getResources().getDimensionPixelSize(R.dimen.selected_indicator_width);
        this.f6946h = new t0h1(0);
        this.f6948t = new ArgbEvaluator();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f6937L0 = paint;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.spacer_4);
        setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
    }

    public /* synthetic */ WatchFeedPagerIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
