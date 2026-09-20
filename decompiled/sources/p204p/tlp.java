package p204p;

import androidx.car.app.model.Alert;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class tlp extends sgx implements Executor {

    /* JADX INFO: renamed from: c */
    public static final tlp f221498c = new tlp();

    /* JADX INFO: renamed from: d */
    public static final luk f221499d;

    static {
        f3a1 f3a1Var = f3a1.f65440c;
        int iM42122M = fmg1.m42122M();
        if (64 >= iM42122M) {
            iM42122M = 64;
        }
        f221499d = f3a1Var.mo40637Q(fmg1.m42123P(iM42122M, 1, (12 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: M */
    public final void mo35948M(juk jukVar, Runnable runnable) {
        f221499d.mo35948M(jukVar, runnable);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: Q */
    public final luk mo40637Q(int i) {
        return f3a1.f65440c.mo40637Q(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo30646r(dau.f47107a, runnable);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: r */
    public final void mo30646r(juk jukVar, Runnable runnable) {
        f221499d.mo30646r(jukVar, runnable);
    }

    @Override // p204p.luk
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p204p.sgx
    /* JADX INFO: renamed from: U */
    public final Executor mo35949U() {
        return this;
    }
}
