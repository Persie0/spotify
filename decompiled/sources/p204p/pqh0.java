package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.C0490h;
import com.spotify.checkout.proto.model.p044v1.proto.C0493i;
import com.spotify.checkout.proto.model.p044v1.proto.C0508n;
import com.spotify.checkout.proto.model.p044v1.proto.CheckoutStatus;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class pqh0 extends qe70 implements gh00 {
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        C0508n c0508nM6052E = GetCheckoutPageResponse.m6052E();
        C0490h c0490hM5995t = CheckoutStatus.m5995t();
        c0490hM5995t.m6571s("Some checkout status");
        c0490hM5995t.m6570r("Explanation of the status");
        C0493i c0493iM6001q = CheckoutStatus.CloseCta.m6001q();
        c0493iM6001q.m6577m("Go back");
        c0490hM5995t.m6568m(c0493iM6001q);
        c0508nM6052E.m6618q((CheckoutStatus) c0490hM5995t.build());
        return (GetCheckoutPageResponse) c0508nM6052E.build();
    }
}
