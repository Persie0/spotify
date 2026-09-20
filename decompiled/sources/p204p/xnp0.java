package p204p;

import com.spotify.playlist.proto.ClaimPermissionGrantResponse;
import com.spotify.playlist.proto.Permission;
import com.spotify.playlist.proto.PermissionGrant;
import com.spotify.playlist.proto.PermissionGrantDescription;
import com.spotify.playlist.proto.PermissionGrantOptions;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\fJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\fJ.\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m24212d2 = {"Lp/xnp0;", "", "", "playlistId", "Lcom/spotify/playlist/proto/PermissionGrantOptions;", "grantOptions", "Lcom/spotify/playlist/proto/PermissionGrant;", "d", "(Ljava/lang/String;Lcom/spotify/playlist/proto/PermissionGrantOptions;Lp/fbk;)Ljava/lang/Object;", "token", "Lcom/spotify/playlist/proto/ClaimPermissionGrantResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/playlist/proto/PermissionGrantDescription;", "b", "username", "Lcom/spotify/playlist/proto/Permission;", "e", "permission", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/playlist/proto/Permission;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_listplatform_endpointsimpl-endpointsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface xnp0 {
    @j3m0("playlist-permission/v1/playlist/{playlist-id}/permission/member/user/{username}")
    /* JADX INFO: renamed from: a */
    Object m91508a(@ubn0("playlist-id") String str, @ubn0("username") String str2, @h4a Permission permission, fbk<Object> fbkVar);

    @zk00("playlist-permission/v1/playlist/{playlist-id}/permission-grant/token/{token}/describe")
    /* JADX INFO: renamed from: b */
    Object m91509b(@ubn0("playlist-id") String str, @ubn0("token") String str2, fbk<? super PermissionGrantDescription> fbkVar);

    @j3m0("playlist-permission/v1/playlist/{playlist-id}/permission-grant/token/{token}/claim")
    /* JADX INFO: renamed from: c */
    Object m91510c(@ubn0("playlist-id") String str, @ubn0("token") String str2, fbk<? super ClaimPermissionGrantResponse> fbkVar);

    @j3m0("playlist-permission/v1/playlist/{playlist-id}/permission-grant")
    /* JADX INFO: renamed from: d */
    Object m91511d(@ubn0("playlist-id") String str, @h4a PermissionGrantOptions permissionGrantOptions, fbk<? super PermissionGrant> fbkVar);

    @zk00("playlist-permission/v1/playlist/{playlist-id}/permission/member/user/{username}")
    /* JADX INFO: renamed from: e */
    Object m91512e(@ubn0("playlist-id") String str, @ubn0("username") String str2, fbk<? super Permission> fbkVar);
}
