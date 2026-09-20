package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class me30 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1790du f142595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me30(C1790du c1790du, int i) {
        super(1);
        this.f142594a = i;
        this.f142595b = c1790du;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f142594a) {
            case 0:
                xe30 xe30Var = (xe30) obj;
                if (xe30Var.f260624c) {
                    om0.m67310a((om0) this.f142595b.f52926d, qm0.UNLOADED, xe30Var.f260622a.f132439a.f69506a, null, null, null, 124);
                }
                break;
            default:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = zy20.f287474i;
                qspVar.f192169h = new me30(this.f142595b, 0);
                break;
        }
        return w2a1.f247311a;
    }
}
