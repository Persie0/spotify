package p204p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes3.dex */
public final class n400 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o400 f150160b;

    public /* synthetic */ n400(o400 o400Var, int i) {
        this.f150159a = i;
        this.f150160b = o400Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f150159a) {
            case 0:
                ViewParent parent = this.f150160b.f161499d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                o400 o400Var = this.f150160b;
                o400Var.m66218a();
                View view = o400Var.f161499d;
                if (view.isEnabled() && !view.isLongClickable() && o400Var.mo28358c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    o400Var.f161502g = true;
                    break;
                }
                break;
        }
    }
}
