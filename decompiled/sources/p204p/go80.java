package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class go80 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final cn6 f82904d;

    public go80(pir pirVar) {
        fo80 fo80Var = new fo80(this);
        cn6 cn6Var = new cn6(new qgj0(this, 6), new xqb(pirVar).m91824b());
        this.f82904d = cn6Var;
        cn6Var.f39903d.add(fo80Var);
    }

    /* JADX INFO: renamed from: A */
    public final Object m45324A(int i) {
        return this.f82904d.f39905f.get(i);
    }

    /* JADX INFO: renamed from: C */
    public void mo45325C(List list) {
        this.f82904d.m33435b(list, null);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f82904d.f39905f.size();
    }

    public go80(pgq0 pgq0Var) {
        fo80 fo80Var = new fo80(this);
        cn6 cn6Var = new cn6(new qgj0(this, 6), pgq0Var);
        this.f82904d = cn6Var;
        cn6Var.f39903d.add(fo80Var);
    }

    /* JADX INFO: renamed from: B */
    public void mo31052B(List list, List list2) {
    }
}
