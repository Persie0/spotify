package p204p;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class qv50 extends njv0 implements pjv0 {

    /* JADX INFO: renamed from: L0 */
    public int f192877L0;

    /* JADX INFO: renamed from: N0 */
    public int f192879N0;

    /* JADX INFO: renamed from: O0 */
    public RecyclerView f192880O0;

    /* JADX INFO: renamed from: Q0 */
    public VelocityTracker f192882Q0;

    /* JADX INFO: renamed from: R0 */
    public ArrayList f192883R0;

    /* JADX INFO: renamed from: S0 */
    public ArrayList f192884S0;

    /* JADX INFO: renamed from: U0 */
    public csy f192886U0;

    /* JADX INFO: renamed from: V0 */
    public pv50 f192887V0;

    /* JADX INFO: renamed from: X0 */
    public Rect f192890X0;

    /* JADX INFO: renamed from: Y */
    public final ov50 f192891Y;

    /* JADX INFO: renamed from: Y0 */
    public long f192892Y0;

    /* JADX INFO: renamed from: d */
    public float f192897d;

    /* JADX INFO: renamed from: e */
    public float f192898e;

    /* JADX INFO: renamed from: f */
    public float f192899f;

    /* JADX INFO: renamed from: g */
    public float f192900g;

    /* JADX INFO: renamed from: h */
    public float f192901h;

    /* JADX INFO: renamed from: i */
    public float f192902i;

    /* JADX INFO: renamed from: t */
    public float f192903t;

    /* JADX INFO: renamed from: a */
    public final ArrayList f192894a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final float[] f192895b = new float[2];

    /* JADX INFO: renamed from: c */
    public dkv0 f192896c = null;

    /* JADX INFO: renamed from: X */
    public int f192889X = -1;

    /* JADX INFO: renamed from: Z */
    public int f192893Z = 0;

    /* JADX INFO: renamed from: M0 */
    public final ArrayList f192878M0 = new ArrayList();

    /* JADX INFO: renamed from: P0 */
    public final kk00 f192881P0 = new kk00(this, 5);

    /* JADX INFO: renamed from: T0 */
    public View f192885T0 = null;

    /* JADX INFO: renamed from: W0 */
    public final mv50 f192888W0 = new mv50(this);

    public qv50(ov50 ov50Var) {
        this.f192891Y = ov50Var;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m73962p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // p204p.pjv0
    /* JADX INFO: renamed from: a */
    public final void mo32996a(View view) {
        m73971r(view);
        dkv0 dkv0VarM997T = this.f192880O0.m997T(view);
        if (dkv0VarM997T == null) {
            return;
        }
        dkv0 dkv0Var = this.f192896c;
        if (dkv0Var != null && dkv0VarM997T == dkv0Var) {
            m73972s(0, null);
            return;
        }
        m73967m(dkv0VarM997T, false);
        if (this.f192894a.remove(dkv0VarM997T.f50039a)) {
            this.f192891Y.mo68121a(this.f192880O0, dkv0VarM997T);
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        rect.setEmpty();
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: g */
    public final void mo29374g(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        float f;
        float f2;
        if (this.f192896c != null) {
            float[] fArr = this.f192895b;
            m73969o(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        dkv0 dkv0Var = this.f192896c;
        int i = this.f192893Z;
        ov50 ov50Var = this.f192891Y;
        ov50Var.getClass();
        ArrayList arrayList = this.f192878M0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nv50 nv50Var = (nv50) arrayList.get(i2);
            dkv0 dkv0Var2 = nv50Var.f158796e;
            float f4 = nv50Var.f158792a;
            float f5 = nv50Var.f158794c;
            if (f4 == f5) {
                nv50Var.f158800i = dkv0Var2.f50039a.getTranslationX();
            } else {
                nv50Var.f158800i = edb.m38555d(f5, f4, nv50Var.f158804m, f4);
            }
            float f6 = nv50Var.f158793b;
            float f7 = nv50Var.f158795d;
            if (f6 == f7) {
                nv50Var.f158801j = dkv0Var2.f50039a.getTranslationY();
            } else {
                nv50Var.f158801j = edb.m38555d(f7, f6, nv50Var.f158804m, f6);
            }
            int iSave = canvas.save();
            ov50Var.mo38513j(canvas, recyclerView, nv50Var.f158796e, nv50Var.f158800i, nv50Var.f158801j, nv50Var.f158797f, false);
            canvas.restoreToCount(iSave);
        }
        if (dkv0Var != null) {
            int iSave2 = canvas.save();
            ov50Var.mo38513j(canvas, recyclerView, dkv0Var, f2, f, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: h */
    public final void mo28974h(Canvas canvas, RecyclerView recyclerView, zjv0 zjv0Var) {
        boolean z = false;
        if (this.f192896c != null) {
            float[] fArr = this.f192895b;
            m73969o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        dkv0 dkv0Var = this.f192896c;
        this.f192891Y.getClass();
        ArrayList arrayList = this.f192878M0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nv50 nv50Var = (nv50) arrayList.get(i);
            int iSave = canvas.save();
            View view = nv50Var.f158796e.f50039a;
            canvas.restoreToCount(iSave);
        }
        if (dkv0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            nv50 nv50Var2 = (nv50) arrayList.get(i2);
            boolean z2 = nv50Var2.f158803l;
            if (z2 && !nv50Var2.f158799h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m73963i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f192880O0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        mv50 mv50Var = this.f192888W0;
        if (recyclerView2 != null) {
            recyclerView2.m1022o0(this);
            RecyclerView recyclerView3 = this.f192880O0;
            recyclerView3.f1212R0.remove(mv50Var);
            if (recyclerView3.f1214S0 == mv50Var) {
                recyclerView3.f1214S0 = null;
            }
            this.f192880O0.m1024p0(this);
            ArrayList arrayList = this.f192878M0;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                nv50 nv50Var = (nv50) arrayList.get(0);
                nv50Var.f158798g.cancel();
                this.f192891Y.mo68121a(this.f192880O0, nv50Var.f158796e);
            }
            arrayList.clear();
            this.f192885T0 = null;
            VelocityTracker velocityTracker = this.f192882Q0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f192882Q0 = null;
            }
            pv50 pv50Var = this.f192887V0;
            if (pv50Var != null) {
                pv50Var.f181599b = false;
                this.f192887V0 = null;
            }
            if (this.f192886U0 != null) {
                this.f192886U0 = null;
            }
        }
        this.f192880O0 = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f192899f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f192879N0 = ViewConfiguration.get(this.f192880O0.getContext()).getScaledTouchSlop();
            this.f192880O0.m1011i(this);
            this.f192880O0.m1015k(mv50Var);
            this.f192880O0.m1013j(this);
            this.f192887V0 = new pv50(this);
            this.f192886U0 = new csy(this.f192880O0.getContext(), this.f192887V0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m73964j(int i, dkv0 dkv0Var) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f192900g > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f192882Q0;
        ov50 ov50Var = this.f192891Y;
        if (velocityTracker != null && this.f192889X > -1) {
            float f = this.f192899f;
            ov50Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f192882Q0.getXVelocity(this.f192889X);
            float yVelocity = this.f192882Q0.getYVelocity(this.f192889X);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= ov50Var.mo38511g() && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fMo38512h = ov50Var.mo38512h() * this.f192880O0.getWidth();
        if ((i & i2) == 0 || Math.abs(this.f192900g) <= fMo38512h) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public final void m73965k(int i, int i2, MotionEvent motionEvent) {
        View viewM73968n;
        if (this.f192896c == null && i == 2 && this.f192893Z != 2) {
            ov50 ov50Var = this.f192891Y;
            ov50Var.getClass();
            if (this.f192880O0.getScrollState() == 1) {
                return;
            }
            AbstractC0110a layoutManager = this.f192880O0.getLayoutManager();
            int i3 = this.f192889X;
            dkv0 dkv0VarM997T = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.f192897d;
                float y = motionEvent.getY(iFindPointerIndex) - this.f192898e;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.f192879N0;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.mo951q()) && ((fAbs2 <= fAbs || !layoutManager.mo953r()) && (viewM73968n = m73968n(motionEvent)) != null))) {
                    dkv0VarM997T = this.f192880O0.m997T(viewM73968n);
                }
            }
            if (dkv0VarM997T == null) {
                return;
            }
            RecyclerView recyclerView = this.f192880O0;
            int iMo38510f = ov50Var.mo38510f(dkv0VarM997T);
            WeakHashMap weakHashMap = mec1.f142677a;
            int iM68117b = (ov50.m68117b(iMo38510f, recyclerView.getLayoutDirection()) & 65280) >> 8;
            if (iM68117b == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.f192897d;
            float f3 = y2 - this.f192898e;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.f192879N0;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iM68117b & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iM68117b & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iM68117b & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iM68117b & 2) == 0) {
                        return;
                    }
                }
                this.f192901h = 0.0f;
                this.f192900g = 0.0f;
                this.f192889X = motionEvent.getPointerId(0);
                m73972s(1, dkv0VarM997T);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m73966l(int i, dkv0 dkv0Var) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f192901h > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f192882Q0;
        ov50 ov50Var = this.f192891Y;
        if (velocityTracker != null && this.f192889X > -1) {
            float f = this.f192899f;
            ov50Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f192882Q0.getXVelocity(this.f192889X);
            float yVelocity = this.f192882Q0.getYVelocity(this.f192889X);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= ov50Var.mo38511g() && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fMo38512h = ov50Var.mo38512h() * this.f192880O0.getHeight();
        if ((i & i2) == 0 || Math.abs(this.f192901h) <= fMo38512h) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: m */
    public final void m73967m(dkv0 dkv0Var, boolean z) {
        ArrayList arrayList = this.f192878M0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            nv50 nv50Var = (nv50) arrayList.get(size);
            if (nv50Var.f158796e == dkv0Var) {
                nv50Var.f158802k |= z;
                if (!nv50Var.f158803l) {
                    nv50Var.f158798g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final View m73968n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        dkv0 dkv0Var = this.f192896c;
        if (dkv0Var != null) {
            View view = dkv0Var.f50039a;
            if (m73962p(view, x, y, this.f192902i + this.f192900g, this.f192903t + this.f192901h)) {
                return view;
            }
        }
        ArrayList arrayList = this.f192878M0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            nv50 nv50Var = (nv50) arrayList.get(size);
            View view2 = nv50Var.f158796e.f50039a;
            if (m73962p(view2, x, y, nv50Var.f158800i, nv50Var.f158801j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f192880O0;
        for (int iM77129c = recyclerView.f1239f.m77129c() - 1; iM77129c >= 0; iM77129c--) {
            View viewM77128b = recyclerView.f1239f.m77128b(iM77129c);
            float translationX = viewM77128b.getTranslationX();
            float translationY = viewM77128b.getTranslationY();
            if (x >= viewM77128b.getLeft() + translationX && x <= viewM77128b.getRight() + translationX && y >= viewM77128b.getTop() + translationY && y <= viewM77128b.getBottom() + translationY) {
                return viewM77128b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m73969o(float[] fArr) {
        if ((this.f192877L0 & 12) != 0) {
            fArr[0] = (this.f192902i + this.f192900g) - this.f192896c.f50039a.getLeft();
        } else {
            fArr[0] = this.f192896c.f50039a.getTranslationX();
        }
        if ((this.f192877L0 & 3) != 0) {
            fArr[1] = (this.f192903t + this.f192901h) - this.f192896c.f50039a.getTop();
        } else {
            fArr[1] = this.f192896c.f50039a.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m73970q(dkv0 dkv0Var) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        if (!this.f192880O0.isLayoutRequested() && this.f192893Z == 2) {
            ov50 ov50Var = this.f192891Y;
            ov50Var.getClass();
            int i2 = (int) (this.f192902i + this.f192900g);
            int i3 = (int) (this.f192903t + this.f192901h);
            View view = dkv0Var.f50039a;
            if (Math.abs(i3 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i2 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f192883R0;
                if (arrayList2 == null) {
                    this.f192883R0 = new ArrayList();
                    this.f192884S0 = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f192884S0.clear();
                }
                int iRound = Math.round(this.f192902i + this.f192900g);
                int iRound2 = Math.round(this.f192903t + this.f192901h);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                AbstractC0110a layoutManager = this.f192880O0.getLayoutManager();
                int iM1097I = layoutManager.m1097I();
                int i6 = 0;
                while (i6 < iM1097I) {
                    View viewM1096H = layoutManager.m1096H(i6);
                    if (viewM1096H == view) {
                        i = i6;
                    } else {
                        i = i6;
                        if (viewM1096H.getBottom() >= iRound2 && viewM1096H.getTop() <= height && viewM1096H.getRight() >= iRound && viewM1096H.getLeft() <= width) {
                            dkv0 dkv0VarM997T = this.f192880O0.m997T(viewM1096H);
                            int iAbs5 = Math.abs(i4 - ((viewM1096H.getRight() + viewM1096H.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((viewM1096H.getBottom() + viewM1096H.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f192883R0.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f192884S0.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f192883R0.add(i9, dkv0VarM997T);
                            this.f192884S0.add(i9, Integer.valueOf(i7));
                        }
                        i6 = i + 1;
                        i2 = i2;
                        i3 = i3;
                        iRound = iRound;
                    }
                    i6 = i + 1;
                    i2 = i2;
                    i3 = i3;
                    iRound = iRound;
                }
                int i11 = i2;
                int i12 = i3;
                ArrayList arrayList3 = this.f192883R0;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i11;
                int height2 = view.getHeight() + i12;
                int left2 = i11 - view.getLeft();
                int top2 = i12 - view.getTop();
                int size2 = arrayList3.size();
                dkv0 dkv0Var2 = null;
                int i13 = -1;
                int i14 = 0;
                while (i14 < size2) {
                    dkv0 dkv0Var3 = (dkv0) arrayList3.get(i14);
                    if (left2 <= 0 || (right = dkv0Var3.f50039a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (dkv0Var3.f50039a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                            i13 = iAbs4;
                            dkv0Var2 = dkv0Var3;
                        }
                    }
                    if (left2 < 0 && (left = dkv0Var3.f50039a.getLeft() - i11) > 0 && dkv0Var3.f50039a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                        i13 = iAbs3;
                        dkv0Var2 = dkv0Var3;
                    }
                    if (top2 < 0 && (top = dkv0Var3.f50039a.getTop() - i12) > 0 && dkv0Var3.f50039a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                        i13 = iAbs2;
                        dkv0Var2 = dkv0Var3;
                    }
                    if (top2 > 0 && (bottom = dkv0Var3.f50039a.getBottom() - height2) < 0 && dkv0Var3.f50039a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                        i13 = iAbs;
                        dkv0Var2 = dkv0Var3;
                    }
                    i14++;
                    arrayList3 = arrayList;
                }
                if (dkv0Var2 == null) {
                    this.f192883R0.clear();
                    this.f192884S0.clear();
                    return;
                }
                View view2 = dkv0Var2.f50039a;
                int iM36322l = dkv0Var2.m36322l();
                dkv0Var.m36322l();
                if (ov50Var.mo38514m(dkv0Var, dkv0Var2)) {
                    RecyclerView recyclerView = this.f192880O0;
                    AbstractC0110a layoutManager2 = recyclerView.getLayoutManager();
                    if (!(layoutManager2 instanceof LinearLayoutManager)) {
                        if (layoutManager2.mo951q()) {
                            if (AbstractC0110a.m1079M(view2) <= recyclerView.getPaddingLeft()) {
                                recyclerView.mo1035v0(iM36322l);
                            }
                            if (AbstractC0110a.m1081P(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.mo1035v0(iM36322l);
                            }
                        }
                        if (layoutManager2.mo953r()) {
                            if (AbstractC0110a.m1082Q(view2) <= recyclerView.getPaddingTop()) {
                                recyclerView.mo1035v0(iM36322l);
                            }
                            if (AbstractC0110a.m1078L(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.mo1035v0(iM36322l);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                    linearLayoutManager.mo947n("Cannot drop a view during a scroll or layout calculation");
                    linearLayoutManager.m934b1();
                    linearLayoutManager.m958v1();
                    int iM1083V = AbstractC0110a.m1083V(view);
                    int iM1083V2 = AbstractC0110a.m1083V(view2);
                    byte b = iM1083V < iM1083V2 ? (byte) 1 : (byte) -1;
                    if (linearLayoutManager.f1168T0) {
                        if (b == 1) {
                            linearLayoutManager.mo962x1(iM1083V2, linearLayoutManager.f1165Q0.mo34600i() - (linearLayoutManager.f1165Q0.mo34596e(view) + linearLayoutManager.f1165Q0.mo34598g(view2)));
                            return;
                        } else {
                            linearLayoutManager.mo962x1(iM1083V2, linearLayoutManager.f1165Q0.mo34600i() - linearLayoutManager.f1165Q0.mo34595d(view2));
                            return;
                        }
                    }
                    if (b == -1) {
                        linearLayoutManager.mo962x1(iM1083V2, linearLayoutManager.f1165Q0.mo34598g(view2));
                    } else {
                        linearLayoutManager.mo962x1(iM1083V2, linearLayoutManager.f1165Q0.mo34595d(view2) - linearLayoutManager.f1165Q0.mo34596e(view));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m73971r(View view) {
        if (view == this.f192885T0) {
            this.f192885T0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, p.ov50] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [p.qv50] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.dkv0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [p.ov50] */
    /* JADX WARN: Type inference failed for: r3v3, types: [p.ov50] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    public final void m73972s(int i, dkv0 dkv0Var) {
        ?? r3;
        ?? r12;
        boolean z;
        ?? r13;
        ?? r14;
        ?? r4;
        int iM73966l;
        char c;
        float fSignum;
        Object obj;
        long jMo61994h;
        if (dkv0Var == this.f192896c && i == this.f192893Z) {
            return;
        }
        this.f192892Y0 = Long.MIN_VALUE;
        int i2 = this.f192893Z;
        m73967m(dkv0Var, true);
        this.f192893Z = i;
        if (i == 2) {
            if (dkv0Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f192885T0 = dkv0Var.f50039a;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f192896c;
        ?? r0 = this.f192891Y;
        if (r2 != 0) {
            View view = r2.f50039a;
            if (view.getParent() != null) {
                if (i2 == 2 || this.f192893Z == 2) {
                    iM73966l = 0;
                } else {
                    int iMo38510f = r0.mo38510f(r2);
                    RecyclerView recyclerView = this.f192880O0;
                    WeakHashMap weakHashMap = mec1.f142677a;
                    int iM68117b = (ov50.m68117b(iMo38510f, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (iM68117b == 0) {
                        iM73966l = 0;
                    } else {
                        int i4 = (iMo38510f & 65280) >> 8;
                        if (Math.abs(this.f192900g) > Math.abs(this.f192901h)) {
                            iM73966l = m73964j(iM68117b, r2);
                            if (iM73966l <= 0) {
                                iM73966l = m73966l(iM68117b, r2);
                                if (iM73966l <= 0) {
                                    iM73966l = 0;
                                }
                            } else if ((i4 & iM73966l) == 0) {
                                iM73966l = ov50.m68118c(iM73966l, this.f192880O0.getLayoutDirection());
                            }
                        } else {
                            iM73966l = m73966l(iM68117b, r2);
                            if (iM73966l <= 0) {
                                iM73966l = m73964j(iM68117b, r2);
                                if (iM73966l <= 0) {
                                    iM73966l = 0;
                                } else if ((i4 & iM73966l) == 0) {
                                    iM73966l = ov50.m68118c(iM73966l, this.f192880O0.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f192882Q0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f192882Q0 = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iM73966l == 1 || iM73966l == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f192901h) * this.f192880O0.getHeight();
                    obj = null;
                } else if (iM73966l == 4 || iM73966l == 8 || iM73966l == 16 || iM73966l == 32) {
                    c = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f192900g) * this.f192880O0.getWidth();
                } else {
                    obj = null;
                    c = 0;
                    fSignum = 0.0f;
                }
                if (i2 == 2) {
                    c2 = '\b';
                } else if (iM73966l > 0) {
                    c2 = 2;
                }
                float[] fArr = this.f192895b;
                m73969o(fArr);
                char c3 = c2;
                ?? r15 = c;
                nv50 nv50Var = new nv50(this, r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iM73966l, r2);
                RecyclerView recyclerView2 = this.f192880O0;
                r0.getClass();
                mjv0 itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    jMo61994h = c3 == '\b' ? 200L : 250L;
                } else {
                    jMo61994h = c3 == '\b' ? itemAnimator.f144349e : itemAnimator.mo61994h();
                }
                ValueAnimator valueAnimator = nv50Var.f158798g;
                valueAnimator.setDuration(jMo61994h);
                this.f192878M0.add(nv50Var);
                r2.m36318A(r15);
                valueAnimator.start();
                r4 = r0;
                z = true;
                r14 = r15;
            } else {
                r14 = 0;
                m73971r(view);
                ?? r5 = r0;
                r5.mo68121a(this.f192880O0, r2);
                z = false;
                r4 = r5;
            }
            this.f192896c = null;
            r3 = r4;
            r12 = r14;
        } else {
            r3 = r0;
            r12 = 0;
            z = false;
        }
        if (dkv0Var != null) {
            View view2 = dkv0Var.f50039a;
            RecyclerView recyclerView3 = this.f192880O0;
            int iMo38510f2 = r3.mo38510f(dkv0Var);
            WeakHashMap weakHashMap2 = mec1.f142677a;
            this.f192877L0 = (ov50.m68117b(iMo38510f2, recyclerView3.getLayoutDirection()) & i3) >> (this.f192893Z * 8);
            this.f192902i = view2.getLeft();
            this.f192903t = view2.getTop();
            this.f192896c = dkv0Var;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f192880O0.getParent();
        if (parent != 0) {
            if (this.f192896c != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.f192880O0.getLayoutManager().f1298f = true;
        }
        r3.mo68123o(this.f192893Z, this.f192896c);
        this.f192880O0.invalidate();
    }

    /* JADX INFO: renamed from: t */
    public final void m73973t(dkv0 dkv0Var) {
        RecyclerView recyclerView = this.f192880O0;
        int iMo38510f = this.f192891Y.mo38510f(dkv0Var);
        WeakHashMap weakHashMap = mec1.f142677a;
        if ((ov50.m68117b(iMo38510f, recyclerView.getLayoutDirection()) & 16711680) == 0 || dkv0Var.f50039a.getParent() != this.f192880O0) {
            return;
        }
        VelocityTracker velocityTracker = this.f192882Q0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f192882Q0 = VelocityTracker.obtain();
        this.f192901h = 0.0f;
        this.f192900g = 0.0f;
        m73972s(2, dkv0Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m73974u(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f192897d;
        this.f192900g = f;
        this.f192901h = y - this.f192898e;
        if ((i & 4) == 0) {
            this.f192900g = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f192900g = Math.min(0.0f, this.f192900g);
        }
        if ((i & 1) == 0) {
            this.f192901h = Math.max(0.0f, this.f192901h);
        }
        if ((i & 2) == 0) {
            this.f192901h = Math.min(0.0f, this.f192901h);
        }
    }

    @Override // p204p.pjv0
    /* JADX INFO: renamed from: b */
    public final void mo32997b(View view) {
    }
}
