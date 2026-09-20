package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ym4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274150a;

    /* JADX INFO: renamed from: b */
    public final bji f274151b;

    /* JADX INFO: renamed from: c */
    public final wg61 f274152c = new wg61(new jk4(this, 28));

    public ym4(boolean z, bji bjiVar) {
        this.f274150a = z;
        this.f274151b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94181a() {
        ym4 ym4Var = (ym4) this.f274152c.getValue();
        return ym4Var != null ? ym4Var.m94181a() : this.f274150a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_promo_disclosure_webview_page", "android-promo-disclosure-page", m94181a()));
    }
}
