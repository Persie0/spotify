package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f198506a;

    /* JADX INFO: renamed from: b */
    public final bji f198507b;

    /* JADX INFO: renamed from: c */
    public final wg61 f198508c = new wg61(new ne4(this, 24));

    public rf4(boolean z, bji bjiVar) {
        this.f198506a = z;
        this.f198507b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75421a() {
        rf4 rf4Var = (rf4) this.f198508c.getValue();
        return rf4Var != null ? rf4Var.m75421a() : this.f198506a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_made_for_you_hub_page", "android-made-for-you-hub", m75421a()));
    }
}
