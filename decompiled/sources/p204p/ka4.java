package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ka4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f120790a;

    /* JADX INFO: renamed from: b */
    public final bji f120791b;

    /* JADX INFO: renamed from: c */
    public final wg61 f120792c = new wg61(new ga4(this, 3));

    public ka4(boolean z, bji bjiVar) {
        this.f120790a = z;
        this.f120791b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55867a() {
        ka4 ka4Var = (ka4) this.f120792c.getValue();
        return ka4Var != null ? ka4Var.m55867a() : this.f120790a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_safe_search", "android-libs-ads-browser", m55867a()));
    }
}
