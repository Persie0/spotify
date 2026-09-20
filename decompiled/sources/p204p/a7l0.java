package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class a7l0 implements aqb {

    /* JADX INFO: renamed from: a */
    public final w6l0 f13096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b7l0 f13097b;

    public a7l0(b7l0 b7l0Var, w6l0 w6l0Var) {
        this.f13097b = b7l0Var;
        this.f13096a = w6l0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.eh00, p.ri00] */
    @Override // p204p.aqb
    public final void cancel() {
        b7l0 b7l0Var = this.f13097b;
        hj5 hj5Var = b7l0Var.f24309b;
        w6l0 w6l0Var = this.f13096a;
        hj5Var.remove(w6l0Var);
        if (wj50.m88271j(b7l0Var.f24310c, w6l0Var)) {
            w6l0Var.mo42560a();
            b7l0Var.f24310c = null;
        }
        w6l0Var.f248421b.remove(this);
        ?? r0 = w6l0Var.f248422c;
        if (r0 != 0) {
            r0.invoke();
        }
        w6l0Var.f248422c = null;
    }
}
