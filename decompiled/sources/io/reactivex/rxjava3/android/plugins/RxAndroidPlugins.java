package io.reactivex.rxjava3.android.plugins;

import io.reactivex.rxjava3.android.schedulers.CallableC1409a;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes11.dex */
public abstract class RxAndroidPlugins {
    /* JADX INFO: renamed from: a */
    public static Scheduler m23279a(CallableC1409a callableC1409a) {
        try {
            Scheduler scheduler = (Scheduler) callableC1409a.call();
            if (scheduler != null) {
                return scheduler;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ExceptionHelper.m23754f(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23280b(Scheduler scheduler) {
        if (scheduler == null) {
            throw new NullPointerException("scheduler == null");
        }
    }
}
