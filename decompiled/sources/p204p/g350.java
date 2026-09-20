package p204p;

import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.mobius.State;
import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.mobius.android.AndroidLogger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g350 implements MobiusLoop.Logger {

    /* JADX INFO: renamed from: a */
    public final q530 f76110a;

    /* JADX INFO: renamed from: b */
    public final AndroidLogger f76111b;

    public g350(q530 q530Var, AndroidLogger androidLogger, hc80 hc80Var) {
        this.f76110a = q530Var;
        this.f76111b = androidLogger;
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        h630 h630Var;
        Event event = (Event) obj2;
        this.f76111b.mo15583a((State) obj, event, next);
        if (event instanceof cvw) {
            h630Var = h630.f87968N0;
        } else {
            h630Var = event instanceof Event.ConsumptionStateChanged ? h630.f87969O0 : null;
        }
        if (h630Var != null) {
            this.f76110a.mo40812p(h630Var);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: b */
    public final void mo15584b(Object obj, Object obj2, Exception exc) {
        this.f76111b.mo15584b((State) obj, (Event) obj2, exc);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: c */
    public final void mo15585c(Object obj, First first) {
        this.f76111b.mo15585c((State) obj, first);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: d */
    public final void mo15586d(Object obj, Object obj2) {
        h630 h630Var;
        Event event = (Event) obj2;
        if (event instanceof cvw) {
            h630Var = h630.f87968N0;
        } else {
            h630Var = event instanceof Event.ConsumptionStateChanged ? h630.f87969O0 : null;
        }
        if (h630Var != null) {
            this.f76110a.mo40803g(h630Var);
        }
        Objects.toString(event);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: e */
    public final void mo15587e(Object obj) {
        this.f76111b.getClass();
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: f */
    public final void mo15588f(Object obj, Exception exc) {
        Objects.toString((State) obj);
    }
}
