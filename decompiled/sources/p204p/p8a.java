package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class p8a implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f174902a;

    /* JADX INFO: renamed from: b */
    public final bji f174903b;

    /* JADX INFO: renamed from: c */
    public final wg61 f174904c = new wg61(new bj9(this, 15));

    public p8a(boolean z, bji bjiVar) {
        this.f174902a = z;
        this.f174903b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69334a() {
        p8a p8aVar = (p8a) this.f174904c.getValue();
        return p8aVar != null ? p8aVar.m69334a() : this.f174902a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_otfn", "boombox-settings", m69334a()));
    }
}
