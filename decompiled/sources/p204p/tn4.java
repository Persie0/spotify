package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f221878a;

    /* JADX INFO: renamed from: b */
    public final bji f221879b;

    /* JADX INFO: renamed from: c */
    public final wg61 f221880c;

    public tn4(boolean z, bji bjiVar) {
        this.f221878a = z;
        this.f221879b = bjiVar;
        this.f221880c = new wg61(new cn4(this, 12));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81154a() {
        tn4 tn4Var = (tn4) this.f221880c.getValue();
        return tn4Var != null ? tn4Var.m81154a() : this.f221878a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("primary_entrypoint_enabled", "android-referrals-flags", m81154a()));
    }

    public tn4(bji bjiVar) {
        this(false, bjiVar);
    }
}
