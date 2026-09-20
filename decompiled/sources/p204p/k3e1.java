package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k3e1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ shq f118870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3e1(shq shqVar, int i) {
        super(1);
        this.f118869a = i;
        this.f118870b = shqVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f118869a) {
            case 0:
                return new iz80(this.f118870b.f209246b);
            default:
                return this.f118870b.f209246b;
        }
    }
}
