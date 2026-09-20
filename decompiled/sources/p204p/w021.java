package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w021 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x3v f246625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w021(x3v x3vVar, int i) {
        super(0);
        this.f246624a = i;
        this.f246625b = x3vVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f246624a) {
            case 0:
                this.f246625b.m89816b().accept(pww.f182147a);
                break;
            case 1:
                this.f246625b.m89816b().accept(dyw.f54456a);
                break;
            default:
                this.f246625b.m89816b().accept(dxw.f54109a);
                break;
        }
        return w2a1.f247311a;
    }
}
