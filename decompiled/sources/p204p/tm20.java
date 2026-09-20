package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tm20 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zs0 f221578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm20(int i, zs0 zs0Var) {
        super(1);
        this.f221577a = i;
        this.f221578b = zs0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f221577a) {
            case 0:
                ((Number) obj).intValue();
                return (st91) this.f221578b.f285796c;
            default:
                return new oq91(new tm20(0, this.f221578b));
        }
    }
}
