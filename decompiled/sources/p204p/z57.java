package p204p;

import com.spotify.playbacknative.AudioRenderer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes.dex */
public final class z57 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final x57 f279487a;

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f279488b = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: c */
    public final lwr f279489c;

    /* JADX INFO: renamed from: d */
    public boolean f279490d;

    /* JADX INFO: renamed from: e */
    public boolean f279491e;

    public z57(x57 x57Var, Observable observable, Scheduler scheduler) {
        this.f279487a = x57Var;
        lwr lwrVar = new lwr();
        this.f279489c = lwrVar;
        AudioRenderer.addListener(x57Var.f258321a);
        AudioRenderer.addListener(x57Var.f258324d);
        x57Var.f258323c.add(new y57(this));
        lwrVar.m60127a(observable.observeOn(scheduler).subscribe(new C1666ag(this, 23)));
    }

    @Override // p204p.hgm
    public final void shutdown() {
        x57 x57Var = this.f279487a;
        AudioRenderer.removeListener(x57Var.f258324d);
        x57Var.f258323c.clear();
        this.f279489c.m60129c();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
