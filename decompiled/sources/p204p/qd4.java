package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f187475a;

    /* JADX INFO: renamed from: b */
    public final bji f187476b;

    /* JADX INFO: renamed from: c */
    public final wg61 f187477c = new wg61(new dd4(this, 10));

    public qd4(boolean z, bji bjiVar) {
        this.f187475a = z;
        this.f187476b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72580a() {
        qd4 qd4Var = (qd4) this.f187477c.getValue();
        return qd4Var != null ? qd4Var.m72580a() : this.f187475a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a(x09.f256832d, "android-list-ux-platform-consumers-audiobook-listcomponents-playableaudiobooklens", m72580a()));
    }
}
