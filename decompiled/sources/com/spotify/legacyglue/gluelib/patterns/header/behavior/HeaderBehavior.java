package com.spotify.legacyglue.gluelib.patterns.header.behavior;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p204p.InterfaceC2333rc;
import p204p.fh10;
import p204p.hgj0;
import p204p.hny0;
import p204p.hqk;
import p204p.ljc1;
import p204p.mec1;
import p204p.njc1;
import p204p.q3d0;
import p204p.u010;
import p204p.vf20;
import p204p.vyf1;
import p204p.x610;
import p204p.xud;
import p204p.zk20;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HeaderBehavior<T extends View & fh10> extends ljc1 {

    /* JADX INFO: renamed from: d */
    public boolean f5057d;

    /* JADX INFO: renamed from: f */
    public int f5059f;

    /* JADX INFO: renamed from: h */
    public VelocityTracker f5061h;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f5063j;

    /* JADX INFO: renamed from: k */
    public int f5064k;

    /* JADX INFO: renamed from: m */
    public int f5066m;

    /* JADX INFO: renamed from: n */
    public boolean f5067n;

    /* JADX INFO: renamed from: e */
    public int f5058e = -1;

    /* JADX INFO: renamed from: g */
    public int f5060g = -1;

    /* JADX INFO: renamed from: i */
    public final x610 f5062i = new x610();

    /* JADX INFO: renamed from: l */
    public float f5065l = -2.1474836E9f;

    public HeaderBehavior() {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: g */
    public final boolean mo1562g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (motionEvent.getAction() == 0) {
            this.f5062i.m90070u();
        }
        if (this.f5060g < 0) {
            this.f5060g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f5057d) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5057d = false;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (m59146u() > (-this.f5066m) - this.f5064k && vyf1.m86754s(coordinatorLayout).mo28541d() && coordinatorLayout.m376q(view, x, y)) {
                this.f5059f = y;
                this.f5058e = motionEvent.getPointerId(0);
                if (this.f5061h == null) {
                    this.f5061h = VelocityTracker.obtain();
                }
            }
        } else if (actionMasked == 1) {
            m12570w();
        } else if (actionMasked == 2) {
            int i = this.f5058e;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f5059f) > this.f5060g) {
                    this.f5057d = true;
                    this.f5059f = y2;
                }
            }
        } else if (actionMasked == 3) {
            m12570w();
        }
        VelocityTracker velocityTracker = this.f5061h;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.f5057d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.ljc1, p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.mo1538h(coordinatorLayout, view, i);
        njc1 njc1Var = this.f134058a;
        fh10 fh10Var = (fh10) view;
        njc1Var.f154564e = -fh10Var.getTotalScrollRange();
        njc1Var.f154565f = 0;
        njc1Var.f154566g = true;
        if (this.f5065l != -2.1474836E9f) {
            njc1 njc1Var2 = this.f134058a;
            int i2 = (int) (((-fh10Var.getTotalScrollRange()) - this.f5064k) * this.f5065l);
            if (njc1Var2.f154563d != i2) {
                njc1Var2.f154563d = i2;
                njc1Var2.m64605a();
            }
        }
        int iM59146u = m59146u();
        view.setAlpha(1.0f);
        int iMin = Math.min(-iM59146u, fh10Var.getTotalScrollRange());
        ((hny0) view).mo32831a(iMin / fh10Var.getTotalScrollRange(), iMin);
        this.f5066m = fh10Var.getTotalScrollRange();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: i */
    public final boolean mo1539i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        View childAt;
        GlueHeaderLayout glueHeaderLayout = (GlueHeaderLayout) coordinatorLayout;
        int childCount = glueHeaderLayout.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                childAt = null;
                break;
            }
            childAt = glueHeaderLayout.getChildAt(i4);
            if (((hqk) childAt.getLayoutParams()).f94198a instanceof GlueHeaderAccessoryBehavior) {
                break;
            }
            i4++;
        }
        if (childAt != null) {
            coordinatorLayout.m379t(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), childAt);
            int measuredHeight = childAt.getMeasuredHeight() / 2;
            if (view instanceof InterfaceC2333rc) {
                ((InterfaceC2333rc) view).setCoordinatorAccessoryOffset(measuredHeight);
            }
        }
        if (childAt != null) {
            this.f5064k = childAt.getMeasuredHeight() / 2;
            return false;
        }
        if (view instanceof InterfaceC2333rc) {
            ((InterfaceC2333rc) view).setCoordinatorAccessoryOffset(0);
        }
        this.f5064k = 0;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: k */
    public final void mo1540k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i2 >= 0 || m59146u() > (-this.f5066m) - this.f5064k) {
            fh10 fh10Var = (fh10) view;
            int i4 = (-fh10Var.getTotalScrollRange()) - this.f5064k;
            m12571x(view);
            int iM59146u = m59146u() - i2;
            int i5 = 0;
            int iMax = Math.max(i4, Math.min(iM59146u, 0));
            int i6 = (-fh10Var.getTotalScrollRange()) - this.f5064k;
            m12571x(view);
            int iM59146u2 = m59146u();
            int iMax2 = Math.max(i6, Math.min(iM59146u, 0));
            if (iM59146u2 >= i6 && iM59146u2 <= 0 && iM59146u2 != iMax2) {
                int iM59146u3 = m59146u();
                m59147v(iMax);
                view.setAlpha(1.0f);
                int iMin = Math.min(-iMax, fh10Var.getTotalScrollRange());
                ((hny0) view).mo32831a(iMin / fh10Var.getTotalScrollRange(), iMin);
                coordinatorLayout.m372c(view);
                i5 = iM59146u3 - iMax;
            }
            iArr[1] = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: l */
    public final void mo12569l(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (i < 0) {
            fh10 fh10Var = (fh10) view;
            int i2 = (-fh10Var.getTotalScrollRange()) - this.f5064k;
            m12571x(view);
            int iM59146u = m59146u() - i;
            int iMax = Math.max(i2, Math.min(iM59146u, 0));
            int i3 = (-fh10Var.getTotalScrollRange()) - this.f5064k;
            m12571x(view);
            int iM59146u2 = m59146u();
            int iMax2 = Math.max(i3, Math.min(iM59146u, 0));
            if (iM59146u2 >= i3 && iM59146u2 <= 0 && iM59146u2 != iMax2) {
                m59146u();
                m59147v(iMax);
                view.setAlpha(1.0f);
                int iMin = Math.min(-iMax, fh10Var.getTotalScrollRange());
                ((hny0) view).mo32831a(iMin / fh10Var.getTotalScrollRange(), iMin);
                coordinatorLayout.m372c(view);
            }
        }
        boolean z = i < 0;
        boolean z2 = i > 0;
        int iM59146u3 = m59146u() - i;
        int i4 = (-((fh10) view).getTotalScrollRange()) - this.f5064k;
        m12571x(view);
        int iM59146u4 = m59146u();
        boolean z3 = iM59146u4 < i4 || iM59146u4 > 0 || iM59146u4 == Math.max(i4, Math.min(iM59146u3, 0));
        if ((z && z3) || z2) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (view2 instanceof hgj0) {
                ((hgj0) view2).mo403l(1);
            }
        }
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: o */
    public final void mo1542o(View view, Parcelable parcelable) {
        if (!(parcelable instanceof vf20)) {
            this.f5065l = -2.1474836E9f;
            return;
        }
        vf20 vf20Var = (vf20) parcelable;
        vf20Var.getSuperState();
        boolean z = vf20Var.f240880b;
        this.f5067n = z;
        this.f5065l = z ? 1.0f : vf20Var.f240879a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: p */
    public final Parcelable mo1543p(View view) {
        this.f5067n = m59146u() <= (-this.f5066m) - this.f5064k;
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        int iM59146u = m59146u();
        float totalScrollRange = ((fh10) view).getTotalScrollRange();
        boolean z = this.f5067n;
        vf20 vf20Var = new vf20(absSavedState);
        vf20Var.f240879a = q3d0.m72108r(0.0f, 1.0f, Math.abs(iM59146u / totalScrollRange));
        vf20Var.f240880b = z;
        return vf20Var;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: q */
    public final boolean mo1544q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f5065l = -2.1474836E9f;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eqk
    /* JADX INFO: renamed from: s */
    public final boolean mo1563s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.f5060g < 0) {
            this.f5060g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (coordinatorLayout.m376q(view, x, y) && m59146u() > (-this.f5066m) - this.f5064k && vyf1.m86754s(coordinatorLayout).mo28541d()) {
                this.f5059f = y;
                this.f5058e = motionEvent.getPointerId(0);
                if (this.f5061h == null) {
                    this.f5061h = VelocityTracker.obtain();
                }
                velocityTracker = this.f5061h;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return true;
            }
            return false;
        }
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f5061h;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f5061h.computeCurrentVelocity(1000);
                float yVelocity = this.f5061h.getYVelocity(this.f5058e);
                int i = -(((fh10) view).getTotalScrollRange() + this.f5064k);
                int iM59146u = m59146u();
                u010 u010Var = new u010(this, coordinatorLayout, view, false, 9);
                x610 x610Var = this.f5062i;
                x610Var.m90070u();
                if (((Scroller) x610Var.f258558c) == null) {
                    x610Var.f258558c = new Scroller(view.getContext(), xud.f266081a);
                }
                ((Scroller) x610Var.f258558c).fling(0, iM59146u, 0, Math.round(yVelocity), 0, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                if (((Scroller) x610Var.f258558c).computeScrollOffset()) {
                    zk20 zk20Var = new zk20(x610Var, view, i, u010Var);
                    x610Var.f258557b = zk20Var;
                    WeakHashMap weakHashMap = mec1.f142677a;
                    view.postOnAnimation(zk20Var);
                    x610Var.f258559d = new WeakReference(view);
                } else {
                    x610Var.f258557b = null;
                }
            }
            m12570w();
        } else {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f5058e);
                if (iFindPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f5059f - y2;
                    if (!this.f5057d) {
                        int iAbs = Math.abs(i2);
                        int i3 = this.f5060g;
                        if (iAbs > i3) {
                            this.f5057d = true;
                            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                        }
                    }
                    if (this.f5057d) {
                        this.f5059f = y2;
                        fh10 fh10Var = (fh10) view;
                        int i4 = (-fh10Var.getTotalScrollRange()) - this.f5064k;
                        m12571x(view);
                        int iM59146u2 = m59146u() - i2;
                        int iMax = Math.max(i4, Math.min(iM59146u2, 0));
                        int i5 = (-fh10Var.getTotalScrollRange()) - this.f5064k;
                        m12571x(view);
                        int iM59146u3 = m59146u();
                        int iMax2 = Math.max(i5, Math.min(iM59146u2, 0));
                        if (iM59146u3 >= i5 && iM59146u3 <= 0 && iM59146u3 != iMax2) {
                            m59146u();
                            m59147v(iMax);
                            view.setAlpha(1.0f);
                            fh10 fh10Var2 = (fh10) view;
                            int iMin = Math.min(-iMax, fh10Var2.getTotalScrollRange());
                            ((hny0) view).mo32831a(iMin / fh10Var2.getTotalScrollRange(), iMin);
                            coordinatorLayout.m372c(view);
                        }
                    }
                }
                return false;
            }
            if (actionMasked == 3) {
                m12570w();
            }
        }
        velocityTracker = this.f5061h;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m12570w() {
        this.f5057d = false;
        this.f5058e = -1;
        VelocityTracker velocityTracker = this.f5061h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5061h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m12571x(View view) {
        njc1 njc1Var = this.f134058a;
        if (njc1Var == null) {
            return;
        }
        njc1Var.f154564e = -((fh10) view).getTotalScrollRange();
        njc1Var.f154565f = 0;
        njc1Var.f154566g = true;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
    }
}
