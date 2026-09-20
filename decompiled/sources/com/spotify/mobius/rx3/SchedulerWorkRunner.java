package com.spotify.mobius.rx3;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.WorkRunner;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class SchedulerWorkRunner implements WorkRunner {

    /* JADX INFO: renamed from: a */
    public final Scheduler.Worker f5812a;

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f5813b = new ReentrantLock();

    public SchedulerWorkRunner(Scheduler scheduler) {
        Preconditions.m15649b(scheduler);
        this.f5812a = scheduler.mo23281b();
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        ReentrantLock reentrantLock = this.f5813b;
        reentrantLock.lock();
        try {
            this.f5812a.dispose();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final void post(Runnable runnable) {
        ReentrantLock reentrantLock = this.f5813b;
        reentrantLock.lock();
        try {
            this.f5812a.mo23386a(runnable);
        } finally {
            reentrantLock.unlock();
        }
    }
}
