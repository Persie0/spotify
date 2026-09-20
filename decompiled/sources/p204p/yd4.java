package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class yd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f271631a;

    /* JADX INFO: renamed from: b */
    public final bji f271632b;

    /* JADX INFO: renamed from: c */
    public final wg61 f271633c = new wg61(new dd4(this, 17));

    public yd4(boolean z, bji bjiVar) {
        this.f271631a = z;
        this.f271632b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93381a() {
        yd4 yd4Var = (yd4) this.f271633c.getValue();
        return yd4Var != null ? yd4Var.m93381a() : this.f271631a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("with_play_trait", "android-list-ux-platform-consumers-episode-configurations-itemmetadataextension", m93381a()));
    }
}
