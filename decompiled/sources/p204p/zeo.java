package p204p;

import com.spotify.graduation.p073v1.GetDownloadsRequest;
import com.spotify.graduation.p073v1.GetDownloadsResponse;
import com.spotify.graduation.p073v1.GraduationRequest;
import com.spotify.graduation.p073v1.GraduationResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/zeo;", "", "Lcom/spotify/graduation/v1/GetDownloadsRequest;", "request", "Lp/o2x0;", "Lcom/spotify/graduation/v1/GetDownloadsResponse;", "a", "(Lcom/spotify/graduation/v1/GetDownloadsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/graduation/v1/GraduationRequest;", "Lcom/spotify/graduation/v1/GraduationResponse;", "b", "(Lcom/spotify/graduation/v1/GraduationRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_genalphagraduation_datadownload_page-page"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface zeo {
    @j3m0("/spotify.graduation.v1.DownloadService/GetDownloads")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m95987a(@h4a GetDownloadsRequest getDownloadsRequest, fbk<? super o2x0<GetDownloadsResponse>> fbkVar);

    @j3m0("/spotify.graduation.v1.DownloadService/SubmitRequest")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m95988b(@h4a GraduationRequest graduationRequest, fbk<? super o2x0<GraduationResponse>> fbkVar);
}
