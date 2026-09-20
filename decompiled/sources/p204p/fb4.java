package p204p;

import com.comscore.util.crashreport.CrashReportManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f67703a;

    /* JADX INFO: renamed from: b */
    public final int f67704b;

    /* JADX INFO: renamed from: c */
    public final bji f67705c;

    /* JADX INFO: renamed from: d */
    public final wg61 f67706d = new wg61(new ga4(this, 18));

    public fb4(int i, int i2, bji bjiVar) {
        this.f67703a = i;
        this.f67704b = i2;
        this.f67705c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m41205a() {
        fb4 fb4Var = (fb4) this.f67706d.getValue();
        return fb4Var != null ? fb4Var.m41205a() : this.f67703a;
    }

    /* JADX INFO: renamed from: b */
    public final int m41206b() {
        fb4 fb4Var = (fb4) this.f67706d.getValue();
        return fb4Var != null ? fb4Var.m41206b() : this.f67704b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("interact_signal_confirmation_timeout_ms", "android-libs-endless-player", m41205a(), 0, CrashReportManager.TIME_WINDOW), new k8a("jump_signal_confirmation_timeout_ms", "android-libs-endless-player", m41206b(), 0, CrashReportManager.TIME_WINDOW));
    }
}
