package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class v9w0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final Context f239055a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f239056b;

    /* JADX INFO: renamed from: c */
    public final Object f239057c;

    /* JADX INFO: renamed from: d */
    public final haw0 f239058d;

    /* JADX INFO: renamed from: e */
    public final CompositeDisposable f239059e = new CompositeDisposable();

    /* JADX INFO: renamed from: f */
    public final BehaviorSubject f239060f = BehaviorSubject.m23795f();

    public v9w0(Context context, Scheduler scheduler, yaw0 yaw0Var, haw0 haw0Var) {
        this.f239055a = context;
        this.f239056b = scheduler;
        this.f239057c = yaw0Var;
        this.f239058d = haw0Var;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f239059e.m23396g();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
