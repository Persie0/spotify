package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e24 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f55327a;

    /* JADX INFO: renamed from: b */
    public final boolean f55328b;

    /* JADX INFO: renamed from: c */
    public final boolean f55329c;

    /* JADX INFO: renamed from: d */
    public final int f55330d;

    /* JADX INFO: renamed from: e */
    public final int f55331e;

    /* JADX INFO: renamed from: f */
    public final d24 f55332f;

    /* JADX INFO: renamed from: g */
    public final int f55333g;

    /* JADX INFO: renamed from: h */
    public final int f55334h;

    /* JADX INFO: renamed from: i */
    public final int f55335i;

    /* JADX INFO: renamed from: j */
    public final int f55336j;

    /* JADX INFO: renamed from: k */
    public final bji f55337k;

    /* JADX INFO: renamed from: l */
    public final wg61 f55338l = new wg61(new u14(this, 5));

    public e24(int i, boolean z, boolean z2, int i2, int i3, d24 d24Var, int i4, int i5, int i6, int i7, bji bjiVar) {
        this.f55327a = i;
        this.f55328b = z;
        this.f55329c = z2;
        this.f55330d = i2;
        this.f55331e = i3;
        this.f55332f = d24Var;
        this.f55333g = i4;
        this.f55334h = i5;
        this.f55335i = i6;
        this.f55336j = i7;
        this.f55337k = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final e24 m37576a() {
        return (e24) this.f55338l.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final int m37577b() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37577b() : this.f55327a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37578c() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37578c() : this.f55328b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37579d() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37579d() : this.f55329c;
    }

    /* JADX INFO: renamed from: e */
    public final int m37580e() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37580e() : this.f55330d;
    }

    /* JADX INFO: renamed from: f */
    public final int m37581f() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37581f() : this.f55331e;
    }

    /* JADX INFO: renamed from: g */
    public final d24 m37582g() {
        d24 d24VarM37582g;
        e24 e24VarM37576a = m37576a();
        return (e24VarM37576a == null || (d24VarM37582g = e24VarM37576a.m37582g()) == null) ? this.f55332f : d24VarM37582g;
    }

    /* JADX INFO: renamed from: h */
    public final int m37583h() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37583h() : this.f55333g;
    }

    /* JADX INFO: renamed from: i */
    public final int m37584i() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37584i() : this.f55334h;
    }

    /* JADX INFO: renamed from: j */
    public final int m37585j() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37585j() : this.f55335i;
    }

    /* JADX INFO: renamed from: k */
    public final int m37586k() {
        e24 e24VarM37576a = m37576a();
        return e24VarM37576a != null ? e24VarM37576a.m37586k() : this.f55336j;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("device_stabilization_debounce_ms", "android-device-suggestion-provider", m37577b(), 0, 10000);
        k8a k8aVar2 = new k8a("enable_mobius_loop", "android-device-suggestion-provider", m37578c());
        k8a k8aVar3 = new k8a("enable_proactive_ml_requests", "android-device-suggestion-provider", m37579d());
        k8a k8aVar4 = new k8a("explicit_request_device_wait_timeout_ms", "android-device-suggestion-provider", m37580e(), 1000, 60000);
        k8a k8aVar5 = new k8a("external_audio_output_temporary_hiding_duration_ms", "android-device-suggestion-provider", m37581f(), 0, 86400000);
        String str = m37582g().f44473a;
        d24[] d24VarArrValues = d24.values();
        ArrayList arrayList = new ArrayList(d24VarArrValues.length);
        for (d24 d24Var : d24VarArrValues) {
            arrayList.add(d24Var.f44473a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, new k8a("ml_based_device_suggestion_source", "android-device-suggestion-provider", str, arrayList), new k8a("ml_request_debounce_window_ms", "android-device-suggestion-provider", m37583h(), 0, 10000), new k8a("ml_request_throttle_window_ms", "android-device-suggestion-provider", m37584i(), 0, 86400000), new k8a("moved_away_from_device_temporary_hiding_duration_ms", "android-device-suggestion-provider", m37585j(), 0, 86400000), new k8a("non_suggested_other_device_temporary_hiding_duration_ms", "android-device-suggestion-provider", m37586k(), 0, 86400000));
    }
}
