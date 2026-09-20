package com.google.android.gms.internal.meet_coactivities;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabm implements Executor {
    private final Thread.UncaughtExceptionHandler zza;
    private final Queue zzb = new ConcurrentLinkedQueue();
    private final AtomicReference zzc = new AtomicReference();

    public zzabm(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        c95.m31848n(uncaughtExceptionHandler, "uncaughtExceptionHandler");
        this.zza = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zzc(runnable);
        zzb();
    }

    public final zzabl zza(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzabj zzabjVar = new zzabj(runnable);
        return new zzabl(zzabjVar, scheduledExecutorService.schedule(new zzabi(this, zzabjVar, runnable), j, timeUnit), null);
    }

    public final void zzb() {
        do {
            AtomicReference atomicReference = this.zzc;
            Thread threadCurrentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.zzb.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.zza.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.zzc.set(null);
                    throw th2;
                }
            }
            this.zzc.set(null);
        } while (!this.zzb.isEmpty());
    }

    public final void zzc(Runnable runnable) {
        c95.m31848n(runnable, "runnable is null");
        this.zzb.add(runnable);
    }

    public final void zzd() {
        c95.m31856v(Thread.currentThread() == this.zzc.get(), "Not called from the SynchronizationContext");
    }
}
