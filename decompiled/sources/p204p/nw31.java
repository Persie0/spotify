package p204p;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class nw31 extends t350 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159010a;

    /* JADX INFO: renamed from: b */
    public int f159011b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Cloneable f159012c;

    public /* synthetic */ nw31(Cloneable cloneable, int i) {
        this.f159010a = i;
        this.f159012c = cloneable;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f159010a) {
            case 0:
                return this.f159011b < ((SparseArray) this.f159012c).size();
            default:
                return this.f159011b < ((mw31) this.f159012c).m62986h();
        }
    }

    @Override // p204p.t350
    public final int nextInt() {
        switch (this.f159010a) {
            case 0:
                SparseArray sparseArray = (SparseArray) this.f159012c;
                int i = this.f159011b;
                this.f159011b = i + 1;
                return sparseArray.keyAt(i);
            default:
                mw31 mw31Var = (mw31) this.f159012c;
                int i2 = this.f159011b;
                this.f159011b = i2 + 1;
                return mw31Var.m62984e(i2);
        }
    }
}
