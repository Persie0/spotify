package p204p;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tmq {

    /* JADX INFO: renamed from: a */
    public boolean f221762a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f221763b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ay1 f221764c = new ay1(this, 8);

    /* JADX INFO: renamed from: d */
    public View f221765d;

    /* JADX INFO: renamed from: a */
    public final void m81145a(View view) {
        if (wj50.m88271j(this.f221765d, view)) {
            return;
        }
        View view2 = this.f221765d;
        ay1 ay1Var = this.f221764c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(ay1Var);
        }
        boolean z = this.f221762a;
        ArrayList<View.OnAttachStateChangeListener> arrayList = this.f221763b;
        if (z) {
            for (View.OnAttachStateChangeListener onAttachStateChangeListener : arrayList) {
                View view3 = this.f221765d;
                wj50.m88279p(view3);
                onAttachStateChangeListener.onViewDetachedFromWindow(view3);
            }
            this.f221762a = false;
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(ay1Var);
            if (view.isAttachedToWindow()) {
                this.f221762a = true;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((View.OnAttachStateChangeListener) it.next()).onViewAttachedToWindow(view);
                }
            }
        }
        this.f221765d = view;
    }
}
