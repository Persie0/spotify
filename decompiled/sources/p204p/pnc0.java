package p204p;

import com.spotify.party.mobile.p121v2.GetListeningPartyMarketingCardsRequest;
import com.spotify.party.mobile.p121v2.GetListeningPartyMarketingCardsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lp/pnc0;", "", "Lcom/spotify/party/mobile/v2/GetListeningPartyMarketingCardsRequest;", "request", "Lcom/spotify/party/mobile/v2/GetListeningPartyMarketingCardsResponse;", "a", "(Lcom/spotify/party/mobile/v2/GetListeningPartyMarketingCardsRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_liveroom_listeningpartycard-listeningpartycard"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface pnc0 {
    @j3m0("spotify.party.mobile.v2.PartyMobileService/GetListeningPartyMarketingCards")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m70440a(@h4a GetListeningPartyMarketingCardsRequest getListeningPartyMarketingCardsRequest, fbk<? super GetListeningPartyMarketingCardsResponse> fbkVar);
}
