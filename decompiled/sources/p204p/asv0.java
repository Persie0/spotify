package p204p;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class asv0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bsv0 f19518b;

    public /* synthetic */ asv0(bsv0 bsv0Var, int i) {
        this.f19517a = i;
        this.f19518b = bsv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19517a) {
            case 0:
                SparseArray sparseArray = this.f19518b.f30408h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((smd0) sparseArray.valueAt(i)).mo36781a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                bsv0 bsv0Var = this.f19518b;
                gsv0 gsv0Var = bsv0Var.f30409i;
                if (gsv0Var.f84022L0 == bsv0Var) {
                    gsv0Var.m45665k();
                }
                break;
        }
    }
}
