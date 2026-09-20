package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f249687a;

    /* JADX INFO: renamed from: b */
    public final boolean f249688b;

    /* JADX INFO: renamed from: c */
    public final bji f249689c;

    /* JADX INFO: renamed from: d */
    public final wg61 f249690d = new wg61(new sb4(this, 3));

    public wb4(boolean z, boolean z2, bji bjiVar) {
        this.f249687a = z;
        this.f249688b = z2;
        this.f249689c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87622a() {
        wb4 wb4Var = (wb4) this.f249690d.getValue();
        return wb4Var != null ? wb4Var.m87622a() : this.f249687a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m87623b() {
        wb4 wb4Var = (wb4) this.f249690d.getValue();
        return wb4Var != null ? wb4Var.m87623b() : this.f249688b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("identity_diffing_enabled", "android-libs-nowplaying-elements-carousel", m87622a()), new k8a("use_track_carousel_element", "android-libs-nowplaying-elements-carousel", m87623b()));
    }
}
