package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ph4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f177466a;

    /* JADX INFO: renamed from: b */
    public final bji f177467b;

    /* JADX INFO: renamed from: c */
    public final wg61 f177468c;

    public ph4(boolean z, bji bjiVar) {
        this.f177466a = z;
        this.f177467b = bjiVar;
        this.f177468c = new wg61(new bh4(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69946a() {
        ph4 ph4Var = (ph4) this.f177468c.getValue();
        return ph4Var != null ? ph4Var.m69946a() : this.f177466a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_page_monitor_plugin", "android-metric-keeper", m69946a()));
    }

    public ph4(bji bjiVar) {
        this(false, bjiVar);
    }
}
