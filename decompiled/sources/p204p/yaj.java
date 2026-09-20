package p204p;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class yaj extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final ArrayList f270919d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final SparseArray f270920e;

    /* JADX INFO: renamed from: f */
    public boolean f270921f;

    /* JADX INFO: renamed from: g */
    public boolean f270922g;

    public yaj() {
        SparseArray sparseArray = new SparseArray();
        this.f270920e = sparseArray;
        sparseArray.put(1, new qe1(null, 1));
        sparseArray.put(6, new no80(2));
        sparseArray.put(2, new qe1(null, 5));
        sparseArray.put(3, new qe1(null, 6));
        sparseArray.put(4, new qe1(null, 3));
        sparseArray.put(5, new qe1(null, 4));
        sparseArray.put(7, new qe1(null, 0));
        sparseArray.put(8, new qe1(null, 2));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f270919d.size();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        return ((moc1) this.f270919d.get(i)).mo28648a();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        noc1 noc1Var = (noc1) this.f270920e.get(mo28437g(i));
        if (noc1Var != null) {
            noc1Var.mo25391b(dkv0Var, (moc1) this.f270919d.get(i));
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        return ((noc1) this.f270920e.get(i)).mo25390a(viewGroup);
    }
}
