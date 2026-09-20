package p204p;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class zsb implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f285903b;

    public /* synthetic */ zsb(Object obj, int i) {
        this.f285902a = i;
        this.f285903b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f285902a) {
            case 0:
                ((ctb) this.f285903b).m33834N();
                break;
            default:
                ((CoordinatorLayout) this.f285903b).m377r(0);
                break;
        }
        return true;
    }
}
