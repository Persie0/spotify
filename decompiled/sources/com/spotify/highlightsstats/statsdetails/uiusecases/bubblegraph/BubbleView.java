package com.spotify.highlightsstats.statsdetails.uiusecases.bubblegraph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.kpa;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR.\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/highlightsstats/statsdetails/uiusecases/bubblegraph/BubbleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lp/kpa;", "value", "c", "Lp/kpa;", "getBubbleColors", "()Lp/kpa;", "setBubbleColors", "(Lp/kpa;)V", "bubbleColors", "src_main_java_com_spotify_highlightsstats_statsdetails_uiusecases_bubblegraph-bubblegraph"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BubbleView extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f4149a;

    /* JADX INFO: renamed from: b */
    public int f4150b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public kpa bubbleColors;

    public BubbleView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        kpa kpaVar = this.bubbleColors;
        if (kpaVar != null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            RadialGradient radialGradient = new RadialGradient(width, height, this.f4150b, new int[]{kpaVar.f125014a, kpaVar.f125015b}, new float[]{0.5f, 0.9f}, Shader.TileMode.CLAMP);
            Paint paint = this.f4149a;
            paint.setShader(radialGradient);
            canvas.drawCircle(width, height, this.f4150b, paint);
        }
    }

    public final kpa getBubbleColors() {
        return this.bubbleColors;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > i2) {
            i = i2;
        }
        this.f4150b = i / 2;
    }

    public final void setBubbleColors(kpa kpaVar) {
        this.bubbleColors = kpaVar;
        invalidate();
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4149a = new Paint(1);
    }

    public /* synthetic */ BubbleView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
