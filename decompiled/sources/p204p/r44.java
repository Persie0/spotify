package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f195649a;

    /* JADX INFO: renamed from: b */
    public final bji f195650b;

    /* JADX INFO: renamed from: c */
    public final wg61 f195651c = new wg61(new y34(this, 15));

    public r44(boolean z, bji bjiVar) {
        this.f195649a = z;
        this.f195650b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74706a() {
        r44 r44Var = (r44) this.f195651c.getValue();
        return r44Var != null ? r44Var.m74706a() : this.f195649a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("multithreaded_metadata_datasource", "android-feature-creativeworkplatform", m74706a()));
    }
}
