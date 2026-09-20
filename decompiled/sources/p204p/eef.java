package p204p;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class eef implements View.OnTouchListener {

    /* JADX INFO: renamed from: b */
    public static final eef f58761b = new eef(0);

    /* JADX INFO: renamed from: c */
    public static final eef f58762c = new eef(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58763a;

    public /* synthetic */ eef(int i) {
        this.f58763a = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f58763a) {
            case 0:
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            case 1:
                if (motionEvent.getAction() == 1) {
                    view.performClick();
                }
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            default:
                return false;
        }
    }
}
