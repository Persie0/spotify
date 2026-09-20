package p204p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class c9b implements Disposable, hab {

    /* JADX INFO: renamed from: a */
    public final x8b f35440a;

    /* JADX INFO: renamed from: b */
    public final Observer f35441b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f35442c;

    /* JADX INFO: renamed from: d */
    public boolean f35443d = false;

    public c9b(x8b x8bVar, Observer observer) {
        this.f35440a = x8bVar;
        this.f35441b = observer;
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: c */
    public final void mo25640c(x8b x8bVar, o2x0 o2x0Var) {
        if (this.f35442c) {
            return;
        }
        try {
            this.f35441b.onNext(o2x0Var);
            if (this.f35442c) {
                return;
            }
            this.f35443d = true;
            this.f35441b.onComplete();
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            if (this.f35443d) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            if (this.f35442c) {
                return;
            }
            try {
                this.f35441b.onError(th);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                RxJavaPlugins.m23782b(new CompositeException(th, th2));
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f35442c = true;
        this.f35440a.cancel();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f35442c;
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: l */
    public final void mo25646l(x8b x8bVar, Throwable th) {
        if (x8bVar.mo52181o()) {
            return;
        }
        try {
            this.f35441b.onError(th);
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(new CompositeException(th, th2));
        }
    }
}
