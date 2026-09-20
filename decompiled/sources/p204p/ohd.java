package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ohd extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9d f165396b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kjd f165397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ohd(z9d z9dVar, kjd kjdVar, int i) {
        super(1);
        this.f165395a = i;
        this.f165396b = z9dVar;
        this.f165397c = kjdVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f165395a) {
            case 0:
                return pcu0.m69605c(this.f165396b.f280747c, this.f165397c.f123329b, 27);
            default:
                pck pckVar = (pck) obj;
                List list = pckVar.f176154h;
                z9d z9dVar = this.f165396b;
                return pck.m69590c(pckVar, null, null, null, yif1.m93814u(list, new nhd(z9dVar, 1), new ohd(z9dVar, this.f165397c, 0)), null, null, false, 3967);
        }
    }
}
