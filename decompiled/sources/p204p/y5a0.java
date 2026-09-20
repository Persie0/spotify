package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class y5a0 implements hr91, tlm0 {

    /* JADX INFO: renamed from: a */
    public final zwp f269382a;

    public y5a0(zwp zwpVar) {
        this.f269382a = zwpVar;
    }

    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        u9m0 currentPageElement = this.f269382a.getCurrentPageElement();
        tlm0 tlm0Var = currentPageElement instanceof tlm0 ? (tlm0) currentPageElement : null;
        if (tlm0Var != null) {
            return tlm0Var.mo35686b(olm0Var);
        }
        return false;
    }

    @Override // p204p.hr91
    public final Object getView() {
        return this.f269382a;
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        return null;
    }

    @Override // p204p.hr91
    public final void start() {
    }

    @Override // p204p.hr91
    public final void stop() {
    }
}
