package p204p;

import com.spotify.personalizedepisodes.contentservice.p124v1.GetPresetResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.ListPresetsResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.PersonalizePresetResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/h3r0;", "", "Lp/o2x0;", "Lcom/spotify/personalizedepisodes/contentservice/v1/ListPresetsResponse;", "c", "(Lp/fbk;)Ljava/lang/Object;", "", "presetId", "Lcom/spotify/personalizedepisodes/contentservice/v1/GetPresetResponse;", "b", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/PersonalizePresetResponse;", "a", "src_main_java_com_spotify_bluejay_data_impl-presets_data_module"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface h3r0 {
    @j3m0("personalized-episodes/v1/content/presets/{preset_id}/personalize")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m46598a(@ubn0("preset_id") String str, fbk<? super o2x0<PersonalizePresetResponse>> fbkVar);

    @zk00("personalized-episodes/v1/content/presets/{preset_id}")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m46599b(@ubn0("preset_id") String str, fbk<? super o2x0<GetPresetResponse>> fbkVar);

    @zk00("personalized-episodes/v1/content/presets")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m46600c(fbk<? super o2x0<ListPresetsResponse>> fbkVar);
}
