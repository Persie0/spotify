package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f200720a;

    /* JADX INFO: renamed from: b */
    public final bji f200721b;

    /* JADX INFO: renamed from: c */
    public final wg61 f200722c;

    public rn4(boolean z, bji bjiVar) {
        this.f200720a = z;
        this.f200721b = bjiVar;
        this.f200722c = new wg61(new cn4(this, 10));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75988a() {
        rn4 rn4Var = (rn4) this.f200722c.getValue();
        return rn4Var != null ? rn4Var.m75988a() : this.f200720a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("show_track_exclude_menu_item", "android-recommendations-contextmenuimpl", m75988a()));
    }

    public rn4(bji bjiVar) {
        this(false, bjiVar);
    }
}
