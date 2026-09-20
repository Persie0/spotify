package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ki4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f122786a;

    /* JADX INFO: renamed from: b */
    public final boolean f122787b;

    /* JADX INFO: renamed from: c */
    public final bji f122788c;

    /* JADX INFO: renamed from: d */
    public final wg61 f122789d = new wg61(new bh4(this, 23));

    public ki4(int i, bji bjiVar, boolean z) {
        this.f122786a = i;
        this.f122787b = z;
        this.f122788c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m56471a() {
        ki4 ki4Var = (ki4) this.f122789d.getValue();
        return ki4Var != null ? ki4Var.m56471a() : this.f122786a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56472b() {
        ki4 ki4Var = (ki4) this.f122789d.getValue();
        return ki4Var != null ? ki4Var.m56472b() : this.f122787b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("recurring_ping_interval", "android-musicapp-ubi", m56471a(), 0, 1500), new k8a("send_page_error_reports", "android-musicapp-ubi", m56472b()));
    }
}
