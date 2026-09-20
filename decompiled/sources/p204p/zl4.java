package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f283903a;

    /* JADX INFO: renamed from: b */
    public final bji f283904b;

    /* JADX INFO: renamed from: c */
    public final wg61 f283905c = new wg61(new jk4(this, 15));

    public zl4(boolean z, bji bjiVar) {
        this.f283903a = z;
        this.f283904b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96358a() {
        zl4 zl4Var = (zl4) this.f283905c.getValue();
        return zl4Var != null ? zl4Var.m96358a() : this.f283903a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_podcast_charts_page", "android-podcast-charts-chartsv2", m96358a()));
    }
}
