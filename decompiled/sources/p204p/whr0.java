package p204p;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class whr0 implements hc80 {

    /* JADX INFO: renamed from: i */
    public static final whr0 f251426i = new whr0();

    /* JADX INFO: renamed from: a */
    public int f251427a;

    /* JADX INFO: renamed from: b */
    public int f251428b;

    /* JADX INFO: renamed from: e */
    public Handler f251431e;

    /* JADX INFO: renamed from: c */
    public boolean f251429c = true;

    /* JADX INFO: renamed from: d */
    public boolean f251430d = true;

    /* JADX INFO: renamed from: f */
    public final oc80 f251432f = new oc80(this, true);

    /* JADX INFO: renamed from: g */
    public final RunnableC2364s6 f251433g = new RunnableC2364s6(this, 9);

    /* JADX INFO: renamed from: h */
    public final ezk0 f251434h = new ezk0(this, 21);

    /* JADX INFO: renamed from: a */
    public final void m88166a() {
        int i = this.f251428b + 1;
        this.f251428b = i;
        if (i == 1) {
            if (this.f251429c) {
                this.f251432f.m66676g(ta80.ON_RESUME);
                this.f251429c = false;
            } else {
                Handler handler = this.f251431e;
                wj50.m88279p(handler);
                handler.removeCallbacks(this.f251433g);
            }
        }
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f251432f;
    }
}
