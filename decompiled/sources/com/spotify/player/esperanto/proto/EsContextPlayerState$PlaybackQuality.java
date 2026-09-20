package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qjw;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ujw;
import p204p.vjw;
import p204p.wjw;
import p204p.xjw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsContextPlayerState$PlaybackQuality extends AbstractC0269h implements sre0 {
    public static final int BITRATE_LEVEL_FIELD_NUMBER = 1;
    private static final EsContextPlayerState$PlaybackQuality DEFAULT_INSTANCE;
    public static final int FILE_ORIGIN_FIELD_NUMBER = 7;
    public static final int HARDWARE_SAMPLE_RATE_HZ_FIELD_NUMBER = 9;
    public static final int HIFI_STATUS_FIELD_NUMBER = 5;
    public static final int HIGHEST_AVAILABLE_QUALITY_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYING_SAMPLE_RATE_HZ_FIELD_NUMBER = 8;
    public static final int RESTRICTION_REASON_FIELD_NUMBER = 10;
    public static final int STRATEGY_FIELD_NUMBER = 2;
    public static final int TARGET_BITRATE_AVAILABLE_FIELD_NUMBER = 4;
    public static final int TARGET_BITRATE_LEVEL_FIELD_NUMBER = 3;
    private int bitrateLevel_;
    private int fileOrigin_;
    private int hardwareSampleRateHz_;
    private int hifiStatus_;
    private int highestAvailableQuality_;
    private int playingSampleRateHz_;
    private int restrictionReason_;
    private int strategy_;
    private boolean targetBitrateAvailable_;
    private int targetBitrateLevel_;

    static {
        EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality = new EsContextPlayerState$PlaybackQuality();
        DEFAULT_INSTANCE = esContextPlayerState$PlaybackQuality;
        AbstractC0269h.registerDefaultInstance(EsContextPlayerState$PlaybackQuality.class, esContextPlayerState$PlaybackQuality);
    }

    private EsContextPlayerState$PlaybackQuality() {
    }

    /* JADX INFO: renamed from: p */
    public static EsContextPlayerState$PlaybackQuality m17740p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004\u0007\u0005\f\u0006\f\u0007\f\b\u0004\t\u0004\n\f", new Object[]{"bitrateLevel_", "strategy_", "targetBitrateLevel_", "targetBitrateAvailable_", "hifiStatus_", "highestAvailableQuality_", "fileOrigin_", "playingSampleRateHz_", "hardwareSampleRateHz_", "restrictionReason_"});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerState$PlaybackQuality();
        }
        if (iOrdinal == 4) {
            return new qjw(2);
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
        synchronized (EsContextPlayerState$PlaybackQuality.class) {
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

    /* JADX INFO: renamed from: o */
    public final ujw m17741o() {
        ujw ujwVarM83295a = ujw.m83295a(this.bitrateLevel_);
        return ujwVarM83295a == null ? ujw.UNRECOGNIZED : ujwVarM83295a;
    }

    /* JADX INFO: renamed from: q */
    public final wjw m17742q() {
        wjw wjwVar;
        int i = this.fileOrigin_;
        if (i == 0) {
            wjwVar = wjw.UNKNOWN_FILE_ORIGIN;
        } else if (i == 1) {
            wjwVar = wjw.INTERNAL;
        } else if (i == 2) {
            wjwVar = wjw.EXTERNAL;
        } else if (i != 3) {
            wjwVar = i != 4 ? null : wjw.GENERATED;
        } else {
            wjwVar = wjw.LOCAL;
        }
        return wjwVar == null ? wjw.UNRECOGNIZED : wjwVar;
    }

    /* JADX INFO: renamed from: r */
    public final xjw m17743r() {
        xjw xjwVar;
        int i = this.hifiStatus_;
        if (i == 0) {
            xjwVar = xjw.NONE;
        } else if (i != 1) {
            xjwVar = i != 2 ? null : xjw.ON;
        } else {
            xjwVar = xjw.OFF;
        }
        return xjwVar == null ? xjw.UNRECOGNIZED : xjwVar;
    }

    /* JADX INFO: renamed from: s */
    public final ujw m17744s() {
        ujw ujwVarM83295a = ujw.m83295a(this.highestAvailableQuality_);
        return ujwVarM83295a == null ? ujw.UNRECOGNIZED : ujwVarM83295a;
    }

    /* JADX INFO: renamed from: t */
    public final vjw m17745t() {
        vjw vjwVar;
        int i = this.strategy_;
        if (i == 0) {
            vjwVar = vjw.UNKNOWN_STRATEGY;
        } else if (i == 1) {
            vjwVar = vjw.BEST_MATCHING;
        } else if (i == 2) {
            vjwVar = vjw.BACKEND_ADVISED;
        } else if (i == 3) {
            vjwVar = vjw.OFFLINED_FILE;
        } else if (i != 4) {
            vjwVar = i != 5 ? null : vjw.LOCAL_FILE;
        } else {
            vjwVar = vjw.CACHED_FILE;
        }
        return vjwVar == null ? vjw.UNRECOGNIZED : vjwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m17746u() {
        return this.targetBitrateAvailable_;
    }

    /* JADX INFO: renamed from: v */
    public final ujw m17747v() {
        ujw ujwVarM83295a = ujw.m83295a(this.targetBitrateLevel_);
        return ujwVarM83295a == null ? ujw.UNRECOGNIZED : ujwVarM83295a;
    }
}
