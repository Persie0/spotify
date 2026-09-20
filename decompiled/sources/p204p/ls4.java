package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ls4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f136438a;

    /* JADX INFO: renamed from: b */
    public final bji f136439b;

    /* JADX INFO: renamed from: c */
    public final wg61 f136440c = new wg61(new zr4(this, 10));

    public ls4(boolean z, bji bjiVar) {
        this.f136438a = z;
        this.f136439b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m59823a() {
        ls4 ls4Var = (ls4) this.f136440c.getValue();
        return ls4Var != null ? ls4Var.m59823a() : this.f136438a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_share_card_carousel", "android-transcript-share", m59823a()));
    }
}
