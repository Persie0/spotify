package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f223753a;

    /* JADX INFO: renamed from: b */
    public final bji f223754b;

    /* JADX INFO: renamed from: c */
    public final wg61 f223755c = new wg61(new ju3(this, 7));

    public tu3(boolean z, bji bjiVar) {
        this.f223753a = z;
        this.f223754b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81546a() {
        tu3 tu3Var = (tu3) this.f223755c.getValue();
        return tu3Var != null ? tu3Var.m81546a() : this.f223753a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("unified_toolbar_action_style_enabled", "android-app-music-toolbar", m81546a()));
    }
}
