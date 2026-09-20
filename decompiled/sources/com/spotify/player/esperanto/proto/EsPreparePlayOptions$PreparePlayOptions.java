package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.player.model.Suppressions;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.cva;
import p204p.gva;
import p204p.ihc0;
import p204p.nnw;
import p204p.onw;
import p204p.ore0;
import p204p.pnw;
import p204p.pre0;
import p204p.qnw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsPreparePlayOptions$PreparePlayOptions extends AbstractC0269h implements sre0 {
    public static final int ALWAYS_PLAY_SOMETHING_FIELD_NUMBER = 2;
    public static final int AUDIO_STREAM_FIELD_NUMBER = 10;
    public static final int CONFIGURATION_OVERRIDE_FIELD_NUMBER = 13;
    private static final EsPreparePlayOptions$PreparePlayOptions DEFAULT_INSTANCE;
    public static final int INITIALLY_PAUSED_FIELD_NUMBER = 5;
    public static final int LICENSE_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 1;
    public static final int PLAYER_OPTIONS_OVERRIDE_FIELD_NUMBER = 7;
    public static final int PREFETCH_LEVEL_FIELD_NUMBER = 9;
    public static final int SEEK_TO_CREATOR_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int SEEK_TO_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 11;
    public static final int SKIP_TO_FIELD_NUMBER = 3;
    public static final int SUPPRESSIONS_FIELD_NUMBER = 8;
    public static final int SYSTEM_INITIATED_FIELD_NUMBER = 6;
    private boolean alwaysPlaySomething_;
    private int audioStream_;
    private int bitField0_;
    private boolean initiallyPaused_;
    private EsContextPlayerOptions$ContextPlayerOptionOverrides playerOptionsOverride_;
    private int prefetchLevel_;
    private EsOptional$OptionalInt64 seekTo_;
    private EsSkipToTrack$SkipToTrack skipTo_;
    private boolean systemInitiated_;
    private ihc0 configurationOverride_ = ihc0.f102235b;
    private gva playbackId_ = gva.f84678b;
    private ae50 suppressions_ = AbstractC0269h.emptyProtobufList();
    private String sessionId_ = "";
    private String license_ = "";
    private String seekToCreatorTimestamp_ = "";

    static {
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = new EsPreparePlayOptions$PreparePlayOptions();
        DEFAULT_INSTANCE = esPreparePlayOptions$PreparePlayOptions;
        AbstractC0269h.registerDefaultInstance(EsPreparePlayOptions$PreparePlayOptions.class, esPreparePlayOptions$PreparePlayOptions);
    }

    private EsPreparePlayOptions$PreparePlayOptions() {
    }

    /* JADX INFO: renamed from: A */
    public static void m17827A(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esSkipToTrack$SkipToTrack.getClass();
        esPreparePlayOptions$PreparePlayOptions.skipTo_ = esSkipToTrack$SkipToTrack;
        esPreparePlayOptions$PreparePlayOptions.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public static void m17828B(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, boolean z) {
        esPreparePlayOptions$PreparePlayOptions.systemInitiated_ = z;
    }

    /* JADX INFO: renamed from: C */
    public static EsPreparePlayOptions$PreparePlayOptions m17829C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static onw m17830E() {
        return (onw) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m17831n(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, Iterable iterable) {
        ae50 ae50Var = esPreparePlayOptions$PreparePlayOptions.suppressions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esPreparePlayOptions$PreparePlayOptions.suppressions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esPreparePlayOptions$PreparePlayOptions.suppressions_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17832o(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        ae50 ae50Var = esPreparePlayOptions$PreparePlayOptions.suppressions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esPreparePlayOptions$PreparePlayOptions.suppressions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        esPreparePlayOptions$PreparePlayOptions.suppressions_.add(Suppressions.Providers.MFT);
    }

    /* JADX INFO: renamed from: p */
    public static ihc0 m17833p(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions) {
        ihc0 ihc0Var = esPreparePlayOptions$PreparePlayOptions.configurationOverride_;
        if (!ihc0Var.f102236a) {
            esPreparePlayOptions$PreparePlayOptions.configurationOverride_ = ihc0Var.m50613h();
        }
        return esPreparePlayOptions$PreparePlayOptions.configurationOverride_;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17834q(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, boolean z) {
        esPreparePlayOptions$PreparePlayOptions.alwaysPlaySomething_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m17835r(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, nnw nnwVar) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esPreparePlayOptions$PreparePlayOptions.audioStream_ = nnwVar.getNumber();
    }

    /* JADX INFO: renamed from: s */
    public static void m17836s(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, boolean z) {
        esPreparePlayOptions$PreparePlayOptions.initiallyPaused_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m17837t(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, String str) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        str.getClass();
        esPreparePlayOptions$PreparePlayOptions.license_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m17838u(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, cva cvaVar) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esPreparePlayOptions$PreparePlayOptions.playbackId_ = cvaVar;
    }

    /* JADX INFO: renamed from: v */
    public static void m17839v(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        esPreparePlayOptions$PreparePlayOptions.playerOptionsOverride_ = esContextPlayerOptions$ContextPlayerOptionOverrides;
        esPreparePlayOptions$PreparePlayOptions.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: w */
    public static void m17840w(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, qnw qnwVar) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esPreparePlayOptions$PreparePlayOptions.prefetchLevel_ = qnwVar.getNumber();
    }

    /* JADX INFO: renamed from: x */
    public static void m17841x(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esOptional$OptionalInt64.getClass();
        esPreparePlayOptions$PreparePlayOptions.seekTo_ = esOptional$OptionalInt64;
        esPreparePlayOptions$PreparePlayOptions.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: y */
    public static void m17842y(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, String str) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        str.getClass();
        esPreparePlayOptions$PreparePlayOptions.bitField0_ |= 8;
        esPreparePlayOptions$PreparePlayOptions.seekToCreatorTimestamp_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m17843z(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, String str) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        str.getClass();
        esPreparePlayOptions$PreparePlayOptions.sessionId_ = str;
    }

    /* JADX INFO: renamed from: D */
    public final EsSkipToTrack$SkipToTrack m17844D() {
        EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = this.skipTo_;
        return esSkipToTrack$SkipToTrack == null ? EsSkipToTrack$SkipToTrack.m18008s() : esSkipToTrack$SkipToTrack;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0001\u0001\u0000\u0001\n\u0002\u0007\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0007\u0006\u0007\u0007ဉ\u0002\bȚ\t\f\n\f\u000bȈ\fȈ\r2\u000eለ\u0003", new Object[]{"bitField0_", "playbackId_", "alwaysPlaySomething_", "skipTo_", "seekTo_", "initiallyPaused_", "systemInitiated_", "playerOptionsOverride_", "suppressions_", "prefetchLevel_", "audioStream_", "sessionId_", "license_", "configurationOverride_", pnw.f179537a, "seekToCreatorTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new EsPreparePlayOptions$PreparePlayOptions();
        }
        if (iOrdinal == 4) {
            return new onw(DEFAULT_INSTANCE);
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
        synchronized (EsPreparePlayOptions$PreparePlayOptions.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
