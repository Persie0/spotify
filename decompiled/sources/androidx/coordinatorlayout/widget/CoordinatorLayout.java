package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p204p.aec1;
import p204p.cec1;
import p204p.dqk;
import p204p.eqk;
import p204p.fqk;
import p204p.gqk;
import p204p.gug1;
import p204p.hqk;
import p204p.hwd;
import p204p.iin;
import p204p.iqk;
import p204p.kgj0;
import p204p.kp7;
import p204p.lgj0;
import p204p.lzj;
import p204p.m2u0;
import p204p.mec1;
import p204p.q9q0;
import p204p.qr8;
import p204p.svg1;
import p204p.swd1;
import p204p.thc1;
import p204p.zsb;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements kgj0, lgj0 {

    /* JADX INFO: renamed from: U0 */
    public static final String f744U0;

    /* JADX INFO: renamed from: V0 */
    public static final Class[] f745V0;

    /* JADX INFO: renamed from: W0 */
    public static final ThreadLocal f746W0;

    /* JADX INFO: renamed from: X0 */
    public static final hwd f747X0;

    /* JADX INFO: renamed from: Y0 */
    public static final q9q0 f748Y0;

    /* JADX INFO: renamed from: L0 */
    public View f749L0;

    /* JADX INFO: renamed from: M0 */
    public zsb f750M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f751N0;

    /* JADX INFO: renamed from: O0 */
    public swd1 f752O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f753P0;

    /* JADX INFO: renamed from: Q0 */
    public Drawable f754Q0;

    /* JADX INFO: renamed from: R0 */
    public ViewGroup.OnHierarchyChangeListener f755R0;

    /* JADX INFO: renamed from: S0 */
    public kp7 f756S0;

    /* JADX INFO: renamed from: T0 */
    public final qr8 f757T0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f758a;

    /* JADX INFO: renamed from: b */
    public final iin f759b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f760c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f761d;

    /* JADX INFO: renamed from: e */
    public final int[] f762e;

    /* JADX INFO: renamed from: f */
    public final int[] f763f;

    /* JADX INFO: renamed from: g */
    public boolean f764g;

    /* JADX INFO: renamed from: h */
    public boolean f765h;

    /* JADX INFO: renamed from: i */
    public final int[] f766i;

    /* JADX INFO: renamed from: t */
    public View f767t;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f744U0 = r0 != null ? r0.getName() : null;
        f747X0 = new hwd(11);
        f745V0 = new Class[]{Context.class, AttributeSet.class};
        f746W0 = new ThreadLocal();
        f748Y0 = new q9q0(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static Rect m365a() {
        Rect rect = (Rect) f748Y0.mo72406a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: d */
    public static hqk m366d(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof hqk) {
            return new hqk((hqk) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new hqk((ViewGroup.MarginLayoutParams) layoutParams) : new hqk(layoutParams);
    }

    /* JADX INFO: renamed from: o */
    public static void m367o(int i, Rect rect, Rect rect2, hqk hqkVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = hqkVar.f94200c;
        if (i4 == 0) {
            i4 = 17;
        }
        int iM45782x = gug1.m45782x(i4, i);
        int i5 = hqkVar.f94201d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i5 |= 48;
        }
        int iM45782x2 = gug1.m45782x(i5, i);
        int i6 = iM45782x & 7;
        int i7 = iM45782x & ContentType.LONG_FORM_ON_DEMAND;
        int i8 = iM45782x2 & 7;
        int i9 = iM45782x2 & ContentType.LONG_FORM_ON_DEMAND;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static hqk m368p(View view) {
        hqk hqkVar = (hqk) view.getLayoutParams();
        if (!hqkVar.f94199b) {
            if (view instanceof dqk) {
                hqkVar.m48293b(((dqk) view).getBehavior());
                hqkVar.f94199b = true;
                return hqkVar;
            }
            fqk fqkVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                fqkVar = (fqk) superclass.getAnnotation(fqk.class);
                if (fqkVar != null) {
                    break;
                }
            }
            if (fqkVar != null) {
                try {
                    hqkVar.m48293b((eqk) fqkVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    fqkVar.value().getClass();
                }
            }
            hqkVar.f94199b = true;
        }
        return hqkVar;
    }

    /* JADX INFO: renamed from: x */
    public static void m369x(View view, int i) {
        hqk hqkVar = (hqk) view.getLayoutParams();
        int i2 = hqkVar.f94206i;
        if (i2 != i) {
            WeakHashMap weakHashMap = mec1.f142677a;
            view.offsetLeftAndRight(i - i2);
            hqkVar.f94206i = i;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m370y(View view, int i) {
        hqk hqkVar = (hqk) view.getLayoutParams();
        int i2 = hqkVar.f94207j;
        if (i2 != i) {
            WeakHashMap weakHashMap = mec1.f142677a;
            view.offsetTopAndBottom(i - i2);
            hqkVar.f94207j = i;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m371b(hqk hqkVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) hqkVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) hqkVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) hqkVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) hqkVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: c */
    public final void m372c(View view) {
        List listM50756s = this.f759b.m50756s(view);
        if (listM50756s == null || listM50756s.isEmpty()) {
            return;
        }
        for (int i = 0; i < listM50756s.size(); i++) {
            View view2 = (View) listM50756s.get(i);
            eqk eqkVar = ((hqk) view2.getLayoutParams()).f94198a;
            if (eqkVar != null) {
                eqkVar.mo1551d(view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof hqk) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        eqk eqkVar = ((hqk) view.getLayoutParams()).f94198a;
        if (eqkVar != null) {
            eqkVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f754Q0;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: e */
    public final void mo88e(View view, View view2, int i, int i2) {
        this.f757T0.m73601j(i, i2);
        this.f749L0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((hqk) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: f */
    public final void mo89f(View view, int i) {
        this.f757T0.m73603n(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            hqk hqkVar = (hqk) childAt.getLayoutParams();
            if (hqkVar.m48292a(i)) {
                eqk eqkVar = hqkVar.f94198a;
                if (eqkVar != null) {
                    eqkVar.mo1545r(this, childAt, view, i);
                }
                if (i == 0) {
                    hqkVar.f94210m = false;
                } else if (i == 1) {
                    hqkVar.f94211n = false;
                }
                hqkVar.f94212o = false;
            }
        }
        this.f749L0 = null;
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: g */
    public final void mo90g(View view, int i, int i2, int[] iArr, int i3) {
        eqk eqkVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                hqk hqkVar = (hqk) childAt.getLayoutParams();
                if (hqkVar.m48292a(i3) && (eqkVar = hqkVar.f94198a) != null) {
                    int[] iArr2 = this.f762e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    eqkVar.mo1540k(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m377r(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hqk(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m366d(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        m381v();
        return Collections.unmodifiableList(this.f758a);
    }

    public final swd1 getLastWindowInsets() {
        return this.f752O0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f757T0.m73599g();
    }

    public Drawable getStatusBarBackground() {
        return this.f754Q0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX INFO: renamed from: h */
    public final void m373h(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m375n(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // p204p.lgj0
    /* JADX INFO: renamed from: i */
    public final void mo92i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        eqk eqkVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                hqk hqkVar = (hqk) childAt.getLayoutParams();
                if (hqkVar.m48292a(i5) && (eqkVar = hqkVar.f94198a) != null) {
                    int[] iArr2 = this.f762e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    eqkVar.mo1541m(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m377r(1);
        }
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: j */
    public final void mo93j(View view, int i, int i2, int i3, int i4, int i5) {
        mo92i(view, i, i2, i3, i4, 0, this.f763f);
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: k */
    public final boolean mo94k(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                hqk hqkVar = (hqk) childAt.getLayoutParams();
                eqk eqkVar = hqkVar.f94198a;
                if (eqkVar != null) {
                    boolean zMo1544q = eqkVar.mo1544q(this, childAt, view, view2, i, i2);
                    z |= zMo1544q;
                    if (i2 == 0) {
                        hqkVar.f94210m = zMo1544q;
                    } else if (i2 == 1) {
                        hqkVar.f94211n = zMo1544q;
                    }
                } else if (i2 == 0) {
                    hqkVar.f94210m = false;
                } else if (i2 == 1) {
                    hqkVar.f94211n = false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList m374m(View view) {
        ArrayList arrayListM50757t = this.f759b.m50757t(view);
        ArrayList arrayList = this.f761d;
        arrayList.clear();
        if (arrayListM50757t != null) {
            arrayList.addAll(arrayListM50757t);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final void m375n(Rect rect, View view) {
        ThreadLocal threadLocal = thc1.f220400a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = thc1.f220400a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        thc1.m80834a(this, view, matrix);
        ThreadLocal threadLocal3 = thc1.f220401b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m382w(false);
        if (this.f751N0) {
            if (this.f750M0 == null) {
                this.f750M0 = new zsb(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f750M0);
        }
        if (this.f752O0 == null) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (getFitsSystemWindows()) {
                aec1.m25717c(this);
            }
        }
        this.f765h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m382w(false);
        if (this.f751N0 && this.f750M0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f750M0);
        }
        View view = this.f749L0;
        if (view != null) {
            mo89f(view, 0);
        }
        this.f765h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f753P0 || this.f754Q0 == null) {
            return;
        }
        swd1 swd1Var = this.f752O0;
        int iM79540d = swd1Var != null ? swd1Var.m79540d() : 0;
        if (iM79540d > 0) {
            this.f754Q0.setBounds(0, 0, getWidth(), iM79540d);
            this.f754Q0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m382w(true);
        }
        boolean zM380u = m380u(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM380u;
        }
        m382w(true);
        return zM380u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        eqk eqkVar;
        WeakHashMap weakHashMap = mec1.f142677a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f758a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((eqkVar = ((hqk) view.getLayoutParams()).f94198a) == null || !eqkVar.mo1538h(this, view, layoutDirection))) {
                m378s(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:75:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0163  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:85:0x018d  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        ArrayList arrayList;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        eqk eqkVar;
        int i4;
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        boolean zMo1539i;
        int i11;
        int i12;
        int iM45782x;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m381v();
        int childCount = coordinatorLayout.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            if (coordinatorLayout.f759b.m50759v(coordinatorLayout.getChildAt(i13))) {
                z = true;
                break;
            }
            i13++;
        }
        if (z != coordinatorLayout.f751N0) {
            if (z) {
                if (coordinatorLayout.f765h) {
                    if (coordinatorLayout.f750M0 == null) {
                        coordinatorLayout.f750M0 = new zsb(coordinatorLayout, 1);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f750M0);
                }
                coordinatorLayout.f751N0 = true;
            } else {
                if (coordinatorLayout.f765h && coordinatorLayout.f750M0 != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f750M0);
                }
                coordinatorLayout.f751N0 = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = mec1.f142677a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i14 = paddingLeft + paddingRight;
        int i15 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.f752O0 != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList2 = coordinatorLayout.f758a;
        int size3 = arrayList2.size();
        int i16 = 0;
        int iCombineMeasuredStates = 0;
        while (i16 < size3) {
            View view2 = (View) arrayList2.get(i16);
            int i17 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i5 = size3;
                i10 = i16;
                i8 = paddingRight;
                suggestedMinimumWidth = i17;
                z2 = false;
                i6 = paddingLeft;
            } else {
                hqk hqkVar = (hqk) view2.getLayoutParams();
                int i18 = hqkVar.f94202e;
                if (i18 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                    arrayList = arrayList2;
                } else {
                    i3 = suggestedMinimumHeight;
                    int[] iArr = coordinatorLayout.f766i;
                    if (iArr == null) {
                        coordinatorLayout.toString();
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        if (i18 < 0 || i18 >= iArr.length) {
                            coordinatorLayout.toString();
                        } else {
                            i11 = iArr[i18];
                        }
                        i12 = hqkVar.f94200c;
                        if (i12 == 0) {
                            i12 = 8388661;
                        }
                        iM45782x = gug1.m45782x(i12, layoutDirection) & 7;
                        if ((iM45782x != 3 && !z3) || (iM45782x == 5 && z3)) {
                            iMax = Math.max(0, (size - paddingRight) - i11);
                        } else if ((iM45782x != 5 && !z3) || (iM45782x == 3 && z3)) {
                            iMax = Math.max(0, i11 - paddingLeft);
                        }
                        if (z4 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iM79539c = coordinatorLayout.f752O0.m79539c() + coordinatorLayout.f752O0.m79538b();
                            int iM79537a = coordinatorLayout.f752O0.m79537a() + coordinatorLayout.f752O0.m79540d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM79539c, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM79537a, mode2);
                        }
                        eqkVar = hqkVar.f94198a;
                        if (eqkVar != null) {
                            int i19 = iMax;
                            int i20 = iMakeMeasureSpec;
                            i5 = size3;
                            i6 = paddingLeft;
                            i7 = i17;
                            int i21 = i3;
                            i8 = paddingRight;
                            i9 = i21;
                            z2 = false;
                            i10 = i16;
                            int i22 = iMakeMeasureSpec2;
                            zMo1539i = eqkVar.mo1539i(this, view2, i20, i19, i22);
                            view = view2;
                            iMakeMeasureSpec = i20;
                            iMax = i19;
                            i4 = i22;
                            if (zMo1539i) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) hqkVar).leftMargin + ((ViewGroup.MarginLayoutParams) hqkVar).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) hqkVar).topMargin + ((ViewGroup.MarginLayoutParams) hqkVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i23 = size3;
                            i4 = iMakeMeasureSpec2;
                            view = view2;
                            i5 = i23;
                            i6 = paddingLeft;
                            i7 = i17;
                            int i24 = i3;
                            i8 = paddingRight;
                            i9 = i24;
                            i10 = i16;
                            z2 = false;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) hqkVar).leftMargin + ((ViewGroup.MarginLayoutParams) hqkVar).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) hqkVar).topMargin + ((ViewGroup.MarginLayoutParams) hqkVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    }
                    i11 = 0;
                    i12 = hqkVar.f94200c;
                    if (i12 == 0) {
                        i12 = 8388661;
                    }
                    iM45782x = gug1.m45782x(i12, layoutDirection) & 7;
                    if (iM45782x != 3) {
                        if (iM45782x != 5) {
                        }
                    } else if (iM45782x != 5) {
                    }
                    if (z4) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    eqkVar = hqkVar.f94198a;
                    if (eqkVar != null) {
                        int i110 = iMax;
                        int i25 = iMakeMeasureSpec;
                        i5 = size3;
                        i6 = paddingLeft;
                        i7 = i17;
                        int i26 = i3;
                        i8 = paddingRight;
                        i9 = i26;
                        z2 = false;
                        i10 = i16;
                        int i27 = iMakeMeasureSpec2;
                        zMo1539i = eqkVar.mo1539i(this, view2, i25, i110, i27);
                        view = view2;
                        iMakeMeasureSpec = i25;
                        iMax = i110;
                        i4 = i27;
                        if (zMo1539i) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) hqkVar).leftMargin + ((ViewGroup.MarginLayoutParams) hqkVar).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) hqkVar).topMargin + ((ViewGroup.MarginLayoutParams) hqkVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i28 = size3;
                        i4 = iMakeMeasureSpec2;
                        view = view2;
                        i5 = i28;
                        i6 = paddingLeft;
                        i7 = i17;
                        int i29 = i3;
                        i8 = paddingRight;
                        i9 = i29;
                        i10 = i16;
                        z2 = false;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) hqkVar).leftMargin + ((ViewGroup.MarginLayoutParams) hqkVar).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) hqkVar).topMargin + ((ViewGroup.MarginLayoutParams) hqkVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                iMax = 0;
                if (z4) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                eqkVar = hqkVar.f94198a;
                if (eqkVar != null) {
                    int i111 = iMax;
                    int i210 = iMakeMeasureSpec;
                    i5 = size3;
                    i6 = paddingLeft;
                    i7 = i17;
                    int i211 = i3;
                    i8 = paddingRight;
                    i9 = i211;
                    z2 = false;
                    i10 = i16;
                    int i212 = iMakeMeasureSpec2;
                    zMo1539i = eqkVar.mo1539i(this, view2, i210, i111, i212);
                    view = view2;
                    iMakeMeasureSpec = i210;
                    iMax = i111;
                    i4 = i212;
                    if (zMo1539i) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) hqkVar).leftMargin + ((ViewGroup.MarginLayoutParams) hqkVar).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) hqkVar).topMargin + ((ViewGroup.MarginLayoutParams) hqkVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i213 = size3;
                    i4 = iMakeMeasureSpec2;
                    view = view2;
                    i5 = i213;
                    i6 = paddingLeft;
                    i7 = i17;
                    int i214 = i3;
                    i8 = paddingRight;
                    i9 = i214;
                    i10 = i16;
                    z2 = false;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) hqkVar).leftMargin + ((ViewGroup.MarginLayoutParams) hqkVar).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) hqkVar).topMargin + ((ViewGroup.MarginLayoutParams) hqkVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i16 = i10 + 1;
            size3 = i5;
            paddingLeft = i6;
            paddingRight = i8;
            arrayList2 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i30), View.resolveSizeAndState(suggestedMinimumHeight, i2, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                hqk hqkVar = (hqk) childAt.getLayoutParams();
                if (hqkVar.m48292a(0)) {
                    eqk eqkVar = hqkVar.f94198a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        eqk eqkVar;
        int childCount = getChildCount();
        boolean zMo1589j = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                hqk hqkVar = (hqk) childAt.getLayoutParams();
                if (hqkVar.m48292a(0) && (eqkVar = hqkVar.f94198a) != null) {
                    zMo1589j |= eqkVar.mo1589j(this, view, f, f2);
                }
            }
        }
        return zMo1589j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo90g(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo93j(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo88e(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof iqk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        iqk iqkVar = (iqk) parcelable;
        super.onRestoreInstanceState(iqkVar.m66261c());
        SparseArray sparseArray = iqkVar.f104798c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            eqk eqkVar = m368p(childAt).f94198a;
            if (id != -1 && eqkVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                eqkVar.mo1542o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1543p;
        iqk iqkVar = new iqk(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            eqk eqkVar = ((hqk) childAt.getLayoutParams()).f94198a;
            if (id != -1 && eqkVar != null && (parcelableMo1543p = eqkVar.mo1543p(childAt)) != null) {
                sparseArray.append(id, parcelableMo1543p);
            }
        }
        iqkVar.f104798c = sparseArray;
        return iqkVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo94k(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo89f(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM380u;
        boolean zMo1563s;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f767t == null) {
            zM380u = m380u(motionEvent, 1);
            if (!zM380u) {
                zMo1563s = false;
            }
            motionEventObtain = null;
            if (this.f767t == null) {
                zMo1563s |= super.onTouchEvent(motionEvent);
            } else if (zM380u) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo1563s;
            }
            m382w(false);
            return zMo1563s;
        }
        zM380u = false;
        eqk eqkVar = ((hqk) this.f767t.getLayoutParams()).f94198a;
        if (eqkVar != null) {
            zMo1563s = eqkVar.mo1563s(this, this.f767t, motionEvent);
        } else {
            zMo1563s = false;
        }
        motionEventObtain = null;
        if (this.f767t == null) {
            zMo1563s |= super.onTouchEvent(motionEvent);
        } else if (zM380u) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m382w(false);
        return zMo1563s;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m376q(View view, int i, int i2) {
        q9q0 q9q0Var = f748Y0;
        Rect rectM365a = m365a();
        m375n(rectM365a, view);
        try {
            return rectM365a.contains(i, i2);
        } finally {
            rectM365a.setEmpty();
            q9q0Var.mo72407g(rectM365a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX INFO: renamed from: r */
    public final void m377r(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zMo1551d;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        hqk hqkVar;
        int i10;
        View view;
        eqk eqkVar;
        WeakHashMap weakHashMap = mec1.f142677a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f758a;
        int size = arrayList2.size();
        Rect rectM365a = m365a();
        Rect rectM365a2 = m365a();
        Rect rectM365a3 = m365a();
        int i11 = 0;
        while (true) {
            q9q0 q9q0Var = f748Y0;
            if (i11 >= size) {
                Rect rect2 = rectM365a3;
                rectM365a.setEmpty();
                q9q0Var.mo72407g(rectM365a);
                rectM365a2.setEmpty();
                q9q0Var.mo72407g(rectM365a2);
                rect2.setEmpty();
                q9q0Var.mo72407g(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            hqk hqkVar2 = (hqk) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i12 = 0;
                while (i12 < i11) {
                    if (hqkVar2.f94209l == ((View) arrayList2.get(i12))) {
                        hqk hqkVar3 = (hqk) view2.getLayoutParams();
                        if (hqkVar3.f94208k != null) {
                            Rect rectM365a4 = m365a();
                            Rect rectM365a5 = m365a();
                            hqk hqkVar4 = hqkVar2;
                            Rect rectM365a6 = m365a();
                            m375n(rectM365a4, hqkVar3.f94208k);
                            m373h(view2, rectM365a5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            hqkVar = hqkVar4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            m367o(layoutDirection, rectM365a4, rectM365a6, hqkVar3, measuredWidth, measuredHeight);
                            boolean z3 = (rectM365a6.left == rectM365a5.left && rectM365a6.top == rectM365a5.top) ? false : true;
                            m371b(hqkVar3, rectM365a6, measuredWidth, measuredHeight);
                            int i13 = rectM365a6.left - rectM365a5.left;
                            int i14 = rectM365a6.top - rectM365a5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = mec1.f142677a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = mec1.f142677a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (eqkVar = hqkVar3.f94198a) != null) {
                                eqkVar.mo1551d(view, hqkVar3.f94208k);
                            }
                            rectM365a4.setEmpty();
                            q9q0Var.mo72407g(rectM365a4);
                            rectM365a5.setEmpty();
                            q9q0Var.mo72407g(rectM365a5);
                            rectM365a6.setEmpty();
                            q9q0Var.mo72407g(rectM365a6);
                        } else {
                            hqkVar = hqkVar2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        hqkVar = hqkVar2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    hqkVar2 = hqkVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectM365a3 = rectM365a3;
                }
                ArrayList arrayList3 = arrayList2;
                hqk hqkVar5 = hqkVar2;
                int i15 = size;
                Rect rect3 = rectM365a3;
                i2 = i11;
                View view4 = view2;
                m373h(view4, rectM365a2, true);
                if (hqkVar5.f94204g != 0 && !rectM365a2.isEmpty()) {
                    int iM45782x = gug1.m45782x(hqkVar5.f94204g, layoutDirection);
                    int i16 = iM45782x & ContentType.LONG_FORM_ON_DEMAND;
                    if (i16 == 48) {
                        rectM365a.top = Math.max(rectM365a.top, rectM365a2.bottom);
                    } else if (i16 == 80) {
                        rectM365a.bottom = Math.max(rectM365a.bottom, getHeight() - rectM365a2.top);
                    }
                    int i17 = iM45782x & 7;
                    if (i17 == 3) {
                        rectM365a.left = Math.max(rectM365a.left, rectM365a2.right);
                    } else if (i17 == 5) {
                        rectM365a.right = Math.max(rectM365a.right, getWidth() - rectM365a2.left);
                    }
                }
                if (hqkVar5.f94205h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = mec1.f142677a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        hqk hqkVar6 = (hqk) view4.getLayoutParams();
                        eqk eqkVar2 = hqkVar6.f94198a;
                        Rect rectM365a7 = m365a();
                        Rect rectM365a8 = m365a();
                        rectM365a8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (eqkVar2 == null || !eqkVar2.mo1621a(view4)) {
                            rectM365a7.set(rectM365a8);
                        } else if (!rectM365a8.contains(rectM365a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM365a7.toShortString() + " | Bounds:" + rectM365a8.toShortString());
                        }
                        rectM365a8.setEmpty();
                        q9q0Var.mo72407g(rectM365a8);
                        if (rectM365a7.isEmpty()) {
                            rectM365a7.setEmpty();
                            q9q0Var.mo72407g(rectM365a7);
                        } else {
                            int iM45782x2 = gug1.m45782x(hqkVar6.f94205h, layoutDirection);
                            if ((iM45782x2 & 48) != 48 || (i8 = (rectM365a7.top - ((ViewGroup.MarginLayoutParams) hqkVar6).topMargin) - hqkVar6.f94207j) >= (i9 = rectM365a.top)) {
                                z = false;
                            } else {
                                m370y(view4, i9 - i8);
                                z = true;
                            }
                            if ((iM45782x2 & 80) == 80 && (height = ((getHeight() - rectM365a7.bottom) - ((ViewGroup.MarginLayoutParams) hqkVar6).bottomMargin) + hqkVar6.f94207j) < (i7 = rectM365a.bottom)) {
                                m370y(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                m370y(view4, 0);
                            }
                            if ((iM45782x2 & 3) != 3 || (i5 = (rectM365a7.left - ((ViewGroup.MarginLayoutParams) hqkVar6).leftMargin) - hqkVar6.f94206i) >= (i6 = rectM365a.left)) {
                                z2 = false;
                            } else {
                                m369x(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((iM45782x2 & 5) == 5 && (width = ((getWidth() - rectM365a7.right) - ((ViewGroup.MarginLayoutParams) hqkVar6).rightMargin) + hqkVar6.f94206i) < (i4 = rectM365a.right)) {
                                m369x(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                m369x(view4, 0);
                            }
                            rectM365a7.setEmpty();
                            q9q0Var.mo72407g(rectM365a7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((hqk) view4.getLayoutParams()).f94213p);
                    if (rect.equals(rectM365a2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((hqk) view4.getLayoutParams()).f94213p.set(rectM365a2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i18);
                    hqk hqkVar7 = (hqk) view5.getLayoutParams();
                    eqk eqkVar3 = hqkVar7.f94198a;
                    if (eqkVar3 != null && eqkVar3.mo1550b(view5, view4)) {
                        if (i == 0 && hqkVar7.f94212o) {
                            hqkVar7.f94212o = false;
                        } else {
                            if (i != 2) {
                                zMo1551d = eqkVar3.mo1551d(view5, view4);
                            } else {
                                eqkVar3.mo1552e(this, view4);
                                zMo1551d = true;
                            }
                            if (i == 1) {
                                hqkVar7.f94212o = zMo1551d;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                rect = rectM365a3;
                i2 = i11;
            }
            i11 = i2 + 1;
            rectM365a3 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        eqk eqkVar = ((hqk) view.getLayoutParams()).f94198a;
        if (eqkVar == null || !eqkVar.mo1553n(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f764g) {
            return;
        }
        m382w(false);
        this.f764g = true;
    }

    /* JADX INFO: renamed from: s */
    public final void m378s(View view, int i) {
        int i2;
        hqk hqkVar = (hqk) view.getLayoutParams();
        View view2 = hqkVar.f94208k;
        if (view2 == null && hqkVar.f94203f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        q9q0 q9q0Var = f748Y0;
        if (view2 != null) {
            Rect rectM365a = m365a();
            Rect rectM365a2 = m365a();
            try {
                m375n(rectM365a, view2);
                hqk hqkVar2 = (hqk) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m367o(i, rectM365a, rectM365a2, hqkVar2, measuredWidth, measuredHeight);
                m371b(hqkVar2, rectM365a2, measuredWidth, measuredHeight);
                view.layout(rectM365a2.left, rectM365a2.top, rectM365a2.right, rectM365a2.bottom);
                return;
            } finally {
                rectM365a.setEmpty();
                q9q0Var.mo72407g(rectM365a);
                rectM365a2.setEmpty();
                q9q0Var.mo72407g(rectM365a2);
            }
        }
        int i3 = hqkVar.f94202e;
        if (i3 < 0) {
            hqk hqkVar3 = (hqk) view.getLayoutParams();
            Rect rectM365a3 = m365a();
            rectM365a3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) hqkVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) hqkVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) hqkVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) hqkVar3).bottomMargin);
            if (this.f752O0 != null) {
                WeakHashMap weakHashMap = mec1.f142677a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM365a3.left = this.f752O0.m79538b() + rectM365a3.left;
                    rectM365a3.top = this.f752O0.m79540d() + rectM365a3.top;
                    rectM365a3.right -= this.f752O0.m79539c();
                    rectM365a3.bottom -= this.f752O0.m79537a();
                }
            }
            Rect rectM365a4 = m365a();
            int i4 = hqkVar3.f94200c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                i4 |= 48;
            }
            gug1.m45777s(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM365a3, rectM365a4, i);
            view.layout(rectM365a4.left, rectM365a4.top, rectM365a4.right, rectM365a4.bottom);
            rectM365a3.setEmpty();
            q9q0Var.mo72407g(rectM365a3);
            rectM365a4.setEmpty();
            q9q0Var.mo72407g(rectM365a4);
            return;
        }
        hqk hqkVar4 = (hqk) view.getLayoutParams();
        int i5 = hqkVar4.f94200c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int iM45782x = gug1.m45782x(i5, i);
        int i6 = iM45782x & 7;
        int i7 = iM45782x & ContentType.LONG_FORM_ON_DEMAND;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int i8 = 0;
        int[] iArr = this.f766i;
        if (iArr != null && i3 >= 0 && i3 < iArr.length) {
            i2 = iArr[i3];
        } else {
            toString();
            i2 = 0;
        }
        int i9 = i2 - measuredWidth2;
        if (i6 == 1) {
            i9 += measuredWidth2 / 2;
        } else if (i6 == 5) {
            i9 += measuredWidth2;
        }
        if (i7 == 16) {
            i8 = measuredHeight2 / 2;
        } else if (i7 == 80) {
            i8 = measuredHeight2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) hqkVar4).leftMargin, Math.min(i9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) hqkVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) hqkVar4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) hqkVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m383z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f755R0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f754Q0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f754Q0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f754Q0.setState(getDrawableState());
                }
                Drawable drawable3 = this.f754Q0;
                WeakHashMap weakHashMap = mec1.f142677a;
                svg1.m79457K(drawable3, getLayoutDirection());
                this.f754Q0.setVisible(getVisibility() == 0, false);
                this.f754Q0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = mec1.f142677a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? lzj.m60389y(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f754Q0;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f754Q0.setVisible(z, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m379t(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m380u(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f760c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        hwd hwdVar = f747X0;
        if (hwdVar != null) {
            Collections.sort(arrayList, hwdVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo1562g = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            eqk eqkVar = ((hqk) view.getLayoutParams()).f94198a;
            if (zMo1562g && actionMasked != 0) {
                if (eqkVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        eqkVar.mo1562g(this, view, motionEventObtain);
                    } else if (i == 1) {
                        eqkVar.mo1563s(this, view, motionEventObtain);
                    }
                }
            } else if (!zMo1562g && eqkVar != null) {
                if (i == 0) {
                    zMo1562g = eqkVar.mo1562g(this, view, motionEvent);
                } else if (i == 1) {
                    zMo1562g = eqkVar.mo1563s(this, view, motionEvent);
                }
                if (zMo1562g) {
                    this.f767t = view;
                }
            }
        }
        arrayList.clear();
        return zMo1562g;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:74:0x006b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:32:0x0077
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: v */
    public final void m381v() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m381v():void");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f754Q0;
    }

    /* JADX INFO: renamed from: w */
    public final void m382w(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            eqk eqkVar = ((hqk) childAt.getLayoutParams()).f94198a;
            if (eqkVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    eqkVar.mo1562g(this, childAt, motionEventObtain);
                } else {
                    eqkVar.mo1563s(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((hqk) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f767t = null;
        this.f764g = false;
    }

    /* JADX INFO: renamed from: z */
    public final void m383z() {
        WeakHashMap weakHashMap = mec1.f142677a;
        if (!getFitsSystemWindows()) {
            cec1.m32550n(this, null);
            return;
        }
        if (this.f756S0 == null) {
            this.f756S0 = new kp7(this, 27);
        }
        cec1.m32550n(this, this.f756S0);
        setSystemUiVisibility(1280);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new hqk(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.f758a = new ArrayList();
        this.f759b = new iin();
        this.f760c = new ArrayList();
        this.f761d = new ArrayList();
        this.f762e = new int[2];
        this.f763f = new int[2];
        this.f757T0 = new qr8(0 == true ? 1 : 0);
        int[] iArr = m2u0.f139464a;
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f766i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = coordinatorLayout.f766i;
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        coordinatorLayout.f754Q0 = typedArray.getDrawable(1);
        typedArray.recycle();
        m383z();
        super.setOnHierarchyChangeListener(new gqk(this));
        WeakHashMap weakHashMap = mec1.f142677a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
