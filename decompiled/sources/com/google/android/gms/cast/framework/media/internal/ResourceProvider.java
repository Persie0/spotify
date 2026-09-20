package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import com.spotify.music.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p204p.dq60;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceProvider {

    /* JADX INFO: renamed from: a */
    public static final Map f1822a;

    static {
        HashMap map = new HashMap();
        dq60.m36623w(R.drawable.cast_ic_notification_small_icon, map, "smallIconDrawableResId", R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId");
        dq60.m36623w(R.drawable.cast_ic_notification_pause, map, "pauseDrawableResId", R.drawable.cast_ic_notification_play, "playDrawableResId");
        dq60.m36623w(R.drawable.cast_ic_notification_skip_next, map, "skipNextDrawableResId", R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId");
        dq60.m36623w(R.drawable.cast_ic_notification_forward, map, "forwardDrawableResId", R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        dq60.m36623w(R.drawable.cast_ic_notification_forward30, map, "forward30DrawableResId", R.drawable.cast_ic_notification_rewind, "rewindDrawableResId");
        dq60.m36623w(R.drawable.cast_ic_notification_rewind10, map, "rewind10DrawableResId", R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        dq60.m36623w(R.drawable.cast_ic_notification_disconnect, map, "disconnectDrawableResId", R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId");
        dq60.m36623w(R.string.cast_casting_to_device, map, "castingToDeviceStringResId", R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        dq60.m36623w(R.string.cast_pause, map, "pauseStringResId", R.string.cast_play, "playStringResId");
        dq60.m36623w(R.string.cast_skip_next, map, "skipNextStringResId", R.string.cast_skip_prev, "skipPrevStringResId");
        dq60.m36623w(R.string.cast_forward, map, "forwardStringResId", R.string.cast_forward_10, "forward10StringResId");
        dq60.m36623w(R.string.cast_forward_30, map, "forward30StringResId", R.string.cast_rewind, "rewindStringResId");
        dq60.m36623w(R.string.cast_rewind_10, map, "rewind10StringResId", R.string.cast_rewind_30, "rewind30StringResId");
        map.put("disconnectStringResId", Integer.valueOf(R.string.cast_disconnect));
        f1822a = Collections.unmodifiableMap(map);
    }

    @Keep
    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f1822a.get(str);
    }
}
