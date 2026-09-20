package p204p;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class wvz0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CountDownLatch f255646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f255647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xvz0 f255648c;

    public wvz0(yvz0 yvz0Var, CountDownLatch countDownLatch, int i, xvz0 xvz0Var) {
        this.f255646a = countDownLatch;
        this.f255647b = i;
        this.f255648c = xvz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yvz0.m94754b(this.f255646a, this.f255647b, this.f255648c);
    }
}
