package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class as4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f19291a;

    /* JADX INFO: renamed from: b */
    public final bji f19292b;

    /* JADX INFO: renamed from: c */
    public final wg61 f19293c = new wg61(new zr4(this, 0));

    public as4(boolean z, bji bjiVar) {
        this.f19291a = z;
        this.f19292b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27056a() {
        as4 as4Var = (as4) this.f19293c.getValue();
        return as4Var != null ? as4Var.m27056a() : this.f19291a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("publish_composition_context_enabled", "android-tome-pageapimusiccompose", m27056a()));
    }
}
