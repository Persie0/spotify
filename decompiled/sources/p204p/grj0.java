package p204p;

import com.spotify.spotifyuserprofile.p159v0.CreateNoteRequest;
import com.spotify.spotifyuserprofile.p159v0.CreateNoteResponse;
import com.spotify.spotifyuserprofile.p159v0.DeleteNoteResponse;
import com.spotify.spotifyuserprofile.p159v0.EditNoteResponse;
import com.spotify.spotifyuserprofile.p159v0.UpdateNoteRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lp/grj0;", "", "Lcom/spotify/spotifyuserprofile/v0/CreateNoteRequest;", "request", "Lcom/spotify/spotifyuserprofile/v0/CreateNoteResponse;", "b", "(Lcom/spotify/spotifyuserprofile/v0/CreateNoteRequest;Lp/fbk;)Ljava/lang/Object;", "", "noteId", "Lcom/spotify/spotifyuserprofile/v0/UpdateNoteRequest;", "Lcom/spotify/spotifyuserprofile/v0/EditNoteResponse;", "a", "(Ljava/lang/String;Lcom/spotify/spotifyuserprofile/v0/UpdateNoteRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/spotifyuserprofile/v0/DeleteNoteResponse;", "c", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_tasteprofile_tasteprofilepage-tasteprofilepage"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface grj0 {
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    @l3m0("spotify-user-profile-service/v1/notes/{note_id}")
    /* JADX INFO: renamed from: a */
    Object m45507a(@ubn0("note_id") String str, @h4a UpdateNoteRequest updateNoteRequest, fbk<? super EditNoteResponse> fbkVar);

    @j3m0("spotify-user-profile-service/v1/notes")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m45508b(@h4a CreateNoteRequest createNoteRequest, fbk<? super CreateNoteResponse> fbkVar);

    @pem("spotify-user-profile-service/v1/notes/{note_id}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m45509c(@ubn0("note_id") String str, fbk<? super DeleteNoteResponse> fbkVar);
}
