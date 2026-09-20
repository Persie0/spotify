package p204p;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@y9j0("dialog")
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lp/hhr;", "Lp/aaj0;", "Lp/ghr;", "<init>", "()V", "navigation-compose_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class hhr extends aaj0 {
    @Override // p204p.aaj0
    /* JADX INFO: renamed from: a */
    public final jyi0 mo25252a() {
        fyf fyfVar = gdg.f78844a;
        return new ghr(this);
    }

    @Override // p204p.aaj0
    /* JADX INFO: renamed from: d */
    public final void mo25255d(List list, ezi0 ezi0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m25253b().m97207h((uxi0) it.next());
        }
    }

    @Override // p204p.aaj0
    /* JADX INFO: renamed from: i */
    public final void mo25260i(uxi0 uxi0Var, boolean z) {
        m25253b().m97205f(uxi0Var, z);
        int iM43749u0 = g6f.m43749u0((Iterable) m25253b().f287332f.f158717a.getValue(), uxi0Var);
        int i = 0;
        for (Object obj : (Iterable) m25253b().f287332f.f158717a.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            uxi0 uxi0Var2 = (uxi0) obj;
            if (i > iM43749u0) {
                m25253b().m97201b(uxi0Var2);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final nuu0 m47608k() {
        return m25253b().f287331e;
    }

    /* JADX INFO: renamed from: l */
    public final nuu0 m47609l() {
        return m25253b().f287332f;
    }
}
