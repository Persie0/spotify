package com.spotify.p010ad.detection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vl0;
import p204p.yl0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDetectionOuterClass$MapTimestampRequest extends AbstractC0269h implements sre0 {
    public static final int CREATOR_TIMESTAMP_TYPE_FIELD_NUMBER = 4;
    private static final AdDetectionOuterClass$MapTimestampRequest DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int USER_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private int creatorTimestampType_;
    private String episodeUri_ = "";
    private String playbackId_ = "";
    private int userTimestampMs_;

    static {
        AdDetectionOuterClass$MapTimestampRequest adDetectionOuterClass$MapTimestampRequest = new AdDetectionOuterClass$MapTimestampRequest();
        DEFAULT_INSTANCE = adDetectionOuterClass$MapTimestampRequest;
        AbstractC0269h.registerDefaultInstance(AdDetectionOuterClass$MapTimestampRequest.class, adDetectionOuterClass$MapTimestampRequest);
    }

    private AdDetectionOuterClass$MapTimestampRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2284n(AdDetectionOuterClass$MapTimestampRequest adDetectionOuterClass$MapTimestampRequest, vl0 vl0Var) {
        adDetectionOuterClass$MapTimestampRequest.getClass();
        adDetectionOuterClass$MapTimestampRequest.creatorTimestampType_ = vl0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m2285o(AdDetectionOuterClass$MapTimestampRequest adDetectionOuterClass$MapTimestampRequest, String str) {
        adDetectionOuterClass$MapTimestampRequest.getClass();
        str.getClass();
        adDetectionOuterClass$MapTimestampRequest.episodeUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2286p(AdDetectionOuterClass$MapTimestampRequest adDetectionOuterClass$MapTimestampRequest, int i) {
        adDetectionOuterClass$MapTimestampRequest.userTimestampMs_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static yl0 m2287q() {
        return (yl0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\f", new Object[]{"episodeUri_", "userTimestampMs_", "playbackId_", "creatorTimestampType_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$MapTimestampRequest();
        }
        if (iOrdinal == 4) {
            return new yl0(DEFAULT_INSTANCE);
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
        synchronized (AdDetectionOuterClass$MapTimestampRequest.class) {
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
