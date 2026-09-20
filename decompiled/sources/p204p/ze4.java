package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ze4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281876a;

    /* JADX INFO: renamed from: b */
    public final bji f281877b;

    /* JADX INFO: renamed from: c */
    public final wg61 f281878c;

    public ze4(boolean z, bji bjiVar) {
        this.f281876a = z;
        this.f281877b = bjiVar;
        this.f281878c = new wg61(new ne4(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95962a() {
        ze4 ze4Var = (ze4) this.f281878c.getValue();
        return ze4Var != null ? ze4Var.m95962a() : this.f281876a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_livestream_error_dialog_page", "android-liveroom-errordialogfragment", m95962a()));
    }

    public ze4(bji bjiVar) {
        this(false, bjiVar);
    }
}
