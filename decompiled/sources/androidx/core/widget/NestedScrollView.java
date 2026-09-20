package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import p204p.akg1;
import p204p.dxf1;
import p204p.egj0;
import p204p.ely0;
import p204p.eqp;
import p204p.ggj0;
import p204p.hgj0;
import p204p.jgj0;
import p204p.lgj0;
import p204p.mec1;
import p204p.nat;
import p204p.pp91;
import p204p.qqs;
import p204p.qr8;
import p204p.tir;
import p204p.ucj0;
import p204p.usa;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements lgj0, hgj0 {

    /* JADX INFO: renamed from: e1 */
    public static final float f788e1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: f1 */
    public static final usa f789f1 = new usa(16);

    /* JADX INFO: renamed from: g1 */
    public static final int[] f790g1 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: L0 */
    public View f791L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f792M0;

    /* JADX INFO: renamed from: N0 */
    public VelocityTracker f793N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f794O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f795P0;

    /* JADX INFO: renamed from: Q0 */
    public final int f796Q0;

    /* JADX INFO: renamed from: R0 */
    public final int f797R0;

    /* JADX INFO: renamed from: S0 */
    public final int f798S0;

    /* JADX INFO: renamed from: T0 */
    public int f799T0;

    /* JADX INFO: renamed from: U0 */
    public final int[] f800U0;

    /* JADX INFO: renamed from: V0 */
    public final int[] f801V0;

    /* JADX INFO: renamed from: W0 */
    public int f802W0;

    /* JADX INFO: renamed from: X0 */
    public int f803X0;

    /* JADX INFO: renamed from: Y0 */
    public ggj0 f804Y0;

    /* JADX INFO: renamed from: Z0 */
    public final qr8 f805Z0;

    /* JADX INFO: renamed from: a */
    public final float f806a;

    /* JADX INFO: renamed from: a1 */
    public final jgj0 f807a1;

    /* JADX INFO: renamed from: b */
    public long f808b;

    /* JADX INFO: renamed from: b1 */
    public float f809b1;

    /* JADX INFO: renamed from: c */
    public final Rect f810c;

    /* JADX INFO: renamed from: c1 */
    public egj0 f811c1;

    /* JADX INFO: renamed from: d */
    public final OverScroller f812d;

    /* JADX INFO: renamed from: d1 */
    public final tir f813d1;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f814e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f815f;

    /* JADX INFO: renamed from: g */
    public ely0 f816g;

    /* JADX INFO: renamed from: h */
    public int f817h;

    /* JADX INFO: renamed from: i */
    public boolean f818i;

    /* JADX INFO: renamed from: t */
    public boolean f819t;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private ely0 getScrollFeedbackProvider() {
        if (this.f816g == null) {
            this.f816g = ely0.m39398a(this);
        }
        return this.f816g;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m400r(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m400r((View) parent, nestedScrollView);
    }

    /* JADX INFO: renamed from: A */
    public final void m401A(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f808b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f812d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                this.f807a1.m53303h(2, 1);
            } else {
                mo403l(1);
            }
            this.f803X0 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f812d.isFinished()) {
                this.f812d.abortAnimation();
                mo403l(1);
            }
            scrollBy(i, i2);
        }
        this.f808b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m402B(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f814e;
        if (pp91.m70536q(edgeEffect) != 0.0f) {
            pp91.m70544y(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f815f;
        if (pp91.m70536q(edgeEffect2) == 0.0f) {
            return z;
        }
        pp91.m70544y(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        if (this.f812d.isFinished()) {
            return;
        }
        this.f812d.computeScrollOffset();
        int currY = this.f812d.getCurrY();
        int i2 = currY - this.f803X0;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f814e;
        EdgeEffect edgeEffect2 = this.f815f;
        if (i2 <= 0 || pp91.m70536q(edgeEffect) == 0.0f) {
            if (i2 < 0 && pp91.m70536q(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(pp91.m70544y(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.f803X0 = currY;
            iArr = this.f801V0;
            iArr[1] = 0;
            this.f807a1.m53298c(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                nat.m64040b(this, Math.abs(this.f812d.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                m412v(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.f807a1.m53299d(0, scrollY2, 0, i4, this.f800U0, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f812d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f812d.getCurrVelocity());
                    }
                }
                this.f812d.abortAnimation();
                mo403l(1);
            }
            if (this.f812d.isFinished()) {
                mo403l(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(pp91.m70544y(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect.finish();
        }
        i2 -= iRound;
        int i5 = i2;
        this.f803X0 = currY;
        iArr = this.f801V0;
        iArr[1] = 0;
        this.f807a1.m53298c(0, i5, 1, iArr, null);
        i = i5 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            nat.m64040b(this, Math.abs(this.f812d.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            m412v(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i6 = i - scrollY4;
            iArr[1] = 0;
            this.f807a1.m53299d(0, scrollY4, 0, i6, this.f800U0, 1, iArr);
            i = i6 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f812d.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f812d.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f812d.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f812d.getCurrVelocity());
            }
            this.f812d.abortAnimation();
            mo403l(1);
        }
        if (this.f812d.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            mo403l(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m406o(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f807a1.m53296a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f807a1.m53297b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f807a1.m53298c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f807a1.m53299d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f814e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (akg1.m26233r(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (akg1.m26233r(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f815f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (akg1.m26233r(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (akg1.m26233r(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: e */
    public final void mo88e(View view, View view2, int i, int i2) {
        this.f805Z0.m73601j(i, i2);
        this.f807a1.m53303h(2, i2);
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: f */
    public final void mo89f(View view, int i) {
        this.f805Z0.m73603n(i);
        mo403l(i);
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: g */
    public final void mo90g(View view, int i, int i2, int[] iArr, int i3) {
        this.f807a1.m53298c(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f805Z0.m73599g();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f809b1 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f809b1 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f809b1;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f807a1.m53301f(0);
    }

    @Override // p204p.lgj0
    /* JADX INFO: renamed from: i */
    public final void mo92i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m410t(i4, i5, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f807a1.f112201d;
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: j */
    public final void mo93j(View view, int i, int i2, int i3, int i4, int i5) {
        m410t(i4, i5, null);
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: k */
    public final boolean mo94k(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // p204p.hgj0
    /* JADX INFO: renamed from: l */
    public final void mo403l(int i) {
        this.f807a1.m53304i(i);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m404m(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m409s(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m415y(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f810c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m415y(m405n(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m409s(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final int m405n(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX INFO: renamed from: o */
    public final boolean m406o(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f810c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m408q(33) : m404m(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m408q(130) : m404m(130);
                    }
                    if (keyCode == 62) {
                        m413w(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m408q(33);
                    }
                    if (keyCode == 93) {
                        return m408q(130);
                    }
                    if (keyCode == 122) {
                        m413w(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m413w(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f819t = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        boolean z;
        if (motionEvent.getAction() == 8 && !this.f792M0) {
            if (dxf1.m37250z(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i = 9;
                width = (int) motionEvent.getX();
            } else if (dxf1.m37250z(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m415y(-((int) (getVerticalScrollFactorCompat() * axisValue)), i, motionEvent, width, 1, dxf1.m37250z(motionEvent, 8194));
                if (i != 0) {
                    tir tirVar = this.f813d1;
                    ucj0 ucj0Var = tirVar.f220729b;
                    int[] iArr = tirVar.f220735h;
                    int source = motionEvent.getSource();
                    int deviceId = motionEvent.getDeviceId();
                    if (tirVar.f220733f == source && tirVar.f220734g == deviceId && tirVar.f220732e == i) {
                        z = false;
                    } else {
                        eqp.m39732a(tirVar.f220728a, iArr, motionEvent, i);
                        tirVar.f220733f = source;
                        tirVar.f220734g = deviceId;
                        tirVar.f220732e = i;
                        z = true;
                    }
                    if (iArr[0] == Integer.MAX_VALUE) {
                        VelocityTracker velocityTracker = tirVar.f220730c;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            tirVar.f220730c = null;
                            return true;
                        }
                    } else {
                        if (tirVar.f220730c == null) {
                            tirVar.f220730c = VelocityTracker.obtain();
                        }
                        float fM82781i = ucj0Var.m82781i() * eqp.m39733c(tirVar.f220730c, motionEvent, i);
                        float fSignum = Math.signum(fM82781i);
                        if (z || (fSignum != Math.signum(tirVar.f220731d) && fSignum != 0.0f)) {
                            ucj0Var.m82786r();
                        }
                        if (Math.abs(fM82781i) >= iArr[0]) {
                            int i2 = iArr[1];
                            float fMax = Math.max(-i2, Math.min(fM82781i, i2));
                            tirVar.f220731d = ucj0Var.m82785q(fMax) ? fMax : 0.0f;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f792M0) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m402B(motionEvent) && this.f812d.isFinished()) {
                        z = false;
                    }
                    this.f792M0 = z;
                    velocityTracker = this.f793N0;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f793N0 = null;
                    }
                } else {
                    this.f817h = y;
                    this.f799T0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f793N0;
                    if (velocityTracker3 == null) {
                        this.f793N0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f793N0.addMovement(motionEvent);
                    this.f812d.computeScrollOffset();
                    if (!m402B(motionEvent) && this.f812d.isFinished()) {
                        z = false;
                    }
                    this.f792M0 = z;
                    this.f807a1.m53303h(2, 0);
                }
            } else {
                if (!m402B(motionEvent)) {
                    z = false;
                }
                this.f792M0 = z;
                velocityTracker = this.f793N0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f793N0 = null;
                }
            }
        } else if (i == 1) {
            this.f792M0 = false;
            this.f799T0 = -1;
            velocityTracker2 = this.f793N0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f793N0 = null;
            }
            if (this.f812d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            mo403l(0);
        } else if (i == 2) {
            int i2 = this.f799T0;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f817h) > this.f796Q0 && (2 & getNestedScrollAxes()) == 0) {
                    this.f792M0 = true;
                    this.f817h = y2;
                    if (this.f793N0 == null) {
                        this.f793N0 = VelocityTracker.obtain();
                    }
                    this.f793N0.addMovement(motionEvent);
                    this.f802W0 = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i == 3) {
            this.f792M0 = false;
            this.f799T0 = -1;
            velocityTracker2 = this.f793N0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f793N0 = null;
            }
            if (this.f812d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            mo403l(0);
        } else if (i == 6) {
            m411u(motionEvent);
        }
        return this.f792M0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f818i = false;
        View view = this.f791L0;
        if (view != null && m400r(view, this)) {
            View view2 = this.f791L0;
            Rect rect = this.f810c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM405n = m405n(rect);
            if (iM405n != 0) {
                scrollBy(0, iM405n);
            }
        }
        this.f791L0 = null;
        if (!this.f819t) {
            if (this.f804Y0 != null) {
                scrollTo(getScrollX(), this.f804Y0.f79686a);
                this.f804Y0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f819t = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f794O0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m407p((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f807a1.m53297b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f807a1.m53298c(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m410t(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo88e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m409s(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ggj0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ggj0 ggj0Var = (ggj0) parcelable;
        super.onRestoreInstanceState(ggj0Var.getSuperState());
        this.f804Y0 = ggj0Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ggj0 ggj0Var = new ggj0(super.onSaveInstanceState());
        ggj0Var.f79686a = getScrollY();
        return ggj0Var;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        egj0 egj0Var = this.f811c1;
        if (egj0Var != null) {
            egj0Var.mo34696b(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m409s(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f810c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM405n = m405n(rect);
        if (iM405n != 0) {
            if (this.f795P0) {
                m401A(0, iM405n, false);
            } else {
                scrollBy(0, iM405n);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo94k(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo89f(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM70544y;
        int iRound;
        int i;
        ViewParent parent2;
        if (this.f793N0 == null) {
            this.f793N0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f802W0 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f802W0);
        jgj0 jgj0Var = this.f807a1;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f814e;
            EdgeEffect edgeEffect2 = this.f815f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f793N0;
                velocityTracker.computeCurrentVelocity(1000, this.f798S0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f799T0);
                if (Math.abs(yVelocity) >= this.f797R0) {
                    if (pp91.m70536q(edgeEffect) != 0.0f) {
                        if (m416z(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            m407p(-yVelocity);
                        }
                    } else if (pp91.m70536q(edgeEffect2) != 0.0f) {
                        int i2 = -yVelocity;
                        if (m416z(edgeEffect2, i2)) {
                            edgeEffect2.onAbsorb(i2);
                        } else {
                            m407p(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!jgj0Var.m53297b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m407p(i3);
                        }
                    }
                } else if (this.f812d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f799T0 = -1;
                this.f792M0 = false;
                VelocityTracker velocityTracker2 = this.f793N0;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f793N0 = null;
                }
                mo403l(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f799T0);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f817h - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (pp91.m70536q(edgeEffect) != 0.0f) {
                        fM70544y = -pp91.m70544y(edgeEffect, -height, x);
                        if (pp91.m70536q(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (pp91.m70536q(edgeEffect2) != 0.0f) {
                        fM70544y = pp91.m70544y(edgeEffect2, height, 1.0f - x);
                        if (pp91.m70536q(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i4 - iRound;
                        if (!this.f792M0 && Math.abs(i) > this.f796Q0) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f792M0 = true;
                            if (i > 0) {
                                i -= this.f796Q0;
                            } else {
                                i += this.f796Q0;
                            }
                        }
                        if (this.f792M0) {
                            int iM415y = m415y(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f817h = y - iM415y;
                            this.f802W0 += iM415y;
                        }
                    }
                    f = fM70544y;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i4 - iRound;
                    if (!this.f792M0) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f792M0 = true;
                        if (i > 0) {
                            i -= this.f796Q0;
                        } else {
                            i += this.f796Q0;
                        }
                    }
                    if (this.f792M0) {
                        int iM415y2 = m415y(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f817h = y - iM415y2;
                        this.f802W0 += iM415y2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f792M0 && getChildCount() > 0) {
                    if (this.f812d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f799T0 = -1;
                this.f792M0 = false;
                VelocityTracker velocityTracker3 = this.f793N0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f793N0 = null;
                }
                mo403l(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f817h = (int) motionEvent.getY(actionIndex);
                this.f799T0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m411u(motionEvent);
                this.f817h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f799T0));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f792M0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f812d.isFinished()) {
                this.f812d.abortAnimation();
                mo403l(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f817h = y2;
            this.f799T0 = pointerId;
            jgj0Var.m53303h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f793N0;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m407p(int i) {
        if (getChildCount() > 0) {
            this.f812d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, 0, 0);
            this.f807a1.m53303h(2, 1);
            this.f803X0 = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                nat.m64040b(this, Math.abs(this.f812d.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m408q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f810c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m414x(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f818i) {
            this.f791L0 = view2;
        } else {
            Rect rect = this.f810c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM405n = m405n(rect);
            if (iM405n != 0) {
                scrollBy(0, iM405n);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM405n = m405n(rect);
        boolean z2 = iM405n != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM405n);
                return z2;
            }
            m401A(0, iM405n, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f793N0) != null) {
            velocityTracker.recycle();
            this.f793N0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f818i = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m409s(View view, int i, int i2) {
        Rect rect = this.f810c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f794O0) {
            this.f794O0 = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f807a1.m53302g(z);
    }

    public void setOnScrollChangeListener(egj0 egj0Var) {
        this.f811c1 = egj0Var;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f795P0 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f807a1.m53303h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        mo403l(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m410t(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f807a1.m53299d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX INFO: renamed from: u */
    public final void m411u(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f799T0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f817h = (int) motionEvent.getY(i);
            this.f799T0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f793N0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m412v(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && !this.f807a1.m53301f(1)) {
                this.f812d.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.f812d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m413w(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f810c;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m414x(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: x */
    public final boolean m414x(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            m415y(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX INFO: renamed from: y */
    public final int m415y(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        jgj0 jgj0Var = this.f807a1;
        if (i4 == 1) {
            jgj0Var.m53303h(2, i4);
        }
        boolean zM53298c = this.f807a1.m53298c(0, i, i4, this.f801V0, this.f800U0);
        int[] iArr = this.f800U0;
        int[] iArr2 = this.f801V0;
        if (zM53298c) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = m412v(i5, 0, scrollY, scrollRange) && !jgj0Var.m53301f(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().m39400c(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.f807a1.m53299d(0, scrollY2, 0, i5 - scrollY2, this.f800U0, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f815f;
        EdgeEffect edgeEffect2 = this.f814e;
        if (i9 >= 0) {
            if (i9 > scrollRange && z4) {
                pp91.m70544y(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    z2 = false;
                    getScrollFeedbackProvider().m39399b(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                } else {
                    z2 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.f793N0) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                mo403l(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z4) {
            pp91.m70544y(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().m39399b(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z3 = z2;
        } else {
            postInvalidateOnAnimation();
            z3 = z2;
        }
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            mo403l(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m416z(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM70536q = pp91.m70536q(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f806a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f788e1;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM70536q;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i);
        this.f810c = new Rect();
        this.f818i = true;
        this.f819t = false;
        this.f791L0 = null;
        this.f792M0 = false;
        this.f795P0 = true;
        this.f799T0 = -1;
        this.f800U0 = new int[2];
        this.f801V0 = new int[2];
        this.f813d1 = new tir(getContext(), new ucj0(this, 1));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = qqs.m73578a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f814e = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = qqs.m73578a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f815f = edgeEffect2;
        this.f806a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f812d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f796Q0 = viewConfiguration.getScaledTouchSlop();
        this.f797R0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f798S0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f790g1, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f805Z0 = new qr8(false);
        this.f807a1 = new jgj0(this);
        setNestedScrollingEnabled(true);
        mec1.m61564p(this, f789f1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
