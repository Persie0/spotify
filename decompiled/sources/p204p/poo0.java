package p204p;

import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class poo0 {
    /* JADX INFO: renamed from: a */
    public static PreparePlayOptions m70488a(SkipToTrack skipToTrack, long j, Long l, boolean z, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        if (skipToTrack != null) {
            builder.skipTo(skipToTrack);
        }
        if (z) {
            int i2 = hg40.f91023c;
            builder.suppressions(new zh21(Suppressions.Providers.MFT));
            PlayerOptionOverrides.Builder builder2 = PlayerOptionOverrides.builder();
            Boolean bool = Boolean.FALSE;
            builder.playerOptionsOverride(builder2.repeatingContext(bool).shufflingContext(bool).repeatingTrack(bool).build());
        }
        if (l != null && l.longValue() > -1) {
            builder.seekToCreatorTimestamp(String.valueOf(l.longValue()));
        } else if (j >= 0) {
            builder.seekTo(Long.valueOf(j));
        }
        return builder.build();
    }
}
