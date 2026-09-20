package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p204p.C2262pn;
import p204p.akv0;
import p204p.bey;
import p204p.bkv0;
import p204p.c150;
import p204p.ckv0;
import p204p.cmp;
import p204p.dkv0;
import p204p.dr00;
import p204p.dvx;
import p204p.dxf1;
import p204p.dy0;
import p204p.edb;
import p204p.ejv0;
import p204p.fec1;
import p204p.fjv0;
import p204p.fkv0;
import p204p.gjv0;
import p204p.glg1;
import p204p.gx8;
import p204p.hgj0;
import p204p.hjv0;
import p204p.il80;
import p204p.jgj0;
import p204p.kjv0;
import p204p.ljv0;
import p204p.mec1;
import p204p.mjv0;
import p204p.mvl0;
import p204p.njv0;
import p204p.o7t0;
import p204p.ojv0;
import p204p.phn0;
import p204p.pjv0;
import p204p.pp91;
import p204p.q2z;
import p204p.qjv0;
import p204p.qr8;
import p204p.rec1;
import p204p.rjv0;
import p204p.s3e;
import p204p.sa81;
import p204p.sjv0;
import p204p.tjv0;
import p204p.ujv0;
import p204p.urt0;
import p204p.vjv0;
import p204p.wh51;
import p204p.wjv0;
import p204p.xjv0;
import p204p.z0u0;
import p204p.zjv0;
import p204p.zu3;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements hgj0 {

    /* JADX INFO: renamed from: Z1 */
    public static boolean f1179Z1 = false;

    /* JADX INFO: renamed from: a2 */
    public static boolean f1180a2 = false;

    /* JADX INFO: renamed from: b2 */
    public static final int[] f1181b2 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: c2 */
    public static final float f1182c2 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: d2 */
    public static final boolean f1183d2 = true;

    /* JADX INFO: renamed from: e2 */
    public static final boolean f1184e2 = true;

    /* JADX INFO: renamed from: f2 */
    public static final boolean f1185f2 = true;

    /* JADX INFO: renamed from: g2 */
    public static final Class[] f1186g2;

    /* JADX INFO: renamed from: h2 */
    public static final ejv0 f1187h2;

    /* JADX INFO: renamed from: i2 */
    public static final akv0 f1188i2;

    /* JADX INFO: renamed from: A1 */
    public final float f1189A1;

    /* JADX INFO: renamed from: B1 */
    public boolean f1190B1;

    /* JADX INFO: renamed from: C1 */
    public final ckv0 f1191C1;

    /* JADX INFO: renamed from: D1 */
    public dr00 f1192D1;

    /* JADX INFO: renamed from: E1 */
    public final gx8 f1193E1;

    /* JADX INFO: renamed from: F1 */
    public final zjv0 f1194F1;

    /* JADX INFO: renamed from: G1 */
    public sjv0 f1195G1;

    /* JADX INFO: renamed from: H1 */
    public ArrayList f1196H1;

    /* JADX INFO: renamed from: I1 */
    public boolean f1197I1;

    /* JADX INFO: renamed from: J1 */
    public boolean f1198J1;

    /* JADX INFO: renamed from: K1 */
    public final phn0 f1199K1;

    /* JADX INFO: renamed from: L0 */
    public final Rect f1200L0;

    /* JADX INFO: renamed from: L1 */
    public boolean f1201L1;

    /* JADX INFO: renamed from: M0 */
    public final RectF f1202M0;

    /* JADX INFO: renamed from: M1 */
    public fkv0 f1203M1;

    /* JADX INFO: renamed from: N0 */
    public hjv0 f1204N0;

    /* JADX INFO: renamed from: N1 */
    public kjv0 f1205N1;

    /* JADX INFO: renamed from: O0 */
    public AbstractC0110a f1206O0;

    /* JADX INFO: renamed from: O1 */
    public final int[] f1207O1;

    /* JADX INFO: renamed from: P0 */
    public final ArrayList f1208P0;

    /* JADX INFO: renamed from: P1 */
    public jgj0 f1209P1;

    /* JADX INFO: renamed from: Q0 */
    public final ArrayList f1210Q0;

    /* JADX INFO: renamed from: Q1 */
    public final int[] f1211Q1;

    /* JADX INFO: renamed from: R0 */
    public final ArrayList f1212R0;

    /* JADX INFO: renamed from: R1 */
    public final int[] f1213R1;

    /* JADX INFO: renamed from: S0 */
    public rjv0 f1214S0;

    /* JADX INFO: renamed from: S1 */
    public final int[] f1215S1;

    /* JADX INFO: renamed from: T0 */
    public boolean f1216T0;

    /* JADX INFO: renamed from: T1 */
    public final ArrayList f1217T1;

    /* JADX INFO: renamed from: U0 */
    public boolean f1218U0;

    /* JADX INFO: renamed from: U1 */
    public final dvx f1219U1;

    /* JADX INFO: renamed from: V0 */
    public boolean f1220V0;

    /* JADX INFO: renamed from: V1 */
    public boolean f1221V1;

    /* JADX INFO: renamed from: W0 */
    public int f1222W0;

    /* JADX INFO: renamed from: W1 */
    public int f1223W1;

    /* JADX INFO: renamed from: X0 */
    public boolean f1224X0;

    /* JADX INFO: renamed from: X1 */
    public int f1225X1;

    /* JADX INFO: renamed from: Y0 */
    public boolean f1226Y0;

    /* JADX INFO: renamed from: Y1 */
    public final fjv0 f1227Y1;

    /* JADX INFO: renamed from: Z0 */
    public boolean f1228Z0;

    /* JADX INFO: renamed from: a */
    public final float f1229a;

    /* JADX INFO: renamed from: a1 */
    public int f1230a1;

    /* JADX INFO: renamed from: b */
    public final C2262pn f1231b;

    /* JADX INFO: renamed from: b1 */
    public boolean f1232b1;

    /* JADX INFO: renamed from: c */
    public final vjv0 f1233c;

    /* JADX INFO: renamed from: c1 */
    public final AccessibilityManager f1234c1;

    /* JADX INFO: renamed from: d */
    public xjv0 f1235d;

    /* JADX INFO: renamed from: d1 */
    public ArrayList f1236d1;

    /* JADX INFO: renamed from: e */
    public final dy0 f1237e;

    /* JADX INFO: renamed from: e1 */
    public boolean f1238e1;

    /* JADX INFO: renamed from: f */
    public final s3e f1239f;

    /* JADX INFO: renamed from: f1 */
    public boolean f1240f1;

    /* JADX INFO: renamed from: g */
    public final wh51 f1241g;

    /* JADX INFO: renamed from: g1 */
    public int f1242g1;

    /* JADX INFO: renamed from: h */
    public boolean f1243h;

    /* JADX INFO: renamed from: h1 */
    public int f1244h1;

    /* JADX INFO: renamed from: i */
    public final zu3 f1245i;

    /* JADX INFO: renamed from: i1 */
    public ljv0 f1246i1;

    /* JADX INFO: renamed from: j1 */
    public EdgeEffect f1247j1;

    /* JADX INFO: renamed from: k1 */
    public EdgeEffect f1248k1;

    /* JADX INFO: renamed from: l1 */
    public EdgeEffect f1249l1;

    /* JADX INFO: renamed from: m1 */
    public EdgeEffect f1250m1;

    /* JADX INFO: renamed from: n1 */
    public mjv0 f1251n1;

    /* JADX INFO: renamed from: o1 */
    public int f1252o1;

    /* JADX INFO: renamed from: p1 */
    public int f1253p1;

    /* JADX INFO: renamed from: q1 */
    public VelocityTracker f1254q1;

    /* JADX INFO: renamed from: r1 */
    public int f1255r1;

    /* JADX INFO: renamed from: s1 */
    public int f1256s1;

    /* JADX INFO: renamed from: t */
    public final Rect f1257t;

    /* JADX INFO: renamed from: t1 */
    public int f1258t1;

    /* JADX INFO: renamed from: u1 */
    public int f1259u1;

    /* JADX INFO: renamed from: v1 */
    public int f1260v1;

    /* JADX INFO: renamed from: w1 */
    public qjv0 f1261w1;

    /* JADX INFO: renamed from: x1 */
    public final int f1262x1;

    /* JADX INFO: renamed from: y1 */
    public final int f1263y1;

    /* JADX INFO: renamed from: z1 */
    public final float f1264z1;

    static {
        Class cls = Integer.TYPE;
        f1186g2 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1187h2 = new ejv0(0);
        f1188i2 = new akv0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: L */
    public static RecyclerView m966L(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM966L = m966L(viewGroup.getChildAt(i));
            if (recyclerViewM966L != null) {
                return recyclerViewM966L;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static int m967R(View view) {
        dkv0 dkv0VarM969U = m969U(view);
        if (dkv0VarM969U != null) {
            return dkv0VarM969U.m36322l();
        }
        return -1;
    }

    /* JADX INFO: renamed from: S */
    public static int m968S(View view) {
        dkv0 dkv0VarM969U = m969U(view);
        if (dkv0VarM969U != null) {
            return dkv0VarM969U.m36324n();
        }
        return -1;
    }

    /* JADX INFO: renamed from: U */
    public static dkv0 m969U(View view) {
        if (view == null) {
            return null;
        }
        return ((ojv0) view.getLayoutParams()).f166147a;
    }

    /* JADX INFO: renamed from: V */
    public static void m970V(Rect rect, View view) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        Rect rect2 = ojv0Var.f166148b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) ojv0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) ojv0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) ojv0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) ojv0Var).bottomMargin);
    }

    private jgj0 getScrollingChildHelper() {
        if (this.f1209P1 == null) {
            this.f1209P1 = new jgj0(this);
        }
        return this.f1209P1;
    }

    /* JADX INFO: renamed from: o */
    public static void m977o(dkv0 dkv0Var) {
        WeakReference weakReference = dkv0Var.f50040b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == dkv0Var.f50039a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            dkv0Var.f50040b = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m978r(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && pp91.m70536q(edgeEffect) != 0.0f) {
            int iRound = Math.round(pp91.m70544y(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || pp91.m70536q(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(pp91.m70544y(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f1179Z1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f1180a2 = z;
    }

    /* JADX INFO: renamed from: A */
    public final void m979A(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m53299d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m980A0() {
        int i = this.f1222W0 + 1;
        this.f1222W0 = i;
        if (i != 1 || this.f1226Y0) {
            return;
        }
        this.f1224X0 = false;
    }

    /* JADX INFO: renamed from: B */
    public final void m981B(int i, int i2) {
        this.f1244h1++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo1010h0(i, i2);
        sjv0 sjv0Var = this.f1195G1;
        if (sjv0Var != null) {
            sjv0Var.mo35394f(this, i, i2);
        }
        ArrayList arrayList = this.f1196H1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((sjv0) this.f1196H1.get(size)).mo35394f(this, i, i2);
            }
        }
        this.f1244h1--;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m982B0(boolean z) {
        if (this.f1222W0 < 1) {
            if (f1179Z1) {
                throw new IllegalStateException(o7t0.m66395i(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f1222W0 = 1;
        }
        if (!z && !this.f1226Y0) {
            this.f1224X0 = false;
        }
        if (this.f1222W0 == 1) {
            if (z && this.f1224X0 && !this.f1226Y0 && this.f1206O0 != null && this.f1204N0 != null) {
                m1034v();
            }
            if (!this.f1226Y0) {
                this.f1224X0 = false;
            }
        }
        this.f1222W0--;
    }

    /* JADX INFO: renamed from: C */
    public final void m983C() {
        if (this.f1250m1 != null) {
            return;
        }
        ((akv0) this.f1246i1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1250m1 = edgeEffect;
        if (this.f1243h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m984C0() {
        il80 il80Var;
        setScrollState(0);
        ckv0 ckv0Var = this.f1191C1;
        ckv0Var.f39096g.removeCallbacks(ckv0Var);
        ckv0Var.f39092c.abortAnimation();
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a == null || (il80Var = abstractC0110a.f1297e) == null) {
            return;
        }
        il80Var.m50999m();
    }

    /* JADX INFO: renamed from: D */
    public final void m985D() {
        if (this.f1247j1 != null) {
            return;
        }
        ((akv0) this.f1246i1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1247j1 = edgeEffect;
        if (this.f1243h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m986E() {
        if (this.f1249l1 != null) {
            return;
        }
        ((akv0) this.f1246i1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1249l1 = edgeEffect;
        if (this.f1243h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m987F() {
        if (this.f1248k1 != null) {
            return;
        }
        ((akv0) this.f1246i1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1248k1 = edgeEffect;
        if (this.f1243h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: G */
    public final String m988G() {
        return " " + super.toString() + ", adapter:" + this.f1204N0 + ", layout:" + this.f1206O0 + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: H */
    public final void m989H(zjv0 zjv0Var) {
        if (getScrollState() != 2) {
            zjv0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f1191C1.f39092c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        zjv0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: I */
    public final View m990I(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m991J(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1212R0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rjv0 rjv0Var = (rjv0) arrayList.get(i);
            if (rjv0Var.mo28971c(this, motionEvent) && action != 3) {
                this.f1214S0 = rjv0Var;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final void m992K(int[] iArr) {
        int iM77129c = this.f1239f.m77129c();
        if (iM77129c == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM77129c; i3++) {
            dkv0 dkv0VarM969U = m969U(this.f1239f.m77128b(i3));
            if (!dkv0VarM969U.m36319B()) {
                int iM36324n = dkv0VarM969U.m36324n();
                if (iM36324n < i) {
                    i = iM36324n;
                }
                if (iM36324n > i2) {
                    i2 = iM36324n;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: M */
    public final dkv0 m993M(int i) {
        dkv0 dkv0Var = null;
        if (this.f1238e1) {
            return null;
        }
        int iM44966e = this.f1239f.f205269a.m44966e();
        for (int i2 = 0; i2 < iM44966e; i2++) {
            dkv0 dkv0VarM969U = m969U(this.f1239f.f205269a.m44965d(i2));
            if (dkv0VarM969U != null && !dkv0VarM969U.m36330t() && m995P(dkv0VarM969U) == i) {
                if (!this.f1239f.f205271c.contains(dkv0VarM969U.f50039a)) {
                    return dkv0VarM969U;
                }
                dkv0Var = dkv0VarM969U;
            }
        }
        return dkv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX INFO: renamed from: O */
    public boolean mo994O(int i, int i2) {
        int iMax;
        int i3;
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null && !this.f1226Y0) {
            int iMo951q = abstractC0110a.mo951q();
            boolean zMo953r = this.f1206O0.mo953r();
            int i4 = this.f1262x1;
            if (iMo951q == 0 || Math.abs(i) < i4) {
                i = 0;
            }
            if (!zMo953r || Math.abs(i2) < i4) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.f1247j1;
                    if (edgeEffect == null || pp91.m70536q(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.f1249l1;
                        if (edgeEffect2 == null || pp91.m70536q(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (m1038x0(this.f1249l1, i, getWidth())) {
                            this.f1249l1.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i5 = -i;
                        if (m1038x0(this.f1247j1, i5, getWidth())) {
                            this.f1247j1.onAbsorb(i5);
                            i = 0;
                        }
                    }
                    iMax = i;
                    i = 0;
                }
                if (i2 == 0) {
                    i3 = i2;
                    i2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.f1248k1;
                    if (edgeEffect3 == null || pp91.m70536q(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f1250m1;
                        if (edgeEffect4 == null || pp91.m70536q(edgeEffect4) == 0.0f) {
                            i3 = i2;
                            i2 = 0;
                        } else if (m1038x0(this.f1250m1, i2, getHeight())) {
                            this.f1250m1.onAbsorb(i2);
                            i2 = 0;
                        }
                    } else {
                        int i6 = -i2;
                        if (m1038x0(this.f1248k1, i6, getHeight())) {
                            this.f1248k1.onAbsorb(i6);
                            i2 = 0;
                        }
                    }
                    i3 = 0;
                }
                ckv0 ckv0Var = this.f1191C1;
                int i7 = this.f1263y1;
                if (iMax != 0 || i2 != 0) {
                    int i8 = -i7;
                    iMax = Math.max(i8, Math.min(iMax, i7));
                    i2 = Math.max(i8, Math.min(i2, i7));
                    ckv0Var.m33202a(iMax, i2);
                }
                if (i != 0 || i3 != 0) {
                    float f = i;
                    float f2 = i3;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z = iMo951q != 0 || zMo953r;
                        dispatchNestedFling(f, f2, z);
                        qjv0 qjv0Var = this.f1261w1;
                        if (qjv0Var == null || !qjv0Var.mo53656a(i, i3)) {
                            if (z) {
                                if (zMo953r) {
                                    iMo951q = (iMo951q == true ? 1 : 0) | 2;
                                }
                                getScrollingChildHelper().m53303h(iMo951q, 1);
                                int i9 = -i7;
                                ckv0Var.m33202a(Math.max(i9, Math.min(i, i7)), Math.max(i9, Math.min(i3, i7)));
                                return true;
                            }
                        }
                        return true;
                    }
                } else if (iMax != 0 || i2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final int m995P(dkv0 dkv0Var) {
        if ((dkv0Var.f50048t & 524) == 0 && dkv0Var.m36327q()) {
            return this.f1237e.m37291b(dkv0Var.f50041c);
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q */
    public final long m996Q(dkv0 dkv0Var) {
        return this.f1204N0.f92279b ? dkv0Var.f50043e : dkv0Var.f50041c;
    }

    /* JADX INFO: renamed from: T */
    public final dkv0 m997T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m969U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: W */
    public final Rect m998W(View view) {
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        boolean z = ojv0Var.f166149c;
        Rect rect = ojv0Var.f166148b;
        if (z) {
            zjv0 zjv0Var = this.f1194F1;
            if (!zjv0Var.f283550g || (!ojv0Var.f166147a.m36333w() && !ojv0Var.f166147a.m36328r())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f1210Q0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.f1257t;
                    rect2.set(0, 0, 0, 0);
                    ((njv0) arrayList.get(i)).mo24519f(rect2, view, this, zjv0Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                ojv0Var.f166149c = false;
                return rect;
            }
        }
        return rect;
    }

    /* JADX INFO: renamed from: X */
    public final njv0 m999X(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (njv0) this.f1210Q0.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m1000Y() {
        return !this.f1220V0 || this.f1238e1 || this.f1237e.m37311x();
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m1001Z() {
        return this.f1242g1 > 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1002a0(int i) {
        if (this.f1206O0 == null) {
            return;
        }
        setScrollState(2);
        this.f1206O0.mo924I0(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null) {
            abstractC0110a.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m1003b0() {
        int iM44966e = this.f1239f.f205269a.m44966e();
        for (int i = 0; i < iM44966e; i++) {
            ((ojv0) this.f1239f.f205269a.m44965d(i).getLayoutParams()).f166149c = true;
        }
        ArrayList arrayList = this.f1233c.f242062c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ojv0 ojv0Var = (ojv0) ((dkv0) arrayList.get(i2)).f50039a.getLayoutParams();
            if (ojv0Var != null) {
                ojv0Var.f166149c = true;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1004c0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM44966e = this.f1239f.f205269a.m44966e();
        for (int i4 = 0; i4 < iM44966e; i4++) {
            dkv0 dkv0VarM969U = m969U(this.f1239f.f205269a.m44965d(i4));
            if (dkv0VarM969U != null && !dkv0VarM969U.m36319B()) {
                int i5 = dkv0VarM969U.f50041c;
                zjv0 zjv0Var = this.f1194F1;
                if (i5 >= i3) {
                    if (f1180a2) {
                        dkv0VarM969U.toString();
                    }
                    dkv0VarM969U.m36334x(-i2, z);
                    zjv0Var.f283549f = true;
                } else if (i5 >= i) {
                    if (f1180a2) {
                        dkv0VarM969U.toString();
                    }
                    dkv0VarM969U.m36321k(8);
                    dkv0VarM969U.m36334x(-i2, z);
                    dkv0VarM969U.f50041c = i - 1;
                    zjv0Var.f283549f = true;
                }
            }
        }
        vjv0 vjv0Var = this.f1233c;
        ArrayList arrayList = vjv0Var.f242062c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dkv0 dkv0Var = (dkv0) arrayList.get(size);
            if (dkv0Var != null) {
                int i6 = dkv0Var.f50041c;
                if (i6 >= i3) {
                    if (f1180a2) {
                        dkv0Var.toString();
                    }
                    dkv0Var.m36334x(-i2, z);
                } else if (i6 >= i) {
                    dkv0Var.m36321k(8);
                    vjv0Var.m85785h(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ojv0) && this.f1206O0.mo593s((ojv0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null && abstractC0110a.mo951q()) {
            return this.f1206O0.mo959w(this.f1194F1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null && abstractC0110a.mo951q()) {
            return this.f1206O0.mo917x(this.f1194F1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null && abstractC0110a.mo951q()) {
            return this.f1206O0.mo918y(this.f1194F1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null && abstractC0110a.mo953r()) {
            return this.f1206O0.mo965z(this.f1194F1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null && abstractC0110a.mo953r()) {
            return this.f1206O0.mo883A(this.f1194F1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null && abstractC0110a.mo953r()) {
            return this.f1206O0.mo884B(this.f1194F1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1005d0() {
        this.f1242g1++;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m53296a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m53297b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m53298c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m53299d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f1210Q0;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((njv0) arrayList.get(i)).mo28974h(canvas, this, this.f1194F1);
        }
        EdgeEffect edgeEffect = this.f1247j1;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1243h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1247j1;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1248k1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1243h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1248k1;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1249l1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1243h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1249l1;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1250m1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1243h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1250m1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f1251n1 == null || arrayList.size() <= 0 || !this.f1251n1.mo33397i()) ? z : true) {
            WeakHashMap weakHashMap = mec1.f142677a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m1006e0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1242g1 - 1;
        this.f1242g1 = i2;
        if (i2 < 1) {
            if (f1179Z1 && i2 < 0) {
                throw new IllegalStateException(o7t0.m66395i(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1242g1 = 0;
            if (z) {
                int i3 = this.f1230a1;
                this.f1230a1 = 0;
                if (i3 != 0 && (accessibilityManager = this.f1234c1) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    glg1.m45174y(accessibilityEventObtain, i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f1217T1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    dkv0 dkv0Var = (dkv0) arrayList.get(size);
                    if (dkv0Var.f50039a.getParent() == this && !dkv0Var.m36319B() && (i = dkv0Var.f50033O0) != -1) {
                        View view = dkv0Var.f50039a;
                        WeakHashMap weakHashMap = mec1.f142677a;
                        view.setImportantForAccessibility(i);
                        dkv0Var.f50033O0 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1007f0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1253p1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1253p1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f1258t1 = x;
            this.f1255r1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f1259u1 = y;
            this.f1256s1 = y;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:137:0x0193 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x0194  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewMo904j0;
        int i2;
        byte b;
        boolean z;
        this.f1206O0.getClass();
        boolean z2 = true;
        boolean z3 = (this.f1204N0 == null || this.f1206O0 == null || m1001Z() || this.f1226Y0) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        zjv0 zjv0Var = this.f1194F1;
        vjv0 vjv0Var = this.f1233c;
        if (z3 && (i == 2 || i == 1)) {
            if (this.f1206O0.mo953r()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.f1206O0.mo951q()) {
                z = focusFinder.findNextFocus(this, view, (this.f1206O0.m1106S() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                m1028s();
                if (m990I(view) != null) {
                    m980A0();
                    this.f1206O0.mo904j0(view, i, vjv0Var, zjv0Var);
                    m982B0(false);
                }
                return null;
            }
            viewMo904j0 = focusFinder.findNextFocus(this, view, i);
            if (viewMo904j0 == null) {
            }
            if (viewMo904j0 != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                return viewMo904j0;
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z3) {
            m1028s();
            if (m990I(view) != null) {
                m980A0();
                viewMo904j0 = this.f1206O0.mo904j0(view, i, vjv0Var, zjv0Var);
                m982B0(false);
            }
            return null;
        }
        viewMo904j0 = viewFindNextFocus;
        if (viewMo904j0 == null && !viewMo904j0.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m1027r0(viewMo904j0, null);
            return view;
        }
        if (viewMo904j0 != null || viewMo904j0 == this || viewMo904j0 == view) {
            z2 = false;
        } else if (m990I(viewMo904j0) == null) {
            z2 = false;
        } else if (view != null && m990I(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f1257t;
            rect.set(0, 0, width, height);
            int width2 = viewMo904j0.getWidth();
            int height2 = viewMo904j0.getHeight();
            Rect rect2 = this.f1200L0;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewMo904j0, rect2);
            int i3 = this.f1206O0.m1106S() == 1 ? -1 : 1;
            int i4 = rect.left;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                b = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    StringBuilder sb = new StringBuilder("Invalid direction: ");
                                    sb.append(i);
                                    throw new IllegalArgumentException(o7t0.m66395i(this, sb));
                                }
                                if (b <= 0) {
                                    z2 = false;
                                }
                            } else if (i2 <= 0) {
                                z2 = false;
                            }
                        } else if (b >= 0) {
                            z2 = false;
                        }
                    } else if (i2 >= 0) {
                        z2 = false;
                    }
                } else if (b <= 0 && (b != 0 || i2 * i3 <= 0)) {
                    z2 = false;
                }
            } else if (b >= 0 && (b != 0 || i2 * i3 >= 0)) {
                z2 = false;
            }
        }
        if (z2) {
            return viewMo904j0;
        }
        return super.focusSearch(view, i);
    }

    /* JADX INFO: renamed from: g0 */
    public void mo1008g0(int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null) {
            return abstractC0110a.mo886E();
        }
        throw new IllegalStateException(o7t0.m66395i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null) {
            return abstractC0110a.mo888F(getContext(), attributeSet);
        }
        throw new IllegalStateException(o7t0.m66395i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public hjv0 getAdapter() {
        return this.f1204N0;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a == null) {
            return super.getBaseline();
        }
        abstractC0110a.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        kjv0 kjv0Var = this.f1205N1;
        return kjv0Var == null ? super.getChildDrawingOrder(i, i2) : ((q2z) kjv0Var).m72037a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1243h;
    }

    public fkv0 getCompatAccessibilityDelegate() {
        return this.f1203M1;
    }

    public ljv0 getEdgeEffectFactory() {
        return this.f1246i1;
    }

    public mjv0 getItemAnimator() {
        return this.f1251n1;
    }

    public int getItemDecorationCount() {
        return this.f1210Q0.size();
    }

    public AbstractC0110a getLayoutManager() {
        return this.f1206O0;
    }

    public int getMaxFlingVelocity() {
        return this.f1263y1;
    }

    public int getMinFlingVelocity() {
        return this.f1262x1;
    }

    public long getNanoTime() {
        if (f1185f2) {
            return System.nanoTime();
        }
        return 0L;
    }

    public qjv0 getOnFlingListener() {
        return this.f1261w1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1190B1;
    }

    public ujv0 getRecycledViewPool() {
        return this.f1233c.m85780c();
    }

    public int getScrollState() {
        return this.f1252o1;
    }

    /* JADX INFO: renamed from: h */
    public final void m1009h(dkv0 dkv0Var) {
        View view = dkv0Var.f50039a;
        boolean z = view.getParent() == this;
        this.f1233c.m85791n(m997T(view));
        if (dkv0Var.m36332v()) {
            this.f1239f.m77127a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            s3e s3eVar = this.f1239f;
            gjv0 gjv0Var = s3eVar.f205269a;
            int iM44966e = gjv0Var.m44966e();
            s3eVar.f205270b.m44356H(iM44966e, true);
            s3eVar.f205271c.add(view);
            gjv0Var.m44971l(view);
            gjv0Var.m44962a(view, iM44966e);
            return;
        }
        s3e s3eVar2 = this.f1239f;
        int iM44969i = s3eVar2.f205269a.m44969i(view);
        if (iM44969i < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        s3eVar2.f205270b.m44363P(iM44969i);
        s3eVar2.f205271c.add(view);
        s3eVar2.f205269a.m44971l(view);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo1010h0(int i, int i2) {
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m53301f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m1011i(njv0 njv0Var) {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null) {
            abstractC0110a.mo947n("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1210Q0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(njv0Var);
        m1003b0();
        requestLayout();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1012i0() {
        if (this.f1201L1 || !this.f1216T0) {
            return;
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        postOnAnimation(this.f1219U1);
        this.f1201L1 = true;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1216T0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1226Y0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f112201d;
    }

    /* JADX INFO: renamed from: j */
    public final void m1013j(pjv0 pjv0Var) {
        if (this.f1236d1 == null) {
            this.f1236d1 = new ArrayList();
        }
        this.f1236d1.add(pjv0Var);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m1014j0() {
        boolean z;
        if (this.f1238e1) {
            this.f1237e.m37283E();
            if (this.f1240f1) {
                this.f1206O0.mo909p0(this);
            }
        }
        if (this.f1251n1 == null || !this.f1206O0.mo901U0()) {
            this.f1237e.m37297i();
        } else {
            this.f1237e.m37281C();
        }
        boolean z2 = this.f1197I1 || this.f1198J1;
        boolean z3 = this.f1220V0 && this.f1251n1 != null && ((z = this.f1238e1) || z2 || this.f1206O0.f1298f) && (!z || this.f1204N0.f92279b);
        zjv0 zjv0Var = this.f1194F1;
        zjv0Var.f283553j = z3;
        zjv0Var.f283554k = z3 && z2 && !this.f1238e1 && this.f1251n1 != null && this.f1206O0.mo901U0();
    }

    /* JADX INFO: renamed from: k */
    public final void m1015k(rjv0 rjv0Var) {
        this.f1212R0.add(rjv0Var);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m1016k0(boolean z) {
        this.f1240f1 = z | this.f1240f1;
        this.f1238e1 = true;
        int iM44966e = this.f1239f.f205269a.m44966e();
        for (int i = 0; i < iM44966e; i++) {
            dkv0 dkv0VarM969U = m969U(this.f1239f.f205269a.m44965d(i));
            if (dkv0VarM969U != null && !dkv0VarM969U.m36319B()) {
                dkv0VarM969U.m36321k(6);
            }
        }
        m1003b0();
        vjv0 vjv0Var = this.f1233c;
        ArrayList arrayList = vjv0Var.f242062c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dkv0 dkv0Var = (dkv0) arrayList.get(i2);
            if (dkv0Var != null) {
                dkv0Var.m36321k(6);
                dkv0Var.m36321k(1024);
            }
        }
        hjv0 hjv0Var = vjv0Var.f242067h.f1204N0;
        if (hjv0Var == null || !hjv0Var.f92279b) {
            vjv0Var.m85784g();
        }
    }

    @Override // p204p.hgj0
    /* JADX INFO: renamed from: l */
    public final void mo403l(int i) {
        getScrollingChildHelper().m53304i(i);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1017l0(dkv0 dkv0Var, qr8 qr8Var) {
        dkv0Var.f50048t &= -8193;
        boolean z = this.f1194F1.f283551h;
        wh51 wh51Var = this.f1241g;
        if (z && dkv0Var.m36333w() && !dkv0Var.m36330t() && !dkv0Var.m36319B()) {
            wh51Var.m88096g(m996Q(dkv0Var), dkv0Var);
        }
        wh51Var.m88098i(dkv0Var, qr8Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m1018m(sjv0 sjv0Var) {
        if (this.f1196H1 == null) {
            this.f1196H1 = new ArrayList();
        }
        this.f1196H1.add(sjv0Var);
    }

    /* JADX INFO: renamed from: m0 */
    public final int m1019m0(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f1247j1;
        float f2 = 0.0f;
        if (edgeEffect == null || pp91.m70536q(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1249l1;
            if (edgeEffect2 != null && pp91.m70536q(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f1249l1.onRelease();
                } else {
                    float fM70544y = pp91.m70544y(this.f1249l1, width, height);
                    if (pp91.m70536q(this.f1249l1) == 0.0f) {
                        this.f1249l1.onRelease();
                    }
                    f2 = fM70544y;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f1247j1.onRelease();
            } else {
                float f3 = -pp91.m70544y(this.f1247j1, -width, 1.0f - height);
                if (pp91.m70536q(this.f1247j1) == 0.0f) {
                    this.f1247j1.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: n */
    public final void m1020n(String str) {
        if (m1001Z()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(o7t0.m66395i(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1244h1 > 0) {
            new IllegalStateException(o7t0.m66395i(this, new StringBuilder("")));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final int m1021n0(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f1248k1;
        float f2 = 0.0f;
        if (edgeEffect == null || pp91.m70536q(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1250m1;
            if (edgeEffect2 != null && pp91.m70536q(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f1250m1.onRelease();
                } else {
                    float fM70544y = pp91.m70544y(this.f1250m1, height, 1.0f - width);
                    if (pp91.m70536q(this.f1250m1) == 0.0f) {
                        this.f1250m1.onRelease();
                    }
                    f2 = fM70544y;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1248k1.onRelease();
            } else {
                float f3 = -pp91.m70544y(this.f1248k1, -height, width);
                if (pp91.m70536q(this.f1248k1) == 0.0f) {
                    this.f1248k1.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: o0 */
    public final void m1022o0(njv0 njv0Var) {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null) {
            abstractC0110a.mo947n("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1210Q0;
        arrayList.remove(njv0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m1003b0();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f1242g1 = 0;
        this.f1216T0 = true;
        this.f1220V0 = this.f1220V0 && !isLayoutRequested();
        this.f1233c.m85782e();
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null) {
            abstractC0110a.f1299g = true;
            abstractC0110a.mo1113h0(this);
        }
        this.f1201L1 = false;
        if (f1185f2) {
            ThreadLocal threadLocal = dr00.f52127e;
            dr00 dr00Var = (dr00) threadLocal.get();
            this.f1192D1 = dr00Var;
            if (dr00Var == null) {
                dr00 dr00Var2 = new dr00();
                dr00Var2.f52129a = new ArrayList();
                dr00Var2.f52132d = new ArrayList();
                this.f1192D1 = dr00Var2;
                WeakHashMap weakHashMap = mec1.f142677a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                dr00 dr00Var3 = this.f1192D1;
                dr00Var3.f52131c = (long) (1.0E9f / refreshRate);
                threadLocal.set(dr00Var3);
            }
            ArrayList arrayList = this.f1192D1.f52129a;
            if (f1179Z1 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        dr00 dr00Var;
        super.onDetachedFromWindow();
        mjv0 mjv0Var = this.f1251n1;
        if (mjv0Var != null) {
            mjv0Var.mo33396g();
        }
        m984C0();
        this.f1216T0 = false;
        AbstractC0110a abstractC0110a = this.f1206O0;
        vjv0 vjv0Var = this.f1233c;
        if (abstractC0110a != null) {
            abstractC0110a.f1299g = false;
            abstractC0110a.mo941i0(this, vjv0Var);
        }
        this.f1217T1.clear();
        removeCallbacks(this.f1219U1);
        this.f1241g.getClass();
        wh51.m88086x();
        ArrayList arrayList = vjv0Var.f242062c;
        for (int i = 0; i < arrayList.size(); i++) {
            mvl0.m62946i(((dkv0) arrayList.get(i)).f50039a);
        }
        vjv0Var.m85783f(vjv0Var.f242067h.f1204N0, false);
        mvl0.m62947j(this);
        if (!f1185f2 || (dr00Var = this.f1192D1) == null) {
            return;
        }
        boolean zRemove = dr00Var.f52129a.remove(this);
        if (f1179Z1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1192D1 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1210Q0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((njv0) arrayList.get(i)).mo29374g(canvas, this, this.f1194F1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.f1206O0 != null && !this.f1226Y0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f1206O0.mo953r() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f1206O0.mo951q() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f1206O0.mo953r()) {
                    f = -axisValue2;
                } else if (this.f1206O0.mo951q()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.f1264z1);
                int i2 = (int) (f * this.f1189A1);
                AbstractC0110a abstractC0110a = this.f1206O0;
                if (abstractC0110a != null && !this.f1226Y0) {
                    int[] iArr = this.f1215S1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo951q = abstractC0110a.mo951q();
                    boolean zMo953r = this.f1206O0.mo953r();
                    int i3 = zMo953r ? (zMo951q ? 1 : 0) | 2 : zMo951q ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iM1019m0 = i - m1019m0(y, i);
                    int iM1021n0 = i2 - m1021n0(x, i2);
                    getScrollingChildHelper().m53303h(i3, 1);
                    if (m1041z(zMo951q ? iM1019m0 : 0, zMo953r ? iM1021n0 : 0, 1, this.f1215S1, this.f1211Q1)) {
                        iM1019m0 -= iArr[0];
                        iM1021n0 -= iArr[1];
                    }
                    m1031t0(zMo951q ? iM1019m0 : 0, zMo953r ? iM1021n0 : 0, motionEvent, 1);
                    dr00 dr00Var = this.f1192D1;
                    if (dr00Var != null && (iM1019m0 != 0 || iM1021n0 != 0)) {
                        dr00Var.m36690a(this, iM1019m0, iM1021n0);
                    }
                    mo403l(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f1226Y0) {
            this.f1214S0 = null;
            if (m991J(motionEvent)) {
                m1029s0();
                setScrollState(0);
                return true;
            }
            AbstractC0110a abstractC0110a = this.f1206O0;
            if (abstractC0110a != null) {
                boolean zMo951q = abstractC0110a.mo951q();
                boolean zMo953r = this.f1206O0.mo953r();
                if (this.f1254q1 == null) {
                    this.f1254q1 = VelocityTracker.obtain();
                }
                this.f1254q1.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f1228Z0) {
                        this.f1228Z0 = false;
                    }
                    this.f1253p1 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f1258t1 = x;
                    this.f1255r1 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f1259u1 = y;
                    this.f1256s1 = y;
                    EdgeEffect edgeEffect = this.f1247j1;
                    if (edgeEffect == null || pp91.m70536q(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        pp91.m70544y(this.f1247j1, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f1249l1;
                    boolean z3 = z;
                    if (edgeEffect2 != null && pp91.m70536q(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z3 = z;
                        z3 = z;
                        pp91.m70544y(this.f1249l1, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                    z3 = z;
                    z3 = z;
                    z3 = z;
                    EdgeEffect edgeEffect3 = this.f1248k1;
                    boolean z4 = z3;
                    if (edgeEffect3 != null && pp91.m70536q(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z4 = z3;
                        z4 = z3;
                        pp91.m70544y(this.f1248k1, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                    z4 = z3;
                    z4 = z3;
                    z4 = z3;
                    EdgeEffect edgeEffect4 = this.f1250m1;
                    boolean z5 = z4;
                    if (edgeEffect4 != null && pp91.m70536q(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z5 = z4;
                        z5 = z4;
                        pp91.m70544y(this.f1250m1, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                    if (z5 || this.f1252o1 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        mo403l(1);
                    }
                    int[] iArr = this.f1213R1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zMo951q;
                    if (zMo953r) {
                        i = (zMo951q ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m53303h(i, 0);
                } else if (actionMasked == 1) {
                    this.f1254q1.clear();
                    mo403l(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1253p1);
                    if (iFindPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.f1252o1 != 1) {
                            int i2 = x2 - this.f1255r1;
                            int i3 = y2 - this.f1256s1;
                            if (!zMo951q || Math.abs(i2) <= this.f1260v1) {
                                z2 = false;
                            } else {
                                this.f1258t1 = x2;
                                z2 = true;
                            }
                            if (zMo953r && Math.abs(i3) > this.f1260v1) {
                                this.f1259u1 = y2;
                                z2 = true;
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    m1029s0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1253p1 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1258t1 = x3;
                    this.f1255r1 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1259u1 = y3;
                    this.f1256s1 = y3;
                } else if (actionMasked == 6) {
                    m1007f0(motionEvent);
                }
                if (this.f1252o1 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = sa81.f207158a;
        Trace.beginSection("RV OnLayout");
        m1034v();
        Trace.endSection();
        this.f1220V0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a == null) {
            m1030t(i, i2);
            return;
        }
        boolean zMo930Z = abstractC0110a.mo930Z();
        boolean z = false;
        zjv0 zjv0Var = this.f1194F1;
        if (zMo930Z) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1206O0.mo1120w0(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f1221V1 = z;
            if (z || this.f1204N0 == null) {
                return;
            }
            if (zjv0Var.f283547d == 1) {
                m1036w();
            }
            this.f1206O0.m1099L0(i, i2);
            zjv0Var.f283552i = true;
            m1039y();
            this.f1206O0.m1100N0(i, i2);
            if (this.f1206O0.mo925Q0()) {
                this.f1206O0.m1099L0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                zjv0Var.f283552i = true;
                m1039y();
                this.f1206O0.m1100N0(i, i2);
            }
            this.f1223W1 = getMeasuredWidth();
            this.f1225X1 = getMeasuredHeight();
            return;
        }
        if (this.f1218U0) {
            this.f1206O0.mo1120w0(i, i2);
            return;
        }
        if (this.f1232b1) {
            m980A0();
            m1005d0();
            m1014j0();
            m1006e0(true);
            if (zjv0Var.f283554k) {
                zjv0Var.f283550g = true;
            } else {
                this.f1237e.m37297i();
                zjv0Var.f283550g = false;
            }
            this.f1232b1 = false;
            m982B0(false);
        } else if (zjv0Var.f283554k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        hjv0 hjv0Var = this.f1204N0;
        if (hjv0Var != null) {
            zjv0Var.f283548e = hjv0Var.mo1617e();
        } else {
            zjv0Var.f283548e = 0;
        }
        m980A0();
        this.f1206O0.mo1120w0(i, i2);
        m982B0(false);
        zjv0Var.f283550g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m1001Z()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xjv0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xjv0 xjv0Var = (xjv0) parcelable;
        this.f1235d = xjv0Var;
        super.onRestoreInstanceState(xjv0Var.m66261c());
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        xjv0 xjv0Var = new xjv0(super.onSaveInstanceState());
        xjv0 xjv0Var2 = this.f1235d;
        if (xjv0Var2 != null) {
            xjv0Var.m91252g(xjv0Var2);
            return xjv0Var;
        }
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null) {
            xjv0Var.f262233c = abstractC0110a.mo963y0();
            return xjv0Var;
        }
        xjv0Var.f262233c = null;
        return xjv0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1250m1 = null;
        this.f1248k1 = null;
        this.f1249l1 = null;
        this.f1247j1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e4 A[PHI: r1
      0x00e4: PHI (r1v47 int) = (r1v31 int), (r1v51 int) binds: [B:49:0x00cd, B:53:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM991J;
        int i;
        boolean z;
        if (!this.f1226Y0 && !this.f1228Z0) {
            rjv0 rjv0Var = this.f1214S0;
            if (rjv0Var == null) {
                zM991J = motionEvent.getAction() == 0 ? false : m991J(motionEvent);
            } else {
                rjv0Var.mo28973e(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f1214S0 = null;
                }
                zM991J = true;
            }
            if (zM991J) {
                m1029s0();
                setScrollState(0);
                return true;
            }
            AbstractC0110a abstractC0110a = this.f1206O0;
            if (abstractC0110a != null) {
                boolean zMo951q = abstractC0110a.mo951q();
                boolean zMo953r = this.f1206O0.mo953r();
                if (this.f1254q1 == null) {
                    this.f1254q1 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f1213R1;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.f1254q1.addMovement(motionEventObtain);
                        this.f1254q1.computeCurrentVelocity(1000, this.f1263y1);
                        float f = zMo951q ? -this.f1254q1.getXVelocity(this.f1253p1) : 0.0f;
                        float f2 = zMo953r ? -this.f1254q1.getYVelocity(this.f1253p1) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !mo994O((int) f, (int) f2)) {
                            setScrollState(0);
                        }
                        m1029s0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1253p1);
                        if (iFindPointerIndex >= 0) {
                            int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            int iMax = this.f1258t1 - x;
                            int iMax2 = this.f1259u1 - y;
                            if (this.f1252o1 != 1) {
                                if (zMo951q) {
                                    iMax = iMax > 0 ? Math.max(0, iMax - this.f1260v1) : Math.min(0, iMax + this.f1260v1);
                                    if (iMax != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                if (zMo953r) {
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f1260v1) : Math.min(0, iMax2 + this.f1260v1);
                                    if (iMax2 != 0) {
                                        z = true;
                                    }
                                }
                                if (z) {
                                    setScrollState(1);
                                }
                            }
                            if (this.f1252o1 == 1) {
                                int[] iArr2 = this.f1215S1;
                                iArr2[0] = 0;
                                iArr2[1] = 0;
                                int iM1019m0 = iMax - m1019m0(motionEvent.getY(), iMax);
                                int iM1021n0 = iMax2 - m1021n0(motionEvent.getX(), iMax2);
                                boolean zM1041z = m1041z(zMo951q ? iM1019m0 : 0, zMo953r ? iM1021n0 : 0, 0, this.f1215S1, this.f1211Q1);
                                int[] iArr3 = this.f1211Q1;
                                if (zM1041z) {
                                    iM1019m0 -= iArr2[0];
                                    iM1021n0 -= iArr2[1];
                                    iArr[0] = iArr[0] + iArr3[0];
                                    iArr[1] = iArr[1] + iArr3[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i2 = iM1019m0;
                                int i3 = iM1021n0;
                                this.f1258t1 = x - iArr3[0];
                                this.f1259u1 = y - iArr3[1];
                                if (m1031t0(zMo951q ? i2 : 0, zMo953r ? i3 : 0, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                dr00 dr00Var = this.f1192D1;
                                if (dr00Var != null && (i2 != 0 || i3 != 0)) {
                                    dr00Var.m36690a(this, i2, i3);
                                }
                            }
                        }
                    } else if (actionMasked == 3) {
                        m1029s0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f1253p1 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f1258t1 = x2;
                        this.f1255r1 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f1259u1 = y2;
                        this.f1256s1 = y2;
                    } else if (actionMasked == 6) {
                        m1007f0(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.f1253p1 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.f1258t1 = x3;
                this.f1255r1 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.f1259u1 = y3;
                this.f1256s1 = y3;
                if (zMo953r) {
                    i = zMo951q;
                    i = (zMo951q ? 1 : 0) | 2;
                }
                i = zMo951q;
                getScrollingChildHelper().m53303h(i, 0);
                this.f1254q1.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m1023p() {
        int iM44966e = this.f1239f.f205269a.m44966e();
        for (int i = 0; i < iM44966e; i++) {
            dkv0 dkv0VarM969U = m969U(this.f1239f.f205269a.m44965d(i));
            if (!dkv0VarM969U.m36319B()) {
                dkv0VarM969U.f50042d = -1;
                dkv0VarM969U.f50045g = -1;
            }
        }
        vjv0 vjv0Var = this.f1233c;
        ArrayList arrayList = vjv0Var.f242060a;
        ArrayList arrayList2 = vjv0Var.f242062c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            dkv0 dkv0Var = (dkv0) arrayList2.get(i2);
            dkv0Var.f50042d = -1;
            dkv0Var.f50045g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            dkv0 dkv0Var2 = (dkv0) arrayList.get(i3);
            dkv0Var2.f50042d = -1;
            dkv0Var2.f50045g = -1;
        }
        ArrayList arrayList3 = vjv0Var.f242061b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                dkv0 dkv0Var3 = (dkv0) vjv0Var.f242061b.get(i4);
                dkv0Var3.f50042d = -1;
                dkv0Var3.f50045g = -1;
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1024p0(pjv0 pjv0Var) {
        ArrayList arrayList = this.f1236d1;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(pjv0Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m1025q(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1247j1;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f1247j1.onRelease();
            zIsFinished = this.f1247j1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1249l1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1249l1.onRelease();
            zIsFinished |= this.f1249l1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1248k1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1248k1.onRelease();
            zIsFinished |= this.f1248k1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1250m1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1250m1.onRelease();
            zIsFinished |= this.f1250m1.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = mec1.f142677a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m1026q0(sjv0 sjv0Var) {
        ArrayList arrayList = this.f1196H1;
        if (arrayList != null) {
            arrayList.remove(sjv0Var);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1027r0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1257t;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof ojv0) {
            ojv0 ojv0Var = (ojv0) layoutParams;
            if (!ojv0Var.f166149c) {
                Rect rect2 = ojv0Var.f166148b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1206O0.mo1094F0(this, view, this.f1257t, !this.f1220V0, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        dkv0 dkv0VarM969U = m969U(view);
        if (dkv0VarM969U != null) {
            if (dkv0VarM969U.m36332v()) {
                dkv0VarM969U.f50048t &= -257;
            } else if (!dkv0VarM969U.m36319B()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(dkv0VarM969U);
                throw new IllegalArgumentException(o7t0.m66395i(this, sb));
            }
        } else if (f1179Z1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(o7t0.m66395i(this, sb2));
        }
        view.clearAnimation();
        m1032u(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        il80 il80Var = this.f1206O0.f1297e;
        if ((il80Var == null || !il80Var.m50993g()) && !m1001Z() && view2 != null) {
            m1027r0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f1206O0.mo1094F0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f1212R0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rjv0) arrayList.get(i)).mo28972d(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1222W0 != 0 || this.f1226Y0) {
            this.f1224X0 = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1028s() {
        if (!this.f1220V0 || this.f1238e1) {
            int i = sa81.f207158a;
            Trace.beginSection("RV FullInvalidate");
            m1034v();
            Trace.endSection();
            return;
        }
        dy0 dy0Var = this.f1237e;
        if (dy0Var.m37311x()) {
            if (!dy0Var.m37310w(4) || dy0Var.m37310w(11)) {
                if (dy0Var.m37311x()) {
                    int i2 = sa81.f207158a;
                    Trace.beginSection("RV FullInvalidate");
                    m1034v();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i3 = sa81.f207158a;
            Trace.beginSection("RV PartialInvalidate");
            m980A0();
            m1005d0();
            dy0Var.m37281C();
            if (!this.f1224X0) {
                s3e s3eVar = this.f1239f;
                int iM77129c = s3eVar.m77129c();
                for (int i4 = 0; i4 < iM77129c; i4++) {
                    dkv0 dkv0VarM969U = m969U(s3eVar.m77128b(i4));
                    if (dkv0VarM969U != null && !dkv0VarM969U.m36319B() && dkv0VarM969U.m36333w()) {
                        m1034v();
                    }
                }
                dy0Var.m37296h();
            }
            m982B0(true);
            m1006e0(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1029s0() {
        VelocityTracker velocityTracker = this.f1254q1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        mo403l(0);
        EdgeEffect edgeEffect = this.f1247j1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1247j1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1248k1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1248k1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1249l1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1249l1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1250m1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1250m1.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = mec1.f142677a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a == null || this.f1226Y0) {
            return;
        }
        boolean zMo951q = abstractC0110a.mo951q();
        boolean zMo953r = this.f1206O0.mo953r();
        if (zMo951q || zMo953r) {
            if (!zMo951q) {
                i = 0;
            }
            if (!zMo953r) {
                i2 = 0;
            }
            m1031t0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1001Z()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iM45169t = accessibilityEvent != null ? glg1.m45169t(accessibilityEvent) : 0;
            this.f1230a1 |= iM45169t != 0 ? iM45169t : 0;
        }
    }

    public void setAccessibilityDelegateCompat(fkv0 fkv0Var) {
        this.f1203M1 = fkv0Var;
        mec1.m61564p(this, fkv0Var);
    }

    public void setAdapter(hjv0 hjv0Var) {
        setLayoutFrozen(false);
        m1037w0(hjv0Var, false, true);
        m1016k0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(kjv0 kjv0Var) {
        if (kjv0Var == this.f1205N1) {
            return;
        }
        this.f1205N1 = kjv0Var;
        setChildrenDrawingOrderEnabled(kjv0Var != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f1243h) {
            this.f1250m1 = null;
            this.f1248k1 = null;
            this.f1249l1 = null;
            this.f1247j1 = null;
        }
        this.f1243h = z;
        super.setClipToPadding(z);
        if (this.f1220V0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(ljv0 ljv0Var) {
        ljv0Var.getClass();
        this.f1246i1 = ljv0Var;
        this.f1250m1 = null;
        this.f1248k1 = null;
        this.f1249l1 = null;
        this.f1247j1 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f1218U0 = z;
    }

    public void setItemAnimator(mjv0 mjv0Var) {
        mjv0 mjv0Var2 = this.f1251n1;
        if (mjv0Var2 != null) {
            mjv0Var2.mo33396g();
            this.f1251n1.f144345a = null;
        }
        this.f1251n1 = mjv0Var;
        if (mjv0Var != null) {
            mjv0Var.f144345a = this.f1199K1;
        }
    }

    public void setItemViewCacheSize(int i) {
        vjv0 vjv0Var = this.f1233c;
        vjv0Var.f242064e = i;
        vjv0Var.m85792o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0110a abstractC0110a) {
        if (abstractC0110a == this.f1206O0) {
            return;
        }
        m984C0();
        AbstractC0110a abstractC0110a2 = this.f1206O0;
        vjv0 vjv0Var = this.f1233c;
        if (abstractC0110a2 != null) {
            mjv0 mjv0Var = this.f1251n1;
            if (mjv0Var != null) {
                mjv0Var.mo33396g();
            }
            this.f1206O0.m1091C0(vjv0Var);
            this.f1206O0.m1092D0(vjv0Var);
            vjv0Var.f242060a.clear();
            vjv0Var.m85784g();
            if (this.f1216T0) {
                AbstractC0110a abstractC0110a3 = this.f1206O0;
                abstractC0110a3.f1299g = false;
                abstractC0110a3.mo941i0(this, vjv0Var);
            }
            this.f1206O0.m1102O0(null);
            this.f1206O0 = null;
        } else {
            vjv0Var.f242060a.clear();
            vjv0Var.m85784g();
        }
        s3e s3eVar = this.f1239f;
        gjv0 gjv0Var = s3eVar.f205269a;
        s3eVar.f205270b.m44361M();
        ArrayList arrayList = s3eVar.f205271c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gjv0Var.m44972m((View) arrayList.get(size));
            arrayList.remove(size);
        }
        gjv0Var.m44974o();
        this.f1206O0 = abstractC0110a;
        if (abstractC0110a != null) {
            if (abstractC0110a.f1294b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC0110a);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(o7t0.m66395i(abstractC0110a.f1294b, sb));
            }
            abstractC0110a.m1102O0(this);
            if (this.f1216T0) {
                AbstractC0110a abstractC0110a4 = this.f1206O0;
                abstractC0110a4.f1299g = true;
                abstractC0110a4.mo1113h0(this);
            }
        }
        vjv0Var.m85792o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m53302g(z);
    }

    public void setOnFlingListener(qjv0 qjv0Var) {
        this.f1261w1 = qjv0Var;
    }

    @Deprecated
    public void setOnScrollListener(sjv0 sjv0Var) {
        this.f1195G1 = sjv0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f1190B1 = z;
    }

    public void setRecycledViewPool(ujv0 ujv0Var) {
        vjv0 vjv0Var = this.f1233c;
        RecyclerView recyclerView = vjv0Var.f242067h;
        vjv0Var.m85783f(recyclerView.f1204N0, false);
        ujv0 ujv0Var2 = vjv0Var.f242066g;
        if (ujv0Var2 != null) {
            ujv0Var2.f231155b--;
        }
        vjv0Var.f242066g = ujv0Var;
        if (ujv0Var != null && recyclerView.getAdapter() != null) {
            vjv0Var.f242066g.f231155b++;
        }
        vjv0Var.m85782e();
    }

    public void setScrollState(int i) {
        il80 il80Var;
        if (i == this.f1252o1) {
            return;
        }
        if (f1180a2) {
            new Exception();
        }
        this.f1252o1 = i;
        if (i != 2) {
            ckv0 ckv0Var = this.f1191C1;
            ckv0Var.f39096g.removeCallbacks(ckv0Var);
            ckv0Var.f39092c.abortAnimation();
            AbstractC0110a abstractC0110a = this.f1206O0;
            if (abstractC0110a != null && (il80Var = abstractC0110a.f1297e) != null) {
                il80Var.m50999m();
            }
        }
        AbstractC0110a abstractC0110a2 = this.f1206O0;
        if (abstractC0110a2 != null) {
            abstractC0110a2.mo1076z0(i);
        }
        mo1008g0(i);
        sjv0 sjv0Var = this.f1195G1;
        if (sjv0Var != null) {
            sjv0Var.mo35393a(this, i);
        }
        ArrayList arrayList = this.f1196H1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((sjv0) this.f1196H1.get(size)).mo35393a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.f1260v1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f1260v1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(bkv0 bkv0Var) {
        this.f1233c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m53303h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m53304i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f1226Y0) {
            m1020n("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f1226Y0 = true;
                this.f1228Z0 = true;
                m984C0();
                return;
            }
            this.f1226Y0 = false;
            if (this.f1224X0 && this.f1206O0 != null && this.f1204N0 != null) {
                requestLayout();
            }
            this.f1224X0 = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m1030t(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = mec1.f142677a;
        setMeasuredDimension(AbstractC0110a.m1087t(i, paddingRight, getMinimumWidth()), AbstractC0110a.m1087t(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7 A[DONT_INVERT, PHI: r7
      0x00f7: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00de, B:31:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX INFO: renamed from: t0 */
    public final boolean m1031t0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        boolean z;
        m1028s();
        hjv0 hjv0Var = this.f1204N0;
        int[] iArr = this.f1215S1;
        if (hjv0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m1033u0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f1210Q0.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m979A(i4, i5, i6, i7, this.f1211Q1, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z2 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.f1258t1;
        int[] iArr2 = this.f1211Q1;
        int i13 = iArr2[0];
        this.f1258t1 = i12 - i13;
        int i14 = this.f1259u1;
        int i15 = iArr2[1];
        this.f1259u1 = i14 - i15;
        int[] iArr3 = this.f1213R1;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !dxf1.m37250z(motionEvent, 8194)) {
                float x = motionEvent.getX();
                float f2 = i9;
                float y = motionEvent.getY();
                float f3 = i11;
                if (f2 < 0.0f) {
                    m985D();
                    f = 0.0f;
                    pp91.m70544y(this.f1247j1, (-f2) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    f = 0.0f;
                    if (f2 > 0.0f) {
                        m986E();
                        pp91.m70544y(this.f1249l1, f2 / getWidth(), y / getHeight());
                    } else {
                        z = false;
                    }
                    if (f3 < f) {
                        m987F();
                        pp91.m70544y(this.f1248k1, (-f3) / getHeight(), x / getWidth());
                    } else if (f3 > f) {
                        m983C();
                        pp91.m70544y(this.f1250m1, f3 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z || f2 != f || f3 != f) {
                        WeakHashMap weakHashMap = mec1.f142677a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (z) {
                        WeakHashMap weakHashMap2 = mec1.f142677a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = mec1.f142677a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f3 < f) {
                    m987F();
                    pp91.m70544y(this.f1248k1, (-f3) / getHeight(), x / getWidth());
                } else if (f3 > f) {
                    m983C();
                    pp91.m70544y(this.f1250m1, f3 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z) {
                    WeakHashMap weakHashMap4 = mec1.f142677a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = mec1.f142677a;
                    postInvalidateOnAnimation();
                }
                z = true;
                if (z) {
                    WeakHashMap weakHashMap6 = mec1.f142677a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = mec1.f142677a;
                    postInvalidateOnAnimation();
                }
            }
            m1025q(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            m981B(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i4 == 0 && i5 == 0) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final void m1032u(View view) {
        dkv0 dkv0VarM969U = m969U(view);
        hjv0 hjv0Var = this.f1204N0;
        if (hjv0Var != null && dkv0VarM969U != null) {
            hjv0Var.mo31054t(dkv0VarM969U);
        }
        ArrayList arrayList = this.f1236d1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((pjv0) this.f1236d1.get(size)).mo32996a(view);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1033u0(int i, int i2, int[] iArr) {
        dkv0 dkv0Var;
        m980A0();
        m1005d0();
        int i3 = sa81.f207158a;
        Trace.beginSection("RV Scroll");
        zjv0 zjv0Var = this.f1194F1;
        m989H(zjv0Var);
        vjv0 vjv0Var = this.f1233c;
        int iMo892H0 = i != 0 ? this.f1206O0.mo892H0(i, vjv0Var, zjv0Var) : 0;
        int iMo895J0 = i2 != 0 ? this.f1206O0.mo895J0(i2, vjv0Var, zjv0Var) : 0;
        Trace.endSection();
        s3e s3eVar = this.f1239f;
        int iM77129c = s3eVar.m77129c();
        for (int i4 = 0; i4 < iM77129c; i4++) {
            View viewM77128b = s3eVar.m77128b(i4);
            dkv0 dkv0VarM997T = m997T(viewM77128b);
            if (dkv0VarM997T != null && (dkv0Var = dkv0VarM997T.f50047i) != null) {
                View view = dkv0Var.f50039a;
                int left = viewM77128b.getLeft();
                int top = viewM77128b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1006e0(true);
        m982B0(false);
        if (iArr != null) {
            iArr[0] = iMo892H0;
            iArr[1] = iMo895J0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x0245  */
    /* JADX WARN: Code duplicated, block: B:126:0x0248  */
    /* JADX WARN: Code duplicated, block: B:132:0x025d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0265  */
    /* JADX WARN: Code duplicated, block: B:136:0x0269  */
    /* JADX WARN: Code duplicated, block: B:139:0x0271  */
    /* JADX WARN: Code duplicated, block: B:142:0x0278  */
    /* JADX WARN: Code duplicated, block: B:145:0x0282 A[LOOP:3: B:138:0x026f->B:145:0x0282, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x028c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0293  */
    /* JADX WARN: Code duplicated, block: B:154:0x029c A[LOOP:4: B:147:0x028a->B:154:0x029c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:183:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x029f A[EDGE_INSN: B:187:0x029f->B:155:0x029f BREAK  A[LOOP:4: B:147:0x028a->B:154:0x029c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x025b A[SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public final void m1034v() {
        long j;
        View view;
        dkv0 dkv0Var;
        int i;
        int iM96246b;
        int i2;
        int iMin;
        dkv0 dkv0VarM993M;
        View view2;
        dkv0 dkv0VarM993M2;
        View view3;
        int i3;
        View viewFindViewById;
        boolean z;
        if (this.f1204N0 == null || this.f1206O0 == null) {
            return;
        }
        zjv0 zjv0Var = this.f1194F1;
        zjv0Var.f283552i = false;
        boolean z2 = this.f1221V1 && !(this.f1223W1 == getWidth() && this.f1225X1 == getHeight());
        this.f1223W1 = 0;
        this.f1225X1 = 0;
        this.f1221V1 = false;
        if (zjv0Var.f283547d == 1) {
            m1036w();
            this.f1206O0.m1098K0(this);
            m1039y();
        } else if (this.f1237e.m37312y() || z2 || this.f1206O0.f1288M0 != getWidth() || this.f1206O0.f1289N0 != getHeight()) {
            this.f1206O0.m1098K0(this);
            m1039y();
        } else {
            this.f1206O0.m1098K0(this);
        }
        zjv0Var.m96245a(4);
        m980A0();
        m1005d0();
        zjv0Var.f283547d = 1;
        boolean z3 = zjv0Var.f283553j;
        vjv0 vjv0Var = this.f1233c;
        wh51 wh51Var = this.f1241g;
        if (z3) {
            for (int iM77129c = this.f1239f.m77129c() - 1; iM77129c >= 0; iM77129c--) {
                dkv0 dkv0VarM969U = m969U(this.f1239f.m77128b(iM77129c));
                if (!dkv0VarM969U.m36319B()) {
                    long jM996Q = m996Q(dkv0VarM969U);
                    this.f1251n1.getClass();
                    qr8 qr8Var = new qr8(false);
                    qr8Var.m73604o(dkv0VarM969U);
                    dkv0 dkv0VarM88101l = wh51Var.m88101l(jM996Q);
                    if (dkv0VarM88101l == null || dkv0VarM88101l.m36319B()) {
                        wh51Var.m88097h(dkv0VarM969U, qr8Var);
                    } else {
                        boolean zM88104o = wh51Var.m88104o(dkv0VarM88101l);
                        boolean zM88104o2 = wh51Var.m88104o(dkv0VarM969U);
                        if (zM88104o && dkv0VarM88101l == dkv0VarM969U) {
                            wh51Var.m88097h(dkv0VarM969U, qr8Var);
                        } else {
                            qr8 qr8VarM88088B = wh51Var.m88088B(dkv0VarM88101l);
                            wh51Var.m88097h(dkv0VarM969U, qr8Var);
                            qr8 qr8VarM88087A = wh51Var.m88087A(dkv0VarM969U);
                            if (qr8VarM88088B == null) {
                                int iM77129c2 = this.f1239f.m77129c();
                                for (int i4 = 0; i4 < iM77129c2; i4++) {
                                    dkv0 dkv0VarM969U2 = m969U(this.f1239f.m77128b(i4));
                                    if (dkv0VarM969U2 != dkv0VarM969U && m996Q(dkv0VarM969U2) == jM996Q) {
                                        hjv0 hjv0Var = this.f1204N0;
                                        if (hjv0Var == null || !hjv0Var.f92279b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(dkv0VarM969U2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(dkv0VarM969U);
                                            throw new IllegalStateException(o7t0.m66395i(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(dkv0VarM969U2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(dkv0VarM969U);
                                        throw new IllegalStateException(o7t0.m66395i(this, sb2));
                                    }
                                }
                                Objects.toString(dkv0VarM88101l);
                                Objects.toString(dkv0VarM969U);
                                m988G();
                            } else {
                                dkv0VarM88101l.m36318A(false);
                                if (zM88104o) {
                                    m1009h(dkv0VarM88101l);
                                }
                                if (dkv0VarM88101l != dkv0VarM969U) {
                                    if (zM88104o2) {
                                        m1009h(dkv0VarM969U);
                                    }
                                    dkv0VarM88101l.f50046h = dkv0VarM969U;
                                    m1009h(dkv0VarM88101l);
                                    vjv0Var.m85791n(dkv0VarM88101l);
                                    dkv0VarM969U.m36318A(false);
                                    dkv0VarM969U.f50047i = dkv0VarM88101l;
                                }
                                if (this.f1251n1.mo61991a(dkv0VarM88101l, dkv0VarM969U, qr8VarM88088B, qr8VarM88087A)) {
                                    m1012i0();
                                }
                            }
                        }
                    }
                }
            }
            wh51Var.m88089C(this.f1227Y1);
        }
        this.f1206O0.m1092D0(vjv0Var);
        zjv0Var.f283545b = zjv0Var.f283548e;
        this.f1238e1 = false;
        this.f1240f1 = false;
        zjv0Var.f283553j = false;
        zjv0Var.f283554k = false;
        this.f1206O0.f1298f = false;
        ArrayList arrayList = vjv0Var.f242061b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a.f1291Y) {
            abstractC0110a.f1290X = 0;
            abstractC0110a.f1291Y = false;
            vjv0Var.m85792o();
        }
        this.f1206O0.mo916v0(zjv0Var);
        m1006e0(true);
        m982B0(false);
        wh51Var.m88099j();
        int[] iArr = this.f1207O1;
        int i5 = iArr[0];
        int i6 = iArr[1];
        m992K(iArr);
        if (iArr[0] != i5 || iArr[1] != i6) {
            m981B(0, 0);
        }
        if (this.f1190B1 && this.f1204N0 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = zjv0Var.f283556m;
                view = null;
                if (j == -1) {
                    dkv0Var = null;
                } else {
                    dkv0Var = null;
                }
                if (dkv0Var != null) {
                    view2 = dkv0Var.f50039a;
                    if (!this.f1239f.f205271c.contains(view2)) {
                        if (this.f1239f.m77129c() > 0) {
                            int i7 = zjv0Var.f283555l;
                            if (i7 != -1) {
                            }
                            iM96246b = zjv0Var.m96246b();
                            i2 = i;
                            while (true) {
                                if (i2 < iM96246b) {
                                    dkv0VarM993M2 = m993M(i2);
                                    if (dkv0VarM993M2 != null) {
                                        view3 = dkv0VarM993M2.f50039a;
                                        if (view3.hasFocusable()) {
                                            view = view3;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iM96246b, i) - 1; iMin >= 0; iMin--) {
                                    dkv0VarM993M = m993M(iMin);
                                    if (dkv0VarM993M == null) {
                                        break;
                                        break;
                                    }
                                    view2 = dkv0VarM993M.f50039a;
                                    if (view2.hasFocusable()) {
                                        view = view2;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f1239f.m77129c() > 0) {
                        int i8 = zjv0Var.f283555l;
                        if (i8 != -1) {
                        }
                        iM96246b = zjv0Var.m96246b();
                        i2 = i;
                        while (true) {
                            if (i2 < iM96246b) {
                                dkv0VarM993M2 = m993M(i2);
                                if (dkv0VarM993M2 != null) {
                                    view3 = dkv0VarM993M2.f50039a;
                                    if (view3.hasFocusable()) {
                                        view = view3;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                dkv0VarM993M = m993M(iMin);
                                if (dkv0VarM993M == null) {
                                    break;
                                    break;
                                }
                                view2 = dkv0VarM993M.f50039a;
                                if (view2.hasFocusable()) {
                                    view = view2;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f1239f.m77129c() > 0) {
                    int i9 = zjv0Var.f283555l;
                    if (i9 != -1) {
                    }
                    iM96246b = zjv0Var.m96246b();
                    i2 = i;
                    while (true) {
                        if (i2 < iM96246b) {
                            dkv0VarM993M2 = m993M(i2);
                            if (dkv0VarM993M2 != null) {
                                view3 = dkv0VarM993M2.f50039a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            dkv0VarM993M = m993M(iMin);
                            if (dkv0VarM993M == null) {
                                break;
                                break;
                            }
                            view2 = dkv0VarM993M.f50039a;
                            if (view2.hasFocusable()) {
                                view = view2;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i3 = zjv0Var.f283557n;
                    if (i3 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (this.f1239f.f205271c.contains(getFocusedChild())) {
                j = zjv0Var.f283556m;
                view = null;
                if (j == -1 && (z = this.f1204N0.f92279b) && z) {
                    int iM44966e = this.f1239f.f205269a.m44966e();
                    dkv0Var = null;
                    for (int i10 = 0; i10 < iM44966e; i10++) {
                        dkv0 dkv0VarM969U3 = m969U(this.f1239f.f205269a.m44965d(i10));
                        if (dkv0VarM969U3 != null && !dkv0VarM969U3.m36330t() && dkv0VarM969U3.f50043e == j) {
                            if (!this.f1239f.f205271c.contains(dkv0VarM969U3.f50039a)) {
                                dkv0Var = dkv0VarM969U3;
                                break;
                            }
                            dkv0Var = dkv0VarM969U3;
                        }
                    }
                } else {
                    dkv0Var = null;
                }
                if (dkv0Var != null) {
                    view2 = dkv0Var.f50039a;
                    if (!this.f1239f.f205271c.contains(view2) && view2.hasFocusable()) {
                        view = view2;
                        break;
                    }
                    if (this.f1239f.m77129c() > 0) {
                        int i11 = zjv0Var.f283555l;
                        i = i11 != -1 ? i11 : 0;
                        iM96246b = zjv0Var.m96246b();
                        i2 = i;
                        while (true) {
                            if (i2 < iM96246b) {
                                dkv0VarM993M2 = m993M(i2);
                                if (dkv0VarM993M2 != null) {
                                    view3 = dkv0VarM993M2.f50039a;
                                    if (view3.hasFocusable()) {
                                        view = view3;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                dkv0VarM993M = m993M(iMin);
                                if (dkv0VarM993M == null) {
                                    break;
                                }
                                view2 = dkv0VarM993M.f50039a;
                                if (view2.hasFocusable()) {
                                    view = view2;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f1239f.m77129c() > 0) {
                    int i12 = zjv0Var.f283555l;
                    if (i12 != -1) {
                    }
                    iM96246b = zjv0Var.m96246b();
                    i2 = i;
                    while (true) {
                        if (i2 < iM96246b) {
                            dkv0VarM993M2 = m993M(i2);
                            if (dkv0VarM993M2 != null) {
                                view3 = dkv0VarM993M2.f50039a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            dkv0VarM993M = m993M(iMin);
                            if (dkv0VarM993M == null) {
                                break;
                                break;
                            }
                            view2 = dkv0VarM993M.f50039a;
                            if (view2.hasFocusable()) {
                                view = view2;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i3 = zjv0Var.f283557n;
                    if (i3 != -1 && (viewFindViewById = view.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        zjv0Var.f283556m = -1L;
        zjv0Var.f283555l = -1;
        zjv0Var.f283557n = -1;
    }

    /* JADX INFO: renamed from: v0 */
    public void mo1035v0(int i) {
        if (this.f1226Y0) {
            return;
        }
        m984C0();
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a == null) {
            return;
        }
        abstractC0110a.mo924I0(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: w */
    public final void m1036w() {
        View viewM990I;
        zjv0 zjv0Var = this.f1194F1;
        zjv0Var.m96245a(1);
        m989H(zjv0Var);
        zjv0Var.f283552i = false;
        m980A0();
        wh51 wh51Var = this.f1241g;
        wh51Var.m88099j();
        m1005d0();
        m1014j0();
        dkv0 dkv0VarM997T = null;
        View focusedChild = (this.f1190B1 && hasFocus() && this.f1204N0 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM990I = m990I(focusedChild)) != null) {
            dkv0VarM997T = m997T(viewM990I);
        }
        if (dkv0VarM997T == null) {
            zjv0Var.f283556m = -1L;
            zjv0Var.f283555l = -1;
            zjv0Var.f283557n = -1;
        } else {
            zjv0Var.f283556m = this.f1204N0.f92279b ? dkv0VarM997T.f50043e : -1L;
            zjv0Var.f283555l = this.f1238e1 ? -1 : dkv0VarM997T.m36330t() ? dkv0VarM997T.f50042d : dkv0VarM997T.m36322l();
            View focusedChild2 = dkv0VarM997T.f50039a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            zjv0Var.f283557n = id;
        }
        zjv0Var.f283551h = zjv0Var.f283553j && this.f1198J1;
        this.f1198J1 = false;
        this.f1197I1 = false;
        zjv0Var.f283550g = zjv0Var.f283554k;
        zjv0Var.f283548e = this.f1204N0.mo1617e();
        m992K(this.f1207O1);
        if (zjv0Var.f283553j) {
            int iM77129c = this.f1239f.m77129c();
            for (int i = 0; i < iM77129c; i++) {
                dkv0 dkv0VarM969U = m969U(this.f1239f.m77128b(i));
                if (!dkv0VarM969U.m36319B() && (!dkv0VarM969U.m36328r() || this.f1204N0.f92279b)) {
                    mjv0 mjv0Var = this.f1251n1;
                    mjv0.m61990b(dkv0VarM969U);
                    dkv0VarM969U.m36325o();
                    mjv0Var.getClass();
                    qr8 qr8Var = new qr8(false);
                    qr8Var.m73604o(dkv0VarM969U);
                    wh51Var.m88098i(dkv0VarM969U, qr8Var);
                    if (zjv0Var.f283551h && dkv0VarM969U.m36333w() && !dkv0VarM969U.m36330t() && !dkv0VarM969U.m36319B() && !dkv0VarM969U.m36328r()) {
                        wh51Var.m88096g(m996Q(dkv0VarM969U), dkv0VarM969U);
                    }
                }
            }
        }
        if (zjv0Var.f283554k) {
            int iM44966e = this.f1239f.f205269a.m44966e();
            for (int i2 = 0; i2 < iM44966e; i2++) {
                dkv0 dkv0VarM969U2 = m969U(this.f1239f.f205269a.m44965d(i2));
                if (f1179Z1 && dkv0VarM969U2.f50041c == -1 && !dkv0VarM969U2.m36330t()) {
                    throw new IllegalStateException(o7t0.m66395i(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!dkv0VarM969U2.m36319B() && dkv0VarM969U2.f50042d == -1) {
                    dkv0VarM969U2.f50042d = dkv0VarM969U2.f50041c;
                }
            }
            boolean z = zjv0Var.f283549f;
            zjv0Var.f283549f = false;
            this.f1206O0.mo915u0(this.f1233c, zjv0Var);
            zjv0Var.f283549f = z;
            for (int i3 = 0; i3 < this.f1239f.m77129c(); i3++) {
                dkv0 dkv0VarM969U3 = m969U(this.f1239f.m77128b(i3));
                if (!dkv0VarM969U3.m36319B() && !wh51Var.m88105p(dkv0VarM969U3)) {
                    mjv0.m61990b(dkv0VarM969U3);
                    boolean z2 = (dkv0VarM969U3.f50048t & 8192) != 0;
                    mjv0 mjv0Var2 = this.f1251n1;
                    dkv0VarM969U3.m36325o();
                    mjv0Var2.getClass();
                    qr8 qr8Var2 = new qr8(false);
                    qr8Var2.m73604o(dkv0VarM969U3);
                    if (z2) {
                        m1017l0(dkv0VarM969U3, qr8Var2);
                    } else {
                        wh51Var.m88094d(dkv0VarM969U3, qr8Var2);
                    }
                }
            }
            m1023p();
        } else {
            m1023p();
        }
        m1006e0(true);
        m982B0(false);
        zjv0Var.f283547d = 2;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m1037w0(hjv0 hjv0Var, boolean z, boolean z2) {
        hjv0 hjv0Var2 = this.f1204N0;
        C2262pn c2262pn = this.f1231b;
        if (hjv0Var2 != null) {
            hjv0Var2.mo47722z(c2262pn);
            this.f1204N0.mo28696q(this);
        }
        vjv0 vjv0Var = this.f1233c;
        if (!z || z2) {
            mjv0 mjv0Var = this.f1251n1;
            if (mjv0Var != null) {
                mjv0Var.mo33396g();
            }
            AbstractC0110a abstractC0110a = this.f1206O0;
            if (abstractC0110a != null) {
                abstractC0110a.m1091C0(vjv0Var);
                this.f1206O0.m1092D0(vjv0Var);
            }
            vjv0Var.f242060a.clear();
            vjv0Var.m85784g();
        }
        this.f1237e.m37283E();
        hjv0 hjv0Var3 = this.f1204N0;
        this.f1204N0 = hjv0Var;
        if (hjv0Var != null) {
            hjv0Var.mo47719v(c2262pn);
            hjv0Var.mo28858m(this);
        }
        AbstractC0110a abstractC0110a2 = this.f1206O0;
        if (abstractC0110a2 != null) {
            abstractC0110a2.mo1057g0(hjv0Var3, this.f1204N0);
        }
        hjv0 hjv0Var4 = this.f1204N0;
        vjv0Var.f242060a.clear();
        vjv0Var.m85784g();
        vjv0Var.m85783f(hjv0Var3, true);
        ujv0 ujv0VarM85780c = vjv0Var.m85780c();
        if (hjv0Var3 != null) {
            ujv0VarM85780c.f231155b--;
        }
        if (!z && ujv0VarM85780c.f231155b == 0) {
            SparseArray sparseArray = ujv0VarM85780c.f231154a;
            for (int i = 0; i < sparseArray.size(); i++) {
                tjv0 tjv0Var = (tjv0) sparseArray.valueAt(i);
                Iterator it = tjv0Var.f221019a.iterator();
                while (it.hasNext()) {
                    mvl0.m62946i(((dkv0) it.next()).f50039a);
                }
                tjv0Var.f221019a.clear();
            }
        }
        if (hjv0Var4 != null) {
            ujv0VarM85780c.f231155b++;
        } else {
            ujv0VarM85780c.getClass();
        }
        vjv0Var.m85782e();
        this.f1194F1.f283549f = true;
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m1038x0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM70536q = pp91.m70536q(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f1229a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f1182c2;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM70536q;
    }

    /* JADX INFO: renamed from: y */
    public final void m1039y() {
        m980A0();
        m1005d0();
        zjv0 zjv0Var = this.f1194F1;
        zjv0Var.m96245a(6);
        this.f1237e.m37297i();
        zjv0Var.f283548e = this.f1204N0.mo1617e();
        zjv0Var.f283546c = 0;
        if (this.f1235d != null) {
            hjv0 hjv0Var = this.f1204N0;
            int iM38547C = edb.m38547C(hjv0Var.f92280c);
            if (iM38547C == 1 ? hjv0Var.mo1617e() > 0 : iM38547C != 2) {
                Parcelable parcelable = this.f1235d.f262233c;
                if (parcelable != null) {
                    this.f1206O0.mo961x0(parcelable);
                }
                this.f1235d = null;
            }
        }
        zjv0Var.f283550g = false;
        this.f1206O0.mo915u0(this.f1233c, zjv0Var);
        zjv0Var.f283549f = false;
        zjv0Var.f283553j = zjv0Var.f283553j && this.f1251n1 != null;
        zjv0Var.f283547d = 4;
        m1006e0(true);
        m982B0(false);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m1040y0(int i, int i2, Interpolator interpolator, boolean z) {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a == null || this.f1226Y0) {
            return;
        }
        if (!abstractC0110a.mo951q()) {
            i = 0;
        }
        if (!this.f1206O0.mo953r()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m53303h(i3, 1);
        }
        this.f1191C1.m33204c(i, i2, Integer.MIN_VALUE, interpolator);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1041z(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m53298c(i, i2, i3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: z0 */
    public void mo1042z0(int i) {
        AbstractC0110a abstractC0110a;
        if (this.f1226Y0 || (abstractC0110a = this.f1206O0) == null) {
            return;
        }
        abstractC0110a.mo926S0(this, this.f1194F1, i);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fM75387a;
        float fM75387a2;
        TypedArray typedArray;
        int i2;
        ClassLoader classLoader;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f1231b = new C2262pn(this, 3);
        this.f1233c = new vjv0(this);
        this.f1241g = new wh51();
        this.f1245i = new zu3(this, 13);
        this.f1257t = new Rect();
        this.f1200L0 = new Rect();
        this.f1202M0 = new RectF();
        this.f1208P0 = new ArrayList();
        this.f1210Q0 = new ArrayList();
        this.f1212R0 = new ArrayList();
        int i3 = 0;
        this.f1222W0 = 0;
        this.f1238e1 = false;
        this.f1240f1 = false;
        this.f1242g1 = 0;
        this.f1244h1 = 0;
        this.f1246i1 = f1188i2;
        this.f1251n1 = new cmp();
        this.f1252o1 = 0;
        this.f1253p1 = -1;
        this.f1264z1 = Float.MIN_VALUE;
        this.f1189A1 = Float.MIN_VALUE;
        this.f1190B1 = true;
        this.f1191C1 = new ckv0(this);
        Object[] objArr = null;
        this.f1193E1 = f1185f2 ? new gx8() : null;
        zjv0 zjv0Var = new zjv0();
        zjv0Var.f283544a = -1;
        zjv0Var.f283545b = 0;
        zjv0Var.f283546c = 0;
        zjv0Var.f283547d = 1;
        zjv0Var.f283548e = 0;
        zjv0Var.f283549f = false;
        zjv0Var.f283550g = false;
        zjv0Var.f283551h = false;
        zjv0Var.f283552i = false;
        zjv0Var.f283553j = false;
        zjv0Var.f283554k = false;
        this.f1194F1 = zjv0Var;
        this.f1197I1 = false;
        this.f1198J1 = false;
        phn0 phn0Var = new phn0(this, 29);
        this.f1199K1 = phn0Var;
        this.f1201L1 = false;
        this.f1207O1 = new int[2];
        this.f1211Q1 = new int[2];
        this.f1213R1 = new int[2];
        this.f1215S1 = new int[2];
        this.f1217T1 = new ArrayList();
        this.f1219U1 = new dvx(this, 2);
        this.f1223W1 = 0;
        this.f1225X1 = 0;
        this.f1227Y1 = new fjv0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1260v1 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = rec1.f198345a;
            fM75387a = c150.m31243y(viewConfiguration);
        } else {
            fM75387a = rec1.m75387a(viewConfiguration, context);
        }
        this.f1264z1 = fM75387a;
        if (i4 >= 26) {
            fM75387a2 = c150.m31244z(viewConfiguration);
        } else {
            fM75387a2 = rec1.m75387a(viewConfiguration, context);
        }
        this.f1189A1 = fM75387a2;
        this.f1262x1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1263y1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1229a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1251n1.f144345a = phn0Var;
        this.f1237e = new dy0(new urt0(this, 5));
        this.f1239f = new s3e(new gjv0(this, i3));
        WeakHashMap weakHashMap = mec1.f142677a;
        if ((i4 >= 26 ? fec1.m41421a(this) : 0) == 0 && i4 >= 26) {
            fec1.m41422b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1234c1 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new fkv0(this));
        int[] iArr = z0u0.f278169a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        mec1.m61563o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1243h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                typedArray = typedArrayObtainStyledAttributes;
                i2 = 4;
                new bey(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.spotify.music.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.spotify.music.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.spotify.music.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(o7t0.m66395i(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(AbstractC0110a.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f1186g2);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[r11] = attributeSet;
                        objArr2[2] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0110a) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = f1181b2;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        mec1.m61563o(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        mvl0.m62935C(this);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0110a abstractC0110a = this.f1206O0;
        if (abstractC0110a != null) {
            return abstractC0110a.mo890G(layoutParams);
        }
        throw new IllegalStateException(o7t0.m66395i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(wjv0 wjv0Var) {
    }
}
