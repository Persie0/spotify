package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class jjq implements wy91 {

    /* JADX INFO: renamed from: a */
    public final wg61 f113081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f113082b;

    public jjq(Activity activity, pc5 pc5Var, y6q0 y6q0Var, rlv0 rlv0Var) {
        this.f113082b = rlv0Var;
        this.f113081a = new wg61(new hkp(activity, pc5Var, y6q0Var));
    }

    @Override // p204p.bji
    /* JADX INFO: renamed from: e */
    public final iys0 mo29483e(sys0 sys0Var) {
        Object obj = this.f113082b.f200373a;
        return obj != null ? ((wy91) obj).mo29483e(sys0Var) : sys0Var.create((uys0) this.f113081a.getValue());
    }
}
