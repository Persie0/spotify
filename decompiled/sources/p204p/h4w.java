package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: classes5.dex */
public final class h4w implements hbm0 {

    /* JADX INFO: renamed from: a */
    public final ot7 f87668a;

    public h4w(ot7 ot7Var) {
        this.f87668a = ot7Var;
    }

    @Override // p204p.hbm0
    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller mo25410a(Object obj) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        ot7 ot7Var = this.f87668a;
        subtypeEffectHandlerBuilderM15658c.m15665g(s3w.class, new u3w(ot7Var, 1));
        subtypeEffectHandlerBuilderM15658c.m15665g(r3w.class, new u3w(ot7Var, 0));
        return MobiusAndroid.m15618b(Mobius.m15582d(f4w.f65846a, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())), (db01) obj, g4w.f76540a);
    }
}
