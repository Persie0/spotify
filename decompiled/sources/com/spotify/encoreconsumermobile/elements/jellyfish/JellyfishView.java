package com.spotify.encoreconsumermobile.elements.jellyfish;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.g6f;
import p204p.gtq;
import p204p.lau;
import p204p.nf60;
import p204p.oqs;
import p204p.wg61;
import p204p.xe60;
import p204p.xzl;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/jellyfish/JellyfishView;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "d", "Lp/fr70;", "getDefaultTopSplineColor", "()I", "defaultTopSplineColor", "e", "getDefaultMidSplineColor", "defaultMidSplineColor", "f", "getDefaultBottomSplineColor", "defaultBottomSplineColor", "src_main_java_com_spotify_encoreconsumermobile_elements_jellyfish-jellyfish"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class JellyfishView extends View implements oqs {

    /* JADX INFO: renamed from: L0 */
    public List f3669L0;

    /* JADX INFO: renamed from: M0 */
    public List f3670M0;

    /* JADX INFO: renamed from: N0 */
    public List f3671N0;

    /* JADX INFO: renamed from: a */
    public float f3672a;

    /* JADX INFO: renamed from: b */
    public float f3673b;

    /* JADX INFO: renamed from: c */
    public float f3674c;

    /* JADX INFO: renamed from: d */
    public final wg61 f3675d;

    /* JADX INFO: renamed from: e */
    public final wg61 f3676e;

    /* JADX INFO: renamed from: f */
    public final wg61 f3677f;

    /* JADX INFO: renamed from: g */
    public final Path f3678g;

    /* JADX INFO: renamed from: h */
    public final Paint f3679h;

    /* JADX INFO: renamed from: i */
    public final Paint f3680i;

    /* JADX INFO: renamed from: t */
    public final Paint f3681t;

    public JellyfishView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final int getDefaultBottomSplineColor() {
        return ((Number) this.f3677f.getValue()).intValue();
    }

    private final int getDefaultMidSplineColor() {
        return ((Number) this.f3676e.getValue()).intValue();
    }

    private final int getDefaultTopSplineColor() {
        return ((Number) this.f3675d.getValue()).intValue();
    }

    /* JADX INFO: renamed from: a */
    public final PointF m9625a(PointF pointF) {
        float f = pointF.x;
        float f2 = this.f3674c;
        float f3 = this.f3673b;
        return new PointF((f * f2) + f3, (pointF.y * f2) + f3);
    }

    /* JADX INFO: renamed from: b */
    public final void m9626b(Canvas canvas, Paint paint, List list) {
        Path path = this.f3678g;
        path.reset();
        if (!list.isEmpty()) {
            PointF pointFM9625a = m9625a(((xzl) g6f.m43741q0(list)).f267714a);
            path.moveTo(pointFM9625a.x, pointFM9625a.y);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xzl xzlVar = (xzl) it.next();
            PointF pointFM9625a2 = m9625a(xzlVar.f267715b);
            PointF pointFM9625a3 = m9625a(xzlVar.f267716c);
            PointF pointFM9625a4 = m9625a(xzlVar.f267717d);
            path.cubicTo(pointFM9625a2.x, pointFM9625a2.y, pointFM9625a3.x, pointFM9625a3.y, pointFM9625a4.x, pointFM9625a4.y);
        }
        canvas.drawPath(path, paint);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        xe60 xe60Var = (xe60) obj;
        this.f3671N0 = xe60Var.f260651c.f99099a;
        this.f3670M0 = xe60Var.f260650b.f99099a;
        this.f3669L0 = xe60Var.f260649a.f99099a;
        invalidate();
        this.f3681t.setColor(getDefaultBottomSplineColor());
        this.f3680i.setColor(getDefaultMidSplineColor());
        this.f3679h.setColor(getDefaultTopSplineColor());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m9626b(canvas, this.f3681t, this.f3671N0);
        m9626b(canvas, this.f3680i, this.f3670M0);
        m9626b(canvas, this.f3679h, this.f3669L0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3673b = Math.min(getWidth(), getHeight()) / 2.0f;
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        this.f3674c = fMin;
        float f = fMin * 0.13017751f;
        this.f3672a = f;
        this.f3681t.setStrokeWidth(f);
        this.f3680i.setStrokeWidth(this.f3672a);
        this.f3679h.setStrokeWidth(this.f3672a);
    }

    public JellyfishView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public JellyfishView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3675d = new wg61(new nf60(context, 2));
        this.f3676e = new wg61(new nf60(context, 1));
        this.f3677f = new wg61(new nf60(context, 0));
        this.f3678g = new Path();
        Paint paint = new Paint();
        paint.setFlags(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f3672a);
        paint.setColor(getDefaultTopSplineColor());
        this.f3679h = paint;
        Paint paint2 = new Paint();
        paint2.setFlags(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.f3672a);
        paint2.setColor(getDefaultMidSplineColor());
        this.f3680i = paint2;
        Paint paint3 = new Paint();
        paint3.setFlags(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(this.f3672a);
        paint3.setColor(getDefaultBottomSplineColor());
        this.f3681t = paint3;
        lau lauVar = lau.f131415a;
        this.f3669L0 = lauVar;
        this.f3670M0 = lauVar;
        this.f3671N0 = lauVar;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.jellyfish_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public /* synthetic */ JellyfishView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
