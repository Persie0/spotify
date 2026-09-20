package com.spotify.listuxplatformconsumers.likedsongs.sections.likedsongsfilterchips.logging.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wh80;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class LikedSongsPageLoadResult extends AbstractC0269h implements sre0 {
    public static final int ACTIVE_FILTER_CHIP_FIELD_NUMBER = 3;
    private static final LikedSongsPageLoadResult DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int TRACK_COUNT_FIELD_NUMBER = 2;
    private String activeFilterChip_ = "";
    private int bitField0_;
    private boolean success_;
    private int trackCount_;

    static {
        LikedSongsPageLoadResult likedSongsPageLoadResult = new LikedSongsPageLoadResult();
        DEFAULT_INSTANCE = likedSongsPageLoadResult;
        AbstractC0269h.registerDefaultInstance(LikedSongsPageLoadResult.class, likedSongsPageLoadResult);
    }

    private LikedSongsPageLoadResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13027n(LikedSongsPageLoadResult likedSongsPageLoadResult, String str) {
        likedSongsPageLoadResult.getClass();
        likedSongsPageLoadResult.bitField0_ |= 4;
        likedSongsPageLoadResult.activeFilterChip_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13028o(LikedSongsPageLoadResult likedSongsPageLoadResult) {
        likedSongsPageLoadResult.bitField0_ |= 1;
        likedSongsPageLoadResult.success_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m13029p(LikedSongsPageLoadResult likedSongsPageLoadResult, int i) {
        likedSongsPageLoadResult.bitField0_ |= 2;
        likedSongsPageLoadResult.trackCount_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static wh80 m13030q() {
        return (wh80) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "success_", "trackCount_", "activeFilterChip_"});
        }
        if (iOrdinal == 3) {
            return new LikedSongsPageLoadResult();
        }
        if (iOrdinal == 4) {
            return new wh80(DEFAULT_INSTANCE);
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
        synchronized (LikedSongsPageLoadResult.class) {
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
