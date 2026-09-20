package p204p;

import com.spotify.referrals.service.p143v1.GetAccountSettingsReferralsRowRequest;
import com.spotify.referrals.service.p143v1.GetAccountSettingsReferralsRowResponse;
import com.spotify.referrals.service.p143v1.GetContextualEntrypointCopyForJamRequest;
import com.spotify.referrals.service.p143v1.GetContextualEntrypointCopyForJamResponse;
import com.spotify.referrals.service.p143v1.StoreEngagementRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/nmv0;", "", "Lcom/spotify/referrals/service/v1/GetAccountSettingsReferralsRowRequest;", "request", "Lcom/spotify/referrals/service/v1/GetAccountSettingsReferralsRowResponse;", "a", "(Lcom/spotify/referrals/service/v1/GetAccountSettingsReferralsRowRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/referrals/service/v1/StoreEngagementRequest;", "Lp/w2a1;", "c", "(Lcom/spotify/referrals/service/v1/StoreEngagementRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/referrals/service/v1/GetContextualEntrypointCopyForJamRequest;", "Lcom/spotify/referrals/service/v1/GetContextualEntrypointCopyForJamResponse;", "b", "(Lcom/spotify/referrals/service/v1/GetContextualEntrypointCopyForJamRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_referrals_service-service"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface nmv0 {
    @j3m0("/referrals-service/spotify.referrals.v1.ReferralsConfigurationGrpc/GetAccountSettingsReferralsRow")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m65160a(@h4a GetAccountSettingsReferralsRowRequest getAccountSettingsReferralsRowRequest, fbk<? super GetAccountSettingsReferralsRowResponse> fbkVar);

    @j3m0("/referrals-service/spotify.referrals.v1.ReferralsConfigurationGrpc/GetContextualEntrypointCopyForJam")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m65161b(@h4a GetContextualEntrypointCopyForJamRequest getContextualEntrypointCopyForJamRequest, fbk<? super GetContextualEntrypointCopyForJamResponse> fbkVar);

    @j3m0("/referrals-service/spotify.referrals.v1.ReferralsEntrypointEngagementGrpc/StoreEngagement")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m65162c(@h4a StoreEngagementRequest storeEngagementRequest, fbk<? super w2a1> fbkVar);
}
