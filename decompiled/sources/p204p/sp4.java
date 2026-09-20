package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f212723a;

    /* JADX INFO: renamed from: b */
    public final bji f212724b;

    /* JADX INFO: renamed from: c */
    public final wg61 f212725c = new wg61(new kp4(this, 4));

    public sp4(boolean z, bji bjiVar) {
        this.f212723a = z;
        this.f212724b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78851a() {
        sp4 sp4Var = (sp4) this.f212725c.getValue();
        return sp4Var != null ? sp4Var.m78851a() : this.f212723a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("cover_art_snake_enabled", "android-system-cover-art-snake", m78851a()));
    }
}
