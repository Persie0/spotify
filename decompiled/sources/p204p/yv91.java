package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class yv91 implements n8j0 {

    /* JADX INFO: renamed from: a */
    public final Object f276592a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f276593b = true;

    @Override // p204p.n8j0
    /* JADX INFO: renamed from: b */
    public final void mo58673b(Bundle bundle) {
        boolean z;
        if (bundle != null) {
            synchronized (this.f276592a) {
                z = this.f276593b;
            }
            boolean z2 = bundle.getBoolean("ubi.nav-logger.page-view-processor-state-first-view", z);
            synchronized (this.f276592a) {
                this.f276593b = z2;
            }
        }
    }

    @Override // p204p.n8j0
    /* JADX INFO: renamed from: d */
    public final void mo58675d(Bundle bundle) {
        boolean z;
        synchronized (this.f276592a) {
            z = this.f276593b;
        }
        bundle.putBoolean("ubi.nav-logger.page-view-processor-state-first-view", z);
    }
}
