package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import io.reactivex.rxjava3.internal.schedulers.NewThreadScheduler;
import io.reactivex.rxjava3.internal.schedulers.SingleScheduler;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Schedulers {

    /* JADX INFO: renamed from: a */
    public static final Scheduler f10368a = RxJavaPlugins.m23781a(new SingleTask());

    /* JADX INFO: renamed from: b */
    public static final Scheduler f10369b = RxJavaPlugins.m23781a(new ComputationTask());

    /* JADX INFO: renamed from: c */
    public static final Scheduler f10370c = RxJavaPlugins.m23781a(new IOTask());

    /* JADX INFO: renamed from: d */
    public static final TrampolineScheduler f10371d = TrampolineScheduler.f10180c;

    public static final class ComputationHolder {

        /* JADX INFO: renamed from: a */
        public static final ComputationScheduler f10372a = new ComputationScheduler();
    }

    public static final class ComputationTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return ComputationHolder.f10372a;
        }
    }

    public static final class IOTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return IoHolder.f10373a;
        }
    }

    public static final class IoHolder {

        /* JADX INFO: renamed from: a */
        public static final IoScheduler f10373a = new IoScheduler();
    }

    public static final class NewThreadHolder {

        /* JADX INFO: renamed from: a */
        public static final NewThreadScheduler f10374a = new NewThreadScheduler();
    }

    public static final class NewThreadTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return NewThreadHolder.f10374a;
        }
    }

    public static final class SingleHolder {

        /* JADX INFO: renamed from: a */
        public static final SingleScheduler f10375a = new SingleScheduler();
    }

    public static final class SingleTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return SingleHolder.f10375a;
        }
    }

    static {
        RxJavaPlugins.m23781a(new NewThreadTask());
    }
}
