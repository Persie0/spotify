package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class n3d0 extends Drawable implements ei01 {

    /* JADX INFO: renamed from: U0 */
    public static final Paint f150008U0;

    /* JADX INFO: renamed from: L0 */
    public final Paint f150009L0;

    /* JADX INFO: renamed from: M0 */
    public final Paint f150010M0;

    /* JADX INFO: renamed from: N0 */
    public final yg01 f150011N0;

    /* JADX INFO: renamed from: O0 */
    public final l3d0 f150012O0;

    /* JADX INFO: renamed from: P0 */
    public final o0i f150013P0;

    /* JADX INFO: renamed from: Q0 */
    public PorterDuffColorFilter f150014Q0;

    /* JADX INFO: renamed from: R0 */
    public PorterDuffColorFilter f150015R0;

    /* JADX INFO: renamed from: S0 */
    public final RectF f150016S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f150017T0;

    /* JADX INFO: renamed from: X */
    public final Region f150018X;

    /* JADX INFO: renamed from: Y */
    public final Region f150019Y;

    /* JADX INFO: renamed from: Z */
    public dh01 f150020Z;

    /* JADX INFO: renamed from: a */
    public m3d0 f150021a;

    /* JADX INFO: renamed from: b */
    public final vh01[] f150022b;

    /* JADX INFO: renamed from: c */
    public final vh01[] f150023c;

    /* JADX INFO: renamed from: d */
    public final BitSet f150024d;

    /* JADX INFO: renamed from: e */
    public boolean f150025e;

    /* JADX INFO: renamed from: f */
    public final Matrix f150026f;

    /* JADX INFO: renamed from: g */
    public final Path f150027g;

    /* JADX INFO: renamed from: h */
    public final Path f150028h;

    /* JADX INFO: renamed from: i */
    public final RectF f150029i;

    /* JADX INFO: renamed from: t */
    public final RectF f150030t;

    static {
        Paint paint = new Paint(1);
        f150008U0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public n3d0() {
        this(new dh01());
    }

    /* JADX INFO: renamed from: b */
    public final void m63592b(RectF rectF, Path path) {
        m3d0 m3d0Var = this.f150021a;
        this.f150013P0.m66016b(m3d0Var.f139593a, m3d0Var.f139601i, rectF, this.f150012O0, path);
        if (this.f150021a.f139600h != 1.0f) {
            Matrix matrix = this.f150026f;
            matrix.reset();
            float f = this.f150021a.f139600h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f150016S0, true);
    }

    /* JADX INFO: renamed from: c */
    public final int m63593c(int i) {
        m3d0 m3d0Var = this.f150021a;
        float f = m3d0Var.f139605m + 0.0f + m3d0Var.f139604l;
        eyt eytVar = m3d0Var.f139594b;
        return eytVar != null ? eytVar.m40323a(f, i) : i;
    }

    /* JADX INFO: renamed from: d */
    public final void m63594d(Canvas canvas) {
        this.f150024d.cardinality();
        int i = this.f150021a.f139608p;
        Path path = this.f150027g;
        yg01 yg01Var = this.f150011N0;
        if (i != 0) {
            canvas.drawPath(path, yg01Var.f272410a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            vh01 vh01Var = this.f150022b[i2];
            int i3 = this.f150021a.f139607o;
            Matrix matrix = vh01.f241377a;
            vh01Var.mo69934a(matrix, yg01Var, i3, canvas);
            this.f150023c[i2].mo69934a(matrix, yg01Var, this.f150021a.f139607o, canvas);
        }
        if (this.f150017T0) {
            m3d0 m3d0Var = this.f150021a;
            int iSin = (int) (Math.sin(Math.toRadians(m3d0Var.f139609q)) * ((double) m3d0Var.f139608p));
            m3d0 m3d0Var2 = this.f150021a;
            int iCos = (int) (Math.cos(Math.toRadians(m3d0Var2.f139609q)) * ((double) m3d0Var2.f139608p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f150008U0);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:26:0x010c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0114  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iWidth;
        PorterDuffColorFilter porterDuffColorFilter = this.f150014Q0;
        Paint paint = this.f150009L0;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f150021a.f139603k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f150015R0;
        Paint paint2 = this.f150010M0;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f150021a.f139602j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f150021a.f139603k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f150025e;
        Path path = this.f150027g;
        if (z) {
            float strokeWidth = m63598i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            dh01 dh01Var = this.f150021a.f139593a;
            vi5 vi5Var = new vi5(-strokeWidth, 6);
            dh01Var.getClass();
            qyy0 qyy0Var = new qyy0(dh01Var);
            qyy0Var.m74248O(vi5Var.m85586b(dh01Var.f48941e));
            qyy0Var.m74250Q(vi5Var.m85586b(dh01Var.f48942f));
            qyy0Var.m74241H(vi5Var.m85586b(dh01Var.f48944h));
            qyy0Var.m74243J(vi5Var.m85586b(dh01Var.f48943g));
            dh01 dh01VarM74257d = qyy0Var.m74257d();
            this.f150020Z = dh01VarM74257d;
            float f = this.f150021a.f139601i;
            RectF rectFM63596g = m63596g();
            RectF rectF = this.f150030t;
            rectF.set(rectFM63596g);
            float strokeWidth2 = m63598i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth2, strokeWidth2);
            this.f150013P0.m66015a(dh01VarM74257d, f, rectF, this.f150028h);
            m63592b(m63596g(), path);
            this.f150025e = false;
        }
        m3d0 m3d0Var = this.f150021a;
        int i3 = m3d0Var.f139606n;
        if (i3 != 1 && m3d0Var.f139607o > 0) {
            if (i3 != 2) {
                int i4 = Build.VERSION.SDK_INT;
                if (!m3d0Var.f139593a.m35960d(m63596g()) && !path.isConvex() && i4 < 29) {
                    canvas.save();
                    m3d0 m3d0Var2 = this.f150021a;
                    int iSin = (int) (Math.sin(Math.toRadians(m3d0Var2.f139609q)) * ((double) m3d0Var2.f139608p));
                    m3d0 m3d0Var3 = this.f150021a;
                    canvas.translate(iSin, (int) (Math.cos(Math.toRadians(m3d0Var3.f139609q)) * ((double) m3d0Var3.f139608p)));
                    if (!this.f150017T0) {
                        RectF rectF2 = this.f150016S0;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(klh.m56829a(this.f150021a.f139607o, 2, (int) rectF2.width(), iWidth), klh.m56829a(this.f150021a.f139607o, 2, (int) rectF2.height(), iHeight), Bitmap.Config.ARGB_8888);
                        Canvas canvas3 = new Canvas(bitmapCreateBitmap);
                        float f2 = (getBounds().left - this.f150021a.f139607o) - iWidth;
                        float f3 = (getBounds().top - this.f150021a.f139607o) - iHeight;
                        canvas3.translate(-f2, -f3);
                        m63594d(canvas3);
                        canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        m63594d(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                m3d0 m3d0Var4 = this.f150021a;
                int iSin2 = (int) (Math.sin(Math.toRadians(m3d0Var4.f139609q)) * ((double) m3d0Var4.f139608p));
                m3d0 m3d0Var5 = this.f150021a;
                canvas.translate(iSin2, (int) (Math.cos(Math.toRadians(m3d0Var5.f139609q)) * ((double) m3d0Var5.f139608p)));
                if (!this.f150017T0) {
                    RectF rectF3 = this.f150016S0;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                m63594d(canvas);
                canvas.restore();
            }
        }
        m3d0 m3d0Var6 = this.f150021a;
        Paint.Style style = m3d0Var6.f139610r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            canvas2 = canvas;
            m63595e(canvas2, paint, path, m3d0Var6.f139593a, m63596g());
        } else {
            canvas2 = canvas;
        }
        if (m63598i()) {
            mo56175f(canvas2);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final void m63595e(Canvas canvas, Paint paint, Path path, dh01 dh01Var, RectF rectF) {
        if (!dh01Var.m35960d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo40076a = dh01Var.f48942f.mo40076a(rectF) * this.f150021a.f139601i;
            canvas.drawRoundRect(rectF, fMo40076a, fMo40076a, paint);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo56175f(Canvas canvas) {
        dh01 dh01Var = this.f150020Z;
        RectF rectFM63596g = m63596g();
        RectF rectF = this.f150030t;
        rectF.set(rectFM63596g);
        boolean zM63598i = m63598i();
        Paint paint = this.f150010M0;
        float strokeWidth = zM63598i ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m63595e(canvas, paint, this.f150028h, dh01Var, rectF);
    }

    /* JADX INFO: renamed from: g */
    public final RectF m63596g() {
        Rect bounds = getBounds();
        RectF rectF = this.f150029i;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f150021a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        m3d0 m3d0Var = this.f150021a;
        if (m3d0Var.f139606n == 2) {
            return;
        }
        if (m3d0Var.f139593a.m35960d(m63596g())) {
            outline.setRoundRect(getBounds(), m63597h() * this.f150021a.f139601i);
            return;
        }
        RectF rectFM63596g = m63596g();
        Path path = this.f150027g;
        m63592b(rectFM63596g, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f150021a.f139599g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f150018X;
        region.set(bounds);
        RectF rectFM63596g = m63596g();
        Path path = this.f150027g;
        m63592b(rectFM63596g, path);
        Region region2 = this.f150019Y;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final float m63597h() {
        return this.f150021a.f139593a.f48941e.mo40076a(m63596g());
    }

    /* JADX INFO: renamed from: i */
    public final boolean m63598i() {
        Paint.Style style = this.f150021a.f139610r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f150010M0.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f150025e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f150021a.f139597e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f150021a.getClass();
        ColorStateList colorStateList2 = this.f150021a.f139596d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f150021a.f139595c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public final void m63599j(Context context) {
        this.f150021a.f139594b = new eyt(context);
        m63608s();
    }

    /* JADX INFO: renamed from: k */
    public final void m63600k(float f) {
        m3d0 m3d0Var = this.f150021a;
        if (m3d0Var.f139605m != f) {
            m3d0Var.f139605m = f;
            m63608s();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m63601l(ColorStateList colorStateList) {
        m3d0 m3d0Var = this.f150021a;
        if (m3d0Var.f139595c != colorStateList) {
            m3d0Var.f139595c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m63602m(float f) {
        m3d0 m3d0Var = this.f150021a;
        if (m3d0Var.f139601i != f) {
            m3d0Var.f139601i = f;
            this.f150025e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        m3d0 m3d0Var = this.f150021a;
        m3d0 m3d0Var2 = new m3d0();
        m3d0Var2.f139595c = null;
        m3d0Var2.f139596d = null;
        m3d0Var2.f139597e = null;
        m3d0Var2.f139598f = PorterDuff.Mode.SRC_IN;
        m3d0Var2.f139599g = null;
        m3d0Var2.f139600h = 1.0f;
        m3d0Var2.f139601i = 1.0f;
        m3d0Var2.f139603k = 255;
        m3d0Var2.f139604l = 0.0f;
        m3d0Var2.f139605m = 0.0f;
        m3d0Var2.f139606n = 0;
        m3d0Var2.f139607o = 0;
        m3d0Var2.f139608p = 0;
        m3d0Var2.f139609q = 0;
        m3d0Var2.f139610r = Paint.Style.FILL_AND_STROKE;
        m3d0Var2.f139593a = m3d0Var.f139593a;
        m3d0Var2.f139594b = m3d0Var.f139594b;
        m3d0Var2.f139602j = m3d0Var.f139602j;
        m3d0Var2.f139595c = m3d0Var.f139595c;
        m3d0Var2.f139596d = m3d0Var.f139596d;
        m3d0Var2.f139598f = m3d0Var.f139598f;
        m3d0Var2.f139597e = m3d0Var.f139597e;
        m3d0Var2.f139603k = m3d0Var.f139603k;
        m3d0Var2.f139600h = m3d0Var.f139600h;
        m3d0Var2.f139608p = m3d0Var.f139608p;
        m3d0Var2.f139606n = m3d0Var.f139606n;
        m3d0Var2.f139601i = m3d0Var.f139601i;
        m3d0Var2.f139604l = m3d0Var.f139604l;
        m3d0Var2.f139605m = m3d0Var.f139605m;
        m3d0Var2.f139607o = m3d0Var.f139607o;
        m3d0Var2.f139609q = m3d0Var.f139609q;
        m3d0Var2.f139610r = m3d0Var.f139610r;
        if (m3d0Var.f139599g != null) {
            m3d0Var2.f139599g = new Rect(m3d0Var.f139599g);
        }
        this.f150021a = m3d0Var2;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m63603n(int i) {
        this.f150011N0.m93580a(i);
        this.f150021a.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public final void m63604o() {
        m3d0 m3d0Var = this.f150021a;
        if (m3d0Var.f139609q != 45) {
            m3d0Var.f139609q = 45;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f150025e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m63606q(iArr) || m63607r();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final void m63605p() {
        m3d0 m3d0Var = this.f150021a;
        if (m3d0Var.f139606n != 2) {
            m3d0Var.f139606n = 2;
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m63606q(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f150021a.f139595c == null || color2 == (colorForState2 = this.f150021a.f139595c.getColorForState(iArr, (color2 = (paint2 = this.f150009L0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f150021a.f139596d == null || color == (colorForState = this.f150021a.f139596d.getColorForState(iArr, (color = (paint = this.f150010M0).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m63607r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f150014Q0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f150015R0;
        m3d0 m3d0Var = this.f150021a;
        ColorStateList colorStateList = m3d0Var.f139597e;
        PorterDuff.Mode mode = m3d0Var.f139598f;
        if (colorStateList == null || mode == null) {
            int color = this.f150009L0.getColor();
            int iM63593c = m63593c(color);
            porterDuffColorFilter = iM63593c != color ? new PorterDuffColorFilter(iM63593c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m63593c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f150014Q0 = porterDuffColorFilter;
        this.f150021a.getClass();
        this.f150015R0 = null;
        this.f150021a.getClass();
        return (p1m0.m68831l(porterDuffColorFilter2, this.f150014Q0) && p1m0.m68831l(porterDuffColorFilter3, this.f150015R0)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public final void m63608s() {
        m3d0 m3d0Var = this.f150021a;
        float f = m3d0Var.f139605m + 0.0f;
        m3d0Var.f139607o = (int) Math.ceil(0.75f * f);
        this.f150021a.f139608p = (int) Math.ceil(f * 0.25f);
        m63607r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m3d0 m3d0Var = this.f150021a;
        if (m3d0Var.f139603k != i) {
            m3d0Var.f139603k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f150021a.getClass();
        super.invalidateSelf();
    }

    @Override // p204p.ei01
    public final void setShapeAppearanceModel(dh01 dh01Var) {
        this.f150021a.f139593a = dh01Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f150021a.f139597e = colorStateList;
        m63607r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        m3d0 m3d0Var = this.f150021a;
        if (m3d0Var.f139598f != mode) {
            m3d0Var.f139598f = mode;
            m63607r();
            super.invalidateSelf();
        }
    }

    public n3d0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(dh01.m35958b(context, attributeSet, i, i2).m74257d());
    }

    public n3d0(dh01 dh01Var) {
        m3d0 m3d0Var = new m3d0();
        m3d0Var.f139595c = null;
        m3d0Var.f139596d = null;
        m3d0Var.f139597e = null;
        m3d0Var.f139598f = PorterDuff.Mode.SRC_IN;
        m3d0Var.f139599g = null;
        m3d0Var.f139600h = 1.0f;
        m3d0Var.f139601i = 1.0f;
        m3d0Var.f139603k = 255;
        m3d0Var.f139604l = 0.0f;
        m3d0Var.f139605m = 0.0f;
        m3d0Var.f139606n = 0;
        m3d0Var.f139607o = 0;
        m3d0Var.f139608p = 0;
        m3d0Var.f139609q = 0;
        m3d0Var.f139610r = Paint.Style.FILL_AND_STROKE;
        m3d0Var.f139593a = dh01Var;
        m3d0Var.f139594b = null;
        this(m3d0Var);
    }

    public n3d0(m3d0 m3d0Var) {
        this.f150022b = new vh01[4];
        this.f150023c = new vh01[4];
        this.f150024d = new BitSet(8);
        this.f150026f = new Matrix();
        this.f150027g = new Path();
        this.f150028h = new Path();
        this.f150029i = new RectF();
        this.f150030t = new RectF();
        this.f150018X = new Region();
        this.f150019Y = new Region();
        Paint paint = new Paint(1);
        this.f150009L0 = paint;
        Paint paint2 = new Paint(1);
        this.f150010M0 = paint2;
        this.f150011N0 = new yg01();
        this.f150013P0 = Looper.getMainLooper().getThread() == Thread.currentThread() ? o0i.m66014c() : new o0i();
        this.f150016S0 = new RectF();
        this.f150017T0 = true;
        this.f150021a = m3d0Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m63607r();
        m63606q(getState());
        this.f150012O0 = new l3d0(this, 0);
    }
}
