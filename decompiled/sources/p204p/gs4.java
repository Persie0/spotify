package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gs4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f83877a;

    /* JADX INFO: renamed from: b */
    public final bji f83878b;

    /* JADX INFO: renamed from: c */
    public final wg61 f83879c = new wg61(new zr4(this, 5));

    public gs4(boolean z, bji bjiVar) {
        this.f83877a = z;
        this.f83878b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45619a() {
        gs4 gs4Var = (gs4) this.f83879c.getValue();
        return gs4Var != null ? gs4Var.m45619a() : this.f83877a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_static_transcript", "android-transcript-link", m45619a()));
    }
}
