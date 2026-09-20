package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f194377a;

    /* JADX INFO: renamed from: b */
    public final bji f194378b;

    /* JADX INFO: renamed from: c */
    public final wg61 f194379c = new wg61(new ey3(this, 18));

    public r04(boolean z, bji bjiVar) {
        this.f194377a = z;
        this.f194378b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74360a() {
        r04 r04Var = (r04) this.f194379c.getValue();
        return r04Var != null ? r04Var.m74360a() : this.f194377a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("media_prefetch_data_saver_enabled", "android-contentdelivery-prefetchimpl", m74360a()));
    }
}
