package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class w7b0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f248624a;

    /* JADX INFO: renamed from: b */
    public final bji f248625b;

    /* JADX INFO: renamed from: c */
    public final wg61 f248626c = new wg61(new t790(this, 26));

    public w7b0(boolean z, bji bjiVar) {
        this.f248624a = z;
        this.f248625b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87387a() {
        w7b0 w7b0Var = (w7b0) this.f248626c.getValue();
        return w7b0Var != null ? w7b0Var.m87387a() : this.f248624a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("lossless_24_bit_unavailable_card_enabled", "lossless-troubleshooting", m87387a()));
    }
}
