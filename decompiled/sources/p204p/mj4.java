package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class mj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f144151a;

    /* JADX INFO: renamed from: b */
    public final bji f144152b;

    /* JADX INFO: renamed from: c */
    public final wg61 f144153c = new wg61(new si4(this, 18));

    public mj4(boolean z, bji bjiVar) {
        this.f144151a = z;
        this.f144152b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61920a() {
        mj4 mj4Var = (mj4) this.f144153c.getValue();
        return mj4Var != null ? mj4Var.m61920a() : this.f144151a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("mini_npv_enabled", "android-nowplayingmini-adsmode", m61920a()));
    }
}
