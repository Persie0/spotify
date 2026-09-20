package com.spotify.mobius.runners;

import com.spotify.mobius.internal_util.Preconditions;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WorkRunners {

    /* JADX INFO: renamed from: a */
    public static final MyThreadFactory f5771a = new MyThreadFactory(0);

    public static class MyThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public static final AtomicLong f5772a = new AtomicLong(0);

        private MyThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
            Preconditions.m15649b(runnable);
            Thread threadNewThread = threadFactoryDefaultThreadFactory.newThread(runnable);
            Locale locale = Locale.ENGLISH;
            threadNewThread.setName("mobius-thread-" + f5772a.incrementAndGet());
            return threadNewThread;
        }

        public /* synthetic */ MyThreadFactory(int i) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorServiceWorkRunner m15651a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(f5771a);
        Preconditions.m15649b(executorServiceNewSingleThreadExecutor);
        return new ExecutorServiceWorkRunner(executorServiceNewSingleThreadExecutor);
    }
}
