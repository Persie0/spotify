package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f37253a;

    /* JADX INFO: renamed from: b */
    public final bji f37254b;

    /* JADX INFO: renamed from: c */
    public final wg61 f37255c = new wg61(new ne4(this, 14));

    public cf4(boolean z, bji bjiVar) {
        this.f37253a = z;
        this.f37254b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32616a() {
        cf4 cf4Var = (cf4) this.f37255c.getValue();
        return cf4Var != null ? cf4Var.m32616a() : this.f37253a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("listening_party_preview_attachment_enabled", "android-liveroom-nowplayingbar-attachment", m32616a()));
    }
}
