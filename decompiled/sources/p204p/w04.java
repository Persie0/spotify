package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f246634a;

    /* JADX INFO: renamed from: b */
    public final bji f246635b;

    /* JADX INFO: renamed from: c */
    public final wg61 f246636c = new wg61(new ey3(this, 23));

    public w04(boolean z, bji bjiVar) {
        this.f246634a = z;
        this.f246635b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86918a() {
        w04 w04Var = (w04) this.f246636c.getValue();
        return w04Var != null ? w04Var.m86918a() : this.f246634a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("expandable_description_enabled", "android-creativework-elements-description", m86918a()));
    }
}
