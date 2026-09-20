package io.reactivex.rxjava3.plugins;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Objects;
import p204p.fxc1;
import rxdogtag2.C2684m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RxJavaPlugins {

    /* JADX INFO: renamed from: a */
    public static volatile fxc1 f10307a;

    /* JADX INFO: renamed from: b */
    public static volatile C2684m f10308b;

    /* JADX INFO: renamed from: c */
    public static volatile C2684m f10309c;

    /* JADX INFO: renamed from: d */
    public static volatile C2684m f10310d;

    /* JADX INFO: renamed from: e */
    public static volatile C2684m f10311e;

    /* JADX INFO: renamed from: f */
    public static volatile C2684m f10312f;

    /* JADX INFO: renamed from: a */
    public static Scheduler m23781a(Supplier supplier) {
        try {
            Object obj = supplier.get();
            Objects.requireNonNull(obj, "Scheduler Supplier result can't be null");
            return (Scheduler) obj;
        } catch (Throwable th) {
            throw ExceptionHelper.m23754f(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23782b(Throwable th) {
        fxc1 fxc1Var = f10307a;
        if (th == null) {
            th = ExceptionHelper.m23750b("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException(th);
        }
        if (fxc1Var != null) {
            try {
                fxc1Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
