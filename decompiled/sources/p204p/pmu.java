package p204p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pmu {

    /* JADX INFO: renamed from: a */
    public static final Object f179234a = kkc0.m56695h0(new pqm0("AD_FREE", Integer.valueOf(R.drawable.encore_icon_ad_free_24)), new pqm0("DOWNLOAD", Integer.valueOf(R.drawable.encore_icon_download_24)), new pqm0("SHUFFLE", Integer.valueOf(R.drawable.encore_icon_shuffle_24)), new pqm0("HEADPHONES", Integer.valueOf(R.drawable.encore_icon_headphones_24)), new pqm0("GROUP", Integer.valueOf(R.drawable.encore_icon_group_24)), new pqm0("ENHANCE_ACTIVE", Integer.valueOf(R.drawable.encore_icon_enhance_active_24)), new pqm0("QUEUE", Integer.valueOf(R.drawable.encore_icon_add_to_queue_24)), new pqm0("CHECK", Integer.valueOf(R.drawable.encore_icon_check_24)), new pqm0("UNLOCK_ACTIVE", Integer.valueOf(R.drawable.encore_icon_unlocked_active_24)), new pqm0("USER_ACTIVE", Integer.valueOf(R.drawable.encore_icon_user_active_24)), new pqm0("AUDIOBOOK", Integer.valueOf(R.drawable.encore_icon_audiobook_24)), new pqm0("GROUP_SESSION", Integer.valueOf(R.drawable.encore_icon_group_session_24)), new pqm0("GROUP_ACTIVE", Integer.valueOf(R.drawable.encore_icon_group_active_24)), new pqm0("DUO_ACTIVE", Integer.valueOf(R.drawable.premium_duo_active_24)), new pqm0("LOCK_ACTIVE", Integer.valueOf(R.drawable.encore_icon_locked_active_24)), new pqm0("STAR", Integer.valueOf(R.drawable.encore_icon_star_24)), new pqm0("Video", Integer.valueOf(R.drawable.encore_icon_video_24)), new pqm0("Soundwave", Integer.valueOf(R.drawable.encore_icon_soundwave_24)));

    /* JADX INFO: renamed from: b */
    public static final Object f179235b = kkc0.m56695h0(new pqm0("AD_FREE", Integer.valueOf(R.drawable.encore_icon_ad_free_16)), new pqm0("DOWNLOAD", Integer.valueOf(R.drawable.encore_icon_download_16)), new pqm0("SHUFFLE", Integer.valueOf(R.drawable.encore_icon_shuffle_16)), new pqm0("HEADPHONES", Integer.valueOf(R.drawable.encore_icon_headphones_16)), new pqm0("GROUP", Integer.valueOf(R.drawable.encore_icon_group_16)), new pqm0("ENHANCE_ACTIVE", Integer.valueOf(R.drawable.encore_icon_enhance_active_16)), new pqm0("QUEUE", Integer.valueOf(R.drawable.encore_icon_add_to_queue_16)), new pqm0("CHECK", Integer.valueOf(R.drawable.encore_icon_check_16)), new pqm0("UNLOCK_ACTIVE", Integer.valueOf(R.drawable.encore_icon_unlocked_active_16)), new pqm0("USER_ACTIVE", Integer.valueOf(R.drawable.encore_icon_user_active_16)), new pqm0("AUDIOBOOK", Integer.valueOf(R.drawable.encore_icon_audiobook_16)), new pqm0("GROUP_SESSION", Integer.valueOf(R.drawable.encore_icon_group_session_16)), new pqm0("GROUP_ACTIVE", Integer.valueOf(R.drawable.encore_icon_group_active_16)), new pqm0("DUO_ACTIVE", Integer.valueOf(R.drawable.premium_duo_active_16)), new pqm0("LOCK_ACTIVE", Integer.valueOf(R.drawable.encore_icon_locked_active_16)), new pqm0("STAR", Integer.valueOf(R.drawable.encore_icon_star_16)), new pqm0("Video", Integer.valueOf(R.drawable.encore_icon_video_16)), new pqm0("Soundwave", Integer.valueOf(R.drawable.encore_icon_soundwave_16)));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX INFO: renamed from: a */
    public static Drawable m70421a(Resources resources, String str, boolean z) {
        Object obj;
        ?? r0;
        int iIntValue;
        Object obj2;
        if (z) {
            obj2 = f179234a;
        } else {
            obj = f179235b;
        }
        if (z) {
            r0 = obj;
            r0 = obj2;
            iIntValue = R.drawable.encore_icon_check_24;
        } else {
            r0 = obj;
            r0 = obj2;
            iIntValue = R.drawable.encore_icon_check_16;
        }
        Integer num = (Integer) r0.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        ThreadLocal threadLocal = u1x0.f225931a;
        return resources.getDrawable(iIntValue, null);
    }
}
