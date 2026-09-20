package com.spotify.allboarding.uiusecases.contentstack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.e940;
import p204p.edb;
import p204p.g6f;
import p204p.g8f;
import p204p.jz0;
import p204p.lau;
import p204p.lwr;
import p204p.lxe;
import p204p.puj;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/allboarding/uiusecases/contentstack/ContentStackView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_allboarding_uiusecases_contentstack-contentstack"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContentStackView extends View {

    /* JADX INFO: renamed from: L0 */
    public final Paint f2926L0;

    /* JADX INFO: renamed from: M0 */
    public final Paint f2927M0;

    /* JADX INFO: renamed from: N0 */
    public final Paint f2928N0;

    /* JADX INFO: renamed from: O0 */
    public final Paint f2929O0;

    /* JADX INFO: renamed from: P0 */
    public final Paint f2930P0;

    /* JADX INFO: renamed from: Q0 */
    public final LinkedHashMap f2931Q0;

    /* JADX INFO: renamed from: R0 */
    public List f2932R0;

    /* JADX INFO: renamed from: S0 */
    public final lwr f2933S0;

    /* JADX INFO: renamed from: a */
    public final int f2934a;

    /* JADX INFO: renamed from: b */
    public final float f2935b;

    /* JADX INFO: renamed from: c */
    public final float f2936c;

    /* JADX INFO: renamed from: d */
    public final int f2937d;

    /* JADX INFO: renamed from: e */
    public final float f2938e;

    /* JADX INFO: renamed from: f */
    public final float f2939f;

    /* JADX INFO: renamed from: g */
    public final int f2940g;

    /* JADX INFO: renamed from: h */
    public final float f2941h;

    /* JADX INFO: renamed from: i */
    public final RectF f2942i;

    /* JADX INFO: renamed from: t */
    public final RectF f2943t;

    public ContentStackView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m3221a() {
        this.f2933S0.m60129c();
        Iterator it = this.f2931Q0.values().iterator();
        while (it.hasNext()) {
            ((Bitmap) it.next()).recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3222b(Canvas canvas, puj pujVar, float f, float f2) {
        canvas.save();
        canvas.translate(f, f2);
        Bitmap bitmap = (Bitmap) this.f2931Q0.get(pujVar);
        int iM38547C = edb.m38547C(pujVar.f181462b);
        Paint paint = this.f2927M0;
        Paint paint2 = this.f2926L0;
        Paint paint3 = this.f2929O0;
        if (iM38547C == 0) {
            canvas.drawCircle(0.0f, 0.0f, this.f2937d / 2.0f, paint3);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint2);
            } else {
                canvas.drawCircle(0.0f, 0.0f, this.f2939f, paint);
            }
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.rotate(10.0f);
            RectF rectF = this.f2942i;
            float f3 = this.f2935b;
            canvas.drawRoundRect(rectF, f3, f3, paint3);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint2);
            } else {
                RectF rectF2 = this.f2943t;
                float f4 = this.f2936c;
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: c */
    public final int m3223c(puj pujVar) {
        int iM38547C = edb.m38547C(pujVar.f181462b);
        if (iM38547C == 0) {
            return this.f2937d;
        }
        if (iM38547C == 1) {
            return this.f2940g;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final void m3224d(e940 e940Var, Scheduler scheduler, List list) {
        lwr lwrVar = this.f2933S0;
        lwrVar.m60129c();
        this.f2932R0 = g6f.m43714b1(list, 5);
        invalidate();
        requestLayout();
        for (puj pujVar : this.f2932R0) {
            lxe lxeVarMo24606b = e940Var.mo24606b(Uri.parse(pujVar.f181461a));
            lxeVarMo24606b.f137801g = false;
            lwrVar.m60127a(lxeVarMo24606b.m60183i().observeOn(scheduler).subscribeOn(scheduler).subscribe(new jz0(23, this, pujVar), new g8f(pujVar, 9)));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2932R0.isEmpty()) {
            return;
        }
        float height = getHeight() / 2.0f;
        puj pujVar = (puj) g6f.m43741q0(this.f2932R0);
        float fM3223c = (m3223c(pujVar) / 2.0f) + this.f2934a;
        m3222b(canvas, pujVar, fM3223c, height);
        List list = this.f2932R0;
        for (puj pujVar2 : list.subList(1, list.size())) {
            fM3223c += m3223c(pujVar2) * 0.7f;
            m3222b(canvas, pujVar2, fM3223c, height);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iM3223c;
        super.onMeasure(i, i2);
        int iMax = Math.max(this.f2940g, this.f2937d);
        int i3 = this.f2934a;
        int i4 = (i3 * 2) + iMax;
        if (this.f2932R0.size() == 1) {
            iM3223c = m3223c((puj) g6f.m43741q0(this.f2932R0));
        } else {
            int iM3223c2 = 0;
            if (this.f2932R0.size() > 1) {
                List list = this.f2932R0;
                Iterator it = list.subList(1, list.size()).iterator();
                while (it.hasNext()) {
                    iM3223c2 += (int) (m3223c((puj) it.next()) * 0.7f);
                }
                iM3223c = m3223c((puj) g6f.m43741q0(this.f2932R0)) + iM3223c2;
            } else {
                iM3223c = 0;
            }
        }
        setMeasuredDimension((i3 * 2) + iM3223c, i4);
    }

    public ContentStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ContentStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2934a = context.getResources().getDimensionPixelSize(R.dimen.padding);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.border_size);
        this.f2935b = context.getResources().getDimensionPixelSize(R.dimen.corner_radius);
        this.f2936c = context.getResources().getDimensionPixelSize(R.dimen.inner_corner_radius);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.circle_diameter);
        this.f2937d = dimensionPixelSize2;
        float f = dimensionPixelSize * 2.0f;
        float f2 = dimensionPixelSize2 - f;
        this.f2938e = f2;
        this.f2939f = f2 / 2.0f;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.square_size);
        this.f2940g = dimensionPixelSize3;
        float f3 = dimensionPixelSize3;
        float f4 = f3 - f;
        this.f2941h = f4;
        this.f2931Q0 = new LinkedHashMap();
        this.f2932R0 = lau.f131415a;
        this.f2933S0 = new lwr();
        setLayerType(1, null);
        Paint paint = new Paint(7);
        this.f2926L0 = paint;
        Paint paint2 = new Paint(1);
        this.f2927M0 = paint2;
        paint2.setColor(context.getColor(R.color.content_stack_empty));
        Paint paint3 = new Paint(1);
        this.f2928N0 = paint3;
        paint3.setColor(-1);
        Paint paint4 = new Paint(1);
        this.f2929O0 = paint4;
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint5 = new Paint(paint);
        this.f2930P0 = paint5;
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        RectF rectF = new RectF(0.0f, 0.0f, f3, f3);
        this.f2942i = rectF;
        float f5 = (-dimensionPixelSize3) / 2.0f;
        rectF.offset(f5, f5);
        RectF rectF2 = new RectF(0.0f, 0.0f, f4, f4);
        this.f2943t = rectF2;
        float f6 = (-f4) / 2.0f;
        rectF2.offset(f6, f6);
    }

    public /* synthetic */ ContentStackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
