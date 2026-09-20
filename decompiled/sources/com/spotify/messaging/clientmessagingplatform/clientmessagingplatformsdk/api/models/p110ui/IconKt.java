package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0001*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0004"}, m24212d2 = {"DataIcon", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Icon;", "isValid", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class IconKt {
    public static final boolean isValid(Icon icon) {
        return (icon == null || icon.getIconName() == IconName.ICON_UNKNOWN || icon.getIconName() == IconName.UNRECOGNIZED) ? false : true;
    }
}
