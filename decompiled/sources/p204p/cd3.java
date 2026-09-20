package p204p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class cd3 extends MobiusLoopViewModel {

    /* JADX INFO: renamed from: g */
    public final x8y0 f36722g;

    /* JADX WARN: Illegal instructions before constructor call */
    public cd3(tl3 tl3Var, x8y0 x8y0Var) {
        xwe xweVar = xwe.f266670g;
        ad3 ad3Var = (ad3) x8y0Var.m90232b("FLOW_STATE");
        super(tl3Var, ad3Var == null ? ad3.f14499e : ad3Var, xweVar, MainThreadWorkRunner.m15627a());
        this.f36722g = x8y0Var;
    }
}
