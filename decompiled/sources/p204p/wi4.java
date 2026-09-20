package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f251491a;

    /* JADX INFO: renamed from: b */
    public final bji f251492b;

    /* JADX INFO: renamed from: c */
    public final wg61 f251493c = new wg61(new si4(this, 3));

    public wi4(boolean z, bji bjiVar) {
        this.f251491a = z;
        this.f251492b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88185a() {
        wi4 wi4Var = (wi4) this.f251493c.getValue();
        return wi4Var != null ? wi4Var.m88185a() : this.f251491a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_for_all_chaptered_content_types", "android-nowplaying-elements-entitysegments", m88185a()));
    }
}
