package com.spotify.betamax.contextplayercoordinatorimpl.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0011\u0010\u000f\u001a\u0004\b\n\u0010\rR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0010\u0010\r¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerOptions;", "", "", "shufflingContext", "repeatingContext", "repeatingTrack", "<init>", "(ZZZ)V", "copy", "(ZZZ)Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerOptions;", "a", "Z", "c", "()Z", "getShufflingContext$annotations", "()V", "b", "getRepeatingContext$annotations", "getRepeatingTrack$annotations", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ContextPlayerOptions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean shufflingContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean repeatingContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean repeatingTrack;

    public ContextPlayerOptions(@gk60(name = "shuffling_context") boolean z, @gk60(name = "repeating_context") boolean z2, @gk60(name = "repeating_track") boolean z3) {
        this.shufflingContext = z;
        this.repeatingContext = z2;
        this.repeatingTrack = z3;
    }

    @gk60(name = "repeating_context")
    public static /* synthetic */ void getRepeatingContext$annotations() {
    }

    @gk60(name = "repeating_track")
    public static /* synthetic */ void getRepeatingTrack$annotations() {
    }

    @gk60(name = "shuffling_context")
    public static /* synthetic */ void getShufflingContext$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getRepeatingContext() {
        return this.repeatingContext;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRepeatingTrack() {
        return this.repeatingTrack;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShufflingContext() {
        return this.shufflingContext;
    }

    public final ContextPlayerOptions copy(@gk60(name = "shuffling_context") boolean shufflingContext, @gk60(name = "repeating_context") boolean repeatingContext, @gk60(name = "repeating_track") boolean repeatingTrack) {
        return new ContextPlayerOptions(shufflingContext, repeatingContext, repeatingTrack);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextPlayerOptions)) {
            return false;
        }
        ContextPlayerOptions contextPlayerOptions = (ContextPlayerOptions) obj;
        return this.shufflingContext == contextPlayerOptions.shufflingContext && this.repeatingContext == contextPlayerOptions.repeatingContext && this.repeatingTrack == contextPlayerOptions.repeatingTrack;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.repeatingTrack) + s571.m77245d(Boolean.hashCode(this.shufflingContext) * 31, 31, this.repeatingContext);
    }
}
