package p204p;

import com.spotify.voting.proto.p180v1.GetVotingRootRequest;
import com.spotify.voting.proto.p180v1.GetVotingRootResponse;
import com.spotify.voting.proto.p180v1.PostVotePageResponse;
import com.spotify.voting.proto.p180v1.PostVoteSharePageRequest;
import com.spotify.voting.proto.p180v1.SendVotesRequest;
import com.spotify.voting.proto.p180v1.SendVotesResponse;
import com.spotify.voting.proto.p181v2.SendVotesRequestV2;
import com.spotify.voting.proto.p181v2.VotingSharePage;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0013\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m24212d2 = {"Lp/u3d1;", "Lp/j2d1;", "Lcom/spotify/voting/proto/v1/GetVotingRootRequest;", "getVotingRootRequest", "Lcom/spotify/voting/proto/v1/GetVotingRootResponse;", "a", "(Lcom/spotify/voting/proto/v1/GetVotingRootRequest;Lp/fbk;)Ljava/lang/Object;", "", "rootUri", "e", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/voting/proto/v1/SendVotesRequest;", "sendVotesRequest", "Lcom/spotify/voting/proto/v1/SendVotesResponse;", "c", "(Lcom/spotify/voting/proto/v1/SendVotesRequest;Lp/fbk;)Ljava/lang/Object;", "contestId", "awardId", "Lcom/spotify/voting/proto/v2/SendVotesRequestV2;", "request", "Lcom/spotify/voting/proto/v2/VotingSharePage;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voting/proto/v2/SendVotesRequestV2;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/voting/proto/v1/PostVoteSharePageRequest;", "Lcom/spotify/voting/proto/v1/PostVotePageResponse;", "b", "(Lcom/spotify/voting/proto/v1/PostVoteSharePageRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_voting_service-service"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface u3d1 extends j2d1 {
    @Override // p204p.j2d1
    @j3m0("voting-service/spotify.voting.v1.VotingHandler/GetVotingRoot")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object mo52213a(@h4a GetVotingRootRequest getVotingRootRequest, fbk<? super GetVotingRootResponse> fbkVar);

    @Override // p204p.j2d1
    @j3m0("voting-service/spotify.voting.v1.VotingHandler/GetSharePage")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object mo52214b(@h4a PostVoteSharePageRequest postVoteSharePageRequest, fbk<? super PostVotePageResponse> fbkVar);

    @Override // p204p.j2d1
    @j3m0("voting-service/spotify.voting.v1.VotingHandler/SendVotes")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object mo52215c(@h4a SendVotesRequest sendVotesRequest, fbk<? super SendVotesResponse> fbkVar);

    @Override // p204p.j2d1
    @j3m0("voting-service/voting/v2/contests/{contest_id}/awards/{award_id}/votes")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object mo52216d(@ubn0("contest_id") String str, @ubn0("award_id") String str2, @h4a SendVotesRequestV2 sendVotesRequestV2, fbk<? super VotingSharePage> fbkVar);

    @Override // p204p.j2d1
    @zk00("voting-service/voting/v2/root/{root_uri}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: e */
    Object mo52217e(@ubn0("root_uri") String str, fbk<? super GetVotingRootResponse> fbkVar);
}
