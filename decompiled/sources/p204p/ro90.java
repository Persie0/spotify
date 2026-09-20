package p204p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class ro90 implements co90 {

    /* JADX INFO: renamed from: a */
    public final bo90 f201191a;

    /* JADX INFO: renamed from: b */
    public final do10 f201192b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f201193c;

    /* JADX INFO: renamed from: d */
    public final p69 f201194d = new p69();

    /* JADX INFO: renamed from: e */
    public final n6t0 f201195e = new n6t0();

    /* JADX INFO: renamed from: f */
    public MobiusLoop.Controller f201196f;

    public ro90(bo90 bo90Var, do10 do10Var, Scheduler scheduler) {
        this.f201191a = bo90Var;
        this.f201192b = do10Var;
        this.f201193c = scheduler;
    }
}
