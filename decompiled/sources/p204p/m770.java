package p204p;

import com.spotify.kidsview.p092v2.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.p092v2.proto.SetManagedAccountSettingsRequest;
import com.spotify.kidsview.p092v2.proto.SetManagedAccountSettingsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/m770;", "", "", "managedAccountId", "type", "Lcom/spotify/kidsview/v2/proto/GetManagedAccountDetailsViewResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidsview/v2/proto/SetManagedAccountSettingsRequest;", "request", "Lcom/spotify/kidsview/v2/proto/SetManagedAccountSettingsResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/kidsview/v2/proto/SetManagedAccountSettingsRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_genalpha_datasourceimpl-datasourceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface m770 {
    @zk00("kids-view/v2/managed-account-details/{type}/{id}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m61055a(@ubn0("id") String str, @ubn0("type") String str2, fbk<? super GetManagedAccountDetailsViewResponse> fbkVar);

    @rn20({"Accept: application/x-protobuf", obr.f163698c})
    @l3m0("kids-view/v2/managed-account-settings/{type}/{id}")
    /* JADX INFO: renamed from: b */
    Object m61056b(@ubn0("id") String str, @ubn0("type") String str2, @h4a SetManagedAccountSettingsRequest setManagedAccountSettingsRequest, fbk<? super SetManagedAccountSettingsResponse> fbkVar);
}
