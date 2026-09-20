package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f71172a;

    /* JADX INFO: renamed from: b */
    public final boolean f71173b;

    /* JADX INFO: renamed from: c */
    public final bji f71174c;

    /* JADX INFO: renamed from: d */
    public final wg61 f71175d;

    public fn4(boolean z, boolean z2, bji bjiVar) {
        this.f71172a = z;
        this.f71173b = z2;
        this.f71174c = bjiVar;
        this.f71175d = new wg61(new cn4(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m42211a() {
        fn4 fn4Var = (fn4) this.f71175d.getValue();
        return fn4Var != null ? fn4Var.m42211a() : this.f71172a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m42212b() {
        fn4 fn4Var = (fn4) this.f71175d.getValue();
        return fn4Var != null ? fn4Var.m42212b() : this.f71173b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("gbb_upsells_enabled", "android-quality-settings", m42211a()), new k8a("use_playback_settings_audio_quality", "android-quality-settings", m42212b()));
    }

    public fn4(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
