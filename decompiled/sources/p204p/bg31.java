package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class bg31 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f26826a;

    /* JADX INFO: renamed from: b */
    public final PublishSubject f26827b = new PublishSubject();

    public bg31(Scheduler scheduler) {
        this.f26826a = scheduler;
    }
}
