package com.spotify.musicvideos.musicvideowidget.proto.p114v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cn81;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class TrackRequest extends AbstractC0269h implements sre0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    private static final TrackRequest DEFAULT_INSTANCE;
    public static final int IS_EXPLICIT_ENABLED_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    public static final int VIDEO_URI_FIELD_NUMBER = 3;
    private boolean isExplicitEnabled_;
    private String trackUri_ = "";
    private String artistUri_ = "";
    private String videoUri_ = "";

    static {
        TrackRequest trackRequest = new TrackRequest();
        DEFAULT_INSTANCE = trackRequest;
        AbstractC0269h.registerDefaultInstance(TrackRequest.class, trackRequest);
    }

    private TrackRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15957n(TrackRequest trackRequest, String str) {
        trackRequest.getClass();
        trackRequest.artistUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15958o(TrackRequest trackRequest, boolean z) {
        trackRequest.isExplicitEnabled_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m15959p(TrackRequest trackRequest, String str) {
        trackRequest.getClass();
        trackRequest.trackUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15960q(TrackRequest trackRequest, String str) {
        trackRequest.getClass();
        trackRequest.videoUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static cn81 m15961r() {
        return (cn81) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"trackUri_", "artistUri_", "videoUri_", "isExplicitEnabled_"});
        }
        if (iOrdinal == 3) {
            return new TrackRequest();
        }
        if (iOrdinal == 4) {
            return new cn81(DEFAULT_INSTANCE);
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
        synchronized (TrackRequest.class) {
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
