package p204p;

import com.spotify.kidsview.p091v1.proto.DeleteManagedAccountResponse;
import com.spotify.kidsview.p091v1.proto.GetChildrenResponse;
import com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponse;
import com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponse;
import com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequest;
import com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponse;
import com.spotify.kidsview.p092v2.proto.GetParentOrGuardianViewResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001b\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m24212d2 = {"Lp/l770;", "", "Lcom/spotify/kidsview/v2/proto/GetParentOrGuardianViewResponse;", "e", "(Lp/fbk;)Ljava/lang/Object;", "Lp/w2a1;", "h", "", "includeTeenAccounts", "Lcom/spotify/kidsview/v1/proto/GetManagedAccountsViewResponse;", "f", "(ZLp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidsview/v1/proto/GetChildrenResponse;", "a", "", "childId", "Lcom/spotify/kidsview/v1/proto/GetManagedAccountDetailsViewResponse;", "g", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidsview/v1/proto/TransitionToManagedAccountRequest;", "request", "Lcom/spotify/kidsview/v1/proto/TransitionToManagedAccountResponse;", "c", "(Lcom/spotify/kidsview/v1/proto/TransitionToManagedAccountRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidsview/v1/proto/GetDeleteManagedAccountViewResponse;", "b", "Lcom/spotify/kidsview/v1/proto/DeleteManagedAccountResponse;", "d", "src_main_java_com_spotify_genalpha_datasourceimpl-datasourceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface l770 {
    @zk00("kids-view/v1/children")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m58399a(fbk<? super GetChildrenResponse> fbkVar);

    @zk00("kids-view/v1/delete-managed-account-view/{childId}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m58400b(@ubn0("childId") String str, fbk<? super GetDeleteManagedAccountViewResponse> fbkVar);

    @j3m0("kids-view/v1/transition-to-managed-account")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m58401c(@h4a TransitionToManagedAccountRequest transitionToManagedAccountRequest, fbk<? super TransitionToManagedAccountResponse> fbkVar);

    @pem("kids-view/v1/managed-account/{childId}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m58402d(@ubn0("childId") String str, fbk<? super DeleteManagedAccountResponse> fbkVar);

    @zk00("kids-view/v2/parent-or-guardian")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: e */
    Object m58403e(fbk<? super GetParentOrGuardianViewResponse> fbkVar);

    @zk00("kids-view/v1/managed-accounts-view")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: f */
    Object m58404f(@hit0("include_teen_accounts") boolean z, fbk<? super GetManagedAccountsViewResponse> fbkVar);

    @zk00("kids-view/v1/managed-account-details-view/{childId}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: g */
    Object m58405g(@ubn0("childId") String str, fbk<? super GetManagedAccountDetailsViewResponse> fbkVar);

    @pem("teen-link/parent")
    /* JADX INFO: renamed from: h */
    Object m58406h(fbk<? super w2a1> fbkVar);
}
