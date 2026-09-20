package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class bm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f28370a;

    /* JADX INFO: renamed from: b */
    public final bji f28371b;

    /* JADX INFO: renamed from: c */
    public final wg61 f28372c;

    public bm4(boolean z, bji bjiVar) {
        this.f28370a = z;
        this.f28371b = bjiVar;
        this.f28372c = new wg61(new jk4(this, 17));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29793a() {
        bm4 bm4Var = (bm4) this.f28372c.getValue();
        return bm4Var != null ? bm4Var.m29793a() : this.f28370a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_page_api", "android-podcast-interactivity-reactions-bottom-sheet-impl", m29793a()));
    }

    public bm4(bji bjiVar) {
        this(false, bjiVar);
    }
}
