package p204p;

import android.content.Intent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public abstract class iwo0 {
    /* JADX INFO: renamed from: a */
    public static void m51846a(Intent intent, PlayerState playerState, xre xreVar) {
        ContextTrack contextTrack = playerState.track().mo49279c() ? (ContextTrack) playerState.track().mo49278b() : null;
        intent.putExtra("id", contextTrack != null ? contextTrack.uri() : "");
        intent.putExtra("track", contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_TITLE) : "");
        intent.putExtra("artist", contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_ARTIST_NAME) : "");
        intent.putExtra("album", contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_ALBUM_TITLE) : "");
        intent.putExtra("albumId", contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_ALBUM_URI) : "");
        long jLongValue = playerState.duration().mo49279c() ? ((Long) playerState.duration().mo49278b()).longValue() : 0L;
        intent.putExtra("duration", jLongValue);
        ((wy3) xreVar).getClass();
        xul0 xul0VarPosition = playerState.position(System.currentTimeMillis());
        long jLongValue2 = xul0VarPosition.mo49279c() ? ((Long) xul0VarPosition.mo49278b()).longValue() : 0L;
        intent.putExtra("position", jLongValue2);
        intent.putExtra("length", (int) jLongValue);
        intent.putExtra("playbackPosition", (int) jLongValue2);
    }
}
