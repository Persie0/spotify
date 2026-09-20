package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class sd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f207873a;

    /* JADX INFO: renamed from: b */
    public final bji f207874b;

    /* JADX INFO: renamed from: c */
    public final wg61 f207875c = new wg61(new dd4(this, 12));

    public sd4(boolean z, bji bjiVar) {
        this.f207873a = z;
        this.f207874b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77820a() {
        sd4 sd4Var = (sd4) this.f207875c.getValue();
        return sd4Var != null ? sd4Var.m77820a() : this.f207873a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_play_state_from_list", "android-list-ux-platform-consumers-audiobook-rows-audiobook", m77820a()));
    }
}
