package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p204p.C2374sf;
import p204p.dkv0;
import p204p.gjv0;
import p204p.gx8;
import p204p.h7c;
import p204p.hjv0;
import p204p.il80;
import p204p.m8p0;
import p204p.mec1;
import p204p.mjv0;
import p204p.o7t0;
import p204p.ojv0;
import p204p.qst0;
import p204p.s3e;
import p204p.uj81;
import p204p.vjv0;
import p204p.yic1;
import p204p.z0u0;
import p204p.zjv0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0110a {

    /* JADX INFO: renamed from: L0 */
    public int f1287L0;

    /* JADX INFO: renamed from: M0 */
    public int f1288M0;

    /* JADX INFO: renamed from: N0 */
    public int f1289N0;

    /* JADX INFO: renamed from: X */
    public int f1290X;

    /* JADX INFO: renamed from: Y */
    public boolean f1291Y;

    /* JADX INFO: renamed from: Z */
    public int f1292Z;

    /* JADX INFO: renamed from: a */
    public s3e f1293a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f1294b;

    /* JADX INFO: renamed from: c */
    public final uj81 f1295c;

    /* JADX INFO: renamed from: d */
    public final uj81 f1296d;

    /* JADX INFO: renamed from: e */
    public il80 f1297e;

    /* JADX INFO: renamed from: f */
    public boolean f1298f;

    /* JADX INFO: renamed from: g */
    public boolean f1299g;

    /* JADX INFO: renamed from: h */
    public boolean f1300h;

    /* JADX INFO: renamed from: i */
    public boolean f1301i;

    /* JADX INFO: renamed from: t */
    public final boolean f1302t;

    public AbstractC0110a() {
        m8p0 m8p0Var = new m8p0(this, 17);
        qst0 qst0Var = new qst0(this, 7);
        this.f1295c = new uj81(m8p0Var);
        this.f1296d = new uj81(qst0Var);
        this.f1298f = false;
        this.f1299g = false;
        this.f1300h = false;
        this.f1301i = true;
        this.f1302t = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    /* JADX INFO: renamed from: J */
    public static int m1077J(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* JADX INFO: renamed from: L */
    public static int m1078L(View view) {
        return view.getBottom() + ((ojv0) view.getLayoutParams()).f166148b.bottom;
    }

    /* JADX INFO: renamed from: M */
    public static int m1079M(View view) {
        return view.getLeft() - ((ojv0) view.getLayoutParams()).f166148b.left;
    }

    /* JADX INFO: renamed from: N */
    public static int m1080N(View view) {
        Rect rect = ((ojv0) view.getLayoutParams()).f166148b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: P */
    public static int m1081P(View view) {
        return view.getRight() + ((ojv0) view.getLayoutParams()).f166148b.right;
    }

    /* JADX INFO: renamed from: Q */
    public static int m1082Q(View view) {
        return view.getTop() - ((ojv0) view.getLayoutParams()).f166148b.top;
    }

    /* JADX INFO: renamed from: V */
    public static int m1083V(View view) {
        return ((ojv0) view.getLayoutParams()).f166147a.m36324n();
    }

    /* JADX INFO: renamed from: W */
    public static h7c m1084W(Context context, AttributeSet attributeSet, int i, int i2) {
        h7c h7cVar = new h7c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z0u0.f278169a, i, i2);
        h7cVar.f88401a = typedArrayObtainStyledAttributes.getInt(0, 1);
        h7cVar.f88402b = typedArrayObtainStyledAttributes.getInt(10, 1);
        h7cVar.f88403c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        h7cVar.f88404d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return h7cVar;
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m1085a0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m1086b0(View view, int i, int i2, int i3, int i4) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        Rect rect = ojv0Var.f166148b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) ojv0Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) ojv0Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) ojv0Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) ojv0Var).bottomMargin);
    }

    /* JADX INFO: renamed from: t */
    public static int m1087t(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX INFO: renamed from: A */
    public int mo883A(zjv0 zjv0Var) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[PHI: r3
      0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A0 */
    public boolean mo1088A0(vjv0 vjv0Var, zjv0 zjv0Var, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        if (this.f1294b != null) {
            int iHeight = this.f1289N0;
            int iWidth = this.f1288M0;
            Rect rect = new Rect();
            if (this.f1294b.getMatrix().isIdentity() && this.f1294b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.f1294b.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f1294b.canScrollHorizontally(1)) {
                    paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
                } else {
                    paddingLeft = 0;
                }
            } else if (i != 8192) {
                paddingTop = 0;
                paddingLeft = 0;
            } else {
                paddingTop = this.f1294b.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f1294b.canScrollHorizontally(-1)) {
                    paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
                } else {
                    paddingLeft = 0;
                }
            }
            if (paddingTop != 0 || paddingLeft != 0) {
                this.f1294b.m1040y0(paddingLeft, paddingTop, null, true);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public int mo884B(zjv0 zjv0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m1089B0() {
        for (int iM1097I = m1097I() - 1; iM1097I >= 0; iM1097I--) {
            this.f1293a.m77132f(iM1097I);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1090C(vjv0 vjv0Var) {
        for (int iM1097I = m1097I() - 1; iM1097I >= 0; iM1097I--) {
            View viewM1096H = m1096H(iM1097I);
            dkv0 dkv0VarM969U = RecyclerView.m969U(viewM1096H);
            if (dkv0VarM969U.m36319B()) {
                if (RecyclerView.f1180a2) {
                    dkv0VarM969U.toString();
                }
            } else if (!dkv0VarM969U.m36328r() || dkv0VarM969U.m36330t() || this.f1294b.f1204N0.f92279b) {
                m1096H(iM1097I);
                s3e s3eVar = this.f1293a;
                int iM77130d = s3eVar.m77130d(iM1097I);
                s3eVar.f205270b.m44360L(iM77130d);
                s3eVar.f205269a.m44964c(iM77130d);
                vjv0Var.m85788k(viewM1096H);
                this.f1294b.f1241g.m88113y(dkv0VarM969U);
            } else {
                if (m1096H(iM1097I) != null) {
                    this.f1293a.m77132f(iM1097I);
                }
                vjv0Var.m85787j(dkv0VarM969U);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m1091C0(vjv0 vjv0Var) {
        for (int iM1097I = m1097I() - 1; iM1097I >= 0; iM1097I--) {
            if (!RecyclerView.m969U(m1096H(iM1097I)).m36319B()) {
                View viewM1096H = m1096H(iM1097I);
                if (m1096H(iM1097I) != null) {
                    this.f1293a.m77132f(iM1097I);
                }
                vjv0Var.m85786i(viewM1096H);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public View mo923D(int i) {
        int iM1097I = m1097I();
        for (int i2 = 0; i2 < iM1097I; i2++) {
            View viewM1096H = m1096H(i2);
            dkv0 dkv0VarM969U = RecyclerView.m969U(viewM1096H);
            if (dkv0VarM969U != null && dkv0VarM969U.m36324n() == i && !dkv0VarM969U.m36319B() && (this.f1294b.f1194F1.f283550g || !dkv0VarM969U.m36330t())) {
                return viewM1096H;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m1092D0(vjv0 vjv0Var) {
        ArrayList arrayList = vjv0Var.f242060a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((dkv0) arrayList.get(i)).f50039a;
            dkv0 dkv0VarM969U = RecyclerView.m969U(view);
            if (!dkv0VarM969U.m36319B()) {
                dkv0VarM969U.m36318A(false);
                if (dkv0VarM969U.m36332v()) {
                    this.f1294b.removeDetachedView(view, false);
                }
                mjv0 mjv0Var = this.f1294b.f1251n1;
                if (mjv0Var != null) {
                    mjv0Var.mo33395f(dkv0VarM969U);
                }
                dkv0VarM969U.m36318A(true);
                dkv0 dkv0VarM969U2 = RecyclerView.m969U(view);
                dkv0VarM969U2.f50030L0 = null;
                dkv0VarM969U2.f50031M0 = false;
                dkv0VarM969U2.f50048t &= -33;
                vjv0Var.m85787j(dkv0VarM969U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = vjv0Var.f242061b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f1294b.invalidate();
        }
    }

    /* JADX INFO: renamed from: E */
    public abstract ojv0 mo886E();

    /* JADX INFO: renamed from: E0 */
    public final void m1093E0(View view) {
        s3e s3eVar = this.f1293a;
        gjv0 gjv0Var = s3eVar.f205269a;
        int i = s3eVar.f205272d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            s3eVar.f205272d = 1;
            s3eVar.f205273e = view;
            int iM44969i = gjv0Var.m44969i(view);
            if (iM44969i >= 0) {
                if (s3eVar.f205270b.m44360L(iM44969i)) {
                    s3eVar.m77133g(view);
                }
                gjv0Var.m44975p(iM44969i);
            }
        } finally {
            s3eVar.f205272d = 0;
            s3eVar.f205273e = null;
        }
    }

    /* JADX INFO: renamed from: F */
    public ojv0 mo888F(Context context, AttributeSet attributeSet) {
        return new ojv0(context, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX INFO: renamed from: F0 */
    public boolean mo1094F0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.f1288M0 - getPaddingRight();
        int paddingBottom = this.f1289N0 - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - paddingRight;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - paddingBottom);
        if (m1106S() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int paddingRight2 = this.f1288M0 - getPaddingRight();
                int paddingBottom2 = this.f1289N0 - getPaddingBottom();
                Rect rect2 = this.f1294b.f1257t;
                RecyclerView.m970V(rect2, focusedChild);
                if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.m1040y0(i4, i5, null, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.m1040y0(i4, i5, null, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public ojv0 mo890G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ojv0) {
            return new ojv0((ojv0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ojv0((ViewGroup.MarginLayoutParams) layoutParams) : new ojv0(layoutParams);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m1095G0() {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: H */
    public final View m1096H(int i) {
        s3e s3eVar = this.f1293a;
        if (s3eVar != null) {
            return s3eVar.m77128b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public int mo892H0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public final int m1097I() {
        s3e s3eVar = this.f1293a;
        if (s3eVar != null) {
            return s3eVar.m77129c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I0 */
    public abstract void mo924I0(int i);

    /* JADX INFO: renamed from: J0 */
    public int mo895J0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: K */
    public int mo897K(vjv0 vjv0Var, zjv0 zjv0Var) {
        return -1;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m1098K0(RecyclerView recyclerView) {
        m1099L0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: L0 */
    public final void m1099L0(int i, int i2) {
        this.f1288M0 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f1292Z = mode;
        if (mode == 0 && !RecyclerView.f1183d2) {
            this.f1288M0 = 0;
        }
        this.f1289N0 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1287L0 = mode2;
        if (mode2 != 0 || RecyclerView.f1183d2) {
            return;
        }
        this.f1289N0 = 0;
    }

    /* JADX INFO: renamed from: M0 */
    public void mo900M0(int i, int i2, Rect rect) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        this.f1294b.setMeasuredDimension(m1087t(i, paddingRight, m1109U()), m1087t(i2, paddingBottom, m1107T()));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m1100N0(int i, int i2) {
        int iM1097I = m1097I();
        if (iM1097I == 0) {
            this.f1294b.m1030t(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM1097I; i7++) {
            View viewM1096H = m1096H(i7);
            Rect rect = this.f1294b.f1257t;
            RecyclerView.m970V(rect, viewM1096H);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f1294b.f1257t.set(i6, i4, i3, i5);
        mo900M0(i, i2, this.f1294b.f1257t);
    }

    /* JADX INFO: renamed from: O */
    public final int m1101O(View view) {
        Rect rect = ((ojv0) view.getLayoutParams()).f166148b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m1102O0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1294b = null;
            this.f1293a = null;
            this.f1288M0 = 0;
            this.f1289N0 = 0;
        } else {
            this.f1294b = recyclerView;
            this.f1293a = recyclerView.f1239f;
            this.f1288M0 = recyclerView.getWidth();
            this.f1289N0 = recyclerView.getHeight();
        }
        this.f1292Z = 1073741824;
        this.f1287L0 = 1073741824;
    }

    /* JADX INFO: renamed from: P0 */
    final boolean m1103P0(View view, int i, int i2, ojv0 ojv0Var) {
        return (!view.isLayoutRequested() && this.f1301i && m1085a0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) ojv0Var).width) && m1085a0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) ojv0Var).height)) ? false : true;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean mo925Q0() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public final int m1104R() {
        RecyclerView recyclerView = this.f1294b;
        hjv0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo1617e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m1105R0(View view, int i, int i2, ojv0 ojv0Var) {
        return (this.f1301i && m1085a0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) ojv0Var).width) && m1085a0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) ojv0Var).height)) ? false : true;
    }

    /* JADX INFO: renamed from: S */
    public final int m1106S() {
        RecyclerView recyclerView = this.f1294b;
        WeakHashMap weakHashMap = mec1.f142677a;
        return recyclerView.getLayoutDirection();
    }

    /* JADX INFO: renamed from: T */
    public final int m1107T() {
        RecyclerView recyclerView = this.f1294b;
        WeakHashMap weakHashMap = mec1.f142677a;
        return recyclerView.getMinimumHeight();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m1108T0(il80 il80Var) {
        il80 il80Var2 = this.f1297e;
        if (il80Var2 != null && il80Var != il80Var2 && il80Var2.m50993g()) {
            this.f1297e.m50999m();
        }
        this.f1297e = il80Var;
        il80Var.m50998l(this.f1294b, this);
    }

    /* JADX INFO: renamed from: U */
    public final int m1109U() {
        RecyclerView recyclerView = this.f1294b;
        WeakHashMap weakHashMap = mec1.f142677a;
        return recyclerView.getMinimumWidth();
    }

    /* JADX INFO: renamed from: U0 */
    public boolean mo901U0() {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public int mo903X(vjv0 vjv0Var, zjv0 zjv0Var) {
        return -1;
    }

    /* JADX INFO: renamed from: Y */
    public final void m1110Y(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((ojv0) view.getLayoutParams()).f166148b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f1294b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f1294b.f1202M0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: Z */
    public boolean mo930Z() {
        return this.f1300h;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1111c0(View view) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        Rect rectM998W = this.f1294b.m998W(view);
        int i = rectM998W.left + rectM998W.right;
        int i2 = rectM998W.top + rectM998W.bottom;
        int iM1077J = m1077J(false, this.f1288M0, this.f1292Z, getPaddingRight() + getPaddingLeft() + i, ((ViewGroup.MarginLayoutParams) ojv0Var).width);
        int iM1077J2 = m1077J(false, this.f1289N0, this.f1287L0, getPaddingBottom() + getPaddingTop() + i2, ((ViewGroup.MarginLayoutParams) ojv0Var).height);
        if (m1103P0(view, iM1077J, iM1077J2, ojv0Var)) {
            view.measure(iM1077J, iM1077J2);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void mo1112d0(View view, int i) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        Rect rectM998W = this.f1294b.m998W(view);
        int i2 = rectM998W.left + rectM998W.right + i;
        int i3 = rectM998W.top + rectM998W.bottom;
        int iM1077J = m1077J(mo951q(), this.f1288M0, this.f1292Z, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ojv0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ojv0Var).rightMargin + i2, ((ViewGroup.MarginLayoutParams) ojv0Var).width);
        int iM1077J2 = m1077J(mo953r(), this.f1289N0, this.f1287L0, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) ojv0Var).topMargin + ((ViewGroup.MarginLayoutParams) ojv0Var).bottomMargin + i3, ((ViewGroup.MarginLayoutParams) ojv0Var).height);
        if (m1103P0(view, iM1077J, iM1077J2, ojv0Var)) {
            view.measure(iM1077J, iM1077J2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo1053e0(int i) {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView != null) {
            int iM77129c = recyclerView.f1239f.m77129c();
            for (int i2 = 0; i2 < iM77129c; i2++) {
                recyclerView.f1239f.m77128b(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void mo1055f0(int i) {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView != null) {
            int iM77129c = recyclerView.f1239f.m77129c();
            for (int i2 = 0; i2 < iM77129c; i2++) {
                recyclerView.f1239f.m77128b(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h0 */
    public void mo1113h0(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: j0 */
    public View mo904j0(View view, int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public void mo944k0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1294b;
        vjv0 vjv0Var = recyclerView.f1233c;
        zjv0 zjv0Var = recyclerView.f1194F1;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1294b.canScrollVertically(-1) && !this.f1294b.canScrollHorizontally(-1) && !this.f1294b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        hjv0 hjv0Var = this.f1294b.f1204N0;
        if (hjv0Var != null) {
            accessibilityEvent.setItemCount(hjv0Var.mo1617e());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1114l(View view) {
        m1115m(view, -1, false);
    }

    /* JADX INFO: renamed from: l0 */
    public void mo905l0(vjv0 vjv0Var, zjv0 zjv0Var, C2374sf c2374sf) {
        if (this.f1294b.canScrollVertically(-1) || this.f1294b.canScrollHorizontally(-1)) {
            c2374sf.m77967a(8192);
            c2374sf.m77986u(true);
        }
        if (this.f1294b.canScrollVertically(1) || this.f1294b.canScrollHorizontally(1)) {
            c2374sf.m77967a(4096);
            c2374sf.m77986u(true);
        }
        c2374sf.m77979n(yic1.m93704m(mo903X(vjv0Var, zjv0Var), mo897K(vjv0Var, zjv0Var), 0, false));
    }

    /* JADX INFO: renamed from: m */
    public final void m1115m(View view, int i, boolean z) {
        dkv0 dkv0VarM969U = RecyclerView.m969U(view);
        if (z || dkv0VarM969U.m36330t()) {
            this.f1294b.f1241g.m88095e(dkv0VarM969U);
        } else {
            this.f1294b.f1241g.m88090D(dkv0VarM969U);
        }
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        if (dkv0VarM969U.m36320C() || dkv0VarM969U.m36331u()) {
            if (dkv0VarM969U.m36331u()) {
                dkv0VarM969U.f50030L0.m85791n(dkv0VarM969U);
            } else {
                dkv0VarM969U.f50048t &= -33;
            }
            this.f1293a.m77127a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f1294b) {
            int iM77131e = this.f1293a.m77131e(view);
            if (i == -1) {
                i = this.f1293a.m77129c();
            }
            if (iM77131e == -1) {
                StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb.append(this.f1294b.indexOfChild(view));
                throw new IllegalStateException(o7t0.m66395i(this.f1294b, sb));
            }
            if (iM77131e != i) {
                AbstractC0110a abstractC0110a = this.f1294b.f1206O0;
                View viewM1096H = abstractC0110a.m1096H(iM77131e);
                if (viewM1096H == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM77131e + abstractC0110a.f1294b.toString());
                }
                abstractC0110a.m1096H(iM77131e);
                s3e s3eVar = abstractC0110a.f1293a;
                int iM77130d = s3eVar.m77130d(iM77131e);
                s3eVar.f205270b.m44360L(iM77130d);
                s3eVar.f205269a.m44964c(iM77130d);
                abstractC0110a.m1117o(viewM1096H, i);
            }
        } else {
            s3e s3eVar2 = this.f1293a;
            gjv0 gjv0Var = s3eVar2.f205269a;
            int iM44966e = i < 0 ? gjv0Var.m44966e() : s3eVar2.m77130d(i);
            s3eVar2.f205270b.m44356H(iM44966e, false);
            gjv0Var.m44962a(view, iM44966e);
            ojv0Var.f166149c = true;
            il80 il80Var = this.f1297e;
            if (il80Var != null && il80Var.m50993g()) {
                this.f1297e.m50995i(view);
            }
        }
        if (ojv0Var.f166150d) {
            if (RecyclerView.f1180a2) {
                Objects.toString(ojv0Var.f166147a);
            }
            dkv0VarM969U.f50039a.invalidate();
            ojv0Var.f166150d = false;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m1116m0(View view, C2374sf c2374sf) {
        dkv0 dkv0VarM969U = RecyclerView.m969U(view);
        if (dkv0VarM969U == null || dkv0VarM969U.m36330t()) {
            return;
        }
        s3e s3eVar = this.f1293a;
        if (s3eVar.f205271c.contains(dkv0VarM969U.f50039a)) {
            return;
        }
        RecyclerView recyclerView = this.f1294b;
        mo907n0(recyclerView.f1233c, recyclerView.f1194F1, view, c2374sf);
    }

    /* JADX INFO: renamed from: n */
    public void mo947n(String str) {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView != null) {
            recyclerView.m1020n(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1117o(View view, int i) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        dkv0 dkv0VarM969U = RecyclerView.m969U(view);
        if (dkv0VarM969U.m36330t()) {
            this.f1294b.f1241g.m88095e(dkv0VarM969U);
        } else {
            this.f1294b.f1241g.m88090D(dkv0VarM969U);
        }
        this.f1293a.m77127a(view, i, ojv0Var, dkv0VarM969U.m36330t());
    }

    /* JADX INFO: renamed from: o0 */
    public void mo908o0(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX INFO: renamed from: p */
    public final void m1118p(Rect rect, View view) {
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m998W(view));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void mo909p0(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: q */
    public boolean mo951q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo953r() {
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo911r0(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX INFO: renamed from: s */
    public boolean mo593s(ojv0 ojv0Var) {
        return ojv0Var != null;
    }

    /* JADX INFO: renamed from: t0 */
    public void mo914t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo1119s0(i);
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo915u0(vjv0 vjv0Var, zjv0 zjv0Var);

    /* JADX INFO: renamed from: w */
    public int mo959w(zjv0 zjv0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: w0 */
    public void mo1120w0(int i, int i2) {
        this.f1294b.m1030t(i, i2);
    }

    /* JADX INFO: renamed from: x */
    public int mo917x(zjv0 zjv0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: x0 */
    public void mo961x0(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: y */
    public int mo918y(zjv0 zjv0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: y0 */
    public Parcelable mo963y0() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public int mo965z(zjv0 zjv0Var) {
        return 0;
    }

    /* JADX INFO: renamed from: z0 */
    public void mo1076z0(int i) {
    }

    /* JADX INFO: renamed from: s0 */
    public void mo1119s0(int i) {
    }

    /* JADX INFO: renamed from: v0 */
    public void mo916v0(zjv0 zjv0Var) {
    }

    /* JADX INFO: renamed from: g0 */
    public void mo1057g0(hjv0 hjv0Var, hjv0 hjv0Var2) {
    }

    /* JADX INFO: renamed from: i0 */
    public void mo941i0(RecyclerView recyclerView, vjv0 vjv0Var) {
    }

    /* JADX INFO: renamed from: v */
    public void mo957v(int i, gx8 gx8Var) {
    }

    /* JADX INFO: renamed from: S0 */
    public void mo926S0(RecyclerView recyclerView, zjv0 zjv0Var, int i) {
    }

    /* JADX INFO: renamed from: q0 */
    public void mo910q0(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX INFO: renamed from: n0 */
    public void mo907n0(vjv0 vjv0Var, zjv0 zjv0Var, View view, C2374sf c2374sf) {
    }

    /* JADX INFO: renamed from: u */
    public void mo955u(int i, int i2, zjv0 zjv0Var, gx8 gx8Var) {
    }
}
