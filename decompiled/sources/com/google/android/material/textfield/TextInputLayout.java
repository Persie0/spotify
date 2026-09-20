package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p204p.C2281q5;
import p204p.aam;
import p204p.bcg1;
import p204p.bga;
import p204p.cgs;
import p204p.crs;
import p204p.cx21;
import p204p.dh01;
import p204p.ea71;
import p204p.euk;
import p204p.fa71;
import p204p.fec1;
import p204p.fem;
import p204p.ga71;
import p204p.h1u0;
import p204p.ihf1;
import p204p.k9y;
import p204p.kdm;
import p204p.kis;
import p204p.klh;
import p204p.lk00;
import p204p.lzj;
import p204p.m3d0;
import p204p.m9f;
import p204p.mec1;
import p204p.mo40;
import p204p.n3d0;
import p204p.o891;
import p204p.p65;
import p204p.r05;
import p204p.rhe;
import p204p.rx4;
import p204p.she;
import p204p.sze;
import p204p.ttq;
import p204p.uod0;
import p204p.vgg1;
import p204p.vhe;
import p204p.vtg1;
import p204p.wo5;
import p204p.wtg1;
import p204p.x1v;
import p204p.x9n0;
import p204p.y28;
import p204p.yb9;
import p204p.zpb;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: A1 */
    public ColorDrawable f2208A1;

    /* JADX INFO: renamed from: B1 */
    public int f2209B1;

    /* JADX INFO: renamed from: C1 */
    public View.OnLongClickListener f2210C1;

    /* JADX INFO: renamed from: D1 */
    public final LinkedHashSet f2211D1;

    /* JADX INFO: renamed from: E1 */
    public int f2212E1;

    /* JADX INFO: renamed from: F1 */
    public final SparseArray f2213F1;

    /* JADX INFO: renamed from: G1 */
    public final CheckableImageButton f2214G1;

    /* JADX INFO: renamed from: H1 */
    public final LinkedHashSet f2215H1;

    /* JADX INFO: renamed from: I1 */
    public ColorStateList f2216I1;

    /* JADX INFO: renamed from: J1 */
    public boolean f2217J1;

    /* JADX INFO: renamed from: K1 */
    public PorterDuff.Mode f2218K1;

    /* JADX INFO: renamed from: L0 */
    public int f2219L0;

    /* JADX INFO: renamed from: L1 */
    public boolean f2220L1;

    /* JADX INFO: renamed from: M0 */
    public boolean f2221M0;

    /* JADX INFO: renamed from: M1 */
    public ColorDrawable f2222M1;

    /* JADX INFO: renamed from: N0 */
    public AppCompatTextView f2223N0;

    /* JADX INFO: renamed from: N1 */
    public int f2224N1;

    /* JADX INFO: renamed from: O0 */
    public int f2225O0;

    /* JADX INFO: renamed from: O1 */
    public Drawable f2226O1;

    /* JADX INFO: renamed from: P0 */
    public int f2227P0;

    /* JADX INFO: renamed from: P1 */
    public View.OnLongClickListener f2228P1;

    /* JADX INFO: renamed from: Q0 */
    public CharSequence f2229Q0;

    /* JADX INFO: renamed from: Q1 */
    public View.OnLongClickListener f2230Q1;

    /* JADX INFO: renamed from: R0 */
    public boolean f2231R0;

    /* JADX INFO: renamed from: R1 */
    public final CheckableImageButton f2232R1;

    /* JADX INFO: renamed from: S0 */
    public AppCompatTextView f2233S0;

    /* JADX INFO: renamed from: S1 */
    public ColorStateList f2234S1;

    /* JADX INFO: renamed from: T0 */
    public ColorStateList f2235T0;

    /* JADX INFO: renamed from: T1 */
    public ColorStateList f2236T1;

    /* JADX INFO: renamed from: U0 */
    public int f2237U0;

    /* JADX INFO: renamed from: U1 */
    public ColorStateList f2238U1;

    /* JADX INFO: renamed from: V0 */
    public k9y f2239V0;

    /* JADX INFO: renamed from: V1 */
    public int f2240V1;

    /* JADX INFO: renamed from: W0 */
    public k9y f2241W0;

    /* JADX INFO: renamed from: W1 */
    public int f2242W1;

    /* JADX INFO: renamed from: X0 */
    public ColorStateList f2243X0;

    /* JADX INFO: renamed from: X1 */
    public int f2244X1;

    /* JADX INFO: renamed from: Y0 */
    public ColorStateList f2245Y0;

    /* JADX INFO: renamed from: Y1 */
    public ColorStateList f2246Y1;

    /* JADX INFO: renamed from: Z0 */
    public CharSequence f2247Z0;

    /* JADX INFO: renamed from: Z1 */
    public int f2248Z1;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f2249a;

    /* JADX INFO: renamed from: a1 */
    public final AppCompatTextView f2250a1;

    /* JADX INFO: renamed from: a2 */
    public int f2251a2;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f2252b;

    /* JADX INFO: renamed from: b1 */
    public CharSequence f2253b1;

    /* JADX INFO: renamed from: b2 */
    public int f2254b2;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f2255c;

    /* JADX INFO: renamed from: c1 */
    public final AppCompatTextView f2256c1;

    /* JADX INFO: renamed from: c2 */
    public int f2257c2;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f2258d;

    /* JADX INFO: renamed from: d1 */
    public boolean f2259d1;

    /* JADX INFO: renamed from: d2 */
    public int f2260d2;

    /* JADX INFO: renamed from: e */
    public EditText f2261e;

    /* JADX INFO: renamed from: e1 */
    public CharSequence f2262e1;

    /* JADX INFO: renamed from: e2 */
    public boolean f2263e2;

    /* JADX INFO: renamed from: f */
    public CharSequence f2264f;

    /* JADX INFO: renamed from: f1 */
    public boolean f2265f1;

    /* JADX INFO: renamed from: f2 */
    public final sze f2266f2;

    /* JADX INFO: renamed from: g */
    public int f2267g;

    /* JADX INFO: renamed from: g1 */
    public n3d0 f2268g1;

    /* JADX INFO: renamed from: g2 */
    public boolean f2269g2;

    /* JADX INFO: renamed from: h */
    public int f2270h;

    /* JADX INFO: renamed from: h1 */
    public n3d0 f2271h1;

    /* JADX INFO: renamed from: h2 */
    public boolean f2272h2;

    /* JADX INFO: renamed from: i */
    public final mo40 f2273i;

    /* JADX INFO: renamed from: i1 */
    public final dh01 f2274i1;

    /* JADX INFO: renamed from: i2 */
    public ValueAnimator f2275i2;

    /* JADX INFO: renamed from: j1 */
    public final int f2276j1;

    /* JADX INFO: renamed from: j2 */
    public boolean f2277j2;

    /* JADX INFO: renamed from: k1 */
    public int f2278k1;

    /* JADX INFO: renamed from: k2 */
    public boolean f2279k2;

    /* JADX INFO: renamed from: l1 */
    public int f2280l1;

    /* JADX INFO: renamed from: m1 */
    public int f2281m1;

    /* JADX INFO: renamed from: n1 */
    public int f2282n1;

    /* JADX INFO: renamed from: o1 */
    public int f2283o1;

    /* JADX INFO: renamed from: p1 */
    public int f2284p1;

    /* JADX INFO: renamed from: q1 */
    public int f2285q1;

    /* JADX INFO: renamed from: r1 */
    public final Rect f2286r1;

    /* JADX INFO: renamed from: s1 */
    public final Rect f2287s1;

    /* JADX INFO: renamed from: t */
    public boolean f2288t;

    /* JADX INFO: renamed from: t1 */
    public final RectF f2289t1;

    /* JADX INFO: renamed from: u1 */
    public Typeface f2290u1;

    /* JADX INFO: renamed from: v1 */
    public final CheckableImageButton f2291v1;

    /* JADX INFO: renamed from: w1 */
    public ColorStateList f2292w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f2293x1;

    /* JADX INFO: renamed from: y1 */
    public PorterDuff.Mode f2294y1;

    /* JADX INFO: renamed from: z1 */
    public boolean f2295z1;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m1639d(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private x1v getEndIconDelegate() {
        int i = this.f2212E1;
        SparseArray sparseArray = this.f2213F1;
        x1v x1vVar = (x1v) sparseArray.get(i);
        return x1vVar != null ? x1vVar : (x1v) sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.f2232R1;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.f2212E1 == 0 || !m1647g()) {
            return null;
        }
        return this.f2214G1;
    }

    /* JADX INFO: renamed from: j */
    public static void m1640j(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m1640j((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m1641l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = mec1.f142677a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        boolean z;
        boolean z2;
        if (this.f2261e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        this.f2261e = editText;
        setMinWidth(this.f2267g);
        setMaxWidth(this.f2270h);
        m1648h();
        setTextInputAccessibilityDelegate(new fa71(this));
        Typeface typeface = this.f2261e.getTypeface();
        sze szeVar = this.f2266f2;
        zpb zpbVar = szeVar.f215489B;
        if (zpbVar != null) {
            zpbVar.f285086e = true;
        }
        if (szeVar.f215546x != typeface) {
            szeVar.f215546x = typeface;
            z = true;
        } else {
            z = false;
        }
        zpb zpbVar2 = szeVar.f215488A;
        if (zpbVar2 != null) {
            zpbVar2.f285086e = true;
        }
        if (szeVar.f215547y != typeface) {
            szeVar.f215547y = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            szeVar.m79743i(false);
        }
        float textSize = this.f2261e.getTextSize();
        if (szeVar.f215535m != textSize) {
            szeVar.f215535m = textSize;
            szeVar.m79743i(false);
        }
        int gravity = this.f2261e.getGravity();
        szeVar.m79746l((gravity & (-113)) | 48);
        if (szeVar.f215533k != gravity) {
            szeVar.f215533k = gravity;
            szeVar.m79743i(false);
        }
        this.f2261e.addTextChangedListener(new wo5(this, 14));
        if (this.f2236T1 == null) {
            this.f2236T1 = this.f2261e.getHintTextColors();
        }
        if (this.f2259d1) {
            if (TextUtils.isEmpty(this.f2262e1)) {
                CharSequence hint = this.f2261e.getHint();
                this.f2264f = hint;
                setHint(hint);
                this.f2261e.setHint((CharSequence) null);
            }
            this.f2265f1 = true;
        }
        if (this.f2223N0 != null) {
            m1652n(this.f2261e.getText().length());
        }
        m1655q();
        this.f2273i.m62377b();
        this.f2252b.bringToFront();
        this.f2255c.bringToFront();
        this.f2258d.bringToFront();
        this.f2232R1.bringToFront();
        Iterator it = this.f2211D1.iterator();
        while (it.hasNext()) {
            ((rhe) it.next()).m75513a(this);
        }
        m1659u();
        m1662x();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m1657s(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.f2232R1.setVisibility(z ? 0 : 8);
        this.f2258d.setVisibility(z ? 8 : 0);
        m1662x();
        if (this.f2212E1 != 0) {
            return;
        }
        m1654p();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2262e1)) {
            return;
        }
        this.f2262e1 = charSequence;
        sze szeVar = this.f2266f2;
        if (charSequence == null || !TextUtils.equals(szeVar.f215490C, charSequence)) {
            szeVar.f215490C = charSequence;
            szeVar.f215491D = null;
            Bitmap bitmap = szeVar.f215494G;
            if (bitmap != null) {
                bitmap.recycle();
                szeVar.f215494G = null;
            }
            szeVar.m79743i(false);
        }
        if (this.f2263e2) {
            return;
        }
        m1649i();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f2231R0 == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f2233S0 = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            k9y k9yVar = new k9y();
            k9yVar.f279801c = 87L;
            LinearInterpolator linearInterpolator = r05.f194383a;
            k9yVar.f279802d = linearInterpolator;
            this.f2239V0 = k9yVar;
            k9yVar.f279800b = 67L;
            k9y k9yVar2 = new k9y();
            k9yVar2.f279801c = 87L;
            k9yVar2.f279802d = linearInterpolator;
            this.f2241W0 = k9yVar2;
            AppCompatTextView appCompatTextView2 = this.f2233S0;
            WeakHashMap weakHashMap = mec1.f142677a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.f2237U0);
            setPlaceholderTextColor(this.f2235T0);
            AppCompatTextView appCompatTextView3 = this.f2233S0;
            if (appCompatTextView3 != null) {
                this.f2249a.addView(appCompatTextView3);
                this.f2233S0.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView4 = this.f2233S0;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setVisibility(8);
            }
            this.f2233S0 = null;
        }
        this.f2231R0 = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m1642a(float f) {
        sze szeVar = this.f2266f2;
        if (szeVar.f215518c == f) {
            return;
        }
        if (this.f2275i2 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2275i2 = valueAnimator;
            valueAnimator.setInterpolator(r05.f194384b);
            this.f2275i2.setDuration(167L);
            this.f2275i2.addUpdateListener(new rx4(this, 21));
        }
        this.f2275i2.setFloatValues(szeVar.f215518c, f);
        this.f2275i2.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2249a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m1656r();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m1643b() {
        int i;
        int i2;
        int i3;
        n3d0 n3d0Var = this.f2268g1;
        if (n3d0Var == null) {
            return;
        }
        n3d0Var.setShapeAppearanceModel(this.f2274i1);
        if (this.f2278k1 == 2 && (i2 = this.f2281m1) > -1 && (i3 = this.f2284p1) != 0) {
            n3d0 n3d0Var2 = this.f2268g1;
            n3d0Var2.f150021a.f139602j = i2;
            n3d0Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            m3d0 m3d0Var = n3d0Var2.f150021a;
            if (m3d0Var.f139596d != colorStateListValueOf) {
                m3d0Var.f139596d = colorStateListValueOf;
                n3d0Var2.onStateChange(n3d0Var2.getState());
            }
        }
        int iM61221i = this.f2285q1;
        if (this.f2278k1 == 1) {
            iM61221i = m9f.m61221i(this.f2285q1, vtg1.m86386m(getContext(), R.attr.colorSurface, 0));
        }
        this.f2285q1 = iM61221i;
        this.f2268g1.m63601l(ColorStateList.valueOf(iM61221i));
        if (this.f2212E1 == 3) {
            this.f2261e.getBackground().invalidateSelf();
        }
        n3d0 n3d0Var3 = this.f2271h1;
        if (n3d0Var3 != null) {
            if (this.f2281m1 > -1 && (i = this.f2284p1) != 0) {
                n3d0Var3.m63601l(ColorStateList.valueOf(i));
            }
            invalidate();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final void m1644c() {
        m1639d(this.f2214G1, this.f2217J1, this.f2216I1, this.f2220L1, this.f2218K1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f2261e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2264f != null) {
            boolean z = this.f2265f1;
            this.f2265f1 = false;
            CharSequence hint = editText.getHint();
            this.f2261e.setHint(this.f2264f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f2261e.setHint(hint);
                this.f2265f1 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2249a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f2261e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2279k2 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2279k2 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2259d1) {
            this.f2266f2.m79739d(canvas);
        }
        n3d0 n3d0Var = this.f2271h1;
        if (n3d0Var != null) {
            Rect bounds = n3d0Var.getBounds();
            bounds.top = bounds.bottom - this.f2281m1;
            this.f2271h1.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.f2277j2) {
            return;
        }
        this.f2277j2 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        sze szeVar = this.f2266f2;
        if (szeVar != null) {
            szeVar.f215497J = drawableState;
            ColorStateList colorStateList2 = szeVar.f215538p;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = szeVar.f215537o) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                szeVar.m79743i(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.f2261e != null) {
            WeakHashMap weakHashMap = mec1.f142677a;
            m1657s(isLaidOut() && isEnabled(), false);
        }
        m1655q();
        m1664z();
        if (z) {
            invalidate();
        }
        this.f2277j2 = false;
    }

    /* JADX INFO: renamed from: e */
    public final int m1645e() {
        float fM79740e;
        if (!this.f2259d1) {
            return 0;
        }
        int i = this.f2278k1;
        sze szeVar = this.f2266f2;
        if (i == 0 || i == 1) {
            fM79740e = szeVar.m79740e();
        } else {
            if (i != 2) {
                return 0;
            }
            fM79740e = szeVar.m79740e() / 2.0f;
        }
        return (int) fM79740e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1646f() {
        return this.f2259d1 && !TextUtils.isEmpty(this.f2262e1) && (this.f2268g1 instanceof kdm);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1647g() {
        return this.f2258d.getVisibility() == 0 && this.f2214G1.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2261e;
        if (editText == null) {
            return super.getBaseline();
        }
        return m1645e() + getPaddingTop() + editText.getBaseline();
    }

    public n3d0 getBoxBackground() {
        int i = this.f2278k1;
        if (i == 1 || i == 2) {
            return this.f2268g1;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2285q1;
    }

    public int getBoxBackgroundMode() {
        return this.f2278k1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2280l1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        n3d0 n3d0Var = this.f2268g1;
        return n3d0Var.f150021a.f139593a.f48944h.mo40076a(n3d0Var.m63596g());
    }

    public float getBoxCornerRadiusBottomStart() {
        n3d0 n3d0Var = this.f2268g1;
        return n3d0Var.f150021a.f139593a.f48943g.mo40076a(n3d0Var.m63596g());
    }

    public float getBoxCornerRadiusTopEnd() {
        n3d0 n3d0Var = this.f2268g1;
        return n3d0Var.f150021a.f139593a.f48942f.mo40076a(n3d0Var.m63596g());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f2268g1.m63597h();
    }

    public int getBoxStrokeColor() {
        return this.f2244X1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2246Y1;
    }

    public int getBoxStrokeWidth() {
        return this.f2282n1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2283o1;
    }

    public int getCounterMaxLength() {
        return this.f2219L0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f2288t && this.f2221M0 && (appCompatTextView = this.f2223N0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2243X0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2243X0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2236T1;
    }

    public EditText getEditText() {
        return this.f2261e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2214G1.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2214G1.getDrawable();
    }

    public int getEndIconMode() {
        return this.f2212E1;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2214G1;
    }

    public CharSequence getError() {
        mo40 mo40Var = this.f2273i;
        if (mo40Var.f145580k) {
            return mo40Var.f145579j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2273i.f145582m;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f2273i.f145581l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2232R1.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        AppCompatTextView appCompatTextView = this.f2273i.f145581l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        mo40 mo40Var = this.f2273i;
        if (mo40Var.f145586q) {
            return mo40Var.f145585p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f2273i.f145587r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2259d1) {
            return this.f2262e1;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2266f2.m79740e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        sze szeVar = this.f2266f2;
        return szeVar.m79741f(szeVar.f215538p);
    }

    public ColorStateList getHintTextColor() {
        return this.f2238U1;
    }

    public int getMaxWidth() {
        return this.f2270h;
    }

    public int getMinWidth() {
        return this.f2267g;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2214G1.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2214G1.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2231R0) {
            return this.f2229Q0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2237U0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2235T0;
    }

    public CharSequence getPrefixText() {
        return this.f2247Z0;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2250a1.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2250a1;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2291v1.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2291v1.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f2253b1;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2256c1.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2256c1;
    }

    public Typeface getTypeface() {
        return this.f2290u1;
    }

    /* JADX INFO: renamed from: h */
    public final void m1648h() {
        int i = this.f2278k1;
        if (i != 0) {
            dh01 dh01Var = this.f2274i1;
            if (i == 1) {
                this.f2268g1 = new n3d0(dh01Var);
                this.f2271h1 = new n3d0();
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(klh.m56832d(this.f2278k1, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                }
                if (!this.f2259d1 || (this.f2268g1 instanceof kdm)) {
                    this.f2268g1 = new n3d0(dh01Var);
                } else {
                    this.f2268g1 = new kdm(dh01Var);
                }
                this.f2271h1 = null;
            }
        } else {
            this.f2268g1 = null;
            this.f2271h1 = null;
        }
        EditText editText = this.f2261e;
        if (editText != null && this.f2268g1 != null && editText.getBackground() == null && this.f2278k1 != 0) {
            EditText editText2 = this.f2261e;
            n3d0 n3d0Var = this.f2268g1;
            WeakHashMap weakHashMap = mec1.f142677a;
            editText2.setBackground(n3d0Var);
        }
        m1664z();
        if (this.f2278k1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2280l1 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (wtg1.m88951z(getContext())) {
                this.f2280l1 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2261e != null && this.f2278k1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.f2261e;
                WeakHashMap weakHashMap2 = mec1.f142677a;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.f2261e.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (wtg1.m88951z(getContext())) {
                EditText editText4 = this.f2261e;
                WeakHashMap weakHashMap3 = mec1.f142677a;
                editText4.setPaddingRelative(editText4.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.f2261e.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2278k1 != 0) {
            m1656r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX INFO: renamed from: i */
    public final void m1649i() {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        if (m1646f()) {
            int width = this.f2261e.getWidth();
            int gravity = this.f2261e.getGravity();
            sze szeVar = this.f2266f2;
            boolean zM79737b = szeVar.m79737b(szeVar.f215490C);
            szeVar.f215492E = zM79737b;
            Rect rect = szeVar.f215530i;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM79737b) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = szeVar.f215515a0;
                    }
                } else if (zM79737b) {
                    f = rect.right;
                    f2 = szeVar.f215515a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                RectF rectF = this.f2289t1;
                rectF.left = f3;
                float f6 = rect.top;
                rectF.top = f6;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (szeVar.f215515a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM79737b) {
                        f5 = szeVar.f215515a0;
                        f4 = f5 + f3;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (zM79737b) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = szeVar.f215515a0;
                    f4 = f5 + f3;
                }
                rectF.right = f4;
                rectF.bottom = szeVar.m79740e() + f6;
                float f7 = rectF.left;
                float f8 = this.f2276j1;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2281m1);
                kdm kdmVar = (kdm) this.f2268g1;
                kdmVar.getClass();
                kdmVar.m56176t(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = width / 2.0f;
            f2 = szeVar.f215515a0 / 2.0f;
            f3 = f - f2;
            RectF rectF2 = this.f2289t1;
            rectF2.left = f3;
            float f9 = rect.top;
            rectF2.top = f9;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (szeVar.f215515a0 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (szeVar.f215515a0 / 2.0f);
            }
            rectF2.right = f4;
            rectF2.bottom = szeVar.m79740e() + f9;
            float f10 = rectF2.left;
            float f11 = this.f2276j1;
            rectF2.left = f10 - f11;
            rectF2.right += f11;
            rectF2.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF2.height() / 2.0f)) + this.f2281m1);
            kdm kdmVar2 = (kdm) this.f2268g1;
            kdmVar2.getClass();
            kdmVar2.m56176t(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1650k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: m */
    public final void m1651m(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(R.color.design_error));
    }

    /* JADX INFO: renamed from: n */
    public final void m1652n(int i) {
        boolean z = this.f2221M0;
        int i2 = this.f2219L0;
        if (i2 == -1) {
            this.f2223N0.setText(String.valueOf(i));
            this.f2223N0.setContentDescription(null);
            this.f2221M0 = false;
        } else {
            this.f2221M0 = i > i2;
            Context context = getContext();
            this.f2223N0.setContentDescription(context.getString(this.f2221M0 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f2219L0)));
            if (z != this.f2221M0) {
                m1653o();
            }
            this.f2223N0.setText(yb9.m93255c().m93257e(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f2219L0))));
        }
        if (this.f2261e == null || z == this.f2221M0) {
            return;
        }
        m1657s(false, false);
        m1664z();
        m1655q();
    }

    /* JADX INFO: renamed from: o */
    public final void m1653o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f2223N0;
        if (appCompatTextView != null) {
            m1651m(appCompatTextView, this.f2221M0 ? this.f2225O0 : this.f2227P0);
            if (!this.f2221M0 && (colorStateList2 = this.f2243X0) != null) {
                this.f2223N0.setTextColor(colorStateList2);
            }
            if (!this.f2221M0 || (colorStateList = this.f2245Y0) == null) {
                return;
            }
            this.f2223N0.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f2261e;
        if (editText != null) {
            Rect rect = this.f2286r1;
            ttq.m81535a(this, editText, rect);
            n3d0 n3d0Var = this.f2271h1;
            if (n3d0Var != null) {
                int i5 = rect.bottom;
                n3d0Var.setBounds(rect.left, i5 - this.f2283o1, rect.right, i5);
            }
            if (this.f2259d1) {
                float textSize = this.f2261e.getTextSize();
                sze szeVar = this.f2266f2;
                if (szeVar.f215535m != textSize) {
                    szeVar.f215535m = textSize;
                    szeVar.m79743i(false);
                }
                int gravity = this.f2261e.getGravity();
                szeVar.m79746l((gravity & (-113)) | 48);
                if (szeVar.f215533k != gravity) {
                    szeVar.f215533k = gravity;
                    szeVar.m79743i(false);
                }
                if (this.f2261e == null) {
                    throw new IllegalStateException();
                }
                WeakHashMap weakHashMap = mec1.f142677a;
                boolean z2 = getLayoutDirection() == 1;
                int i6 = rect.bottom;
                Rect rect2 = this.f2287s1;
                rect2.bottom = i6;
                int i7 = this.f2278k1;
                AppCompatTextView appCompatTextView = this.f2250a1;
                if (i7 == 1) {
                    int compoundPaddingLeft = this.f2261e.getCompoundPaddingLeft() + rect.left;
                    if (this.f2247Z0 != null && !z2) {
                        compoundPaddingLeft = (compoundPaddingLeft - appCompatTextView.getMeasuredWidth()) + appCompatTextView.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft;
                    rect2.top = rect.top + this.f2280l1;
                    int compoundPaddingRight = rect.right - this.f2261e.getCompoundPaddingRight();
                    if (this.f2247Z0 != null && z2) {
                        compoundPaddingRight += appCompatTextView.getMeasuredWidth() - appCompatTextView.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight;
                } else if (i7 != 2) {
                    int compoundPaddingLeft2 = this.f2261e.getCompoundPaddingLeft() + rect.left;
                    if (this.f2247Z0 != null && !z2) {
                        compoundPaddingLeft2 = (compoundPaddingLeft2 - appCompatTextView.getMeasuredWidth()) + appCompatTextView.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft2;
                    rect2.top = getPaddingTop();
                    int compoundPaddingRight2 = rect.right - this.f2261e.getCompoundPaddingRight();
                    if (this.f2247Z0 != null && z2) {
                        compoundPaddingRight2 += appCompatTextView.getMeasuredWidth() - appCompatTextView.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight2;
                } else {
                    rect2.left = this.f2261e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m1645e();
                    rect2.right = rect.right - this.f2261e.getPaddingRight();
                }
                int i8 = rect2.left;
                int i9 = rect2.top;
                int i10 = rect2.right;
                int i11 = rect2.bottom;
                Rect rect3 = szeVar.f215530i;
                if (rect3.left != i8 || rect3.top != i9 || rect3.right != i10 || rect3.bottom != i11) {
                    rect3.set(i8, i9, i10, i11);
                    szeVar.f215498K = true;
                    szeVar.m79742h();
                }
                if (this.f2261e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = szeVar.f215500M;
                textPaint.setTextSize(szeVar.f215535m);
                textPaint.setTypeface(szeVar.f215547y);
                textPaint.setLetterSpacing(szeVar.f215512Y);
                float f = -textPaint.ascent();
                rect2.left = this.f2261e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2278k1 != 1 || this.f2261e.getMinLines() > 1) ? rect.top + this.f2261e.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f2261e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2278k1 != 1 || this.f2261e.getMinLines() > 1) ? rect.bottom - this.f2261e.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i12 = rect2.left;
                int i13 = rect2.top;
                int i14 = rect2.right;
                Rect rect4 = szeVar.f215528h;
                if (rect4.left != i12 || rect4.top != i13 || rect4.right != i14 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i12, i13, i14, compoundPaddingBottom);
                    szeVar.f215498K = true;
                    szeVar.m79742h();
                }
                szeVar.m79743i(false);
                if (!m1646f() || this.f2263e2) {
                    return;
                }
                m1649i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f2261e != null && this.f2261e.getMeasuredHeight() < (iMax = Math.max(this.f2255c.getMeasuredHeight(), this.f2252b.getMeasuredHeight()))) {
            this.f2261e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM1654p = m1654p();
        if (z || zM1654p) {
            this.f2261e.post(new ea71(this, 1));
        }
        if (this.f2233S0 != null && (editText = this.f2261e) != null) {
            this.f2233S0.setGravity(editText.getGravity());
            this.f2233S0.setPadding(this.f2261e.getCompoundPaddingLeft(), this.f2261e.getCompoundPaddingTop(), this.f2261e.getCompoundPaddingRight(), this.f2261e.getCompoundPaddingBottom());
        }
        m1659u();
        m1662x();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ga71)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ga71 ga71Var = (ga71) parcelable;
        super.onRestoreInstanceState(ga71Var.f161807a);
        setError(ga71Var.f77993c);
        if (ga71Var.f77994d) {
            this.f2214G1.post(new ea71(this, 0));
        }
        setHint(ga71Var.f77995e);
        setHelperText(ga71Var.f77996f);
        setPlaceholderText(ga71Var.f77997g);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ga71 ga71Var = new ga71(super.onSaveInstanceState());
        if (this.f2273i.m62380e()) {
            ga71Var.f77993c = getError();
        }
        ga71Var.f77994d = this.f2212E1 != 0 && this.f2214G1.f2144d;
        ga71Var.f77995e = getHint();
        ga71Var.f77996f = getHelperText();
        ga71Var.f77997g = getPlaceholderText();
        return ga71Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX INFO: renamed from: p */
    public final boolean m1654p() {
        boolean z;
        if (this.f2261e == null) {
            return false;
        }
        boolean z2 = true;
        if (getStartIconDrawable() != null || this.f2247Z0 != null) {
            LinearLayout linearLayout = this.f2252b;
            if (linearLayout.getMeasuredWidth() > 0) {
                int measuredWidth = linearLayout.getMeasuredWidth() - this.f2261e.getPaddingLeft();
                if (this.f2208A1 == null || this.f2209B1 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f2208A1 = colorDrawable;
                    this.f2209B1 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f2261e.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f2208A1;
                if (drawable != colorDrawable2) {
                    this.f2261e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.f2208A1 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f2261e.getCompoundDrawablesRelative();
                this.f2261e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f2208A1 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f2208A1 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f2261e.getCompoundDrawablesRelative();
            this.f2261e.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f2208A1 = null;
            z = true;
        } else {
            z = false;
        }
        if ((this.f2232R1.getVisibility() == 0 || ((this.f2212E1 != 0 && m1647g()) || this.f2253b1 != null)) && this.f2255c.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f2256c1.getMeasuredWidth() - this.f2261e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f2261e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f2222M1;
            if (colorDrawable3 != null && this.f2224N1 != measuredWidth2) {
                this.f2224N1 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f2261e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f2222M1, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f2222M1 = colorDrawable4;
                this.f2224N1 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f2222M1;
            if (drawable2 != colorDrawable5) {
                this.f2226O1 = drawable2;
                this.f2261e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f2222M1 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f2261e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f2222M1) {
                this.f2261e.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f2226O1, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.f2222M1 = null;
            return z2;
        }
        return z;
    }

    /* JADX INFO: renamed from: q */
    public final void m1655q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f2261e;
        if (editText == null || this.f2278k1 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = cgs.f37782a;
        Drawable drawableMutate = background.mutate();
        mo40 mo40Var = this.f2273i;
        if (mo40Var.m62380e()) {
            AppCompatTextView appCompatTextView2 = mo40Var.f145581l;
            drawableMutate.setColorFilter(p65.m69178c(appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.f2221M0 && (appCompatTextView = this.f2223N0) != null) {
            drawableMutate.setColorFilter(p65.m69178c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f2261e.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1656r() {
        if (this.f2278k1 != 1) {
            FrameLayout frameLayout = this.f2249a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM1645e = m1645e();
            if (iM1645e != layoutParams.topMargin) {
                layoutParams.topMargin = iM1645e;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1657s(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f2261e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2261e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        mo40 mo40Var = this.f2273i;
        boolean zM62380e = mo40Var.m62380e();
        ColorStateList colorStateList2 = this.f2236T1;
        sze szeVar = this.f2266f2;
        if (colorStateList2 != null) {
            szeVar.m79745k(colorStateList2);
            ColorStateList colorStateList3 = this.f2236T1;
            if (szeVar.f215537o != colorStateList3) {
                szeVar.f215537o = colorStateList3;
                szeVar.m79743i(false);
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.f2236T1;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.f2260d2) : this.f2260d2;
            szeVar.m79745k(ColorStateList.valueOf(colorForState));
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (szeVar.f215537o != colorStateListValueOf) {
                szeVar.f215537o = colorStateListValueOf;
                szeVar.m79743i(false);
            }
        } else if (zM62380e) {
            AppCompatTextView appCompatTextView2 = mo40Var.f145581l;
            szeVar.m79745k(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f2221M0 && (appCompatTextView = this.f2223N0) != null) {
            szeVar.m79745k(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.f2238U1) != null) {
            szeVar.m79745k(colorStateList);
        }
        if (z3 || !this.f2269g2 || (isEnabled() && z4)) {
            if (z2 || this.f2263e2) {
                ValueAnimator valueAnimator = this.f2275i2;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2275i2.cancel();
                }
                if (z && this.f2272h2) {
                    m1642a(1.0f);
                } else {
                    szeVar.m79748n(1.0f);
                }
                this.f2263e2 = false;
                if (m1646f()) {
                    m1649i();
                }
                EditText editText3 = this.f2261e;
                m1658t(editText3 != null ? editText3.getText().length() : 0);
                m1660v();
                m1663y();
                return;
            }
            return;
        }
        if (z2 || !this.f2263e2) {
            ValueAnimator valueAnimator2 = this.f2275i2;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2275i2.cancel();
            }
            if (z && this.f2272h2) {
                m1642a(0.0f);
            } else {
                szeVar.m79748n(0.0f);
            }
            if (m1646f() && !((kdm) this.f2268g1).f121695W0.isEmpty() && m1646f()) {
                ((kdm) this.f2268g1).m56176t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2263e2 = true;
            AppCompatTextView appCompatTextView3 = this.f2233S0;
            if (appCompatTextView3 != null && this.f2231R0) {
                appCompatTextView3.setText((CharSequence) null);
                o891.m66421a(this.f2249a, this.f2241W0);
                this.f2233S0.setVisibility(4);
            }
            m1660v();
            m1663y();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2285q1 != i) {
            this.f2285q1 = i;
            this.f2248Z1 = i;
            this.f2254b2 = i;
            this.f2257c2 = i;
            m1643b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2248Z1 = defaultColor;
        this.f2285q1 = defaultColor;
        this.f2251a2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2254b2 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.f2257c2 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        m1643b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2278k1) {
            return;
        }
        this.f2278k1 = i;
        if (this.f2261e != null) {
            m1648h();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2280l1 = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2244X1 != i) {
            this.f2244X1 = i;
            m1664z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2240V1 = colorStateList.getDefaultColor();
            this.f2260d2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2242W1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.f2244X1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.f2244X1 != colorStateList.getDefaultColor()) {
            this.f2244X1 = colorStateList.getDefaultColor();
        }
        m1664z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2246Y1 != colorStateList) {
            this.f2246Y1 = colorStateList;
            m1664z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2282n1 = i;
        m1664z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2283o1 = i;
        m1664z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f2288t != z) {
            mo40 mo40Var = this.f2273i;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f2223N0 = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f2290u1;
                if (typeface != null) {
                    this.f2223N0.setTypeface(typeface);
                }
                this.f2223N0.setMaxLines(1);
                mo40Var.m62376a(this.f2223N0, 2);
                ((ViewGroup.MarginLayoutParams) this.f2223N0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m1653o();
                if (this.f2223N0 != null) {
                    EditText editText = this.f2261e;
                    m1652n(editText == null ? 0 : editText.getText().length());
                }
            } else {
                mo40Var.m62383h(this.f2223N0, 2);
                this.f2223N0 = null;
            }
            this.f2288t = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2219L0 != i) {
            if (i > 0) {
                this.f2219L0 = i;
            } else {
                this.f2219L0 = -1;
            }
            if (!this.f2288t || this.f2223N0 == null) {
                return;
            }
            EditText editText = this.f2261e;
            m1652n(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2225O0 != i) {
            this.f2225O0 = i;
            m1653o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2245Y0 != colorStateList) {
            this.f2245Y0 = colorStateList;
            m1653o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2227P0 != i) {
            this.f2227P0 = i;
            m1653o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2243X0 != colorStateList) {
            this.f2243X0 = colorStateList;
            m1653o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2236T1 = colorStateList;
        this.f2238U1 = colorStateList;
        if (this.f2261e != null) {
            m1657s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m1640j(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f2214G1.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f2214G1.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? ihf1.m50639w(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f2212E1;
        this.f2212E1 = i;
        for (she sheVar : this.f2215H1) {
            switch (sheVar.f209185a) {
                case 0:
                    vhe vheVar = (vhe) sheVar.f209186b;
                    CheckableImageButton checkableImageButton = vheVar.f257281c;
                    y28 y28Var = vheVar.f241497f;
                    EditText editText = getEditText();
                    if (editText != null && i2 == 2) {
                        editText.post(new lk00(sheVar, editText, false, 9));
                        if (editText.getOnFocusChangeListener() == y28Var) {
                            editText.setOnFocusChangeListener(null);
                        }
                        if (checkableImageButton.getOnFocusChangeListener() == y28Var) {
                            checkableImageButton.setOnFocusChangeListener(null);
                        }
                    }
                    break;
                case 1:
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                    if (autoCompleteTextView != null && i2 == 3) {
                        autoCompleteTextView.post(new lk00(sheVar, autoCompleteTextView, false, 18));
                        if (autoCompleteTextView.getOnFocusChangeListener() == ((kis) sheVar.f209186b).f123079f) {
                            autoCompleteTextView.setOnFocusChangeListener(null);
                        }
                        autoCompleteTextView.setOnTouchListener(null);
                        autoCompleteTextView.setOnDismissListener(null);
                    }
                    break;
                default:
                    EditText editText2 = getEditText();
                    if (editText2 != null && i2 == 1) {
                        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        editText2.post(new uod0(sheVar, editText2, false, 7));
                    }
                    break;
            }
        }
        setEndIconVisible(i != 0);
        if (!getEndIconDelegate().mo56526b(this.f2278k1)) {
            throw new IllegalStateException("The current box background mode " + this.f2278k1 + " is not supported by the end icon mode " + i);
        }
        getEndIconDelegate().mo25262a();
        m1644c();
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f2228P1;
        CheckableImageButton checkableImageButton = this.f2214G1;
        checkableImageButton.setOnClickListener(onClickListener);
        m1641l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2228P1 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2214G1;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1641l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f2216I1 != colorStateList) {
            this.f2216I1 = colorStateList;
            this.f2217J1 = true;
            m1644c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f2218K1 != mode) {
            this.f2218K1 = mode;
            this.f2220L1 = true;
            m1644c();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m1647g() != z) {
            this.f2214G1.setVisibility(z ? 0 : 8);
            m1662x();
            m1654p();
        }
    }

    public void setError(CharSequence charSequence) {
        mo40 mo40Var = this.f2273i;
        if (!mo40Var.f145580k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            mo40Var.m62382g();
            return;
        }
        mo40Var.m62378c();
        mo40Var.f145579j = charSequence;
        mo40Var.f145581l.setText(charSequence);
        int i = mo40Var.f145577h;
        if (i != 1) {
            mo40Var.f145578i = 1;
        }
        mo40Var.m62385j(i, mo40Var.f145578i, mo40Var.m62384i(mo40Var.f145581l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        mo40 mo40Var = this.f2273i;
        mo40Var.f145582m = charSequence;
        AppCompatTextView appCompatTextView = mo40Var.f145581l;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        mo40 mo40Var = this.f2273i;
        TextInputLayout textInputLayout = mo40Var.f145571b;
        if (mo40Var.f145580k == z) {
            return;
        }
        mo40Var.m62378c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(mo40Var.f145570a);
            mo40Var.f145581l = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            mo40Var.f145581l.setTextAlignment(5);
            Typeface typeface = mo40Var.f145590u;
            if (typeface != null) {
                mo40Var.f145581l.setTypeface(typeface);
            }
            int i = mo40Var.f145583n;
            mo40Var.f145583n = i;
            AppCompatTextView appCompatTextView2 = mo40Var.f145581l;
            if (appCompatTextView2 != null) {
                mo40Var.f145571b.m1651m(appCompatTextView2, i);
            }
            ColorStateList colorStateList = mo40Var.f145584o;
            mo40Var.f145584o = colorStateList;
            AppCompatTextView appCompatTextView3 = mo40Var.f145581l;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = mo40Var.f145582m;
            mo40Var.f145582m = charSequence;
            AppCompatTextView appCompatTextView4 = mo40Var.f145581l;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            mo40Var.f145581l.setVisibility(4);
            AppCompatTextView appCompatTextView5 = mo40Var.f145581l;
            WeakHashMap weakHashMap = mec1.f142677a;
            appCompatTextView5.setAccessibilityLiveRegion(1);
            mo40Var.m62376a(mo40Var.f145581l, 0);
        } else {
            mo40Var.m62382g();
            mo40Var.m62383h(mo40Var.f145581l, 0);
            mo40Var.f145581l = null;
            textInputLayout.m1655q();
            textInputLayout.m1664z();
        }
        mo40Var.f145580k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? ihf1.m50639w(getContext(), i) : null);
        m1650k(this.f2232R1, this.f2234S1);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f2230Q1;
        CheckableImageButton checkableImageButton = this.f2232R1;
        checkableImageButton.setOnClickListener(onClickListener);
        m1641l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2230Q1 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2232R1;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1641l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f2234S1 = colorStateList;
        CheckableImageButton checkableImageButton = this.f2232R1;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.f2232R1;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        mo40 mo40Var = this.f2273i;
        mo40Var.f145583n = i;
        AppCompatTextView appCompatTextView = mo40Var.f145581l;
        if (appCompatTextView != null) {
            mo40Var.f145571b.m1651m(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        mo40 mo40Var = this.f2273i;
        mo40Var.f145584o = colorStateList;
        AppCompatTextView appCompatTextView = mo40Var.f145581l;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f2269g2 != z) {
            this.f2269g2 = z;
            m1657s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        mo40 mo40Var = this.f2273i;
        if (zIsEmpty) {
            if (mo40Var.f145586q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!mo40Var.f145586q) {
            setHelperTextEnabled(true);
        }
        mo40Var.m62378c();
        mo40Var.f145585p = charSequence;
        mo40Var.f145587r.setText(charSequence);
        int i = mo40Var.f145577h;
        if (i != 2) {
            mo40Var.f145578i = 2;
        }
        mo40Var.m62385j(i, mo40Var.f145578i, mo40Var.m62384i(mo40Var.f145587r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        mo40 mo40Var = this.f2273i;
        mo40Var.f145589t = colorStateList;
        AppCompatTextView appCompatTextView = mo40Var.f145587r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        mo40 mo40Var = this.f2273i;
        TextInputLayout textInputLayout = mo40Var.f145571b;
        if (mo40Var.f145586q == z) {
            return;
        }
        mo40Var.m62378c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(mo40Var.f145570a);
            mo40Var.f145587r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            mo40Var.f145587r.setTextAlignment(5);
            Typeface typeface = mo40Var.f145590u;
            if (typeface != null) {
                mo40Var.f145587r.setTypeface(typeface);
            }
            mo40Var.f145587r.setVisibility(4);
            AppCompatTextView appCompatTextView2 = mo40Var.f145587r;
            WeakHashMap weakHashMap = mec1.f142677a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i = mo40Var.f145588s;
            mo40Var.f145588s = i;
            AppCompatTextView appCompatTextView3 = mo40Var.f145587r;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = mo40Var.f145589t;
            mo40Var.f145589t = colorStateList;
            AppCompatTextView appCompatTextView4 = mo40Var.f145587r;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            mo40Var.m62376a(mo40Var.f145587r, 1);
        } else {
            mo40Var.m62378c();
            int i2 = mo40Var.f145577h;
            if (i2 == 2) {
                mo40Var.f145578i = 0;
            }
            mo40Var.m62385j(i2, mo40Var.f145578i, mo40Var.m62384i(mo40Var.f145587r, null));
            mo40Var.m62383h(mo40Var.f145587r, 1);
            mo40Var.f145587r = null;
            textInputLayout.m1655q();
            textInputLayout.m1664z();
        }
        mo40Var.f145586q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        mo40 mo40Var = this.f2273i;
        mo40Var.f145588s = i;
        AppCompatTextView appCompatTextView = mo40Var.f145587r;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2259d1) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f2272h2 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f2259d1) {
            this.f2259d1 = z;
            if (z) {
                CharSequence hint = this.f2261e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2262e1)) {
                        setHint(hint);
                    }
                    this.f2261e.setHint((CharSequence) null);
                }
                this.f2265f1 = true;
            } else {
                this.f2265f1 = false;
                if (!TextUtils.isEmpty(this.f2262e1) && TextUtils.isEmpty(this.f2261e.getHint())) {
                    this.f2261e.setHint(this.f2262e1);
                }
                setHintInternal(null);
            }
            if (this.f2261e != null) {
                m1656r();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        sze szeVar = this.f2266f2;
        szeVar.m79744j(i);
        this.f2238U1 = szeVar.f215538p;
        if (this.f2261e != null) {
            m1657s(false, false);
            m1656r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2238U1 != colorStateList) {
            if (this.f2236T1 == null) {
                this.f2266f2.m79745k(colorStateList);
            }
            this.f2238U1 = colorStateList;
            if (this.f2261e != null) {
                m1657s(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.f2270h = i;
        EditText editText = this.f2261e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.f2267g = i;
        EditText editText = this.f2261e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? ihf1.m50639w(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f2212E1 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f2216I1 = colorStateList;
        this.f2217J1 = true;
        m1644c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f2218K1 = mode;
        this.f2220L1 = true;
        m1644c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2231R0 && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2231R0) {
                setPlaceholderTextEnabled(true);
            }
            this.f2229Q0 = charSequence;
        }
        EditText editText = this.f2261e;
        m1658t(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2237U0 = i;
        AppCompatTextView appCompatTextView = this.f2233S0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2235T0 != colorStateList) {
            this.f2235T0 = colorStateList;
            AppCompatTextView appCompatTextView = this.f2233S0;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f2247Z0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f2250a1.setText(charSequence);
        m1660v();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2250a1.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2250a1.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f2291v1.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? ihf1.m50639w(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f2210C1;
        CheckableImageButton checkableImageButton = this.f2291v1;
        checkableImageButton.setOnClickListener(onClickListener);
        m1641l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2210C1 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2291v1;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1641l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f2292w1 != colorStateList) {
            this.f2292w1 = colorStateList;
            this.f2293x1 = true;
            m1639d(this.f2291v1, true, colorStateList, this.f2295z1, this.f2294y1);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f2294y1 != mode) {
            this.f2294y1 = mode;
            this.f2295z1 = true;
            m1639d(this.f2291v1, this.f2293x1, this.f2292w1, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton = this.f2291v1;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m1659u();
            m1654p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f2253b1 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f2256c1.setText(charSequence);
        m1663y();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2256c1.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2256c1.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(fa71 fa71Var) {
        EditText editText = this.f2261e;
        if (editText != null) {
            mec1.m61564p(editText, fa71Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z;
        if (typeface != this.f2290u1) {
            this.f2290u1 = typeface;
            sze szeVar = this.f2266f2;
            zpb zpbVar = szeVar.f215489B;
            boolean z2 = true;
            if (zpbVar != null) {
                zpbVar.f285086e = true;
            }
            if (szeVar.f215546x != typeface) {
                szeVar.f215546x = typeface;
                z = true;
            } else {
                z = false;
            }
            zpb zpbVar2 = szeVar.f215488A;
            if (zpbVar2 != null) {
                zpbVar2.f285086e = true;
            }
            if (szeVar.f215547y != typeface) {
                szeVar.f215547y = typeface;
            } else {
                z2 = false;
            }
            if (z || z2) {
                szeVar.m79743i(false);
            }
            mo40 mo40Var = this.f2273i;
            if (typeface != mo40Var.f145590u) {
                mo40Var.f145590u = typeface;
                AppCompatTextView appCompatTextView = mo40Var.f145581l;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = mo40Var.f145587r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f2223N0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m1658t(int i) {
        FrameLayout frameLayout = this.f2249a;
        if (i != 0 || this.f2263e2) {
            AppCompatTextView appCompatTextView = this.f2233S0;
            if (appCompatTextView == null || !this.f2231R0) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            o891.m66421a(frameLayout, this.f2241W0);
            this.f2233S0.setVisibility(4);
            return;
        }
        AppCompatTextView appCompatTextView2 = this.f2233S0;
        if (appCompatTextView2 == null || !this.f2231R0) {
            return;
        }
        appCompatTextView2.setText(this.f2229Q0);
        o891.m66421a(frameLayout, this.f2239V0);
        this.f2233S0.setVisibility(0);
        this.f2233S0.bringToFront();
    }

    /* JADX INFO: renamed from: u */
    public final void m1659u() {
        int paddingStart;
        if (this.f2261e == null) {
            return;
        }
        if (this.f2291v1.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.f2261e;
            WeakHashMap weakHashMap = mec1.f142677a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = this.f2261e.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.f2261e.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = mec1.f142677a;
        this.f2250a1.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: v */
    public final void m1660v() {
        this.f2250a1.setVisibility((this.f2247Z0 == null || this.f2263e2) ? 8 : 0);
        m1654p();
    }

    /* JADX INFO: renamed from: w */
    public final void m1661w(boolean z, boolean z2) {
        int defaultColor = this.f2246Y1.getDefaultColor();
        int colorForState = this.f2246Y1.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2246Y1.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f2284p1 = colorForState2;
        } else if (z2) {
            this.f2284p1 = colorForState;
        } else {
            this.f2284p1 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1662x() {
        int paddingEnd;
        if (this.f2261e == null) {
            return;
        }
        if (m1647g() || this.f2232R1.getVisibility() == 0) {
            paddingEnd = 0;
        } else {
            EditText editText = this.f2261e;
            WeakHashMap weakHashMap = mec1.f142677a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f2261e.getPaddingTop();
        int paddingBottom = this.f2261e.getPaddingBottom();
        WeakHashMap weakHashMap2 = mec1.f142677a;
        this.f2256c1.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: y */
    public final void m1663y() {
        AppCompatTextView appCompatTextView = this.f2256c1;
        int visibility = appCompatTextView.getVisibility();
        boolean z = (this.f2253b1 == null || this.f2263e2) ? false : true;
        appCompatTextView.setVisibility(z ? 0 : 8);
        if (visibility != appCompatTextView.getVisibility()) {
            getEndIconDelegate().mo85524c(z);
        }
        m1654p();
    }

    /* JADX INFO: renamed from: z */
    public final void m1664z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f2268g1 == null || this.f2278k1 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f2261e) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f2261e) != null && editText.isHovered());
        boolean zIsEnabled = isEnabled();
        mo40 mo40Var = this.f2273i;
        if (!zIsEnabled) {
            this.f2284p1 = this.f2260d2;
        } else if (mo40Var.m62380e()) {
            if (this.f2246Y1 != null) {
                m1661w(z2, z3);
            } else {
                AppCompatTextView appCompatTextView2 = mo40Var.f145581l;
                this.f2284p1 = appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1;
            }
        } else if (!this.f2221M0 || (appCompatTextView = this.f2223N0) == null) {
            if (z2) {
                this.f2284p1 = this.f2244X1;
            } else if (z3) {
                this.f2284p1 = this.f2242W1;
            } else {
                this.f2284p1 = this.f2240V1;
            }
        } else if (this.f2246Y1 != null) {
            m1661w(z2, z3);
        } else {
            this.f2284p1 = appCompatTextView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && mo40Var.f145580k && mo40Var.m62380e()) {
            z = true;
        }
        setErrorIconVisible(z);
        m1650k(this.f2232R1, this.f2234S1);
        m1650k(this.f2291v1, this.f2292w1);
        ColorStateList colorStateList = this.f2216I1;
        CheckableImageButton checkableImageButton = this.f2214G1;
        m1650k(checkableImageButton, colorStateList);
        x1v endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof kis) {
            if (!mo40Var.m62380e() || getEndIconDrawable() == null) {
                m1644c();
            } else {
                Drawable drawableMutate = getEndIconDrawable().mutate();
                AppCompatTextView appCompatTextView3 = mo40Var.f145581l;
                drawableMutate.setTint(appCompatTextView3 != null ? appCompatTextView3.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        int i = this.f2281m1;
        if (z2 && isEnabled()) {
            this.f2281m1 = this.f2283o1;
        } else {
            this.f2281m1 = this.f2282n1;
        }
        if (this.f2281m1 != i && this.f2278k1 == 2 && m1646f() && !this.f2263e2) {
            if (m1646f()) {
                ((kdm) this.f2268g1).m56176t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            m1649i();
        }
        if (this.f2278k1 == 1) {
            if (!isEnabled()) {
                this.f2285q1 = this.f2251a2;
            } else if (z3 && !z2) {
                this.f2285q1 = this.f2257c2;
            } else if (z2) {
                this.f2285q1 = this.f2254b2;
            } else {
                this.f2285q1 = this.f2248Z1;
            }
        }
        m1643b();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f2214G1.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2214G1;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            m1644c();
            m1650k(checkableImageButton, this.f2216I1);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f2291v1.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2291v1;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            m1639d(checkableImageButton, this.f2293x1, this.f2292w1, this.f2295z1, this.f2294y1);
            setStartIconVisible(true);
            m1650k(checkableImageButton, this.f2292w1);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        super(vgg1.m85455K(context, attributeSet, i, R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.f2267g = -1;
        this.f2270h = -1;
        this.f2273i = new mo40(this);
        this.f2286r1 = new Rect();
        this.f2287s1 = new Rect();
        this.f2289t1 = new RectF();
        this.f2211D1 = new LinkedHashSet();
        this.f2212E1 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f2213F1 = sparseArray;
        this.f2215H1 = new LinkedHashSet();
        sze szeVar = new sze(this);
        this.f2266f2 = szeVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2249a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f2252b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f2255c = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f2258d = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = r05.f194383a;
        szeVar.f215502O = linearInterpolator;
        szeVar.m79743i(false);
        szeVar.f215501N = linearInterpolator;
        szeVar.m79743i(false);
        szeVar.m79746l(8388659);
        bcg1.m28727h(context2, attributeSet, i, R.style.Widget_Design_TextInputLayout);
        int[] iArr = h1u0.f86725N;
        bcg1.m28728i(context2, attributeSet, iArr, i, R.style.Widget_Design_TextInputLayout, 20, 18, 33, 38, 42);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Design_TextInputLayout);
        cx21 cx21Var = new cx21(28, context2, typedArrayObtainStyledAttributes);
        this.f2259d1 = typedArrayObtainStyledAttributes.getBoolean(41, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f2272h2 = typedArrayObtainStyledAttributes.getBoolean(40, true);
        this.f2269g2 = typedArrayObtainStyledAttributes.getBoolean(35, true);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        dh01 dh01VarM74257d = dh01.m35958b(context2, attributeSet, i, R.style.Widget_Design_TextInputLayout).m74257d();
        this.f2274i1 = dh01VarM74257d;
        this.f2276j1 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2280l1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
        this.f2282n1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2283o1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2281m1 = this.f2282n1;
        float dimension = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(8, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(9, -1.0f);
        fem femVar = dh01VarM74257d.f48937a;
        fem femVar2 = dh01VarM74257d.f48938b;
        fem femVar3 = dh01VarM74257d.f48939c;
        fem femVar4 = dh01VarM74257d.f48940d;
        euk eukVar = dh01VarM74257d.f48941e;
        euk eukVar2 = dh01VarM74257d.f48942f;
        euk eukVar3 = dh01VarM74257d.f48943g;
        euk eukVar4 = dh01VarM74257d.f48944h;
        crs crsVar = dh01VarM74257d.f48945i;
        crs crsVar2 = dh01VarM74257d.f48946j;
        crs crsVar3 = dh01VarM74257d.f48947k;
        crs crsVar4 = dh01VarM74257d.f48948l;
        euk c2281q5 = dimension >= 0.0f ? new C2281q5(dimension) : eukVar;
        euk c2281q6 = dimension2 >= 0.0f ? new C2281q5(dimension2) : eukVar2;
        euk c2281q7 = dimension3 >= 0.0f ? new C2281q5(dimension3) : eukVar3;
        euk c2281q8 = dimension4 >= 0.0f ? new C2281q5(dimension4) : eukVar4;
        dh01 dh01Var = new dh01();
        dh01Var.f48937a = femVar;
        dh01Var.f48938b = femVar2;
        dh01Var.f48939c = femVar3;
        dh01Var.f48940d = femVar4;
        dh01Var.f48941e = c2281q5;
        dh01Var.f48942f = c2281q6;
        dh01Var.f48943g = c2281q7;
        dh01Var.f48944h = c2281q8;
        dh01Var.f48945i = crsVar;
        dh01Var.f48946j = crsVar2;
        dh01Var.f48947k = crsVar3;
        dh01Var.f48948l = crsVar4;
        this.f2274i1 = dh01Var;
        ColorStateList colorStateListM88943r = wtg1.m88943r(context2, cx21Var, 5);
        if (colorStateListM88943r != null) {
            int defaultColor = colorStateListM88943r.getDefaultColor();
            this.f2248Z1 = defaultColor;
            this.f2285q1 = defaultColor;
            if (colorStateListM88943r.isStateful()) {
                this.f2251a2 = colorStateListM88943r.getColorForState(new int[]{-16842910}, -1);
                this.f2254b2 = colorStateListM88943r.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.f2257c2 = colorStateListM88943r.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.f2254b2 = this.f2248Z1;
                ColorStateList colorStateListM60387w = lzj.m60387w(context2, R.color.mtrl_filled_background_color);
                this.f2251a2 = colorStateListM60387w.getColorForState(new int[]{-16842910}, -1);
                this.f2257c2 = colorStateListM60387w.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
            i3 = 1;
            i2 = 0;
        } else {
            i2 = 0;
            this.f2285q1 = 0;
            this.f2248Z1 = 0;
            this.f2251a2 = 0;
            this.f2254b2 = 0;
            this.f2257c2 = 0;
            i3 = 1;
        }
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            ColorStateList colorStateListM34198g = cx21Var.m34198g(i3);
            this.f2238U1 = colorStateListM34198g;
            this.f2236T1 = colorStateListM34198g;
        }
        ColorStateList colorStateListM88943r2 = wtg1.m88943r(context2, cx21Var, 12);
        this.f2244X1 = typedArrayObtainStyledAttributes.getColor(12, i2);
        this.f2240V1 = context2.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.f2260d2 = context2.getColor(R.color.mtrl_textinput_disabled_color);
        this.f2242W1 = context2.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM88943r2 != null) {
            setBoxStrokeColorStateList(colorStateListM88943r2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            setBoxStrokeErrorColor(wtg1.m88943r(context2, cx21Var, 13));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(42, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(42, 0));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(33, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(28);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(29, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.f2232R1 = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (wtg1.m88951z(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            setErrorIconDrawable(cx21Var.m34202l(30));
        }
        if (typedArrayObtainStyledAttributes.hasValue(31)) {
            setErrorIconTintList(wtg1.m88943r(context2, cx21Var, 31));
        }
        if (typedArrayObtainStyledAttributes.hasValue(32)) {
            setErrorIconTintMode(bga.m29072O(typedArrayObtainStyledAttributes.getInt(32, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = mec1.f142677a;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(38, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(37, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(36);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(50, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(49);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(53, 0);
        CharSequence text4 = typedArrayObtainStyledAttributes.getText(52);
        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(63, 0);
        CharSequence text5 = typedArrayObtainStyledAttributes.getText(62);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(16, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(17, -1));
        this.f2227P0 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        this.f2225O0 = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.f2291v1 = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (wtg1.m88951z(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setStartIconDrawable(cx21Var.m34202l(59));
            if (typedArrayObtainStyledAttributes.hasValue(58)) {
                setStartIconContentDescription(typedArrayObtainStyledAttributes.getText(58));
            }
            setStartIconCheckable(typedArrayObtainStyledAttributes.getBoolean(57, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(60)) {
            setStartIconTintList(wtg1.m88943r(context2, cx21Var, 60));
        }
        if (typedArrayObtainStyledAttributes.hasValue(61)) {
            setStartIconTintMode(bga.m29072O(typedArrayObtainStyledAttributes.getInt(61, -1), null));
        }
        int i4 = 0;
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(6, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f2214G1 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (wtg1.m88951z(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams()).setMarginStart(0);
        }
        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(24, 0);
        sparseArray.append(-1, new aam(this, resourceId6, i4));
        sparseArray.append(0, new aam(this, 0, 1));
        sparseArray.append(1, new x9n0(this, resourceId6 == 0 ? typedArrayObtainStyledAttributes.getResourceId(45, 0) : resourceId6));
        sparseArray.append(2, new vhe(this, resourceId6));
        sparseArray.append(3, new kis(this, resourceId6));
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            setEndIconMode(typedArrayObtainStyledAttributes.getInt(25, 0));
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                setEndIconContentDescription(typedArrayObtainStyledAttributes.getText(23));
            }
            setEndIconCheckable(typedArrayObtainStyledAttributes.getBoolean(22, true));
        } else if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setEndIconMode(typedArrayObtainStyledAttributes.getBoolean(46, false) ? 1 : 0);
            setEndIconContentDescription(typedArrayObtainStyledAttributes.getText(44));
            if (typedArrayObtainStyledAttributes.hasValue(47)) {
                setEndIconTintList(wtg1.m88943r(context2, cx21Var, 47));
            }
            if (typedArrayObtainStyledAttributes.hasValue(48)) {
                setEndIconTintMode(bga.m29072O(typedArrayObtainStyledAttributes.getInt(48, -1), null));
            }
        }
        if (!typedArrayObtainStyledAttributes.hasValue(46)) {
            if (typedArrayObtainStyledAttributes.hasValue(26)) {
                setEndIconTintList(wtg1.m88943r(context2, cx21Var, 26));
            }
            if (typedArrayObtainStyledAttributes.hasValue(27)) {
                setEndIconTintMode(bga.m29072O(typedArrayObtainStyledAttributes.getInt(27, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f2250a1 = appCompatTextView;
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.f2256c1 = appCompatTextView2;
        appCompatTextView2.setId(R.id.textinput_suffix_text);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        appCompatTextView2.setAccessibilityLiveRegion(1);
        linearLayout2.addView(appCompatTextView2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(z2);
        setHelperText(text2);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setErrorContentDescription(text);
        setCounterTextAppearance(this.f2227P0);
        setCounterOverflowTextAppearance(this.f2225O0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        setPrefixText(text4);
        setPrefixTextAppearance(resourceId4);
        setSuffixText(text5);
        setSuffixTextAppearance(resourceId5);
        if (typedArrayObtainStyledAttributes.hasValue(34)) {
            setErrorTextColor(cx21Var.m34198g(34));
        }
        if (typedArrayObtainStyledAttributes.hasValue(39)) {
            setHelperTextColor(cx21Var.m34198g(39));
        }
        if (typedArrayObtainStyledAttributes.hasValue(43)) {
            setHintTextColor(cx21Var.m34198g(43));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterTextColor(cx21Var.m34198g(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setCounterOverflowTextColor(cx21Var.m34198g(19));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setPlaceholderTextColor(cx21Var.m34198g(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(54)) {
            setPrefixTextColor(cx21Var.m34198g(54));
        }
        if (typedArrayObtainStyledAttributes.hasValue(64)) {
            setSuffixTextColor(cx21Var.m34198g(64));
        }
        setCounterEnabled(z3);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        cx21Var.m34189K();
        setImportantForAccessibility(2);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26 || i5 < 26) {
            return;
        }
        fec1.m41422b(this, 1);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2232R1.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f2273i.f145580k);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2214G1.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2214G1.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
