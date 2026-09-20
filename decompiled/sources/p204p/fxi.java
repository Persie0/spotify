package p204p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class fxi implements hc80 {

    /* JADX INFO: renamed from: a */
    public boolean f74378a;

    /* JADX INFO: renamed from: b */
    public gb80 f74379b;

    /* JADX INFO: renamed from: c */
    public final Handler f74380c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final oc80 f74381d = new oc80(this, true);

    /* JADX INFO: renamed from: e */
    public final ne2 f74382e = new ne2(this, 4);

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f74381d;
    }
}
