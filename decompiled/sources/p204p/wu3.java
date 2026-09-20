package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f255094a;

    /* JADX INFO: renamed from: b */
    public final bji f255095b;

    /* JADX INFO: renamed from: c */
    public final wg61 f255096c = new wg61(new ju3(this, 9));

    public wu3(boolean z, bji bjiVar) {
        this.f255094a = z;
        this.f255095b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89011a() {
        wu3 wu3Var = (wu3) this.f255096c.getValue();
        return wu3Var != null ? wu3Var.m89011a() : this.f255094a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("artist_context_menu_page_api_enabled", "android-artist-contextmenuimpl", m89011a()));
    }
}
