package p204p;

import com.spotify.usergeopoints.p176v1.UpdateLocationRequest;
import com.spotify.usergeopoints.p176v1.UpdateLocationResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lp/iqa1;", "", "Lcom/spotify/usergeopoints/v1/UpdateLocationRequest;", "body", "Lcom/spotify/usergeopoints/v1/UpdateLocationResponse;", "a", "(Lcom/spotify/usergeopoints/v1/UpdateLocationRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_devicelocation_configurationimpl-configurationimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface iqa1 {
    @j3m0("user-geo-points/v1/location")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m51353a(@h4a UpdateLocationRequest updateLocationRequest, fbk<? super UpdateLocationResponse> fbkVar);
}
