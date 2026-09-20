package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ip4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f104377a;

    /* JADX INFO: renamed from: b */
    public final bji f104378b;

    /* JADX INFO: renamed from: c */
    public final wg61 f104379c = new wg61(new cn4(this, 29));

    public ip4(boolean z, bji bjiVar) {
        this.f104377a = z;
        this.f104378b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51229a() {
        ip4 ip4Var = (ip4) this.f104379c.getValue();
        return ip4Var != null ? ip4Var.m51229a() : this.f104377a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_page_api", "android-sleep-timer-nudge", m51229a()));
    }
}
