package p204p;

import com.spotify.deviceproxy.navigation.p059v1.RegisterSupportedNavigationCommandsRequest;
import com.spotify.deviceproxy.navigation.p059v1.RegisterSupportedNavigationCommandsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/obr;", "", "Lcom/spotify/deviceproxy/navigation/v1/RegisterSupportedNavigationCommandsRequest;", "request", "Lcom/spotify/deviceproxy/navigation/v1/RegisterSupportedNavigationCommandsResponse;", "a", "(Lcom/spotify/deviceproxy/navigation/v1/RegisterSupportedNavigationCommandsRequest;Lp/fbk;)Ljava/lang/Object;", "p/nbr", "src_main_java_com_spotify_deviceproxy_supportednavigationcommandregistrarimpl-supportednavigationcommandregistrarimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface obr {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ nbr f163696a = nbr.f152338a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final String f163697b = "device-proxy/spotify/v1/navigation/supported-commands";

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final String f163698c = "Content-Type: application/x-protobuf";

    @rn20({f163698c})
    @l3m0(f163697b)
    /* JADX INFO: renamed from: a */
    Object m66666a(@h4a RegisterSupportedNavigationCommandsRequest registerSupportedNavigationCommandsRequest, fbk<? super RegisterSupportedNavigationCommandsResponse> fbkVar);
}
