package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j3v0 {

    /* JADX INFO: renamed from: a */
    public static final hk60 f108485a;

    /* JADX INFO: renamed from: b */
    public static final hk60 f108486b;

    /* JADX INFO: renamed from: c */
    public static final hk60 f108487c;

    /* JADX INFO: renamed from: d */
    public static final hk60 f108488d;

    /* JADX INFO: renamed from: e */
    public static final hk60 f108489e;

    /* JADX INFO: renamed from: f */
    public static final hk60 f108490f;

    /* JADX INFO: renamed from: g */
    public static final xl60.C2578b f108491g;

    static {
        p0i0 p0i0VarM68713e = new p0i0.C2237b().m68713e();
        gbu gbuVar = gbu.f78413a;
        f108485a = p0i0VarM68713e.m68706f(String.class, gbuVar, "link");
        f108486b = p0i0VarM68713e.m68706f(Boolean.TYPE, gbuVar, "available");
        f108487c = p0i0VarM68713e.m68706f(Integer.TYPE, gbuVar, "numTracks");
        f108488d = p0i0VarM68713e.m68706f(mp91.m62457j(Map.class, String.class, String.class), gbuVar, "formatListAttributes");
        f108489e = p0i0VarM68713e.m68706f(String.class, gbuVar, "madeForName");
        f108490f = p0i0VarM68713e.m68706f(Boolean.class, gbuVar, "isOnDemandInFree");
        f108491g = xl60.C2578b.m91389a("link", "collectionLink", "name", "imageUri", "type", "offline", "ownerName", "publisher", "artistName", ContextTrack.Metadata.KEY_SUBTITLE, "mediaType", "available", "isCollaborative", "isLoading", "isOwnedBySelf", "isFollowing", "inCollection", "numTracks", "tracksInCollectionCount", "syncProgress", "formatListType", "formatListAttributes", "madeForName", "madeForUsername", "isOnDemandInFree", "isBook");
    }
}
