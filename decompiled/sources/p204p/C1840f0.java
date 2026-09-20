package p204p;

import io.ably.lib.types.Message;

/* JADX INFO: renamed from: p.f0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C1840f0 implements zmc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f64508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f64509b;

    public C1840f0(gh00 gh00Var, gh00 gh00Var2) {
        this.f64508a = gh00Var;
        this.f64509b = gh00Var2;
    }

    @Override // p204p.zmc
    /* JADX INFO: renamed from: a */
    public final void mo26486a(Message message) {
        try {
            ((C2073l0) this.f64508a).invoke(new C2478v0(message.name, message.data.toString()));
        } catch (Exception e) {
            ((C2110m0) this.f64509b).invoke(e);
        }
    }
}
