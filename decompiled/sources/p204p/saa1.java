package p204p;

import com.spotify.personalizedepisodes.contentservice.p124v1.CreateOrUpdateScheduleRequest;
import com.spotify.personalizedepisodes.contentservice.p124v1.CreateOrUpdateScheduleResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.GetEntityDetailsResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.TriggerGenerationRequest;
import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lp/saa1;", "", "Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdateScheduleRequest;", "request", "Lp/o2x0;", "Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdateScheduleResponse;", "b", "(Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdateScheduleRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/TriggerGenerationRequest;", "c", "(Lcom/spotify/personalizedepisodes/contentservice/v1/TriggerGenerationRequest;Lp/fbk;)Ljava/lang/Object;", "", "entityUri", "Lcom/spotify/personalizedepisodes/contentservice/v1/GetEntityDetailsResponse;", "a", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_bluejay_data_impl-generation_data_module"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface saa1 {
    @zk00("personalized-episodes/v1/entity/{entity_uri}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m77617a(@ubn0(encoded = true, value = ContextTrack.Metadata.KEY_ENTITY_URI) String str, fbk<? super o2x0<GetEntityDetailsResponse>> fbkVar);

    @j3m0("personalized-episodes/v1/schedule")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m77618b(@h4a CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, fbk<? super o2x0<CreateOrUpdateScheduleResponse>> fbkVar);

    @j3m0("personalized-episodes/v1/content/trigger-generation")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m77619c(@h4a TriggerGenerationRequest triggerGenerationRequest, fbk<? super o2x0<Object>> fbkVar);
}
