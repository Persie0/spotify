package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p204p.C2212of;
import p204p.aec1;
import p204p.cec1;
import p204p.cl8;
import p204p.dh01;
import p204p.eqk;
import p204p.fba;
import p204p.gba;
import p204p.h1u0;
import p204p.hba;
import p204p.hqk;
import p204p.iba;
import p204p.mec1;
import p204p.n3d0;
import p204p.nrc0;
import p204p.rx4;
import p204p.sa8;
import p204p.ti3;
import p204p.vec1;
import p204p.wtg1;
import p204p.yya1;
import p204p.zmn0;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends eqk {

    /* JADX INFO: renamed from: A */
    public float f2004A;

    /* JADX INFO: renamed from: B */
    public int f2005B;

    /* JADX INFO: renamed from: C */
    public final float f2006C;

    /* JADX INFO: renamed from: D */
    public boolean f2007D;

    /* JADX INFO: renamed from: E */
    public boolean f2008E;

    /* JADX INFO: renamed from: F */
    public boolean f2009F;

    /* JADX INFO: renamed from: G */
    public int f2010G;

    /* JADX INFO: renamed from: H */
    public vec1 f2011H;

    /* JADX INFO: renamed from: I */
    public boolean f2012I;

    /* JADX INFO: renamed from: J */
    public int f2013J;

    /* JADX INFO: renamed from: K */
    public boolean f2014K;

    /* JADX INFO: renamed from: L */
    public int f2015L;

    /* JADX INFO: renamed from: M */
    public int f2016M;

    /* JADX INFO: renamed from: N */
    public int f2017N;

    /* JADX INFO: renamed from: O */
    public WeakReference f2018O;

    /* JADX INFO: renamed from: P */
    public WeakReference f2019P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f2020Q;

    /* JADX INFO: renamed from: R */
    public VelocityTracker f2021R;

    /* JADX INFO: renamed from: S */
    public int f2022S;

    /* JADX INFO: renamed from: T */
    public int f2023T;

    /* JADX INFO: renamed from: U */
    public boolean f2024U;

    /* JADX INFO: renamed from: V */
    public HashMap f2025V;

    /* JADX INFO: renamed from: W */
    public int f2026W;

    /* JADX INFO: renamed from: X */
    public final fba f2027X;

    /* JADX INFO: renamed from: a */
    public final int f2028a;

    /* JADX INFO: renamed from: b */
    public boolean f2029b;

    /* JADX INFO: renamed from: c */
    public final float f2030c;

    /* JADX INFO: renamed from: d */
    public int f2031d;

    /* JADX INFO: renamed from: e */
    public boolean f2032e;

    /* JADX INFO: renamed from: f */
    public int f2033f;

    /* JADX INFO: renamed from: g */
    public final int f2034g;

    /* JADX INFO: renamed from: h */
    public final boolean f2035h;

    /* JADX INFO: renamed from: i */
    public n3d0 f2036i;

    /* JADX INFO: renamed from: j */
    public int f2037j;

    /* JADX INFO: renamed from: k */
    public final int f2038k;

    /* JADX INFO: renamed from: l */
    public int f2039l;

    /* JADX INFO: renamed from: m */
    public final boolean f2040m;

    /* JADX INFO: renamed from: n */
    public final boolean f2041n;

    /* JADX INFO: renamed from: o */
    public final boolean f2042o;

    /* JADX INFO: renamed from: p */
    public final boolean f2043p;

    /* JADX INFO: renamed from: q */
    public final boolean f2044q;

    /* JADX INFO: renamed from: r */
    public int f2045r;

    /* JADX INFO: renamed from: s */
    public int f2046s;

    /* JADX INFO: renamed from: t */
    public dh01 f2047t;

    /* JADX INFO: renamed from: u */
    public boolean f2048u;

    /* JADX INFO: renamed from: v */
    public iba f2049v;

    /* JADX INFO: renamed from: w */
    public final ValueAnimator f2050w;

    /* JADX INFO: renamed from: x */
    public final int f2051x;

    /* JADX INFO: renamed from: y */
    public int f2052y;

    /* JADX INFO: renamed from: z */
    public int f2053z;

    public BottomSheetBehavior() {
        this.f2028a = 0;
        this.f2029b = true;
        this.f2037j = -1;
        this.f2038k = -1;
        this.f2049v = null;
        this.f2004A = 0.5f;
        this.f2006C = -1.0f;
        this.f2009F = true;
        this.f2010G = 4;
        this.f2020Q = new ArrayList();
        this.f2026W = -1;
        this.f2027X = new fba(this);
    }

    /* JADX INFO: renamed from: A */
    public static int m1565A(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: y */
    public static View m1566y(View view) {
        WeakHashMap weakHashMap = mec1.f142677a;
        if (cec1.m32545i(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM1566y = m1566y(viewGroup.getChildAt(i));
            if (viewM1566y != null) {
                return viewM1566y;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static BottomSheetBehavior m1567z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof hqk)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        eqk eqkVar = ((hqk) layoutParams).f94198a;
        if (eqkVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) eqkVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* JADX INFO: renamed from: B */
    public final int m1568B() {
        if (this.f2029b) {
            return this.f2052y;
        }
        return Math.max(this.f2051x, this.f2044q ? 0 : this.f2046s);
    }

    /* JADX INFO: renamed from: C */
    public final int m1569C() {
        return this.f2010G;
    }

    /* JADX INFO: renamed from: D */
    public final void m1570D(gba gbaVar) {
        this.f2020Q.remove(gbaVar);
    }

    /* JADX INFO: renamed from: E */
    public final void m1571E(boolean z) {
        this.f2009F = z;
    }

    /* JADX INFO: renamed from: F */
    public final void m1572F(boolean z) {
        if (this.f2029b == z) {
            return;
        }
        this.f2029b = z;
        if (this.f2018O != null) {
            m1591u();
        }
        m1579M((this.f2029b && this.f2010G == 6) ? 3 : this.f2010G);
        m1583Q();
    }

    /* JADX INFO: renamed from: G */
    public final void m1573G(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f2004A = f;
        if (this.f2018O != null) {
            this.f2053z = (int) ((1.0f - f) * this.f2017N);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m1574H(boolean z) {
        if (this.f2007D != z) {
            this.f2007D = z;
            if (!z && this.f2010G == 5) {
                m1578L(4);
            }
            m1583Q();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1575I(int i) {
        this.f2037j = i;
    }

    /* JADX INFO: renamed from: J */
    public final void m1576J(int i) {
        if (i == -1) {
            if (this.f2032e) {
                return;
            } else {
                this.f2032e = true;
            }
        } else {
            if (!this.f2032e && this.f2031d == i) {
                return;
            }
            this.f2032e = false;
            this.f2031d = Math.max(0, i);
        }
        m1586T();
    }

    /* JADX INFO: renamed from: K */
    public final void m1577K(boolean z) {
        this.f2008E = z;
    }

    /* JADX INFO: renamed from: L */
    public final void m1578L(int i) {
        if (i == this.f2010G) {
            return;
        }
        if (this.f2018O == null) {
            if (i == 4 || i == 3 || i == 6 || (this.f2007D && i == 5)) {
                this.f2010G = i;
                return;
            }
            return;
        }
        View view = (View) this.f2018O.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (view.isAttachedToWindow()) {
                view.post(new ti3((Object) this, (Object) view, i, 2, false));
                return;
            }
        }
        m1580N(view, i);
    }

    /* JADX INFO: renamed from: M */
    public final void m1579M(int i) {
        View view;
        if (this.f2010G == i) {
            return;
        }
        this.f2010G = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f2007D;
        }
        WeakReference weakReference = this.f2018O;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            m1585S(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m1585S(false);
        }
        m1584R(i);
        while (true) {
            ArrayList arrayList = this.f2020Q;
            if (i2 >= arrayList.size()) {
                m1583Q();
                return;
            } else {
                ((gba) arrayList.get(i2)).mo33381b(view, i);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m1580N(View view, int i) {
        int iM1568B;
        int i2;
        if (i == 4) {
            iM1568B = this.f2005B;
        } else if (i == 6) {
            iM1568B = this.f2053z;
            if (this.f2029b && iM1568B <= (i2 = this.f2052y)) {
                i = 3;
                iM1568B = i2;
            }
        } else if (i == 3) {
            iM1568B = m1568B();
        } else if (!this.f2007D || i != 5) {
            return;
        } else {
            iM1568B = this.f2017N;
        }
        m1582P(view, i, iM1568B, false);
    }

    /* JADX INFO: renamed from: O */
    public final boolean m1581O(View view, float f) {
        if (this.f2008E) {
            return true;
        }
        if (view.getTop() < this.f2005B) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f2005B)) / ((float) m1592v()) > 0.5f;
    }

    /* JADX INFO: renamed from: P */
    public final void m1582P(View view, int i, int i2, boolean z) {
        vec1 vec1Var = this.f2011H;
        if (vec1Var == null || (!z ? vec1Var.m85316r(view, view.getLeft(), i2) : vec1Var.m85314p(view.getLeft(), i2))) {
            m1579M(i);
            return;
        }
        m1579M(2);
        m1584R(i);
        if (this.f2049v == null) {
            this.f2049v = new iba(this, view, i);
        }
        iba ibaVar = this.f2049v;
        if (ibaVar.f100494b) {
            ibaVar.f100495c = i;
            return;
        }
        ibaVar.f100495c = i;
        WeakHashMap weakHashMap = mec1.f142677a;
        view.postOnAnimation(ibaVar);
        this.f2049v.f100494b = true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m1583Q() {
        View view;
        WeakReference weakReference = this.f2018O;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        mec1.m61560l(view, 524288);
        mec1.m61556h(view, 0);
        mec1.m61560l(view, 262144);
        mec1.m61556h(view, 0);
        mec1.m61560l(view, 1048576);
        mec1.m61556h(view, 0);
        int i = this.f2026W;
        if (i != -1) {
            mec1.m61560l(view, i);
            mec1.m61556h(view, 0);
        }
        int i2 = 6;
        if (!this.f2029b && this.f2010G != 6) {
            this.f2026W = mec1.m61549a(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new cl8(this, i2, 2));
        }
        if (this.f2007D) {
            int i3 = 5;
            if (this.f2010G != 5) {
                mec1.m61561m(view, C2212of.f164599o, null, new cl8(this, i3, 2));
            }
        }
        int i4 = this.f2010G;
        int i5 = 4;
        int i6 = 3;
        if (i4 == 3) {
            mec1.m61561m(view, C2212of.f164598n, null, new cl8(this, this.f2029b ? 4 : 6, 2));
            return;
        }
        if (i4 == 4) {
            mec1.m61561m(view, C2212of.f164597m, null, new cl8(this, this.f2029b ? 3 : 6, 2));
        } else {
            if (i4 != 6) {
                return;
            }
            mec1.m61561m(view, C2212of.f164598n, null, new cl8(this, i5, 2));
            mec1.m61561m(view, C2212of.f164597m, null, new cl8(this, i6, 2));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m1584R(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f2048u != z) {
            this.f2048u = z;
            if (this.f2036i == null || (valueAnimator = this.f2050w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f, f);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m1585S(boolean z) {
        WeakReference weakReference = this.f2018O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f2025V != null) {
                    return;
                } else {
                    this.f2025V = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f2018O.get() && z) {
                    this.f2025V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f2025V = null;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m1586T() {
        View view;
        if (this.f2018O != null) {
            m1591u();
            if (this.f2010G != 4 || (view = (View) this.f2018O.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: c */
    public final void mo1587c(hqk hqkVar) {
        this.f2018O = null;
        this.f2011H = null;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: f */
    public final void mo1588f() {
        this.f2018O = null;
        this.f2011H = null;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: g */
    public final boolean mo1562g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        vec1 vec1Var;
        if (!view.isShown() || !this.f2009F) {
            this.f2012I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2022S = -1;
            VelocityTracker velocityTracker = this.f2021R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2021R = null;
            }
        }
        if (this.f2021R == null) {
            this.f2021R = VelocityTracker.obtain();
        }
        this.f2021R.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f2023T = (int) motionEvent.getY();
            if (this.f2010G != 2) {
                WeakReference weakReference = this.f2019P;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m376q(view2, x, this.f2023T)) {
                    this.f2022S = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2024U = true;
                }
            }
            this.f2012I = this.f2022S == -1 && !coordinatorLayout.m376q(view, x, this.f2023T);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2024U = false;
            this.f2022S = -1;
            if (this.f2012I) {
                this.f2012I = false;
                return false;
            }
        }
        if (this.f2012I || (vec1Var = this.f2011H) == null || !vec1Var.m85315q(motionEvent)) {
            WeakReference weakReference2 = this.f2019P;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f2012I || this.f2010G == 1 || coordinatorLayout.m376q(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2011H == null || Math.abs(this.f2023T - motionEvent.getY()) <= this.f2011H.f240678b) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        n3d0 n3d0Var;
        WeakHashMap weakHashMap = mec1.f142677a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 2;
        int i3 = 4;
        if (this.f2018O == null) {
            this.f2033f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f2040m || this.f2032e) ? false : true;
            if (this.f2041n || this.f2042o || this.f2043p || z) {
                zmn0 zmn0Var = new zmn0(this, z, 8);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                sa8 sa8Var = new sa8();
                sa8Var.f207154a = paddingStart;
                sa8Var.f207155b = paddingEnd;
                sa8Var.f207156c = paddingBottom;
                cec1.m32550n(view, new yya1(i3, zmn0Var, sa8Var));
                if (view.isAttachedToWindow()) {
                    aec1.m25717c(view);
                } else {
                    view.addOnAttachStateChangeListener(new nrc0(i2));
                }
            }
            this.f2018O = new WeakReference(view);
            if (this.f2035h && (n3d0Var = this.f2036i) != null) {
                view.setBackground(n3d0Var);
            }
            n3d0 n3d0Var2 = this.f2036i;
            if (n3d0Var2 != null) {
                float fM32541e = this.f2006C;
                if (fM32541e == -1.0f) {
                    fM32541e = cec1.m32541e(view);
                }
                n3d0Var2.m63600k(fM32541e);
                boolean z2 = this.f2010G == 3;
                this.f2048u = z2;
                this.f2036i.m63602m(z2 ? 0.0f : 1.0f);
            }
            m1583Q();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2011H == null) {
            this.f2011H = new vec1(coordinatorLayout.getContext(), coordinatorLayout, this.f2027X);
        }
        int top = view.getTop();
        coordinatorLayout.m378s(view, i);
        this.f2016M = coordinatorLayout.getWidth();
        this.f2017N = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2015L = height;
        int i4 = this.f2017N;
        int i5 = i4 - height;
        int i6 = this.f2046s;
        if (i5 < i6) {
            if (this.f2044q) {
                this.f2015L = i4;
            } else {
                this.f2015L = i4 - i6;
            }
        }
        this.f2052y = Math.max(0, i4 - this.f2015L);
        this.f2053z = (int) ((1.0f - this.f2004A) * this.f2017N);
        m1591u();
        int i7 = this.f2010G;
        if (i7 == 3) {
            view.offsetTopAndBottom(m1568B());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.f2053z);
        } else if (this.f2007D && i7 == 5) {
            view.offsetTopAndBottom(this.f2017N);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.f2005B);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.f2019P = new WeakReference(m1566y(view));
        return true;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: i */
    public final boolean mo1539i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m1565A(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f2037j, marginLayoutParams.width), m1565A(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2038k, marginLayoutParams.height));
        return true;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: j */
    public final boolean mo1589j(CoordinatorLayout coordinatorLayout, View view, float f, float f2) {
        WeakReference weakReference = this.f2019P;
        return (weakReference == null || view != weakReference.get() || this.f2010G == 3) ? false : true;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: k */
    public final void mo1540k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f2019P;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < m1568B()) {
                int iM1568B = top - m1568B();
                iArr[1] = iM1568B;
                int i5 = -iM1568B;
                WeakHashMap weakHashMap = mec1.f142677a;
                view.offsetTopAndBottom(i5);
                m1579M(3);
            } else {
                if (!this.f2009F) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = mec1.f142677a;
                view.offsetTopAndBottom(-i2);
                m1579M(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f2005B;
            if (i4 > i6 && !this.f2007D) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = mec1.f142677a;
                view.offsetTopAndBottom(i8);
                m1579M(4);
            } else {
                if (!this.f2009F) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = mec1.f142677a;
                view.offsetTopAndBottom(-i2);
                m1579M(1);
            }
        }
        m1594x(view.getTop());
        this.f2013J = i2;
        this.f2014K = true;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: m */
    public final void mo1541m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: o */
    public final void mo1542o(View view, Parcelable parcelable) {
        hba hbaVar = (hba) parcelable;
        int i = this.f2028a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f2031d = hbaVar.f89462d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2029b = hbaVar.f89463e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f2007D = hbaVar.f89464f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f2008E = hbaVar.f89465g;
            }
        }
        int i2 = hbaVar.f89461c;
        if (i2 == 1 || i2 == 2) {
            this.f2010G = 4;
        } else {
            this.f2010G = i2;
        }
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: p */
    public final Parcelable mo1543p(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new hba(this);
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: q */
    public final boolean mo1544q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f2013J = 0;
        this.f2014K = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: r */
    public final void mo1545r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int iM1568B;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == m1568B()) {
            m1579M(3);
            return;
        }
        WeakReference weakReference = this.f2019P;
        if (weakReference != null && view2 == weakReference.get() && this.f2014K) {
            if (this.f2013J > 0) {
                if (this.f2029b) {
                    iM1568B = this.f2052y;
                } else {
                    int top3 = view.getTop();
                    int i4 = this.f2053z;
                    if (top3 > i4) {
                        i3 = 6;
                        iM1568B = i4;
                    } else {
                        iM1568B = m1568B();
                    }
                }
            } else if (this.f2007D) {
                VelocityTracker velocityTracker = this.f2021R;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f2030c);
                    yVelocity = this.f2021R.getYVelocity(this.f2022S);
                }
                if (m1581O(view, yVelocity)) {
                    iM1568B = this.f2017N;
                    i3 = 5;
                } else if (this.f2013J == 0) {
                    top2 = view.getTop();
                    if (this.f2029b) {
                        i2 = this.f2053z;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - this.f2005B)) {
                                iM1568B = m1568B();
                            } else {
                                iM1568B = this.f2053z;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f2005B)) {
                            iM1568B = this.f2053z;
                        } else {
                            iM1568B = this.f2005B;
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f2052y) < Math.abs(top2 - this.f2005B)) {
                        iM1568B = this.f2052y;
                    } else {
                        iM1568B = this.f2005B;
                        i3 = 4;
                    }
                } else {
                    if (this.f2029b) {
                        iM1568B = this.f2005B;
                    } else {
                        top = view.getTop();
                        if (Math.abs(top - this.f2053z) < Math.abs(top - this.f2005B)) {
                            iM1568B = this.f2053z;
                            i3 = 6;
                        } else {
                            iM1568B = this.f2005B;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f2013J == 0) {
                top2 = view.getTop();
                if (this.f2029b) {
                    i2 = this.f2053z;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - this.f2005B)) {
                            iM1568B = m1568B();
                        } else {
                            iM1568B = this.f2053z;
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f2005B)) {
                        iM1568B = this.f2053z;
                    } else {
                        iM1568B = this.f2005B;
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.f2052y) < Math.abs(top2 - this.f2005B)) {
                    iM1568B = this.f2052y;
                } else {
                    iM1568B = this.f2005B;
                    i3 = 4;
                }
            } else {
                if (this.f2029b) {
                    iM1568B = this.f2005B;
                } else {
                    top = view.getTop();
                    if (Math.abs(top - this.f2053z) < Math.abs(top - this.f2005B)) {
                        iM1568B = this.f2053z;
                        i3 = 6;
                    } else {
                        iM1568B = this.f2005B;
                    }
                }
                i3 = 4;
            }
            m1582P(view, i3, iM1568B, false);
            this.f2014K = false;
        }
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: s */
    public final boolean mo1563s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f2010G;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        vec1 vec1Var = this.f2011H;
        if (vec1Var != null && (this.f2009F || i == 1)) {
            vec1Var.m85308j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2022S = -1;
            VelocityTracker velocityTracker = this.f2021R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2021R = null;
            }
        }
        if (this.f2021R == null) {
            this.f2021R = VelocityTracker.obtain();
        }
        this.f2021R.addMovement(motionEvent);
        if (this.f2011H != null && ((this.f2009F || this.f2010G == 1) && actionMasked == 2 && !this.f2012I)) {
            float fAbs = Math.abs(this.f2023T - motionEvent.getY());
            vec1 vec1Var2 = this.f2011H;
            if (fAbs > vec1Var2.f240678b) {
                vec1Var2.m85300b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2012I;
    }

    /* JADX INFO: renamed from: t */
    public final void m1590t(gba gbaVar) {
        ArrayList arrayList = this.f2020Q;
        if (arrayList.contains(gbaVar)) {
            return;
        }
        arrayList.add(gbaVar);
    }

    /* JADX INFO: renamed from: u */
    public final void m1591u() {
        int iM1592v = m1592v();
        if (this.f2029b) {
            this.f2005B = Math.max(this.f2017N - iM1592v, this.f2052y);
        } else {
            this.f2005B = this.f2017N - iM1592v;
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m1592v() {
        int i;
        if (this.f2032e) {
            return Math.min(Math.max(this.f2033f, this.f2017N - ((this.f2016M * 9) / 16)), this.f2015L) + this.f2045r;
        }
        return (this.f2040m || this.f2041n || (i = this.f2039l) <= 0) ? this.f2031d + this.f2045r : Math.max(this.f2031d, i + this.f2034g);
    }

    /* JADX INFO: renamed from: w */
    public final void m1593w(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f2035h) {
            this.f2047t = dh01.m35958b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m74257d();
            n3d0 n3d0Var = new n3d0(this.f2047t);
            this.f2036i = n3d0Var;
            n3d0Var.m63599j(context);
            if (z && colorStateList != null) {
                this.f2036i.m63601l(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f2036i.setTint(typedValue.data);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1594x(int i) {
        float f;
        float fM1568B;
        View view = (View) this.f2018O.get();
        if (view != null) {
            ArrayList arrayList = this.f2020Q;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f2005B;
            if (i > i2 || i2 == m1568B()) {
                int i3 = this.f2005B;
                f = i3 - i;
                fM1568B = this.f2017N - i3;
            } else {
                int i4 = this.f2005B;
                f = i4 - i;
                fM1568B = i4 - m1568B();
            }
            float f2 = f / fM1568B;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((gba) arrayList.get(i5)).mo33380a(view, f2);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f2028a = 0;
        int i2 = 1;
        this.f2029b = true;
        this.f2037j = -1;
        this.f2038k = -1;
        this.f2049v = null;
        this.f2004A = 0.5f;
        this.f2006C = -1.0f;
        this.f2009F = true;
        this.f2010G = 4;
        this.f2020Q = new ArrayList();
        this.f2026W = -1;
        this.f2027X = new fba(this);
        this.f2034g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86731e);
        this.f2035h = typedArrayObtainStyledAttributes.hasValue(17);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        if (zHasValue) {
            m1593w(context, attributeSet, zHasValue, wtg1.m88942q(context, typedArrayObtainStyledAttributes, 3));
        } else {
            m1593w(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2050w = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f2050w.addUpdateListener(new rx4(this, i2));
        this.f2006C = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f2037j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f2038k = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m1576J(i);
        } else {
            m1576J(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        m1574H(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.f2040m = typedArrayObtainStyledAttributes.getBoolean(12, false);
        m1572F(typedArrayObtainStyledAttributes.getBoolean(6, true));
        this.f2008E = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f2009F = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f2028a = typedArrayObtainStyledAttributes.getInt(10, 0);
        m1573G(typedArrayObtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            int i3 = typedValuePeekValue2.data;
            if (i3 >= 0) {
                this.f2051x = i3;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.f2051x = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f2041n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f2042o = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f2043p = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f2044q = typedArrayObtainStyledAttributes.getBoolean(16, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f2030c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
