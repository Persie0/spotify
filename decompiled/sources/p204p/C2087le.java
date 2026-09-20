package p204p;

import android.media.MediaMetadataRetriever;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.music.R;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: p.le */
/* JADX INFO: loaded from: classes.dex */
public final class C2087le extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final C2087le f132382L0;

    /* JADX INFO: renamed from: M0 */
    public static final C2087le f132383M0;

    /* JADX INFO: renamed from: N0 */
    public static final C2087le f132384N0;

    /* JADX INFO: renamed from: O0 */
    public static final C2087le f132385O0;

    /* JADX INFO: renamed from: P0 */
    public static final C2087le f132386P0;

    /* JADX INFO: renamed from: Q0 */
    public static final C2087le f132387Q0;

    /* JADX INFO: renamed from: R0 */
    public static final C2087le f132388R0;

    /* JADX INFO: renamed from: S0 */
    public static final C2087le f132389S0;

    /* JADX INFO: renamed from: T0 */
    public static final C2087le f132390T0;

    /* JADX INFO: renamed from: U0 */
    public static final C2087le f132391U0;

    /* JADX INFO: renamed from: V0 */
    public static final C2087le f132392V0;

    /* JADX INFO: renamed from: W0 */
    public static final C2087le f132393W0;

    /* JADX INFO: renamed from: X */
    public static final C2087le f132394X;

    /* JADX INFO: renamed from: X0 */
    public static final C2087le f132395X0;

    /* JADX INFO: renamed from: Y */
    public static final C2087le f132396Y;

    /* JADX INFO: renamed from: Y0 */
    public static final C2087le f132397Y0;

    /* JADX INFO: renamed from: Z */
    public static final C2087le f132398Z;

    /* JADX INFO: renamed from: Z0 */
    public static final C2087le f132399Z0;

    /* JADX INFO: renamed from: a1 */
    public static final C2087le f132400a1;

    /* JADX INFO: renamed from: b */
    public static final C2087le f132401b;

    /* JADX INFO: renamed from: b1 */
    public static final C2087le f132402b1;

    /* JADX INFO: renamed from: c */
    public static final C2087le f132403c;

    /* JADX INFO: renamed from: c1 */
    public static final C2087le f132404c1;

    /* JADX INFO: renamed from: d */
    public static final C2087le f132405d;

    /* JADX INFO: renamed from: e */
    public static final C2087le f132406e;

    /* JADX INFO: renamed from: f */
    public static final C2087le f132407f;

    /* JADX INFO: renamed from: g */
    public static final C2087le f132408g;

    /* JADX INFO: renamed from: h */
    public static final C2087le f132409h;

    /* JADX INFO: renamed from: i */
    public static final C2087le f132410i;

    /* JADX INFO: renamed from: t */
    public static final C2087le f132411t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132412a;

    static {
        int i = 0;
        f132401b = new C2087le(i, 0);
        f132403c = new C2087le(i, 1);
        f132405d = new C2087le(i, 2);
        f132406e = new C2087le(i, 3);
        f132407f = new C2087le(i, 4);
        f132408g = new C2087le(i, 5);
        f132409h = new C2087le(i, 6);
        f132410i = new C2087le(i, 7);
        f132411t = new C2087le(i, 8);
        f132394X = new C2087le(i, 9);
        f132396Y = new C2087le(i, 10);
        f132398Z = new C2087le(i, 11);
        f132382L0 = new C2087le(i, 12);
        f132383M0 = new C2087le(i, 13);
        f132384N0 = new C2087le(i, 14);
        f132385O0 = new C2087le(i, 15);
        f132386P0 = new C2087le(i, 16);
        f132387Q0 = new C2087le(i, 17);
        f132388R0 = new C2087le(i, 18);
        f132389S0 = new C2087le(i, 19);
        f132390T0 = new C2087le(i, 20);
        f132391U0 = new C2087le(i, 21);
        f132392V0 = new C2087le(i, 22);
        f132393W0 = new C2087le(i, 23);
        f132395X0 = new C2087le(i, 24);
        f132397Y0 = new C2087le(i, 25);
        f132399Z0 = new C2087le(i, 26);
        f132400a1 = new C2087le(i, 27);
        f132402b1 = new C2087le(i, 28);
        f132404c1 = new C2087le(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2087le(int i, int i2) {
        super(i);
        this.f132412a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f132412a) {
            case 0:
                throw new IllegalStateException("No Accessibility provided. Wrap content with SpotifyComposeDefaults.ProvideSpotifyComposeDefaults().");
            case 1:
                return Integer.valueOf(w4u0.f247891b.mo84665g(2147418112) + 65536);
            case 2:
                return w2a1.f247311a;
            case 3:
                return new ca2();
            case 4:
                return w2a1.f247311a;
            case 5:
                return p8y.m69343a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
            case 6:
                return Float.valueOf(0.0f);
            case 7:
                return new Locale(ihf1.m50632p());
            case 8:
                throw new IllegalStateException("No ImageLoader provided. For @Previews use com.spotify.encore.tooling.preview.EncorePreview()");
            case 9:
                return t0j.m79824e(R.string.f5983xbaf9aa03).m52392q();
            case 10:
                return new gj80("Child account", ej80.f60159a);
            case 11:
                return "home";
            case 12:
                return new xy3((am71) dm71.f50468a.getValue(), new xo4());
            case 13:
                wsh.m88897b("LocalDensity");
                throw null;
            case 14:
                return w2a1.f247311a;
            case 15:
                return new ofu(0.8f);
            case 16:
                top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
                bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
                bjp0VarM18365h0.m29496H();
                bjp0VarM18365h0.m29495G();
                top0VarM18421v.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h0.build());
                return (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
            case 17:
                na6.m63957e("No LocalEncoreTooltipMessagePresenter provided - ensure that you're in a page or manually call ProvideEncoreTooltipCompositionLocals");
                return null;
            case 18:
                return Boolean.TRUE;
            case 19:
                return zoz.f284885a;
            case 20:
                return new SimpleDateFormat("EEE", Locale.getDefault());
            case 21:
                return Boolean.FALSE;
            case 22:
                return new lp70(3);
            case 23:
                return h6f.m46715L(gn80.TRACK, gn80.ALBUM, gn80.ARTIST, gn80.AUTHOR, gn80.SHOW_SHOW, gn80.SHOW_EPISODE);
            case 24:
                return WorkRunners.m15651a();
            case 25:
                top0 top0VarM18421v2 = PlaylistRequestDecorationPolicy.m18421v();
                bjp0 bjp0VarM18365h1 = PlaylistDecorationPolicy.m18365h0();
                bjp0VarM18365h1.m29502N();
                bjp0VarM18365h1.m29518d0();
                bjp0VarM18365h1.m29506R();
                bjp0VarM18365h1.m29495G();
                bjp0VarM18365h1.m29491C();
                top0VarM18421v2.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h1.build());
                amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
                amp0VarM18396H.m26433D(true);
                amp0VarM18396H.m26440v();
                top0VarM18421v2.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) top0VarM18421v2.build();
                wj50.m88279p(playlistRequestDecorationPolicy);
                return new st80(playlistRequestDecorationPolicy, null, null, false, pt80.f181071a, a5u0.f12598a, null, 0, null, 462);
            case 26:
                return hhg1.m47532k();
            case 27:
                return new uyu();
            case 28:
                return new MediaMetadataRetriever();
            default:
                na6.m63957e("No MessageOrchestrator provided");
                return null;
        }
    }
}
