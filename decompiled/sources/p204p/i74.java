package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class i74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f99422a;

    /* JADX INFO: renamed from: b */
    public final bji f99423b;

    /* JADX INFO: renamed from: c */
    public final wg61 f99424c;

    public i74(boolean z, bji bjiVar) {
        this.f99422a = z;
        this.f99423b = bjiVar;
        this.f99424c = new wg61(new f74(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m49831a() {
        i74 i74Var = (i74) this.f99424c.getValue();
        return i74Var != null ? i74Var.m49831a() : this.f99422a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("side_drawer_entry_point_enabled", "android-feature-taste-profile-side-drawer", m49831a()));
    }

    public i74(bji bjiVar) {
        this(false, bjiVar);
    }
}
