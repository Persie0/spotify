package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class irb0 implements hr91, tlm0 {

    /* JADX INFO: renamed from: a */
    public final rr91 f104941a;

    /* JADX INFO: renamed from: b */
    public final qr91 f104942b;

    public irb0(rr91 rr91Var, qr91 qr91Var) {
        this.f104941a = rr91Var;
        this.f104942b = qr91Var;
    }

    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        rr91 rr91Var = this.f104941a;
        tlm0 tlm0Var = rr91Var instanceof tlm0 ? (tlm0) rr91Var : null;
        if (tlm0Var != null) {
            return tlm0Var.mo35686b(olm0Var);
        }
        return false;
    }

    @Override // p204p.hr91
    public final Object getView() {
        return this.f104941a.mo25081a();
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        this.f104941a.getClass();
        bundle.putBundle("view_bundle", null);
        this.f104942b.getClass();
        bundle.putBundle("presenter_bundle", null);
        return bundle;
    }

    @Override // p204p.hr91
    public final void start() {
        this.f104942b.start();
    }

    @Override // p204p.hr91
    public final void stop() {
        this.f104942b.stop();
    }
}
