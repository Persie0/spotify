package p204p;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class kmq extends AbstractC2156n9 implements ScheduledFuture {

    /* JADX INFO: renamed from: h */
    public final ScheduledFuture f124197h;

    public kmq(jmq jmqVar) {
        this.f124197h = jmqVar.mo36423b(new nfp(this, 9));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f124197h.compareTo(delayed);
    }

    @Override // p204p.AbstractC2156n9
    /* JADX INFO: renamed from: d */
    public final void mo56933d() {
        ScheduledFuture scheduledFuture = this.f124197h;
        Object obj = this.f151670a;
        scheduledFuture.cancel((obj instanceof C1852f9) && ((C1852f9) obj).f67131a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f124197h.getDelay(timeUnit);
    }
}
