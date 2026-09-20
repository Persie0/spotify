package p204p;

import com.spotify.concertcampaignview.p047v1.CampaignActionRequest;
import com.spotify.concertcampaignview.p047v1.CampaignActionResponse;
import com.spotify.concertcampaignview.p047v1.CampaignCard;
import com.spotify.concertcampaignview.p047v1.CampaignCardRequest;
import com.spotify.concertcampaignview.p047v1.CampaignRoutingCardRequest;
import com.spotify.concertcampaignview.p047v1.ConcertCampaignPage;
import com.spotify.concertcampaignview.p047v1.ConcertCampaignPageRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m24212d2 = {"Lp/rzh;", "", "Lcom/spotify/concertcampaignview/v1/ConcertCampaignPageRequest;", "request", "Lcom/spotify/concertcampaignview/v1/ConcertCampaignPage;", "e", "(Lcom/spotify/concertcampaignview/v1/ConcertCampaignPageRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/concertcampaignview/v1/CampaignCardRequest;", "Lcom/spotify/concertcampaignview/v1/CampaignCard;", "c", "(Lcom/spotify/concertcampaignview/v1/CampaignCardRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/concertcampaignview/v1/CampaignRoutingCardRequest;", "b", "(Lcom/spotify/concertcampaignview/v1/CampaignRoutingCardRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/concertcampaignview/v1/CampaignActionRequest;", "Lcom/spotify/concertcampaignview/v1/CampaignActionResponse;", "d", "(Lcom/spotify/concertcampaignview/v1/CampaignActionRequest;Lp/fbk;)Ljava/lang/Object;", "a", "src_main_java_com_spotify_liveevents_concertcampaignpagedata-concertcampaignpagedata"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface rzh {
    @j3m0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignUpdateService/CantAttend")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m76813a(@h4a CampaignActionRequest campaignActionRequest, fbk<? super CampaignActionResponse> fbkVar);

    @j3m0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignRoutingCardService/GetCampaignRoutingCard")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m76814b(@h4a CampaignRoutingCardRequest campaignRoutingCardRequest, fbk<? super CampaignCard> fbkVar);

    @j3m0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignCardService/GetCampaignCard")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m76815c(@h4a CampaignCardRequest campaignCardRequest, fbk<? super CampaignCard> fbkVar);

    @j3m0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignUpdateService/JoinWaitlist")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m76816d(@h4a CampaignActionRequest campaignActionRequest, fbk<? super CampaignActionResponse> fbkVar);

    @j3m0("concert-campaign-view/spotify.concertcampaignview.v1.ConcertCampaignPageService/GetConcertCampaignPage")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: e */
    Object m76817e(@h4a ConcertCampaignPageRequest concertCampaignPageRequest, fbk<? super ConcertCampaignPage> fbkVar);
}
