package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f188929a;

    /* JADX INFO: renamed from: b */
    public final bji f188930b;

    /* JADX INFO: renamed from: c */
    public final wg61 f188931c = new wg61(new bh4(this, 28));

    public qi4(boolean z, bji bjiVar) {
        this.f188929a = z;
        this.f188930b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72852a() {
        qi4 qi4Var = (qi4) this.f188931c.getValue();
        return qi4Var != null ? qi4Var.m72852a() : this.f188929a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_new_episodes_page", "android-newepisodes-newepisodes", m72852a()));
    }
}
