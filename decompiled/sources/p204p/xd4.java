package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f260370a;

    /* JADX INFO: renamed from: b */
    public final bji f260371b;

    /* JADX INFO: renamed from: c */
    public final wg61 f260372c;

    public xd4(boolean z, bji bjiVar) {
        this.f260370a = z;
        this.f260371b = bjiVar;
        this.f260372c = new wg61(new dd4(this, 16));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90406a() {
        xd4 xd4Var = (xd4) this.f260372c.getValue();
        return xd4Var != null ? xd4Var.m90406a() : this.f260370a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("editor_attribution_enabled", "android-list-ux-platform-consumers-editorial-shared", m90406a()));
    }

    public xd4(bji bjiVar) {
        this(false, bjiVar);
    }
}
