package p204p;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class xo40 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h9p f263752a;

    public xo40(h9p h9pVar) {
        this.f263752a = h9pVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        h9p h9pVar = this.f263752a;
        if (!h9pVar.f89014b) {
            if (oo40.m67449a(h9pVar.m46890q(), 1)) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((kz3) h9p.m46873e(h9pVar)).invoke(roz.m76091a(f > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (oo40.m67449a(h9pVar.m46890q(), 2) && Math.abs(f2) > Math.abs(f)) {
                ((kz3) h9p.m46873e(h9pVar)).invoke(roz.m76091a(f2 > 0.0f ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
