package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.C0508n;
import com.spotify.checkout.proto.model.p044v1.proto.C0537z;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class uqh0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public static final uqh0 f233019a = new uqh0(1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        C0508n c0508nM6052E = GetCheckoutPageResponse.m6052E();
        String strM6051r = ((GetCheckoutPageRequest) obj).m6051r();
        C0537z c0537zM6124q = GetCheckoutPageResponse.SpotifyCheckout.m6124q();
        c0537zM6124q.m6689m("https://payments.spotify.com/checkout/" + strM6051r + "?skip=spotify");
        c0508nM6052E.m6622u((GetCheckoutPageResponse.SpotifyCheckout) c0537zM6124q.build());
        return (GetCheckoutPageResponse) c0508nM6052E.build();
    }
}
