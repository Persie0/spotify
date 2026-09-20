package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c84 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f35103a;

    /* JADX INFO: renamed from: b */
    public final boolean f35104b;

    /* JADX INFO: renamed from: c */
    public final bji f35105c;

    /* JADX INFO: renamed from: d */
    public final wg61 f35106d = new wg61(new f74(this, 15));

    public c84(boolean z, boolean z2, bji bjiVar) {
        this.f35103a = z;
        this.f35104b = z2;
        this.f35105c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31771a() {
        c84 c84Var = (c84) this.f35106d.getValue();
        return c84Var != null ? c84Var.m31771a() : this.f35103a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31772b() {
        c84 c84Var = (c84) this.f35106d.getValue();
        return c84Var != null ? c84Var.m31772b() : this.f35104b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("audio_guide_label_enabled", "android-fitness-settings-page", m31771a()), new k8a("familiar_new_slider_labels_enabled", "android-fitness-settings-page", m31772b()));
    }
}
