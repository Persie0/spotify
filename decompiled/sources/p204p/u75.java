package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u75 {

    /* JADX INFO: renamed from: a */
    public final TextView f227503a;

    /* JADX INFO: renamed from: b */
    public mzi f227504b;

    /* JADX INFO: renamed from: c */
    public mzi f227505c;

    /* JADX INFO: renamed from: d */
    public mzi f227506d;

    /* JADX INFO: renamed from: e */
    public mzi f227507e;

    /* JADX INFO: renamed from: f */
    public mzi f227508f;

    /* JADX INFO: renamed from: g */
    public mzi f227509g;

    /* JADX INFO: renamed from: h */
    public mzi f227510h;

    /* JADX INFO: renamed from: i */
    private final d85 f227511i;

    /* JADX INFO: renamed from: j */
    public int f227512j = 0;

    /* JADX INFO: renamed from: k */
    public int f227513k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f227514l;

    /* JADX INFO: renamed from: m */
    public boolean f227515m;

    public u75(TextView textView) {
        this.f227503a = textView;
        this.f227511i = new d85(textView);
    }

    /* JADX INFO: renamed from: d */
    public static mzi m82483d(Context context, p65 p65Var, int i) {
        ColorStateList colorStateListM60557g;
        synchronized (p65Var) {
            colorStateListM60557g = p65Var.f174297a.m60557g(context, i);
        }
        if (colorStateListM60557g == null) {
            return null;
        }
        mzi mziVar = new mzi();
        mziVar.f148717b = true;
        mziVar.f148718c = colorStateListM60557g;
        return mziVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m82484a(Drawable drawable, mzi mziVar) {
        if (drawable == null || mziVar == null) {
            return;
        }
        p65.m69180e(drawable, mziVar, this.f227503a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m82485b() {
        mzi mziVar = this.f227504b;
        TextView textView = this.f227503a;
        if (mziVar != null || this.f227505c != null || this.f227506d != null || this.f227507e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m82484a(compoundDrawables[0], this.f227504b);
            m82484a(compoundDrawables[1], this.f227505c);
            m82484a(compoundDrawables[2], this.f227506d);
            m82484a(compoundDrawables[3], this.f227507e);
        }
        if (this.f227508f == null && this.f227509g == null) {
            return;
        }
        Drawable[] drawableArrM72284a = q75.m72284a(textView);
        m82484a(drawableArrM72284a[0], this.f227508f);
        m82484a(drawableArrM72284a[2], this.f227509g);
    }

    /* JADX INFO: renamed from: c */
    public final void m82486c() {
        this.f227511i.m35248a();
    }

    /* JADX INFO: renamed from: e */
    public final int m82487e() {
        return Math.round(this.f227511i.f46373e);
    }

    /* JADX INFO: renamed from: f */
    public final int m82488f() {
        return Math.round(this.f227511i.f46372d);
    }

    /* JADX INFO: renamed from: g */
    public final int m82489g() {
        return Math.round(this.f227511i.f46371c);
    }

    /* JADX INFO: renamed from: h */
    public final int[] m82490h() {
        return this.f227511i.f46374f;
    }

    /* JADX INFO: renamed from: i */
    public final int m82491i() {
        return this.f227511i.f46369a;
    }

    /* JADX INFO: renamed from: j */
    public final ColorStateList m82492j() {
        mzi mziVar = this.f227510h;
        if (mziVar != null) {
            return (ColorStateList) mziVar.f148718c;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final PorterDuff.Mode m82493k() {
        mzi mziVar = this.f227510h;
        if (mziVar != null) {
            return (PorterDuff.Mode) mziVar.f148719d;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m82494l() {
        d85 d85Var = this.f227511i;
        return d85Var.m35253h() && d85Var.f46369a != 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m82495m(AttributeSet attributeSet, int i) {
        boolean z;
        boolean zM34196c;
        String strM34209v;
        String strM34209v2;
        int i2;
        int resourceId;
        TextView textView = this.f227503a;
        Context context = textView.getContext();
        p65 p65VarM69177a = p65.m69177a();
        int[] iArr = h3u0.f87328h;
        cx21 cx21VarM34178J = cx21.m34178J(context, attributeSet, iArr, i);
        mec1.m61563o(textView, textView.getContext(), iArr, attributeSet, cx21VarM34178J.m34212z(), i);
        int iM34207t = cx21VarM34178J.m34207t(0, -1);
        if (cx21VarM34178J.m34184B(3)) {
            this.f227504b = m82483d(context, p65VarM69177a, cx21VarM34178J.m34207t(3, 0));
        }
        if (cx21VarM34178J.m34184B(1)) {
            this.f227505c = m82483d(context, p65VarM69177a, cx21VarM34178J.m34207t(1, 0));
        }
        if (cx21VarM34178J.m34184B(4)) {
            this.f227506d = m82483d(context, p65VarM69177a, cx21VarM34178J.m34207t(4, 0));
        }
        if (cx21VarM34178J.m34184B(2)) {
            this.f227507e = m82483d(context, p65VarM69177a, cx21VarM34178J.m34207t(2, 0));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (cx21VarM34178J.m34184B(5)) {
            this.f227508f = m82483d(context, p65VarM69177a, cx21VarM34178J.m34207t(5, 0));
        }
        if (cx21VarM34178J.m34184B(6)) {
            this.f227509g = m82483d(context, p65VarM69177a, cx21VarM34178J.m34207t(6, 0));
        }
        cx21VarM34178J.m34189K();
        boolean z2 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = h3u0.f87344x;
        if (iM34207t != -1) {
            cx21 cx21VarM34176H = cx21.m34176H(context, iM34207t, iArr2);
            if (z2 || !cx21VarM34176H.m34184B(14)) {
                z = false;
                zM34196c = false;
            } else {
                zM34196c = cx21VarM34176H.m34196c(14, false);
                z = true;
            }
            m82503u(context, cx21VarM34176H);
            strM34209v = cx21VarM34176H.m34184B(15) ? cx21VarM34176H.m34209v(15) : null;
            strM34209v2 = (i3 < 26 || !cx21VarM34176H.m34184B(13)) ? null : cx21VarM34176H.m34209v(13);
            cx21VarM34176H.m34189K();
        } else {
            z = false;
            zM34196c = false;
            strM34209v = null;
            strM34209v2 = null;
        }
        cx21 cx21VarM34178J2 = cx21.m34178J(context, attributeSet, iArr2, i);
        if (!z2 && cx21VarM34178J2.m34184B(14)) {
            zM34196c = cx21VarM34178J2.m34196c(14, false);
            z = true;
        }
        boolean z3 = zM34196c;
        if (cx21VarM34178J2.m34184B(15)) {
            strM34209v = cx21VarM34178J2.m34209v(15);
        }
        if (i3 >= 26 && cx21VarM34178J2.m34184B(13)) {
            strM34209v2 = cx21VarM34178J2.m34209v(13);
        }
        String str = strM34209v2;
        if (i3 >= 28 && cx21VarM34178J2.m34184B(0) && cx21VarM34178J2.m34200j(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m82503u(context, cx21VarM34178J2);
        cx21VarM34178J2.m34189K();
        if (!z2 && z) {
            textView.setAllCaps(z3);
        }
        Typeface typeface = this.f227514l;
        if (typeface != null) {
            if (this.f227513k == -1) {
                textView.setTypeface(typeface, this.f227512j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            s75.m77361d(textView, str);
        }
        if (strM34209v != null) {
            r75.m74891b(textView, r75.m74890a(strM34209v));
        }
        d85 d85Var = this.f227511i;
        Context context2 = d85Var.f46378j;
        int[] iArr3 = h3u0.f87329i;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = d85Var.f46377i;
        mec1.m61563o(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            d85Var.f46369a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                d85Var.f46374f = d85.m35246b(iArr4);
                d85Var.m35252g();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!d85Var.m35253h()) {
            d85Var.f46369a = 0;
        } else if (d85Var.f46369a == 1) {
            if (!d85Var.f46375g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                d85Var.m35254i(dimension2, f, dimension);
            }
            d85Var.m35251f();
        }
        if (cpc1.f40542b) {
            d85 d85Var2 = this.f227511i;
            if (d85Var2.f46369a != 0) {
                int[] iArr5 = d85Var2.f46374f;
                if (iArr5.length > 0) {
                    if (s75.m77358a(textView) != -1.0f) {
                        s75.m77359b(textView, Math.round(this.f227511i.f46372d), Math.round(this.f227511i.f46373e), Math.round(this.f227511i.f46371c), 0);
                    } else {
                        s75.m77360c(textView, iArr5, 0);
                    }
                }
            }
        }
        cx21 cx21VarM34177I = cx21.m34177I(context, attributeSet, iArr3);
        int iM34207t2 = cx21VarM34177I.m34207t(8, -1);
        Drawable drawableM69181b = iM34207t2 != -1 ? p65VarM69177a.m69181b(context, iM34207t2) : null;
        int iM34207t3 = cx21VarM34177I.m34207t(13, -1);
        Drawable drawableM69181b2 = iM34207t3 != -1 ? p65VarM69177a.m69181b(context, iM34207t3) : null;
        int iM34207t4 = cx21VarM34177I.m34207t(9, -1);
        Drawable drawableM69181b3 = iM34207t4 != -1 ? p65VarM69177a.m69181b(context, iM34207t4) : null;
        int iM34207t5 = cx21VarM34177I.m34207t(6, -1);
        Drawable drawableM69181b4 = iM34207t5 != -1 ? p65VarM69177a.m69181b(context, iM34207t5) : null;
        int iM34207t6 = cx21VarM34177I.m34207t(10, -1);
        Drawable drawableM69181b5 = iM34207t6 != -1 ? p65VarM69177a.m69181b(context, iM34207t6) : null;
        int iM34207t7 = cx21VarM34177I.m34207t(7, -1);
        Drawable drawableM69181b6 = iM34207t7 != -1 ? p65VarM69177a.m69181b(context, iM34207t7) : null;
        if (drawableM69181b5 != null || drawableM69181b6 != null) {
            Drawable[] drawableArrM72284a = q75.m72284a(textView);
            if (drawableM69181b5 == null) {
                drawableM69181b5 = drawableArrM72284a[0];
            }
            if (drawableM69181b2 == null) {
                drawableM69181b2 = drawableArrM72284a[1];
            }
            if (drawableM69181b6 == null) {
                drawableM69181b6 = drawableArrM72284a[2];
            }
            if (drawableM69181b4 == null) {
                drawableM69181b4 = drawableArrM72284a[3];
            }
            q75.m72285b(textView, drawableM69181b5, drawableM69181b2, drawableM69181b6, drawableM69181b4);
        } else if (drawableM69181b != null || drawableM69181b2 != null || drawableM69181b3 != null || drawableM69181b4 != null) {
            Drawable[] drawableArrM72284a2 = q75.m72284a(textView);
            Drawable drawable = drawableArrM72284a2[0];
            if (drawable == null && drawableArrM72284a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM69181b == null) {
                    drawableM69181b = compoundDrawables[0];
                }
                if (drawableM69181b2 == null) {
                    drawableM69181b2 = compoundDrawables[1];
                }
                if (drawableM69181b3 == null) {
                    drawableM69181b3 = compoundDrawables[2];
                }
                if (drawableM69181b4 == null) {
                    drawableM69181b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM69181b, drawableM69181b2, drawableM69181b3, drawableM69181b4);
            } else {
                if (drawableM69181b2 == null) {
                    drawableM69181b2 = drawableArrM72284a2[1];
                }
                Drawable drawable2 = drawableArrM72284a2[2];
                if (drawableM69181b4 == null) {
                    drawableM69181b4 = drawableArrM72284a2[3];
                }
                q75.m72285b(textView, drawable, drawableM69181b2, drawable2, drawableM69181b4);
            }
        }
        if (cx21VarM34177I.m34184B(11)) {
            mwg1.m63039s(textView, cx21VarM34177I.m34198g(11));
        }
        if (cx21VarM34177I.m34184B(12)) {
            mwg1.m63040t(textView, cgs.m32736c(cx21VarM34177I.m34205p(12, -1), null));
        }
        int iM34200j = cx21VarM34177I.m34200j(15, -1);
        int iM34200j2 = cx21VarM34177I.m34200j(18, -1);
        int iM34200j3 = cx21VarM34177I.m34200j(19, -1);
        cx21VarM34177I.m34189K();
        if (iM34200j != -1) {
            zn91.m96566n0(textView, iM34200j);
        }
        if (iM34200j2 != -1) {
            zn91.m96568o0(textView, iM34200j2);
        }
        if (iM34200j3 != -1) {
            zn91.m96570p0(textView, iM34200j3);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m82496n(Context context, int i) {
        String strM34209v;
        cx21 cx21VarM34176H = cx21.m34176H(context, i, h3u0.f87344x);
        boolean zM34184B = cx21VarM34176H.m34184B(14);
        TextView textView = this.f227503a;
        if (zM34184B) {
            textView.setAllCaps(cx21VarM34176H.m34196c(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (cx21VarM34176H.m34184B(0) && cx21VarM34176H.m34200j(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m82503u(context, cx21VarM34176H);
        if (i2 >= 26 && cx21VarM34176H.m34184B(13) && (strM34209v = cx21VarM34176H.m34209v(13)) != null) {
            s75.m77361d(textView, strM34209v);
        }
        cx21VarM34176H.m34189K();
        Typeface typeface = this.f227514l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f227512j);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m82497o(int i, int i2, int i3, int i4) {
        d85 d85Var = this.f227511i;
        if (d85Var.m35253h()) {
            DisplayMetrics displayMetrics = d85Var.f46378j.getResources().getDisplayMetrics();
            d85Var.m35254i(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (d85Var.m35251f()) {
                d85Var.m35248a();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m82498p(int[] iArr, int i) {
        d85 d85Var = this.f227511i;
        if (d85Var.m35253h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = d85Var.f46378j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                d85Var.f46374f = d85.m35246b(iArrCopyOf);
                if (!d85Var.m35252g()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                d85Var.f46375g = false;
            }
            if (d85Var.m35251f()) {
                d85Var.m35248a();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m82499q(int i) {
        d85 d85Var = this.f227511i;
        if (d85Var.m35253h()) {
            if (i == 0) {
                d85Var.f46369a = 0;
                d85Var.f46372d = -1.0f;
                d85Var.f46373e = -1.0f;
                d85Var.f46371c = -1.0f;
                d85Var.f46374f = new int[0];
                d85Var.f46370b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(s571.m77246e(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = d85Var.f46378j.getResources().getDisplayMetrics();
            d85Var.m35254i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (d85Var.m35251f()) {
                d85Var.m35248a();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m82500r(ColorStateList colorStateList) {
        if (this.f227510h == null) {
            this.f227510h = new mzi();
        }
        mzi mziVar = this.f227510h;
        mziVar.f148718c = colorStateList;
        mziVar.f148717b = colorStateList != null;
        this.f227504b = mziVar;
        this.f227505c = mziVar;
        this.f227506d = mziVar;
        this.f227507e = mziVar;
        this.f227508f = mziVar;
        this.f227509g = mziVar;
    }

    /* JADX INFO: renamed from: s */
    public final void m82501s(PorterDuff.Mode mode) {
        if (this.f227510h == null) {
            this.f227510h = new mzi();
        }
        mzi mziVar = this.f227510h;
        mziVar.f148719d = mode;
        mziVar.f148716a = mode != null;
        this.f227504b = mziVar;
        this.f227505c = mziVar;
        this.f227506d = mziVar;
        this.f227507e = mziVar;
        this.f227508f = mziVar;
        this.f227509g = mziVar;
    }

    /* JADX INFO: renamed from: t */
    public final void m82502t(int i, float f) {
        if (cpc1.f40542b) {
            return;
        }
        d85 d85Var = this.f227511i;
        if (!d85Var.m35253h() || d85Var.f46369a == 0) {
            this.f227511i.m35250e(f, i);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m82503u(Context context, cx21 cx21Var) {
        String strM34209v;
        this.f227512j = cx21Var.m34205p(2, this.f227512j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM34205p = cx21Var.m34205p(11, -1);
            this.f227513k = iM34205p;
            if (iM34205p != -1) {
                this.f227512j &= 2;
            }
        }
        if (!cx21Var.m34184B(10) && !cx21Var.m34184B(12)) {
            if (cx21Var.m34184B(1)) {
                this.f227515m = false;
                int iM34205p2 = cx21Var.m34205p(1, 1);
                if (iM34205p2 == 1) {
                    this.f227514l = Typeface.SANS_SERIF;
                    return;
                } else if (iM34205p2 == 2) {
                    this.f227514l = Typeface.SERIF;
                    return;
                } else {
                    if (iM34205p2 != 3) {
                        return;
                    }
                    this.f227514l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f227514l = null;
        int i2 = cx21Var.m34184B(12) ? 12 : 10;
        int i3 = this.f227513k;
        int i4 = this.f227512j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM34204o = cx21Var.m34204o(i2, this.f227512j, new p75(this, i3, i4, new WeakReference(this.f227503a)));
                if (typefaceM34204o != null) {
                    if (i < 28 || this.f227513k == -1) {
                        this.f227514l = typefaceM34204o;
                    } else {
                        this.f227514l = t75.m80183a(Typeface.create(typefaceM34204o, 0), this.f227513k, (this.f227512j & 2) != 0);
                    }
                }
                this.f227515m = this.f227514l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f227514l != null || (strM34209v = cx21Var.m34209v(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f227513k == -1) {
            this.f227514l = Typeface.create(strM34209v, this.f227512j);
        } else {
            this.f227514l = t75.m80183a(Typeface.create(strM34209v, 0), this.f227513k, (this.f227512j & 2) != 0);
        }
    }
}
