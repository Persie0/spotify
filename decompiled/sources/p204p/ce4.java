package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ce4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f37003a;

    /* JADX INFO: renamed from: b */
    public final bji f37004b;

    /* JADX INFO: renamed from: c */
    public final wg61 f37005c = new wg61(new dd4(this, 21));

    public ce4(boolean z, bji bjiVar) {
        this.f37003a = z;
        this.f37004b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32489a() {
        ce4 ce4Var = (ce4) this.f37005c.getValue();
        return ce4Var != null ? ce4Var.m32489a() : this.f37003a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("filter_storage_enabled", "android-list-ux-platform-consumers-listenlater-sections-filterandsort", m32489a()));
    }
}
