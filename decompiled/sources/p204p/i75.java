package p204p;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public final class i75 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zx1 f99429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j75 f99430b;

    public i75(j75 j75Var, zx1 zx1Var) {
        this.f99430b = j75Var;
        this.f99429a = zx1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f99430b.f109491d1.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f99429a);
        }
    }
}
