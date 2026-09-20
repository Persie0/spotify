package p204p;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f890 {

    /* JADX INFO: renamed from: a */
    public final Context f66916a;

    /* JADX INFO: renamed from: b */
    public final WorkerParameters f66917b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f66918c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d */
    public boolean f66919d;

    public f890(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f66916a = context;
        this.f66917b = workerParameters;
    }

    /* JADX INFO: renamed from: a */
    public jbb mo1146a() {
        return n5h1.m63736l(new abz(28));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41018b() {
        return this.f66918c.get() != -256;
    }

    /* JADX INFO: renamed from: c */
    public final jbb m41019c(m200 m200Var) {
        WorkerParameters workerParameters = this.f66917b;
        e0e1 e0e1Var = workerParameters.f1411i;
        UUID uuid = workerParameters.f1403a;
        return n5h1.m63736l(new jt4(e0e1Var.f54962a.f160371a, "setForegroundAsync", new tq00(e0e1Var, uuid, m200Var, this.f66916a, 6), 16));
    }

    /* JADX INFO: renamed from: d */
    public abstract u790 mo1147d();

    /* JADX INFO: renamed from: e */
    public final void m41020e(int i) {
        this.f66918c.compareAndSet(-256, i);
    }
}
