package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f284402a;

    /* JADX INFO: renamed from: b */
    public final bji f284403b;

    /* JADX INFO: renamed from: c */
    public final wg61 f284404c = new wg61(new cn4(this, 17));

    public zn4(boolean z, bji bjiVar) {
        this.f284402a = z;
        this.f284403b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96511a() {
        zn4 zn4Var = (zn4) this.f284404c.getValue();
        return zn4Var != null ? zn4Var.m96511a() : this.f284402a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_contextual_page_enabled", "android-reinvent-free-download-upsell", m96511a()));
    }
}
