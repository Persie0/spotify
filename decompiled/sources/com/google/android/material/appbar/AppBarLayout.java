package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p204p.C2212of;
import p204p.bcg1;
import p204p.cec1;
import p204p.cky0;
import p204p.dqk;
import p204p.eqk;
import p204p.fm20;
import p204p.grl0;
import p204p.h1u0;
import p204p.hqk;
import p204p.igj0;
import p204p.ihf1;
import p204p.mec1;
import p204p.n3d0;
import p204p.pp91;
import p204p.qgj0;
import p204p.r05;
import p204p.svg1;
import p204p.swd1;
import p204p.uf20;
import p204p.vgg1;
import p204p.x45;
import p204p.xqb;
import p204p.y45;
import p204p.ytg1;
import p204p.z45;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements dqk {

    /* JADX INFO: renamed from: L0 */
    public boolean f1924L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f1925M0;

    /* JADX INFO: renamed from: N0 */
    public int f1926N0;

    /* JADX INFO: renamed from: O0 */
    public WeakReference f1927O0;

    /* JADX INFO: renamed from: P0 */
    public ValueAnimator f1928P0;

    /* JADX INFO: renamed from: Q0 */
    public final ArrayList f1929Q0;

    /* JADX INFO: renamed from: R0 */
    public int[] f1930R0;

    /* JADX INFO: renamed from: S0 */
    public Drawable f1931S0;

    /* JADX INFO: renamed from: a */
    public int f1932a;

    /* JADX INFO: renamed from: b */
    public int f1933b;

    /* JADX INFO: renamed from: c */
    public int f1934c;

    /* JADX INFO: renamed from: d */
    public int f1935d;

    /* JADX INFO: renamed from: e */
    public boolean f1936e;

    /* JADX INFO: renamed from: f */
    public int f1937f;

    /* JADX INFO: renamed from: g */
    public swd1 f1938g;

    /* JADX INFO: renamed from: h */
    public ArrayList f1939h;

    /* JADX INFO: renamed from: i */
    public boolean f1940i;

    /* JADX INFO: renamed from: t */
    public boolean f1941t;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends fm20 {
        public ScrollingViewBehavior() {
        }

        /* JADX INFO: renamed from: x */
        public static AppBarLayout m1549x(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: b */
        public final boolean mo1550b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: d */
        public final boolean mo1551d(View view, View view2) {
            eqk eqkVar = ((hqk) view2.getLayoutParams()).f94198a;
            if (eqkVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) eqkVar).f1942j) + this.f70933e) - m42050w(view2);
                WeakHashMap weakHashMap = mec1.f142677a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f1925M0) {
                return false;
            }
            appBarLayout.m1530f(appBarLayout.m1531g(view));
            return false;
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: e */
        public final void mo1552e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                mec1.m61560l(coordinatorLayout, C2212of.f164595k.m66803a());
                mec1.m61556h(coordinatorLayout, 0);
                mec1.m61560l(coordinatorLayout, C2212of.f164596l.m66803a());
                mec1.m61556h(coordinatorLayout, 0);
            }
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: n */
        public final boolean mo1553n(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutM1549x = m1549x(coordinatorLayout.m374m(view));
            if (appBarLayoutM1549x != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f70931c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayoutM1549x.m1529e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86718G);
            this.f70934f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static y45 m1525c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            y45 y45Var = new y45((LinearLayout.LayoutParams) layoutParams);
            y45Var.f269076a = 1;
            return y45Var;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            y45 y45Var2 = new y45((ViewGroup.MarginLayoutParams) layoutParams);
            y45Var2.f269076a = 1;
            return y45Var2;
        }
        y45 y45Var3 = new y45(layoutParams);
        y45Var3.f269076a = 1;
        return y45Var3;
    }

    /* JADX INFO: renamed from: a */
    public final void m1526a(z45 z45Var) {
        if (this.f1939h == null) {
            this.f1939h = new ArrayList();
        }
        if (z45Var == null || this.f1939h.contains(z45Var)) {
            return;
        }
        this.f1939h.add(z45Var);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y45 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        y45 y45Var = new y45(context, attributeSet);
        y45Var.f269076a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86728b);
        y45Var.f269076a = typedArrayObtainStyledAttributes.getInt(1, 0);
        y45Var.f269077b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new xqb();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            y45Var.f269078c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return y45Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y45;
    }

    /* JADX INFO: renamed from: d */
    public final void m1528d(int i) {
        this.f1932a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = mec1.f142677a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f1939h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                z45 z45Var = (z45) this.f1939h.get(i2);
                if (z45Var != null) {
                    z45Var.mo33357a(this, i);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1931S0 == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f1932a);
        this.f1931S0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1931S0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1529e(boolean z, boolean z2, boolean z3) {
        this.f1937f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1530f(boolean z) {
        if (this.f1940i || this.f1924L0 == z) {
            return false;
        }
        this.f1924L0 = z;
        refreshDrawableState();
        if (this.f1925M0 && (getBackground() instanceof n3d0)) {
            n3d0 n3d0Var = (n3d0) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f1928P0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.f1928P0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f1928P0.setInterpolator(r05.f194383a);
            this.f1928P0.addUpdateListener(new x45(this, n3d0Var));
            this.f1928P0.start();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1531g(View view) {
        int i;
        if (this.f1927O0 == null && (i = this.f1926N0) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f1926N0);
            }
            if (viewFindViewById != null) {
                this.f1927O0 = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f1927O0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        y45 y45Var = new y45(-1, -2);
        y45Var.f269076a = 1;
        return y45Var;
    }

    @Override // p204p.dqk
    public eqk getBehavior() {
        return new Behavior();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f1934c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            y45 y45Var = (y45) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = y45Var.f269076a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) y45Var).topMargin + ((LinearLayout.LayoutParams) y45Var).bottomMargin;
                if ((i3 & 8) != 0) {
                    WeakHashMap weakHashMap = mec1.f142677a;
                    minimumHeight = childAt.getMinimumHeight();
                } else {
                    if ((i3 & 2) != 0) {
                        WeakHashMap weakHashMap2 = mec1.f142677a;
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                    }
                    if (childCount == 0) {
                        WeakHashMap weakHashMap3 = mec1.f142677a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
                iMin = minimumHeight + i4;
                if (childCount == 0) {
                    WeakHashMap weakHashMap4 = mec1.f142677a;
                    if (childAt.getFitsSystemWindows()) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                }
                i2 += iMin;
            }
        }
        int iMax = Math.max(0, i2);
        this.f1934c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f1935d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            y45 y45Var = (y45) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) y45Var).topMargin + ((LinearLayout.LayoutParams) y45Var).bottomMargin + childAt.getMeasuredHeight();
            int i3 = y45Var.f269076a;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                WeakHashMap weakHashMap = mec1.f142677a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f1935d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f1926N0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = mec1.f142677a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f1937f;
    }

    public Drawable getStatusBarForeground() {
        return this.f1931S0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        swd1 swd1Var = this.f1938g;
        if (swd1Var != null) {
            return swd1Var.m79540d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f1933b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            y45 y45Var = (y45) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = y45Var.f269076a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) y45Var).topMargin + ((LinearLayout.LayoutParams) y45Var).bottomMargin + minimumHeight;
            if (i2 == 0) {
                WeakHashMap weakHashMap = mec1.f142677a;
                if (childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
            }
            minimumHeight = topInset;
            if ((i3 & 2) != 0) {
                WeakHashMap weakHashMap2 = mec1.f142677a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f1933b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ytg1.m94633x(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f1930R0 == null) {
            this.f1930R0 = new int[4];
        }
        int[] iArr = this.f1930R0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f1941t;
        iArr[0] = z ? R.attr.state_liftable : -2130970288;
        iArr[1] = (z && this.f1924L0) ? R.attr.state_lifted : -2130970289;
        iArr[2] = z ? R.attr.state_collapsible : -2130970285;
        iArr[3] = (z && this.f1924L0) ? R.attr.state_collapsed : -2130970284;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f1927O0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1927O0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = mec1.f142677a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        this.f1933b = -1;
        this.f1934c = -1;
        this.f1935d = -1;
        this.f1936e = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((y45) getChildAt(i5).getLayoutParams()).f269078c != null) {
                this.f1936e = true;
                break;
            }
        }
        Drawable drawable = this.f1931S0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f1940i) {
            return;
        }
        if (!this.f1925M0) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((y45) getChildAt(i6).getLayoutParams()).f269076a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.f1941t != z2) {
            this.f1941t = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = grl0.m45542o(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        this.f1933b = -1;
        this.f1934c = -1;
        this.f1935d = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ytg1.m94631v(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = mec1.f142677a;
        m1529e(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f1925M0 = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f1926N0 = i;
        WeakReference weakReference = this.f1927O0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1927O0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f1940i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f1931S0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1931S0 = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1931S0.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1931S0;
                WeakHashMap weakHashMap = mec1.f142677a;
                svg1.m79457K(drawable3, getLayoutDirection());
                this.f1931S0.setVisible(getVisibility() == 0, false);
                this.f1931S0.setCallback(this);
            }
            if (this.f1931S0 != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap weakHashMap2 = mec1.f142677a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(ihf1.m50639w(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        pp91.m70518B(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1931S0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1931S0;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1525c(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends uf20 {

        /* JADX INFO: renamed from: j */
        public int f1942j;

        /* JADX INFO: renamed from: k */
        public int f1943k;

        /* JADX INFO: renamed from: l */
        public ValueAnimator f1944l;

        /* JADX INFO: renamed from: m */
        public C0138f f1945m;

        /* JADX INFO: renamed from: n */
        public WeakReference f1946n;

        /* JADX INFO: renamed from: o */
        public cky0 f1947o;

        public BaseBehavior() {
            this.f229659f = -1;
            this.f229661h = -1;
        }

        /* JADX INFO: renamed from: A */
        public static View m1532A(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof igj0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX INFO: renamed from: F */
        public static void m1533F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zM1531g;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((y45) childAt.getLayoutParams()).f269076a;
                if ((i4 & 1) != 0) {
                    WeakHashMap weakHashMap = mec1.f142677a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zM1531g = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zM1531g = false;
                    }
                } else {
                    zM1531g = false;
                }
            } else {
                zM1531g = false;
            }
            if (appBarLayout.f1925M0) {
                zM1531g = appBarLayout.m1531g(m1532A(coordinatorLayout));
            }
            boolean zM1530f = appBarLayout.m1530f(zM1531g);
            if (!z) {
                if (zM1530f) {
                    List listM50756s = coordinatorLayout.f759b.m50756s(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f761d;
                    arrayList.clear();
                    if (listM50756s != null) {
                        arrayList.addAll(listM50756s);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        eqk eqkVar = ((hqk) ((View) arrayList.get(i5)).getLayoutParams()).f94198a;
                        if (eqkVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) eqkVar).f70934f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        /* JADX INFO: renamed from: B */
        public final void m1534B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = mo1547x(coordinatorLayout, appBarLayout2, mo1546w() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.f1925M0) {
                appBarLayout2.m1530f(appBarLayout2.m1531g(view));
            }
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public void mo1541m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            if (i4 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                iArr[1] = mo1547x(coordinatorLayout2, appBarLayout2, mo1546w() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
            }
            if (i4 == 0) {
                m1537E(coordinatorLayout2, appBarLayout2);
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m1536D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iMo1546w = mo1546w();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                y45 y45Var = (y45) childAt.getLayoutParams();
                if ((y45Var.f269076a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) y45Var).topMargin;
                    bottom += ((LinearLayout.LayoutParams) y45Var).bottomMargin;
                }
                int i2 = -iMo1546w;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                y45 y45Var2 = (y45) childAt2.getLayoutParams();
                int i3 = y45Var2.f269076a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        minimumHeight += appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap = mec1.f142677a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap2 = mec1.f142677a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iMo1546w < minimumHeight2) {
                            i4 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) y45Var2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) y45Var2).bottomMargin;
                    }
                    if (iMo1546w < (minimumHeight + i4) / 2) {
                        i4 = minimumHeight;
                    }
                    m1548z(coordinatorLayout, appBarLayout, grl0.m45542o(i4, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final void m1537E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            C2212of c2212of = C2212of.f164595k;
            mec1.m61560l(coordinatorLayout, c2212of.m66803a());
            mec1.m61556h(coordinatorLayout, 0);
            C2212of c2212of2 = C2212of.f164596l;
            mec1.m61560l(coordinatorLayout, c2212of2.m66803a());
            mec1.m61556h(coordinatorLayout, 0);
            View viewM1532A = m1532A(coordinatorLayout);
            if (viewM1532A == null || appBarLayout.getTotalScrollRange() == 0 || !(((hqk) viewM1532A.getLayoutParams()).f94198a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (mo1546w() != (-appBarLayout.getTotalScrollRange()) && viewM1532A.canScrollVertically(1)) {
                mec1.m61561m(coordinatorLayout, c2212of, null, new C0135c(appBarLayout, false));
            }
            if (mo1546w() != 0) {
                if (!viewM1532A.canScrollVertically(-1)) {
                    mec1.m61561m(coordinatorLayout, c2212of2, null, new C0135c(appBarLayout, true));
                    return;
                }
                int i = -appBarLayout.getDownNestedPreScrollRange();
                if (i != 0) {
                    mec1.m61561m(coordinatorLayout, c2212of2, null, new C0134b(this, coordinatorLayout, appBarLayout, viewM1532A, i));
                }
            }
        }

        @Override // p204p.mjc1, p204p.eqk
        /* JADX INFO: renamed from: h */
        public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo1538h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            C0138f c0138f = this.f1945m;
            if (c0138f == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            m1548z(coordinatorLayout, appBarLayout, i2);
                        } else {
                            m82947y(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m1548z(coordinatorLayout, appBarLayout, 0);
                        } else {
                            m82947y(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (c0138f.f1990c) {
                m82947y(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else {
                View childAt = appBarLayout.getChildAt(c0138f.f1991d);
                int i3 = -childAt.getBottom();
                if (this.f1945m.f1993f) {
                    WeakHashMap weakHashMap = mec1.f142677a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f1945m.f1992e) + i3;
                }
                m82947y(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f1937f = 0;
            this.f1945m = null;
            m61964v(grl0.m45542o(m61963t(), -appBarLayout.getTotalScrollRange(), 0));
            m1533F(coordinatorLayout, appBarLayout, m61963t(), 0, true);
            appBarLayout.m1528d(m61963t());
            m1537E(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: i */
        public final boolean mo1539i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((hqk) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m379t(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: k */
        public final /* bridge */ /* synthetic */ void mo1540k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m1534B(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: o */
        public final void mo1542o(View view, Parcelable parcelable) {
            if (parcelable instanceof C0138f) {
                this.f1945m = (C0138f) parcelable;
            } else {
                this.f1945m = null;
            }
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: p */
        public final Parcelable mo1543p(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iM61963t = m61963t();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iM61963t;
                if (childAt.getTop() + iM61963t <= 0 && bottom >= 0) {
                    C0138f c0138f = new C0138f();
                    c0138f.f1990c = (-m61963t()) >= appBarLayout.getTotalScrollRange();
                    c0138f.f1991d = i;
                    WeakHashMap weakHashMap = mec1.f142677a;
                    c0138f.f1993f = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    c0138f.f1992e = bottom / childAt.getHeight();
                    return c0138f;
                }
            }
            return absSavedState;
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: q */
        public final boolean mo1544q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.f1925M0 || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.f1944l) != null) {
                valueAnimator.cancel();
            }
            this.f1946n = null;
            this.f1943k = i2;
            return z;
        }

        @Override // p204p.eqk
        /* JADX INFO: renamed from: r */
        public final void mo1545r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f1943k == 0 || i == 1) {
                m1536D(coordinatorLayout, appBarLayout);
                if (appBarLayout.f1925M0) {
                    appBarLayout.m1530f(appBarLayout.m1531g(view2));
                }
            }
            this.f1946n = new WeakReference(view2);
        }

        @Override // p204p.uf20
        /* JADX INFO: renamed from: w */
        public final int mo1546w() {
            return m61963t() + this.f1942j;
        }

        @Override // p204p.uf20
        /* JADX INFO: renamed from: x */
        public final int mo1547x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iMo1546w = mo1546w();
            int i4 = 0;
            if (i2 == 0 || iMo1546w < i2 || iMo1546w > i3) {
                this.f1942j = 0;
            } else {
                int iM45542o = grl0.m45542o(i, i2, i3);
                if (iMo1546w != iM45542o) {
                    if (!appBarLayout.f1936e) {
                        top = iM45542o;
                        break;
                    }
                    int iAbs = Math.abs(iM45542o);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            y45 y45Var = (y45) childAt.getLayoutParams();
                            Interpolator interpolator = y45Var.f269078c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i5++;
                            } else if (interpolator != null) {
                                int i6 = y45Var.f269076a;
                                if ((i6 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) y45Var).topMargin + ((LinearLayout.LayoutParams) y45Var).bottomMargin;
                                    if ((i6 & 2) != 0) {
                                        WeakHashMap weakHashMap = mec1.f142677a;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap weakHashMap2 = mec1.f142677a;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iM45542o);
                                    break;
                                }
                            }
                        }
                        top = iM45542o;
                        break;
                    }
                    boolean zM61964v = m61964v(top);
                    int i7 = iMo1546w - iM45542o;
                    this.f1942j = iM45542o - top;
                    if (zM61964v) {
                        for (int i8 = 0; i8 < appBarLayout.getChildCount(); i8++) {
                            y45 y45Var2 = (y45) appBarLayout.getChildAt(i8).getLayoutParams();
                            xqb xqbVar = y45Var2.f269077b;
                            if (xqbVar != null && (y45Var2.f269076a & 1) != 0) {
                                xqbVar.m91834n(appBarLayout, appBarLayout.getChildAt(i8), m61963t());
                            }
                        }
                    }
                    if (!zM61964v && appBarLayout.f1936e) {
                        coordinatorLayout.m372c(appBarLayout);
                    }
                    appBarLayout.m1528d(m61963t());
                    m1533F(coordinatorLayout, appBarLayout, iM45542o, iM45542o < iMo1546w ? -1 : 1, false);
                    i4 = i7;
                }
            }
            m1537E(coordinatorLayout, appBarLayout);
            return i4;
        }

        /* JADX INFO: renamed from: z */
        public final void m1548z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(mo1546w() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iMo1546w = mo1546w();
            if (iMo1546w == i) {
                ValueAnimator valueAnimator = this.f1944l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f1944l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f1944l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f1944l = valueAnimator3;
                valueAnimator3.setInterpolator(r05.f194387e);
                this.f1944l.addUpdateListener(new C0133a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f1944l.setDuration(Math.min(iRound, CtaType.BUY_TICKETS_FIELD_NUMBER));
            this.f1944l.setIntValues(iMo1546w, i);
            this.f1944l.start();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f229659f = -1;
            this.f229661h = -1;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(vgg1.m85455K(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.f1933b = -1;
        this.f1934c = -1;
        this.f1935d = -1;
        this.f1937f = 0;
        this.f1929Q0 = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayM28739t = bcg1.m28739t(context3, attributeSet, pp91.f179981c, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayM28739t.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM28739t.getResourceId(0, 0)));
            }
            typedArrayM28739t.recycle();
            TypedArray typedArrayM28739t2 = bcg1.m28739t(context2, attributeSet, h1u0.f86727a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayM28739t2.getDrawable(0);
            WeakHashMap weakHashMap = mec1.f142677a;
            setBackground(drawable);
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                n3d0 n3d0Var = new n3d0();
                n3d0Var.m63601l(ColorStateList.valueOf(colorDrawable.getColor()));
                n3d0Var.m63599j(context2);
                setBackground(n3d0Var);
            }
            if (typedArrayM28739t2.hasValue(4)) {
                m1529e(typedArrayM28739t2.getBoolean(4, false), false, false);
            }
            if (typedArrayM28739t2.hasValue(3)) {
                pp91.m70518B(this, typedArrayM28739t2.getDimensionPixelSize(3, 0));
            }
            if (i2 >= 26) {
                if (typedArrayM28739t2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayM28739t2.getBoolean(2, false));
                }
                if (typedArrayM28739t2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayM28739t2.getBoolean(1, false));
                }
            }
            this.f1925M0 = typedArrayM28739t2.getBoolean(5, false);
            this.f1926N0 = typedArrayM28739t2.getResourceId(6, -1);
            setStatusBarForeground(typedArrayM28739t2.getDrawable(7));
            typedArrayM28739t2.recycle();
            cec1.m32550n(this, new qgj0(this, 21));
        } catch (Throwable th) {
            typedArrayM28739t.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        y45 y45Var = new y45(-1, -2);
        y45Var.f269076a = 1;
        return y45Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1525c(layoutParams);
    }
}
