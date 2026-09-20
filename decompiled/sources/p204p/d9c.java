package p204p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class d9c extends MobiusLoopViewModel {

    /* JADX INFO: renamed from: g */
    public final x8y0 f46784g;

    /* JADX WARN: Illegal instructions before constructor call */
    public d9c(h9c h9cVar, x8y0 x8y0Var) {
        njy0 njy0Var = njy0.f154675L0;
        fiy0 fiy0Var = (fiy0) x8y0Var.m90232b("VIEW_STATE");
        super(h9cVar, fiy0Var == null ? fiy0.f70021d : fiy0Var, njy0Var, MainThreadWorkRunner.m15627a());
        this.f46784g = x8y0Var;
    }
}
