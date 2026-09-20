package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qj91 extends oj91 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f189200d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f189200d) {
            case 0:
                int i = this.f166020c;
                this.f166020c = i + 2;
                Object[] objArr = this.f166018a;
                return new tgc0(0, objArr[i], objArr[i + 1]);
            default:
                int i2 = this.f166020c;
                this.f166020c = i2 + 2;
                return this.f166018a[i2 + 1];
        }
    }
}
