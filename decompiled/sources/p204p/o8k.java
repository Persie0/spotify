package p204p;

import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes9.dex */
public final class o8k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mpn f162824a;

    public o8k(mpn mpnVar) {
        this.f162824a = mpnVar;
    }

    /* JADX INFO: renamed from: a */
    public final l2q0 m66430a(p8p0 p8p0Var, PlayOrigin playOrigin, uqw uqwVar) {
        son sonVar = this.f162824a.f146051a.f285186b;
        Flowable flowable = (Flowable) sonVar.f211306D4.get();
        dm4 dm4Var = new dm4((bji) sonVar.f211919a.f18508a.f212567y1.get());
        nbm0 nbm0Var = (nbm0) sonVar.f212263me.get();
        xre xreVar = (xre) sonVar.f211251B1.get();
        aqn aqnVar = sonVar.f211919a;
        son sonVar2 = aqnVar.f18508a;
        return new l2q0(new e60(flowable, dm4Var, nbm0Var, xreVar, new tk11((yl11) sonVar2.f211509Kp.get(), (x0q0) sonVar2.f211283C7.get(), aqnVar.m26861f()), (Scheduler) sonVar.f212465u3.get(), playOrigin, p8p0Var, uqwVar));
    }
}
