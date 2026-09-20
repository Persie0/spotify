package p204p;

import com.spotify.campfire.contribution.proto.p037v1.BatchCreateContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchCreateContributionsResponse;
import com.spotify.campfire.contribution.proto.p037v1.BatchDeleteContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchDeleteContributionsResponse;
import com.spotify.campfire.contribution.proto.p037v1.BatchGetContributionCapabilitiesRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchGetContributionCapabilitiesResponse;
import com.spotify.campfire.contribution.proto.p037v1.BatchGetContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchGetContributionsResponse;
import com.spotify.campfire.contribution.proto.p037v1.BatchUpdateContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchUpdateContributionsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m24212d2 = {"Lp/vdk;", "", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionsRequest;", "request", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionsResponse;", "b", "(Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchCreateContributionsRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchCreateContributionsResponse;", "a", "(Lcom/spotify/campfire/contribution/proto/v1/BatchCreateContributionsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchUpdateContributionsRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchUpdateContributionsResponse;", "d", "(Lcom/spotify/campfire/contribution/proto/v1/BatchUpdateContributionsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchDeleteContributionsRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchDeleteContributionsResponse;", "e", "(Lcom/spotify/campfire/contribution/proto/v1/BatchDeleteContributionsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionCapabilitiesRequest;", "Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionCapabilitiesResponse;", "c", "(Lcom/spotify/campfire/contribution/proto/v1/BatchGetContributionCapabilitiesRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface vdk {
    @j3m0("contribution/v1/contributions/BatchCreateContributions")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m85230a(@h4a BatchCreateContributionsRequest batchCreateContributionsRequest, fbk<? super BatchCreateContributionsResponse> fbkVar);

    @j3m0("contribution/v1/contributions/BatchGetContributions")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m85231b(@h4a BatchGetContributionsRequest batchGetContributionsRequest, fbk<? super BatchGetContributionsResponse> fbkVar);

    @j3m0("contribution/v1/contributions/BatchGetContributionCapabilities")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m85232c(@h4a BatchGetContributionCapabilitiesRequest batchGetContributionCapabilitiesRequest, fbk<? super BatchGetContributionCapabilitiesResponse> fbkVar);

    @j3m0("contribution/v1/contributions/BatchUpdateContributions")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m85233d(@h4a BatchUpdateContributionsRequest batchUpdateContributionsRequest, fbk<? super BatchUpdateContributionsResponse> fbkVar);

    @j3m0("contribution/v1/contributions/BatchDeleteContributions")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: e */
    Object m85234e(@h4a BatchDeleteContributionsRequest batchDeleteContributionsRequest, fbk<? super BatchDeleteContributionsResponse> fbkVar);
}
