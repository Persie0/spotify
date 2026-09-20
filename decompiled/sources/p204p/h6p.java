package p204p;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class h6p {

    /* JADX INFO: renamed from: a */
    public final zv41 f88210a = jag1.m52819d(null);

    /* JADX INFO: renamed from: b */
    public View f88211b;

    /* JADX INFO: renamed from: c */
    public j96 f88212c;

    /* JADX INFO: renamed from: a */
    public final void m46737a(View view) {
        if (!view.isAttachedToWindow() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
        zv41 zv41Var = this.f88210a;
        zv41Var.getClass();
        zv41Var.m97091m(null, rect);
    }
}
