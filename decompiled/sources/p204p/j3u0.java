package p204p;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class j3u0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final m3x f108478a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f108479b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f108480c;

    /* JADX INFO: renamed from: d */
    public final View.OnTouchListener f108481d;

    /* JADX INFO: renamed from: e */
    public final boolean f108482e = true;

    public j3u0(m3x m3xVar, View view, View view2) {
        this.f108478a = m3xVar;
        this.f108479b = new WeakReference(view2);
        this.f108480c = new WeakReference(view);
        this.f108481d = uhc1.m83151g(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = (View) this.f108480c.get();
        View view3 = (View) this.f108479b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            xwe.m92282b(this.f108478a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f108481d;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}
