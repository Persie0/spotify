package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vhi0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f241526a;

    /* JADX INFO: renamed from: b */
    public final bji f241527b;

    /* JADX INFO: renamed from: c */
    public final wg61 f241528c = new wg61(new w0i0(this, 11));

    public vhi0(boolean z, bji bjiVar) {
        this.f241526a = z;
        this.f241527b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85572a() {
        vhi0 vhi0Var = (vhi0) this.f241528c.getValue();
        return vhi0Var != null ? vhi0Var.m85572a() : this.f241526a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("unified_subtitles_selection_enabled", "music-libs-video", m85572a()));
    }
}
