package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes9.dex */
public final class xku0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f262942a;

    /* JADX INFO: renamed from: b */
    public final yku0 f262943b;

    /* JADX INFO: renamed from: c */
    public final vju0 f262944c;

    public xku0(Scheduler scheduler, yku0 yku0Var, vju0 vju0Var) {
        this.f262942a = scheduler;
        this.f262943b = yku0Var;
        this.f262944c = vju0Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller m91367a() {
        return Mobius.m15580b(Mobius.m15582d(uku0.f231371a, RxConnectables.m15653a(((wju0) this.f262944c).m88356a())).mo15592d(new vku0(this)).mo15590b(new wku0(this)), this.f262943b, tku0.f221225a, MainThreadWorkRunner.m15627a());
    }
}
