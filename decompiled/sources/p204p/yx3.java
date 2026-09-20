package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class yx3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f277119a;

    /* JADX INFO: renamed from: b */
    public final boolean f277120b;

    /* JADX INFO: renamed from: c */
    public final fnk0 f277121c;

    /* JADX INFO: renamed from: d */
    public final bji f277122d;

    /* JADX INFO: renamed from: e */
    public final wg61 f277123e;

    /* JADX INFO: renamed from: f */
    public final wg61 f277124f;

    public yx3(boolean z, boolean z2, fnk0 fnk0Var, bji bjiVar) {
        this.f277119a = z;
        this.f277120b = z2;
        this.f277121c = fnk0Var;
        this.f277122d = bjiVar;
        this.f277123e = new wg61(new xx3(this, 1));
        this.f277124f = new wg61(new xx3(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94804a() {
        yx3 yx3Var = (yx3) this.f277124f.getValue();
        return yx3Var != null ? yx3Var.m94804a() : this.f277119a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94805b() {
        yx3 yx3Var = (yx3) this.f277124f.getValue();
        return yx3Var != null ? yx3Var.m94805b() : this.f277120b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("crossfade_enabled", "android-boombox-settings", m94804a()), new k8a("use_playback_settings_crossfade", "android-boombox-settings", m94805b()));
    }

    public yx3(fnk0 fnk0Var, bji bjiVar) {
        this(true, false, fnk0Var, bjiVar);
    }
}
