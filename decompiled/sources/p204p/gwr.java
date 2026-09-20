package p204p;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes11.dex */
public final class gwr implements hwr {

    /* JADX INFO: renamed from: a */
    public final ScheduledFuture f85090a;

    public gwr(ScheduledFuture scheduledFuture) {
        this.f85090a = scheduledFuture;
    }

    @Override // p204p.hwr
    public final void dispose() {
        this.f85090a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f85090a + ']';
    }
}
