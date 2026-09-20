package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class z9w0 implements fwz0, bji {

    /* JADX INFO: renamed from: a */
    public final u0x0 f280896a;

    public z9w0(u0x0 u0x0Var) {
        this.f280896a = u0x0Var;
    }

    @Override // p204p.bji
    /* JADX INFO: renamed from: e */
    public final iys0 mo29483e(sys0 sys0Var) {
        iys0 iys0VarMo29483e = this.f280896a.mo29483e(sys0Var);
        Logger.m3973i(dq60.m36615o("Property from <", iys0VarMo29483e.getClass().getSimpleName(), "> is incorrectly used from BackgroundScope.\nThe following properties will risk invalid exposure data: ", g6f.m43753y0(iys0VarMo29483e.models(), ",", null, null, s5w0.f205920Q0, 30), "\nProperties are not supported for services in the BackgroundScope.For more info; see http://go/remoteconfig-android-docs/lifecycle/#accessing-properties-before-activation"), new Object[0]);
        return iys0VarMo29483e;
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }

    @Override // p204p.hgm
    public final void shutdown() {
    }
}
