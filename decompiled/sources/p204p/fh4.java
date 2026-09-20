package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f69570a;

    /* JADX INFO: renamed from: b */
    public final bji f69571b;

    /* JADX INFO: renamed from: c */
    public final wg61 f69572c = new wg61(new bh4(this, 2));

    public fh4(boolean z, bji bjiVar) {
        this.f69570a = z;
        this.f69571b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41647a() {
        fh4 fh4Var = (fh4) this.f69572c.getValue();
        return fh4Var != null ? fh4Var.m41647a() : this.f69570a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("start_preview_immediately_in_loop_enabled", "android-mediatrimmer-mediatrimmerpage", m41647a()));
    }
}
