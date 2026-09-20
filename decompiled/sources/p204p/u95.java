package p204p;

import android.app.ActivityManager;
import android.content.Context;
import io.reactivex.rxjava3.functions.Action;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public final class u95 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v95 f228074a;

    public u95(v95 v95Var) {
        this.f228074a = v95Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        v95 v95Var = this.f228074a;
        ldx0 ldx0Var = new ldx0(((ActivityManager) ((er70) v95Var.f238844c).get()).getHistoricalProcessExitReasons(((Context) v95Var.f238843b).getPackageName(), 0, 5));
        t95 t95Var = (t95) ((er70) v95Var.f238845d).get();
        Iterator it = ldx0Var.iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((kdx0) it).f121747b;
            if (!listIterator.hasPrevious()) {
                return;
            } else {
                t95Var.mo47858a(zfs.m96037d(listIterator.previous()));
            }
        }
    }
}
