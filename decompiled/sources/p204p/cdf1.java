package p204p;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class cdf1 extends C2442u7 implements ListIterator {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ydf1 f36887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdf1(ydf1 ydf1Var) {
        super(ydf1Var);
        this.f36887e = ydf1Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ydf1 ydf1Var = this.f36887e;
        boolean zIsEmpty = ydf1Var.isEmpty();
        m82476b();
        ((ListIterator) this.f227463b).add(obj);
        if (zIsEmpty) {
            ydf1Var.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m82476b();
        return ((ListIterator) this.f227463b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m82476b();
        return ((ListIterator) this.f227463b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m82476b();
        return ((ListIterator) this.f227463b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m82476b();
        return ((ListIterator) this.f227463b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m82476b();
        ((ListIterator) this.f227463b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdf1(ydf1 ydf1Var, int i) {
        super(ydf1Var, ((List) ydf1Var.f271749b).listIterator(i));
        this.f36887e = ydf1Var;
    }
}
