package p204p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class z9k0 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public gh00 f280816a;

    /* JADX INFO: renamed from: b */
    public s9k0 f280817b;

    /* JADX INFO: renamed from: c */
    public final long f280818c;

    /* JADX INFO: renamed from: d */
    public boolean f280819d;

    /* JADX INFO: renamed from: e */
    public float f280820e;

    /* JADX INFO: renamed from: f */
    public int f280821f;

    /* JADX INFO: renamed from: g */
    public boolean f280822g;

    /* JADX INFO: renamed from: h */
    public jy4 f280823h;

    /* JADX INFO: renamed from: i */
    public final Handler f280824i;

    public z9k0(Context context) {
        super(context);
        this.f280818c = ViewConfiguration.getLongPressTimeout();
        this.f280824i = new Handler(Looper.getMainLooper());
        setClipChildren(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: renamed from: a */
    public final void m95683a() {
        jy4 jy4Var = this.f280823h;
        if (jy4Var != null) {
            this.f280824i.removeCallbacks(jy4Var);
        }
        this.f280823h = null;
        this.f280819d = false;
        this.f280820e = 0.0f;
        this.f280821f = 0;
        this.f280822g = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public final gh00 getOnEvent() {
        return this.f280816a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gh00 gh00Var;
        s9k0 s9k0Var = this.f280817b;
        if (s9k0Var == null || !s9k0Var.f206967a) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m95683a();
            jy4 jy4Var = new jy4(this, motionEvent.getRawY(), 1);
            this.f280823h = jy4Var;
            this.f280824i.postDelayed(jy4Var, this.f280818c);
        } else if (actionMasked == 1 || actionMasked == 3) {
            if (this.f280819d && (gh00Var = this.f280816a) != null) {
                gh00Var.invoke(t9k0.f218323a);
            }
            m95683a();
        }
        return this.f280819d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                s9k0 s9k0Var = this.f280817b;
                if (s9k0Var != null) {
                    float fM77586a = s9k0Var.m77586a((int) (this.f280821f + (this.f280820e - motionEvent.getRawY())));
                    gh00 gh00Var = this.f280816a;
                    if (gh00Var != null) {
                        gh00Var.invoke(new v9k0(fM77586a));
                    }
                    z = fM77586a >= 0.75f;
                    if (z != this.f280822g) {
                        this.f280822g = z;
                        gh00 gh00Var2 = this.f280816a;
                        if (gh00Var2 != null) {
                            gh00Var2.invoke(new x9k0(z));
                        }
                    }
                }
            }
            return true;
        }
        s9k0 s9k0Var2 = this.f280817b;
        if (s9k0Var2 != null) {
            boolean z2 = s9k0Var2.m77586a((int) (((float) this.f280821f) + (this.f280820e - motionEvent.getRawY()))) > 0.5f;
            z = s9k0Var2.m77586a(this.f280821f) > 0.5f;
            gh00 gh00Var3 = this.f280816a;
            if (gh00Var3 != null) {
                gh00Var3.invoke(new u9k0(z2, z));
            }
        }
        m95683a();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            jy4 jy4Var = this.f280823h;
            if (jy4Var != null) {
                this.f280824i.removeCallbacks(jy4Var);
            }
            this.f280823h = null;
        }
    }

    public final void setGestureConfig(s9k0 s9k0Var) {
        this.f280817b = s9k0Var;
    }

    public final void setOnEvent(gh00 gh00Var) {
        this.f280816a = gh00Var;
    }
}
