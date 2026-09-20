package p204p;

import com.spotify.eventsender.gabo.PublishEventsRequest;
import com.spotify.eventsender.gabo.PublishEventsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lp/gl00;", "", "Lcom/spotify/eventsender/gabo/PublishEventsRequest;", "event", "Lp/x8b;", "Lcom/spotify/eventsender/gabo/PublishEventsResponse;", "b", "(Lcom/spotify/eventsender/gabo/PublishEventsRequest;)Lp/x8b;", "a", "src_main_java_com_spotify_eventsender_eventsender-eventsender"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface gl00 {
    @j3m0("gabo-receiver-service/public/v3/events")
    @rn20({"No-Webgate-Authentication: true", obr.f163698c})
    /* JADX INFO: renamed from: a */
    x8b<PublishEventsResponse> m45084a(@h4a PublishEventsRequest event);

    @j3m0("gabo-receiver-service/v3/events")
    @rn20({obr.f163698c})
    /* JADX INFO: renamed from: b */
    x8b<PublishEventsResponse> m45085b(@h4a PublishEventsRequest event);
}
