package p204p;

import com.spotify.personalizedepisodes.contentservice.p124v1.GetAttachmentStatusResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.UploadAttachmentRequest;
import com.spotify.personalizedepisodes.contentservice.p124v1.UploadAttachmentResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m24212d2 = {"Lp/up6;", "", "Lcom/spotify/personalizedepisodes/contentservice/v1/UploadAttachmentRequest;", "request", "Lp/o2x0;", "Lcom/spotify/personalizedepisodes/contentservice/v1/UploadAttachmentResponse;", "c", "(Lcom/spotify/personalizedepisodes/contentservice/v1/UploadAttachmentRequest;Lp/fbk;)Ljava/lang/Object;", "", "attachmentId", "a", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/GetAttachmentStatusResponse;", "b", "src_main_java_com_spotify_bluejay_data_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface up6 {
    @pem("personalized-episodes/v1/content/attachments/{attachment_id}")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m83648a(@ubn0("attachment_id") String str, fbk<? super o2x0<Object>> fbkVar);

    @zk00("personalized-episodes/v1/content/attachments/{attachment_id}/status")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m83649b(@ubn0("attachment_id") String str, fbk<? super o2x0<GetAttachmentStatusResponse>> fbkVar);

    @j3m0("personalized-episodes/v1/content/attachments")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m83650c(@h4a UploadAttachmentRequest uploadAttachmentRequest, fbk<? super o2x0<UploadAttachmentResponse>> fbkVar);
}
