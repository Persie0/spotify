package com.spotify.encoreconsumermobile.elements.artwork;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.j96;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/artwork/ArtworkShadow;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getShadowBlurRadius", "()F", "shadowBlurRadius", "src_main_java_com_spotify_encoreconsumermobile_elements_artwork-artwork"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ArtworkShadow extends View {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f3594e = 0;

    /* JADX INFO: renamed from: a */
    public final Paint f3595a;

    /* JADX INFO: renamed from: b */
    public float f3596b;

    /* JADX INFO: renamed from: c */
    public boolean f3597c;

    /* JADX INFO: renamed from: d */
    public ArtworkView f3598d;

    public ArtworkShadow(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public static final float m9580a(ArtworkShadow artworkShadow, ArtworkView artworkView) {
        return Math.max(Math.max(artworkShadow.getWidth() - artworkView.getWidth(), artworkShadow.getHeight() - artworkView.getHeight()), 0) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getShadowBlurRadius() {
        return this.f3596b / 1.5f;
    }

    /* JADX INFO: renamed from: c */
    public final void m9582c(ArtworkView artworkView, boolean z) {
        this.f3598d = artworkView;
        this.f3597c = z;
        if (!artworkView.isLaidOut() || artworkView.isLayoutRequested()) {
            artworkView.addOnLayoutChangeListener(new j96(0, this, artworkView));
            return;
        }
        this.f3596b = m9580a(this, artworkView);
        this.f3595a.setShadowLayer(getShadowBlurRadius(), 0.0f, 0.0f, getContext().getColor(R.color.artwork_shadow));
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArtworkView artworkView = this.f3598d;
        if (artworkView != null) {
            boolean z = this.f3597c;
            Paint paint = this.f3595a;
            if (z) {
                float f = this.f3596b;
                canvas.drawRoundRect(f, f, getWidth() - this.f3596b, getHeight() - this.f3596b, artworkView.getRadius(), artworkView.getRadius(), paint);
            } else {
                float f2 = this.f3596b;
                canvas.drawRect(f2, f2, getWidth() - this.f3596b, getHeight() - this.f3596b, paint);
            }
        }
    }

    public ArtworkShadow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ArtworkShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setColor(0);
        this.f3595a = paint;
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, null);
        }
    }

    public /* synthetic */ ArtworkShadow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
