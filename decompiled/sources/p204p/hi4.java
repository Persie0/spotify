package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class hi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f91689a;

    /* JADX INFO: renamed from: b */
    public final bji f91690b;

    /* JADX INFO: renamed from: c */
    public final wg61 f91691c;

    public hi4(boolean z, bji bjiVar) {
        this.f91689a = z;
        this.f91690b = bjiVar;
        this.f91691c = new wg61(new bh4(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47618a() {
        hi4 hi4Var = (hi4) this.f91691c.getValue();
        return hi4Var != null ? hi4Var.m47618a() : this.f91689a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("see_all_button", "android-music-videos-artist", m47618a()));
    }

    public hi4(bji bjiVar) {
        this(false, bjiVar);
    }
}
