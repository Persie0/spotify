package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u0012\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0010\u0010\rR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\n\u0010\r¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/Visibility;", "", "", "nudge", "persistentSurface", "inviteNotification", "<init>", "(ZZZ)V", "copy", "(ZZZ)Lcom/spotify/jam/internal/socialconnect/models/Visibility;", "a", "Z", "b", "()Z", "getNudge$annotations", "()V", "c", "getPersistentSurface$annotations", "getInviteNotification$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Visibility {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean nudge;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean persistentSurface;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean inviteNotification;

    public Visibility(@gk60(name = "nudge") boolean z, @gk60(name = "persistent_surface") boolean z2, @gk60(name = "invite_notification") boolean z3) {
        this.nudge = z;
        this.persistentSurface = z2;
        this.inviteNotification = z3;
    }

    @gk60(name = "invite_notification")
    public static /* synthetic */ void getInviteNotification$annotations() {
    }

    @gk60(name = "nudge")
    public static /* synthetic */ void getNudge$annotations() {
    }

    @gk60(name = "persistent_surface")
    public static /* synthetic */ void getPersistentSurface$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getInviteNotification() {
        return this.inviteNotification;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNudge() {
        return this.nudge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPersistentSurface() {
        return this.persistentSurface;
    }

    public final Visibility copy(@gk60(name = "nudge") boolean nudge, @gk60(name = "persistent_surface") boolean persistentSurface, @gk60(name = "invite_notification") boolean inviteNotification) {
        return new Visibility(nudge, persistentSurface, inviteNotification);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Visibility)) {
            return false;
        }
        Visibility visibility = (Visibility) obj;
        return this.nudge == visibility.nudge && this.persistentSurface == visibility.persistentSurface && this.inviteNotification == visibility.inviteNotification;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.inviteNotification) + s571.m77245d(Boolean.hashCode(this.nudge) * 31, 31, this.persistentSurface);
    }
}
