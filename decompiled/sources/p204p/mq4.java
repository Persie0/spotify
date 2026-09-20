package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f146153a;

    /* JADX INFO: renamed from: b */
    public final bji f146154b;

    /* JADX INFO: renamed from: c */
    public final wg61 f146155c = new wg61(new kp4(this, 21));

    public mq4(boolean z, bji bjiVar) {
        this.f146153a = z;
        this.f146154b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m62512a() {
        mq4 mq4Var = (mq4) this.f146155c.getValue();
        return mq4Var != null ? mq4Var.m62512a() : this.f146153a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_condensed_heading", "android-system-preview-card-heading", m62512a()));
    }
}
