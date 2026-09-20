package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.extras.CompositeLogger;

/* JADX INFO: loaded from: classes11.dex */
public final class h1d1 {

    /* JADX INFO: renamed from: a */
    public final v0d1 f86577a;

    /* JADX INFO: renamed from: b */
    public final w1d1 f86578b;

    public h1d1(v0d1 v0d1Var, w1d1 w1d1Var) {
        this.f86577a = v0d1Var;
        this.f86578b = w1d1Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Factory m46428a() {
        return Mobius.m15582d(new g1d1(), this.f86577a).mo15594f(CompositeLogger.m15636g(new AndroidLogger(), this.f86578b));
    }
}
