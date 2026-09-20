package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class nd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f152648a;

    /* JADX INFO: renamed from: b */
    public final bji f152649b;

    /* JADX INFO: renamed from: c */
    public final wg61 f152650c;

    public nd4(boolean z, bji bjiVar) {
        this.f152648a = z;
        this.f152649b = bjiVar;
        this.f152650c = new wg61(new dd4(this, 7));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m64192a() {
        nd4 nd4Var = (nd4) this.f152650c.getValue();
        return nd4Var != null ? nd4Var.m64192a() : this.f152648a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("advanced_curation_enabled", "android-list-ux-platform-consumers-advanced-curation", m64192a()));
    }

    public nd4(bji bjiVar) {
        this(false, bjiVar);
    }
}
