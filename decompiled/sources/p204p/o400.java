package p204p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o400 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f161496a;

    /* JADX INFO: renamed from: b */
    public final int f161497b;

    /* JADX INFO: renamed from: c */
    public final int f161498c;

    /* JADX INFO: renamed from: d */
    public final View f161499d;

    /* JADX INFO: renamed from: e */
    public n400 f161500e;

    /* JADX INFO: renamed from: f */
    public n400 f161501f;

    /* JADX INFO: renamed from: g */
    public boolean f161502g;

    /* JADX INFO: renamed from: h */
    public int f161503h;

    /* JADX INFO: renamed from: i */
    public final int[] f161504i = new int[2];

    public o400(View view) {
        this.f161499d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f161496a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f161497b = tapTimeout;
        this.f161498c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m66218a() {
        n400 n400Var = this.f161501f;
        View view = this.f161499d;
        if (n400Var != null) {
            view.removeCallbacks(n400Var);
        }
        n400 n400Var2 = this.f161500e;
        if (n400Var2 != null) {
            view.removeCallbacks(n400Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract ft11 mo28357b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo28358c();

    /* JADX INFO: renamed from: d */
    public boolean mo66219d() {
        ft11 ft11VarMo28357b = mo28357b();
        if (ft11VarMo28357b == null || !ft11VarMo28357b.mo42574a()) {
            return true;
        }
        ft11VarMo28357b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        rhs rhsVarMo42576n;
        boolean z2 = this.f161502g;
        View view2 = this.f161499d;
        if (z2) {
            ft11 ft11VarMo28357b = mo28357b();
            if (ft11VarMo28357b != null && ft11VarMo28357b.mo42574a() && (rhsVarMo42576n = ft11VarMo28357b.mo42576n()) != null && rhsVarMo42576n.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f161504i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                rhsVarMo42576n.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM75520b = rhsVarMo42576n.m75520b(motionEventObtainNoHistory, this.f161503h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM75520b && z3) {
                    z = true;
                } else if (mo66219d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (mo66219d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f161503h = motionEvent.getPointerId(0);
                    if (this.f161500e == null) {
                        this.f161500e = new n400(this, 0);
                    }
                    view2.postDelayed(this.f161500e, this.f161497b);
                    if (this.f161501f == null) {
                        this.f161501f = new n400(this, 1);
                    }
                    view2.postDelayed(this.f161501f, this.f161498c);
                } else if (actionMasked2 == 1) {
                    m66218a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f161503h);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f161496a;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m66218a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (mo28358c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m66218a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f161502g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f161502g = false;
        this.f161503h = -1;
        n400 n400Var = this.f161500e;
        if (n400Var != null) {
            this.f161499d.removeCallbacks(n400Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
