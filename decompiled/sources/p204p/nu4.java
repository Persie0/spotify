package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nu4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f158507a;

    /* JADX INFO: renamed from: b */
    public final bji f158508b;

    /* JADX INFO: renamed from: c */
    public final wg61 f158509c = new wg61(new zr4(this, 24));

    public nu4(boolean z, bji bjiVar) {
        this.f158507a = z;
        this.f158508b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65674a() {
        nu4 nu4Var = (nu4) this.f158509c.getValue();
        return nu4Var != null ? nu4Var.m65674a() : this.f158507a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("prepare_player", "android-voiceassistants-musicappvoiceassistants", m65674a()));
    }
}
