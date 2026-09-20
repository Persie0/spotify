package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class az3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f21406a;

    /* JADX INFO: renamed from: b */
    public final bji f21407b;

    /* JADX INFO: renamed from: c */
    public final wg61 f21408c;

    public az3(boolean z, bji bjiVar) {
        this.f21406a = z;
        this.f21407b = bjiVar;
        this.f21408c = new wg61(new ey3(this, 10));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27567a() {
        az3 az3Var = (az3) this.f21408c.getValue();
        return az3Var != null ? az3Var.m27567a() : this.f21406a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("age_assurance_check_enabled", "android-collectionartist-collection-artist", m27567a()));
    }

    public az3(bji bjiVar) {
        this(false, bjiVar);
    }
}
