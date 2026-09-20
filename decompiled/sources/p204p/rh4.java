package p204p;

import com.comscore.util.log.LogLevel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f199102a;

    /* JADX INFO: renamed from: b */
    public final int f199103b;

    /* JADX INFO: renamed from: c */
    public final bji f199104c;

    /* JADX INFO: renamed from: d */
    public final wg61 f199105d;

    public rh4(int i, int i2, bji bjiVar) {
        this.f199102a = i;
        this.f199103b = i2;
        this.f199104c = bjiVar;
        this.f199105d = new wg61(new bh4(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public final int m75495a() {
        rh4 rh4Var = (rh4) this.f199105d.getValue();
        return rh4Var != null ? rh4Var.m75495a() : this.f199102a;
    }

    /* JADX INFO: renamed from: b */
    public final int m75496b() {
        rh4 rh4Var = (rh4) this.f199105d.getValue();
        return rh4Var != null ? rh4Var.m75496b() : this.f199103b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("google_callback_timeout_ms", "android-ml-based-device-suggestions", m75495a(), 1000, LogLevel.NONE), new k8a("where_to_play_timeout_ms", "android-ml-based-device-suggestions", m75496b(), 1000, 60000));
    }

    public rh4(bji bjiVar) {
        this(3000, 10000, bjiVar);
    }
}
