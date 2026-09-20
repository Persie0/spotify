package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f145854a;

    /* JADX INFO: renamed from: b */
    public final int f145855b;

    /* JADX INFO: renamed from: c */
    public final boolean f145856c;

    /* JADX INFO: renamed from: d */
    public final boolean f145857d;

    /* JADX INFO: renamed from: e */
    public final int f145858e;

    /* JADX INFO: renamed from: f */
    public final int f145859f;

    /* JADX INFO: renamed from: g */
    public final int f145860g;

    /* JADX INFO: renamed from: h */
    public final bji f145861h;

    /* JADX INFO: renamed from: i */
    public final wg61 f145862i = new wg61(new kp4(this, 1));

    public mp4(int i, int i2, boolean z, boolean z2, int i3, int i4, int i5, bji bjiVar) {
        this.f145854a = i;
        this.f145855b = i2;
        this.f145856c = z;
        this.f145857d = z2;
        this.f145858e = i3;
        this.f145859f = i4;
        this.f145860g = i5;
        this.f145861h = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final mp4 m62433a() {
        return (mp4) this.f145862i.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final int m62434b() {
        mp4 mp4VarM62433a = m62433a();
        return mp4VarM62433a != null ? mp4VarM62433a.m62434b() : this.f145854a;
    }

    /* JADX INFO: renamed from: c */
    public final int m62435c() {
        mp4 mp4VarM62433a = m62433a();
        return mp4VarM62433a != null ? mp4VarM62433a.m62435c() : this.f145855b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m62436d() {
        mp4 mp4VarM62433a = m62433a();
        return mp4VarM62433a != null ? mp4VarM62433a.m62436d() : this.f145856c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m62437e() {
        mp4 mp4VarM62433a = m62433a();
        return mp4VarM62433a != null ? mp4VarM62433a.m62437e() : this.f145857d;
    }

    /* JADX INFO: renamed from: f */
    public final int m62438f() {
        mp4 mp4VarM62433a = m62433a();
        return mp4VarM62433a != null ? mp4VarM62433a.m62438f() : this.f145858e;
    }

    /* JADX INFO: renamed from: g */
    public final int m62439g() {
        mp4 mp4VarM62433a = m62433a();
        return mp4VarM62433a != null ? mp4VarM62433a.m62439g() : this.f145859f;
    }

    /* JADX INFO: renamed from: h */
    public final int m62440h() {
        mp4 mp4VarM62433a = m62433a();
        return mp4VarM62433a != null ? mp4VarM62433a.m62440h() : this.f145860g;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("ng_poll_age_threshold_hours", "android-streamreporting-runtime-consumption-trigger-impl", m62434b(), 0, 720), new k8a("ng_poll_age_window_hours", "android-streamreporting-runtime-consumption-trigger-impl", m62435c(), 0, 720), new k8a("ng_poll_audiobook_filtering_enabled", "android-streamreporting-runtime-consumption-trigger-impl", m62436d()), new k8a("ng_poll_dedup_enabled", "android-streamreporting-runtime-consumption-trigger-impl", m62437e()), new k8a("ng_poll_min_ms_played", "android-streamreporting-runtime-consumption-trigger-impl", m62438f(), 0, 3600000), new k8a("ng_poll_retry_count", "android-streamreporting-runtime-consumption-trigger-impl", m62439g(), 0, 100), new k8a("ng_poll_retry_interval_seconds", "android-streamreporting-runtime-consumption-trigger-impl", m62440h(), 0, 3600));
    }
}
