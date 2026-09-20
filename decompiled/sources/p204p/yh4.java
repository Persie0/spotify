package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class yh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f272722a;

    /* JADX INFO: renamed from: b */
    public final bji f272723b;

    /* JADX INFO: renamed from: c */
    public final wg61 f272724c = new wg61(new bh4(this, 14));

    public yh4(int i, bji bjiVar) {
        this.f272722a = i;
        this.f272723b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m93623a() {
        yh4 yh4Var = (yh4) this.f272724c.getValue();
        return yh4Var != null ? yh4Var.m93623a() : this.f272722a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("settlement_notification_delay_seconds", "android-music-app-platform-app-readiness", m93623a(), 0, 30));
    }
}
