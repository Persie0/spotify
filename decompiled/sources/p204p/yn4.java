package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274384a;

    /* JADX INFO: renamed from: b */
    public final bji f274385b;

    /* JADX INFO: renamed from: c */
    public final wg61 f274386c;

    public yn4(boolean z, bji bjiVar) {
        this.f274384a = z;
        this.f274385b = bjiVar;
        this.f274386c = new wg61(new cn4(this, 16));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94214a() {
        yn4 yn4Var = (yn4) this.f274386c.getValue();
        return yn4Var != null ? yn4Var.m94214a() : this.f274384a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("record_hard_cap_impressions", "android-reinvent-free-capping-metadata", m94214a()));
    }

    public yn4(bji bjiVar) {
        this(false, bjiVar);
    }
}
