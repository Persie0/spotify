package p204p;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class uf20 extends mjc1 {

    /* JADX INFO: renamed from: c */
    public bz1 f229656c;

    /* JADX INFO: renamed from: d */
    public OverScroller f229657d;

    /* JADX INFO: renamed from: e */
    public boolean f229658e;

    /* JADX INFO: renamed from: f */
    public int f229659f;

    /* JADX INFO: renamed from: g */
    public int f229660g;

    /* JADX INFO: renamed from: h */
    public int f229661h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f229662i;

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: g */
    public final boolean mo1562g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        AppBarLayout.BaseBehavior baseBehavior;
        cky0 cky0Var;
        WeakReference weakReference;
        boolean zM33213a;
        View view2;
        boolean z;
        OverScroller overScroller;
        int iFindPointerIndex;
        if (this.f229661h < 0) {
            this.f229661h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f229658e) {
            int i = this.f229659f;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f229660g) > this.f229661h) {
                    this.f229660g = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f229659f = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    baseBehavior = (AppBarLayout.BaseBehavior) this;
                    cky0Var = baseBehavior.f1947o;
                    if (cky0Var != null) {
                        zM33213a = cky0Var.m33213a();
                    } else {
                        weakReference = baseBehavior.f1946n;
                        if (weakReference == null) {
                            zM33213a = true;
                        } else {
                            zM33213a = true;
                        }
                    }
                    if (zM33213a) {
                        z = false;
                    } else {
                        z = false;
                    }
                    this.f229658e = z;
                    if (z) {
                        this.f229660g = y;
                        this.f229659f = motionEvent.getPointerId(0);
                        if (this.f229662i == null) {
                            this.f229662i = VelocityTracker.obtain();
                        }
                        overScroller = this.f229657d;
                        if (overScroller != null) {
                            this.f229657d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.f229662i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f229659f = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                baseBehavior = (AppBarLayout.BaseBehavior) this;
                cky0Var = baseBehavior.f1947o;
                if (cky0Var != null) {
                    zM33213a = cky0Var.m33213a();
                } else {
                    weakReference = baseBehavior.f1946n;
                    if (weakReference == null && ((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                        zM33213a = false;
                    } else {
                        zM33213a = true;
                    }
                }
                if (zM33213a || !coordinatorLayout.m376q(view, x2, y)) {
                    z = false;
                } else {
                    z = true;
                }
                this.f229658e = z;
                if (z) {
                    this.f229660g = y;
                    this.f229659f = motionEvent.getPointerId(0);
                    if (this.f229662i == null) {
                        this.f229662i = VelocityTracker.obtain();
                    }
                    overScroller = this.f229657d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f229657d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.f229662i;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6 A[ADDED_TO_REGION] */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: s */
    public final boolean mo1563s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f229659f);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.f229660g - y;
                    this.f229660g = y;
                    mo1547x(coordinatorLayout, view, mo1546w() - i, -((AppBarLayout) view).getDownNestedScrollRange(), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f229659f = motionEvent.getPointerId(i2);
                    this.f229660g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.f229662i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f229658e || z;
        }
        VelocityTracker velocityTracker3 = this.f229662i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f229662i.computeCurrentVelocity(1000);
            float yVelocity = this.f229662i.getYVelocity(this.f229659f);
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = -appBarLayout.getTotalScrollRange();
            Runnable runnable = this.f229656c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f229656c = null;
            }
            if (this.f229657d == null) {
                this.f229657d = new OverScroller(view.getContext());
            }
            this.f229657d.fling(0, m61963t(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.f229657d.computeScrollOffset()) {
                bz1 bz1Var = new bz1(this, coordinatorLayout, view);
                this.f229656c = bz1Var;
                WeakHashMap weakHashMap = mec1.f142677a;
                view.postOnAnimation(bz1Var);
            } else {
                ((AppBarLayout.BaseBehavior) this).m1536D(coordinatorLayout, appBarLayout);
                if (appBarLayout.f1925M0) {
                    appBarLayout.m1530f(appBarLayout.m1531g(AppBarLayout.BaseBehavior.m1532A(coordinatorLayout)));
                }
            }
            z = true;
        }
        this.f229658e = false;
        this.f229659f = -1;
        velocityTracker = this.f229662i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f229662i = null;
        }
        velocityTracker2 = this.f229662i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f229658e) {
        }
        z = false;
        this.f229658e = false;
        this.f229659f = -1;
        velocityTracker = this.f229662i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f229662i = null;
        }
        velocityTracker2 = this.f229662i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f229658e) {
        }
    }

    /* JADX INFO: renamed from: w */
    public abstract int mo1546w();

    /* JADX INFO: renamed from: x */
    public abstract int mo1547x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    /* JADX INFO: renamed from: y */
    public final void m82947y(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo1547x(coordinatorLayout, view, i, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
