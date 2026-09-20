package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ek4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f60347a;

    /* JADX INFO: renamed from: b */
    public final bji f60348b;

    /* JADX INFO: renamed from: c */
    public final wg61 f60349c = new wg61(new si4(this, 27));

    public ek4(boolean z, bji bjiVar) {
        this.f60347a = z;
        this.f60348b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39260a() {
        ek4 ek4Var = (ek4) this.f60349c.getValue();
        return ek4Var != null ? ek4Var.m39260a() : this.f60347a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("is_enabled", "android-offline-state-saver", m39260a()));
    }
}
