package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ku3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f126440a;

    /* JADX INFO: renamed from: b */
    public final bji f126441b;

    /* JADX INFO: renamed from: c */
    public final wg61 f126442c = new wg61(new ju3(this, 0));

    public ku3(boolean z, bji bjiVar) {
        this.f126440a = z;
        this.f126441b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57374a() {
        ku3 ku3Var = (ku3) this.f126442c.getValue();
        return ku3Var != null ? ku3Var.m57374a() : this.f126440a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("in_app_ad_settings_enabled", "android-adsdisplay-settings", m57374a()));
    }
}
