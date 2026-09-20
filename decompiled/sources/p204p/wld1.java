package p204p;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes16.dex */
public final class wld1 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xld1 f252525a;

    public wld1(xld1 xld1Var) {
        this.f252525a = xld1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            xld1.m91422b(this.f252525a);
        } catch (Throwable th) {
            tx8.m81890e("p.yld1", "Unexpected exception in activity timer handler", th);
        }
    }
}
