package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ui4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f230593a;

    /* JADX INFO: renamed from: b */
    public final bji f230594b;

    /* JADX INFO: renamed from: c */
    public final wg61 f230595c = new wg61(new si4(this, 1));

    public ui4(boolean z, bji bjiVar) {
        this.f230593a = z;
        this.f230594b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83176a() {
        ui4 ui4Var = (ui4) this.f230595c.getValue();
        return ui4Var != null ? ui4Var.m83176a() : this.f230593a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_playback_settings", "android-nowplaying-contextmenusettings", m83176a()));
    }
}
