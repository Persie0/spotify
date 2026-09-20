package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f163804a;

    /* JADX INFO: renamed from: b */
    public final bji f163805b;

    /* JADX INFO: renamed from: c */
    public final wg61 f163806c = new wg61(new sb4(this, 18));

    public oc4(boolean z, bji bjiVar) {
        this.f163804a = z;
        this.f163805b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66673a() {
        oc4 oc4Var = (oc4) this.f163806c.getValue();
        return oc4Var != null ? oc4Var.m66673a() : this.f163804a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_call_trials_facade", "android-libs-on-demand-trials", m66673a()));
    }
}
