package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ov3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f170411a;

    /* JADX INFO: renamed from: b */
    public final bji f170412b;

    /* JADX INFO: renamed from: c */
    public final wg61 f170413c = new wg61(new ju3(this, 21));

    public ov3(boolean z, bji bjiVar) {
        this.f170411a = z;
        this.f170412b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68116a() {
        ov3 ov3Var = (ov3) this.f170413c.getValue();
        return ov3Var != null ? ov3Var.m68116a() : this.f170411a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("author_context_menu_page_api_enabled", "android-author-contextmenuimpl", m68116a()));
    }
}
