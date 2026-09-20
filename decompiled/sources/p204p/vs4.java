package p204p;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vs4 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xs4 f244337a;

    public vs4(xs4 xs4Var) {
        this.f244337a = xs4Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f244337a.f265474d.removeCallbacks(this);
        xs4.m91962U(this.f244337a);
        xs4 xs4Var = this.f244337a;
        synchronized (xs4Var.f265475e) {
            if (xs4Var.f265480t) {
                xs4Var.f265480t = false;
                ArrayList arrayList = xs4Var.f265477g;
                xs4Var.f265477g = xs4Var.f265478h;
                xs4Var.f265478h = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        xs4.m91962U(this.f244337a);
        xs4 xs4Var = this.f244337a;
        synchronized (xs4Var.f265475e) {
            if (xs4Var.f265477g.isEmpty()) {
                xs4Var.f265473c.removeFrameCallback(this);
                xs4Var.f265480t = false;
            }
        }
    }
}
