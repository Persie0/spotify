package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class aj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f16164a;

    /* JADX INFO: renamed from: b */
    public final bji f16165b;

    /* JADX INFO: renamed from: c */
    public final wg61 f16166c = new wg61(new si4(this, 7));

    public aj4(boolean z, bji bjiVar) {
        this.f16164a = z;
        this.f16165b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26141a() {
        aj4 aj4Var = (aj4) this.f16166c.getValue();
        return aj4Var != null ? aj4Var.m26141a() : this.f16164a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("should_use_vit_to_show_thumbnail", "android-nowplaying-elements-video", m26141a()));
    }
}
