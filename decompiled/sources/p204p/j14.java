package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class j14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f107635a;

    /* JADX INFO: renamed from: b */
    public final bji f107636b;

    /* JADX INFO: renamed from: c */
    public final wg61 f107637c;

    public j14(boolean z, bji bjiVar) {
        this.f107635a = z;
        this.f107636b = bjiVar;
        this.f107637c = new wg61(new ey3(this, 26));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52110a() {
        j14 j14Var = (j14) this.f107637c.getValue();
        return j14Var != null ? j14Var.m52110a() : this.f107635a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("dynamic_data_saver_stream_quality", "android-datasavermode", m52110a()));
    }

    public j14(bji bjiVar) {
        this(false, bjiVar);
    }
}
