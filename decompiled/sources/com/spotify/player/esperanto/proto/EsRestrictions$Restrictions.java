package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.eow;
import p204p.fow;
import p204p.gow;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsRestrictions$Restrictions extends AbstractC0269h implements sre0 {
    private static final EsRestrictions$Restrictions DEFAULT_INSTANCE;
    public static final int DISALLOW_ADD_TO_QUEUE_REASONS_FIELD_NUMBER = 22;
    public static final int DISALLOW_ADD_TO_QUEUE_TRACK_REASONS_FIELD_NUMBER = 31;
    public static final int DISALLOW_INSERTING_INTO_CONTEXT_TRACKS_REASONS_FIELD_NUMBER = 16;
    public static final int DISALLOW_INSERTING_INTO_NEXT_TRACKS_REASONS_FIELD_NUMBER = 15;
    public static final int DISALLOW_INTERRUPTING_PLAYBACK_REASONS_FIELD_NUMBER = 12;
    public static final int DISALLOW_PAUSING_REASONS_FIELD_NUMBER = 1;
    public static final int DISALLOW_PEEKING_NEXT_REASONS_FIELD_NUMBER = 5;
    public static final int DISALLOW_PEEKING_PREV_REASONS_FIELD_NUMBER = 4;
    public static final int DISALLOW_PLAY_AS_NEXT_IN_QUEUE_REASONS_FIELD_NUMBER = 27;
    public static final int DISALLOW_REMOTE_CONTROL_REASONS_FIELD_NUMBER = 14;
    public static final int DISALLOW_REMOVING_FROM_CONTEXT_TRACKS_REASONS_FIELD_NUMBER = 20;
    public static final int DISALLOW_REMOVING_FROM_NEXT_TRACKS_REASONS_FIELD_NUMBER = 19;

    /* JADX INFO: renamed from: DISALLOW_REORDERING_ENQUEUED_EPISODE_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER */
    public static final int f6424xd3a89c90 = 36;

    /* JADX INFO: renamed from: DISALLOW_REORDERING_ENQUEUED_TRACK_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER */
    public static final int f6425xffd97420 = 35;
    public static final int DISALLOW_REORDERING_EPISODE_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 34;
    public static final int DISALLOW_REORDERING_IN_CONTEXT_TRACKS_REASONS_FIELD_NUMBER = 18;
    public static final int DISALLOW_REORDERING_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 17;
    public static final int DISALLOW_REORDERING_TRACK_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 33;
    public static final int DISALLOW_RESUMING_REASONS_FIELD_NUMBER = 2;
    public static final int DISALLOW_SEEKING_REASONS_FIELD_NUMBER = 3;
    public static final int DISALLOW_SETTING_MODES_FIELD_NUMBER = 25;
    public static final int DISALLOW_SETTING_PLAYBACK_SPEED_REASONS_FIELD_NUMBER = 23;
    public static final int DISALLOW_SET_QUEUE_REASONS_FIELD_NUMBER = 11;
    public static final int DISALLOW_SIGNALS_FIELD_NUMBER = 26;
    public static final int DISALLOW_SKIPPING_NEXT_REASONS_FIELD_NUMBER = 7;
    public static final int DISALLOW_SKIPPING_PREV_REASONS_FIELD_NUMBER = 6;
    public static final int DISALLOW_SLEEP_TIMER_CLEAR_REASONS_FIELD_NUMBER = 28;
    public static final int DISALLOW_SLEEP_TIMER_DURATION_REASONS_FIELD_NUMBER = 29;
    public static final int DISALLOW_SLEEP_TIMER_END_OF_TRACK_REASONS_FIELD_NUMBER = 30;
    public static final int DISALLOW_SWIPE_NEXT_REASONS_FIELD_NUMBER = 39;
    public static final int DISALLOW_SWIPE_PREV_REASONS_FIELD_NUMBER = 40;
    public static final int DISALLOW_TAP_TO_PLAY_TRACK_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 32;
    public static final int DISALLOW_TOGGLING_REPEAT_CONTEXT_REASONS_FIELD_NUMBER = 8;
    public static final int DISALLOW_TOGGLING_REPEAT_TRACK_REASONS_FIELD_NUMBER = 9;
    public static final int DISALLOW_TOGGLING_SHUFFLE_REASONS_FIELD_NUMBER = 10;
    public static final int DISALLOW_TRANSFERRING_PLAYBACK_REASONS_FIELD_NUMBER = 13;
    public static final int DISALLOW_UPDATING_CONTEXT_REASONS_FIELD_NUMBER = 21;

    /* JADX INFO: renamed from: DISALLOW_VIEWING_ORDERED_TRACKS_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER */
    public static final int f6426xd0c3d4a4 = 38;
    public static final int DISALLOW_VIEWING_QUEUE_REASONS_FIELD_NUMBER = 37;
    private static volatile r2n0 PARSER;
    private ae50 disallowAddToQueueReasons_;
    private ae50 disallowAddToQueueTrackReasons_;
    private ae50 disallowInsertingIntoContextTracksReasons_;
    private ae50 disallowInsertingIntoNextTracksReasons_;
    private ae50 disallowInterruptingPlaybackReasons_;
    private ae50 disallowPausingReasons_;
    private ae50 disallowPeekingNextReasons_;
    private ae50 disallowPeekingPrevReasons_;
    private ae50 disallowPlayAsNextInQueueReasons_;
    private ae50 disallowRemoteControlReasons_;
    private ae50 disallowRemovingFromContextTracksReasons_;
    private ae50 disallowRemovingFromNextTracksReasons_;
    private ae50 disallowReorderingEnqueuedEpisodeInNextTracksReasons_;
    private ae50 disallowReorderingEnqueuedTrackInNextTracksReasons_;
    private ae50 disallowReorderingEpisodeInNextTracksReasons_;
    private ae50 disallowReorderingInContextTracksReasons_;
    private ae50 disallowReorderingInNextTracksReasons_;
    private ae50 disallowReorderingTrackInNextTracksReasons_;
    private ae50 disallowResumingReasons_;
    private ae50 disallowSeekingReasons_;
    private ae50 disallowSetQueueReasons_;
    private ihc0 disallowSettingModes_;
    private ae50 disallowSettingPlaybackSpeedReasons_;
    private ihc0 disallowSignals_;
    private ae50 disallowSkippingNextReasons_;
    private ae50 disallowSkippingPrevReasons_;
    private ae50 disallowSleepTimerClearReasons_;
    private ae50 disallowSleepTimerDurationReasons_;
    private ae50 disallowSleepTimerEndOfTrackReasons_;
    private ae50 disallowSwipeNextReasons_;
    private ae50 disallowSwipePrevReasons_;
    private ae50 disallowTapToPlayTrackInNextTracksReasons_;
    private ae50 disallowTogglingRepeatContextReasons_;
    private ae50 disallowTogglingRepeatTrackReasons_;
    private ae50 disallowTogglingShuffleReasons_;
    private ae50 disallowTransferringPlaybackReasons_;
    private ae50 disallowUpdatingContextReasons_;
    private ae50 disallowViewingOrderedTracksInNextTracksReasons_;
    private ae50 disallowViewingQueueReasons_;

    static {
        EsRestrictions$Restrictions esRestrictions$Restrictions = new EsRestrictions$Restrictions();
        DEFAULT_INSTANCE = esRestrictions$Restrictions;
        AbstractC0269h.registerDefaultInstance(EsRestrictions$Restrictions.class, esRestrictions$Restrictions);
    }

    private EsRestrictions$Restrictions() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.disallowSettingModes_ = ihc0Var;
        this.disallowSignals_ = ihc0Var;
        this.disallowPausingReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowResumingReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSeekingReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowPeekingPrevReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowPeekingNextReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSkippingPrevReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSkippingNextReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowTogglingRepeatContextReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowTogglingRepeatTrackReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowTogglingShuffleReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSetQueueReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowInterruptingPlaybackReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowTransferringPlaybackReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowRemoteControlReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowInsertingIntoNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowInsertingIntoContextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowReorderingInNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowReorderingInContextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowRemovingFromNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowRemovingFromContextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowUpdatingContextReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowAddToQueueReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSettingPlaybackSpeedReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowPlayAsNextInQueueReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSleepTimerClearReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSleepTimerDurationReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSleepTimerEndOfTrackReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowAddToQueueTrackReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowTapToPlayTrackInNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowReorderingTrackInNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowReorderingEpisodeInNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowReorderingEnqueuedTrackInNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowReorderingEnqueuedEpisodeInNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowViewingQueueReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowViewingOrderedTracksInNextTracksReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSwipeNextReasons_ = AbstractC0269h.emptyProtobufList();
        this.disallowSwipePrevReasons_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: renamed from: A */
    public static void m17872A(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowReorderingEpisodeInNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowReorderingEpisodeInNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowReorderingEpisodeInNextTracksReasons_);
    }

    /* JADX INFO: renamed from: B */
    public static void m17873B(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowReorderingInContextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowReorderingInContextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowReorderingInContextTracksReasons_);
    }

    /* JADX INFO: renamed from: C */
    public static void m17874C(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowReorderingInNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowReorderingInNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowReorderingInNextTracksReasons_);
    }

    /* JADX INFO: renamed from: D */
    public static void m17875D(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowReorderingTrackInNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowReorderingTrackInNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowReorderingTrackInNextTracksReasons_);
    }

    /* JADX INFO: renamed from: E */
    public static void m17876E(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowResumingReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowResumingReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowResumingReasons_);
    }

    /* JADX INFO: renamed from: F */
    public static void m17877F(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSeekingReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSeekingReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSeekingReasons_);
    }

    /* JADX INFO: renamed from: G */
    public static void m17878G(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSetQueueReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSetQueueReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSetQueueReasons_);
    }

    /* JADX INFO: renamed from: H */
    public static void m17879H(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSettingPlaybackSpeedReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSettingPlaybackSpeedReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSettingPlaybackSpeedReasons_);
    }

    /* JADX INFO: renamed from: I */
    public static void m17880I(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSkippingNextReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSkippingNextReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSkippingNextReasons_);
    }

    /* JADX INFO: renamed from: J */
    public static void m17881J(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSkippingPrevReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSkippingPrevReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSkippingPrevReasons_);
    }

    /* JADX INFO: renamed from: K */
    public static void m17882K(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSleepTimerClearReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSleepTimerClearReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSleepTimerClearReasons_);
    }

    /* JADX INFO: renamed from: L */
    public static void m17883L(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSleepTimerDurationReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSleepTimerDurationReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSleepTimerDurationReasons_);
    }

    /* JADX INFO: renamed from: M */
    public static void m17884M(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSleepTimerEndOfTrackReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSleepTimerEndOfTrackReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSleepTimerEndOfTrackReasons_);
    }

    /* JADX INFO: renamed from: M0 */
    public static eow m17885M0() {
        return (eow) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: N */
    public static void m17886N(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSwipeNextReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSwipeNextReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSwipeNextReasons_);
    }

    /* JADX INFO: renamed from: O */
    public static void m17887O(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowSwipePrevReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowSwipePrevReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowSwipePrevReasons_);
    }

    /* JADX INFO: renamed from: P */
    public static void m17888P(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowTapToPlayTrackInNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowTapToPlayTrackInNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowTapToPlayTrackInNextTracksReasons_);
    }

    /* JADX INFO: renamed from: Q */
    public static void m17889Q(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowTogglingRepeatContextReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowTogglingRepeatContextReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowTogglingRepeatContextReasons_);
    }

    /* JADX INFO: renamed from: R */
    public static void m17890R(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowTogglingRepeatTrackReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowTogglingRepeatTrackReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowTogglingRepeatTrackReasons_);
    }

    /* JADX INFO: renamed from: S */
    public static void m17891S(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowTogglingShuffleReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowTogglingShuffleReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowTogglingShuffleReasons_);
    }

    /* JADX INFO: renamed from: T */
    public static void m17892T(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowTransferringPlaybackReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowTransferringPlaybackReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowTransferringPlaybackReasons_);
    }

    /* JADX INFO: renamed from: U */
    public static void m17893U(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowUpdatingContextReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowUpdatingContextReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowUpdatingContextReasons_);
    }

    /* JADX INFO: renamed from: V */
    public static void m17894V(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowViewingOrderedTracksInNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowViewingOrderedTracksInNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowViewingOrderedTracksInNextTracksReasons_);
    }

    /* JADX INFO: renamed from: W */
    public static void m17895W(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowViewingQueueReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowViewingQueueReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowViewingQueueReasons_);
    }

    /* JADX INFO: renamed from: X */
    public static ihc0 m17896X(EsRestrictions$Restrictions esRestrictions$Restrictions) {
        ihc0 ihc0Var = esRestrictions$Restrictions.disallowSignals_;
        if (!ihc0Var.f102236a) {
            esRestrictions$Restrictions.disallowSignals_ = ihc0Var.m50613h();
        }
        return esRestrictions$Restrictions.disallowSignals_;
    }

    /* JADX INFO: renamed from: Z */
    public static EsRestrictions$Restrictions m17898Z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m17899n(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowAddToQueueReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowAddToQueueReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowAddToQueueReasons_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17900o(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowAddToQueueTrackReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowAddToQueueTrackReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowAddToQueueTrackReasons_);
    }

    /* JADX INFO: renamed from: p */
    public static void m17901p(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowInsertingIntoContextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowInsertingIntoContextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowInsertingIntoContextTracksReasons_);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17902q(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowInsertingIntoNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowInsertingIntoNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowInsertingIntoNextTracksReasons_);
    }

    /* JADX INFO: renamed from: r */
    public static void m17903r(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowInterruptingPlaybackReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowInterruptingPlaybackReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowInterruptingPlaybackReasons_);
    }

    /* JADX INFO: renamed from: s */
    public static void m17904s(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowPausingReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowPausingReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowPausingReasons_);
    }

    /* JADX INFO: renamed from: t */
    public static void m17905t(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowPeekingNextReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowPeekingNextReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowPeekingNextReasons_);
    }

    /* JADX INFO: renamed from: u */
    public static void m17906u(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowPeekingPrevReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowPeekingPrevReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowPeekingPrevReasons_);
    }

    /* JADX INFO: renamed from: v */
    public static void m17907v(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowRemoteControlReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowRemoteControlReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowRemoteControlReasons_);
    }

    /* JADX INFO: renamed from: w */
    public static void m17908w(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowRemovingFromContextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowRemovingFromContextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowRemovingFromContextTracksReasons_);
    }

    /* JADX INFO: renamed from: x */
    public static void m17909x(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowRemovingFromNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowRemovingFromNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowRemovingFromNextTracksReasons_);
    }

    /* JADX INFO: renamed from: y */
    public static void m17910y(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowReorderingEnqueuedEpisodeInNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowReorderingEnqueuedEpisodeInNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowReorderingEnqueuedEpisodeInNextTracksReasons_);
    }

    /* JADX INFO: renamed from: z */
    public static void m17911z(EsRestrictions$Restrictions esRestrictions$Restrictions, Iterable iterable) {
        ae50 ae50Var = esRestrictions$Restrictions.disallowReorderingEnqueuedTrackInNextTracksReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esRestrictions$Restrictions.disallowReorderingEnqueuedTrackInNextTracksReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esRestrictions$Restrictions.disallowReorderingEnqueuedTrackInNextTracksReasons_);
    }

    /* JADX INFO: renamed from: A0 */
    public final ae50 m17912A0() {
        return this.disallowSleepTimerDurationReasons_;
    }

    /* JADX INFO: renamed from: B0 */
    public final ae50 m17913B0() {
        return this.disallowSleepTimerEndOfTrackReasons_;
    }

    /* JADX INFO: renamed from: C0 */
    public final ae50 m17914C0() {
        return this.disallowSwipeNextReasons_;
    }

    /* JADX INFO: renamed from: D0 */
    public final ae50 m17915D0() {
        return this.disallowSwipePrevReasons_;
    }

    /* JADX INFO: renamed from: E0 */
    public final ae50 m17916E0() {
        return this.disallowTapToPlayTrackInNextTracksReasons_;
    }

    /* JADX INFO: renamed from: F0 */
    public final ae50 m17917F0() {
        return this.disallowTogglingRepeatContextReasons_;
    }

    /* JADX INFO: renamed from: G0 */
    public final ae50 m17918G0() {
        return this.disallowTogglingRepeatTrackReasons_;
    }

    /* JADX INFO: renamed from: H0 */
    public final ae50 m17919H0() {
        return this.disallowTogglingShuffleReasons_;
    }

    /* JADX INFO: renamed from: I0 */
    public final ae50 m17920I0() {
        return this.disallowTransferringPlaybackReasons_;
    }

    /* JADX INFO: renamed from: J0 */
    public final ae50 m17921J0() {
        return this.disallowUpdatingContextReasons_;
    }

    /* JADX INFO: renamed from: K0 */
    public final ae50 m17922K0() {
        return this.disallowViewingOrderedTracksInNextTracksReasons_;
    }

    /* JADX INFO: renamed from: L0 */
    public final ae50 m17923L0() {
        return this.disallowViewingQueueReasons_;
    }

    /* JADX INFO: renamed from: a0 */
    public final ae50 m17924a0() {
        return this.disallowAddToQueueReasons_;
    }

    /* JADX INFO: renamed from: b0 */
    public final ae50 m17925b0() {
        return this.disallowAddToQueueTrackReasons_;
    }

    /* JADX INFO: renamed from: c0 */
    public final ae50 m17926c0() {
        return this.disallowInsertingIntoContextTracksReasons_;
    }

    /* JADX INFO: renamed from: d0 */
    public final ae50 m17927d0() {
        return this.disallowInsertingIntoNextTracksReasons_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000'\u0000\u0000\u0001('\u0002%\u0000\u0001Ț\u0002Ț\u0003Ț\u0004Ț\u0005Ț\u0006Ț\u0007Ț\bȚ\tȚ\nȚ\u000bȚ\fȚ\rȚ\u000eȚ\u000fȚ\u0010Ț\u0011Ț\u0012Ț\u0013Ț\u0014Ț\u0015Ț\u0016Ț\u0017Ț\u00192\u001a2\u001bȚ\u001cȚ\u001dȚ\u001eȚ\u001fȚ Ț!Ț\"Ț#Ț$Ț%Ț&Ț'Ț(Ț", new Object[]{"disallowPausingReasons_", "disallowResumingReasons_", "disallowSeekingReasons_", "disallowPeekingPrevReasons_", "disallowPeekingNextReasons_", "disallowSkippingPrevReasons_", "disallowSkippingNextReasons_", "disallowTogglingRepeatContextReasons_", "disallowTogglingRepeatTrackReasons_", "disallowTogglingShuffleReasons_", "disallowSetQueueReasons_", "disallowInterruptingPlaybackReasons_", "disallowTransferringPlaybackReasons_", "disallowRemoteControlReasons_", "disallowInsertingIntoNextTracksReasons_", "disallowInsertingIntoContextTracksReasons_", "disallowReorderingInNextTracksReasons_", "disallowReorderingInContextTracksReasons_", "disallowRemovingFromNextTracksReasons_", "disallowRemovingFromContextTracksReasons_", "disallowUpdatingContextReasons_", "disallowAddToQueueReasons_", "disallowSettingPlaybackSpeedReasons_", "disallowSettingModes_", fow.f71635a, "disallowSignals_", gow.f83028a, "disallowPlayAsNextInQueueReasons_", "disallowSleepTimerClearReasons_", "disallowSleepTimerDurationReasons_", "disallowSleepTimerEndOfTrackReasons_", "disallowAddToQueueTrackReasons_", "disallowTapToPlayTrackInNextTracksReasons_", "disallowReorderingTrackInNextTracksReasons_", "disallowReorderingEpisodeInNextTracksReasons_", "disallowReorderingEnqueuedTrackInNextTracksReasons_", "disallowReorderingEnqueuedEpisodeInNextTracksReasons_", "disallowViewingQueueReasons_", "disallowViewingOrderedTracksInNextTracksReasons_", "disallowSwipeNextReasons_", "disallowSwipePrevReasons_"});
        }
        if (iOrdinal == 3) {
            return new EsRestrictions$Restrictions();
        }
        if (iOrdinal == 4) {
            return new eow();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (EsRestrictions$Restrictions.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    /* JADX INFO: renamed from: e0 */
    public final ae50 m17928e0() {
        return this.disallowInterruptingPlaybackReasons_;
    }

    /* JADX INFO: renamed from: f0 */
    public final ae50 m17929f0() {
        return this.disallowPausingReasons_;
    }

    /* JADX INFO: renamed from: g0 */
    public final ae50 m17930g0() {
        return this.disallowPeekingNextReasons_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: h0 */
    public final ae50 m17931h0() {
        return this.disallowPeekingPrevReasons_;
    }

    /* JADX INFO: renamed from: i0 */
    public final ae50 m17932i0() {
        return this.disallowRemoteControlReasons_;
    }

    /* JADX INFO: renamed from: j0 */
    public final ae50 m17933j0() {
        return this.disallowRemovingFromContextTracksReasons_;
    }

    /* JADX INFO: renamed from: k0 */
    public final ae50 m17934k0() {
        return this.disallowRemovingFromNextTracksReasons_;
    }

    /* JADX INFO: renamed from: l0 */
    public final ae50 m17935l0() {
        return this.disallowReorderingEnqueuedEpisodeInNextTracksReasons_;
    }

    /* JADX INFO: renamed from: m0 */
    public final ae50 m17936m0() {
        return this.disallowReorderingEnqueuedTrackInNextTracksReasons_;
    }

    /* JADX INFO: renamed from: n0 */
    public final ae50 m17937n0() {
        return this.disallowReorderingEpisodeInNextTracksReasons_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o0 */
    public final ae50 m17938o0() {
        return this.disallowReorderingInContextTracksReasons_;
    }

    /* JADX INFO: renamed from: p0 */
    public final ae50 m17939p0() {
        return this.disallowReorderingInNextTracksReasons_;
    }

    /* JADX INFO: renamed from: q0 */
    public final ae50 m17940q0() {
        return this.disallowReorderingTrackInNextTracksReasons_;
    }

    /* JADX INFO: renamed from: r0 */
    public final ae50 m17941r0() {
        return this.disallowResumingReasons_;
    }

    /* JADX INFO: renamed from: s0 */
    public final ae50 m17942s0() {
        return this.disallowSeekingReasons_;
    }

    /* JADX INFO: renamed from: t0 */
    public final ae50 m17943t0() {
        return this.disallowSetQueueReasons_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u0 */
    public final Map m17944u0() {
        return Collections.unmodifiableMap(this.disallowSettingModes_);
    }

    /* JADX INFO: renamed from: v0 */
    public final ae50 m17945v0() {
        return this.disallowSettingPlaybackSpeedReasons_;
    }

    /* JADX INFO: renamed from: w0 */
    public final Map m17946w0() {
        return Collections.unmodifiableMap(this.disallowSignals_);
    }

    /* JADX INFO: renamed from: x0 */
    public final ae50 m17947x0() {
        return this.disallowSkippingNextReasons_;
    }

    /* JADX INFO: renamed from: y0 */
    public final ae50 m17948y0() {
        return this.disallowSkippingPrevReasons_;
    }

    /* JADX INFO: renamed from: z0 */
    public final ae50 m17949z0() {
        return this.disallowSleepTimerClearReasons_;
    }
}
