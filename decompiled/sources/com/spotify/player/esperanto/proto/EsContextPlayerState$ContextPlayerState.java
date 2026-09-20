package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p204p.ae50;
import p204p.gva;
import p204p.ihc0;
import p204p.nnw;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.rjw;
import p204p.sjw;
import p204p.sre0;
import p204p.tjw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsContextPlayerState$ContextPlayerState extends AbstractC0269h implements sre0 {
    public static final int AD_BREAK_CONTEXT_FIELD_NUMBER = 30;
    public static final int AUDIO_STREAM_FIELD_NUMBER = 26;
    public static final int CONTEXT_METADATA_FIELD_NUMBER = 22;
    public static final int CONTEXT_RESTRICTIONS_FIELD_NUMBER = 4;
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    public static final int CONTEXT_URL_FIELD_NUMBER = 3;
    private static final EsContextPlayerState$ContextPlayerState DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 12;
    public static final int FORMAT_FIELD_NUMBER = 29;
    public static final int INDEX_FIELD_NUMBER = 6;
    public static final int IS_BUFFERING_FIELD_NUMBER = 15;
    public static final int IS_PAUSED_FIELD_NUMBER = 14;
    public static final int IS_PLAYING_FIELD_NUMBER = 13;
    public static final int IS_SYSTEM_INITIATED_FIELD_NUMBER = 16;
    public static final int NEXT_TRACKS_FIELD_NUMBER = 21;
    public static final int OPTIONS_FIELD_NUMBER = 17;
    public static final int PAGE_METADATA_FIELD_NUMBER = 23;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 8;
    public static final int PLAYBACK_QUALITY_FIELD_NUMBER = 9;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 10;
    public static final int PLAY_ORIGIN_FIELD_NUMBER = 5;
    public static final int POSITION_AS_OF_TIMESTAMP_FIELD_NUMBER = 11;
    public static final int PREV_TRACKS_FIELD_NUMBER = 20;
    public static final int QUEUE_REVISION_FIELD_NUMBER = 25;
    public static final int RESTRICTIONS_FIELD_NUMBER = 18;
    public static final int SESSION_COMMAND_ID_FIELD_NUMBER = 28;
    public static final int SESSION_ID_FIELD_NUMBER = 24;
    public static final int SIGNALS_FIELD_NUMBER = 27;
    public static final int SLEEP_TIMER_FIELD_NUMBER = 31;
    public static final int SUPPRESSIONS_FIELD_NUMBER = 19;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 7;
    private EsAdBreakContext$AdBreakContext adBreakContext_;
    private int audioStream_;
    private int bitField0_;
    private ihc0 contextMetadata_;
    private EsRestrictions$Restrictions contextRestrictions_;
    private String contextUri_;
    private String contextUrl_;
    private EsOptional$OptionalInt64 duration_;
    private int format_;
    private EsContextPlayerState$ContextIndex index_;
    private boolean isBuffering_;
    private boolean isPaused_;
    private boolean isPlaying_;
    private boolean isSystemInitiated_;
    private ae50 nextTracks_;
    private EsContextPlayerOptions$ContextPlayerOptions options_;
    private ihc0 pageMetadata_;
    private EsPlayOrigin$PlayOrigin playOrigin_;
    private gva playbackId_;
    private EsContextPlayerState$PlaybackQuality playbackQuality_;
    private EsOptional$OptionalDouble playbackSpeed_;
    private EsOptional$OptionalInt64 positionAsOfTimestamp_;
    private ae50 prevTracks_;
    private long queueRevision_;
    private EsRestrictions$Restrictions restrictions_;
    private String sessionCommandId_;
    private String sessionId_;
    private ae50 signals_;
    private EsSleepTimer$SleepTimer sleepTimer_;
    private ae50 suppressions_;
    private long timestamp_;
    private EsProvidedTrack$ProvidedTrack track_;

    static {
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState = new EsContextPlayerState$ContextPlayerState();
        DEFAULT_INSTANCE = esContextPlayerState$ContextPlayerState;
        AbstractC0269h.registerDefaultInstance(EsContextPlayerState$ContextPlayerState.class, esContextPlayerState$ContextPlayerState);
    }

    private EsContextPlayerState$ContextPlayerState() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.contextMetadata_ = ihc0Var;
        this.pageMetadata_ = ihc0Var;
        this.contextUri_ = "";
        this.contextUrl_ = "";
        this.playbackId_ = gva.f84678b;
        this.suppressions_ = AbstractC0269h.emptyProtobufList();
        this.prevTracks_ = AbstractC0269h.emptyProtobufList();
        this.nextTracks_ = AbstractC0269h.emptyProtobufList();
        this.sessionId_ = "";
        this.signals_ = AbstractC0269h.emptyProtobufList();
        this.sessionCommandId_ = "";
    }

    /* JADX INFO: renamed from: Z */
    public static EsContextPlayerState$ContextPlayerState m17700Z(byte[] bArr) {
        return (EsContextPlayerState$ContextPlayerState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m17702A() {
        return this.isSystemInitiated_;
    }

    /* JADX INFO: renamed from: B */
    public final int m17703B() {
        return this.nextTracks_.size();
    }

    /* JADX INFO: renamed from: C */
    public final ae50 m17704C() {
        return this.nextTracks_;
    }

    /* JADX INFO: renamed from: D */
    public final EsContextPlayerOptions$ContextPlayerOptions m17705D() {
        EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions = this.options_;
        return esContextPlayerOptions$ContextPlayerOptions == null ? EsContextPlayerOptions$ContextPlayerOptions.m17690o() : esContextPlayerOptions$ContextPlayerOptions;
    }

    /* JADX INFO: renamed from: E */
    public final Map m17706E() {
        return Collections.unmodifiableMap(this.pageMetadata_);
    }

    /* JADX INFO: renamed from: F */
    public final EsPlayOrigin$PlayOrigin m17707F() {
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = this.playOrigin_;
        return esPlayOrigin$PlayOrigin == null ? EsPlayOrigin$PlayOrigin.m17814w() : esPlayOrigin$PlayOrigin;
    }

    /* JADX INFO: renamed from: G */
    public final gva m17708G() {
        return this.playbackId_;
    }

    /* JADX INFO: renamed from: H */
    public final EsContextPlayerState$PlaybackQuality m17709H() {
        EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality = this.playbackQuality_;
        return esContextPlayerState$PlaybackQuality == null ? EsContextPlayerState$PlaybackQuality.m17740p() : esContextPlayerState$PlaybackQuality;
    }

    /* JADX INFO: renamed from: I */
    public final EsOptional$OptionalDouble m17710I() {
        EsOptional$OptionalDouble esOptional$OptionalDouble = this.playbackSpeed_;
        return esOptional$OptionalDouble == null ? EsOptional$OptionalDouble.m17773o() : esOptional$OptionalDouble;
    }

    /* JADX INFO: renamed from: J */
    public final EsOptional$OptionalInt64 m17711J() {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.positionAsOfTimestamp_;
        return esOptional$OptionalInt64 == null ? EsOptional$OptionalInt64.m17776o() : esOptional$OptionalInt64;
    }

    /* JADX INFO: renamed from: K */
    public final int m17712K() {
        return this.prevTracks_.size();
    }

    /* JADX INFO: renamed from: L */
    public final ae50 m17713L() {
        return this.prevTracks_;
    }

    /* JADX INFO: renamed from: M */
    public final long m17714M() {
        return this.queueRevision_;
    }

    /* JADX INFO: renamed from: N */
    public final EsRestrictions$Restrictions m17715N() {
        EsRestrictions$Restrictions esRestrictions$Restrictions = this.restrictions_;
        return esRestrictions$Restrictions == null ? EsRestrictions$Restrictions.m17898Z() : esRestrictions$Restrictions;
    }

    /* JADX INFO: renamed from: O */
    public final String m17716O() {
        return this.sessionCommandId_;
    }

    /* JADX INFO: renamed from: P */
    public final EsSleepTimer$SleepTimer m17717P() {
        EsSleepTimer$SleepTimer esSleepTimer$SleepTimer = this.sleepTimer_;
        return esSleepTimer$SleepTimer == null ? EsSleepTimer$SleepTimer.m18012o() : esSleepTimer$SleepTimer;
    }

    /* JADX INFO: renamed from: Q */
    public final int m17718Q() {
        return this.suppressions_.size();
    }

    /* JADX INFO: renamed from: R */
    public final ae50 m17719R() {
        return this.suppressions_;
    }

    /* JADX INFO: renamed from: S */
    public final EsProvidedTrack$ProvidedTrack m17720S() {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = this.track_;
        return esProvidedTrack$ProvidedTrack == null ? EsProvidedTrack$ProvidedTrack.m17848r() : esProvidedTrack$ProvidedTrack;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m17721T() {
        return (this.bitField0_ & 2048) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m17722U() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m17723V() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m17724W() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m17725X() {
        return (this.bitField0_ & 4096) != 0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m17726Y() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001f\u0000\u0001\u0001\u001f\u001f\u0002\u0004\u0000\u0001\u0003\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\b\n\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fဉ\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011ဉ\b\u0012ဉ\t\u0013Ț\u0014\u001b\u0015\u001b\u00162\u00172\u0018Ȉ\u0019\u0003\u001a\f\u001bȚ\u001cȈ\u001dဌ\n\u001eဉ\u000b\u001fဉ\f", new Object[]{"bitField0_", "timestamp_", "contextUri_", "contextUrl_", "contextRestrictions_", "playOrigin_", "index_", "track_", "playbackId_", "playbackQuality_", "playbackSpeed_", "positionAsOfTimestamp_", "duration_", "isPlaying_", "isPaused_", "isBuffering_", "isSystemInitiated_", "options_", "restrictions_", "suppressions_", "prevTracks_", EsProvidedTrack$ProvidedTrack.class, "nextTracks_", EsProvidedTrack$ProvidedTrack.class, "contextMetadata_", rjw.f199913a, "pageMetadata_", tjw.f221023a, "sessionId_", "queueRevision_", "audioStream_", "signals_", "sessionCommandId_", "format_", "adBreakContext_", "sleepTimer_"});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerState$ContextPlayerState();
        }
        if (iOrdinal == 4) {
            return new qjw(1);
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
        synchronized (EsContextPlayerState$ContextPlayerState.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final int getSignalsCount() {
        return this.signals_.size();
    }

    public final List getSignalsList() {
        return this.signals_;
    }

    public final long getTimestamp() {
        return this.timestamp_;
    }

    public final boolean hasDuration() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasFormat() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean hasIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EsAdBreakContext$AdBreakContext m17727o() {
        EsAdBreakContext$AdBreakContext esAdBreakContext$AdBreakContext = this.adBreakContext_;
        return esAdBreakContext$AdBreakContext == null ? EsAdBreakContext$AdBreakContext.m17656o() : esAdBreakContext$AdBreakContext;
    }

    /* JADX INFO: renamed from: p */
    public final nnw m17728p() {
        nnw nnwVar;
        int i = this.audioStream_;
        if (i != 0) {
            nnwVar = i != 1 ? null : nnw.ALARM;
        } else {
            nnwVar = nnw.DEFAULT;
        }
        return nnwVar == null ? nnw.UNRECOGNIZED : nnwVar;
    }

    /* JADX INFO: renamed from: q */
    public final Map m17729q() {
        return Collections.unmodifiableMap(this.contextMetadata_);
    }

    /* JADX INFO: renamed from: r */
    public final EsRestrictions$Restrictions m17730r() {
        EsRestrictions$Restrictions esRestrictions$Restrictions = this.contextRestrictions_;
        return esRestrictions$Restrictions == null ? EsRestrictions$Restrictions.m17898Z() : esRestrictions$Restrictions;
    }

    /* JADX INFO: renamed from: s */
    public final String m17731s() {
        return this.contextUri_;
    }

    /* JADX INFO: renamed from: t */
    public final String m17732t() {
        return this.contextUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final EsOptional$OptionalInt64 m17733u() {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.duration_;
        return esOptional$OptionalInt64 == null ? EsOptional$OptionalInt64.m17776o() : esOptional$OptionalInt64;
    }

    /* JADX INFO: renamed from: v */
    public final sjw m17734v() {
        sjw sjwVar;
        int i = this.format_;
        if (i == 0) {
            sjwVar = sjw.UNKNOWN;
        } else if (i != 1) {
            sjwVar = i != 2 ? null : sjw.PARROT;
        } else {
            sjwVar = sjw.DEFAULT;
        }
        return sjwVar == null ? sjw.UNRECOGNIZED : sjwVar;
    }

    /* JADX INFO: renamed from: w */
    public final EsContextPlayerState$ContextIndex m17735w() {
        EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex = this.index_;
        return esContextPlayerState$ContextIndex == null ? EsContextPlayerState$ContextIndex.m17697o() : esContextPlayerState$ContextIndex;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m17736x() {
        return this.isBuffering_;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m17737y() {
        return this.isPaused_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m17738z() {
        return this.isPlaying_;
    }
}
