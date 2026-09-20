package p204p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.agentstories.p017v1.GetStoriesResponse;
import com.spotify.agentstories.p017v1.StoryFrame;
import com.spotify.agentstories.p017v1.StorySource;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$CreateResponse;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient$AccessTokenResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.collection.esperanto.proto.CollectionGetArtistViewResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class let implements Function, Predicate, Init, ise0, a4a, Function3, w1j0, Function4, ckv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132719a;

    /* JADX INFO: renamed from: b */
    public static final let f132708b = new let(0);

    /* JADX INFO: renamed from: c */
    public static final let f132710c = new let(1);

    /* JADX INFO: renamed from: d */
    public static final let f132712d = new let(2);

    /* JADX INFO: renamed from: e */
    public static final let f132713e = new let(3);

    /* JADX INFO: renamed from: f */
    public static final let f132714f = new let(4);

    /* JADX INFO: renamed from: g */
    public static final let f132715g = new let(5);

    /* JADX INFO: renamed from: h */
    public static final let f132716h = new let(6);

    /* JADX INFO: renamed from: i */
    public static final let f132717i = new let(7);

    /* JADX INFO: renamed from: t */
    public static final let f132718t = new let(8);

    /* JADX INFO: renamed from: X */
    public static final let f132701X = new let(9);

    /* JADX INFO: renamed from: Y */
    public static final let f132703Y = new let(10);

    /* JADX INFO: renamed from: Z */
    public static final let f132705Z = new let(11);

    /* JADX INFO: renamed from: L0 */
    public static final let f132689L0 = new let(12);

    /* JADX INFO: renamed from: M0 */
    public static final let f132690M0 = new let(13);

    /* JADX INFO: renamed from: N0 */
    public static final let f132691N0 = new let(14);

    /* JADX INFO: renamed from: O0 */
    public static final let f132692O0 = new let(15);

    /* JADX INFO: renamed from: P0 */
    public static final let f132693P0 = new let(16);

    /* JADX INFO: renamed from: Q0 */
    public static final let f132694Q0 = new let(17);

    /* JADX INFO: renamed from: R0 */
    public static final let f132695R0 = new let(18);

    /* JADX INFO: renamed from: S0 */
    public static final let f132696S0 = new let(19);

    /* JADX INFO: renamed from: T0 */
    public static final let f132697T0 = new let(20);

    /* JADX INFO: renamed from: U0 */
    public static final let f132698U0 = new let(21);

    /* JADX INFO: renamed from: V0 */
    public static final let f132699V0 = new let(22);

    /* JADX INFO: renamed from: W0 */
    public static final let f132700W0 = new let(23);

    /* JADX INFO: renamed from: X0 */
    public static final let f132702X0 = new let(24);

    /* JADX INFO: renamed from: Y0 */
    public static final let f132704Y0 = new let(25);

    /* JADX INFO: renamed from: Z0 */
    public static final let f132706Z0 = new let(26);

    /* JADX INFO: renamed from: a1 */
    public static final let f132707a1 = new let(27);

    /* JADX INFO: renamed from: b1 */
    public static final let f132709b1 = new let(28);

    /* JADX INFO: renamed from: c1 */
    public static final let f132711c1 = new let(29);

    public /* synthetic */ let(int i) {
        this.f132719a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new yk91((Boolean) obj, (Boolean) obj2, (Integer) obj3);
    }

    @Override // p204p.ise0
    /* JADX INFO: renamed from: a */
    public boolean mo51519a(ArrayList arrayList) {
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f132719a) {
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsAccessTokenClient$AccessTokenResponse.m3478q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.authentication.login5esperanto.EsAccessTokenClient.AccessTokenResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 2:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse.m2296p(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass.SubscribeCreatorToUserTimestampResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 3:
            case 4:
            case 5:
            case 12:
            case 13:
            case 14:
            case 17:
            case 27:
            default:
                Throwable th = (Throwable) obj;
                return wj50.m88271j(th.getMessage(), "404") ? f4x.f65850a : new e4x(th);
            case 6:
                return Boolean.valueOf(((ml4) obj).f144751a);
            case 7:
                ArtistCollectionState artistCollectionStateM97452p = ((CollectionGetArtistViewResponse) obj).m97505n().m97452p();
                return new pqm0(Integer.valueOf(artistCollectionStateM97452p.getNumExplicitlyLikedTracks()), Integer.valueOf(artistCollectionStateM97452p.getNumAlbumsInCollection()));
            case 8:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return AudioSinkChainWrapperEsperanto$CreateResponse.m3379o(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto.CreateResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 9:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 10:
                na6.m63957e("[Puffin] Error getting filter prediction: " + ((Throwable) obj));
                return x48.f258006a;
            case 11:
                Throwable th2 = (Throwable) obj;
                return th2 instanceof be9 ? Single.just(((be9) th2).f26302a) : Single.error(th2);
            case 15:
                return Boolean.valueOf(((s431) obj).f205428a != r431.f195645a);
            case 16:
                n2x0 n2x0Var = ((o2x0) obj).f161171a;
                if (n2x0Var.f149852O0) {
                    return w2a1.f247311a;
                }
                throw new IllegalStateException(s571.m77246e(n2x0Var.f149860d, "Failed to delete comment - Status: "));
            case 18:
                ae50<StoryFrame> ae50VarM3016n = ((GetStoriesResponse) obj).m3016n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM3016n, 10));
                for (StoryFrame storyFrame : ae50VarM3016n) {
                    String strM3024p = storyFrame.m3024p();
                    String strM3026r = storyFrame.m3026r();
                    qf40 qf40VarM67574x = opo.m67574x(storyFrame.m3022n());
                    ae50<StorySource> ae50VarM3023o = storyFrame.m3023o();
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM3023o, 10));
                    for (StorySource storySource : ae50VarM3023o) {
                        arrayList2.add(new ut31(storySource.getName(), storySource.getUrl(), storySource.getSubtitle()));
                    }
                    qf40 qf40VarM67574x2 = opo.m67574x(arrayList2);
                    int iOrdinal = storyFrame.m3025q().ordinal();
                    int i = 2;
                    int i2 = 1;
                    if (iOrdinal == 1) {
                        i2 = i;
                    } else if (iOrdinal == 2) {
                        i = 3;
                        i2 = i;
                    }
                    arrayList.add(new bc51(strM3024p, strM3026r, qf40VarM67574x, qf40VarM67574x2, i2));
                }
                return opo.m67574x(arrayList);
            case 19:
                return (gmr0) ((xul0) obj).mo49278b();
            case 20:
                Map map = (Map) obj;
                ArrayList arrayList3 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getValue();
                    if (str == null) {
                        str = (String) entry.getKey();
                    }
                    arrayList3.add(str);
                }
                return arrayList3;
            case 21:
                return new a6f(true, ((Boolean) obj).booleanValue());
            case 22:
                Boolean bool = (Boolean) g6f.m43745s0(((CollectionPlatformEsperantoContainsResponse) obj).m6873o().m6864p());
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 23:
                e7w e7wVar = (e7w) obj;
                if (e7wVar instanceof c7w) {
                    return Observable.error(new NoSuchElementException(((c7w) e7wVar).f35038a));
                }
                if (e7wVar instanceof d7w) {
                    return Observable.just(e7wVar);
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                return (api) ((xul0) obj).mo49278b();
            case 25:
                return ((Boolean) obj).booleanValue() ? k0s.f118139a : j0s.f107543a;
            case 26:
                return (gmr0) ((xul0) obj).mo49278b();
            case 28:
                return new njo0((h6w) obj);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15575c((eh2) obj, Collections.singleton(cf2.f37236a));
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        String dataString = intent.getDataString();
        Set set = dd41.f47702f;
        String strM61966b = mjd.m61966b(r46.m74726U(dataString));
        if (dataString == null || wl51.m88460J0(dataString) || strM61966b == null || wl51.m88460J0(strM61966b)) {
            return p1j0.f173119a;
        }
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("tab_id") : null;
        Bundle extras2 = intent.getExtras();
        return new u1j0(kzc.class, new qzc(dataString, strM61966b, string, extras2 != null ? extras2.getStringArrayList("requested_tab_ids") : null), new xzq0(2, true, 4));
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        gqx gqxVar = (gqx) obj;
        return !((iqx) gqxVar).f104863f || gqxVar.mo45451c();
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        PlayerState playerState = (PlayerState) obj2;
        return new uti((pqm0) obj, ((Boolean) obj3).booleanValue() && ((Boolean) obj4).booleanValue(), playerState.isPaused(), playerState.isPlaying());
    }
}
