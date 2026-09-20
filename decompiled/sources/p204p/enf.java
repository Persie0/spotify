package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class enf implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f61151a;

    /* JADX INFO: renamed from: b */
    public final bji f61152b;

    /* JADX INFO: renamed from: c */
    public final wg61 f61153c = new wg61(new che(this, 17));

    public enf(boolean z, bji bjiVar) {
        this.f61151a = z;
        this.f61152b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39494a() {
        enf enfVar = (enf) this.f61153c.getValue();
        return enfVar != null ? enfVar.m39494a() : this.f61151a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_comments_npv_widget", "comments-widget", m39494a()));
    }
}
