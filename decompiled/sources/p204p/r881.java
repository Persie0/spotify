package p204p;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class r881 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final xbp f196736d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f196737e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final SparseArray f196738f;

    public r881(xbp xbpVar, z9j0 z9j0Var, wh51 wh51Var) {
        this.f196736d = xbpVar;
        SparseArray sparseArray = new SparseArray();
        this.f196738f = sparseArray;
        sparseArray.put(0, new no80(1));
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        sparseArray.put(1, new abv(new tf41(i2, this, r881.class, "formattedDate", "formattedDate(Ljava/util/Date;)Ljava/lang/String;", i3, i, 13), i2));
        tf41 tf41Var = new tf41(i2, this, r881.class, "formattedDate", "formattedDate(Ljava/util/Date;)Ljava/lang/String;", i3, i, 14);
        int i4 = 0;
        sparseArray.put(2, new abv(tf41Var, i4));
        sparseArray.put(3, new no80(i4));
        sparseArray.put(4, new fvw0(z9j0Var, wh51Var));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f196737e.size();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        return ((moc1) this.f196737e.get(i)).mo28648a();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        noc1 noc1Var = (noc1) this.f196738f.get(mo28437g(i));
        if (noc1Var != null) {
            noc1Var.mo25391b(dkv0Var, (moc1) this.f196737e.get(i));
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        return ((noc1) this.f196738f.get(i)).mo25390a(viewGroup);
    }
}
