package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class bj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f27603a;

    /* JADX INFO: renamed from: b */
    public final bji f27604b;

    /* JADX INFO: renamed from: c */
    public final wg61 f27605c = new wg61(new si4(this, 8));

    public bj4(boolean z, bji bjiVar) {
        this.f27603a = z;
        this.f27604b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29363a() {
        bj4 bj4Var = (bj4) this.f27605c.getValue();
        return bj4Var != null ? bj4Var.m29363a() : this.f27603a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_video_interceptor_enabled", "android-nowplaying-elements-videointerceptor", m29363a()));
    }
}
