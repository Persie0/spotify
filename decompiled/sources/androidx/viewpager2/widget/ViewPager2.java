package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.AbstractC0110a;
import p204p.b1u0;
import p204p.e9w;
import p204p.gkc1;
import p204p.gv50;
import p204p.hj30;
import p204p.hjv0;
import p204p.hkc1;
import p204p.ikc1;
import p204p.jkc1;
import p204p.klm0;
import p204p.lkc1;
import p204p.mec1;
import p204p.mjv0;
import p204p.mkc1;
import p204p.moj;
import p204p.nkc1;
import p204p.prh;
import p204p.vky0;
import p204p.zi5;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: L0 */
    public gv50 f1381L0;

    /* JADX INFO: renamed from: M0 */
    public vky0 f1382M0;

    /* JADX INFO: renamed from: N0 */
    public prh f1383N0;

    /* JADX INFO: renamed from: O0 */
    public zi5 f1384O0;

    /* JADX INFO: renamed from: P0 */
    public klm0 f1385P0;

    /* JADX INFO: renamed from: Q0 */
    public mjv0 f1386Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f1387R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f1388S0;

    /* JADX INFO: renamed from: T0 */
    public int f1389T0;

    /* JADX INFO: renamed from: U0 */
    public lkc1 f1390U0;

    /* JADX INFO: renamed from: a */
    public final Rect f1391a;

    /* JADX INFO: renamed from: b */
    public final Rect f1392b;

    /* JADX INFO: renamed from: c */
    public final prh f1393c;

    /* JADX INFO: renamed from: d */
    public int f1394d;

    /* JADX INFO: renamed from: e */
    public boolean f1395e;

    /* JADX INFO: renamed from: f */
    public final gkc1 f1396f;

    /* JADX INFO: renamed from: g */
    public ikc1 f1397g;

    /* JADX INFO: renamed from: h */
    public int f1398h;

    /* JADX INFO: renamed from: i */
    public Parcelable f1399i;

    /* JADX INFO: renamed from: t */
    public hj30 f1400t;

    public ViewPager2(Context context) {
        super(context);
        this.f1391a = new Rect();
        this.f1392b = new Rect();
        this.f1393c = new prh();
        this.f1395e = false;
        this.f1396f = new gkc1(this, 0);
        this.f1398h = -1;
        this.f1386Q0 = null;
        this.f1387R0 = false;
        this.f1388S0 = true;
        this.f1389T0 = -1;
        m1140a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1140a(Context context, AttributeSet attributeSet) {
        this.f1390U0 = new lkc1(this);
        hj30 hj30Var = new hj30(this, context);
        this.f1400t = hj30Var;
        hj30Var.setId(View.generateViewId());
        this.f1400t.setDescendantFocusability(131072);
        ikc1 ikc1Var = new ikc1(this);
        this.f1397g = ikc1Var;
        this.f1400t.setLayoutManager(ikc1Var);
        this.f1400t.setScrollingTouchSlop(1);
        int[] iArr = b1u0.f22416a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        mec1.m61563o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f1400t.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f1400t.m1013j(new moj(2));
            vky0 vky0Var = new vky0(this);
            this.f1382M0 = vky0Var;
            this.f1384O0 = new zi5(vky0Var, 11);
            gv50 gv50Var = new gv50(this);
            this.f1381L0 = gv50Var;
            gv50Var.mo53657b(this.f1400t);
            this.f1400t.m1018m(this.f1382M0);
            prh prhVar = new prh();
            this.f1383N0 = prhVar;
            this.f1382M0.m85940o(prhVar);
            hkc1 hkc1Var = new hkc1(this, 0);
            hkc1 hkc1Var2 = new hkc1(this, 1);
            this.f1383N0.m70719d(hkc1Var);
            this.f1383N0.m70719d(hkc1Var2);
            this.f1390U0.m59224e(this.f1400t);
            this.f1383N0.m70719d(this.f1393c);
            klm0 klm0Var = new klm0(this.f1397g);
            this.f1385P0 = klm0Var;
            this.f1383N0.m70719d(klm0Var);
            hj30 hj30Var2 = this.f1400t;
            attachViewToParent(hj30Var2, 0, hj30Var2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1141b(jkc1 jkc1Var) {
        this.f1393c.m70719d(jkc1Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m1142c() {
        hjv0 adapter;
        if (this.f1398h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f1399i != null) {
            this.f1399i = null;
        }
        int iMax = Math.max(0, Math.min(this.f1398h, adapter.mo1617e() - 1));
        this.f1394d = iMax;
        this.f1398h = -1;
        this.f1400t.mo1035v0(iMax);
        this.f1390U0.m59227h();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f1400t.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f1400t.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m1143d(int i, boolean z) {
        this.f1384O0.getClass();
        m1144e(i, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof nkc1) {
            int i = ((nkc1) parcelable).f154852a;
            sparseArray.put(this.f1400t.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m1142c();
    }

    /* JADX INFO: renamed from: e */
    public final void m1144e(int i, boolean z) {
        hjv0 adapter = getAdapter();
        if (adapter == null) {
            if (this.f1398h != -1) {
                this.f1398h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo1617e() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.mo1617e() - 1);
        if (iMin == this.f1394d && this.f1382M0.m85937l()) {
            return;
        }
        int i2 = this.f1394d;
        if (iMin == i2 && z) {
            return;
        }
        double dM85935h = i2;
        this.f1394d = iMin;
        this.f1390U0.m59229j();
        if (!this.f1382M0.m85937l()) {
            dM85935h = this.f1382M0.m85935h();
        }
        this.f1382M0.m85938m(iMin, z);
        if (!z) {
            this.f1400t.mo1035v0(iMin);
            return;
        }
        double d = iMin;
        if (Math.abs(d - dM85935h) <= 3.0d) {
            this.f1400t.mo1042z0(iMin);
            return;
        }
        this.f1400t.mo1035v0(d > dM85935h ? iMin - 3 : iMin + 3);
        hj30 hj30Var = this.f1400t;
        hj30Var.post(new e9w(iMin, hj30Var));
    }

    /* JADX INFO: renamed from: f */
    public final void m1145f() {
        gv50 gv50Var = this.f1381L0;
        if (gv50Var == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewMo45856i = gv50Var.mo45856i(this.f1397g);
        if (viewMo45856i == null) {
            return;
        }
        this.f1397g.getClass();
        int iM1083V = AbstractC0110a.m1083V(viewMo45856i);
        if (iM1083V != this.f1394d && getScrollState() == 0) {
            this.f1383N0.mo26276c(iM1083V);
        }
        this.f1395e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!this.f1390U0.m59220a()) {
            return super.getAccessibilityClassName();
        }
        this.f1390U0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public hjv0 getAdapter() {
        return this.f1400t.getAdapter();
    }

    public int getCurrentItem() {
        return this.f1394d;
    }

    public int getItemDecorationCount() {
        return this.f1400t.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f1389T0;
    }

    public int getOrientation() {
        return this.f1397g.f1163O0 == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        hj30 hj30Var = this.f1400t;
        if (getOrientation() == 0) {
            height = hj30Var.getWidth() - hj30Var.getPaddingLeft();
            paddingBottom = hj30Var.getPaddingRight();
        } else {
            height = hj30Var.getHeight() - hj30Var.getPaddingTop();
            paddingBottom = hj30Var.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f1382M0.m85936j();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f1390U0.m59225f(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f1400t.getMeasuredWidth();
        int measuredHeight = this.f1400t.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f1391a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f1392b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f1400t.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f1395e) {
            m1145f();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f1400t, i, i2);
        int measuredWidth = this.f1400t.getMeasuredWidth();
        int measuredHeight = this.f1400t.getMeasuredHeight();
        int measuredState = this.f1400t.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nkc1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nkc1 nkc1Var = (nkc1) parcelable;
        super.onRestoreInstanceState(nkc1Var.getSuperState());
        this.f1398h = nkc1Var.f154853b;
        this.f1399i = nkc1Var.f154854c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        nkc1 nkc1Var = new nkc1(super.onSaveInstanceState());
        nkc1Var.f154852a = this.f1400t.getId();
        int i = this.f1398h;
        if (i == -1) {
            i = this.f1394d;
        }
        nkc1Var.f154853b = i;
        Parcelable parcelable = this.f1399i;
        if (parcelable != null) {
            nkc1Var.f154854c = parcelable;
            return nkc1Var;
        }
        this.f1400t.getAdapter();
        return nkc1Var;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.f1390U0.m59221b(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        this.f1390U0.m59226g(i, bundle);
        return true;
    }

    public void setAdapter(hjv0 hjv0Var) {
        hjv0 adapter = this.f1400t.getAdapter();
        this.f1390U0.m59223d(adapter);
        gkc1 gkc1Var = this.f1396f;
        if (adapter != null) {
            adapter.mo47722z(gkc1Var);
        }
        this.f1400t.setAdapter(hjv0Var);
        this.f1394d = 0;
        m1142c();
        this.f1390U0.m59222c(hjv0Var);
        if (hjv0Var != null) {
            hjv0Var.mo47719v(gkc1Var);
        }
    }

    public void setCurrentItem(int i) {
        m1143d(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f1390U0.m59228i();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f1389T0 = i;
        this.f1400t.requestLayout();
    }

    public void setOrientation(int i) {
        this.f1397g.m964y1(i);
        this.f1390U0.m59230k();
    }

    public void setPageTransformer(mkc1 mkc1Var) {
        if (mkc1Var != null) {
            if (!this.f1387R0) {
                this.f1386Q0 = this.f1400t.getItemAnimator();
                this.f1387R0 = true;
            }
            this.f1400t.setItemAnimator(null);
        } else if (this.f1387R0) {
            this.f1400t.setItemAnimator(this.f1386Q0);
            this.f1386Q0 = null;
            this.f1387R0 = false;
        }
        this.f1385P0.getClass();
        if (mkc1Var == null) {
            return;
        }
        this.f1385P0.getClass();
        this.f1385P0.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.f1388S0 = z;
        this.f1390U0.m59231l();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1391a = new Rect();
        this.f1392b = new Rect();
        this.f1393c = new prh();
        this.f1395e = false;
        this.f1396f = new gkc1(this, 0);
        this.f1398h = -1;
        this.f1386Q0 = null;
        this.f1387R0 = false;
        this.f1388S0 = true;
        this.f1389T0 = -1;
        m1140a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1391a = new Rect();
        this.f1392b = new Rect();
        this.f1393c = new prh();
        this.f1395e = false;
        this.f1396f = new gkc1(this, 0);
        this.f1398h = -1;
        this.f1386Q0 = null;
        this.f1387R0 = false;
        this.f1388S0 = true;
        this.f1389T0 = -1;
        m1140a(context, attributeSet);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1391a = new Rect();
        this.f1392b = new Rect();
        this.f1393c = new prh();
        this.f1395e = false;
        this.f1396f = new gkc1(this, 0);
        this.f1398h = -1;
        this.f1386Q0 = null;
        this.f1387R0 = false;
        this.f1388S0 = true;
        this.f1389T0 = -1;
        m1140a(context, attributeSet);
    }
}
