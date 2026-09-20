package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pe4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f176626a;

    /* JADX INFO: renamed from: b */
    public final bji f176627b;

    /* JADX INFO: renamed from: c */
    public final wg61 f176628c = new wg61(new ne4(this, 1));

    public pe4(boolean z, bji bjiVar) {
        this.f176626a = z;
        this.f176627b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69708a() {
        pe4 pe4Var = (pe4) this.f176628c.getValue();
        return pe4Var != null ? pe4Var.m69708a() : this.f176626a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("header_progress_bar_enabled", "android-list-ux-platform-consumers-standard-headermetadata", m69708a()));
    }
}
