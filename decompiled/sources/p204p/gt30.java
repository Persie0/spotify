package p204p;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes7.dex */
public final class gt30 implements jk30 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f84082a;

    public gt30(SparseArray sparseArray) {
        sparseArray.getClass();
        this.f84082a = sparseArray.clone();
    }

    @Override // p204p.jk30
    /* JADX INFO: renamed from: a */
    public final qj30 mo45025a(int i) {
        return (qj30) this.f84082a.get(i);
    }
}
