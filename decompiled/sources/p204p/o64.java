package p204p;

import com.comscore.util.log.LogLevel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f162199a;

    /* JADX INFO: renamed from: b */
    public final int f162200b;

    /* JADX INFO: renamed from: c */
    public final boolean f162201c;

    /* JADX INFO: renamed from: d */
    public final boolean f162202d;

    /* JADX INFO: renamed from: e */
    public final boolean f162203e;

    /* JADX INFO: renamed from: f */
    public final boolean f162204f;

    /* JADX INFO: renamed from: g */
    public final bji f162205g;

    /* JADX INFO: renamed from: h */
    public final wg61 f162206h;

    public o64(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f162199a = z;
        this.f162200b = i;
        this.f162201c = z2;
        this.f162202d = z3;
        this.f162203e = z4;
        this.f162204f = z5;
        this.f162205g = bjiVar;
        this.f162206h = new wg61(new o54(this, 21));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66323a() {
        o64 o64VarM66324b = m66324b();
        return o64VarM66324b != null ? o64VarM66324b.m66323a() : this.f162199a;
    }

    /* JADX INFO: renamed from: b */
    public final o64 m66324b() {
        return (o64) this.f162206h.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final int m66325c() {
        o64 o64VarM66324b = m66324b();
        return o64VarM66324b != null ? o64VarM66324b.m66325c() : this.f162200b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m66326d() {
        o64 o64VarM66324b = m66324b();
        return o64VarM66324b != null ? o64VarM66324b.m66326d() : this.f162201c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m66327e() {
        o64 o64VarM66324b = m66324b();
        return o64VarM66324b != null ? o64VarM66324b.m66327e() : this.f162202d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m66328f() {
        o64 o64VarM66324b = m66324b();
        return o64VarM66324b != null ? o64VarM66324b.m66328f() : this.f162203e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m66329g() {
        o64 o64VarM66324b = m66324b();
        return o64VarM66324b != null ? o64VarM66324b.m66329g() : this.f162204f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("artificial_delay_enabled", "android-feature-recents-config", m66323a()), new k8a("decorator_timeout_override_ms", "android-feature-recents-config", m66325c(), 0, LogLevel.NONE), new k8a("force_music_episode_content_type", "android-feature-recents-config", m66326d()), new k8a("progressive_loading_enabled", "android-feature-recents-config", m66327e()), new k8a("sponsorship_label_enabled", "android-feature-recents-config", m66328f()), new k8a("track_and_playlist_visual_identity_trait_cover_enabled", "android-feature-recents-config", m66329g()));
    }

    public o64(bji bjiVar) {
        this(false, 0, false, false, false, false, bjiVar);
    }
}
