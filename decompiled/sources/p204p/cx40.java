package p204p;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public final class cx40 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Dialog f42902a;

    /* JADX INFO: renamed from: b */
    public final int f42903b;

    /* JADX INFO: renamed from: c */
    public final int f42904c;

    /* JADX INFO: renamed from: d */
    public final int f42905d;

    public cx40(Dialog dialog, Rect rect) {
        this.f42902a = dialog;
        this.f42903b = rect.left;
        this.f42904c = rect.top;
        this.f42905d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f42903b;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f42904c;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f42905d;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f42902a.onTouchEvent(motionEventObtain);
    }
}
