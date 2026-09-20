package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.C0495i1;
import com.spotify.checkout.proto.model.p044v1.proto.SubmitCheckoutResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class eqh0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public static final eqh0 f61890a = new eqh0(1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        C0495i1 c0495i1M6460y = SubmitCheckoutResponse.m6460y();
        c0495i1M6460y.m6584s(SubmitCheckoutResponse.Success.m6474n());
        return (SubmitCheckoutResponse) c0495i1M6460y.build();
    }
}
