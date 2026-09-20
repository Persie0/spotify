package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class np4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f156872a;

    /* JADX INFO: renamed from: b */
    public final bji f156873b;

    /* JADX INFO: renamed from: c */
    public final wg61 f156874c = new wg61(new kp4(this, 2));

    public np4(boolean z, bji bjiVar) {
        this.f156872a = z;
        this.f156873b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65283a() {
        np4 np4Var = (np4) this.f156874c.getValue();
        return np4Var != null ? np4Var.m65283a() : this.f156872a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("pairing_enabled", "android-superconnect-pairingroutegroup", m65283a()));
    }
}
