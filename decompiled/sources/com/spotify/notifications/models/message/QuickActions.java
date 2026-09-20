package com.spotify.notifications.models.message;

import java.util.List;
import kotlin.Metadata;
import p204p.gk60;
import p204p.kyx;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/notifications/models/message/QuickActions;", "", "", kyx.f127932c, "", "Lcom/spotify/notifications/models/message/QuickAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/spotify/notifications/models/message/QuickActions;", "a", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "getCategory$annotations", "()V", "b", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "getActions$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class QuickActions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String category;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List actions;

    public QuickActions(@gk60(name = kyx.f127932c) String str, @gk60(name = "actions") List<QuickAction> list) {
        this.category = str;
        this.actions = list;
    }

    @gk60(name = "actions")
    public static /* synthetic */ void getActions$annotations() {
    }

    @gk60(name = kyx.f127932c)
    public static /* synthetic */ void getCategory$annotations() {
    }

    public final QuickActions copy(@gk60(name = kyx.f127932c) String category, @gk60(name = "actions") List<QuickAction> actions) {
        return new QuickActions(category, actions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickActions)) {
            return false;
        }
        QuickActions quickActions = (QuickActions) obj;
        return wj50.m88271j(this.category, quickActions.category) && wj50.m88271j(this.actions, quickActions.actions);
    }

    public final int hashCode() {
        return this.actions.hashCode() + (this.category.hashCode() * 31);
    }
}
