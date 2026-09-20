package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wwp implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zwp f255806a;

    public wwp(zwp zwpVar) {
        this.f255806a = zwpVar;
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        zwp zwpVar = this.f255806a;
        if (zwpVar.f287038k1) {
            zwpVar.f287040m1 = true;
            if (zwpVar.f287027Z0 != null) {
                zwpVar.m97149B();
            }
        }
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        zwp zwpVar = this.f255806a;
        if (zwpVar.f287038k1) {
            zwpVar.f287040m1 = false;
            if (zwpVar.f287027Z0 != null) {
                zwpVar.m97150C();
            }
        }
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        zwp zwpVar = this.f255806a;
        if (zwpVar.f287038k1) {
            return;
        }
        zwpVar.f287040m1 = false;
        if (zwpVar.f287027Z0 != null) {
            zwpVar.m97150C();
        }
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        zwp zwpVar = this.f255806a;
        if (zwpVar.f287038k1) {
            return;
        }
        zwpVar.f287040m1 = true;
        if (zwpVar.f287027Z0 != null) {
            zwpVar.m97149B();
        }
    }
}
