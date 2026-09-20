package p204p;

import com.spotify.memberinvite.model.p109v1.proto.PayloadResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lp/xbe0;", "", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/memberinvite/model/v1/proto/PayloadResponse;", "a", "()Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_premiumaccountmanagement_memberinvite-memberinvite"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface xbe0 {
    @zk00("pam-view-service/v1/InviteMembersView")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<PayloadResponse> m90317a();
}
