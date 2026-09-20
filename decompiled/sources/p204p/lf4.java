package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f132793a;

    /* JADX INFO: renamed from: b */
    public final bji f132794b;

    /* JADX INFO: renamed from: c */
    public final wg61 f132795c = new wg61(new ne4(this, 19));

    public lf4(boolean z, bji bjiVar) {
        this.f132793a = z;
        this.f132794b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58837a() {
        lf4 lf4Var = (lf4) this.f132795c.getValue();
        return lf4Var != null ? lf4Var.m58837a() : this.f132793a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("songdna_credits_enabled", "android-lyrics-credits", m58837a()));
    }
}
