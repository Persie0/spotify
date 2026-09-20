package p204p;

import com.spotify.liveroom.listeningparty.proto.ObservePartyRequest;
import com.spotify.liveroom.listeningparty.proto.ObservePartyResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/th90;", "", "Lcom/spotify/liveroom/listeningparty/proto/ObservePartyRequest;", "observeRequest", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/liveroom/listeningparty/proto/ObservePartyResponse;", "a", "(Lcom/spotify/liveroom/listeningparty/proto/ObservePartyRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_liveroom_listeningparty-listeningparty"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface th90 {
    @j3m0("party-orchestra/spotify.party.orchestra.v1.PartyService/ObserveParty")
    @rn20({"Accept: application/x-protobuf", obr.f163698c})
    /* JADX INFO: renamed from: a */
    Single<ObservePartyResponse> m80831a(@h4a ObservePartyRequest observeRequest);
}
