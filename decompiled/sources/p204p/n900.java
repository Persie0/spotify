package p204p;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public final class n900 implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t0h1 f151677a;

    public n900(t0h1 t0h1Var) {
        this.f151677a = t0h1Var;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        t0h1 t0h1Var = this.f151677a;
        if ((t0h1Var.f215889b & 1) != 0) {
            SparseIntArray sparseIntArray = ((SparseIntArray[]) t0h1Var.f215890c)[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
    }
}
