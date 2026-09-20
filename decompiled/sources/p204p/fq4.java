package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class fq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f72051a;

    /* JADX INFO: renamed from: b */
    public final bji f72052b;

    /* JADX INFO: renamed from: c */
    public final wg61 f72053c;

    public fq4(boolean z, bji bjiVar) {
        this.f72051a = z;
        this.f72052b = bjiVar;
        this.f72053c = new wg61(new kp4(this, 15));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m42394a() {
        fq4 fq4Var = (fq4) this.f72053c.getValue();
        return fq4Var != null ? fq4Var.m42394a() : this.f72051a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_flow_list_renderer", "android-system-listcontentruntime-listrenderer", m42394a()));
    }

    public fq4(bji bjiVar) {
        this(false, bjiVar);
    }
}
