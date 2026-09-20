package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f97374a;

    /* JADX INFO: renamed from: b */
    public final bji f97375b;

    /* JADX INFO: renamed from: c */
    public final wg61 f97376c = new wg61(new ey3(this, 25));

    public i14(boolean z, bji bjiVar) {
        this.f97374a = z;
        this.f97375b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m49394a() {
        i14 i14Var = (i14) this.f97376c.getValue();
        return i14Var != null ? i14Var.m49394a() : this.f97374a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a(x09.f256832d, "android-datasaver-limitedexperienceindicator", m49394a()));
    }
}
