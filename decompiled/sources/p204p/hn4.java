package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f93180a;

    /* JADX INFO: renamed from: b */
    public final bji f93181b;

    /* JADX INFO: renamed from: c */
    public final wg61 f93182c = new wg61(new cn4(this, 3));

    public hn4(boolean z, bji bjiVar) {
        this.f93180a = z;
        this.f93181b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47998a() {
        hn4 hn4Var = (hn4) this.f93182c.getValue();
        return hn4Var != null ? hn4Var.m47998a() : this.f93180a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_tts_lens", "android-quickstart-pivot", m47998a()));
    }
}
