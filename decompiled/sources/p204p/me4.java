package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class me4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f142600a;

    /* JADX INFO: renamed from: b */
    public final bji f142601b;

    /* JADX INFO: renamed from: c */
    public final wg61 f142602c;

    public me4(boolean z, bji bjiVar) {
        this.f142600a = z;
        this.f142601b = bjiVar;
        this.f142602c = new wg61(new dd4(this, 29));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61536a() {
        me4 me4Var = (me4) this.f142602c.getValue();
        return me4Var != null ? me4Var.m61536a() : this.f142600a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("covers_playlist_plugins_enabled", "android-list-ux-platform-consumers-songdnacovers-shared", m61536a()));
    }

    public me4(bji bjiVar) {
        this(false, bjiVar);
    }
}
