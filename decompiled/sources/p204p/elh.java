package p204p;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@y9j0("composable")
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lp/elh;", "Lp/aaj0;", "Lp/dlh;", "<init>", "()V", "navigation-compose_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class elh extends aaj0 {

    /* JADX INFO: renamed from: c */
    public final yum0 f60713c = sam.m77645B(Boolean.FALSE);

    @Override // p204p.aaj0
    /* JADX INFO: renamed from: a */
    public final jyi0 mo25252a() {
        return new dlh(this, y7g.f270048a);
    }

    @Override // p204p.aaj0
    /* JADX INFO: renamed from: d */
    public final void mo25255d(List list, ezi0 ezi0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m25253b().m97208i((uxi0) it.next());
        }
        this.f60713c.setValue(Boolean.FALSE);
    }

    @Override // p204p.aaj0
    /* JADX INFO: renamed from: i */
    public final void mo25260i(uxi0 uxi0Var, boolean z) {
        m25253b().m97205f(uxi0Var, z);
        this.f60713c.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k */
    public final nuu0 m39388k() {
        return m25253b().f287331e;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final yum0 getF60713c() {
        return this.f60713c;
    }

    /* JADX INFO: renamed from: m */
    public final void m39390m(uxi0 uxi0Var) {
        m25253b().m97201b(uxi0Var);
    }
}
