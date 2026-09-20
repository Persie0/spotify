package com.spotify.creativeworkplatform.encore.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/creativeworkplatform/encore/elements/ArtworkShadow;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getShadowBlurRadius", "()F", "shadowBlurRadius", "src_main_java_com_spotify_creativeworkplatform_encore-encore"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ArtworkShadow extends View {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f3533g = 0;

    /* JADX INFO: renamed from: a */
    public final Paint f3534a;

    /* JADX INFO: renamed from: b */
    public float f3535b;

    /* JADX INFO: renamed from: c */
    public float f3536c;

    /* JADX INFO: renamed from: d */
    public boolean f3537d;

    /* JADX INFO: renamed from: e */
    public View f3538e;

    /* JADX INFO: renamed from: f */
    public float f3539f;

    public ArtworkShadow(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getShadowBlurRadius() {
        return this.f3535b / 1.5f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f3538e;
        if (view != null) {
            boolean z = this.f3537d;
            Paint paint = this.f3534a;
            if (!z) {
                float f = this.f3535b;
                canvas.drawRect(f, f, getWidth() - this.f3535b, getHeight() - this.f3535b, paint);
                return;
            }
            float left = view.getLeft() - this.f3535b;
            float top = view.getTop() - this.f3536c;
            float right = view.getRight() + this.f3535b;
            float bottom = view.getBottom() + this.f3536c;
            float f2 = this.f3539f;
            canvas.drawRoundRect(left, top, right, bottom, f2, f2, paint);
        }
    }

    public ArtworkShadow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ArtworkShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setColor(0);
        this.f3534a = paint;
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, null);
        }
    }

    public /* synthetic */ ArtworkShadow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
