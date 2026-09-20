package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: classes6.dex */
public final class imh0 implements MobiusLoop.Logger {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MobiusLoop.Logger f103707a;

    public imh0(MobiusLoop.Logger logger) {
        this.f103707a = logger;
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        dce1 dce1Var = (dce1) obj2;
        if (dce1Var instanceof bce1) {
            this.f103707a.mo15583a(obj, ((bce1) dce1Var).f25854a, next);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: b */
    public final void mo15584b(Object obj, Object obj2, Exception exc) {
        dce1 dce1Var = (dce1) obj2;
        if (dce1Var instanceof bce1) {
            this.f103707a.mo15584b(obj, ((bce1) dce1Var).f25854a, exc);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: d */
    public final void mo15586d(Object obj, Object obj2) {
        dce1 dce1Var = (dce1) obj2;
        if (dce1Var instanceof bce1) {
            this.f103707a.mo15586d(obj, ((bce1) dce1Var).f25854a);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: e */
    public final void mo15587e(Object obj) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: c */
    public final void mo15585c(Object obj, First first) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: f */
    public final void mo15588f(Object obj, Exception exc) {
    }
}
