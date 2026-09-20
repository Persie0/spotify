package p204p;

import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.searchview.proto.AudioEpisode;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f91955a;

    /* JADX INFO: renamed from: b */
    public final bji f91956b;

    /* JADX INFO: renamed from: c */
    public final wg61 f91957c;

    public hj4(int i, bji bjiVar) {
        this.f91955a = i;
        this.f91956b = bjiVar;
        this.f91957c = new wg61(new si4(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final int m47650a() {
        hj4 hj4Var = (hj4) this.f91957c.getValue();
        return hj4Var != null ? hj4Var.m47650a() : this.f91955a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("widget_async_acc_policy_timeout_ms", "android-nowplaying-scroll", m47650a(), 10, CrashReportManager.TIME_WINDOW));
    }

    public hj4(bji bjiVar) {
        this(AudioEpisode.SHOW_URI_FIELD_NUMBER, bjiVar);
    }
}
