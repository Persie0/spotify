package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ns4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f157659a;

    /* JADX INFO: renamed from: b */
    public final bji f157660b;

    /* JADX INFO: renamed from: c */
    public final wg61 f157661c = new wg61(new zr4(this, 12));

    public ns4(boolean z, bji bjiVar) {
        this.f157659a = z;
        this.f157660b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65504a() {
        ns4 ns4Var = (ns4) this.f157661c.getValue();
        return ns4Var != null ? ns4Var.m65504a() : this.f157659a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_main_thread_assertion", "android-ubi-mainthreadassertion", m65504a()));
    }
}
