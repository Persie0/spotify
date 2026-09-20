package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dzl extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f54692b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dzl(fiz fizVar, int i) {
        super(1);
        this.f54691a = i;
        this.f54692b = fizVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f54691a) {
            case 0:
                return this.f54692b;
            case 1:
                return this.f54692b;
            default:
                return new qp20(this.f54692b, 29);
        }
    }
}
