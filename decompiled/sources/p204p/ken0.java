package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ken0 implements dqk0, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ len0 f121921b;

    public /* synthetic */ ken0(len0 len0Var, int i) {
        this.f121920a = i;
        this.f121921b = len0Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f121920a) {
            case 0:
                this.f121921b.m58801l1((pmt) obj);
                break;
            default:
                len0 len0Var = this.f121921b;
                len0Var.getClass();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    len0Var.m58801l1((pmt) it.next());
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f121920a) {
            case 0:
                if ((obj instanceof dqk0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof dqk0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        switch (this.f121920a) {
            case 0:
                return new ri00(1, this.f121921b, len0.class, "trigger", "trigger(Lcom/spotify/payment/paymentimpl/data/Effect$ViewEffect;)V", 0, 0);
            default:
                return new ri00(1, this.f121921b, len0.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0, 0);
        }
    }

    public final int hashCode() {
        switch (this.f121920a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
