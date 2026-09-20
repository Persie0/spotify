package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class am4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f17034a;

    /* JADX INFO: renamed from: b */
    public final bji f17035b;

    /* JADX INFO: renamed from: c */
    public final wg61 f17036c = new wg61(new jk4(this, 16));

    public am4(boolean z, bji bjiVar) {
        this.f17034a = z;
        this.f17035b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26383a() {
        am4 am4Var = (am4) this.f17036c.getValue();
        return am4Var != null ? am4Var.m26383a() : this.f17034a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("reaction_selection_in_reaction_bottomsheet", "android-podcast-interactivity-podcastreactions", m26383a()));
    }
}
