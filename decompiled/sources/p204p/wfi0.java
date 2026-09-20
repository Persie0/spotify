package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class wfi0 implements rhy0 {

    /* JADX INFO: renamed from: a */
    public final String f250854a;

    /* JADX INFO: renamed from: b */
    public final z140 f250855b;

    /* JADX INFO: renamed from: c */
    public final shy0 f250856c;

    public wfi0(String str, z140 z140Var, shy0 shy0Var) {
        this.f250854a = str;
        this.f250855b = z140Var;
        this.f250856c = shy0Var;
    }

    @Override // p204p.rhy0
    /* JADX INFO: renamed from: a */
    public final void mo75534a(String str, gh00 gh00Var) {
        ((h240) this.f250855b).m46471b(qdi0.f187697a);
        Logger.m3965a(dq60.m36615o("[Quasar][", this.f250854a, "] Submitting action \"", str, "\" to be executed on Worker thread"), new Object[0]);
        this.f250856c.mo75534a(str, gh00Var);
    }

    @Override // p204p.rhy0
    /* JADX INFO: renamed from: b */
    public final void mo75535b(String str, gh00 gh00Var) {
        ((h240) this.f250855b).m46471b(qdi0.f187697a);
        Logger.m3965a(dq60.m36615o("[Quasar][", this.f250854a, "] Submitting action \"", str, "\" to be executed on Main thread"), new Object[0]);
        this.f250856c.mo75535b(str, gh00Var);
    }
}
