package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class e5a0 implements h7o0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r6o0 f56326a;

    public e5a0(r6o0 r6o0Var) {
        this.f56326a = r6o0Var;
    }

    @Override // p204p.h7o0
    /* JADX INFO: renamed from: a */
    public final void mo37808a(boolean z) {
        this.f56326a.mo29574a(z);
    }

    @Override // p204p.hr91
    public final Object getView() {
        return this.f56326a.getView();
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        r6o0 r6o0Var = this.f56326a;
        kx41 kx41Var = r6o0Var instanceof kx41 ? (kx41) r6o0Var : null;
        if (kx41Var != null) {
            return kx41Var.mo57585f();
        }
        return null;
    }

    @Override // p204p.hr91
    public final void start() {
        this.f56326a.start();
    }

    @Override // p204p.hr91
    public final void stop() {
        this.f56326a.stop();
    }
}
