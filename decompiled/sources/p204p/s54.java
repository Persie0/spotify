package p204p;

import com.comscore.util.log.LogLevel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f205713a;

    /* JADX INFO: renamed from: b */
    public final boolean f205714b;

    /* JADX INFO: renamed from: c */
    public final boolean f205715c;

    /* JADX INFO: renamed from: d */
    public final int f205716d;

    /* JADX INFO: renamed from: e */
    public final int f205717e;

    /* JADX INFO: renamed from: f */
    public final boolean f205718f;

    /* JADX INFO: renamed from: g */
    public final int f205719g;

    /* JADX INFO: renamed from: h */
    public final int f205720h;

    /* JADX INFO: renamed from: i */
    public final int f205721i;

    /* JADX INFO: renamed from: j */
    public final int f205722j;

    /* JADX INFO: renamed from: k */
    public final boolean f205723k;

    /* JADX INFO: renamed from: l */
    public final bji f205724l;

    /* JADX INFO: renamed from: m */
    public final wg61 f205725m = new wg61(new o54(this, 3));

    public s54(boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, int i3, int i4, int i5, int i6, boolean z5, bji bjiVar) {
        this.f205713a = z;
        this.f205714b = z2;
        this.f205715c = z3;
        this.f205716d = i;
        this.f205717e = i2;
        this.f205718f = z4;
        this.f205719g = i3;
        this.f205720h = i4;
        this.f205721i = i5;
        this.f205722j = i6;
        this.f205723k = z5;
        this.f205724l = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final s54 m77219a() {
        return (s54) this.f205725m.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77220b() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77220b() : this.f205713a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m77221c() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77221c() : this.f205714b;
    }

    /* JADX INFO: renamed from: d */
    public final int m77222d() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77222d() : this.f205716d;
    }

    /* JADX INFO: renamed from: e */
    public final int m77223e() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77223e() : this.f205717e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m77224f() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77224f() : this.f205718f;
    }

    /* JADX INFO: renamed from: g */
    public final int m77225g() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77225g() : this.f205719g;
    }

    /* JADX INFO: renamed from: h */
    public final int m77226h() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77226h() : this.f205720h;
    }

    /* JADX INFO: renamed from: i */
    public final int m77227i() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77227i() : this.f205721i;
    }

    /* JADX INFO: renamed from: j */
    public final int m77228j() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77228j() : this.f205722j;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m77229k() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77229k() : this.f205723k;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m77230l() {
        s54 s54VarM77219a = m77219a();
        return s54VarM77219a != null ? s54VarM77219a.m77230l() : this.f205715c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_per_message_worker_name", "android-feature-notificationssdk", m77220b()), new k8a("enable_push_token_sync_worker", "android-feature-notificationssdk", m77221c()), new k8a("is_messages_channel_enabled", "android-feature-notificationssdk", m77230l()), new k8a("log_device_settings_flex_interval", "android-feature-notificationssdk", m77222d(), 0, 6), new k8a("log_device_settings_timer", "android-feature-notificationssdk", m77223e(), 1, 72), new k8a("push_handler_sync", "android-feature-notificationssdk", m77224f()), new k8a("push_handler_timekeeper_sample_rate", "android-feature-notificationssdk", m77225g(), 0, 100), new k8a("push_image_load_timeout_ms", "android-feature-notificationssdk", m77226h(), 1000, LogLevel.NONE), new k8a("robin_log_initial_delay_ms", "android-feature-notificationssdk", m77227i(), 1000, 60000), new k8a("robin_log_max_retries", "android-feature-notificationssdk", m77228j(), 0, 3), new k8a("validate_jam_notifications", "android-feature-notificationssdk", m77229k()));
    }
}
