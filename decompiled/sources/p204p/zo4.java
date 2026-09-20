package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zo4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f284648a;

    /* JADX INFO: renamed from: b */
    public final bji f284649b;

    /* JADX INFO: renamed from: c */
    public final wg61 f284650c = new wg61(new cn4(this, 26));

    public zo4(boolean z, bji bjiVar) {
        this.f284648a = z;
        this.f284649b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96606a() {
        zo4 zo4Var = (zo4) this.f284650c.getValue();
        return zo4Var != null ? zo4Var.m96606a() : this.f284648a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("show_remote_device_subject", "android-settings-section-volumecontrols", m96606a()));
    }
}
