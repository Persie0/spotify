package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.C0496j;
import com.spotify.checkout.proto.model.p044v1.proto.C0499k;
import com.spotify.checkout.proto.model.p044v1.proto.Error;
import com.spotify.checkout.proto.model.p044v1.proto.GetSpotifyCheckoutPageResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class vph0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public static final vph0 f243696a = new vph0(1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        nb10 nb10VarM6212y = GetSpotifyCheckoutPageResponse.m6212y();
        C0496j c0496jM6011z = Error.m6011z();
        c0496jM6011z.m6591u("Error close");
        c0496jM6011z.m6590t("This error only has a close CTA");
        C0499k c0499kM6019q = Error.CloseCta.m6019q();
        c0499kM6019q.m6599m("close");
        c0496jM6011z.m6586m(c0499kM6019q);
        nb10VarM6212y.m64058r(c0496jM6011z);
        return (GetSpotifyCheckoutPageResponse) nb10VarM6212y.build();
    }
}
