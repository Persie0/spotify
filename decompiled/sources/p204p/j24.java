package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j24 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gir f107920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j24(gir girVar, int i) {
        super(1);
        this.f107919a = i;
        this.f107920b = girVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f107919a) {
            case 0:
                gir girVar = this.f107920b;
                girVar.show();
                return new C1865fm(girVar, 6);
            default:
                gir girVar2 = this.f107920b;
                if (girVar2.f80240e.f133633a) {
                    girVar2.f80239d.invoke();
                }
                return w2a1.f247311a;
        }
    }
}
