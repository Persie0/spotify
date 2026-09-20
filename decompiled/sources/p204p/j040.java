package p204p;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j040 extends go80 {

    /* JADX INFO: renamed from: e */
    public final u010 f107350e;

    public j040() {
        xqb xqbVar = new xqb(k040.f117887a);
        if (p1m0.m68829j()) {
            xqbVar.m91836p(new bn6(1));
        }
        super(xqbVar.m91824b());
        this.f107350e = new u010(new a8x(this), new si20(this, 20));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        return this.f107350e.m82098p(i);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        this.f107350e.m82107y((l040) dkv0Var, i);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: o */
    public final void mo47717o(dkv0 dkv0Var, int i, List list) {
        this.f107350e.m82108z((l040) dkv0Var, i, g6f.m43745s0(list));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        return this.f107350e.m82080A(i, viewGroup);
    }
}
