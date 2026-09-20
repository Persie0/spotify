package p204p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ecp0 {
    /* JADX INFO: renamed from: a */
    public static final int m38502a(PlayerState playerState) {
        hg40 hg40VarReasons;
        Restrictions.RestrictionReasons restrictionReasons = (Restrictions.RestrictionReasons) playerState.restrictions().disallowSignals().get("switch-to-video");
        if (restrictionReasons != null && (hg40VarReasons = restrictionReasons.reasons()) != null) {
            if (hg40VarReasons.contains("disallowed_by_account_manager")) {
                return 2;
            }
            if (hg40VarReasons.contains("disallowed_by_user_setting:music-video-disabled")) {
                return 3;
            }
            if (hg40VarReasons.contains("disallowed_by_user_setting:other-video-disabled")) {
                return 4;
            }
            if (hg40VarReasons.contains("not_supported_by_device")) {
                return 1;
            }
        }
        return 0;
    }
}
