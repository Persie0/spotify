package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zdk0 implements ydk0 {

    /* JADX INFO: renamed from: a */
    public final k5m0 f281732a;

    public zdk0(k5m0 k5m0Var) {
        this.f281732a = k5m0Var;
    }

    @Override // p204p.ydk0
    /* JADX INFO: renamed from: a */
    public final void mo93462a() {
        k5m0.m55541i(this.f281732a, "spotify:internal:now-playing:queue-peek", null, null, false, 12);
    }

    @Override // p204p.ydk0
    /* JADX INFO: renamed from: c */
    public final void mo93463c(z650 z650Var) {
        k5m0.m55541i(this.f281732a, "spotify:now-playing:queue", z650Var != null ? z650Var.f279709a : null, null, false, 12);
    }
}
