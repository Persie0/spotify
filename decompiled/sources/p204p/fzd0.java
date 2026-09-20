package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fzd0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f74977a;

    /* JADX INFO: renamed from: b */
    public final bji f74978b;

    /* JADX INFO: renamed from: c */
    public final wg61 f74979c = new wg61(new uqd0(this, 3));

    public fzd0(boolean z, bji bjiVar) {
        this.f74977a = z;
        this.f74978b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43197a() {
        fzd0 fzd0Var = (fzd0) this.f74979c.getValue();
        return fzd0Var != null ? fzd0Var.m43197a() : this.f74977a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("skip_remove_on_transition", "mediarouterx-flags", m43197a()));
    }
}
