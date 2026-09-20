package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bá\u0080\u0001\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lp/nne;", "", "", "episodeUri", "", "startTimeMs", "endTimeMs", "Lp/rne;", "a", "(Ljava/lang/String;JJLp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_share_formats_common_video_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface nne {
    @zk00("/share-restrictions-proxy/v1/restrictions/episode-clips/{episode_uri}/check-share-eligibility")
    /* JADX INFO: renamed from: a */
    Object m65205a(@ubn0("episode_uri") String str, @hit0("start_ms") long j, @hit0("end_ms") long j2, fbk<? super rne> fbkVar);
}
