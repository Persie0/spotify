package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.C0508n;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class tqh0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vir0 f222817a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqh0(vir0 vir0Var) {
        super(1);
        this.f222817a = vir0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        C0508n c0508nM6052E = GetCheckoutPageResponse.m6052E();
        c0508nM6052E.m6620s(vqh0.m86251c(this.f222817a));
        return (GetCheckoutPageResponse) c0508nM6052E.build();
    }
}
