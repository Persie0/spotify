package p204p;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class rdd1 implements cq6 {

    /* JADX INFO: renamed from: a */
    public final n95 f198103a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f198104b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public final i82 f198105c;

    public rdd1(RecyclerView recyclerView, n95 n95Var) {
        this.f198103a = n95Var;
        i82 i82Var = new i82(20);
        this.f198105c = i82Var;
        i82Var.f99670f = new dxc1(this, 2);
        recyclerView.m1018m(new iq6(this, 26));
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: a */
    public final void mo33595a(bq6 bq6Var) {
        this.f198104b.remove(bq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: c */
    public final void mo33596c(aq6 aq6Var) {
        ((LinkedHashSet) this.f198105c.f99666b).add(aq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: d */
    public final void mo33597d(bq6 bq6Var) {
        this.f198104b.add(bq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: e */
    public final void mo33598e(aq6 aq6Var) {
        i82 i82Var = this.f198105c;
        ((LinkedHashSet) i82Var.f99666b).remove(aq6Var);
        ((LinkedHashMap) i82Var.f99667c).remove(aq6Var);
        if (((Set) i82Var.f99669e).contains(aq6Var)) {
            i82Var.m49928w(s601.m77304g0(aq6Var, (Set) i82Var.f99669e));
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [p.gh00, p.qe70] */
    @Override // p204p.cq6
    /* JADX INFO: renamed from: g */
    public final void mo33599g(int i, Float f, Float f2, float f3) {
        n95 n95Var = this.f198103a;
        xpi0 xpi0Var = (xpi0) n95Var.f151718b;
        if (xpi0Var == null) {
            xpi0Var = new xpi0();
            ((qe70) n95Var.f151717a).invoke(xpi0Var);
            n95Var.f151718b = xpi0Var;
        }
        this.f198105c.f99668d = xpi0Var;
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: j */
    public final void mo33602j(aq6 aq6Var, xpi0 xpi0Var) {
        i82 i82Var = this.f198105c;
        ((LinkedHashMap) i82Var.f99667c).put(aq6Var, xpi0Var);
        if (i82Var.f99665a) {
            i82Var.m49907A();
        }
    }
}
