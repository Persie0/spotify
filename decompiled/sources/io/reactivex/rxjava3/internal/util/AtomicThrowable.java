package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    /* JADX INFO: renamed from: a */
    public final boolean m23737a(Throwable th) {
        if (ExceptionHelper.m23749a(this, th)) {
            return true;
        }
        RxJavaPlugins.m23782b(th);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m23738b() {
        Throwable thM23752d = ExceptionHelper.m23752d(this);
        if (thM23752d == null || thM23752d == ExceptionHelper.f10258a) {
            return;
        }
        RxJavaPlugins.m23782b(thM23752d);
    }

    /* JADX INFO: renamed from: c */
    public final void m23739c(CompletableObserver completableObserver) {
        Throwable thM23752d = ExceptionHelper.m23752d(this);
        if (thM23752d == null) {
            completableObserver.onComplete();
        } else if (thM23752d != ExceptionHelper.f10258a) {
            completableObserver.onError(thM23752d);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m23740d(Observer observer) {
        Throwable thM23752d = ExceptionHelper.m23752d(this);
        if (thM23752d == null) {
            observer.onComplete();
        } else if (thM23752d != ExceptionHelper.f10258a) {
            observer.onError(thM23752d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m23741e(ft51 ft51Var) {
        Throwable thM23752d = ExceptionHelper.m23752d(this);
        if (thM23752d == null) {
            ft51Var.onComplete();
        } else if (thM23752d != ExceptionHelper.f10258a) {
            ft51Var.onError(thM23752d);
        }
    }
}
