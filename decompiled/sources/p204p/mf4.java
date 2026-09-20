package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class mf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f142945a;

    /* JADX INFO: renamed from: b */
    public final boolean f142946b;

    /* JADX INFO: renamed from: c */
    public final boolean f142947c;

    /* JADX INFO: renamed from: d */
    public final boolean f142948d;

    /* JADX INFO: renamed from: e */
    public final bji f142949e;

    /* JADX INFO: renamed from: f */
    public final wg61 f142950f;

    public mf4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f142945a = z;
        this.f142946b = z2;
        this.f142947c = z3;
        this.f142948d = z4;
        this.f142949e = bjiVar;
        this.f142950f = new wg61(new ne4(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61603a() {
        mf4 mf4Var = (mf4) this.f142950f.getValue();
        return mf4Var != null ? mf4Var.m61603a() : this.f142945a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61604b() {
        mf4 mf4Var = (mf4) this.f142950f.getValue();
        return mf4Var != null ? mf4Var.m61604b() : this.f142946b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61605c() {
        mf4 mf4Var = (mf4) this.f142950f.getValue();
        return mf4Var != null ? mf4Var.m61605c() : this.f142947c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61606d() {
        mf4 mf4Var = (mf4) this.f142950f.getValue();
        return mf4Var != null ? mf4Var.m61606d() : this.f142948d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_inline_selection", "android-lyrics-fullscreenview", m61603a()), new k8a("enable_lyrics_fullscreen_from_anywhere", "android-lyrics-fullscreenview", m61604b()), new k8a("enable_lyrics_multilanguage", "android-lyrics-fullscreenview", m61605c()), new k8a("user_generated_report_enabled", "android-lyrics-fullscreenview", m61606d()));
    }

    public mf4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
