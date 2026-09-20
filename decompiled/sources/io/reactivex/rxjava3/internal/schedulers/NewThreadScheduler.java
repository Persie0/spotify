package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class NewThreadScheduler extends Scheduler {

    /* JADX INFO: renamed from: d */
    public static final RxThreadFactory f10162d = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f10163c = f10162d;

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo23281b() {
        return new NewThreadWorker(this.f10163c);
    }
}
