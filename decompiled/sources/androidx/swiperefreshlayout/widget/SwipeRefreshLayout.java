package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;
import p204p.a1u0;
import p204p.cec1;
import p204p.cee;
import p204p.dee;
import p204p.edo;
import p204p.gd61;
import p204p.hd61;
import p204p.hgj0;
import p204p.id61;
import p204p.igj0;
import p204p.jd61;
import p204p.jgj0;
import p204p.kd61;
import p204p.kgj0;
import p204p.ld61;
import p204p.lgj0;
import p204p.lzj;
import p204p.md61;
import p204p.mec1;
import p204p.mgj0;
import p204p.ms2;
import p204p.nd61;
import p204p.qr8;
import p204p.rde;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements lgj0, kgj0, hgj0, mgj0, igj0 {

    /* JADX INFO: renamed from: l1 */
    public static final int[] f1307l1 = {R.attr.enabled};

    /* JADX INFO: renamed from: L0 */
    public final int[] f1308L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f1309M0;

    /* JADX INFO: renamed from: N0 */
    public final int f1310N0;

    /* JADX INFO: renamed from: O0 */
    public int f1311O0;

    /* JADX INFO: renamed from: P0 */
    public float f1312P0;

    /* JADX INFO: renamed from: Q0 */
    public float f1313Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f1314R0;

    /* JADX INFO: renamed from: S0 */
    public int f1315S0;

    /* JADX INFO: renamed from: T0 */
    public final DecelerateInterpolator f1316T0;

    /* JADX INFO: renamed from: U0 */
    public final rde f1317U0;

    /* JADX INFO: renamed from: V0 */
    public int f1318V0;

    /* JADX INFO: renamed from: W0 */
    public int f1319W0;

    /* JADX INFO: renamed from: X0 */
    public final int f1320X0;

    /* JADX INFO: renamed from: Y0 */
    public final int f1321Y0;

    /* JADX INFO: renamed from: Z0 */
    public int f1322Z0;

    /* JADX INFO: renamed from: a */
    public View f1323a;

    /* JADX INFO: renamed from: a1 */
    public final dee f1324a1;

    /* JADX INFO: renamed from: b */
    public md61 f1325b;

    /* JADX INFO: renamed from: b1 */
    public hd61 f1326b1;

    /* JADX INFO: renamed from: c */
    public boolean f1327c;

    /* JADX INFO: renamed from: c1 */
    public id61 f1328c1;

    /* JADX INFO: renamed from: d */
    public final int f1329d;

    /* JADX INFO: renamed from: d1 */
    public jd61 f1330d1;

    /* JADX INFO: renamed from: e */
    public float f1331e;

    /* JADX INFO: renamed from: e1 */
    public jd61 f1332e1;

    /* JADX INFO: renamed from: f */
    public float f1333f;

    /* JADX INFO: renamed from: f1 */
    public boolean f1334f1;

    /* JADX INFO: renamed from: g */
    public final qr8 f1335g;

    /* JADX INFO: renamed from: g1 */
    public int f1336g1;

    /* JADX INFO: renamed from: h */
    public final jgj0 f1337h;

    /* JADX INFO: renamed from: h1 */
    public boolean f1338h1;

    /* JADX INFO: renamed from: i */
    public final int[] f1339i;

    /* JADX INFO: renamed from: i1 */
    public final gd61 f1340i1;

    /* JADX INFO: renamed from: j1 */
    public final id61 f1341j1;

    /* JADX INFO: renamed from: k1 */
    public final id61 f1342k1;

    /* JADX INFO: renamed from: t */
    public final int[] f1343t;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i) {
        this.f1317U0.getBackground().setAlpha(i);
        this.f1324a1.setAlpha(i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1121a() {
        View view = this.f1323a;
        return view instanceof ListView ? edo.m38609h((ListView) view) : view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: b */
    public final void m1122b() {
        if (this.f1323a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1317U0)) {
                    this.f1323a = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1123c(float f) {
        if (f > this.f1331e) {
            m1127n(true, true);
            return;
        }
        this.f1327c = false;
        dee deeVar = this.f1324a1;
        cee ceeVar = deeVar.f48062a;
        ceeVar.f37095e = 0.0f;
        ceeVar.f37096f = 0.0f;
        deeVar.invalidateSelf();
        kd61 kd61Var = new kd61(this, 0);
        this.f1319W0 = this.f1311O0;
        id61 id61Var = this.f1342k1;
        id61Var.reset();
        id61Var.setDuration(200L);
        id61Var.setInterpolator(this.f1316T0);
        rde rdeVar = this.f1317U0;
        rdeVar.f198106a = kd61Var;
        rdeVar.clearAnimation();
        this.f1317U0.startAnimation(id61Var);
        dee deeVar2 = this.f1324a1;
        cee ceeVar2 = deeVar2.f48062a;
        if (ceeVar2.f37104n) {
            ceeVar2.f37104n = false;
        }
        deeVar2.invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public final void m1124d(float f) {
        jd61 jd61Var;
        jd61 jd61Var2;
        dee deeVar = this.f1324a1;
        cee ceeVar = deeVar.f48062a;
        if (!ceeVar.f37104n) {
            ceeVar.f37104n = true;
        }
        deeVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f1331e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f1331e;
        int i = this.f1322Z0;
        if (i <= 0) {
            i = this.f1321Y0;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f1320X0 + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f1317U0.getVisibility() != 0) {
            this.f1317U0.setVisibility(0);
        }
        this.f1317U0.setScaleX(1.0f);
        this.f1317U0.setScaleY(1.0f);
        if (f < this.f1331e) {
            if (this.f1324a1.f48062a.f37110t > 76 && ((jd61Var2 = this.f1330d1) == null || !jd61Var2.hasStarted() || jd61Var2.hasEnded())) {
                jd61 jd61Var3 = new jd61(this, this.f1324a1.f48062a.f37110t, 76);
                jd61Var3.setDuration(300L);
                rde rdeVar = this.f1317U0;
                rdeVar.f198106a = null;
                rdeVar.clearAnimation();
                this.f1317U0.startAnimation(jd61Var3);
                this.f1330d1 = jd61Var3;
            }
        } else if (this.f1324a1.f48062a.f37110t < 255 && ((jd61Var = this.f1332e1) == null || !jd61Var.hasStarted() || jd61Var.hasEnded())) {
            jd61 jd61Var4 = new jd61(this, this.f1324a1.f48062a.f37110t, 255);
            jd61Var4.setDuration(300L);
            rde rdeVar2 = this.f1317U0;
            rdeVar2.f198106a = null;
            rdeVar2.clearAnimation();
            this.f1317U0.startAnimation(jd61Var4);
            this.f1332e1 = jd61Var4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        dee deeVar2 = this.f1324a1;
        cee ceeVar2 = deeVar2.f48062a;
        ceeVar2.f37095e = 0.0f;
        ceeVar2.f37096f = fMin2;
        deeVar2.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        dee deeVar3 = this.f1324a1;
        cee ceeVar3 = deeVar3.f48062a;
        if (fMin3 != ceeVar3.f37106p) {
            ceeVar3.f37106p = fMin3;
        }
        deeVar3.invalidateSelf();
        float fM62680e = ms2.m62680e(fPow, 2.0f, (fMax * 0.4f) - 0.25f, 0.5f);
        dee deeVar4 = this.f1324a1;
        deeVar4.f48062a.f37097g = fM62680e;
        deeVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f1311O0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1337h.m53296a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1337h.m53297b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1337h.m53298c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1337h.m53299d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: e */
    public final void mo88e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: f */
    public final void mo89f(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: g */
    public final void mo90g(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1318V0;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1335g.m73599g();
    }

    public int getProgressCircleDiameter() {
        return this.f1336g1;
    }

    public int getProgressViewEndOffset() {
        return this.f1321Y0;
    }

    public int getProgressViewStartOffset() {
        return this.f1320X0;
    }

    /* JADX INFO: renamed from: h */
    public final void m1125h(float f) {
        int i = this.f1319W0;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f1320X0 - i) * f))) - this.f1317U0.getTop());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1337h.m53301f(0);
    }

    @Override // p204p.lgj0
    /* JADX INFO: renamed from: i */
    public final void mo92i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f1337h.m53299d(i, i2, i3, i4, this.f1343t, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.f1343t[1] : i7;
        if (i8 >= 0 || m1121a()) {
            return;
        }
        float fAbs = this.f1333f + Math.abs(i8);
        this.f1333f = fAbs;
        m1124d(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1337h.f112201d;
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: j */
    public final void mo93j(View view, int i, int i2, int i3, int i4, int i5) {
        mo92i(view, i, i2, i3, i4, i5, this.f1308L0);
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: k */
    public final boolean mo94k(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // p204p.hgj0
    /* JADX INFO: renamed from: l */
    public final void mo403l(int i) {
    }

    /* JADX INFO: renamed from: m */
    public final void m1126m() {
        this.f1317U0.clearAnimation();
        this.f1324a1.stop();
        this.f1317U0.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f1320X0 - this.f1311O0);
        this.f1311O0 = this.f1317U0.getTop();
    }

    /* JADX INFO: renamed from: n */
    public final void m1127n(boolean z, boolean z2) {
        if (this.f1327c != z) {
            this.f1334f1 = z2;
            m1122b();
            this.f1327c = z;
            gd61 gd61Var = this.f1340i1;
            if (!z) {
                id61 id61Var = new id61(this, 0);
                this.f1328c1 = id61Var;
                id61Var.setDuration(150L);
                rde rdeVar = this.f1317U0;
                rdeVar.f198106a = gd61Var;
                rdeVar.clearAnimation();
                this.f1317U0.startAnimation(this.f1328c1);
                return;
            }
            this.f1319W0 = this.f1311O0;
            id61 id61Var2 = this.f1341j1;
            id61Var2.reset();
            id61Var2.setDuration(200L);
            id61Var2.setInterpolator(this.f1316T0);
            if (gd61Var != null) {
                this.f1317U0.f198106a = gd61Var;
            }
            this.f1317U0.clearAnimation();
            this.f1317U0.startAnimation(id61Var2);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1128o(float f) {
        float f2 = this.f1313Q0;
        float f3 = f - f2;
        float f4 = this.f1329d;
        if (f3 <= f4 || this.f1314R0) {
            return;
        }
        this.f1312P0 = f2 + f4;
        this.f1314R0 = true;
        this.f1324a1.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1126m();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        m1122b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m1121a() && !this.f1327c && !this.f1309M0) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f1314R0 = false;
                    this.f1315S0 = -1;
                } else if (actionMasked == 2) {
                    int i = this.f1315S0;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        m1128o(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f1314R0 = false;
                    this.f1315S0 = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f1315S0) {
                        this.f1315S0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f1314R0;
            }
            setTargetOffsetTopAndBottom(this.f1320X0 - this.f1317U0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f1315S0 = pointerId;
            this.f1314R0 = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.f1313Q0 = motionEvent.getY(iFindPointerIndex2);
                return this.f1314R0;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f1323a == null) {
            m1122b();
        }
        View view = this.f1323a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f1317U0.getMeasuredWidth();
        int measuredHeight2 = this.f1317U0.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f1311O0;
        this.f1317U0.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1323a == null) {
            m1122b();
        }
        View view = this.f1323a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f1317U0.measure(View.MeasureSpec.makeMeasureSpec(this.f1336g1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1336g1, 1073741824));
        this.f1318V0 = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f1317U0) {
                this.f1318V0 = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f1337h.m53296a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f1337h.m53297b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f1333f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f1333f = 0.0f;
                } else {
                    this.f1333f = f - f2;
                    iArr[1] = i2;
                }
                m1124d(this.f1333f);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f1339i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo92i(view, i, i2, i3, i4, 0, this.f1308L0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1335g.m73600i(i);
        startNestedScroll(i & 2);
        this.f1333f = 0.0f;
        this.f1309M0 = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        nd61 nd61Var = (nd61) parcelable;
        super.onRestoreInstanceState(nd61Var.getSuperState());
        setRefreshing(nd61Var.f152693a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new nd61(super.onSaveInstanceState(), this.f1327c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f1327c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f1335g.m73602m();
        this.f1309M0 = false;
        float f = this.f1333f;
        if (f > 0.0f) {
            m1123c(f);
            this.f1333f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m1121a() && !this.f1327c && !this.f1309M0) {
            if (actionMasked == 0) {
                this.f1315S0 = motionEvent.getPointerId(0);
                this.f1314R0 = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1315S0);
                if (iFindPointerIndex >= 0) {
                    if (this.f1314R0) {
                        float y = (motionEvent.getY(iFindPointerIndex) - this.f1312P0) * 0.5f;
                        this.f1314R0 = false;
                        m1123c(y);
                    }
                    this.f1315S0 = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f1315S0);
                if (iFindPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    m1128o(y2);
                    if (this.f1314R0) {
                        float f = (y2 - this.f1312P0) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m1124d(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f1315S0) {
                            this.f1315S0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.f1315S0 = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f1323a;
        if (view != null) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (!cec1.m32545i(view)) {
                if (this.f1338h1 || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f1317U0.setScaleX(f);
        this.f1317U0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m1122b();
        dee deeVar = this.f1324a1;
        cee ceeVar = deeVar.f48062a;
        ceeVar.f37099i = iArr;
        ceeVar.m32555a(0);
        ceeVar.m32555a(0);
        deeVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = lzj.m60386v(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1331e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m1126m();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f1338h1 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f1337h.m53302g(z);
    }

    public void setOnRefreshListener(md61 md61Var) {
        this.f1325b = md61Var;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1317U0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(lzj.m60386v(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1327c == z) {
            m1127n(z, false);
            return;
        }
        this.f1327c = z;
        setTargetOffsetTopAndBottom((this.f1321Y0 + this.f1320X0) - this.f1311O0);
        this.f1334f1 = false;
        this.f1317U0.setVisibility(0);
        this.f1324a1.setAlpha(255);
        hd61 hd61Var = new hd61(this);
        this.f1326b1 = hd61Var;
        hd61Var.setDuration(this.f1310N0);
        gd61 gd61Var = this.f1340i1;
        if (gd61Var != null) {
            this.f1317U0.f198106a = gd61Var;
        }
        this.f1317U0.clearAnimation();
        this.f1317U0.startAnimation(this.f1326b1);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f1336g1 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f1336g1 = (int) (displayMetrics.density * 40.0f);
            }
            this.f1317U0.setImageDrawable(null);
            this.f1324a1.m35779c(i);
            this.f1317U0.setImageDrawable(this.f1324a1);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f1322Z0 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        rde rdeVar = this.f1317U0;
        rdeVar.bringToFront();
        WeakHashMap weakHashMap = mec1.f142677a;
        rdeVar.offsetTopAndBottom(i);
        this.f1311O0 = rdeVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f1337h.m53303h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f1337h.m53304i(0);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1327c = false;
        this.f1331e = -1.0f;
        this.f1339i = new int[2];
        this.f1343t = new int[2];
        this.f1308L0 = new int[2];
        this.f1315S0 = -1;
        this.f1318V0 = -1;
        this.f1340i1 = new gd61(this);
        this.f1341j1 = new id61(this, 1);
        this.f1342k1 = new id61(this, 2);
        this.f1329d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1310N0 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f1316T0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1336g1 = (int) (displayMetrics.density * 40.0f);
        rde rdeVar = new rde(getContext());
        float f = rdeVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = rdeVar.getContext().obtainStyledAttributes(a1u0.f11480a);
        rdeVar.f198107b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = mec1.f142677a;
        cec1.m32548l(rdeVar, f * 4.0f);
        shapeDrawable.getPaint().setColor(rdeVar.f198107b);
        rdeVar.setBackground(shapeDrawable);
        this.f1317U0 = rdeVar;
        dee deeVar = new dee(getContext());
        this.f1324a1 = deeVar;
        deeVar.m35779c(1);
        this.f1317U0.setImageDrawable(this.f1324a1);
        this.f1317U0.setVisibility(8);
        addView(this.f1317U0);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f1321Y0 = i;
        this.f1331e = i;
        this.f1335g = new qr8(false);
        this.f1337h = new jgj0(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f1336g1;
        this.f1311O0 = i2;
        this.f1320X0 = i2;
        m1125h(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1307l1);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    public void setOnChildScrollUpCallback(ld61 ld61Var) {
    }
}
