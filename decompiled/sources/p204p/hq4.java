package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f94019a;

    /* JADX INFO: renamed from: b */
    public final bji f94020b;

    /* JADX INFO: renamed from: c */
    public final wg61 f94021c = new wg61(new kp4(this, 17));

    public hq4(boolean z, bji bjiVar) {
        this.f94019a = z;
        this.f94020b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m48199a() {
        hq4 hq4Var = (hq4) this.f94021c.getValue();
        return hq4Var != null ? hq4Var.m48199a() : this.f94019a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("liked_songs_decoration_enabled", "android-system-offline-data-sources-impl", m48199a()));
    }
}
