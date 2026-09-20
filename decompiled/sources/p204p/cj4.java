package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f38498a;

    /* JADX INFO: renamed from: b */
    public final boolean f38499b;

    /* JADX INFO: renamed from: c */
    public final bji f38500c;

    /* JADX INFO: renamed from: d */
    public final wg61 f38501d = new wg61(new si4(this, 9));

    public cj4(boolean z, boolean z2, bji bjiVar) {
        this.f38498a = z;
        this.f38499b = z2;
        this.f38500c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32922a() {
        cj4 cj4Var = (cj4) this.f38501d.getValue();
        return cj4Var != null ? cj4Var.m32922a() : this.f38498a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32923b() {
        cj4 cj4Var = (cj4) this.f38501d.getValue();
        return cj4Var != null ? cj4Var.m32923b() : this.f38499b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("should_use_video_thumbnail", "android-nowplaying-mini-uicomponents", m32922a()), new k8a("should_use_vit", "android-nowplaying-mini-uicomponents", m32923b()));
    }
}
