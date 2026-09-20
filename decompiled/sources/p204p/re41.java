package p204p;

import android.content.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;

/* JADX INFO: loaded from: classes2.dex */
public final class re41 implements hgm {

    /* JADX INFO: renamed from: f */
    public static final fv31 f198277f = fv31.f73628b.m78182S("send_playback_broadcasts");

    /* JADX INFO: renamed from: g */
    public static final u9w0 f198278g = u9w0.f228302i;

    /* JADX INFO: renamed from: a */
    public final Context f198279a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f198280b;

    /* JADX INFO: renamed from: c */
    public final hv31 f198281c;

    /* JADX INFO: renamed from: d */
    public final CompositeDisposable f198282d;

    /* JADX INFO: renamed from: e */
    public final FlowableObserveOn f198283e;

    public re41(Context context, drd0 drd0Var, i4t0 i4t0Var, Scheduler scheduler, Flowable flowable) {
        this.f198279a = context;
        this.f198280b = i4t0Var;
        mv31 mv31VarM54360d = drd0Var.f52301a.m54360d(context);
        this.f198281c = mv31VarM54360d;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f198282d = compositeDisposable;
        FlowableObserveOn flowableObserveOnM23332L = flowable.m23332L(scheduler);
        this.f198283e = flowableObserveOnM23332L;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedM23356t = flowableObserveOnM23332L.m23360y(new og6(this, 26)).m23356t(a7j0.f13067N0);
        Disposable disposableSubscribe = k0e1.m54988g(mv31VarM54360d.m62896q(f198277f), dau.f47107a).filter(qyq0.f193992P0).map(f8r0.f67050Q0).startWith(Observable.fromCallable(new ic9(this, 25))).subscribe(new kwr0(14, this, flowableDistinctUntilChangedM23356t));
        Disposable disposableSubscribe2 = flowableDistinctUntilChangedM23356t.subscribe(new qe41(this, 0), f198278g);
        compositeDisposable.mo23393b(disposableSubscribe);
        compositeDisposable.mo23393b(disposableSubscribe2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75379a(PlayerState playerState) {
        xul0 xul0VarTrack = playerState.track();
        return xul0VarTrack.mo49279c() && e72.m37976J((ContextTrack) xul0VarTrack.mo49278b());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75380b(PlayerState playerState) {
        if (playerState.track().mo49279c()) {
            return "fallback".equalsIgnoreCase((String) ((ContextTrack) playerState.track().mo49278b()).metadata().get(ContextTrack.Metadata.KEY_MFT_INJECTION_SOURCE));
        }
        return false;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f198282d.m23396g();
    }
}
