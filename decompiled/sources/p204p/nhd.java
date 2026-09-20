package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nhd extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9d f153952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhd(z9d z9dVar, int i) {
        super(1);
        this.f153951a = i;
        this.f153952b = z9dVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f153951a) {
            case 0:
                return Boolean.valueOf(wj50.m88271j(((pck) obj).f176147a, this.f153952b.f280745a));
            default:
                return Boolean.valueOf(wj50.m88271j(((pcu0) obj).f176230a, this.f153952b.f280746b));
        }
    }
}
