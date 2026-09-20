package p204p;

import androidx.car.app.C0023j;
import androidx.car.app.C0024k;

/* JADX INFO: loaded from: classes.dex */
public final class jyb implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0024k f117354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0023j f117355b;

    public jyb(C0023j c0023j, C0024k c0024k) {
        this.f117355b = c0023j;
        this.f117354a = c0024k;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f117354a.m218c();
        C0023j c0023j = this.f117355b;
        if (c0023j.f435d != null) {
            c0023j.f435d.release();
            c0023j.f435d = null;
        }
        hc80Var.getLifecycle().mo31988d(this);
    }
}
