package p204p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class m0q {

    /* JADX INFO: renamed from: a */
    public final fiz f138720a;

    public m0q(Flowable flowable, mb80 mb80Var, Observable observable, voi voiVar) {
        yab yabVarM54985d = k0e1.m54985d(observable);
        xv41 xv41VarCurrent = mb80Var.f141817b.current();
        yqi yqiVar = new yqi(k0e1.m54985d(bvg1.m30629q(voiVar)), 22);
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f138720a = mvl0.m62953p(g0g1.m43301f(yabVarM54985d, xv41VarCurrent, yqiVar, new onc(flowable), k0q.f118135h));
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ rgr0 m60472a(boolean z, by50 by50Var, api apiVar, PlayerState playerState) {
        return new rgr0(z, by50Var, apiVar, playerState);
    }

    public m0q(fiz fizVar) {
        this.f138720a = fizVar;
    }
}
