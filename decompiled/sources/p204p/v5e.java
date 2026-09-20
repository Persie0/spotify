package p204p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class v5e extends n3d0 implements Drawable.Callback, n571 {

    /* JADX INFO: renamed from: d2 */
    public static final int[] f237396d2 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: e2 */
    public static final ShapeDrawable f237397e2 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A1 */
    public float f237398A1;

    /* JADX INFO: renamed from: B1 */
    public float f237399B1;

    /* JADX INFO: renamed from: C1 */
    public final Context f237400C1;

    /* JADX INFO: renamed from: D1 */
    public final Paint f237401D1;

    /* JADX INFO: renamed from: E1 */
    public final Paint.FontMetrics f237402E1;

    /* JADX INFO: renamed from: F1 */
    public final RectF f237403F1;

    /* JADX INFO: renamed from: G1 */
    public final PointF f237404G1;

    /* JADX INFO: renamed from: H1 */
    public final Path f237405H1;

    /* JADX INFO: renamed from: I1 */
    public final o571 f237406I1;

    /* JADX INFO: renamed from: J1 */
    public int f237407J1;

    /* JADX INFO: renamed from: K1 */
    public int f237408K1;

    /* JADX INFO: renamed from: L1 */
    public int f237409L1;

    /* JADX INFO: renamed from: M1 */
    public int f237410M1;

    /* JADX INFO: renamed from: N1 */
    public int f237411N1;

    /* JADX INFO: renamed from: O1 */
    public int f237412O1;

    /* JADX INFO: renamed from: P1 */
    public boolean f237413P1;

    /* JADX INFO: renamed from: Q1 */
    public int f237414Q1;

    /* JADX INFO: renamed from: R1 */
    public int f237415R1;

    /* JADX INFO: renamed from: S1 */
    public ColorFilter f237416S1;

    /* JADX INFO: renamed from: T1 */
    public PorterDuffColorFilter f237417T1;

    /* JADX INFO: renamed from: U1 */
    public ColorStateList f237418U1;

    /* JADX INFO: renamed from: V0 */
    public ColorStateList f237419V0;

    /* JADX INFO: renamed from: V1 */
    public PorterDuff.Mode f237420V1;

    /* JADX INFO: renamed from: W0 */
    public ColorStateList f237421W0;

    /* JADX INFO: renamed from: W1 */
    public int[] f237422W1;

    /* JADX INFO: renamed from: X0 */
    public float f237423X0;

    /* JADX INFO: renamed from: X1 */
    public ColorStateList f237424X1;

    /* JADX INFO: renamed from: Y0 */
    public float f237425Y0;

    /* JADX INFO: renamed from: Y1 */
    public WeakReference f237426Y1;

    /* JADX INFO: renamed from: Z0 */
    public ColorStateList f237427Z0;

    /* JADX INFO: renamed from: Z1 */
    public TextUtils.TruncateAt f237428Z1;

    /* JADX INFO: renamed from: a1 */
    public float f237429a1;

    /* JADX INFO: renamed from: a2 */
    public boolean f237430a2;

    /* JADX INFO: renamed from: b1 */
    public ColorStateList f237431b1;

    /* JADX INFO: renamed from: b2 */
    public int f237432b2;

    /* JADX INFO: renamed from: c1 */
    public CharSequence f237433c1;

    /* JADX INFO: renamed from: c2 */
    public boolean f237434c2;

    /* JADX INFO: renamed from: d1 */
    public boolean f237435d1;

    /* JADX INFO: renamed from: e1 */
    public Drawable f237436e1;

    /* JADX INFO: renamed from: f1 */
    public ColorStateList f237437f1;

    /* JADX INFO: renamed from: g1 */
    public float f237438g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f237439h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f237440i1;

    /* JADX INFO: renamed from: j1 */
    public Drawable f237441j1;

    /* JADX INFO: renamed from: k1 */
    public RippleDrawable f237442k1;

    /* JADX INFO: renamed from: l1 */
    public ColorStateList f237443l1;

    /* JADX INFO: renamed from: m1 */
    public float f237444m1;

    /* JADX INFO: renamed from: n1 */
    public SpannableStringBuilder f237445n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f237446o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f237447p1;

    /* JADX INFO: renamed from: q1 */
    public Drawable f237448q1;

    /* JADX INFO: renamed from: r1 */
    public ColorStateList f237449r1;

    /* JADX INFO: renamed from: s1 */
    public z1i0 f237450s1;

    /* JADX INFO: renamed from: t1 */
    public z1i0 f237451t1;

    /* JADX INFO: renamed from: u1 */
    public float f237452u1;

    /* JADX INFO: renamed from: v1 */
    public float f237453v1;

    /* JADX INFO: renamed from: w1 */
    public float f237454w1;

    /* JADX INFO: renamed from: x1 */
    public float f237455x1;

    /* JADX INFO: renamed from: y1 */
    public float f237456y1;

    /* JADX INFO: renamed from: z1 */
    public float f237457z1;

    public v5e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action);
        this.f237425Y0 = -1.0f;
        this.f237401D1 = new Paint(1);
        this.f237402E1 = new Paint.FontMetrics();
        this.f237403F1 = new RectF();
        this.f237404G1 = new PointF();
        this.f237405H1 = new Path();
        this.f237415R1 = 255;
        this.f237420V1 = PorterDuff.Mode.SRC_IN;
        this.f237426Y1 = new WeakReference(null);
        m63599j(context);
        this.f237400C1 = context;
        o571 o571Var = new o571(this);
        this.f237406I1 = o571Var;
        this.f237433c1 = "";
        o571Var.f161903a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f237396d2;
        setState(iArr);
        if (!Arrays.equals(this.f237422W1, iArr)) {
            this.f237422W1 = iArr;
            if (m84710Y()) {
                m84687B(getState(), iArr);
            }
        }
        this.f237430a2 = true;
        f237397e2.setTint(-1);
    }

    /* JADX INFO: renamed from: Z */
    public static void m84683Z(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m84684y(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m84685z(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m84686A() {
        u5e u5eVar = (u5e) this.f237426Y1.get();
        if (u5eVar != null) {
            Chip chip = (Chip) u5eVar;
            chip.m1607c(chip.f2095Q0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX INFO: renamed from: B */
    public final boolean m84687B(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f237419V0;
        int iM63593c = m63593c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f237407J1) : 0);
        boolean state = true;
        if (this.f237407J1 != iM63593c) {
            this.f237407J1 = iM63593c;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f237421W0;
        int iM63593c2 = m63593c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f237408K1) : 0);
        if (this.f237408K1 != iM63593c2) {
            this.f237408K1 = iM63593c2;
            zOnStateChange = true;
        }
        int iM61221i = m9f.m61221i(iM63593c2, iM63593c);
        if ((this.f237409L1 != iM61221i) | (this.f150021a.f139595c == null)) {
            this.f237409L1 = iM61221i;
            m63601l(ColorStateList.valueOf(iM61221i));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f237427Z0;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f237410M1) : 0;
        if (this.f237410M1 != colorForState2) {
            this.f237410M1 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f237424X1 != null) {
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z4 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                z3 = true;
            }
            if (z3) {
                colorForState = this.f237424X1.getColorForState(iArr, this.f237411N1);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.f237411N1 != colorForState) {
            this.f237411N1 = colorForState;
        }
        r171 r171Var = this.f237406I1.f161908f;
        int colorForState3 = (r171Var == null || (colorStateList = r171Var.f194792j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f237412O1);
        if (this.f237412O1 != colorForState3) {
            this.f237412O1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int length = state2.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (state2[i2] == 16842912) {
                    if (this.f237446o1) {
                        z = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
            z = false;
            break;
        }
        if (this.f237413P1 == z || this.f237448q1 == null) {
            z2 = false;
        } else {
            float fM84713v = m84713v();
            this.f237413P1 = z;
            if (fM84713v != m84713v()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f237418U1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f237414Q1) : 0;
        if (this.f237414Q1 != colorForState4) {
            this.f237414Q1 = colorForState4;
            ColorStateList colorStateList6 = this.f237418U1;
            PorterDuff.Mode mode = this.f237420V1;
            this.f237417T1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m84685z(this.f237436e1)) {
            state |= this.f237436e1.setState(iArr);
        }
        if (m84685z(this.f237448q1)) {
            state |= this.f237448q1.setState(iArr);
        }
        if (m84685z(this.f237441j1)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f237441j1.setState(iArr3);
        }
        if (m84685z(this.f237442k1)) {
            state |= this.f237442k1.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m84686A();
        }
        return state;
    }

    /* JADX INFO: renamed from: C */
    public final void m84688C(boolean z) {
        if (this.f237446o1 != z) {
            this.f237446o1 = z;
            float fM84713v = m84713v();
            if (!z && this.f237413P1) {
                this.f237413P1 = false;
            }
            float fM84713v2 = m84713v();
            invalidateSelf();
            if (fM84713v != fM84713v2) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m84689D(Drawable drawable) {
        if (this.f237448q1 != drawable) {
            float fM84713v = m84713v();
            this.f237448q1 = drawable;
            float fM84713v2 = m84713v();
            m84683Z(this.f237448q1);
            m84711t(this.f237448q1);
            invalidateSelf();
            if (fM84713v != fM84713v2) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m84690E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f237449r1 != colorStateList) {
            this.f237449r1 = colorStateList;
            if (this.f237447p1 && (drawable = this.f237448q1) != null && this.f237446o1) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m84691F(boolean z) {
        if (this.f237447p1 != z) {
            boolean zM84708W = m84708W();
            this.f237447p1 = z;
            boolean zM84708W2 = m84708W();
            if (zM84708W != zM84708W2) {
                if (zM84708W2) {
                    m84711t(this.f237448q1);
                } else {
                    m84683Z(this.f237448q1);
                }
                invalidateSelf();
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m84692G(float f) {
        if (this.f237425Y0 != f) {
            this.f237425Y0 = f;
            setShapeAppearanceModel(this.f150021a.f139593a.m35961e(f));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m84693H(Drawable drawable) {
        Drawable drawable2 = this.f237436e1;
        Drawable drawableM79464R = drawable2 != null ? svg1.m79464R(drawable2) : null;
        if (drawableM79464R != drawable) {
            float fM84713v = m84713v();
            this.f237436e1 = drawable != null ? drawable.mutate() : null;
            float fM84713v2 = m84713v();
            m84683Z(drawableM79464R);
            if (m84709X()) {
                m84711t(this.f237436e1);
            }
            invalidateSelf();
            if (fM84713v != fM84713v2) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m84694I(float f) {
        if (this.f237438g1 != f) {
            float fM84713v = m84713v();
            this.f237438g1 = f;
            float fM84713v2 = m84713v();
            invalidateSelf();
            if (fM84713v != fM84713v2) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m84695J(ColorStateList colorStateList) {
        this.f237439h1 = true;
        if (this.f237437f1 != colorStateList) {
            this.f237437f1 = colorStateList;
            if (m84709X()) {
                this.f237436e1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m84696K(boolean z) {
        if (this.f237435d1 != z) {
            boolean zM84709X = m84709X();
            this.f237435d1 = z;
            boolean zM84709X2 = m84709X();
            if (zM84709X != zM84709X2) {
                if (zM84709X2) {
                    m84711t(this.f237436e1);
                } else {
                    m84683Z(this.f237436e1);
                }
                invalidateSelf();
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m84697L(ColorStateList colorStateList) {
        if (this.f237427Z0 != colorStateList) {
            this.f237427Z0 = colorStateList;
            if (this.f237434c2) {
                m3d0 m3d0Var = this.f150021a;
                if (m3d0Var.f139596d != colorStateList) {
                    m3d0Var.f139596d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m84698M(float f) {
        if (this.f237429a1 != f) {
            this.f237429a1 = f;
            this.f237401D1.setStrokeWidth(f);
            if (this.f237434c2) {
                this.f150021a.f139602j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m84699N(Drawable drawable) {
        Drawable drawable2 = this.f237441j1;
        Drawable drawableM79464R = drawable2 != null ? svg1.m79464R(drawable2) : null;
        if (drawableM79464R != drawable) {
            float fM84714w = m84714w();
            this.f237441j1 = drawable != null ? drawable.mutate() : null;
            this.f237442k1 = new RippleDrawable(cyf1.m34379o(this.f237431b1), this.f237441j1, f237397e2);
            float fM84714w2 = m84714w();
            m84683Z(drawableM79464R);
            if (m84710Y()) {
                m84711t(this.f237441j1);
            }
            invalidateSelf();
            if (fM84714w != fM84714w2) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m84700O(float f) {
        if (this.f237398A1 != f) {
            this.f237398A1 = f;
            invalidateSelf();
            if (m84710Y()) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m84701P(float f) {
        if (this.f237444m1 != f) {
            this.f237444m1 = f;
            invalidateSelf();
            if (m84710Y()) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m84702Q(float f) {
        if (this.f237457z1 != f) {
            this.f237457z1 = f;
            invalidateSelf();
            if (m84710Y()) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m84703R(ColorStateList colorStateList) {
        if (this.f237443l1 != colorStateList) {
            this.f237443l1 = colorStateList;
            if (m84710Y()) {
                this.f237441j1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m84704S(boolean z) {
        if (this.f237440i1 != z) {
            boolean zM84710Y = m84710Y();
            this.f237440i1 = z;
            boolean zM84710Y2 = m84710Y();
            if (zM84710Y != zM84710Y2) {
                if (zM84710Y2) {
                    m84711t(this.f237441j1);
                } else {
                    m84683Z(this.f237441j1);
                }
                invalidateSelf();
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m84705T(float f) {
        if (this.f237454w1 != f) {
            float fM84713v = m84713v();
            this.f237454w1 = f;
            float fM84713v2 = m84713v();
            invalidateSelf();
            if (fM84713v != fM84713v2) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m84706U(float f) {
        if (this.f237453v1 != f) {
            float fM84713v = m84713v();
            this.f237453v1 = f;
            float fM84713v2 = m84713v();
            invalidateSelf();
            if (fM84713v != fM84713v2) {
                m84686A();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m84707V(ColorStateList colorStateList) {
        if (this.f237431b1 != colorStateList) {
            this.f237431b1 = colorStateList;
            this.f237424X1 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m84708W() {
        return this.f237447p1 && this.f237448q1 != null && this.f237413P1;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m84709X() {
        return this.f237435d1 && this.f237436e1 != null;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m84710Y() {
        return this.f237440i1 && this.f237441j1 != null;
    }

    @Override // p204p.n571
    /* JADX INFO: renamed from: a */
    public final void mo36629a() {
        m84686A();
        invalidateSelf();
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f237415R1) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f237434c2;
        Paint paint = this.f237401D1;
        RectF rectF = this.f237403F1;
        if (!z) {
            paint.setColor(this.f237407J1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m84715x(), m84715x(), paint);
        }
        if (!this.f237434c2) {
            paint.setColor(this.f237408K1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f237416S1;
            if (colorFilter == null) {
                colorFilter = this.f237417T1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m84715x(), m84715x(), paint);
        }
        if (this.f237434c2) {
            super.draw(canvas);
        }
        if (this.f237429a1 > 0.0f && !this.f237434c2) {
            paint.setColor(this.f237410M1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f237434c2) {
                ColorFilter colorFilter2 = this.f237416S1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f237417T1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f237429a1 / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f237425Y0 - (this.f237429a1 / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f237411N1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f237434c2) {
            RectF rectF2 = new RectF(bounds);
            m3d0 m3d0Var = this.f150021a;
            dh01 dh01Var = m3d0Var.f139593a;
            float f4 = m3d0Var.f139601i;
            l3d0 l3d0Var = this.f150012O0;
            o0i o0iVar = this.f150013P0;
            Path path = this.f237405H1;
            o0iVar.m66016b(dh01Var, f4, rectF2, l3d0Var, path);
            m63595e(canvas2, paint, path, this.f150021a.f139593a, m63596g());
        } else {
            canvas2.drawRoundRect(rectF, m84715x(), m84715x(), paint);
        }
        if (m84709X()) {
            m84712u(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.f237436e1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f237436e1.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (m84708W()) {
            m84712u(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f237448q1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f237448q1.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.f237430a2 && this.f237433c1 != null) {
            PointF pointF = this.f237404G1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f237433c1;
            o571 o571Var = this.f237406I1;
            if (charSequence != null) {
                float fM84713v = m84713v() + this.f237452u1 + this.f237455x1;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM84713v;
                } else {
                    pointF.x = bounds.right - fM84713v;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = o571Var.f161903a;
                Paint.FontMetrics fontMetrics = this.f237402E1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f237433c1 != null) {
                float fM84713v2 = m84713v() + this.f237452u1 + this.f237455x1;
                float fM84714w = m84714w() + this.f237399B1 + this.f237456y1;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fM84713v2;
                    rectF.right = bounds.right - fM84714w;
                } else {
                    rectF.left = bounds.left + fM84714w;
                    rectF.right = bounds.right - fM84713v2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            r171 r171Var = o571Var.f161908f;
            TextPaint textPaint2 = o571Var.f161903a;
            if (r171Var != null) {
                textPaint2.drawableState = getState();
                o571Var.f161908f.m74468e(this.f237400C1, textPaint2, o571Var.f161904b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(o571Var.m66278a(this.f237433c1.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f237433c1;
            if (z2 && this.f237428Z1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f237428Z1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m84710Y()) {
            rectF.setEmpty();
            if (m84710Y()) {
                float f9 = this.f237399B1 + this.f237398A1;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.f237444m1;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.f237444m1;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.f237444m1;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f237441j1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f237442k1.setBounds(this.f237441j1.getBounds());
            this.f237442k1.jumpToCurrentState();
            this.f237442k1.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.f237415R1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f237415R1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f237416S1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f237423X0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m84714w() + this.f237406I1.m66278a(this.f237433c1.toString()) + m84713v() + this.f237452u1 + this.f237455x1 + this.f237456y1 + this.f237399B1), this.f237432b2);
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f237434c2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f237423X0, this.f237425Y0);
        } else {
            outline.setRoundRect(bounds, this.f237425Y0);
            outline2 = outline;
        }
        outline2.setAlpha(this.f237415R1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m84684y(this.f237419V0) || m84684y(this.f237421W0) || m84684y(this.f237427Z0)) {
            return true;
        }
        r171 r171Var = this.f237406I1.f161908f;
        if (r171Var == null || (colorStateList = r171Var.f194792j) == null || !colorStateList.isStateful()) {
            return (this.f237447p1 && this.f237448q1 != null && this.f237446o1) || m84685z(this.f237436e1) || m84685z(this.f237448q1) || m84684y(this.f237418U1);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m84709X()) {
            zOnLayoutDirectionChanged |= this.f237436e1.setLayoutDirection(i);
        }
        if (m84708W()) {
            zOnLayoutDirectionChanged |= this.f237448q1.setLayoutDirection(i);
        }
        if (m84710Y()) {
            zOnLayoutDirectionChanged |= this.f237441j1.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m84709X()) {
            zOnLevelChange |= this.f237436e1.setLevel(i);
        }
        if (m84708W()) {
            zOnLevelChange |= this.f237448q1.setLevel(i);
        }
        if (m84710Y()) {
            zOnLevelChange |= this.f237441j1.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f237434c2) {
            super.onStateChange(iArr);
        }
        return m84687B(iArr, this.f237422W1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f237415R1 != i) {
            this.f237415R1 = i;
            invalidateSelf();
        }
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f237416S1 != colorFilter) {
            this.f237416S1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f237418U1 != colorStateList) {
            this.f237418U1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f237420V1 != mode) {
            this.f237420V1 = mode;
            ColorStateList colorStateList = this.f237418U1;
            this.f237417T1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m84709X()) {
            visible |= this.f237436e1.setVisible(z, z2);
        }
        if (m84708W()) {
            visible |= this.f237448q1.setVisible(z, z2);
        }
        if (m84710Y()) {
            visible |= this.f237441j1.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: t */
    public final void m84711t(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f237441j1) {
            if (drawable.isStateful()) {
                drawable.setState(this.f237422W1);
            }
            drawable.setTintList(this.f237443l1);
            return;
        }
        Drawable drawable2 = this.f237436e1;
        if (drawable == drawable2 && this.f237439h1) {
            drawable2.setTintList(this.f237437f1);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m84712u(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m84709X() || m84708W()) {
            float f = this.f237452u1 + this.f237453v1;
            Drawable drawable = this.f237413P1 ? this.f237448q1 : this.f237436e1;
            float intrinsicWidth = this.f237438g1;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f237413P1 ? this.f237448q1 : this.f237436e1;
            float fCeil = this.f237438g1;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(bga.m29100v(this.f237400C1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v */
    public final float m84713v() {
        if (!m84709X() && !m84708W()) {
            return 0.0f;
        }
        float f = this.f237453v1;
        Drawable drawable = this.f237413P1 ? this.f237448q1 : this.f237436e1;
        float intrinsicWidth = this.f237438g1;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f237454w1;
    }

    /* JADX INFO: renamed from: w */
    public final float m84714w() {
        if (m84710Y()) {
            return this.f237457z1 + this.f237444m1 + this.f237398A1;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x */
    public final float m84715x() {
        return this.f237434c2 ? m63597h() : this.f237425Y0;
    }
}
