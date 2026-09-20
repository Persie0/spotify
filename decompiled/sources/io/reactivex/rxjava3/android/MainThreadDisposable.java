package io.reactivex.rxjava3.android;

import android.os.Looper;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import p204p.ig10;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MainThreadDisposable implements Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f7174a = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public abstract void mo23278a();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f7174a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo23278a();
                return;
            }
            Scheduler scheduler = AndroidSchedulers.f7175a;
            RxAndroidPlugins.m23280b(scheduler);
            scheduler.mo23384c(new ig10(this, 15));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f7174a.get();
    }
}
