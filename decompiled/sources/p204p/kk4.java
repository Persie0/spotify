package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kk4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f123496a;

    /* JADX INFO: renamed from: b */
    public final bji f123497b;

    /* JADX INFO: renamed from: c */
    public final wg61 f123498c = new wg61(new jk4(this, 0));

    public kk4(boolean z, bji bjiVar) {
        this.f123496a = z;
        this.f123497b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56638a() {
        kk4 kk4Var = (kk4) this.f123498c.getValue();
        return kk4Var != null ? kk4Var.m56638a() : this.f123496a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("use_new_attention_algorithm", "android-pagebound-attention", m56638a()));
    }
}
