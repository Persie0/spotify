package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fe4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f68676a;

    /* JADX INFO: renamed from: b */
    public final bji f68677b;

    /* JADX INFO: renamed from: c */
    public final wg61 f68678c = new wg61(new dd4(this, 24));

    public fe4(boolean z, bji bjiVar) {
        this.f68676a = z;
        this.f68677b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41405a() {
        fe4 fe4Var = (fe4) this.f68678c.getValue();
        return fe4Var != null ? fe4Var.m41405a() : this.f68676a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("automix_track_order_context_menu_enabled", "android-list-ux-platform-consumers-mixing-contextmenuitems-automix", m41405a()));
    }
}
