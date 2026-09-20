package p204p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class sb5 implements onp {

    /* JADX INFO: renamed from: b */
    public boolean f207353b;

    /* JADX INFO: renamed from: d */
    public final Handler f207355d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f207356e;

    /* JADX INFO: renamed from: a */
    public final t1h1 f207352a = new t1h1();

    /* JADX INFO: renamed from: c */
    public final bpn0 f207354c = new bpn0();

    public sb5() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f207355d = handler;
        this.f207356e = true;
        zu3 zu3Var = new zu3(this, 2);
        if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            zu3Var.run();
        } else {
            handler.post(zu3Var);
        }
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        if (this.f207353b) {
            this.f207354c.f29553a++;
            return;
        }
        this.f207353b = true;
        if (this.f207356e) {
            return;
        }
        this.f207354c.f29553a++;
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
    }
}
