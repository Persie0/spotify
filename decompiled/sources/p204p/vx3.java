package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vx3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f245611a;

    /* JADX INFO: renamed from: b */
    public final bji f245612b;

    /* JADX INFO: renamed from: c */
    public final wg61 f245613c;

    public vx3(boolean z, bji bjiVar) {
        this.f245611a = z;
        this.f245612b = bjiVar;
        this.f245613c = new wg61(new ju3(this, 27));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86630a() {
        vx3 vx3Var = (vx3) this.f245613c.getValue();
        return vx3Var != null ? vx3Var.m86630a() : this.f245611a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_playback_settings_gapless", "android-boombox-settings-gapless", m86630a()));
    }

    public vx3(bji bjiVar) {
        this(false, bjiVar);
    }
}
