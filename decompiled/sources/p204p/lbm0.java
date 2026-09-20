package p204p;

import android.os.Bundle;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class lbm0 implements n8j0 {

    /* JADX INFO: renamed from: a */
    public final p69 f131690a = new p69();

    /* JADX INFO: renamed from: b */
    public kbm0 f131691b;

    /* JADX INFO: renamed from: a */
    public final kbm0 m58672a() {
        return new kbm0(UUID.randomUUID().toString());
    }

    @Override // p204p.n8j0
    /* JADX INFO: renamed from: b */
    public final void mo58673b(Bundle bundle) {
        if (this.f131691b != null) {
            return;
        }
        Serializable serializable = bundle != null ? bundle.getSerializable("ubi.nav-logger.page-instance-id") : null;
        this.f131691b = serializable instanceof kbm0 ? (kbm0) serializable : null;
    }

    /* JADX INFO: renamed from: c */
    public final void m58674c(kbm0 kbm0Var) {
        p69 p69Var = this.f131690a;
        if (kbm0Var.equals(p69Var.f174322a.get())) {
            return;
        }
        p69Var.accept(kbm0Var);
    }

    @Override // p204p.n8j0
    /* JADX INFO: renamed from: d */
    public final void mo58675d(Bundle bundle) {
        kbm0 kbm0Var = this.f131691b;
        if (kbm0Var != null) {
            bundle.putSerializable("ubi.nav-logger.page-instance-id", kbm0Var);
        }
    }
}
