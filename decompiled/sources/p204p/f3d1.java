package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.rx3.RxEventSources;

/* JADX INFO: loaded from: classes11.dex */
public final class f3d1 {

    /* JADX INFO: renamed from: a */
    public final x2d1 f65482a;

    /* JADX INFO: renamed from: b */
    public final ijy0 f65483b;

    /* JADX INFO: renamed from: c */
    public final d3d1 f65484c;

    public f3d1(x2d1 x2d1Var, ijy0 ijy0Var, d3d1 d3d1Var) {
        this.f65482a = x2d1Var;
        this.f65483b = ijy0Var;
        this.f65484c = d3d1Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Factory m40654a() {
        MobiusLoop.Builder builderM15582d = Mobius.m15582d(new e3d1(), this.f65482a);
        ijy0 ijy0Var = this.f65483b;
        return builderM15582d.mo15596h(RxEventSources.m15655a(k0e1.m54988g(new kmx(xtm0.m92103x(ijy0Var.f102927b.f92291a, new eqv0(ijy0Var, null, 13)), 8), ijy0Var.f102928c))).mo15594f(CompositeLogger.m15636g(new AndroidLogger(), this.f65484c));
    }
}
