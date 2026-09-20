package p204p;

import com.spotify.home.evopage.mobius.Event;

/* JADX INFO: loaded from: classes2.dex */
public final class ryk0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f203933a;

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        ryk0 ryk0Var = new ryk0(3, (fbk) obj3);
        ryk0Var.f203933a = (Throwable) obj2;
        w2a1 w2a1Var = w2a1.f247311a;
        ryk0Var.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.f203933a;
        bga.m29073P(obj);
        new Event.FailedToLoadOfflineItems(th);
        return w2a1.f247311a;
    }
}
