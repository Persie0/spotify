package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes11.dex */
public final class psz implements jnh0 {

    /* JADX INFO: renamed from: a */
    public final erz f181007a;

    /* JADX INFO: renamed from: b */
    public final EventSource f181008b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f181009c;

    public psz(erz erzVar, EventSource eventSource, Scheduler scheduler) {
        this.f181007a = erzVar;
        this.f181008b = eventSource;
        this.f181009c = scheduler;
    }

    @Override // p204p.jnh0
    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller mo32865a(Object obj, bi1 bi1Var) {
        hsz hszVar = hsz.f94861h;
        return Mobius.m15580b(Mobius.m15582d(new eaq(6), RxConnectables.m15653a((ObservableTransformer) ((hrz) this.f181007a).invoke(bi1Var))).mo15596h(this.f181008b).mo15592d(new isz(this)).mo15590b(new jsz(this)).mo15594f(csa0.m33762a()), (ph3) obj, new pu40(ksz.f126075a, lsz.f136635a, msz.f146879h, nsz.f157936a, osz.f168923h), MainThreadWorkRunner.m15627a());
    }
}
