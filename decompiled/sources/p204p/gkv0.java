package p204p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public final class gkv0 implements rjv0 {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f80917a;

    /* JADX INFO: renamed from: b */
    public final y10 f80918b;

    public gkv0(GestureDetector gestureDetector, y10 y10Var) {
        this.f80917a = gestureDetector;
        this.f80918b = y10Var;
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: c */
    public final boolean mo28971c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f80917a.onTouchEvent(motionEvent)) {
            return false;
        }
        this.f80918b.onClick(recyclerView);
        return true;
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: d */
    public final void mo28972d(boolean z) {
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: e */
    public final void mo28973e(MotionEvent motionEvent) {
    }
}
