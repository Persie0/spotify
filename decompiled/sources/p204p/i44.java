package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f98424a;

    /* JADX INFO: renamed from: b */
    public final bji f98425b;

    /* JADX INFO: renamed from: c */
    public final wg61 f98426c = new wg61(new y34(this, 8));

    public i44(boolean z, bji bjiVar) {
        this.f98424a = z;
        this.f98425b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m49654a() {
        i44 i44Var = (i44) this.f98426c.getValue();
        return i44Var != null ? i44Var.m49654a() : this.f98424a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("clear_cache_on_trim_enabled", "android-feature-cache-fifo-cache-manager", m49654a()));
    }
}
