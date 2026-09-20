package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f81275a;

    /* JADX INFO: renamed from: b */
    public final bji f81276b;

    /* JADX INFO: renamed from: c */
    public final wg61 f81277c = new wg61(new jk4(this, 21));

    public gm4(boolean z, bji bjiVar) {
        this.f81275a = z;
        this.f81276b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45217a() {
        gm4 gm4Var = (gm4) this.f81277c.getValue();
        return gm4Var != null ? gm4Var.m45217a() : this.f81275a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_find_in_show_page", "android-podcastexperience-findinshowimpl", m45217a()));
    }
}
