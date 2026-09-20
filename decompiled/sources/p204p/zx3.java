package p204p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zx3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f287184a;

    /* JADX INFO: renamed from: b */
    public final boolean f287185b;

    /* JADX INFO: renamed from: c */
    public final int f287186c;

    /* JADX INFO: renamed from: d */
    public final int f287187d;

    /* JADX INFO: renamed from: e */
    public final int f287188e;

    /* JADX INFO: renamed from: f */
    public final bji f287189f;

    /* JADX INFO: renamed from: g */
    public final wg61 f287190g;

    public zx3(boolean z, boolean z2, int i, int i2, int i3, bji bjiVar) {
        this.f287184a = z;
        this.f287185b = z2;
        this.f287186c = i;
        this.f287187d = i2;
        this.f287188e = i3;
        this.f287189f = bjiVar;
        this.f287190g = new wg61(new ju3(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m97160a() {
        zx3 zx3Var = (zx3) this.f287190g.getValue();
        return zx3Var != null ? zx3Var.m97160a() : this.f287184a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m97161b() {
        zx3 zx3Var = (zx3) this.f287190g.getValue();
        return zx3Var != null ? zx3Var.m97161b() : this.f287185b;
    }

    /* JADX INFO: renamed from: c */
    public final int m97162c() {
        zx3 zx3Var = (zx3) this.f287190g.getValue();
        return zx3Var != null ? zx3Var.m97162c() : this.f287186c;
    }

    /* JADX INFO: renamed from: d */
    public final int m97163d() {
        zx3 zx3Var = (zx3) this.f287190g.getValue();
        return zx3Var != null ? zx3Var.m97163d() : this.f287187d;
    }

    /* JADX INFO: renamed from: e */
    public final int m97164e() {
        zx3 zx3Var = (zx3) this.f287190g.getValue();
        return zx3Var != null ? zx3Var.m97164e() : this.f287188e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_app_scoped_permission_state", "android-btpermissions", m97160a()), new k8a("enable_new_app_startup", "android-btpermissions", m97161b()), new k8a("min_active_session_days", "android-btpermissions", m97162c(), 0, 30), new k8a("prompt_count_threshold", "android-btpermissions", m97163d(), 0, Alert.DURATION_SHOW_INDEFINITELY), new k8a("prompt_time_threshold", "android-btpermissions", m97164e(), 0, Alert.DURATION_SHOW_INDEFINITELY));
    }

    public zx3(bji bjiVar) {
        this(false, true, 7, 3, 604800, bjiVar);
    }
}
