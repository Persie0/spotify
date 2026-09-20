package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/ro71;", "", "", "entityUri", "", "startTimeMs", "endTimeMs", "Lp/o2x0;", "Lp/p3x0;", "a", "(Ljava/lang/String;JLjava/lang/Long;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_previewcard_element_transcripts_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ro71 {
    @zk00("timesynced-text-distribution/v1/get-timesynced-text/{entityUri}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m76019a(@ubn0(encoded = true, value = "entityUri") String str, @hit0("start_time_ms") long j, @hit0("end_time_ms") Long l, fbk<? super o2x0<p3x0>> fbkVar);
}
