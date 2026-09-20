package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f259834a;

    /* JADX INFO: renamed from: b */
    public final bji f259835b;

    /* JADX INFO: renamed from: c */
    public final wg61 f259836c = new wg61(new sb4(this, 4));

    public xb4(boolean z, bji bjiVar) {
        this.f259834a = z;
        this.f259835b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90304a() {
        xb4 xb4Var = (xb4) this.f259836c.getValue();
        return xb4Var != null ? xb4Var.m90304a() : this.f259834a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("should_use_vit", "android-libs-nowplaying-elements-mixingtransitionelement", m90304a()));
    }
}
