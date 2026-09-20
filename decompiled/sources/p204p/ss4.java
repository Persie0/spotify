package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ss4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f213478a;

    /* JADX INFO: renamed from: b */
    public final bji f213479b;

    /* JADX INFO: renamed from: c */
    public final wg61 f213480c = new wg61(new zr4(this, 17));

    public ss4(boolean z, bji bjiVar) {
        this.f213478a = z;
        this.f213479b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m79185a() {
        ss4 ss4Var = (ss4) this.f213480c.getValue();
        return ss4Var != null ? ss4Var.m79185a() : this.f213478a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("experimental_actor_events", "android-ubiloggerimpl", m79185a()));
    }
}
