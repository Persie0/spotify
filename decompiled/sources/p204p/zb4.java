package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281230a;

    /* JADX INFO: renamed from: b */
    public final boolean f281231b;

    /* JADX INFO: renamed from: c */
    public final boolean f281232c;

    /* JADX INFO: renamed from: d */
    public final boolean f281233d;

    /* JADX INFO: renamed from: e */
    public final bji f281234e;

    /* JADX INFO: renamed from: f */
    public final wg61 f281235f;

    public zb4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f281230a = z;
        this.f281231b = z2;
        this.f281232c = z3;
        this.f281233d = z4;
        this.f281234e = bjiVar;
        this.f281235f = new wg61(new sb4(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95818a() {
        zb4 zb4Var = (zb4) this.f281235f.getValue();
        return zb4Var != null ? zb4Var.m95818a() : this.f281230a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95819b() {
        zb4 zb4Var = (zb4) this.f281235f.getValue();
        return zb4Var != null ? zb4Var.m95819b() : this.f281231b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m95820c() {
        zb4 zb4Var = (zb4) this.f281235f.getValue();
        return zb4Var != null ? zb4Var.m95820c() : this.f281232c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m95821d() {
        zb4 zb4Var = (zb4) this.f281235f.getValue();
        return zb4Var != null ? zb4Var.m95821d() : this.f281233d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("ariana_petal_play_button_easter_egg", "android-libs-nowplaying-elements-playpause", m95818a()), new k8a("color_change_variant_a", "android-libs-nowplaying-elements-playpause", m95819b()), new k8a("color_change_variant_b", "android-libs-nowplaying-elements-playpause", m95820c()), new k8a("harry_potter_play_button_surround_easter_egg", "android-libs-nowplaying-elements-playpause", m95821d()));
    }

    public zb4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
