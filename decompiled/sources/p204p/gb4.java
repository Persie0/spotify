package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f78182a;

    /* JADX INFO: renamed from: b */
    public final bji f78183b;

    /* JADX INFO: renamed from: c */
    public final wg61 f78184c = new wg61(new ga4(this, 19));

    public gb4(boolean z, bji bjiVar) {
        this.f78182a = z;
        this.f78183b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44203a() {
        gb4 gb4Var = (gb4) this.f78184c.getValue();
        return gb4Var != null ? gb4Var.m44203a() : this.f78182a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("explicit_content_setting_hidden", "android-libs-explicit-content", m44203a()));
    }
}
