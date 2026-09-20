package p204p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes7.dex */
public final class a6a0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f12750a;

    /* JADX INFO: renamed from: b */
    public final luk f12751b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f12752c;

    public a6a0(Scheduler scheduler, luk lukVar, z9j0 z9j0Var) {
        this.f12750a = scheduler;
        this.f12751b = lukVar;
        this.f12752c = z9j0Var;
    }

    /* JADX INFO: renamed from: a */
    public final b6a0 m24858a(w4a0 w4a0Var, boolean z, String str) {
        return new b6a0(this.f12750a, this.f12751b, this.f12752c, z, str, w4a0Var);
    }
}
