package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class q84 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f186238a;

    /* JADX INFO: renamed from: b */
    public final bji f186239b;

    /* JADX INFO: renamed from: c */
    public final wg61 f186240c;

    public q84(boolean z, bji bjiVar) {
        this.f186238a = z;
        this.f186239b = bjiVar;
        this.f186240c = new wg61(new f74(this, 17));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72308a() {
        q84 q84Var = (q84) this.f186240c.getValue();
        return q84Var != null ? q84Var.m72308a() : this.f186238a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("should_show_premium_badge", "android-freetier-experiments", m72308a()));
    }

    public q84(bji bjiVar) {
        this(false, bjiVar);
    }
}
