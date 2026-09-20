package p204p;

import com.spotify.kidsaccount.api.p084v3.proto.AddChildRequest;
import com.spotify.kidsaccount.api.p084v3.proto.AddChildResponse;
import com.spotify.kidsaccount.api.p084v3.proto.GetChildDateOfBirthRangeRequest;
import com.spotify.kidsaccount.api.p084v3.proto.GetChildDateOfBirthRangeResponse;
import com.spotify.kidsaccount.api.p084v3.proto.GetCreateChildConfigRequest;
import com.spotify.kidsaccount.api.p084v3.proto.GetCreateChildConfigResponse;
import com.spotify.kidsaccount.api.p084v3.proto.GetTransitionChildConfigRequest;
import com.spotify.kidsaccount.api.p084v3.proto.GetTransitionChildConfigResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m24212d2 = {"Lp/m470;", "", "Lcom/spotify/kidsaccount/api/v3/proto/AddChildRequest;", "request", "Lcom/spotify/kidsaccount/api/v3/proto/AddChildResponse;", "b", "(Lcom/spotify/kidsaccount/api/v3/proto/AddChildRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidsaccount/api/v3/proto/GetCreateChildConfigRequest;", "Lcom/spotify/kidsaccount/api/v3/proto/GetCreateChildConfigResponse;", "c", "(Lcom/spotify/kidsaccount/api/v3/proto/GetCreateChildConfigRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidsaccount/api/v3/proto/GetChildDateOfBirthRangeRequest;", "Lcom/spotify/kidsaccount/api/v3/proto/GetChildDateOfBirthRangeResponse;", "a", "(Lcom/spotify/kidsaccount/api/v3/proto/GetChildDateOfBirthRangeRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidsaccount/api/v3/proto/GetTransitionChildConfigRequest;", "Lcom/spotify/kidsaccount/api/v3/proto/GetTransitionChildConfigResponse;", "d", "(Lcom/spotify/kidsaccount/api/v3/proto/GetTransitionChildConfigRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_genalpha_datasourceimpl-datasourceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface m470 {
    @j3m0("/spotify.kidsaccount.api.v3.KidsAccountService/GetChildDateOfBirthRange")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m60790a(@h4a GetChildDateOfBirthRangeRequest getChildDateOfBirthRangeRequest, fbk<? super GetChildDateOfBirthRangeResponse> fbkVar);

    @j3m0("/spotify.kidsaccount.api.v3.KidsAccountService/AddChild")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m60791b(@h4a AddChildRequest addChildRequest, fbk<? super AddChildResponse> fbkVar);

    @j3m0("/spotify.kidsaccount.api.v3.KidsAccountService/GetCreateChildConfig")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m60792c(@h4a GetCreateChildConfigRequest getCreateChildConfigRequest, fbk<? super GetCreateChildConfigResponse> fbkVar);

    @j3m0("/spotify.kidsaccount.api.v3.KidsAccountService/GetTransitionChildConfig")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m60793d(@h4a GetTransitionChildConfigRequest getTransitionChildConfigRequest, fbk<? super GetTransitionChildConfigResponse> fbkVar);
}
