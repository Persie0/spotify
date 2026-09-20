package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class od4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f164092a;

    /* JADX INFO: renamed from: b */
    public final bji f164093b;

    /* JADX INFO: renamed from: c */
    public final wg61 f164094c;

    public od4(boolean z, bji bjiVar) {
        this.f164092a = z;
        this.f164093b = bjiVar;
        this.f164094c = new wg61(new dd4(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66740a() {
        od4 od4Var = (od4) this.f164094c.getValue();
        return od4Var != null ? od4Var.m66740a() : this.f164092a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("recently_added_blue_dot_enabled", "android-list-ux-platform-consumers-advanced-curation-rows-mediaoverlay", m66740a()));
    }

    public od4(bji bjiVar) {
        this(false, bjiVar);
    }
}
