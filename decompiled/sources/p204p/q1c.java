package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class q1c implements xzb {

    /* JADX INFO: renamed from: a */
    public final k3c f184288a;

    public q1c(k3c k3cVar, k0c k0cVar) {
        this.f184288a = k3cVar;
        k3cVar.setAppearance(k0cVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m71921a(wzb wzbVar) {
        this.f184288a.setTextLayout(wzbVar);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f184288a;
    }

    @Override // p204p.l90
    public final void setActive(boolean z) {
        this.f184288a.setActive(z);
    }
}
