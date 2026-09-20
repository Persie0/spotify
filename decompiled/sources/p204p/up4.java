package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class up4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f232576a;

    /* JADX INFO: renamed from: b */
    public final bji f232577b;

    /* JADX INFO: renamed from: c */
    public final wg61 f232578c = new wg61(new kp4(this, 6));

    public up4(boolean z, bji bjiVar) {
        this.f232576a = z;
        this.f232577b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83647a() {
        up4 up4Var = (up4) this.f232578c.getValue();
        return up4Var != null ? up4Var.m83647a() : this.f232576a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("spotify_mix_language_extension_enabled", "android-system-encore", m83647a()));
    }
}
