package p204p;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class g3z0 extends TouchDelegate {

    /* JADX INFO: renamed from: a */
    public final View f76297a;

    /* JADX INFO: renamed from: b */
    public final Rect f76298b;

    /* JADX INFO: renamed from: c */
    public final Rect f76299c;

    /* JADX INFO: renamed from: d */
    public final Rect f76300d;

    /* JADX INFO: renamed from: e */
    public final int f76301e;

    /* JADX INFO: renamed from: f */
    public boolean f76302f;

    public g3z0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f76301e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f76298b = rect3;
        Rect rect4 = new Rect();
        this.f76300d = rect4;
        Rect rect5 = new Rect();
        this.f76299c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f76297a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f76302f;
                if (z2 && !this.f76300d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else if (action != 3) {
                z = true;
                z3 = false;
            } else {
                z2 = this.f76302f;
                this.f76302f = false;
            }
            z3 = z2;
            z = true;
        } else if (this.f76298b.contains(x, y)) {
            this.f76302f = true;
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.f76299c;
        View view = this.f76297a;
        if (!z || rect.contains(x, y)) {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
