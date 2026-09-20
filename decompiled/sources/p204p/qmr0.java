package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class qmr0 {

    /* JADX INFO: renamed from: a */
    public final vsk f190383a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f190384b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f190385c;

    /* JADX INFO: renamed from: d */
    public final CompositeDisposable f190386d = new CompositeDisposable();

    public qmr0(vsk vskVar, Scheduler scheduler, Scheduler scheduler2) {
        this.f190383a = vskVar;
        this.f190384b = scheduler;
        this.f190385c = scheduler2;
    }
}
