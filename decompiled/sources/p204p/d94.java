package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d94 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f46664a;

    /* JADX INFO: renamed from: b */
    public final fnk0 f46665b;

    /* JADX INFO: renamed from: c */
    public final bji f46666c;

    /* JADX INFO: renamed from: d */
    public final wg61 f46667d = new wg61(new f30(this, 16));

    /* JADX INFO: renamed from: e */
    public final wg61 f46668e = new wg61(new f74(this, 21));

    public d94(boolean z, fnk0 fnk0Var, bji bjiVar) {
        this.f46664a = z;
        this.f46665b = fnk0Var;
        this.f46666c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m35307a() {
        d94 d94Var = (d94) this.f46668e.getValue();
        return d94Var != null ? d94Var.m35307a() : this.f46664a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a(x09.f256832d, "android-genalpha-limitedexperienceindicator", m35307a()));
    }
}
