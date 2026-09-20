package p204p;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class dd61 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public eh00 f47731a;

    /* JADX INFO: renamed from: b */
    public boolean f47732b;

    /* JADX INFO: renamed from: c */
    public float f47733c;

    /* JADX INFO: renamed from: d */
    public float f47734d;

    /* JADX INFO: renamed from: e */
    public boolean f47735e;

    /* JADX INFO: renamed from: f */
    public boolean f47736f;

    /* JADX INFO: renamed from: g */
    public final int f47737g;

    /* JADX INFO: renamed from: h */
    public final int f47738h;

    public dd61(Context context) {
        super(context, null, 0);
        this.f47732b = true;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f47737g = scaledTouchSlop;
        this.f47738h = scaledTouchSlop * 4;
    }

    public final eh00 getOnSwipeUp() {
        return this.f47731a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L39;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f47732b) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.f47736f) {
                            return this.f47735e;
                        }
                        float fAbs = Math.abs(motionEvent.getX() - this.f47733c);
                        float y = motionEvent.getY() - this.f47734d;
                        float fAbs2 = Math.abs(y);
                        int i = this.f47737g;
                        float f = i;
                        if (fAbs2 > f || fAbs > f) {
                            this.f47736f = true;
                            if (y < (-i) && fAbs2 > fAbs * 1.2f) {
                                this.f47735e = true;
                                return true;
                            }
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                                return false;
                            }
                        }
                    }
                }
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                this.f47735e = false;
                this.f47736f = false;
                return false;
            }
            this.f47733c = motionEvent.getX();
            this.f47734d = motionEvent.getY();
            this.f47735e = false;
            this.f47736f = false;
            ViewParent parent3 = getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(true);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        eh00 eh00Var;
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f47735e = false;
            this.f47736f = false;
            return true;
        }
        if (this.f47734d - motionEvent.getY() > this.f47738h && (eh00Var = this.f47731a) != null) {
            eh00Var.invoke();
        }
        ViewParent parent2 = getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
        this.f47735e = false;
        this.f47736f = false;
        return true;
    }

    public final void setOnSwipeUp(eh00 eh00Var) {
        this.f47731a = eh00Var;
    }

    public final void setSwipeEnabled(boolean z) {
        this.f47732b = z;
    }
}
