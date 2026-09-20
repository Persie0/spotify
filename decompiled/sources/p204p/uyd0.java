package p204p;

import com.spotify.speechlessupload.proto.p157v1.GetChatMediaUploadStatusRequest;
import com.spotify.speechlessupload.proto.p157v1.GetChatMediaUploadStatusResponse;
import com.spotify.speechlessupload.proto.p157v1.InitiateUploadRequest;
import com.spotify.speechlessupload.proto.p157v1.InitiateUploadResponse;
import com.spotify.speechlessupload.proto.p157v1.SubmitChatMediaUploadRequest;
import com.spotify.speechlessupload.proto.p157v1.SubmitChatMediaUploadResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/uyd0;", "", "Lcom/spotify/speechlessupload/proto/v1/InitiateUploadRequest;", "request", "Lcom/spotify/speechlessupload/proto/v1/InitiateUploadResponse;", "c", "(Lcom/spotify/speechlessupload/proto/v1/InitiateUploadRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/speechlessupload/proto/v1/SubmitChatMediaUploadRequest;", "Lcom/spotify/speechlessupload/proto/v1/SubmitChatMediaUploadResponse;", "a", "(Lcom/spotify/speechlessupload/proto/v1/SubmitChatMediaUploadRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/speechlessupload/proto/v1/GetChatMediaUploadStatusRequest;", "Lcom/spotify/speechlessupload/proto/v1/GetChatMediaUploadStatusResponse;", "b", "(Lcom/spotify/speechlessupload/proto/v1/GetChatMediaUploadStatusRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_campfire_mediaupload_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface uyd0 {
    @j3m0("speechless-upload/v1/upload/submitChatMediaUpload")
    /* JADX INFO: renamed from: a */
    Object m84194a(@h4a SubmitChatMediaUploadRequest submitChatMediaUploadRequest, fbk<? super SubmitChatMediaUploadResponse> fbkVar);

    @j3m0("speechless-upload/v1/upload/getChatMediaUploadStatus")
    /* JADX INFO: renamed from: b */
    Object m84195b(@h4a GetChatMediaUploadStatusRequest getChatMediaUploadStatusRequest, fbk<? super GetChatMediaUploadStatusResponse> fbkVar);

    @j3m0("speechless-upload/v1/upload/initiateUpload")
    /* JADX INFO: renamed from: c */
    Object m84196c(@h4a InitiateUploadRequest initiateUploadRequest, fbk<? super InitiateUploadResponse> fbkVar);
}
