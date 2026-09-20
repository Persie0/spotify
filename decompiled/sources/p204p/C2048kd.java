package p204p;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.spotify.connectivity.esperanto.proto.SubStateRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesSyncRequest;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.karaoke.esperanto.proto.KaraokePostStatusRequest;
import com.spotify.karaoke.esperanto.proto.KaraokePostVocalVolumeRequest;
import com.spotify.on_demand_set.proto.Set;
import com.spotify.playback_esperanto.proto.PlaybackEsperanto$DuckRequest;
import com.spotify.prefetch_esperanto.proto.EsMediaPrefetch$SegmentProfileSelectionConfig;
import com.spotify.prefetch_esperanto.proto.EsMediaPrefetch$UpdateFutureRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import spotify.profile_esperanto.proto.GetProfilesRequest;

/* JADX INFO: renamed from: p.kd */
/* JADX INFO: loaded from: classes5.dex */
public final class C2048kd extends ClientBase {
    /* JADX INFO: renamed from: A */
    public Single m56109A(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetPrivateSession", boolValue).map(koq0.f124887Z);
    }

    /* JADX INFO: renamed from: B */
    public Single m56110B(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetShowUnavailableTracks", boolValue).map(loq0.f135505N0);
    }

    /* JADX INFO: renamed from: C */
    public Single m56111C(Int32Value int32Value) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetStreamNonMeteredQuality", int32Value).map(oqq0.f168357Z);
    }

    /* JADX INFO: renamed from: D */
    public Single m56112D(Int32Value int32Value) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetStreamQuality", int32Value).map(pqq0.f180382Z);
    }

    /* JADX INFO: renamed from: E */
    public Single m56113E(StringValue stringValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetWebgateUrl", stringValue).map(crq0.f41357Y);
    }

    /* JADX INFO: renamed from: F */
    public Observable m56114F(SubValuesRequest subValuesRequest) {
        return callStream("spotify.product_state.esperanto.proto.ProductState", "SubValues", subValuesRequest).map(ujr0.f231101b);
    }

    /* JADX INFO: renamed from: G */
    public Observable m56115G(GetProfilesRequest getProfilesRequest) {
        return callStream("spotify.profile_esperanto.proto.v1.ProfileService", "SubscribeToProfiles", getProfilesRequest).map(pmr0.f179220c);
    }

    /* JADX INFO: renamed from: H */
    public Single m56116H(EsMediaPrefetch$UpdateFutureRequest esMediaPrefetch$UpdateFutureRequest) {
        return callSingle("spotify.prefetch_esperanto.proto.MediaPrefetch", "UpdateFuture", esMediaPrefetch$UpdateFutureRequest).map(gk40.f80717a1);
    }

    /* JADX INFO: renamed from: I */
    public Single m56117I(EsMediaPrefetch$SegmentProfileSelectionConfig esMediaPrefetch$SegmentProfileSelectionConfig) {
        return callSingle("spotify.prefetch_esperanto.proto.MediaPrefetch", "UpdateSegmentProfileSelectionConfig", esMediaPrefetch$SegmentProfileSelectionConfig).map(j5z.f109157Z);
    }

    /* JADX INFO: renamed from: J */
    public Observable m56118J(Empty empty) {
        return callStream("spotify.connect.esperanto.proto.ConnectVolumeService", "Volume", empty).map(t6x0.f217631X);
    }

    /* JADX INFO: renamed from: K */
    public Single m56119K(Empty empty) {
        return callSingle("spotify.connect.esperanto.proto.ConnectService", "WakeSleepingClusterDevices", empty).map(b5v.f23709Q0);
    }

    /* JADX INFO: renamed from: L */
    public Observable m56120L(Empty empty) {
        return callStream("spotify.connectivity.auth.client_token.esperanto.proto.ClientTokenProvider", "getEncryptedToken", empty).map(kqd1.f125264M0);
    }

    /* JADX INFO: renamed from: M */
    public Single m56121M(Empty empty) {
        return callSingle("spotify.connectivity.auth.client_token.esperanto.proto.ClientTokenProvider", "getToken", empty).map(r101.f194656X);
    }

    /* JADX INFO: renamed from: N */
    public Observable m56122N(Empty empty) {
        return callStream("spotify.connectivity.hosts.esperanto.proto.HostsProvider", "hosts", empty).map(gk40.f80709V0);
    }

    /* JADX INFO: renamed from: O */
    public Observable m56123O(SubStateRequest subStateRequest) {
        return callStream("spotify.connectivity.esperanto.proto.ConnectivityPolicy", "subState", subStateRequest).map(gk40.f80715Z);
    }

    /* JADX INFO: renamed from: a */
    public Single m56124a(PlaybackEsperanto$DuckRequest playbackEsperanto$DuckRequest) {
        return callSingle("spotify.playback_esperanto.proto.PlaybackService", "Duck", playbackEsperanto$DuckRequest).map(cyx.f43384V0);
    }

    /* JADX INFO: renamed from: b */
    public Observable m56125b(Empty empty) {
        return callStream("spotify.settings.esperanto.proto.Settings", "GetState", empty).map(alr0.f16960Y);
    }

    /* JADX INFO: renamed from: c */
    public Single m56126c(Empty empty) {
        return callSingle("spotify.connect.esperanto.proto.ConnectService", "PerformDiscovery", empty).map(oet.f164532Q0);
    }

    /* JADX INFO: renamed from: d */
    public Single m56127d(KaraokePostStatusRequest karaokePostStatusRequest) {
        return callSingle("spotify.karaoke_esperanto.proto.KaraokeService", "PostStatus", karaokePostStatusRequest).map(laz.f131470h);
    }

    /* JADX INFO: renamed from: e */
    public Single m56128e(KaraokePostVocalVolumeRequest karaokePostVocalVolumeRequest) {
        return callSingle("spotify.karaoke_esperanto.proto.KaraokeService", "PostVocalVolume", karaokePostVocalVolumeRequest).map(maz.f141745g);
    }

    /* JADX INFO: renamed from: f */
    public Single m56129f(PutValuesRequest putValuesRequest) {
        return callSingle("spotify.product_state.esperanto.proto.ProductState", "PutValues", putValuesRequest).map(hcj0.f89825i);
    }

    /* JADX INFO: renamed from: g */
    public Single m56130g(PutValuesSyncRequest putValuesSyncRequest) {
        return callSingle("spotify.product_state.esperanto.proto.ProductState", "PutValuesSync", putValuesSyncRequest).map(tjr0.f221002b);
    }

    /* JADX INFO: renamed from: h */
    public Single m56131h(Empty empty) {
        return callSingle("spotify.connect.esperanto.proto.ConnectService", "RefreshCluster", empty).map(r101.f194660Z);
    }

    /* JADX INFO: renamed from: i */
    public Single m56132i(Set set) {
        return callSingle("spotify.on_demand_set_esperanto.proto.OnDemandSetService", "Set", set).map(wej0.f250564e);
    }

    /* JADX INFO: renamed from: j */
    public Single m56133j(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetAllowAudioQualityDowngrade", boolValue).map(blr0.f28260Y);
    }

    /* JADX INFO: renamed from: k */
    public Single m56134k(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetAutomix", boolValue).map(dlr0.f50332Y);
    }

    /* JADX INFO: renamed from: l */
    public Single m56135l(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetCrossfade", boolValue).map(nlr0.f155145X);
    }

    /* JADX INFO: renamed from: m */
    public Single m56136m(Int32Value int32Value) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetCrossfadeTimeSeconds", int32Value).map(olr0.f166893Y);
    }

    /* JADX INFO: renamed from: n */
    public Single m56137n(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetCrossfeed", boolValue).map(pmr0.f179214Y);
    }

    /* JADX INFO: renamed from: o */
    public Single m56138o(Int32Value int32Value) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetCrossfeedIntensity", int32Value).map(ykq0.f273804Z);
    }

    /* JADX INFO: renamed from: p */
    public Single m56139p(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetDownloadOver3G", boolValue).map(zkq0.f283821Z);
    }

    /* JADX INFO: renamed from: q */
    public Single m56140q(Int32Value int32Value) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetDownloadPreferredResourceType", int32Value).map(alq0.f16933Z);
    }

    /* JADX INFO: renamed from: r */
    public Single m56141r(Int32Value int32Value) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetDownloadQuality", int32Value).map(mmq0.f145215Z);
    }

    /* JADX INFO: renamed from: s */
    public Single m56142s(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetDownmix", boolValue).map(onq0.f167331Y);
    }

    /* JADX INFO: renamed from: t */
    public Single m56143t(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetGapless", boolValue).map(pnq0.f179498Z);
    }

    /* JADX INFO: renamed from: u */
    public Single m56144u(Int32Value int32Value) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetLoudnessEnvironment", int32Value).map(snq0.f211004Z);
    }

    /* JADX INFO: renamed from: v */
    public Single m56145v(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetNormalize", boolValue).map(tnq0.f222038Z);
    }

    /* JADX INFO: renamed from: w */
    public Single m56146w(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetOfflineMode", boolValue).map(unq0.f232234Z);
    }

    /* JADX INFO: renamed from: x */
    public Single m56147x(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetOtfn", boolValue).map(wej0.f250560Z);
    }

    /* JADX INFO: renamed from: y */
    public Single m56148y(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetParrot", boolValue).map(vnq0.f243212Z);
    }

    /* JADX INFO: renamed from: z */
    public Single m56149z(BoolValue boolValue) {
        return callSingle("spotify.settings.esperanto.proto.Settings", "SetPlayExplicitContext", boolValue).map(wnq0.f253251Z);
    }
}
