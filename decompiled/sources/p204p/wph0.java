package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.C0496j;
import com.spotify.checkout.proto.model.p044v1.proto.C0502l;
import com.spotify.checkout.proto.model.p044v1.proto.Error;
import com.spotify.checkout.proto.model.p044v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.p044v1.proto.GetSpotifyCheckoutPageResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class wph0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public static final wph0 f253771a = new wph0(1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        nb10 nb10VarM6212y = GetSpotifyCheckoutPageResponse.m6212y();
        C0496j c0496jM6011z = Error.m6011z();
        c0496jM6011z.m6591u("Error double follow link");
        c0496jM6011z.m6590t("This error only has TWO CTAs");
        C0502l c0502lM6024s = Error.DoubleFollowLinkCta.m6024s();
        pwz pwzVarM6043s = FollowLinkCta.m6043s();
        pwzVarM6043s.m71318q("Amazing video");
        pwzVarM6043s.m71317m("https://www.youtube.com/watch?v=DJO_9auJhJQ");
        c0502lM6024s.m6601m(pwzVarM6043s);
        pwz pwzVarM6043s2 = FollowLinkCta.m6043s();
        pwzVarM6043s2.m71318q("This one too");
        pwzVarM6043s2.m71317m("https://www.youtube.com/watch?v=evUfG3lrk5U");
        c0502lM6024s.m6602q(pwzVarM6043s2);
        c0496jM6011z.m6587q(c0502lM6024s);
        nb10VarM6212y.m64058r(c0496jM6011z);
        return (GetSpotifyCheckoutPageResponse) nb10VarM6212y.build();
    }
}
