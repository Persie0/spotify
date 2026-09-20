package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fo4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f71430a;

    /* JADX INFO: renamed from: b */
    public final bji f71431b;

    /* JADX INFO: renamed from: c */
    public final wg61 f71432c;

    public fo4(boolean z, bji bjiVar) {
        this.f71430a = z;
        this.f71431b = bjiVar;
        this.f71432c = new wg61(new cn4(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m42264a() {
        fo4 fo4Var = (fo4) this.f71432c.getValue();
        return fo4Var != null ? fo4Var.m42264a() : this.f71430a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_remote_downloads", "android-remotedownloads-contextmenu", m42264a()));
    }

    public fo4(bji bjiVar) {
        this(false, bjiVar);
    }
}
