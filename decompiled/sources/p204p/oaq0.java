package p204p;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class oaq0 extends naq0 {
    @Override // p204p.tm4
    /* JADX INFO: renamed from: o */
    public final void mo66572o(Rect rect, View view) {
        rect.set(((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics().getBounds());
    }
}
