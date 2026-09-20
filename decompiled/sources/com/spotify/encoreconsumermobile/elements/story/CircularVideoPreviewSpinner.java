package com.spotify.encoreconsumermobile.elements.story;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.bc5;
import p204p.wy3;
import p204p.xre;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\f¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/story/CircularVideoPreviewSpinner;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lp/xre;", "clock", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILp/xre;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "p/bc5", "src_main_java_com_spotify_encoreconsumermobile_elements_story-story"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CircularVideoPreviewSpinner extends View {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f3756f = 0;

    /* JADX INFO: renamed from: a */
    public final xre f3757a;

    /* JADX INFO: renamed from: b */
    public final RectF f3758b;

    /* JADX INFO: renamed from: c */
    public final Paint f3759c;

    /* JADX INFO: renamed from: d */
    public long f3760d;

    /* JADX INFO: renamed from: e */
    public boolean f3761e;

    public CircularVideoPreviewSpinner(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fM28674j;
        float f;
        boolean z = this.f3761e;
        Paint paint = this.f3759c;
        RectF rectF = this.f3758b;
        if (z) {
            ((wy3) this.f3757a).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f3760d;
            if (jCurrentTimeMillis < 4200) {
                int i = (int) (jCurrentTimeMillis / 1400);
                float f2 = (jCurrentTimeMillis % 1400) / 1400.0f;
                float f3 = 360.0f;
                float fM28674j2 = i < 2 ? ((bc5.m28674j(f2 - 1.0f) * 360.0f) + 270.0f) % 360.0f : 270.0f;
                if (i < 3) {
                    if (i == 2) {
                        fM28674j = bc5.m28674j(f2 - 1.0f);
                        f = 345.0f;
                    } else {
                        fM28674j = bc5.m28674j((f2 * 2.0f) - 1.0f);
                        f = 45.0f;
                    }
                    f3 = 15.0f + (fM28674j * f);
                }
                canvas.drawArc(rectF, fM28674j2, f3, false, paint);
                invalidate();
                return;
            }
            this.f3761e = false;
        }
        canvas.drawArc(rectF, 270.0f, 360.0f, false, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float width = getWidth();
        float height = getHeight();
        float fMin = Math.min(width, height);
        RectF rectF = this.f3758b;
        rectF.set((width - fMin) * 0.5f, (height - fMin) * 0.5f, fMin, fMin);
        float strokeWidth = this.f3759c.getStrokeWidth() * 0.5f;
        rectF.inset(strokeWidth, strokeWidth);
    }

    public CircularVideoPreviewSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircularVideoPreviewSpinner(Context context, AttributeSet attributeSet, int i, xre xreVar) {
        super(context, attributeSet, i);
        this.f3757a = xreVar;
        this.f3758b = new RectF();
        Paint paint = new Paint();
        this.f3759c = paint;
        paint.setColor(-14829228);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
    }

    public /* synthetic */ CircularVideoPreviewSpinner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CircularVideoPreviewSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new wy3());
    }
}
