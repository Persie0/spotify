package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p204p.aut;
import p204p.bcg1;
import p204p.bga;
import p204p.bkc1;
import p204p.cec1;
import p204p.h1u0;
import p204p.h3u0;
import p204p.h4c;
import p204p.ihf1;
import p204p.iw3;
import p204p.lzj;
import p204p.mec1;
import p204p.n3d0;
import p204p.q9q0;
import p204p.r05;
import p204p.rk61;
import p204p.rx4;
import p204p.sgz;
import p204p.sk61;
import p204p.snm0;
import p204p.tk61;
import p204p.uk61;
import p204p.vgg1;
import p204p.vk61;
import p204p.wk61;
import p204p.wtg1;
import p204p.yic1;
import p204p.yk61;
import p204p.ytg1;

/* JADX INFO: loaded from: classes4.dex */
@bkc1
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: p1 */
    public static final q9q0 f2165p1 = new q9q0(16);

    /* JADX INFO: renamed from: L0 */
    public ColorStateList f2166L0;

    /* JADX INFO: renamed from: M0 */
    public Drawable f2167M0;

    /* JADX INFO: renamed from: N0 */
    public int f2168N0;

    /* JADX INFO: renamed from: O0 */
    public final float f2169O0;

    /* JADX INFO: renamed from: P0 */
    public final float f2170P0;

    /* JADX INFO: renamed from: Q0 */
    public final int f2171Q0;

    /* JADX INFO: renamed from: R0 */
    public int f2172R0;

    /* JADX INFO: renamed from: S0 */
    public final int f2173S0;

    /* JADX INFO: renamed from: T0 */
    public final int f2174T0;

    /* JADX INFO: renamed from: U0 */
    public final int f2175U0;

    /* JADX INFO: renamed from: V0 */
    public final int f2176V0;

    /* JADX INFO: renamed from: W0 */
    public int f2177W0;

    /* JADX INFO: renamed from: X0 */
    public final int f2178X0;

    /* JADX INFO: renamed from: Y0 */
    public int f2179Y0;

    /* JADX INFO: renamed from: Z0 */
    public int f2180Z0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f2181a;

    /* JADX INFO: renamed from: a1 */
    public boolean f2182a1;

    /* JADX INFO: renamed from: b */
    public vk61 f2183b;

    /* JADX INFO: renamed from: b1 */
    public boolean f2184b1;

    /* JADX INFO: renamed from: c */
    public final uk61 f2185c;

    /* JADX INFO: renamed from: c1 */
    public int f2186c1;

    /* JADX INFO: renamed from: d */
    public final int f2187d;

    /* JADX INFO: renamed from: d1 */
    public int f2188d1;

    /* JADX INFO: renamed from: e */
    public final int f2189e;

    /* JADX INFO: renamed from: e1 */
    public boolean f2190e1;

    /* JADX INFO: renamed from: f */
    public final int f2191f;

    /* JADX INFO: renamed from: f1 */
    public iw3 f2192f1;

    /* JADX INFO: renamed from: g */
    public final int f2193g;

    /* JADX INFO: renamed from: g1 */
    public sk61 f2194g1;

    /* JADX INFO: renamed from: h */
    public final int f2195h;

    /* JADX INFO: renamed from: h1 */
    public final ArrayList f2196h1;

    /* JADX INFO: renamed from: i */
    public ColorStateList f2197i;

    /* JADX INFO: renamed from: i1 */
    public h4c f2198i1;

    /* JADX INFO: renamed from: j1 */
    public ValueAnimator f2199j1;

    /* JADX INFO: renamed from: k1 */
    public ViewPager f2200k1;

    /* JADX INFO: renamed from: l1 */
    public wk61 f2201l1;

    /* JADX INFO: renamed from: m1 */
    public rk61 f2202m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f2203n1;

    /* JADX INFO: renamed from: o1 */
    public final sgz f2204o1;

    /* JADX INFO: renamed from: t */
    public ColorStateList f2205t;

    public TabLayout(Context context) {
        this(context, null);
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f2181a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f2173S0;
        if (i != -1) {
            return i;
        }
        int i2 = this.f2180Z0;
        if (i2 == 0 || i2 == 2) {
            return this.f2175U0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f2185c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        uk61 uk61Var = this.f2185c;
        int childCount = uk61Var.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = uk61Var.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1626a(sk61 sk61Var) {
        ArrayList arrayList = this.f2196h1;
        if (arrayList.contains(sk61Var)) {
            return;
        }
        arrayList.add(sk61Var);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* JADX INFO: renamed from: b */
    public final void m1627b(vk61 vk61Var, boolean z) {
        ArrayList arrayList = this.f2181a;
        int size = arrayList.size();
        if (vk61Var.f242156d != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        vk61Var.f242154b = size;
        arrayList.add(size, vk61Var);
        int size2 = arrayList.size();
        for (int i = size + 1; i < size2; i++) {
            ((vk61) arrayList.get(i)).f242154b = i;
        }
        yk61 yk61Var = vk61Var.f242157e;
        yk61Var.setSelected(false);
        yk61Var.setActivated(false);
        int i2 = vk61Var.f242154b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f2180Z0 == 1 && this.f2177W0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f2185c.addView(yk61Var, i2, layoutParams);
        if (z) {
            TabLayout tabLayout = vk61Var.f242156d;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m1635j(vk61Var, true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1628c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (isLaidOut()) {
                uk61 uk61Var = this.f2185c;
                int childCount = uk61Var.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (uk61Var.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iM1630e = m1630e(0.0f, i);
                if (scrollX != iM1630e) {
                    m1631f();
                    this.f2199j1.setIntValues(scrollX, iM1630e);
                    this.f2199j1.start();
                }
                ValueAnimator valueAnimator = uk61Var.f231246a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    uk61Var.f231246a.cancel();
                }
                uk61Var.m83315d(i, this.f2178X0, true);
                return;
            }
        }
        m1636k(0.0f, i, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX INFO: renamed from: d */
    public final void m1629d() {
        int i = this.f2180Z0;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f2176V0 - this.f2187d) : 0;
        WeakHashMap weakHashMap = mec1.f142677a;
        uk61 uk61Var = this.f2185c;
        uk61Var.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.f2180Z0;
        if (i2 == 0) {
            int i3 = this.f2177W0;
            if (i3 == 0) {
                uk61Var.setGravity(8388611);
            } else if (i3 == 1) {
                uk61Var.setGravity(1);
            } else if (i3 == 2) {
                uk61Var.setGravity(8388611);
            }
        } else if (i2 == 1 || i2 == 2) {
            uk61Var.setGravity(1);
        }
        m1638m(true);
    }

    /* JADX INFO: renamed from: e */
    public final int m1630e(float f, int i) {
        uk61 uk61Var;
        View childAt;
        int i2 = this.f2180Z0;
        if ((i2 != 0 && i2 != 2) || (childAt = (uk61Var = this.f2185c).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < uk61Var.getChildCount() ? uk61Var.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = mec1.f142677a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: f */
    public final void m1631f() {
        if (this.f2199j1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2199j1 = valueAnimator;
            valueAnimator.setInterpolator(r05.f194384b);
            this.f2199j1.setDuration(this.f2178X0);
            this.f2199j1.addUpdateListener(new rx4(this, 20));
        }
    }

    /* JADX INFO: renamed from: g */
    public final vk61 m1632g(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (vk61) this.f2181a.get(i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        vk61 vk61Var = this.f2183b;
        if (vk61Var != null) {
            return vk61Var.f242154b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f2181a.size();
    }

    public int getTabGravity() {
        return this.f2177W0;
    }

    public ColorStateList getTabIconTint() {
        return this.f2205t;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f2188d1;
    }

    public int getTabIndicatorGravity() {
        return this.f2179Y0;
    }

    public int getTabMaxWidth() {
        return this.f2172R0;
    }

    public int getTabMode() {
        return this.f2180Z0;
    }

    public ColorStateList getTabRippleColor() {
        return this.f2166L0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f2167M0;
    }

    public ColorStateList getTabTextColors() {
        return this.f2197i;
    }

    /* JADX INFO: renamed from: h */
    public final vk61 m1633h() {
        vk61 vk61Var = (vk61) f2165p1.mo72406a();
        if (vk61Var == null) {
            vk61Var = new vk61();
            vk61Var.f242154b = -1;
        }
        vk61Var.f242156d = this;
        sgz sgzVar = this.f2204o1;
        yk61 yk61Var = sgzVar != null ? (yk61) sgzVar.mo72406a() : null;
        if (yk61Var == null) {
            yk61Var = new yk61(this, getContext());
        }
        yk61Var.setTab(vk61Var);
        yk61Var.setFocusable(true);
        yk61Var.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            yk61Var.setContentDescription(vk61Var.f242153a);
        } else {
            yk61Var.setContentDescription(null);
        }
        vk61Var.f242157e = yk61Var;
        return vk61Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m1634i() {
        uk61 uk61Var = this.f2185c;
        int childCount = uk61Var.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            yk61 yk61Var = (yk61) uk61Var.getChildAt(childCount);
            uk61Var.removeViewAt(childCount);
            if (yk61Var != null) {
                yk61Var.setTab(null);
                yk61Var.setSelected(false);
                this.f2204o1.mo72407g(yk61Var);
            }
            requestLayout();
        }
        Iterator it = this.f2181a.iterator();
        while (it.hasNext()) {
            vk61 vk61Var = (vk61) it.next();
            it.remove();
            vk61Var.f242156d = null;
            vk61Var.f242157e = null;
            vk61Var.f242153a = null;
            vk61Var.f242154b = -1;
            vk61Var.f242155c = null;
            f2165p1.mo72407g(vk61Var);
        }
        this.f2183b = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m1635j(vk61 vk61Var, boolean z) {
        vk61 vk61Var2 = this.f2183b;
        ArrayList arrayList = this.f2196h1;
        if (vk61Var2 == vk61Var) {
            if (vk61Var2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((sk61) arrayList.get(size)).mo41263c(vk61Var);
                }
                m1628c(vk61Var.f242154b);
                return;
            }
            return;
        }
        int i = vk61Var != null ? vk61Var.f242154b : -1;
        if (z) {
            if ((vk61Var2 == null || vk61Var2.f242154b == -1) && i != -1) {
                m1636k(0.0f, i, true, true);
            } else {
                m1628c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f2183b = vk61Var;
        if (vk61Var2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((sk61) arrayList.get(size2)).mo41262b(vk61Var2);
            }
        }
        if (vk61Var != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((sk61) arrayList.get(size3)).mo41261a(vk61Var);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1636k(float f, int i, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0) {
            uk61 uk61Var = this.f2185c;
            if (iRound >= uk61Var.getChildCount()) {
                return;
            }
            if (z2) {
                ValueAnimator valueAnimator = uk61Var.f231246a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    uk61Var.f231246a.cancel();
                }
                uk61Var.f231247b = i;
                uk61Var.f231248c = f;
                uk61Var.m83314c(uk61Var.getChildAt(i), uk61Var.getChildAt(uk61Var.f231247b + 1), uk61Var.f231248c);
            }
            ValueAnimator valueAnimator2 = this.f2199j1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2199j1.cancel();
            }
            scrollTo(i < 0 ? 0 : m1630e(f, i), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1637l(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f2200k1;
        if (viewPager2 != null) {
            wk61 wk61Var = this.f2201l1;
            if (wk61Var != null && (arrayList2 = viewPager2.f1371e1) != null) {
                arrayList2.remove(wk61Var);
            }
            rk61 rk61Var = this.f2202m1;
            if (rk61Var != null && (arrayList = this.f2200k1.f1375g1) != null) {
                arrayList.remove(rk61Var);
            }
        }
        h4c h4cVar = this.f2198i1;
        if (h4cVar != null) {
            this.f2196h1.remove(h4cVar);
            this.f2198i1 = null;
        }
        if (viewPager != null) {
            this.f2200k1 = viewPager;
            if (this.f2201l1 == null) {
                this.f2201l1 = new wk61(this);
            }
            wk61 wk61Var2 = this.f2201l1;
            wk61Var2.f252149c = 0;
            wk61Var2.f252148b = 0;
            if (viewPager.f1371e1 == null) {
                viewPager.f1371e1 = new ArrayList();
            }
            viewPager.f1371e1.add(wk61Var2);
            h4c h4cVar2 = new h4c(viewPager, 2);
            this.f2198i1 = h4cVar2;
            m1626a(h4cVar2);
            viewPager.getAdapter();
            if (this.f2202m1 == null) {
                this.f2202m1 = new rk61(this);
            }
            rk61 rk61Var2 = this.f2202m1;
            rk61Var2.getClass();
            if (viewPager.f1375g1 == null) {
                viewPager.f1375g1 = new ArrayList();
            }
            viewPager.f1375g1.add(rk61Var2);
            m1636k(0.0f, viewPager.getCurrentItem(), true, true);
        } else {
            this.f2200k1 = null;
            m1634i();
        }
        this.f2203n1 = z;
    }

    /* JADX INFO: renamed from: m */
    public final void m1638m(boolean z) {
        int i = 0;
        while (true) {
            uk61 uk61Var = this.f2185c;
            if (i >= uk61Var.getChildCount()) {
                return;
            }
            View childAt = uk61Var.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f2180Z0 == 1 && this.f2177W0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ytg1.m94633x(this);
        if (this.f2200k1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m1637l((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2203n1) {
            setupWithViewPager(null);
            this.f2203n1 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        yk61 yk61Var;
        Drawable drawable;
        int i = 0;
        while (true) {
            uk61 uk61Var = this.f2185c;
            if (i >= uk61Var.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = uk61Var.getChildAt(i);
            if ((childAt instanceof yk61) && (drawable = (yk61Var = (yk61) childAt).f273617i) != null) {
                drawable.setBounds(yk61Var.getLeft(), yk61Var.getTop(), yk61Var.getRight(), yk61Var.getBottom());
                yk61Var.f273617i.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) yic1.m93704m(1, getTabCount(), 1, false).f273079b);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(bga.m29100v(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM29100v = this.f2174T0;
            if (iM29100v <= 0) {
                iM29100v = (int) (size - bga.m29100v(getContext(), 56));
            }
            this.f2172R0 = iM29100v;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f2180Z0;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ytg1.m94631v(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f2182a1 == z) {
            return;
        }
        this.f2182a1 = z;
        int i = 0;
        while (true) {
            uk61 uk61Var = this.f2185c;
            if (i >= uk61Var.getChildCount()) {
                m1629d();
                return;
            }
            View childAt = uk61Var.getChildAt(i);
            if (childAt instanceof yk61) {
                yk61 yk61Var = (yk61) childAt;
                yk61Var.setOrientation(!yk61Var.f273608L0.f2182a1 ? 1 : 0);
                TextView textView = yk61Var.f273615g;
                if (textView == null && yk61Var.f273616h == null) {
                    yk61Var.m93970g(yk61Var.f273610b, yk61Var.f273611c);
                } else {
                    yk61Var.m93970g(textView, yk61Var.f273616h);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(tk61 tk61Var) {
        setOnTabSelectedListener((sk61) tk61Var);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m1631f();
        this.f2199j1.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f2167M0 != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f2167M0 = drawable;
            int intrinsicHeight = this.f2186c1;
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            this.f2185c.m83313b(intrinsicHeight);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f2168N0 = i;
        m1638m(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f2179Y0 != i) {
            this.f2179Y0 = i;
            WeakHashMap weakHashMap = mec1.f142677a;
            this.f2185c.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f2186c1 = i;
        this.f2185c.m83313b(i);
    }

    public void setTabGravity(int i) {
        if (this.f2177W0 != i) {
            this.f2177W0 = i;
            m1629d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f2205t != colorStateList) {
            this.f2205t = colorStateList;
            ArrayList arrayList = this.f2181a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yk61 yk61Var = ((vk61) arrayList.get(i)).f242157e;
                if (yk61Var != null) {
                    yk61Var.m93968e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(lzj.m60387w(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f2188d1 = i;
        if (i == 0) {
            this.f2192f1 = new iw3(28);
        } else {
            if (i == 1) {
                this.f2192f1 = new aut(28);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f2184b1 = z;
        int i = uk61.f231245e;
        uk61 uk61Var = this.f2185c;
        uk61Var.m83312a();
        WeakHashMap weakHashMap = mec1.f142677a;
        uk61Var.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f2180Z0) {
            this.f2180Z0 = i;
            m1629d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f2166L0 == colorStateList) {
            return;
        }
        this.f2166L0 = colorStateList;
        int i = 0;
        while (true) {
            uk61 uk61Var = this.f2185c;
            if (i >= uk61Var.getChildCount()) {
                return;
            }
            View childAt = uk61Var.getChildAt(i);
            if (childAt instanceof yk61) {
                Context context = getContext();
                int i2 = yk61.f273607M0;
                ((yk61) childAt).m93969f(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(lzj.m60387w(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f2197i != colorStateList) {
            this.f2197i = colorStateList;
            ArrayList arrayList = this.f2181a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yk61 yk61Var = ((vk61) arrayList.get(i)).f242157e;
                if (yk61Var != null) {
                    yk61Var.m93968e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(snm0 snm0Var) {
        m1634i();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f2190e1 == z) {
            return;
        }
        this.f2190e1 = z;
        int i = 0;
        while (true) {
            uk61 uk61Var = this.f2185c;
            if (i >= uk61Var.getChildCount()) {
                return;
            }
            View childAt = uk61Var.getChildAt(i);
            if (childAt instanceof yk61) {
                Context context = getContext();
                int i2 = yk61.f273607M0;
                ((yk61) childAt).m93969f(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m1637l(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(sk61 sk61Var) {
        sk61 sk61Var2 = this.f2194g1;
        if (sk61Var2 != null) {
            this.f2196h1.remove(sk61Var2);
        }
        this.f2194g1 = sk61Var;
        if (sk61Var != null) {
            m1626a(sk61Var);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(vgg1.m85455K(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.f2181a = new ArrayList();
        this.f2167M0 = new GradientDrawable();
        this.f2168N0 = 0;
        this.f2172R0 = Alert.DURATION_SHOW_INDEFINITELY;
        this.f2186c1 = -1;
        this.f2196h1 = new ArrayList();
        this.f2204o1 = new sgz(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        uk61 uk61Var = new uk61(this, context2);
        this.f2185c = uk61Var;
        super.addView(uk61Var, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM28739t = bcg1.m28739t(context2, attributeSet, h1u0.f86722K, i, R.style.Widget_Design_TabLayout, 23);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            n3d0 n3d0Var = new n3d0();
            n3d0Var.m63601l(ColorStateList.valueOf(colorDrawable.getColor()));
            n3d0Var.m63599j(context2);
            WeakHashMap weakHashMap = mec1.f142677a;
            n3d0Var.m63600k(cec1.m32541e(this));
            setBackground(n3d0Var);
        }
        setSelectedTabIndicator(wtg1.m88945t(context2, typedArrayM28739t, 5));
        setSelectedTabIndicatorColor(typedArrayM28739t.getColor(8, 0));
        uk61Var.m83313b(typedArrayM28739t.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM28739t.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayM28739t.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayM28739t.getBoolean(9, true));
        int dimensionPixelSize = typedArrayM28739t.getDimensionPixelSize(16, 0);
        this.f2193g = dimensionPixelSize;
        this.f2191f = dimensionPixelSize;
        this.f2189e = dimensionPixelSize;
        this.f2187d = dimensionPixelSize;
        this.f2187d = typedArrayM28739t.getDimensionPixelSize(19, dimensionPixelSize);
        this.f2189e = typedArrayM28739t.getDimensionPixelSize(20, dimensionPixelSize);
        this.f2191f = typedArrayM28739t.getDimensionPixelSize(18, dimensionPixelSize);
        this.f2193g = typedArrayM28739t.getDimensionPixelSize(17, dimensionPixelSize);
        int resourceId = typedArrayM28739t.getResourceId(23, R.style.TextAppearance_Design_Tab);
        this.f2195h = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, h3u0.f87344x);
        try {
            this.f2169O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f2197i = wtg1.m88942q(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM28739t.hasValue(24)) {
                this.f2197i = wtg1.m88942q(context2, typedArrayM28739t, 24);
            }
            if (typedArrayM28739t.hasValue(22)) {
                this.f2197i = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayM28739t.getColor(22, 0), this.f2197i.getDefaultColor()});
            }
            this.f2205t = wtg1.m88942q(context2, typedArrayM28739t, 3);
            bga.m29072O(typedArrayM28739t.getInt(4, -1), null);
            this.f2166L0 = wtg1.m88942q(context2, typedArrayM28739t, 21);
            this.f2178X0 = typedArrayM28739t.getInt(6, 300);
            this.f2173S0 = typedArrayM28739t.getDimensionPixelSize(14, -1);
            this.f2174T0 = typedArrayM28739t.getDimensionPixelSize(13, -1);
            this.f2171Q0 = typedArrayM28739t.getResourceId(0, 0);
            this.f2176V0 = typedArrayM28739t.getDimensionPixelSize(1, 0);
            this.f2180Z0 = typedArrayM28739t.getInt(15, 1);
            this.f2177W0 = typedArrayM28739t.getInt(2, 0);
            this.f2182a1 = typedArrayM28739t.getBoolean(12, false);
            this.f2190e1 = typedArrayM28739t.getBoolean(25, false);
            typedArrayM28739t.recycle();
            Resources resources = getResources();
            this.f2170P0 = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f2175U0 = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            m1629d();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(ihf1.m50639w(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
