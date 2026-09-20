package p204p;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ws4 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ys4 f254502a;

    public ws4(ys4 ys4Var) {
        this.f254502a = ys4Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f254502a.f275675d.removeCallbacks(this);
        ys4.m94428U(this.f254502a);
        ys4 ys4Var = this.f254502a;
        synchronized (ys4Var.f275676e) {
            if (ys4Var.f275681t) {
                ys4Var.f275681t = false;
                ArrayList arrayList = ys4Var.f275678g;
                ys4Var.f275678g = ys4Var.f275679h;
                ys4Var.f275679h = arrayList;
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
        ys4.m94428U(this.f254502a);
        ys4 ys4Var = this.f254502a;
        synchronized (ys4Var.f275676e) {
            if (ys4Var.f275678g.isEmpty()) {
                ys4Var.f275674c.removeFrameCallback(this);
                ys4Var.f275681t = false;
            }
        }
    }
}
