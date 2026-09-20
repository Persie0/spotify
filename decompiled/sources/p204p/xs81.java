package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class xs81 extends hk60 {

    /* JADX INFO: renamed from: a */
    public final p0i0 f265541a;

    public xs81(p0i0 p0i0Var) {
        this.f265541a = p0i0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p204p.hk60
    public final Object fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        ContextTrack contextTrackBuild = null;
        PlayOrigin playOrigin = null;
        String strMo51087y = null;
        String strMo51087y2 = null;
        while (xl60Var.mo51079i()) {
            String strMo51084s = xl60Var.mo51084s();
            if (strMo51084s != null) {
                int iHashCode = strMo51084s.hashCode();
                p0i0 p0i0Var = this.f265541a;
                switch (iHashCode) {
                    case -541598063:
                        if (strMo51084s.equals("play_origin")) {
                            playOrigin = (PlayOrigin) p0i0Var.m68703c(PlayOrigin.class).fromJson(xl60Var);
                        }
                        break;
                    case -102516004:
                        if (strMo51084s.equals(ContextTrack.Metadata.KEY_CONTEXT_URI)) {
                            strMo51087y2 = xl60Var.mo51087y();
                        }
                        break;
                    case 110621003:
                        if (strMo51084s.equals("track")) {
                            contextTrackBuild = (ContextTrack) p0i0Var.m68703c(ContextTrack.class).fromJson(xl60Var);
                        }
                        break;
                    case 1706303935:
                        if (strMo51084s.equals("playback_id")) {
                            strMo51087y = xl60Var.mo51087y();
                        }
                        break;
                    default:
                        break;
                }
            }
            xl60Var.mo51074Q();
        }
        xl60Var.mo51078f();
        if (contextTrackBuild != null) {
            String strProvider = contextTrackBuild.provider();
            LinkedHashMap linkedHashMap = new LinkedHashMap(contextTrackBuild.metadata());
            linkedHashMap.put(ContextTrack.Metadata.KEY_PROVIDER, strProvider);
            contextTrackBuild = contextTrackBuild.toBuilder().metadata(linkedHashMap).build();
        }
        return new ws81(contextTrackBuild, playOrigin, strMo51087y, strMo51087y2);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Object obj) throws IOException {
        throw new IOException("Serializing TrackWithPlayOrigin is not supported");
    }
}
