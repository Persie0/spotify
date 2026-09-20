package com.spotify.notifications.models.message;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/notifications/models/message/QuickAction;", "", "", "actionIdentifier", "actionTitle", "actionData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/notifications/models/message/QuickAction;", "a", "Ljava/lang/String;", "getActionIdentifier", "()Ljava/lang/String;", "getActionIdentifier$annotations", "()V", "b", "getActionTitle", "getActionTitle$annotations", "c", "getActionData", "getActionData$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class QuickAction {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String actionIdentifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String actionTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String actionData;

    public QuickAction(@gk60(name = "actionIdentifier") String str, @gk60(name = "actionTitle") String str2, @gk60(name = "actionData") String str3) {
        this.actionIdentifier = str;
        this.actionTitle = str2;
        this.actionData = str3;
    }

    @gk60(name = "actionData")
    public static /* synthetic */ void getActionData$annotations() {
    }

    @gk60(name = "actionIdentifier")
    public static /* synthetic */ void getActionIdentifier$annotations() {
    }

    @gk60(name = "actionTitle")
    public static /* synthetic */ void getActionTitle$annotations() {
    }

    public final QuickAction copy(@gk60(name = "actionIdentifier") String actionIdentifier, @gk60(name = "actionTitle") String actionTitle, @gk60(name = "actionData") String actionData) {
        return new QuickAction(actionIdentifier, actionTitle, actionData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickAction)) {
            return false;
        }
        QuickAction quickAction = (QuickAction) obj;
        return wj50.m88271j(this.actionIdentifier, quickAction.actionIdentifier) && wj50.m88271j(this.actionTitle, quickAction.actionTitle) && wj50.m88271j(this.actionData, quickAction.actionData);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.actionIdentifier.hashCode() * 31, 31, this.actionTitle);
        String str = this.actionData;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
