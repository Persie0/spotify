package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pj91 extends nj91 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f178212d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f178212d) {
            case 0:
                int i = this.f154534c;
                this.f154534c = i + 2;
                Object[] objArr = this.f154532a;
                return new tgc0(1, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f154534c;
                this.f154534c = i2 + 2;
                return this.f154532a[i2];
            default:
                int i3 = this.f154534c;
                this.f154534c = i3 + 2;
                return this.f154532a[i3 + 1];
        }
    }
}
