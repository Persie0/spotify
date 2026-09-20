package p204p;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ohc1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ phc1 f165394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ohc1(phc1 phc1Var, int i) {
        super(0);
        this.f165393a = i;
        this.f165394b = phc1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f165393a) {
            case 0:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f165394b.f177550b1.saveHierarchyState(sparseArray);
                return sparseArray;
            case 1:
                phc1 phc1Var = this.f165394b;
                phc1Var.getReleaseBlock().invoke(phc1Var.f177550b1);
                phc1.m69977n(phc1Var);
                return w2a1.f247311a;
            case 2:
                phc1 phc1Var2 = this.f165394b;
                phc1Var2.getResetBlock().invoke(phc1Var2.f177550b1);
                return w2a1.f247311a;
            default:
                phc1 phc1Var3 = this.f165394b;
                phc1Var3.getUpdateBlock().invoke(phc1Var3.f177550b1);
                return w2a1.f247311a;
        }
    }
}
