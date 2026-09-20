package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e8d1 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f57146a;

    /* JADX INFO: renamed from: b */
    public final bji f57147b;

    /* JADX INFO: renamed from: c */
    public final wg61 f57148c;

    public e8d1(boolean z, bji bjiVar) {
        this.f57146a = z;
        this.f57147b = bjiVar;
        this.f57148c = new wg61(new ixb1(this, 16));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m38092a() {
        e8d1 e8d1Var = (e8d1) this.f57148c.getValue();
        return e8d1Var != null ? e8d1Var.m38092a() : this.f57146a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("watchfeed_artwork_accessory_enabled", "watch-feed-artwork-accessory", m38092a()));
    }

    public e8d1(bji bjiVar) {
        this(false, bjiVar);
    }
}
