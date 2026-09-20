package p204p;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class rc60 extends w5l {

    /* JADX INFO: renamed from: l */
    public static Handler f197740l;

    /* JADX INFO: renamed from: f */
    public final Window f197741f;

    /* JADX INFO: renamed from: g */
    public long f197742g;

    /* JADX INFO: renamed from: h */
    public long f197743h;

    /* JADX INFO: renamed from: i */
    public long f197744i;

    /* JADX INFO: renamed from: j */
    public final j900 f197745j;

    /* JADX INFO: renamed from: k */
    public final qc60 f197746k;

    /* JADX WARN: Type inference failed for: r2v2, types: [p.qc60] */
    public rc60(final pc60 pc60Var, View view, Window window) {
        super(pc60Var, view);
        this.f197741f = window;
        this.f197745j = new j900(m87252h());
        this.f197746k = new Window.OnFrameMetricsAvailableListener() { // from class: p.qc60
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                rc60 rc60Var = this.f187265a;
                long jMax = Math.max(rc60Var.mo77765f(frameMetrics), rc60Var.f197744i);
                if (jMax < rc60Var.f197743h || jMax == rc60Var.f197742g) {
                    return;
                }
                float fMo75207k = rc60Var.mo75207k(frameMetrics);
                pc60 pc60Var2 = pc60Var;
                pc60Var2.f175965a.mo64230o(rc60Var.mo75208l(jMax, (long) (fMo75207k * pc60Var2.f175967c), frameMetrics));
                rc60Var.f197742g = jMax;
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static ulq m75205m(Window window) {
        ulq ulqVar = (ulq) window.getDecorView().getTag(R.id.metricsDelegator);
        if (ulqVar != null) {
            return ulqVar;
        }
        ulq ulqVar2 = new ulq(new ArrayList());
        if (f197740l == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            handlerThread.start();
            f197740l = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(ulqVar2, f197740l);
        window.getDecorView().setTag(R.id.metricsDelegator, ulqVar2);
        return ulqVar2;
    }

    /* JADX INFO: renamed from: n */
    public static void m75206n(Window window, qc60 qc60Var) {
        ulq ulqVar = (ulq) window.getDecorView().getTag(R.id.metricsDelegator);
        if (ulqVar != null) {
            synchronized (ulqVar) {
                try {
                    if (ulqVar.f231615b) {
                        ulqVar.f231617d.add(qc60Var);
                    } else {
                        boolean zIsEmpty = ulqVar.f231614a.isEmpty();
                        ulqVar.f231614a.remove(qc60Var);
                        if (!zIsEmpty && ulqVar.f231614a.isEmpty()) {
                            window.removeOnFrameMetricsAvailableListener(ulqVar);
                            window.getDecorView().setTag(R.id.metricsDelegator, null);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public long mo75207k(FrameMetrics frameMetrics) {
        return w5l.m87247e((View) m87250d().get());
    }

    /* JADX INFO: renamed from: l */
    public j900 mo75208l(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.f197744i = j + metric;
        d5a0 d5a0Var = m87251g().f221494a;
        if (d5a0Var != null) {
            d5a0Var.m34971m(m87252h());
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(7) + frameMetrics.getMetric(6) + metric;
        j900 j900Var = this.f197745j;
        j900Var.f99883b = j;
        j900Var.f99884c = metric;
        j900Var.f99885d = z;
        j900Var.f110069e = metric2;
        return j900Var;
    }

    /* JADX INFO: renamed from: o */
    public final void m75209o(boolean z) {
        synchronized (this.f197741f) {
            try {
                if (!z) {
                    m75206n(this.f197741f, this.f197746k);
                    this.f197743h = 0L;
                } else if (this.f197743h == 0) {
                    ulq ulqVarM75205m = m75205m(this.f197741f);
                    qc60 qc60Var = this.f197746k;
                    synchronized (ulqVarM75205m) {
                        try {
                            if (ulqVarM75205m.f231615b) {
                                ulqVarM75205m.f231616c.add(qc60Var);
                            } else {
                                ulqVarM75205m.f231614a.add(qc60Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.f197743h = System.nanoTime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
