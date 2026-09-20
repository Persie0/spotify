package p204p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class esj extends MobiusLoopViewModel {

    /* JADX INFO: renamed from: g */
    public final x8y0 f62415g;

    /* JADX WARN: Illegal instructions before constructor call */
    public esj(isj isjVar, x8y0 x8y0Var) {
        p4h1 p4h1Var = p4h1.f173929Q0;
        hiy0 hiy0Var = (hiy0) x8y0Var.m90232b("VIEW_STATE");
        super(isjVar, hiy0Var == null ? hiy0.f91896M0 : hiy0Var, p4h1Var, MainThreadWorkRunner.m15627a());
        this.f62415g = x8y0Var;
    }
}
