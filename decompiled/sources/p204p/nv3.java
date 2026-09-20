package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nv3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f158774a;

    /* JADX INFO: renamed from: b */
    public final bji f158775b;

    /* JADX INFO: renamed from: c */
    public final wg61 f158776c = new wg61(new ju3(this, 20));

    public nv3(boolean z, bji bjiVar) {
        this.f158774a = z;
        this.f158775b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65720a() {
        nv3 nv3Var = (nv3) this.f158776c.getValue();
        return nv3Var != null ? nv3Var.m65720a() : this.f158774a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_dynamic_feature", "android-audiomodelstub", m65720a()));
    }
}
