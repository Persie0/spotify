package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p204p.hg40;
import p204p.xf40;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class Restrictions {
    public static final Restrictions EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return Restrictions.builder();
        }

        public abstract Restrictions build();

        public abstract Builder disallowAddToQueueReasons(Set<String> set);

        public abstract Builder disallowAddToQueueTrackReasons(Set<String> set);

        public abstract Builder disallowInsertingIntoContextTracksReasons(Set<String> set);

        public abstract Builder disallowInsertingIntoNextTracksReasons(Set<String> set);

        public abstract Builder disallowInterruptingPlaybackReasons(Set<String> set);

        public abstract Builder disallowPausingReasons(Set<String> set);

        public abstract Builder disallowPeekingNextReasons(Set<String> set);

        public abstract Builder disallowPeekingPrevReasons(Set<String> set);

        public abstract Builder disallowPlayAsNextInQueueReasons(Set<String> set);

        public abstract Builder disallowRemoteControlReasons(Set<String> set);

        public abstract Builder disallowRemovingFromContextTracksReasons(Set<String> set);

        public abstract Builder disallowRemovingFromNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingEnqueuedEpisodeInNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingEnqueuedTrackInNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingEpisodeInNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingInContextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingInNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingTrackInNextTracksReasons(Set<String> set);

        public abstract Builder disallowResumingReasons(Set<String> set);

        public abstract Builder disallowSeekingReasons(Set<String> set);

        public abstract Builder disallowSetQueueReasons(Set<String> set);

        public abstract Builder disallowSettingModes(Map<String, ModeRestrictions> map);

        public abstract Builder disallowSettingPlaybackSpeedReasons(Set<String> set);

        public abstract Builder disallowSignals(Map<String, RestrictionReasons> map);

        public abstract Builder disallowSkippingNextReasons(Set<String> set);

        public abstract Builder disallowSkippingPrevReasons(Set<String> set);

        public abstract Builder disallowSleepTimerClearReasons(Set<String> set);

        public abstract Builder disallowSleepTimerDurationReasons(Set<String> set);

        public abstract Builder disallowSleepTimerEndOfTrackReasons(Set<String> set);

        public abstract Builder disallowSwipeNextReasons(Set<String> set);

        public abstract Builder disallowSwipePrevReasons(Set<String> set);

        public abstract Builder disallowTapToPlayTrackInNextTracksReasons(Set<String> set);

        public abstract Builder disallowTogglingRepeatContextReasons(Set<String> set);

        public abstract Builder disallowTogglingRepeatTrackReasons(Set<String> set);

        public abstract Builder disallowTogglingShuffleReasons(Set<String> set);

        public abstract Builder disallowTransferringPlaybackReasons(Set<String> set);

        public abstract Builder disallowUpdatingContextReasons(Set<String> set);

        public abstract Builder disallowViewingOrderedTracksInNextTracksReasons(Set<String> set);

        public abstract Builder disallowViewingQueueReasons(Set<String> set);
    }

    /* JADX INFO: loaded from: classes9.dex */
    @JsonDeserialize
    public static abstract class ModeRestrictions {

        public static abstract class Builder {
            public static Builder builder() {
                return ModeRestrictions.builder();
            }

            public abstract ModeRestrictions build();

            public abstract Builder values(Map<String, RestrictionReasons> map);
        }

        public static Builder builder() {
            return new AutoValue_Restrictions_ModeRestrictions.Builder();
        }

        public abstract xf40 values();
    }

    @JsonDeserialize
    public static abstract class RestrictionReasons {

        public static abstract class Builder {
            public static Builder builder() {
                return RestrictionReasons.builder();
            }

            public abstract RestrictionReasons build();

            public abstract Builder reasons(Set<String> set);
        }

        public static Builder builder() {
            return new AutoValue_Restrictions_RestrictionReasons.Builder();
        }

        public abstract hg40 reasons();
    }

    public static Builder builder() {
        AutoValue_Restrictions.Builder builder = new AutoValue_Restrictions.Builder();
        Set<String> set = Collections.EMPTY_SET;
        Builder builderDisallowSettingPlaybackSpeedReasons = builder.disallowPausingReasons(set).disallowResumingReasons(set).disallowSeekingReasons(set).disallowPeekingPrevReasons(set).disallowPeekingNextReasons(set).disallowSkippingPrevReasons(set).disallowSkippingNextReasons(set).disallowSwipeNextReasons(set).disallowSwipePrevReasons(set).disallowTogglingRepeatContextReasons(set).disallowTogglingRepeatTrackReasons(set).disallowTogglingShuffleReasons(set).disallowSetQueueReasons(set).disallowAddToQueueReasons(set).disallowInterruptingPlaybackReasons(set).disallowTransferringPlaybackReasons(set).disallowRemoteControlReasons(set).disallowInsertingIntoNextTracksReasons(set).disallowInsertingIntoContextTracksReasons(set).disallowReorderingInNextTracksReasons(set).disallowReorderingInContextTracksReasons(set).disallowRemovingFromNextTracksReasons(set).disallowUpdatingContextReasons(set).disallowRemovingFromContextTracksReasons(set).disallowSettingPlaybackSpeedReasons(set);
        Map<String, RestrictionReasons> map = Collections.EMPTY_MAP;
        return builderDisallowSettingPlaybackSpeedReasons.disallowSettingModes(map).disallowSignals(map).disallowPlayAsNextInQueueReasons(set).disallowSleepTimerClearReasons(set).disallowSleepTimerDurationReasons(set).disallowSleepTimerEndOfTrackReasons(set).disallowAddToQueueTrackReasons(set).disallowTapToPlayTrackInNextTracksReasons(set).disallowReorderingTrackInNextTracksReasons(set).disallowReorderingEpisodeInNextTracksReasons(set).disallowReorderingEnqueuedTrackInNextTracksReasons(set).disallowReorderingEnqueuedEpisodeInNextTracksReasons(set).disallowViewingQueueReasons(set).disallowViewingOrderedTracksInNextTracksReasons(set);
    }

    public abstract hg40 disallowAddToQueueReasons();

    public abstract hg40 disallowAddToQueueTrackReasons();

    public abstract hg40 disallowInsertingIntoContextTracksReasons();

    public abstract hg40 disallowInsertingIntoNextTracksReasons();

    public abstract hg40 disallowInterruptingPlaybackReasons();

    public abstract hg40 disallowPausingReasons();

    public abstract hg40 disallowPeekingNextReasons();

    public abstract hg40 disallowPeekingPrevReasons();

    public abstract hg40 disallowPlayAsNextInQueueReasons();

    public abstract hg40 disallowRemoteControlReasons();

    public abstract hg40 disallowRemovingFromContextTracksReasons();

    public abstract hg40 disallowRemovingFromNextTracksReasons();

    public abstract hg40 disallowReorderingEnqueuedEpisodeInNextTracksReasons();

    public abstract hg40 disallowReorderingEnqueuedTrackInNextTracksReasons();

    public abstract hg40 disallowReorderingEpisodeInNextTracksReasons();

    public abstract hg40 disallowReorderingInContextTracksReasons();

    public abstract hg40 disallowReorderingInNextTracksReasons();

    public abstract hg40 disallowReorderingTrackInNextTracksReasons();

    public abstract hg40 disallowResumingReasons();

    public abstract hg40 disallowSeekingReasons();

    public abstract hg40 disallowSetQueueReasons();

    public abstract xf40 disallowSettingModes();

    public abstract hg40 disallowSettingPlaybackSpeedReasons();

    public abstract xf40 disallowSignals();

    public abstract hg40 disallowSkippingNextReasons();

    public abstract hg40 disallowSkippingPrevReasons();

    public abstract hg40 disallowSleepTimerClearReasons();

    public abstract hg40 disallowSleepTimerDurationReasons();

    public abstract hg40 disallowSleepTimerEndOfTrackReasons();

    public abstract hg40 disallowSwipeNextReasons();

    public abstract hg40 disallowSwipePrevReasons();

    public abstract hg40 disallowTapToPlayTrackInNextTracksReasons();

    public abstract hg40 disallowTogglingRepeatContextReasons();

    public abstract hg40 disallowTogglingRepeatTrackReasons();

    public abstract hg40 disallowTogglingShuffleReasons();

    public abstract hg40 disallowTransferringPlaybackReasons();

    public abstract hg40 disallowUpdatingContextReasons();

    public abstract hg40 disallowViewingOrderedTracksInNextTracksReasons();

    public abstract hg40 disallowViewingQueueReasons();

    public abstract Builder toBuilder();
}
